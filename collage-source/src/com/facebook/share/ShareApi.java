// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.CollectionMapper;
import com.facebook.internal.Mutable;
import com.facebook.internal.Utility;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.VideoUploader;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareApi
{

    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String DEFAULT_GRAPH_NODE = "me";
    private static final String GRAPH_PATH_FORMAT = "%s/%s";
    private static final String PHOTOS_EDGE = "photos";
    private static final String TAG = "ShareApi";
    private String graphNode;
    private String message;
    private final ShareContent shareContent;

    public ShareApi(ShareContent sharecontent)
    {
        shareContent = sharecontent;
        graphNode = "me";
    }

    private void addCommonParameters(Bundle bundle, ShareContent sharecontent)
    {
        List list = sharecontent.getPeopleIds();
        if (!Utility.isNullOrEmpty(list))
        {
            bundle.putString("tags", TextUtils.join(", ", list));
        }
        if (!Utility.isNullOrEmpty(sharecontent.getPlaceId()))
        {
            bundle.putString("place", sharecontent.getPlaceId());
        }
        if (!Utility.isNullOrEmpty(sharecontent.getRef()))
        {
            bundle.putString("ref", sharecontent.getRef());
        }
    }

    private String getGraphPath(String s)
    {
        try
        {
            s = String.format(Locale.ROOT, "%s/%s", new Object[] {
                URLEncoder.encode(getGraphNode(), "UTF-8"), s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static void handleImagesOnAction(Bundle bundle)
    {
        String s;
        int i;
        i = 0;
        s = bundle.getString("image");
        if (s == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray(s);
_L7:
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = jsonarray.optJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        putImageInBundleWithArrayFormat(bundle, i, jsonobject);
        break MISSING_BLOCK_LABEL_118;
        JSONException jsonexception;
        String s1 = jsonarray.getString(i);
        bundle.putString(String.format(Locale.ROOT, "image[%d][url]", new Object[] {
            Integer.valueOf(i)
        }), s1);
        break MISSING_BLOCK_LABEL_118;
_L6:
        putImageInBundleWithArrayFormat(bundle, 0, new JSONObject(s));
        bundle.remove("image");
_L2:
        return;
_L4:
        try
        {
            bundle.remove("image");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        if (true) goto _L6; else goto _L5
_L5:
        bundle;
        return;
        i++;
          goto _L7
    }

    private static void putImageInBundleWithArrayFormat(Bundle bundle, int i, JSONObject jsonobject)
        throws JSONException
    {
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); bundle.putString(String.format(Locale.ROOT, "image[%d][%s]", new Object[] {
    Integer.valueOf(i), s
}), jsonobject.get(s).toString()))
        {
            s = (String)iterator.next();
        }

    }

    public static void share(ShareContent sharecontent, FacebookCallback facebookcallback)
    {
        (new ShareApi(sharecontent)).share(facebookcallback);
    }

    private void shareLinkContent(ShareLinkContent sharelinkcontent, final FacebookCallback callback)
    {
        callback = new com.facebook.GraphRequest.Callback() {

            final ShareApi this$0;
            final FacebookCallback val$callback;

            public void onCompleted(GraphResponse graphresponse)
            {
                Object obj = graphresponse.getJSONObject();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((JSONObject) (obj)).optString("id");
                }
                ShareInternalUtility.invokeCallbackWithResults(callback, ((String) (obj)), graphresponse);
            }

            
            {
                this$0 = ShareApi.this;
                callback = facebookcallback;
                super();
            }
        };
        Bundle bundle = new Bundle();
        addCommonParameters(bundle, sharelinkcontent);
        bundle.putString("message", getMessage());
        bundle.putString("link", Utility.getUriString(sharelinkcontent.getContentUrl()));
        bundle.putString("picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
        bundle.putString("name", sharelinkcontent.getContentTitle());
        bundle.putString("description", sharelinkcontent.getContentDescription());
        bundle.putString("ref", sharelinkcontent.getRef());
        (new GraphRequest(AccessToken.getCurrentAccessToken(), getGraphPath("feed"), bundle, HttpMethod.POST, callback)).executeAsync();
    }

    private void shareOpenGraphContent(ShareOpenGraphContent shareopengraphcontent, final FacebookCallback callback)
    {
        final com.facebook.GraphRequest.Callback requestCallback = new com.facebook.GraphRequest.Callback() {

            final ShareApi this$0;
            final FacebookCallback val$callback;

            public void onCompleted(GraphResponse graphresponse)
            {
                Object obj = graphresponse.getJSONObject();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((JSONObject) (obj)).optString("id");
                }
                ShareInternalUtility.invokeCallbackWithResults(callback, ((String) (obj)), graphresponse);
            }

            
            {
                this$0 = ShareApi.this;
                callback = facebookcallback;
                super();
            }
        };
        final ShareOpenGraphAction action = shareopengraphcontent.getAction();
        final Bundle parameters = action.getBundle();
        addCommonParameters(parameters, shareopengraphcontent);
        if (!Utility.isNullOrEmpty(getMessage()))
        {
            parameters.putString("message", getMessage());
        }
        stageOpenGraphAction(parameters, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

            final ShareApi this$0;
            final ShareOpenGraphAction val$action;
            final FacebookCallback val$callback;
            final Bundle val$parameters;
            final com.facebook.GraphRequest.Callback val$requestCallback;

            public void onComplete()
            {
                try
                {
                    ShareApi.handleImagesOnAction(parameters);
                    (new GraphRequest(AccessToken.getCurrentAccessToken(), getGraphPath(URLEncoder.encode(action.getActionType(), "UTF-8")), parameters, HttpMethod.POST, requestCallback)).executeAsync();
                    return;
                }
                catch (UnsupportedEncodingException unsupportedencodingexception)
                {
                    ShareInternalUtility.invokeCallbackWithException(callback, unsupportedencodingexception);
                }
            }

            public void onError(FacebookException facebookexception)
            {
                ShareInternalUtility.invokeCallbackWithException(callback, facebookexception);
            }

            
            {
                this$0 = ShareApi.this;
                parameters = bundle;
                action = shareopengraphaction;
                requestCallback = callback1;
                callback = facebookcallback;
                super();
            }
        });
    }

    private void sharePhotoContent(SharePhotoContent sharephotocontent, FacebookCallback facebookcallback)
    {
        Mutable mutable;
        AccessToken accesstoken;
        ArrayList arraylist;
        com.facebook.GraphRequest.Callback callback;
        mutable = new Mutable(Integer.valueOf(0));
        accesstoken = AccessToken.getCurrentAccessToken();
        arraylist = new ArrayList();
        callback = new com.facebook.GraphRequest.Callback() {

            final ShareApi this$0;
            final FacebookCallback val$callback;
            final ArrayList val$errorResponses;
            final Mutable val$requestCount;
            final ArrayList val$results;

            public void onCompleted(GraphResponse graphresponse)
            {
                JSONObject jsonobject = graphresponse.getJSONObject();
                if (jsonobject != null)
                {
                    results.add(jsonobject);
                }
                if (graphresponse.getError() != null)
                {
                    errorResponses.add(graphresponse);
                }
                requestCount.value = Integer.valueOf(((Integer)requestCount.value).intValue() - 1);
                if (((Integer)requestCount.value).intValue() == 0)
                {
                    if (!errorResponses.isEmpty())
                    {
                        ShareInternalUtility.invokeCallbackWithResults(callback, null, (GraphResponse)errorResponses.get(0));
                    } else
                    if (!results.isEmpty())
                    {
                        String s1 = ((JSONObject)results.get(0)).optString("id");
                        ShareInternalUtility.invokeCallbackWithResults(callback, s1, graphresponse);
                        return;
                    }
                }
            }

            
            {
                this$0 = ShareApi.this;
                results = arraylist;
                errorResponses = arraylist1;
                requestCount = mutable;
                callback = facebookcallback;
                super();
            }
        };
        Iterator iterator = sharephotocontent.getPhotos().iterator();
_L3:
        String s;
        SharePhoto sharephoto;
        android.graphics.Bitmap bitmap;
        android.net.Uri uri;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        sharephoto = (SharePhoto)iterator.next();
        bitmap = sharephoto.getBitmap();
        uri = sharephoto.getImageUrl();
        s = sharephoto.getCaption();
        sharephotocontent = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        sharephotocontent = getMessage();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        arraylist.add(GraphRequest.newUploadPhotoRequest(accesstoken, getGraphPath("photos"), bitmap, sharephotocontent, sharephoto.getParameters(), callback));
          goto _L3
        try
        {
            mutable.value = Integer.valueOf(((Integer)mutable.value).intValue() + arraylist.size());
            sharephotocontent = arraylist.iterator();
            while (sharephotocontent.hasNext()) 
            {
                ((GraphRequest)sharephotocontent.next()).executeAsync();
            }
        }
        // Misplaced declaration of an exception variable
        catch (SharePhotoContent sharephotocontent)
        {
            ShareInternalUtility.invokeCallbackWithException(facebookcallback, sharephotocontent);
        }
        return;
_L2:
        if (uri == null) goto _L3; else goto _L4
_L4:
        arraylist.add(GraphRequest.newUploadPhotoRequest(accesstoken, getGraphPath("photos"), uri, sharephotocontent, sharephoto.getParameters(), callback));
          goto _L3
    }

    private void shareVideoContent(ShareVideoContent sharevideocontent, FacebookCallback facebookcallback)
    {
        try
        {
            VideoUploader.uploadAsync(sharevideocontent, getGraphNode(), facebookcallback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ShareVideoContent sharevideocontent)
        {
            ShareInternalUtility.invokeCallbackWithException(facebookcallback, sharevideocontent);
        }
    }

    private void stageArrayList(final ArrayList arrayList, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onArrayListStagedListener)
    {
        final JSONArray stagedObject = new JSONArray();
        stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

            final ShareApi this$0;
            final ArrayList val$arrayList;
            final JSONArray val$stagedObject;

            public Object get(Integer integer)
            {
                return arrayList.get(integer.intValue());
            }

            public volatile Object get(Object obj)
            {
                return get((Integer)obj);
            }

            public Iterator keyIterator()
            {
                int i = arrayList.size();
                return i. new Iterator() {

                    final _cls5 this$1;
                    final Mutable val$current;
                    final int val$size;

                    public boolean hasNext()
                    {
                        return ((Integer)current.value).intValue() < size;
                    }

                    public Integer next()
                    {
                        Integer integer = (Integer)current.value;
                        Mutable mutable = current;
                        mutable.value = Integer.valueOf(((Integer)mutable.value).intValue() + 1);
                        return integer;
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public void remove()
                    {
                    }

            
            {
                this$1 = final__pcls5;
                current = mutable;
                size = I.this;
                super();
            }
                };
            }

            public void set(Integer integer, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
            {
                try
                {
                    stagedObject.put(integer.intValue(), obj);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Integer integer)
                {
                    obj = integer.getLocalizedMessage();
                }
                integer = ((Integer) (obj));
                if (obj == null)
                {
                    integer = "Error staging object.";
                }
                onerrorlistener.onError(new FacebookException(integer));
            }

            public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
            {
                set((Integer)obj, obj1, onerrorlistener);
            }

            
            {
                this$0 = ShareApi.this;
                arrayList = arraylist;
                stagedObject = jsonarray;
                super();
            }
        }, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

            final ShareApi this$0;
            final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onArrayListStagedListener;
            final JSONArray val$stagedObject;

            public void onComplete()
            {
                onArrayListStagedListener.onComplete(stagedObject);
            }

            public void onError(FacebookException facebookexception)
            {
                onArrayListStagedListener.onError(facebookexception);
            }

            
            {
                this$0 = ShareApi.this;
                onArrayListStagedListener = onmapvaluecompletelistener;
                stagedObject = jsonarray;
                super();
            }
        });
    }

    private void stageCollectionValues(com.facebook.internal.CollectionMapper.Collection collection, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
    {
        CollectionMapper.iterate(collection, new com.facebook.internal.CollectionMapper.ValueMapper() {

            final ShareApi this$0;

            public void mapValue(Object obj, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
            {
                if (obj instanceof ArrayList)
                {
                    stageArrayList((ArrayList)obj, onmapvaluecompletelistener);
                    return;
                }
                if (obj instanceof ShareOpenGraphObject)
                {
                    stageOpenGraphObject((ShareOpenGraphObject)obj, onmapvaluecompletelistener);
                    return;
                }
                if (obj instanceof SharePhoto)
                {
                    stagePhoto((SharePhoto)obj, onmapvaluecompletelistener);
                    return;
                } else
                {
                    onmapvaluecompletelistener.onComplete(obj);
                    return;
                }
            }

            
            {
                this$0 = ShareApi.this;
                super();
            }
        }, onmappercompletelistener);
    }

    private void stageOpenGraphAction(final Bundle parameters, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
    {
        stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

            final ShareApi this$0;
            final Bundle val$parameters;

            public volatile Object get(Object obj)
            {
                return get((String)obj);
            }

            public Object get(String s)
            {
                return parameters.get(s);
            }

            public Iterator keyIterator()
            {
                return parameters.keySet().iterator();
            }

            public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
            {
                set((String)obj, obj1, onerrorlistener);
            }

            public void set(String s, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
            {
                if (!Utility.putJSONValueInBundle(parameters, s, obj))
                {
                    onerrorlistener.onError(new FacebookException((new StringBuilder()).append("Unexpected value: ").append(obj.toString()).toString()));
                }
            }

            
            {
                this$0 = ShareApi.this;
                parameters = bundle;
                super();
            }
        }, onmappercompletelistener);
    }

    private void stageOpenGraphObject(final ShareOpenGraphObject object, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onOpenGraphObjectStagedListener)
    {
        String s = object.getString("type");
        final String ogType = s;
        if (s == null)
        {
            ogType = object.getString("og:type");
        }
        if (ogType == null)
        {
            onOpenGraphObjectStagedListener.onError(new FacebookException("Open Graph objects must contain a type value."));
            return;
        } else
        {
            final JSONObject stagedObject = new JSONObject();
            stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

                final ShareApi this$0;
                final ShareOpenGraphObject val$object;
                final JSONObject val$stagedObject;

                public volatile Object get(Object obj)
                {
                    return get((String)obj);
                }

                public Object get(String s1)
                {
                    return object.get(s1);
                }

                public Iterator keyIterator()
                {
                    return object.keySet().iterator();
                }

                public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
                {
                    set((String)obj, obj1, onerrorlistener);
                }

                public void set(String s1, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
                {
                    try
                    {
                        stagedObject.put(s1, obj);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        obj = s1.getLocalizedMessage();
                    }
                    s1 = ((String) (obj));
                    if (obj == null)
                    {
                        s1 = "Error staging object.";
                    }
                    onerrorlistener.onError(new FacebookException(s1));
                }

            
            {
                this$0 = ShareApi.this;
                object = shareopengraphobject;
                stagedObject = jsonobject;
                super();
            }
            }, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

                final ShareApi this$0;
                final String val$ogType;
                final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;
                final com.facebook.GraphRequest.Callback val$requestCallback;
                final JSONObject val$stagedObject;

                public void onComplete()
                {
                    String s1 = stagedObject.toString();
                    Object obj = new Bundle();
                    ((Bundle) (obj)).putString("object", s1);
                    try
                    {
                        (new GraphRequest(AccessToken.getCurrentAccessToken(), getGraphPath((new StringBuilder()).append("objects/").append(URLEncoder.encode(ogType, "UTF-8")).toString()), ((Bundle) (obj)), HttpMethod.POST, requestCallback)).executeAsync();
                        return;
                    }
                    catch (UnsupportedEncodingException unsupportedencodingexception)
                    {
                        obj = unsupportedencodingexception.getLocalizedMessage();
                    }
                    unsupportedencodingexception = ((UnsupportedEncodingException) (obj));
                    if (obj == null)
                    {
                        unsupportedencodingexception = "Error staging Open Graph object.";
                    }
                    onOpenGraphObjectStagedListener.onError(new FacebookException(unsupportedencodingexception));
                }

                public void onError(FacebookException facebookexception)
                {
                    onOpenGraphObjectStagedListener.onError(facebookexception);
                }

            
            {
                this$0 = ShareApi.this;
                stagedObject = jsonobject;
                ogType = s;
                requestCallback = callback;
                onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
                super();
            }
            });
            return;
        }
    }

    private void stagePhoto(final SharePhoto photo, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onPhotoStagedListener)
    {
        Object obj = photo.getBitmap();
        android.net.Uri uri = photo.getImageUrl();
        if (obj != null || uri != null)
        {
            photo = new com.facebook.GraphRequest.Callback() {

                final ShareApi this$0;
                final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onPhotoStagedListener;
                final SharePhoto val$photo;

                public void onCompleted(GraphResponse graphresponse)
                {
                    Object obj1 = graphresponse.getError();
                    if (obj1 != null)
                    {
                        String s1 = ((FacebookRequestError) (obj1)).getErrorMessage();
                        obj1 = s1;
                        if (s1 == null)
                        {
                            obj1 = "Error staging photo.";
                        }
                        onPhotoStagedListener.onError(new FacebookGraphResponseException(graphresponse, ((String) (obj1))));
                        return;
                    }
                    graphresponse = graphresponse.getJSONObject();
                    if (graphresponse == null)
                    {
                        onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
                        return;
                    }
                    graphresponse = graphresponse.optString("uri");
                    if (graphresponse == null)
                    {
                        onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
                        return;
                    }
                    obj1 = new JSONObject();
                    try
                    {
                        ((JSONObject) (obj1)).put("url", graphresponse);
                        ((JSONObject) (obj1)).put("user_generated", photo.getUserGenerated());
                    }
                    // Misplaced declaration of an exception variable
                    catch (GraphResponse graphresponse)
                    {
                        String s = graphresponse.getLocalizedMessage();
                        graphresponse = s;
                        if (s == null)
                        {
                            graphresponse = "Error staging photo.";
                        }
                        onPhotoStagedListener.onError(new FacebookException(graphresponse));
                        return;
                    }
                    onPhotoStagedListener.onComplete(obj1);
                }

            
            {
                this$0 = ShareApi.this;
                onPhotoStagedListener = onmapvaluecompletelistener;
                photo = sharephoto;
                super();
            }
            };
            if (obj != null)
            {
                ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), ((android.graphics.Bitmap) (obj)), photo).executeAsync();
                return;
            }
            try
            {
                ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), uri, photo).executeAsync();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (final SharePhoto photo)
            {
                obj = photo.getLocalizedMessage();
            }
            photo = ((SharePhoto) (obj));
            if (obj == null)
            {
                photo = "Error staging photo.";
            }
            onPhotoStagedListener.onError(new FacebookException(photo));
            return;
        } else
        {
            onPhotoStagedListener.onError(new FacebookException("Photos must have an imageURL or bitmap."));
            return;
        }
    }

    public boolean canShare()
    {
        Object obj;
        if (getShareContent() != null)
        {
            if ((obj = AccessToken.getCurrentAccessToken()) != null)
            {
                obj = ((AccessToken) (obj)).getPermissions();
                if (obj == null || !((Set) (obj)).contains("publish_actions"))
                {
                    Log.w("ShareApi", "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
                }
                return true;
            }
        }
        return false;
    }

    public String getGraphNode()
    {
        return graphNode;
    }

    public String getMessage()
    {
        return message;
    }

    public ShareContent getShareContent()
    {
        return shareContent;
    }

    public void setGraphNode(String s)
    {
        graphNode = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void share(FacebookCallback facebookcallback)
    {
        if (!canShare())
        {
            ShareInternalUtility.invokeCallbackWithError(facebookcallback, "Insufficient permissions for sharing content via Api.");
        } else
        {
            Object obj = getShareContent();
            try
            {
                ShareContentValidation.validateForApiShare(((ShareContent) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ShareInternalUtility.invokeCallbackWithException(facebookcallback, ((Exception) (obj)));
                return;
            }
            if (obj instanceof ShareLinkContent)
            {
                shareLinkContent((ShareLinkContent)obj, facebookcallback);
                return;
            }
            if (obj instanceof SharePhotoContent)
            {
                sharePhotoContent((SharePhotoContent)obj, facebookcallback);
                return;
            }
            if (obj instanceof ShareVideoContent)
            {
                shareVideoContent((ShareVideoContent)obj, facebookcallback);
                return;
            }
            if (obj instanceof ShareOpenGraphContent)
            {
                shareOpenGraphContent((ShareOpenGraphContent)obj, facebookcallback);
                return;
            }
        }
    }






    // Unreferenced inner class com/facebook/share/ShareApi$10

/* anonymous class */
    class _cls10
        implements com.facebook.GraphRequest.Callback
    {

        final ShareApi this$0;
        final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;

        public void onCompleted(GraphResponse graphresponse)
        {
            Object obj = graphresponse.getError();
            if (obj != null)
            {
                String s = ((FacebookRequestError) (obj)).getErrorMessage();
                obj = s;
                if (s == null)
                {
                    obj = "Error staging Open Graph object.";
                }
                onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(graphresponse, ((String) (obj))));
                return;
            }
            obj = graphresponse.getJSONObject();
            if (obj == null)
            {
                onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."));
                return;
            }
            obj = ((JSONObject) (obj)).optString("id");
            if (obj == null)
            {
                onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."));
                return;
            } else
            {
                onOpenGraphObjectStagedListener.onComplete(obj);
                return;
            }
        }

            
            {
                this$0 = ShareApi.this;
                onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
                super();
            }
    }

}
