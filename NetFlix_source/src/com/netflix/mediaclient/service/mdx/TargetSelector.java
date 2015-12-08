// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;

public class TargetSelector
{
    public static interface TargetSelectorInterface
    {

        public abstract void onStickinessExpired();

        public abstract void onTargetSelectorLoaded(String s, String s1, String s2, String s3);
    }


    private static final int MSG_NEW_TARGET_SELECTED = 2;
    private static final int MSG_STICKINESS_TIMEOUT = 1;
    private static final int MSG_TARGET_LASTSEEN_ACTIVE = 3;
    private static final int MSG_TARGET_UPDATE_SELECTED = 4;
    private static final String TAG = "nf_mdxTargetSelector";
    private static final long TARGET_STICKINESS_WINDOW = 0xc042c0L;
    private TargetSelectorInterface mCallback;
    private Context mContext;
    private String mCurrentTarget;
    private Handler mHandler;
    private String mTaregtUuid;
    private String mTargetDialUuid;
    private String mTargetFriendlyName;

    public TargetSelector(Context context, TargetSelectorInterface targetselectorinterface)
    {
        mContext = context;
        mCallback = targetselectorinterface;
        mHandler = new Handler() {

            final TargetSelector this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    Log.e("nf_mdxTargetSelector", "TragetSelector: unknown message");
                    return;

                case 1: // '\001'
                    Log.d("nf_mdxTargetSelector", "TragetSelector: target stickiness expired");
                    PreferenceUtils.putLongPref(mContext, "mdx_target_lastactive", System.currentTimeMillis());
                    PreferenceUtils.putStringPref(mContext, "mdx_target_uuid", new String());
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_uuid", new String());
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_dialuuid", new String());
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_fname", new String());
                    mCallback.onStickinessExpired();
                    return;

                case 2: // '\002'
                    if (Log.isLoggable("nf_mdxTargetSelector", 3))
                    {
                        Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: new target is selected ").append(mCurrentTarget).toString());
                    }
                    PreferenceUtils.putLongPref(mContext, "mdx_target_lastactive", System.currentTimeMillis());
                    // fall through

                case 4: // '\004'
                    if (Log.isLoggable("nf_mdxTargetSelector", 3))
                    {
                        Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: upadte selected target ").append(mCurrentTarget).append(" : ").append(mTaregtUuid).append(" : ").append(mTargetDialUuid).append(" : ").append(mTargetFriendlyName).toString());
                    }
                    PreferenceUtils.putStringPref(mContext, "mdx_target_uuid", mCurrentTarget);
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_uuid", mTaregtUuid);
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_dialuuid", mTargetDialUuid);
                    PreferenceUtils.putStringPref(mContext, "mdx_selected_fname", mTargetFriendlyName);
                    return;

                case 3: // '\003'
                    PreferenceUtils.putLongPref(mContext, "mdx_target_lastactive", System.currentTimeMillis());
                    return;
                }
            }

            
            {
                this$0 = TargetSelector.this;
                super();
            }
        };
        long l = PreferenceUtils.getLongPref(mContext, "mdx_target_lastactive", 0L);
        l = System.currentTimeMillis() - l;
        if (l > 0xc042c0L)
        {
            mCurrentTarget = new String();
        } else
        {
            mCurrentTarget = PreferenceUtils.getStringPref(mContext, "mdx_target_uuid", new String());
            mTaregtUuid = PreferenceUtils.getStringPref(mContext, "mdx_selected_uuid", new String());
            mTargetDialUuid = PreferenceUtils.getStringPref(mContext, "mdx_selected_dialuuid", new String());
            mTargetFriendlyName = PreferenceUtils.getStringPref(mContext, "mdx_selected_fname", new String());
            startCountDown(0xc042c0L - l);
        }
        mCallback.onTargetSelectorLoaded(mCurrentTarget, mTaregtUuid, mTargetDialUuid, mTargetFriendlyName);
        if (Log.isLoggable("nf_mdxTargetSelector", 3))
        {
            Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: init complete.  mCurrentTarget is ").append(mCurrentTarget).append(" : ").append(mTaregtUuid).append(" : ").append(mTargetDialUuid).append(" : ").append(mTargetFriendlyName).toString());
        }
    }

    private void startCountDown(long l)
    {
        Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: startCountDown ").append(l).toString());
        mHandler.removeMessages(1);
        mHandler.sendEmptyMessageDelayed(1, l);
    }

    public String getCurrentTarget()
    {
        return mCurrentTarget;
    }

    public void selectNewTarget(String s, String s1, String s2, String s3)
    {
        mCurrentTarget = s;
        mTaregtUuid = s1;
        mTargetDialUuid = s2;
        mTargetFriendlyName = s3;
        mHandler.sendEmptyMessage(2);
        if (StringUtils.isEmpty(s))
        {
            mHandler.removeMessages(1);
            return;
        } else
        {
            startCountDown(0xc042c0L);
            return;
        }
    }

    public void targetBecomeActive(String s)
    {
        mHandler.sendEmptyMessage(3);
        mHandler.removeMessages(1);
    }

    public void targetBecomeInactive(String s)
    {
        mHandler.sendEmptyMessage(3);
        startCountDown(0xc042c0L);
    }

    public void updateSelectedTarget(String s, String s1, String s2, String s3)
    {
        mCurrentTarget = s;
        mTaregtUuid = s1;
        mTargetDialUuid = s2;
        mTargetFriendlyName = s3;
        mHandler.sendEmptyMessage(4);
    }






}
