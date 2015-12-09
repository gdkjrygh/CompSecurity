// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.ui.activity.RemotePlaybackActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.DialogPresenter;

public final class fzg extends fze
    implements dwk
{

    private boolean Z;
    private dwh a;
    private int aa;
    private Intent ab;
    private fzh ac;
    private boolean b;

    public fzg()
    {
        aa = -1;
        ac = new fzh(this, this);
    }

    public static fzg a(Flags flags)
    {
        fzg fzg1 = new fzg();
        fyw.a(fzg1, flags);
        return fzg1;
    }

    static void a(fzg fzg1, ConnectDevice connectdevice)
    {
        boolean flag = false;
        if (connectdevice != null)
        {
            ctz.a(connectdevice);
            ctz.a(connectdevice.b);
            if (!connectdevice.f && !connectdevice.n)
            {
                flag = true;
            }
            if (flag)
            {
                fzg1.ab = RemotePlaybackActivity.a(fzg1.k(), connectdevice);
                if (fzg1.Y != null && !fzg1.Z)
                {
                    fzg1.Z = true;
                    fzg1.Y.a(fzg1);
                }
            }
        }
    }

    static boolean a(fzg fzg1)
    {
        return fzg1.b;
    }

    static dwh b(fzg fzg1)
    {
        return fzg1.a;
    }

    protected final void F()
    {
        aa = Y.b(this);
    }

    public final void a()
    {
        if (ab != null && aa > 0)
        {
            a(ab, aa);
        }
    }

    public final void a(int i, int j, Intent intent)
    {
        if (aa > 0)
        {
            super.a(i, j, intent);
        }
        Z = false;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            Z = bundle.getBoolean("dialog_queued", false);
            aa = bundle.getInt("dialog_request_code", -1);
        }
    }

    public final void a(Object obj)
    {
        b = true;
        ((ConnectManager)a.f()).a(ac);
    }

    public final void b()
    {
        b = false;
    }

    public final void c()
    {
        super.c();
        a = new dwh(k().getApplicationContext());
        a.a(this);
        a.a();
    }

    public final void d()
    {
        super.d();
        a.b(this);
        if (a.c())
        {
            ((ConnectManager)a.f()).b(ac);
            a.b();
        }
        a = null;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", Z);
        bundle.putInt("dialog_request_code", aa);
    }
}
