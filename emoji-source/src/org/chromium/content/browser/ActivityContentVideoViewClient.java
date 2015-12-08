// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

// Referenced classes of package org.chromium.content.browser:
//            ContentVideoViewClient

public class ActivityContentVideoViewClient
    implements ContentVideoViewClient
{

    private final Activity mActivity;
    private View mView;

    public ActivityContentVideoViewClient(Activity activity)
    {
        mActivity = activity;
    }

    private void setSystemUiVisibility(View view, boolean flag)
    {
        if (flag)
        {
            mActivity.getWindow().setFlags(1024, 1024);
        } else
        {
            mActivity.getWindow().clearFlags(1024);
        }
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return;
        }
        int i = view.getSystemUiVisibility();
        if (flag)
        {
            i |= 0x1606;
        } else
        {
            i &= 0xffffe9f9;
        }
        view.setSystemUiVisibility(i);
    }

    public View getVideoLoadingProgressView()
    {
        return null;
    }

    public void onDestroyContentVideoView()
    {
        FrameLayout framelayout = (FrameLayout)mActivity.getWindow().getDecorView();
        framelayout.removeView(mView);
        setSystemUiVisibility(framelayout, false);
        mView = null;
    }

    public boolean onShowCustomView(View view)
    {
        FrameLayout framelayout = (FrameLayout)mActivity.getWindow().getDecorView();
        framelayout.addView(view, 0, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        setSystemUiVisibility(framelayout, true);
        mView = view;
        return true;
    }
}
