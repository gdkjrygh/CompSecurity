// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import LJ;
import Ls;
import S;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import com.snapchat.android.SnapchatActivity;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.SnapMediaUtils;
import java.util.List;

// Referenced classes of package com.snapchat.android.util.debug:
//            ReleaseManager

public class BugReportActivity extends SnapchatActivity
    implements S.b, BugReportRemoteLogListFragment.a
{

    private String mRemoteLogFriendName;

    public BugReportActivity()
    {
    }

    public final void a()
    {
        if (super.mFragments.e() > 0)
        {
            Fragment fragment = (Fragment)super.mFragments.f().get(0);
            if (fragment instanceof BugReportRemoteLogListFragment.a)
            {
                ((BugReportRemoteLogListFragment.a)fragment).b(mRemoteLogFriendName);
            }
        }
    }

    public final void b(String s)
    {
        mRemoteLogFriendName = s;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 1001 && j == -1)
            {
                intent = SnapMediaUtils.a(intent.getData(), this);
                if (intent != null)
                {
                    break label0;
                }
                AlertDialogUtils.a(0x7f0801fc, this);
            }
            return;
        }
        Ls.a(this, intent);
        ((ImageView)findViewById(0x7f0d00a1)).setImageBitmap(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040010);
        if (!ReleaseManager.f())
        {
            throw new SecurityException("Someone directly hacked and called  an activity they are not supposed to!");
        } else
        {
            super.mFragments.a(this);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        mShakeReporter.a();
    }
}
