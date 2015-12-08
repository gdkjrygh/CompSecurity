// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.RequestBatch;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.facebook.widget.FacebookDialog;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            WorkQueue, FileLruCache, Utility, BundleJSONConverter, 
//            NativeProtocol, PendingCallStore, FacebookWebFallbackDialog, LikeStatusClient, 
//            Logger

public class LikeActionController
{
    private abstract class AbstractRequestWrapper
    {

        FacebookRequestError error;
        protected String objectId;
        private Request request;
        final LikeActionController this$0;

        void addToBatch(RequestBatch requestbatch)
        {
            requestbatch.add(request);
        }

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error running request for object '%s' : %s", new Object[] {
                objectId, facebookrequesterror
            });
        }

        protected abstract void processSuccess(Response response);

        protected void setRequest(Request request1)
        {
            request = request1;
            request1.setVersion("v2.2");
            request1.setCallback(new com.facebook.Request.Callback() {

                final AbstractRequestWrapper this$1;

                public void onCompleted(Response response)
                {
                    error = response.getError();
                    if (error != null)
                    {
                        processError(error);
                        return;
                    } else
                    {
                        processSuccess(response);
                        return;
                    }
                }

            
            {
                this$1 = AbstractRequestWrapper.this;
                super();
            }
            });
        }

        protected AbstractRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super();
            objectId = s;
        }
    }

    private static class CreateLikeActionControllerWorkItem
        implements Runnable
    {

        private CreationCallback callback;
        private String objectId;

        public void run()
        {
            LikeActionController.createControllerForObjectId(objectId, callback);
        }

        CreateLikeActionControllerWorkItem(String s, CreationCallback creationcallback)
        {
            objectId = s;
            callback = creationcallback;
        }
    }

    public static interface CreationCallback
    {

        public abstract void onComplete(LikeActionController likeactioncontroller);
    }

    private class GetEngagementRequestWrapper extends AbstractRequestWrapper
    {

        String likeCountStringWithLike;
        String likeCountStringWithoutLike;
        String socialSentenceStringWithLike;
        String socialSentenceStringWithoutLike;
        final LikeActionController this$0;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching engagement for object '%s' : %s", new Object[] {
                objectId, facebookrequesterror
            });
            logAppEventForError("get_engagement", facebookrequesterror);
        }

        protected void processSuccess(Response response)
        {
            response = Utility.tryGetJSONObjectFromResponse(response.getGraphObject(), "engagement");
            if (response != null)
            {
                likeCountStringWithLike = response.optString("count_string_with_like", likeCountStringWithLike);
                likeCountStringWithoutLike = response.optString("count_string_without_like", likeCountStringWithoutLike);
                socialSentenceStringWithLike = response.optString("social_sentence_with_like", socialSentenceStringWithLike);
                socialSentenceStringWithoutLike = response.optString("social_sentence_without_like", socialSentenceStringWithoutLike);
            }
        }

        GetEngagementRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s);
            likeCountStringWithLike = LikeActionController.this.likeCountStringWithLike;
            likeCountStringWithoutLike = LikeActionController.this.likeCountStringWithoutLike;
            socialSentenceStringWithLike = socialSentenceWithLike;
            socialSentenceStringWithoutLike = socialSentenceWithoutLike;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            setRequest(new Request(session, s, bundle, HttpMethod.GET));
        }
    }

    private class GetOGObjectIdRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        String verifiedObjectId;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            if (facebookrequesterror.getErrorMessage().contains("og_object"))
            {
                error = null;
                return;
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' : %s", new Object[] {
                    objectId, facebookrequesterror
                });
                return;
            }
        }

        protected void processSuccess(Response response)
        {
            response = Utility.tryGetJSONObjectFromResponse(response.getGraphObject(), objectId);
            if (response != null)
            {
                response = response.optJSONObject("og_object");
                if (response != null)
                {
                    verifiedObjectId = response.optString("id");
                }
            }
        }

        GetOGObjectIdRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", s);
            setRequest(new Request(session, "", bundle, HttpMethod.GET));
        }
    }

    private class GetOGObjectLikesRequestWrapper extends AbstractRequestWrapper
    {

        boolean objectIsLiked;
        final LikeActionController this$0;
        String unlikeToken;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching like status for object '%s' : %s", new Object[] {
                objectId, facebookrequesterror
            });
            logAppEventForError("get_og_object_like", facebookrequesterror);
        }

        protected void processSuccess(Response response)
        {
            response = Utility.tryGetJSONArrayFromResponse(response.getGraphObject(), "data");
            if (response != null)
            {
                for (int i = 0; i < response.length(); i++)
                {
                    JSONObject jsonobject = response.optJSONObject(i);
                    if (jsonobject == null)
                    {
                        continue;
                    }
                    objectIsLiked = true;
                    JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                    if (jsonobject1 != null && Utility.areObjectsEqual(session.getApplicationId(), jsonobject1.optString("id")))
                    {
                        unlikeToken = jsonobject.optString("id");
                    }
                }

            }
        }

        GetOGObjectLikesRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s);
            objectIsLiked = isObjectLiked;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", s);
            setRequest(new Request(session, "me/og.likes", bundle, HttpMethod.GET));
        }
    }

    private class GetPageIdRequestWrapper extends AbstractRequestWrapper
    {

        boolean objectIsPage;
        final LikeActionController this$0;
        String verifiedObjectId;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' : %s", new Object[] {
                objectId, facebookrequesterror
            });
        }

        protected void processSuccess(Response response)
        {
            response = Utility.tryGetJSONObjectFromResponse(response.getGraphObject(), objectId);
            if (response != null)
            {
                verifiedObjectId = response.optString("id");
                boolean flag;
                if (!Utility.isNullOrEmpty(verifiedObjectId))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                objectIsPage = flag;
            }
        }

        GetPageIdRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", s);
            setRequest(new Request(session, "", bundle, HttpMethod.GET));
        }
    }

    private static class LikeDialogBuilder extends com.facebook.widget.FacebookDialog.Builder
    {

        private String objectId;

        public com.facebook.widget.FacebookDialog.PendingCall getAppCall()
        {
            return appCall;
        }

        public String getApplicationId()
        {
            return applicationId;
        }

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(LikeDialogFeature.LIKE_DIALOG);
        }

        protected Bundle getMethodArguments()
        {
            Bundle bundle = new Bundle();
            bundle.putString("object_id", objectId);
            return bundle;
        }

        public String getWebFallbackUrl()
        {
            return getWebFallbackUrlInternal();
        }

        public LikeDialogBuilder(Activity activity, String s)
        {
            super(activity);
            objectId = s;
        }
    }

    private static final class LikeDialogFeature extends Enum
        implements com.facebook.widget.FacebookDialog.DialogFeature
    {

        private static final LikeDialogFeature $VALUES[];
        public static final LikeDialogFeature LIKE_DIALOG;
        private int minVersion;

        public static LikeDialogFeature valueOf(String s)
        {
            return (LikeDialogFeature)Enum.valueOf(com/facebook/internal/LikeActionController$LikeDialogFeature, s);
        }

        public static LikeDialogFeature[] values()
        {
            return (LikeDialogFeature[])$VALUES.clone();
        }

        public String getAction()
        {
            return "com.facebook.platform.action.request.LIKE_DIALOG";
        }

        public int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            LIKE_DIALOG = new LikeDialogFeature("LIKE_DIALOG", 0, 0x133529d);
            $VALUES = (new LikeDialogFeature[] {
                LIKE_DIALOG
            });
        }

        private LikeDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }

    private static class MRUCacheWorkItem
        implements Runnable
    {

        private static ArrayList mruCachedItems = new ArrayList();
        private String cacheItem;
        private boolean shouldTrim;

        public void run()
        {
            if (cacheItem != null)
            {
                mruCachedItems.remove(cacheItem);
                mruCachedItems.add(0, cacheItem);
            }
            if (shouldTrim && mruCachedItems.size() >= 128)
            {
                String s;
                for (; 64 < mruCachedItems.size(); LikeActionController.cache.remove(s))
                {
                    s = (String)mruCachedItems.remove(mruCachedItems.size() - 1);
                }

            }
        }


        MRUCacheWorkItem(String s, boolean flag)
        {
            cacheItem = s;
            shouldTrim = flag;
        }
    }

    private class PublishLikeRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        String unlikeToken;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            if (facebookrequesterror.getErrorCode() == 3501)
            {
                error = null;
                return;
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error liking object '%s' : %s", new Object[] {
                    objectId, facebookrequesterror
                });
                logAppEventForError("publish_like", facebookrequesterror);
                return;
            }
        }

        protected void processSuccess(Response response)
        {
            unlikeToken = Utility.safeGetStringFromResponse(response.getGraphObject(), "id");
        }

        PublishLikeRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s);
            Bundle bundle = new Bundle();
            bundle.putString("object", s);
            setRequest(new Request(session, "me/og.likes", bundle, HttpMethod.POST));
        }
    }

    private class PublishUnlikeRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        private String unlikeToken;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error unliking object with unlike token '%s' : %s", new Object[] {
                unlikeToken, facebookrequesterror
            });
            logAppEventForError("publish_unlike", facebookrequesterror);
        }

        protected void processSuccess(Response response)
        {
        }

        PublishUnlikeRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(null);
            unlikeToken = s;
            setRequest(new Request(session, s, null, HttpMethod.DELETE));
        }
    }

    private static interface RequestCompletionCallback
    {

        public abstract void onComplete();
    }

    private static class SerializeToDiskWorkItem
        implements Runnable
    {

        private String cacheKey;
        private String controllerJson;

        public void run()
        {
            LikeActionController.serializeToDiskSynchronously(cacheKey, controllerJson);
        }

        SerializeToDiskWorkItem(String s, String s1)
        {
            cacheKey = s;
            controllerJson = s1;
        }
    }


    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";
    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";
    public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";
    public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
    private static final int ERROR_CODE_OBJECT_ALREADY_LIKED = 3501;
    public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";
    public static final String ERROR_PUBLISH_ERROR = "Unable to publish the like/unlike action";
    private static final String JSON_BOOL_IS_OBJECT_LIKED_KEY = "is_object_liked";
    private static final String JSON_BUNDLE_PENDING_CALL_ANALYTICS_BUNDLE = "pending_call_analytics_bundle";
    private static final String JSON_INT_VERSION_KEY = "com.facebook.internal.LikeActionController.version";
    private static final String JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY = "like_count_string_without_like";
    private static final String JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY = "like_count_string_with_like";
    private static final String JSON_STRING_OBJECT_ID_KEY = "object_id";
    private static final String JSON_STRING_PENDING_CALL_ID_KEY = "pending_call_id";
    private static final String JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY = "social_sentence_without_like";
    private static final String JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY = "social_sentence_with_like";
    private static final String JSON_STRING_UNLIKE_TOKEN_KEY = "unlike_token";
    private static final String LIKE_ACTION_CONTROLLER_STORE = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
    private static final String LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY = "OBJECT_SUFFIX";
    private static final String LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY = "PENDING_CONTROLLER_KEY";
    private static final int LIKE_ACTION_CONTROLLER_VERSION = 2;
    private static final String LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY = "like_count_string";
    private static final String LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY = "object_is_liked";
    private static final String LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY = "social_sentence";
    private static final String LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY = "unlike_token";
    private static final int MAX_CACHE_SIZE = 128;
    private static final int MAX_OBJECT_SUFFIX = 1000;
    private static final String TAG = com/facebook/internal/LikeActionController.getSimpleName();
    private static Context applicationContext;
    private static final ConcurrentHashMap cache = new ConcurrentHashMap();
    private static FileLruCache controllerDiskCache;
    private static WorkQueue diskIOWorkQueue = new WorkQueue(1);
    private static Handler handler;
    private static boolean isInitialized;
    private static boolean isPendingBroadcastReset;
    private static WorkQueue mruCacheWorkQueue = new WorkQueue(1);
    private static String objectIdForPendingController;
    private static volatile int objectSuffix;
    private AppEventsLogger appEventsLogger;
    private boolean isObjectLiked;
    private boolean isObjectLikedOnServer;
    private boolean isPendingLikeOrUnlike;
    private String likeCountStringWithLike;
    private String likeCountStringWithoutLike;
    private String objectId;
    private boolean objectIsPage;
    private Bundle pendingCallAnalyticsBundle;
    private UUID pendingCallId;
    private Session session;
    private String socialSentenceWithLike;
    private String socialSentenceWithoutLike;
    private String unlikeToken;
    private String verifiedObjectId;

    private LikeActionController(Session session1, String s)
    {
        session = session1;
        objectId = s;
        appEventsLogger = AppEventsLogger.newLogger(applicationContext, session1);
    }

    private static void broadcastAction(LikeActionController likeactioncontroller, String s)
    {
        broadcastAction(likeactioncontroller, s, null);
    }

    private static void broadcastAction(LikeActionController likeactioncontroller, String s, Bundle bundle)
    {
        Intent intent = new Intent(s);
        s = bundle;
        if (likeactioncontroller != null)
        {
            s = bundle;
            if (bundle == null)
            {
                s = new Bundle();
            }
            s.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeactioncontroller.getObjectId());
        }
        if (s != null)
        {
            intent.putExtras(s);
        }
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent);
    }

    private boolean canUseOGPublish()
    {
        return !objectIsPage && verifiedObjectId != null && session != null && session.getPermissions() != null && session.getPermissions().contains("publish_actions");
    }

    private static void createControllerForObjectId(String s, CreationCallback creationcallback)
    {
        LikeActionController likeactioncontroller = getControllerFromInMemoryCache(s);
        if (likeactioncontroller != null)
        {
            invokeCallbackWithController(creationcallback, likeactioncontroller);
            return;
        }
        LikeActionController likeactioncontroller1 = deserializeFromDiskSynchronously(s);
        likeactioncontroller = likeactioncontroller1;
        if (likeactioncontroller1 == null)
        {
            likeactioncontroller = new LikeActionController(Session.getActiveSession(), s);
            serializeToDiskAsync(likeactioncontroller);
        }
        putControllerInMemoryCache(s, likeactioncontroller);
        handler.post(new Runnable(likeactioncontroller) {

            final LikeActionController val$controllerToRefresh;

            public void run()
            {
                controllerToRefresh.refreshStatusAsync();
            }

            
            {
                controllerToRefresh = likeactioncontroller;
                super();
            }
        });
        invokeCallbackWithController(creationcallback, likeactioncontroller);
    }

    private static LikeActionController deserializeFromDiskSynchronously(String s)
    {
        java.io.InputStream inputstream;
        Object obj;
        java.io.InputStream inputstream1;
        Object obj1;
        String s1;
        obj1 = null;
        s1 = null;
        inputstream1 = null;
        inputstream = inputstream1;
        obj = s1;
        s = getCacheKeyForObjectId(s);
        inputstream = inputstream1;
        obj = s1;
        inputstream1 = controllerDiskCache.get(s);
        s = obj1;
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        inputstream = inputstream1;
        obj = inputstream1;
        s1 = Utility.readStreamToString(inputstream1);
        s = obj1;
        inputstream = inputstream1;
        obj = inputstream1;
        if (Utility.isNullOrEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        inputstream = inputstream1;
        obj = inputstream1;
        s = deserializeFromJson(s1);
        obj = s;
        if (inputstream1 != null)
        {
            Utility.closeQuietly(inputstream1);
            obj = s;
        }
_L2:
        return ((LikeActionController) (obj));
        s;
        obj = inputstream;
        Log.e(TAG, "Unable to deserialize controller from disk", s);
        obj = null;
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        Utility.closeQuietly(inputstream);
        return null;
        s;
        if (obj != null)
        {
            Utility.closeQuietly(((java.io.Closeable) (obj)));
        }
        throw s;
    }

    private static LikeActionController deserializeFromJson(String s)
    {
        s = new JSONObject(s);
        if (s.optInt("com.facebook.internal.LikeActionController.version", -1) != 2)
        {
            return null;
        }
        LikeActionController likeactioncontroller;
        Object obj;
        likeactioncontroller = new LikeActionController(Session.getActiveSession(), s.getString("object_id"));
        likeactioncontroller.likeCountStringWithLike = s.optString("like_count_string_with_like", null);
        likeactioncontroller.likeCountStringWithoutLike = s.optString("like_count_string_without_like", null);
        likeactioncontroller.socialSentenceWithLike = s.optString("social_sentence_with_like", null);
        likeactioncontroller.socialSentenceWithoutLike = s.optString("social_sentence_without_like", null);
        likeactioncontroller.isObjectLiked = s.optBoolean("is_object_liked");
        likeactioncontroller.unlikeToken = s.optString("unlike_token", null);
        obj = s.optString("pending_call_id", null);
        if (!Utility.isNullOrEmpty(((String) (obj))))
        {
            likeactioncontroller.pendingCallId = UUID.fromString(((String) (obj)));
        }
        obj = s.optJSONObject("pending_call_analytics_bundle");
        s = likeactioncontroller;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        likeactioncontroller.pendingCallAnalyticsBundle = BundleJSONConverter.convertToBundle(((JSONObject) (obj)));
        return likeactioncontroller;
        s;
        Log.e(TAG, "Unable to deserialize controller from JSON", s);
        s = null;
        return s;
    }

    private static void ensureApplicationContextExists(Context context)
    {
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorenter ;
        if (applicationContext == null)
        {
            applicationContext = context.getApplicationContext();
        }
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private void fetchVerifiedObjectId(final RequestCompletionCallback completionHandler)
    {
        if (!Utility.isNullOrEmpty(verifiedObjectId))
        {
            if (completionHandler != null)
            {
                completionHandler.onComplete();
            }
            return;
        } else
        {
            final GetOGObjectIdRequestWrapper objectIdRequest = new GetOGObjectIdRequestWrapper(objectId);
            final GetPageIdRequestWrapper pageIdRequest = new GetPageIdRequestWrapper(objectId);
            RequestBatch requestbatch = new RequestBatch();
            objectIdRequest.addToBatch(requestbatch);
            pageIdRequest.addToBatch(requestbatch);
            requestbatch.addCallback(new com.facebook.RequestBatch.Callback() {

                final LikeActionController this$0;
                final RequestCompletionCallback val$completionHandler;
                final GetOGObjectIdRequestWrapper val$objectIdRequest;
                final GetPageIdRequestWrapper val$pageIdRequest;

                public void onBatchCompleted(RequestBatch requestbatch1)
                {
                    verifiedObjectId = objectIdRequest.verifiedObjectId;
                    if (Utility.isNullOrEmpty(verifiedObjectId))
                    {
                        verifiedObjectId = pageIdRequest.verifiedObjectId;
                        objectIsPage = pageIdRequest.objectIsPage;
                    }
                    if (Utility.isNullOrEmpty(verifiedObjectId))
                    {
                        Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.TAG, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                            objectId
                        });
                        LikeActionController likeactioncontroller = LikeActionController.this;
                        if (pageIdRequest.error != null)
                        {
                            requestbatch1 = pageIdRequest.error;
                        } else
                        {
                            requestbatch1 = objectIdRequest.error;
                        }
                        likeactioncontroller.logAppEventForError("get_verified_id", requestbatch1);
                    }
                    if (completionHandler != null)
                    {
                        completionHandler.onComplete();
                    }
                }

            
            {
                this$0 = LikeActionController.this;
                objectIdRequest = getogobjectidrequestwrapper;
                pageIdRequest = getpageidrequestwrapper;
                completionHandler = requestcompletioncallback;
                super();
            }
            });
            requestbatch.executeAsync();
            return;
        }
    }

    private static String getCacheKeyForObjectId(String s)
    {
        String s2 = null;
        Session session1 = Session.getActiveSession();
        String s1 = s2;
        if (session1 != null)
        {
            s1 = s2;
            if (session1.isOpened())
            {
                s1 = session1.getAccessToken();
            }
        }
        s2 = s1;
        if (s1 != null)
        {
            s2 = Utility.md5hash(s1);
        }
        return String.format("%s|%s|com.fb.sdk.like|%d", new Object[] {
            s, Utility.coerceValueIfNullOrEmpty(s2, ""), Integer.valueOf(objectSuffix)
        });
    }

    public static void getControllerForObjectId(Context context, String s, CreationCallback creationcallback)
    {
        ensureApplicationContextExists(context);
        if (!isInitialized)
        {
            performFirstInitialize();
        }
        context = getControllerFromInMemoryCache(s);
        if (context != null)
        {
            invokeCallbackWithController(creationcallback, context);
            return;
        } else
        {
            diskIOWorkQueue.addActiveWorkItem(new CreateLikeActionControllerWorkItem(s, creationcallback));
            return;
        }
    }

    private static LikeActionController getControllerFromInMemoryCache(String s)
    {
        s = getCacheKeyForObjectId(s);
        LikeActionController likeactioncontroller = (LikeActionController)cache.get(s);
        if (likeactioncontroller != null)
        {
            mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(s, false));
        }
        return likeactioncontroller;
    }

    private com.facebook.widget.FacebookDialog.Callback getFacebookDialogCallback(final Bundle analyticsParameters)
    {
        return new com.facebook.widget.FacebookDialog.Callback() {

            final LikeActionController this$0;
            final Bundle val$analyticsParameters;

            public void onComplete(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Bundle bundle)
            {
                if (bundle == null || !bundle.containsKey("object_is_liked"))
                {
                    return;
                }
                boolean flag = bundle.getBoolean("object_is_liked");
                String s = likeCountStringWithLike;
                String s1 = likeCountStringWithoutLike;
                if (bundle.containsKey("like_count_string"))
                {
                    s = bundle.getString("like_count_string");
                    s1 = s;
                }
                String s2 = socialSentenceWithLike;
                String s3 = socialSentenceWithoutLike;
                if (bundle.containsKey("social_sentence"))
                {
                    s2 = bundle.getString("social_sentence");
                    s3 = s2;
                }
                Bundle bundle1;
                if (bundle.containsKey("object_is_liked"))
                {
                    bundle = bundle.getString("unlike_token");
                } else
                {
                    bundle = unlikeToken;
                }
                if (analyticsParameters == null)
                {
                    bundle1 = new Bundle();
                } else
                {
                    bundle1 = analyticsParameters;
                }
                bundle1.putString("call_id", pendingcall.getCallId().toString());
                appEventsLogger.logSdkEvent("fb_like_control_dialog_did_succeed", null, bundle1);
                updateState(flag, s, s1, s2, s3, bundle);
            }

            public void onError(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Exception exception, Bundle bundle)
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Like Dialog failed with error : %s", new Object[] {
                    exception
                });
                if (analyticsParameters == null)
                {
                    exception = new Bundle();
                } else
                {
                    exception = analyticsParameters;
                }
                exception.putString("call_id", pendingcall.getCallId().toString());
                logAppEventForError("present_dialog", exception);
                LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
            }

            
            {
                this$0 = LikeActionController.this;
                analyticsParameters = bundle;
                super();
            }
        };
    }

    public static boolean handleOnActivityResult(Context context, int i, int j, Intent intent)
    {
        ensureApplicationContextExists(context);
        context = NativeProtocol.getCallIdFromIntent(intent);
        if (context != null)
        {
            if (Utility.isNullOrEmpty(objectIdForPendingController))
            {
                objectIdForPendingController = applicationContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
            }
            if (!Utility.isNullOrEmpty(objectIdForPendingController))
            {
                getControllerForObjectId(applicationContext, objectIdForPendingController, new CreationCallback(i, j, intent, context) {

                    final UUID val$callId;
                    final Intent val$data;
                    final int val$requestCode;
                    final int val$resultCode;

                    public void onComplete(LikeActionController likeactioncontroller)
                    {
                        likeactioncontroller.onActivityResult(requestCode, resultCode, data, callId);
                    }

            
            {
                requestCode = i;
                resultCode = j;
                data = intent;
                callId = uuid;
                super();
            }
                });
                return true;
            }
        }
        return false;
    }

    private static void invokeCallbackWithController(CreationCallback creationcallback, LikeActionController likeactioncontroller)
    {
        if (creationcallback == null)
        {
            return;
        } else
        {
            handler.post(new Runnable(creationcallback, likeactioncontroller) {

                final CreationCallback val$callback;
                final LikeActionController val$controller;

                public void run()
                {
                    callback.onComplete(controller);
                }

            
            {
                callback = creationcallback;
                controller = likeactioncontroller;
                super();
            }
            });
            return;
        }
    }

    private void logAppEventForError(String s, Bundle bundle)
    {
        bundle = new Bundle(bundle);
        bundle.putString("object_id", objectId);
        bundle.putString("current_action", s);
        appEventsLogger.logSdkEvent("fb_like_control_error", null, bundle);
    }

    private void logAppEventForError(String s, FacebookRequestError facebookrequesterror)
    {
        Bundle bundle = new Bundle();
        if (facebookrequesterror != null)
        {
            facebookrequesterror = facebookrequesterror.getRequestResult();
            if (facebookrequesterror != null)
            {
                bundle.putString("error", facebookrequesterror.toString());
            }
        }
        logAppEventForError(s, bundle);
    }

    private boolean onActivityResult(int i, int j, Intent intent, UUID uuid)
    {
        if (pendingCallId != null && pendingCallId.equals(uuid))
        {
            if ((uuid = PendingCallStore.getInstance().getPendingCallById(pendingCallId)) != null)
            {
                FacebookDialog.handleActivityResult(applicationContext, uuid, i, intent, getFacebookDialogCallback(pendingCallAnalyticsBundle));
                stopTrackingPendingCall();
                return true;
            }
        }
        return false;
    }

    private static void performFirstInitialize()
    {
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorenter ;
        boolean flag = isInitialized;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorexit ;
        return;
_L2:
        handler = new Handler(Looper.getMainLooper());
        objectSuffix = applicationContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        controllerDiskCache = new FileLruCache(applicationContext, TAG, new FileLruCache.Limits());
        registerSessionBroadcastReceivers();
        isInitialized = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void presentLikeDialog(Activity activity, Fragment fragment, Bundle bundle)
    {
        LikeDialogBuilder likedialogbuilder = new LikeDialogBuilder(activity, objectId);
        likedialogbuilder.setFragment(fragment);
        if (likedialogbuilder.canPresent())
        {
            trackPendingCall(likedialogbuilder.build().present(), bundle);
            appEventsLogger.logSdkEvent("fb_like_control_did_present_dialog", null, bundle);
        } else
        {
            fragment = likedialogbuilder.getWebFallbackUrl();
            if (!Utility.isNullOrEmpty(fragment) && FacebookWebFallbackDialog.presentWebFallback(activity, fragment, likedialogbuilder.getApplicationId(), likedialogbuilder.getAppCall(), getFacebookDialogCallback(bundle)))
            {
                appEventsLogger.logSdkEvent("fb_like_control_did_present_fallback_dialog", null, bundle);
                return;
            }
        }
    }

    private void publishAgainIfNeeded(Bundle bundle)
    {
        if (isObjectLiked != isObjectLikedOnServer && !publishLikeOrUnlikeAsync(isObjectLiked, bundle))
        {
            boolean flag;
            if (!isObjectLiked)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            publishDidError(flag);
        }
    }

    private void publishDidError(boolean flag)
    {
        updateLikeState(flag);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        broadcastAction(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    private void publishLikeAsync(final Bundle analyticsParameters)
    {
        isPendingLikeOrUnlike = true;
        fetchVerifiedObjectId(new RequestCompletionCallback() {

            final LikeActionController this$0;
            final Bundle val$analyticsParameters;

            public void onComplete()
            {
                if (Utility.isNullOrEmpty(verifiedObjectId))
                {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                } else
                {
                    RequestBatch requestbatch = new RequestBatch();
                    PublishLikeRequestWrapper publishlikerequestwrapper = new PublishLikeRequestWrapper(verifiedObjectId);
                    publishlikerequestwrapper.addToBatch(requestbatch);
                    requestbatch.addCallback(publishlikerequestwrapper. new com.facebook.RequestBatch.Callback() {

                        final _cls6 this$1;
                        final PublishLikeRequestWrapper val$likeRequest;

                        public void onBatchCompleted(RequestBatch requestbatch)
                        {
                            isPendingLikeOrUnlike = false;
                            if (likeRequest.error != null)
                            {
                                publishDidError(false);
                                return;
                            } else
                            {
                                unlikeToken = Utility.coerceValueIfNullOrEmpty(likeRequest.unlikeToken, null);
                                isObjectLikedOnServer = true;
                                appEventsLogger.logSdkEvent("fb_like_control_did_like", null, analyticsParameters);
                                publishAgainIfNeeded(analyticsParameters);
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls6;
                likeRequest = PublishLikeRequestWrapper.this;
                super();
            }
                    });
                    requestbatch.executeAsync();
                    return;
                }
            }

            
            {
                this$0 = LikeActionController.this;
                analyticsParameters = bundle;
                super();
            }
        });
    }

    private boolean publishLikeOrUnlikeAsync(boolean flag, Bundle bundle)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (canUseOGPublish())
        {
            if (flag)
            {
                flag1 = true;
                publishLikeAsync(bundle);
            } else
            {
                flag1 = flag2;
                if (!Utility.isNullOrEmpty(unlikeToken))
                {
                    publishUnlikeAsync(bundle);
                    return true;
                }
            }
        }
        return flag1;
    }

    private void publishUnlikeAsync(final Bundle analyticsParameters)
    {
        isPendingLikeOrUnlike = true;
        RequestBatch requestbatch = new RequestBatch();
        final PublishUnlikeRequestWrapper unlikeRequest = new PublishUnlikeRequestWrapper(unlikeToken);
        unlikeRequest.addToBatch(requestbatch);
        requestbatch.addCallback(new com.facebook.RequestBatch.Callback() {

            final LikeActionController this$0;
            final Bundle val$analyticsParameters;
            final PublishUnlikeRequestWrapper val$unlikeRequest;

            public void onBatchCompleted(RequestBatch requestbatch1)
            {
                isPendingLikeOrUnlike = false;
                if (unlikeRequest.error != null)
                {
                    publishDidError(true);
                    return;
                } else
                {
                    unlikeToken = null;
                    isObjectLikedOnServer = false;
                    appEventsLogger.logSdkEvent("fb_like_control_did_unlike", null, analyticsParameters);
                    publishAgainIfNeeded(analyticsParameters);
                    return;
                }
            }

            
            {
                this$0 = LikeActionController.this;
                unlikeRequest = publishunlikerequestwrapper;
                analyticsParameters = bundle;
                super();
            }
        });
        requestbatch.executeAsync();
    }

    private static void putControllerInMemoryCache(String s, LikeActionController likeactioncontroller)
    {
        s = getCacheKeyForObjectId(s);
        mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(s, true));
        cache.put(s, likeactioncontroller);
    }

    private void refreshStatusAsync()
    {
        if (session == null || session.isClosed() || SessionState.CREATED.equals(session.getState()))
        {
            refreshStatusViaService();
        } else
        if (session.isOpened())
        {
            fetchVerifiedObjectId(new RequestCompletionCallback() {

                final LikeActionController this$0;

                public void onComplete()
                {
                    final GetOGObjectLikesRequestWrapper objectLikesRequest = new GetOGObjectLikesRequestWrapper(verifiedObjectId);
                    GetEngagementRequestWrapper getengagementrequestwrapper = new GetEngagementRequestWrapper(verifiedObjectId);
                    RequestBatch requestbatch = new RequestBatch();
                    objectLikesRequest.addToBatch(requestbatch);
                    getengagementrequestwrapper.addToBatch(requestbatch);
                    requestbatch.addCallback(getengagementrequestwrapper. new com.facebook.RequestBatch.Callback() {

                        final _cls8 this$1;
                        final GetEngagementRequestWrapper val$engagementRequest;
                        final GetOGObjectLikesRequestWrapper val$objectLikesRequest;

                        public void onBatchCompleted(RequestBatch requestbatch)
                        {
                            if (objectLikesRequest.error != null || engagementRequest.error != null)
                            {
                                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Unable to refresh like state for id: '%s'", new Object[] {
                                    objectId
                                });
                                return;
                            } else
                            {
                                updateState(objectLikesRequest.objectIsLiked, engagementRequest.likeCountStringWithLike, engagementRequest.likeCountStringWithoutLike, engagementRequest.socialSentenceStringWithLike, engagementRequest.socialSentenceStringWithoutLike, objectLikesRequest.unlikeToken);
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls8;
                objectLikesRequest = getogobjectlikesrequestwrapper;
                engagementRequest = GetEngagementRequestWrapper.this;
                super();
            }
                    });
                    requestbatch.executeAsync();
                }

            
            {
                this$0 = LikeActionController.this;
                super();
            }
            });
            return;
        }
    }

    private void refreshStatusViaService()
    {
        LikeStatusClient likestatusclient = new LikeStatusClient(applicationContext, Settings.getApplicationId(), objectId);
        if (!likestatusclient.start())
        {
            return;
        } else
        {
            likestatusclient.setCompletedListener(new PlatformServiceClient.CompletedListener() {

                final LikeActionController this$0;

                public void completed(Bundle bundle)
                {
                    if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
                    {
                        return;
                    }
                    boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                    String s;
                    String s1;
                    String s2;
                    String s3;
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
                    {
                        s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                    } else
                    {
                        s = likeCountStringWithLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
                    {
                        s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                    } else
                    {
                        s1 = likeCountStringWithoutLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
                    {
                        s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                    } else
                    {
                        s2 = socialSentenceWithLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
                    {
                        s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                    } else
                    {
                        s3 = socialSentenceWithoutLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
                    {
                        bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                    } else
                    {
                        bundle = unlikeToken;
                    }
                    updateState(flag, s, s1, s2, s3, bundle);
                }

            
            {
                this$0 = LikeActionController.this;
                super();
            }
            });
            return;
        }
    }

    private static void registerSessionBroadcastReceivers()
    {
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(applicationContext);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        localbroadcastmanager.registerReceiver(new BroadcastReceiver() {

            public void onReceive(Context context, Intent intent)
            {
                if (LikeActionController.isPendingBroadcastReset)
                {
                    return;
                }
                context = intent.getAction();
                boolean flag;
                if (Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", context) || Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", context))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                LikeActionController.isPendingBroadcastReset = true;
                LikeActionController.handler.postDelayed(flag. new Runnable() {

                    final _cls4 this$0;
                    final boolean val$shouldClearDisk;

                    public void run()
                    {
                        if (shouldClearDisk)
                        {
                            LikeActionController.objectSuffix = (LikeActionController.objectSuffix + 1) % 1000;
                            LikeActionController.applicationContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.objectSuffix).apply();
                            LikeActionController.cache.clear();
                            LikeActionController.controllerDiskCache.clearCache();
                        }
                        LikeActionController.broadcastAction(null, "com.facebook.sdk.LikeActionController.DID_RESET");
                        LikeActionController.isPendingBroadcastReset = false;
                    }

            
            {
                this$0 = final__pcls4;
                shouldClearDisk = Z.this;
                super();
            }
                }, 100L);
            }

        }, intentfilter);
    }

    private static void serializeToDiskAsync(LikeActionController likeactioncontroller)
    {
        String s = serializeToJson(likeactioncontroller);
        likeactioncontroller = getCacheKeyForObjectId(likeactioncontroller.objectId);
        if (!Utility.isNullOrEmpty(s) && !Utility.isNullOrEmpty(likeactioncontroller))
        {
            diskIOWorkQueue.addActiveWorkItem(new SerializeToDiskWorkItem(likeactioncontroller, s));
        }
    }

    private static void serializeToDiskSynchronously(String s, String s1)
    {
        String s2;
        String s3;
        s3 = null;
        s2 = null;
        s = controllerDiskCache.openPutStream(s);
        s2 = s;
        s3 = s;
        s.write(s1.getBytes());
        if (s != null)
        {
            Utility.closeQuietly(s);
        }
_L2:
        return;
        s;
        s3 = s2;
        Log.e(TAG, "Unable to serialize controller to disk", s);
        if (s2 == null) goto _L2; else goto _L1
_L1:
        Utility.closeQuietly(s2);
        return;
        s;
        if (s3 != null)
        {
            Utility.closeQuietly(s3);
        }
        throw s;
    }

    private static String serializeToJson(LikeActionController likeactioncontroller)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("com.facebook.internal.LikeActionController.version", 2);
        jsonobject.put("object_id", likeactioncontroller.objectId);
        jsonobject.put("like_count_string_with_like", likeactioncontroller.likeCountStringWithLike);
        jsonobject.put("like_count_string_without_like", likeactioncontroller.likeCountStringWithoutLike);
        jsonobject.put("social_sentence_with_like", likeactioncontroller.socialSentenceWithLike);
        jsonobject.put("social_sentence_without_like", likeactioncontroller.socialSentenceWithoutLike);
        jsonobject.put("is_object_liked", likeactioncontroller.isObjectLiked);
        jsonobject.put("unlike_token", likeactioncontroller.unlikeToken);
        if (likeactioncontroller.pendingCallId != null)
        {
            jsonobject.put("pending_call_id", likeactioncontroller.pendingCallId.toString());
        }
        if (likeactioncontroller.pendingCallAnalyticsBundle == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        likeactioncontroller = BundleJSONConverter.convertToJSON(likeactioncontroller.pendingCallAnalyticsBundle);
        if (likeactioncontroller != null)
        {
            try
            {
                jsonobject.put("pending_call_analytics_bundle", likeactioncontroller);
            }
            // Misplaced declaration of an exception variable
            catch (LikeActionController likeactioncontroller)
            {
                Log.e(TAG, "Unable to serialize controller to JSON", likeactioncontroller);
                return null;
            }
        }
        return jsonobject.toString();
    }

    private void stopTrackingPendingCall()
    {
        PendingCallStore.getInstance().stopTrackingPendingCall(pendingCallId);
        pendingCallId = null;
        pendingCallAnalyticsBundle = null;
        storeObjectIdForPendingController(null);
    }

    private void storeObjectIdForPendingController(String s)
    {
        objectIdForPendingController = s;
        applicationContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
    }

    private void trackPendingCall(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Bundle bundle)
    {
        PendingCallStore.getInstance().trackPendingCall(pendingcall);
        pendingCallId = pendingcall.getCallId();
        storeObjectIdForPendingController(objectId);
        pendingCallAnalyticsBundle = bundle;
        serializeToDiskAsync(this);
    }

    private void updateLikeState(boolean flag)
    {
        updateState(flag, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceWithLike, socialSentenceWithoutLike, unlikeToken);
    }

    private void updateState(boolean flag, String s, String s1, String s2, String s3, String s4)
    {
        s = Utility.coerceValueIfNullOrEmpty(s, null);
        s1 = Utility.coerceValueIfNullOrEmpty(s1, null);
        s2 = Utility.coerceValueIfNullOrEmpty(s2, null);
        s3 = Utility.coerceValueIfNullOrEmpty(s3, null);
        s4 = Utility.coerceValueIfNullOrEmpty(s4, null);
        boolean flag1;
        if (flag != isObjectLiked || !Utility.areObjectsEqual(s, likeCountStringWithLike) || !Utility.areObjectsEqual(s1, likeCountStringWithoutLike) || !Utility.areObjectsEqual(s2, socialSentenceWithLike) || !Utility.areObjectsEqual(s3, socialSentenceWithoutLike) || !Utility.areObjectsEqual(s4, unlikeToken))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return;
        } else
        {
            isObjectLiked = flag;
            likeCountStringWithLike = s;
            likeCountStringWithoutLike = s1;
            socialSentenceWithLike = s2;
            socialSentenceWithoutLike = s3;
            unlikeToken = s4;
            serializeToDiskAsync(this);
            broadcastAction(this, "com.facebook.sdk.LikeActionController.UPDATED");
            return;
        }
    }

    public String getLikeCountString()
    {
        if (isObjectLiked)
        {
            return likeCountStringWithLike;
        } else
        {
            return likeCountStringWithoutLike;
        }
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getSocialSentence()
    {
        if (isObjectLiked)
        {
            return socialSentenceWithLike;
        } else
        {
            return socialSentenceWithoutLike;
        }
    }

    public boolean isObjectLiked()
    {
        return isObjectLiked;
    }

    public void toggleLike(Activity activity, Fragment fragment, Bundle bundle)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        appEventsLogger.logSdkEvent("fb_like_control_did_tap", null, bundle);
        if (!isObjectLiked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!canUseOGPublish())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        updateLikeState(flag);
        if (!isPendingLikeOrUnlike) goto _L2; else goto _L1
_L1:
        appEventsLogger.logSdkEvent("fb_like_control_did_undo_quickly", null, bundle);
_L4:
        return;
_L2:
        if (publishLikeOrUnlikeAsync(flag, bundle)) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        updateLikeState(flag);
        presentLikeDialog(activity, fragment, bundle);
        return;
        presentLikeDialog(activity, fragment, bundle);
        return;
    }









/*
    static String access$1302(LikeActionController likeactioncontroller, String s)
    {
        likeactioncontroller.unlikeToken = s;
        return s;
    }

*/








/*
    static String access$1902(LikeActionController likeactioncontroller, String s)
    {
        likeactioncontroller.verifiedObjectId = s;
        return s;
    }

*/



/*
    static boolean access$2002(LikeActionController likeactioncontroller, boolean flag)
    {
        likeactioncontroller.isPendingLikeOrUnlike = flag;
        return flag;
    }

*/


/*
    static boolean access$202(boolean flag)
    {
        isPendingBroadcastReset = flag;
        return flag;
    }

*/



/*
    static boolean access$2202(LikeActionController likeactioncontroller, boolean flag)
    {
        likeactioncontroller.isObjectLikedOnServer = flag;
        return flag;
    }

*/




/*
    static boolean access$2502(LikeActionController likeactioncontroller, boolean flag)
    {
        likeactioncontroller.objectIsPage = flag;
        return flag;
    }

*/








/*
    static int access$302(int i)
    {
        objectSuffix = i;
        return i;
    }

*/






}
