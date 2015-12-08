// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.CollectionMapper;
import com.facebook.internal.Mutable;
import com.facebook.internal.Utility;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.FileNotFoundException;
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

    private final ShareContent shareContent;

    public ShareApi(ShareContent sharecontent)
    {
        shareContent = sharecontent;
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
        callback = new _cls4();
        Bundle bundle = new Bundle();
        bundle.putString("link", Utility.getUriString(sharelinkcontent.getContentUrl()));
        bundle.putString("picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
        bundle.putString("name", sharelinkcontent.getContentTitle());
        bundle.putString("description", sharelinkcontent.getContentDescription());
        bundle.putString("ref", sharelinkcontent.getRef());
        (new GraphRequest(AccessToken.getCurrentAccessToken(), "/me/feed", bundle, HttpMethod.POST, callback)).executeAsync();
    }

    private void shareOpenGraphContent(final ShareOpenGraphContent action, final FacebookCallback callback)
    {
        final _cls1 requestCallback = new _cls1();
        action = action.getAction();
        final Bundle parameters = action.getBundle();
        stageOpenGraphAction(parameters, new _cls2());
    }

    private void sharePhotoContent(SharePhotoContent sharephotocontent, FacebookCallback facebookcallback)
    {
        Mutable mutable;
        AccessToken accesstoken;
        ArrayList arraylist;
        _cls3 _lcls3;
        mutable = new Mutable(Integer.valueOf(0));
        accesstoken = AccessToken.getCurrentAccessToken();
        arraylist = new ArrayList();
        _lcls3 = new _cls3();
        sharephotocontent = sharephotocontent.getPhotos().iterator();
_L3:
        android.graphics.Bitmap bitmap;
        Object obj;
        if (!sharephotocontent.hasNext())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj = (SharePhoto)sharephotocontent.next();
        bitmap = ((SharePhoto) (obj)).getBitmap();
        obj = ((SharePhoto) (obj)).getImageUrl();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        arraylist.add(ShareInternalUtility.newUploadPhotoRequest(accesstoken, bitmap, _lcls3));
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
        if (obj == null) goto _L3; else goto _L4
_L4:
        arraylist.add(ShareInternalUtility.newUploadPhotoRequest(accesstoken, ((android.net.Uri) (obj)), _lcls3));
          goto _L3
    }

    private void shareVideoContent(ShareVideoContent sharevideocontent, final FacebookCallback callback)
    {
        Object obj = new _cls5();
        try
        {
            obj = ShareInternalUtility.newUploadVideoRequest(AccessToken.getCurrentAccessToken(), sharevideocontent.getVideo().getLocalUrl(), ((com.facebook.GraphRequest.Callback) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ShareVideoContent sharevideocontent)
        {
            ShareInternalUtility.invokeCallbackWithException(callback, sharevideocontent);
            return;
        }
        callback = ((GraphRequest) (obj)).getParameters();
        callback.putString("title", sharevideocontent.getContentTitle());
        callback.putString("description", sharevideocontent.getContentDescription());
        callback.putString("ref", sharevideocontent.getRef());
        ((GraphRequest) (obj)).setParameters(callback);
        ((GraphRequest) (obj)).executeAsync();
    }

    private static void stageArrayList(final ArrayList arrayList, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onArrayListStagedListener)
    {
        final JSONArray stagedObject = new JSONArray();
        stageCollectionValues(new _cls6(), new _cls7());
    }

    private static void stageCollectionValues(com.facebook.internal.CollectionMapper.Collection collection, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
    {
        CollectionMapper.iterate(collection, new _cls8(), onmappercompletelistener);
    }

    private static void stageOpenGraphAction(final Bundle parameters, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
    {
        stageCollectionValues(new _cls9(), onmappercompletelistener);
    }

    private static void stageOpenGraphObject(final ShareOpenGraphObject object, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onOpenGraphObjectStagedListener)
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
            stageCollectionValues(new _cls10(), new _cls12());
            return;
        }
    }

    private static void stagePhoto(final SharePhoto photo, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onPhotoStagedListener)
    {
        Object obj = photo.getBitmap();
        android.net.Uri uri = photo.getImageUrl();
        if (obj != null || uri != null)
        {
            photo = new _cls13();
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

    public final boolean canShare()
    {
        Object obj;
        if (getShareContent() != null)
        {
            if ((obj = AccessToken.getCurrentAccessToken()) != null && (obj = ((AccessToken) (obj)).getPermissions()) != null)
            {
                return ((Set) (obj)).contains("publish_actions");
            }
        }
        return false;
    }

    public final ShareContent getShareContent()
    {
        return shareContent;
    }

    public final void share(FacebookCallback facebookcallback)
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





    private class _cls4
        implements com.facebook.GraphRequest.Callback
    {

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

        _cls4()
        {
            this$0 = ShareApi.this;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls1
        implements com.facebook.GraphRequest.Callback
    {

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

        _cls1()
        {
            this$0 = ShareApi.this;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls2
        implements com.facebook.internal.CollectionMapper.OnMapperCompleteListener
    {

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
                (new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder("/me/")).append(URLEncoder.encode(action.getActionType(), "UTF-8")).toString(), parameters, HttpMethod.POST, requestCallback)).executeAsync();
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

        _cls2()
        {
            this$0 = ShareApi.this;
            parameters = bundle;
            action = shareopengraphaction;
            requestCallback = callback1;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls3
        implements com.facebook.GraphRequest.Callback
    {

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
                    String s = ((JSONObject)results.get(0)).optString("id");
                    ShareInternalUtility.invokeCallbackWithResults(callback, s, graphresponse);
                    return;
                }
            }
        }

        _cls3()
        {
            this$0 = ShareApi.this;
            results = arraylist;
            errorResponses = arraylist1;
            requestCount = mutable;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls5
        implements com.facebook.GraphRequest.Callback
    {

        final ShareApi this$0;
        final FacebookCallback val$callback;

        public void onCompleted(GraphResponse graphresponse)
        {
            Object obj = null;
            String s = obj;
            if (graphresponse != null)
            {
                JSONObject jsonobject = graphresponse.getJSONObject();
                s = obj;
                if (jsonobject != null)
                {
                    s = jsonobject.optString("id");
                }
            }
            ShareInternalUtility.invokeCallbackWithResults(callback, s, graphresponse);
        }

        _cls5()
        {
            this$0 = ShareApi.this;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls6
        implements com.facebook.internal.CollectionMapper.Collection
    {

        final ArrayList val$arrayList;
        final JSONArray val$stagedObject;

        public final Object get(Integer integer)
        {
            return arrayList.get(integer.intValue());
        }

        public final volatile Object get(Object obj)
        {
            return get((Integer)obj);
        }

        public final Iterator keyIterator()
        {
            int i = arrayList.size();
            class _cls1
                implements Iterator
            {

                final _cls6 this$0;
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

                _cls1()
                {
                    this$0 = _cls6.this;
                    current = mutable;
                    size = i;
                    super();
                }
            }

            return new _cls1();
        }

        public final void set(Integer integer, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
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

        public final volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
        {
            set((Integer)obj, obj1, onerrorlistener);
        }

        _cls6()
        {
            arrayList = arraylist;
            stagedObject = jsonarray;
            super();
        }
    }


    private class _cls7
        implements com.facebook.internal.CollectionMapper.OnMapperCompleteListener
    {

        final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onArrayListStagedListener;
        final JSONArray val$stagedObject;

        public final void onComplete()
        {
            onArrayListStagedListener.onComplete(stagedObject);
        }

        public final void onError(FacebookException facebookexception)
        {
            onArrayListStagedListener.onError(facebookexception);
        }

        _cls7()
        {
            onArrayListStagedListener = onmapvaluecompletelistener;
            stagedObject = jsonarray;
            super();
        }
    }


    private class _cls8
        implements com.facebook.internal.CollectionMapper.ValueMapper
    {

        public final void mapValue(Object obj, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
        {
            if (obj instanceof ArrayList)
            {
                ShareApi.stageArrayList((ArrayList)obj, onmapvaluecompletelistener);
                return;
            }
            if (obj instanceof ShareOpenGraphObject)
            {
                ShareApi.stageOpenGraphObject((ShareOpenGraphObject)obj, onmapvaluecompletelistener);
                return;
            }
            if (obj instanceof SharePhoto)
            {
                ShareApi.stagePhoto((SharePhoto)obj, onmapvaluecompletelistener);
                return;
            } else
            {
                onmapvaluecompletelistener.onComplete(obj);
                return;
            }
        }

        _cls8()
        {
        }
    }


    private class _cls9
        implements com.facebook.internal.CollectionMapper.Collection
    {

        final Bundle val$parameters;

        public final volatile Object get(Object obj)
        {
            return get((String)obj);
        }

        public final Object get(String s)
        {
            return parameters.get(s);
        }

        public final Iterator keyIterator()
        {
            return parameters.keySet().iterator();
        }

        public final volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
        {
            set((String)obj, obj1, onerrorlistener);
        }

        public final void set(String s, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
        {
            if (!Utility.putJSONValueInBundle(parameters, s, obj))
            {
                onerrorlistener.onError(new FacebookException((new StringBuilder("Unexpected value: ")).append(obj.toString()).toString()));
            }
        }

        _cls9()
        {
            parameters = bundle;
            super();
        }
    }


    private class _cls10
        implements com.facebook.internal.CollectionMapper.Collection
    {

        final ShareOpenGraphObject val$object;
        final JSONObject val$stagedObject;

        public final volatile Object get(Object obj)
        {
            return get((String)obj);
        }

        public final Object get(String s)
        {
            return object.get(s);
        }

        public final Iterator keyIterator()
        {
            return object.keySet().iterator();
        }

        public final volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
        {
            set((String)obj, obj1, onerrorlistener);
        }

        public final void set(String s, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
        {
            try
            {
                stagedObject.put(s, obj);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                obj = s.getLocalizedMessage();
            }
            s = ((String) (obj));
            if (obj == null)
            {
                s = "Error staging object.";
            }
            onerrorlistener.onError(new FacebookException(s));
        }

        _cls10()
        {
            object = shareopengraphobject;
            stagedObject = jsonobject;
            super();
        }
    }


    private class _cls12
        implements com.facebook.internal.CollectionMapper.OnMapperCompleteListener
    {

        final String val$ogType;
        final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;
        final com.facebook.GraphRequest.Callback val$requestCallback;
        final JSONObject val$stagedObject;

        public final void onComplete()
        {
            String s = stagedObject.toString();
            Object obj = new Bundle();
            ((Bundle) (obj)).putString("object", s);
            try
            {
                (new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder("/me/objects/")).append(URLEncoder.encode(ogType, "UTF-8")).toString(), ((Bundle) (obj)), HttpMethod.POST, requestCallback)).executeAsync();
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

        public final void onError(FacebookException facebookexception)
        {
            onOpenGraphObjectStagedListener.onError(facebookexception);
        }

        _cls12()
        {
            stagedObject = jsonobject;
            ogType = s;
            requestCallback = callback;
            onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
            super();
        }
    }


    private class _cls11
        implements com.facebook.GraphRequest.Callback
    {

        final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;

        public final void onCompleted(GraphResponse graphresponse)
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

        _cls11()
        {
            onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
            super();
        }
    }


    private class _cls13
        implements com.facebook.GraphRequest.Callback
    {

        final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onPhotoStagedListener;
        final SharePhoto val$photo;

        public final void onCompleted(GraphResponse graphresponse)
        {
            Object obj = graphresponse.getError();
            if (obj != null)
            {
                String s1 = ((FacebookRequestError) (obj)).getErrorMessage();
                obj = s1;
                if (s1 == null)
                {
                    obj = "Error staging photo.";
                }
                onPhotoStagedListener.onError(new FacebookGraphResponseException(graphresponse, ((String) (obj))));
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
            obj = new JSONObject();
            try
            {
                ((JSONObject) (obj)).put("url", graphresponse);
                ((JSONObject) (obj)).put("user_generated", photo.getUserGenerated());
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
            onPhotoStagedListener.onComplete(obj);
        }

        _cls13()
        {
            onPhotoStagedListener = onmapvaluecompletelistener;
            photo = sharephoto;
            super();
        }
    }

}
