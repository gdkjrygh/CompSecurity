// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.Settings;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

public class FacebookDialog
{

    public static final String COMPLETION_GESTURE_CANCEL = "cancel";
    private static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
    private static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
    private static final String EXTRA_DIALOG_COMPLETION_ID_KEY = "com.facebook.platform.extra.POST_ID";
    public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
    public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
    public static final String RESULT_ARGS_DIALOG_COMPLETION_ID_KEY = "postId";
    private static NativeAppCallAttachmentStore attachmentStore;
    private Activity activity;
    private PendingCall appCall;
    private Fragment fragment;
    private OnPresentCallback onPresentCallback;

    private FacebookDialog(Activity activity1, Fragment fragment1, PendingCall pendingcall, OnPresentCallback onpresentcallback)
    {
        activity = activity1;
        fragment = fragment1;
        appCall = pendingcall;
        onPresentCallback = onpresentcallback;
    }

    FacebookDialog(Activity activity1, Fragment fragment1, PendingCall pendingcall, OnPresentCallback onpresentcallback, _cls1 _pcls1)
    {
        this(activity1, fragment1, pendingcall, onpresentcallback);
    }

    public static transient boolean canPresentMessageDialog(Context context, MessageDialogFeature amessagedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(MessageDialogFeature.MESSAGE_DIALOG, amessagedialogfeature));
    }

    public static transient boolean canPresentOpenGraphActionDialog(Context context, OpenGraphActionDialogFeature aopengraphactiondialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(OpenGraphActionDialogFeature.OG_ACTION_DIALOG, aopengraphactiondialogfeature));
    }

    public static transient boolean canPresentOpenGraphMessageDialog(Context context, OpenGraphMessageDialogFeature aopengraphmessagedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG, aopengraphmessagedialogfeature));
    }

    public static transient boolean canPresentShareDialog(Context context, ShareDialogFeature asharedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(ShareDialogFeature.SHARE_DIALOG, asharedialogfeature));
    }

    private static String getActionForFeatures(Iterable iterable)
    {
        Object obj = null;
        Iterator iterator = iterable.iterator();
        iterable = obj;
        if (iterator.hasNext())
        {
            iterable = ((DialogFeature)iterator.next()).getAction();
        }
        return iterable;
    }

    private static NativeAppCallAttachmentStore getAttachmentStore()
    {
        if (attachmentStore == null)
        {
            attachmentStore = new NativeAppCallAttachmentStore();
        }
        return attachmentStore;
    }

    private static String getEventName(Intent intent)
    {
        boolean flag2 = true;
        String s = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        boolean flag1 = intent.hasExtra("com.facebook.platform.extra.PHOTOS");
        Object obj = intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        boolean flag;
        if (obj != null)
        {
            intent = ((Bundle) (obj)).getStringArrayList("PHOTOS");
            obj = ((Bundle) (obj)).getString("VIDEO");
            flag = flag1;
            if (intent != null)
            {
                flag = flag1;
                if (!intent.isEmpty())
                {
                    flag = true;
                }
            }
            if (obj != null && !((String) (obj)).isEmpty())
            {
                flag1 = flag;
                flag = flag2;
            } else
            {
                boolean flag3 = false;
                flag1 = flag;
                flag = flag3;
            }
        } else
        {
            flag = false;
        }
        return getEventName(s, flag1, flag);
    }

    private static String getEventName(String s, boolean flag, boolean flag1)
    {
        if (s.equals("com.facebook.platform.action.request.FEED_DIALOG"))
        {
            if (flag1)
            {
                return "fb_dialogs_present_share_video";
            }
            if (flag)
            {
                return "fb_dialogs_present_share_photo";
            } else
            {
                return "fb_dialogs_present_share";
            }
        }
        if (s.equals("com.facebook.platform.action.request.MESSAGE_DIALOG"))
        {
            if (flag)
            {
                return "fb_dialogs_present_message_photo";
            } else
            {
                return "fb_dialogs_present_message";
            }
        }
        if (s.equals("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_share_og";
        }
        if (s.equals("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_message_og";
        }
        if (s.equals("com.facebook.platform.action.request.LIKE_DIALOG"))
        {
            return "fb_dialogs_present_like";
        } else
        {
            throw new FacebookException("An unspecified action was presented");
        }
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

    public static String getNativeDialogPostId(Bundle bundle)
    {
        if (bundle.containsKey("postId"))
        {
            return bundle.getString("postId");
        } else
        {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        }
    }

    private static int getProtocolVersionForNativeDialog(Context context, String s, int ai[])
    {
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(context, s, ai);
    }

    private static int[] getVersionSpecForFeature(String s, String s1, DialogFeature dialogfeature)
    {
        s = Utility.getDialogFeatureConfig(s, s1, dialogfeature.name());
        if (s != null)
        {
            return s.getVersionSpec();
        } else
        {
            return (new int[] {
                dialogfeature.getMinVersion()
            });
        }
    }

    private static int[] getVersionSpecForFeatures(String s, String s1, Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        for (iterable = null; iterator.hasNext(); iterable = Utility.intersectRanges(iterable, getVersionSpecForFeature(s, s1, (DialogFeature)iterator.next()))) { }
        return iterable;
    }

    public static boolean handleActivityResult(Context context, PendingCall pendingcall, int i, Intent intent, Callback callback)
    {
        if (i != pendingcall.getRequestCode())
        {
            return false;
        }
        if (attachmentStore != null)
        {
            attachmentStore.cleanupAttachmentsForCall(context, pendingcall.getCallId());
        }
        if (callback != null)
        {
            if (NativeProtocol.isErrorResult(intent))
            {
                context = NativeProtocol.getErrorDataFromResultIntent(intent);
                callback.onError(pendingcall, NativeProtocol.getExceptionFromErrorData(context), context);
            } else
            {
                callback.onComplete(pendingcall, NativeProtocol.getSuccessResultsFromIntent(intent));
            }
        }
        return true;
    }

    private static boolean handleCanPresent(Context context, Iterable iterable)
    {
        String s2 = getActionForFeatures(iterable);
        String s1 = Settings.getApplicationId();
        String s = s1;
        if (Utility.isNullOrEmpty(s1))
        {
            s = Utility.getMetadataApplicationId(context);
        }
        return getProtocolVersionForNativeDialog(context, s2, getVersionSpecForFeatures(s, s2, iterable)) != -1;
    }

    private static void logDialogActivity(Activity activity1, Fragment fragment1, String s, String s1)
    {
        if (fragment1 != null)
        {
            activity1 = fragment1.getActivity();
        }
        activity1 = AppEventsLogger.newLogger(activity1);
        fragment1 = new Bundle();
        fragment1.putString("fb_dialog_outcome", s1);
        activity1.logSdkEvent(s, null, fragment1);
    }

    public PendingCall present()
    {
        logDialogActivity(activity, fragment, getEventName(appCall.getRequestIntent()), "Completed");
        if (onPresentCallback != null)
        {
            try
            {
                onPresentCallback.onPresent(activity);
            }
            catch (Exception exception)
            {
                throw new FacebookException(exception);
            }
        }
        if (fragment != null)
        {
            fragment.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        } else
        {
            activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        }
        return appCall;
    }








    private class MessageDialogFeature extends Enum
        implements DialogFeature
    {

        private static final MessageDialogFeature $VALUES[];
        public static final MessageDialogFeature MESSAGE_DIALOG;
        public static final MessageDialogFeature PHOTOS;
        public static final MessageDialogFeature VIDEO;
        private int minVersion;

        public static MessageDialogFeature valueOf(String s)
        {
            return (MessageDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$MessageDialogFeature, s);
        }

        public static MessageDialogFeature[] values()
        {
            return (MessageDialogFeature[])$VALUES.clone();
        }

        public final String getAction()
        {
            return "com.facebook.platform.action.request.MESSAGE_DIALOG";
        }

        public final int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            MESSAGE_DIALOG = new MessageDialogFeature("MESSAGE_DIALOG", 0, 0x13350ac);
            PHOTOS = new MessageDialogFeature("PHOTOS", 1, 0x1335124);
            VIDEO = new MessageDialogFeature("VIDEO", 2, 0x13354a2);
            $VALUES = (new MessageDialogFeature[] {
                MESSAGE_DIALOG, PHOTOS, VIDEO
            });
        }

        private MessageDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }


    private class OpenGraphActionDialogFeature extends Enum
        implements DialogFeature
    {

        private static final OpenGraphActionDialogFeature $VALUES[];
        public static final OpenGraphActionDialogFeature OG_ACTION_DIALOG;
        private int minVersion;

        public static OpenGraphActionDialogFeature valueOf(String s)
        {
            return (OpenGraphActionDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature, s);
        }

        public static OpenGraphActionDialogFeature[] values()
        {
            return (OpenGraphActionDialogFeature[])$VALUES.clone();
        }

        public final String getAction()
        {
            return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
        }

        public final int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            OG_ACTION_DIALOG = new OpenGraphActionDialogFeature("OG_ACTION_DIALOG", 0, 0x1332b3a);
            $VALUES = (new OpenGraphActionDialogFeature[] {
                OG_ACTION_DIALOG
            });
        }

        private OpenGraphActionDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }


    private class OpenGraphMessageDialogFeature extends Enum
        implements DialogFeature
    {

        private static final OpenGraphMessageDialogFeature $VALUES[];
        public static final OpenGraphMessageDialogFeature OG_MESSAGE_DIALOG;
        private int minVersion;

        public static OpenGraphMessageDialogFeature valueOf(String s)
        {
            return (OpenGraphMessageDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature, s);
        }

        public static OpenGraphMessageDialogFeature[] values()
        {
            return (OpenGraphMessageDialogFeature[])$VALUES.clone();
        }

        public final String getAction()
        {
            return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
        }

        public final int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            OG_MESSAGE_DIALOG = new OpenGraphMessageDialogFeature("OG_MESSAGE_DIALOG", 0, 0x13350ac);
            $VALUES = (new OpenGraphMessageDialogFeature[] {
                OG_MESSAGE_DIALOG
            });
        }

        private OpenGraphMessageDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }


    private class ShareDialogFeature extends Enum
        implements DialogFeature
    {

        private static final ShareDialogFeature $VALUES[];
        public static final ShareDialogFeature PHOTOS;
        public static final ShareDialogFeature SHARE_DIALOG;
        public static final ShareDialogFeature VIDEO;
        private int minVersion;

        public static ShareDialogFeature valueOf(String s)
        {
            return (ShareDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$ShareDialogFeature, s);
        }

        public static ShareDialogFeature[] values()
        {
            return (ShareDialogFeature[])$VALUES.clone();
        }

        public final String getAction()
        {
            return "com.facebook.platform.action.request.FEED_DIALOG";
        }

        public final int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            SHARE_DIALOG = new ShareDialogFeature("SHARE_DIALOG", 0, 0x1332b3a);
            PHOTOS = new ShareDialogFeature("PHOTOS", 1, 0x13350ac);
            VIDEO = new ShareDialogFeature("VIDEO", 2, 0x13353e4);
            $VALUES = (new ShareDialogFeature[] {
                SHARE_DIALOG, PHOTOS, VIDEO
            });
        }

        private ShareDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }


    private class DialogFeature
    {

        public abstract String getAction();

        public abstract int getMinVersion();

        public abstract String name();
    }


    private class PendingCall
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private UUID callId;
        private int requestCode;
        private Intent requestIntent;

        private void setRequestCode(int i)
        {
            requestCode = i;
        }

        private void setRequestIntent(Intent intent)
        {
            requestIntent = intent;
        }

        public int describeContents()
        {
            return 0;
        }

        public UUID getCallId()
        {
            return callId;
        }

        public int getRequestCode()
        {
            return requestCode;
        }

        public Intent getRequestIntent()
        {
            return requestIntent;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(callId.toString());
            parcel.writeParcelable(requestIntent, 0);
            parcel.writeInt(requestCode);
        }




        public PendingCall(int i)
        {
            callId = UUID.randomUUID();
            requestCode = i;
        }

        private PendingCall(Parcel parcel)
        {
            callId = UUID.fromString(parcel.readString());
            requestIntent = (Intent)parcel.readParcelable(null);
            requestCode = parcel.readInt();
        }

        PendingCall(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final PendingCall createFromParcel(Parcel parcel)
            {
                return new PendingCall(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final PendingCall[] newArray(int i)
            {
                return new PendingCall[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }


    private class Callback
    {

        public abstract void onComplete(PendingCall pendingcall, Bundle bundle);

        public abstract void onError(PendingCall pendingcall, Exception exception, Bundle bundle);
    }


    private class OnPresentCallback
    {

        public abstract void onPresent(Context context);
    }

}
