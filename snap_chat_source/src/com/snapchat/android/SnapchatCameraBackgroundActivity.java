// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import S;
import V;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.FrameLayout;
import com.snapchat.android.camera.BackgroundCameraFragment;

// Referenced classes of package com.snapchat.android:
//            SnapchatActivity

public abstract class SnapchatCameraBackgroundActivity extends SnapchatActivity
{

    private BackgroundCameraFragment a;

    public SnapchatCameraBackgroundActivity()
    {
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void c()
    {
        super.setContentView(0x7f04009b);
        FrameLayout framelayout = (FrameLayout)findViewById(0x7f0d032b);
        a = new BackgroundCameraFragment();
        super.mFragments.a().a(framelayout.getId(), a).a();
        getWindow().setBackgroundDrawable(null);
    }
}
