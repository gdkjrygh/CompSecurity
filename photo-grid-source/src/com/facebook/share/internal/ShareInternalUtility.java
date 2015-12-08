// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.GraphUtil;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ResultProcessor, OpenGraphJSONUtility

public final class ShareInternalUtility
{

    private static final String MY_ACTION_FORMAT = "me/%s";
    private static final String MY_FEED = "me/feed";
    private static final String MY_OBJECTS_FORMAT = "me/objects/%s";
    private static final String MY_PHOTOS = "me/photos";
    private static final String MY_STAGING_RESOURCES = "me/staging_resources";
    private static final String MY_VIDEOS = "me/videos";
    private static final String OBJECT_PARAM = "object";
    private static final String PICTURE_PARAM = "picture";
    private static final String STAGING_PARAM = "file";

    private ShareInternalUtility()
    {
    }

    private static AppCall getAppCallFromActivityResult(int i, int j, Intent intent)
    {
        intent = NativeProtocol.getCallIdFromIntent(intent);
        if (intent == null)
        {
            return null;
        } else
        {
            return AppCall.finishPendingCall(intent, i);
        }
    }

    private static com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, SharePhoto sharephoto)
    {
        Bitmap bitmap = sharephoto.getBitmap();
        Uri uri = sharephoto.getImageUrl();
        sharephoto = null;
        if (bitmap != null)
        {
            sharephoto = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        } else
        if (uri != null)
        {
            return NativeAppCallAttachmentStore.createAttachment(uuid, uri);
        }
        return sharephoto;
    }

    public static Pair getFieldNameAndNamespaceFromFullName(String s)
    {
        Object obj = null;
        int i = s.indexOf(':');
        String s2 = obj;
        String s1 = s;
        if (i != -1)
        {
            s2 = obj;
            s1 = s;
            if (s.length() > i + 1)
            {
                s2 = s.substring(0, i);
                s1 = s.substring(i + 1);
            }
        }
        return new Pair(s2, s1);
    }

    public static com.facebook.share.widget.LikeView.ObjectType getMostSpecificObjectType(com.facebook.share.widget.LikeView.ObjectType objecttype, com.facebook.share.widget.LikeView.ObjectType objecttype1)
    {
        if (objecttype != objecttype1)
        {
            if (objecttype == com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
            {
                return objecttype1;
            }
            if (objecttype1 != com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
            {
                return null;
            }
        }
        return objecttype;
    }

    public static String getNativeDialogCompletionGesture(Bundle bundle)
    {
        if (bundle.containsKey("completionGesture"))
        {
            return bundle.getString("completionGesture");
        } else
        {
            return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        }
    }

    public static boolean getNativeDialogDidComplete(Bundle bundle)
    {
        if (bundle.containsKey("didComplete"))
        {
            return bundle.getBoolean("didComplete");
        } else
        {
            return bundle.getBoolean("com.facebook.platform.extra.DID_COMPLETE", false);
        }
    }

    public static List getPhotoUrls(SharePhotoContent sharephotocontent, final UUID appCallId)
    {
label0:
        {
            if (sharephotocontent != null)
            {
                sharephotocontent = sharephotocontent.getPhotos();
                if (sharephotocontent != null)
                {
                    break label0;
                }
            }
            return null;
        }
        sharephotocontent = Utility.map(sharephotocontent, new _cls4());
        appCallId = Utility.map(sharephotocontent, new _cls5());
        NativeAppCallAttachmentStore.addAttachments(sharephotocontent);
        return appCallId;
    }

    public static String getShareDialogPostId(Bundle bundle)
    {
        if (bundle.containsKey("postId"))
        {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID"))
        {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        } else
        {
            return bundle.getString("post_id");
        }
    }

    public static ResultProcessor getShareResultProcessor(final FacebookCallback final_facebookcallback)
    {
        return new _cls1(final_facebookcallback);
    }

    public static boolean handleActivityResult(int i, int j, Intent intent, ResultProcessor resultprocessor)
    {
        boolean flag = true;
        AppCall appcall = getAppCallFromActivityResult(i, j, intent);
        if (appcall == null)
        {
            flag = false;
        } else
        {
            NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appcall.getCallId());
            if (resultprocessor != null)
            {
                FacebookException facebookexception = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent));
                if (facebookexception != null)
                {
                    if (facebookexception instanceof FacebookOperationCanceledException)
                    {
                        resultprocessor.onCancel(appcall);
                        return true;
                    } else
                    {
                        resultprocessor.onError(appcall, facebookexception);
                        return true;
                    }
                } else
                {
                    resultprocessor.onSuccess(appcall, NativeProtocol.getSuccessResultsFromIntent(intent));
                    return true;
                }
            }
        }
        return flag;
    }

    public static void invokeCallbackWithError(FacebookCallback facebookcallback, String s)
    {
        invokeOnErrorCallback(facebookcallback, s);
    }

    public static void invokeCallbackWithException(FacebookCallback facebookcallback, Exception exception)
    {
        if (exception instanceof FacebookException)
        {
            invokeOnErrorCallback(facebookcallback, (FacebookException)exception);
            return;
        } else
        {
            invokeCallbackWithError(facebookcallback, (new StringBuilder("Error preparing share content: ")).append(exception.getLocalizedMessage()).toString());
            return;
        }
    }

    public static void invokeCallbackWithResults(FacebookCallback facebookcallback, String s, GraphResponse graphresponse)
    {
        Object obj = graphresponse.getError();
        if (obj != null)
        {
            obj = ((FacebookRequestError) (obj)).getErrorMessage();
            s = ((String) (obj));
            if (Utility.isNullOrEmpty(((String) (obj))))
            {
                s = "Unexpected error sharing.";
            }
            invokeOnErrorCallback(facebookcallback, graphresponse, s);
            return;
        } else
        {
            invokeOnSuccessCallback(facebookcallback, s);
            return;
        }
    }

    private static void invokeOnCancelCallback(FacebookCallback facebookcallback)
    {
        logShareResult("cancelled", null);
        if (facebookcallback != null)
        {
            facebookcallback.onCancel();
        }
    }

    private static void invokeOnErrorCallback(FacebookCallback facebookcallback, FacebookException facebookexception)
    {
        logShareResult("error", facebookexception.getMessage());
        if (facebookcallback != null)
        {
            facebookcallback.onError(facebookexception);
        }
    }

    private static void invokeOnErrorCallback(FacebookCallback facebookcallback, GraphResponse graphresponse, String s)
    {
        logShareResult("error", s);
        if (facebookcallback != null)
        {
            facebookcallback.onError(new FacebookGraphResponseException(graphresponse, s));
        }
    }

    private static void invokeOnErrorCallback(FacebookCallback facebookcallback, String s)
    {
        logShareResult("error", s);
        if (facebookcallback != null)
        {
            facebookcallback.onError(new FacebookException(s));
        }
    }

    private static void invokeOnSuccessCallback(FacebookCallback facebookcallback, String s)
    {
        logShareResult("succeeded", null);
        if (facebookcallback != null)
        {
            facebookcallback.onSuccess(new com.facebook.share.Sharer.Result(s));
        }
    }

    private static void logShareResult(String s, String s1)
    {
        AppEventsLogger appeventslogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", s);
        if (s1 != null)
        {
            bundle.putString("error_message", s1);
        }
        appeventslogger.logSdkEvent("fb_share_dialog_result", null, bundle);
    }

    public static GraphRequest newPostOpenGraphActionRequest(AccessToken accesstoken, JSONObject jsonobject, com.facebook.GraphRequest.Callback callback)
    {
        if (jsonobject == null)
        {
            throw new FacebookException("openGraphAction cannot be null");
        }
        String s = jsonobject.optString("type");
        if (Utility.isNullOrEmpty(s))
        {
            throw new FacebookException("openGraphAction must have non-null 'type' property");
        } else
        {
            return GraphRequest.newPostRequest(accesstoken, String.format("me/%s", new Object[] {
                s
            }), jsonobject, callback);
        }
    }

    public static GraphRequest newPostOpenGraphObjectRequest(AccessToken accesstoken, String s, String s1, String s2, String s3, String s4, JSONObject jsonobject, com.facebook.GraphRequest.Callback callback)
    {
        return newPostOpenGraphObjectRequest(accesstoken, GraphUtil.createOpenGraphObjectForPost(s, s1, s2, s3, s4, jsonobject, null), callback);
    }

    public static GraphRequest newPostOpenGraphObjectRequest(AccessToken accesstoken, JSONObject jsonobject, com.facebook.GraphRequest.Callback callback)
    {
        if (jsonobject == null)
        {
            throw new FacebookException("openGraphObject cannot be null");
        }
        if (Utility.isNullOrEmpty(jsonobject.optString("type")))
        {
            throw new FacebookException("openGraphObject must have non-null 'type' property");
        }
        if (Utility.isNullOrEmpty(jsonobject.optString("title")))
        {
            throw new FacebookException("openGraphObject must have non-null 'title' property");
        } else
        {
            String s = String.format("me/objects/%s", new Object[] {
                jsonobject.optString("type")
            });
            Bundle bundle = new Bundle();
            bundle.putString("object", jsonobject.toString());
            return new GraphRequest(accesstoken, s, bundle, HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newStatusUpdateRequest(AccessToken accesstoken, String s, com.facebook.GraphRequest.Callback callback)
    {
        return newStatusUpdateRequest(accesstoken, s, ((String) (null)), null, callback);
    }

    private static GraphRequest newStatusUpdateRequest(AccessToken accesstoken, String s, String s1, List list, com.facebook.GraphRequest.Callback callback)
    {
        Bundle bundle = new Bundle();
        bundle.putString("message", s);
        if (s1 != null)
        {
            bundle.putString("place", s1);
        }
        if (list != null && list.size() > 0)
        {
            bundle.putString("tags", TextUtils.join(",", list));
        }
        return new GraphRequest(accesstoken, "me/feed", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newStatusUpdateRequest(AccessToken accesstoken, String s, JSONObject jsonobject, List list, com.facebook.GraphRequest.Callback callback)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            Iterator iterator = list.iterator();
            do
            {
                list = arraylist;
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist.add(((JSONObject)iterator.next()).optString("id"));
            } while (true);
        } else
        {
            list = null;
        }
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.optString("id");
        }
        return newStatusUpdateRequest(accesstoken, s, ((String) (jsonobject)), list, callback);
    }

    public static GraphRequest newUpdateOpenGraphObjectRequest(AccessToken accesstoken, String s, String s1, String s2, String s3, String s4, JSONObject jsonobject, com.facebook.GraphRequest.Callback callback)
    {
        return newUpdateOpenGraphObjectRequest(accesstoken, GraphUtil.createOpenGraphObjectForPost(null, s1, s2, s3, s4, jsonobject, s), callback);
    }

    public static GraphRequest newUpdateOpenGraphObjectRequest(AccessToken accesstoken, JSONObject jsonobject, com.facebook.GraphRequest.Callback callback)
    {
        if (jsonobject == null)
        {
            throw new FacebookException("openGraphObject cannot be null");
        }
        String s = jsonobject.optString("id");
        if (s == null)
        {
            throw new FacebookException("openGraphObject must have an id");
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("object", jsonobject.toString());
            return new GraphRequest(accesstoken, s, bundle, HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, Bitmap bitmap, com.facebook.GraphRequest.Callback callback)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("picture", bitmap);
        return new GraphRequest(accesstoken, "me/photos", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, Uri uri, com.facebook.GraphRequest.Callback callback)
    {
        if (Utility.isFileUri(uri))
        {
            return newUploadPhotoRequest(accesstoken, new File(uri.getPath()), callback);
        }
        if (!Utility.isContentUri(uri))
        {
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        } else
        {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("picture", uri);
            return new GraphRequest(accesstoken, "me/photos", bundle, HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, File file, com.facebook.GraphRequest.Callback callback)
    {
        file = ParcelFileDescriptor.open(file, 0x10000000);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("picture", file);
        return new GraphRequest(accesstoken, "me/photos", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Bitmap bitmap, com.facebook.GraphRequest.Callback callback)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", bitmap);
        return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Uri uri, com.facebook.GraphRequest.Callback callback)
    {
        if (Utility.isFileUri(uri))
        {
            return newUploadStagingResourceWithImageRequest(accesstoken, new File(uri.getPath()), callback);
        }
        if (!Utility.isContentUri(uri))
        {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } else
        {
            uri = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", uri);
            return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, File file, com.facebook.GraphRequest.Callback callback)
    {
        file = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 0x10000000), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", file);
        return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newUploadVideoRequest(AccessToken accesstoken, Uri uri, com.facebook.GraphRequest.Callback callback)
    {
        if (Utility.isFileUri(uri))
        {
            return newUploadVideoRequest(accesstoken, new File(uri.getPath()), callback);
        }
        if (!Utility.isContentUri(uri))
        {
            throw new FacebookException("The video Uri must be either a file:// or content:// Uri");
        } else
        {
            Object obj = FacebookSdk.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
            int i = ((Cursor) (obj)).getColumnIndex("_display_name");
            ((Cursor) (obj)).moveToFirst();
            String s = ((Cursor) (obj)).getString(i);
            ((Cursor) (obj)).close();
            obj = new Bundle(1);
            ((Bundle) (obj)).putParcelable(s, uri);
            return new GraphRequest(accesstoken, "me/videos", ((Bundle) (obj)), HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newUploadVideoRequest(AccessToken accesstoken, File file, com.facebook.GraphRequest.Callback callback)
    {
        ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.open(file, 0x10000000);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(file.getName(), parcelfiledescriptor);
        return new GraphRequest(accesstoken, "me/videos", bundle, HttpMethod.POST, callback);
    }

    public static void registerSharerCallback(final int requestCode, CallbackManager callbackmanager, final FacebookCallback callback)
    {
        if (!(callbackmanager instanceof CallbackManagerImpl))
        {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            ((CallbackManagerImpl)callbackmanager).registerCallback(requestCode, new _cls3());
            return;
        }
    }

    public static void registerStaticShareCallback(final int requestCode)
    {
        CallbackManagerImpl.registerStaticCallback(requestCode, new _cls2());
    }

    public static JSONArray removeNamespacesFromOGJsonArray(JSONArray jsonarray, boolean flag)
    {
        JSONArray jsonarray1 = new JSONArray();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            Object obj1 = jsonarray.get(i);
            Object obj;
            if (obj1 instanceof JSONArray)
            {
                obj = removeNamespacesFromOGJsonArray((JSONArray)obj1, flag);
            } else
            {
                obj = obj1;
                if (obj1 instanceof JSONObject)
                {
                    obj = removeNamespacesFromOGJsonObject((JSONObject)obj1, flag);
                }
            }
            jsonarray1.put(obj);
            i++;
        }
        return jsonarray1;
    }

    public static JSONObject removeNamespacesFromOGJsonObject(JSONObject jsonobject, boolean flag)
    {
        Object obj;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        Object obj1;
        int i;
        if (jsonobject == null)
        {
            return null;
        }
        JSONArray jsonarray;
        String s;
        String s1;
        try
        {
            jsonobject1 = new JSONObject();
            jsonobject2 = new JSONObject();
            jsonarray = jsonobject.names();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new FacebookException("Failed to create json object from share content");
        }
        i = 0;
_L6:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        s = jsonarray.getString(i);
        obj = jsonobject.get(s);
        if (!(obj instanceof JSONObject)) goto _L2; else goto _L1
_L1:
        obj = removeNamespacesFromOGJsonObject((JSONObject)obj, true);
_L4:
        obj1 = getFieldNameAndNamespaceFromFullName(s);
        s1 = (String)((Pair) (obj1)).first;
        obj1 = (String)((Pair) (obj1)).second;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (s1.equals("fbsdk"))
        {
            jsonobject1.put(s, obj);
            break MISSING_BLOCK_LABEL_236;
        }
        break MISSING_BLOCK_LABEL_151;
_L2:
        if (!(obj instanceof JSONArray)) goto _L4; else goto _L3
_L3:
        obj = removeNamespacesFromOGJsonArray((JSONArray)obj, true);
          goto _L4
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (!s1.equals("og"))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        jsonobject1.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_236;
        jsonobject2.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_236;
        jsonobject1.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_236;
        if (jsonobject2.length() > 0)
        {
            jsonobject1.put("data", jsonobject2);
        }
        return jsonobject1;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static JSONObject toJSONObjectForCall(final UUID callId, ShareOpenGraphAction shareopengraphaction)
    {
        final ArrayList attachments = new ArrayList();
        callId = OpenGraphJSONUtility.toJSONObject(shareopengraphaction, new _cls6());
        NativeAppCallAttachmentStore.addAttachments(attachments);
        return callId;
    }

    public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent shareopengraphcontent)
    {
        return OpenGraphJSONUtility.toJSONObject(shareopengraphcontent.getAction(), new _cls7());
    }





    private class _cls4
        implements com.facebook.internal.Utility.Mapper
    {

        final UUID val$appCallId;

        public final com.facebook.internal.NativeAppCallAttachmentStore.Attachment apply(SharePhoto sharephoto)
        {
            return ShareInternalUtility.getAttachment(appCallId, sharephoto);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((SharePhoto)obj);
        }

        _cls4()
        {
            appCallId = uuid;
            super();
        }
    }


    private class _cls5
        implements com.facebook.internal.Utility.Mapper
    {

        public final volatile Object apply(Object obj)
        {
            return apply((com.facebook.internal.NativeAppCallAttachmentStore.Attachment)obj);
        }

        public final String apply(com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment)
        {
            return attachment.getAttachmentUrl();
        }

        _cls5()
        {
        }
    }


    private class _cls1 extends ResultProcessor
    {

        final FacebookCallback val$callback;

        public final void onCancel(AppCall appcall)
        {
            ShareInternalUtility.invokeOnCancelCallback(callback);
        }

        public final void onError(AppCall appcall, FacebookException facebookexception)
        {
            ShareInternalUtility.invokeOnErrorCallback(callback, facebookexception);
        }

        public final void onSuccess(AppCall appcall, Bundle bundle)
        {
label0:
            {
                if (bundle != null)
                {
                    appcall = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                    if (appcall != null && !"post".equalsIgnoreCase(appcall))
                    {
                        break label0;
                    }
                    appcall = ShareInternalUtility.getShareDialogPostId(bundle);
                    ShareInternalUtility.invokeOnSuccessCallback(callback, appcall);
                }
                return;
            }
            if ("cancel".equalsIgnoreCase(appcall))
            {
                ShareInternalUtility.invokeOnCancelCallback(callback);
                return;
            } else
            {
                ShareInternalUtility.invokeOnErrorCallback(callback, new FacebookException("UnknownError"));
                return;
            }
        }

        _cls1(FacebookCallback facebookcallback1)
        {
            callback = facebookcallback1;
            super(final_facebookcallback);
        }
    }


    private class _cls3
        implements com.facebook.internal.CallbackManagerImpl.Callback
    {

        final FacebookCallback val$callback;
        final int val$requestCode;

        public final boolean onActivityResult(int i, Intent intent)
        {
            return ShareInternalUtility.handleActivityResult(requestCode, i, intent, ShareInternalUtility.getShareResultProcessor(callback));
        }

        _cls3()
        {
            requestCode = i;
            callback = facebookcallback;
            super();
        }
    }


    private class _cls2
        implements com.facebook.internal.CallbackManagerImpl.Callback
    {

        final int val$requestCode;

        public final boolean onActivityResult(int i, Intent intent)
        {
            return ShareInternalUtility.handleActivityResult(requestCode, i, intent, ShareInternalUtility.getShareResultProcessor(null));
        }

        _cls2()
        {
            requestCode = i;
            super();
        }
    }


    private class _cls6
        implements OpenGraphJSONUtility.PhotoJSONProcessor
    {

        final ArrayList val$attachments;
        final UUID val$callId;

        public final JSONObject toJSONObject(SharePhoto sharephoto)
        {
            Object obj = ShareInternalUtility.getAttachment(callId, sharephoto);
            if (obj != null) goto _L2; else goto _L1
_L1:
            obj = null;
_L4:
            return ((JSONObject) (obj));
_L2:
            attachments.add(obj);
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("url", ((com.facebook.internal.NativeAppCallAttachmentStore.Attachment) (obj)).getAttachmentUrl());
            }
            // Misplaced declaration of an exception variable
            catch (SharePhoto sharephoto)
            {
                throw new FacebookException("Unable to attach images", sharephoto);
            }
            obj = jsonobject;
            if (!sharephoto.getUserGenerated()) goto _L4; else goto _L3
_L3:
            jsonobject.put("user_generated", true);
            return jsonobject;
        }

        _cls6()
        {
            callId = uuid;
            attachments = arraylist;
            super();
        }
    }


    private class _cls7
        implements OpenGraphJSONUtility.PhotoJSONProcessor
    {

        public final JSONObject toJSONObject(SharePhoto sharephoto)
        {
            sharephoto = sharephoto.getImageUrl();
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("url", sharephoto.toString());
            }
            // Misplaced declaration of an exception variable
            catch (SharePhoto sharephoto)
            {
                throw new FacebookException("Unable to attach images", sharephoto);
            }
            return jsonobject;
        }

        _cls7()
        {
        }
    }

}
