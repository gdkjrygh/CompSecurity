// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import com.spotify.mobile.android.connect.ConnectManager;

public abstract class fpk extends fou
    implements dlb, dwk
{

    public fpk()
    {
    }

    public void a(float f)
    {
    }

    public final void a(Object obj)
    {
        ((ConnectManager)f.f()).a(this);
    }

    public final void b()
    {
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (!f.c() || ((ConnectManager)f.f()).i() || ((ConnectManager)f.f()).d() == null)
        {
            return super.onKeyDown(i, keyevent);
        }
        switch (i)
        {
        default:
            return super.onKeyDown(i, keyevent);

        case 24: // '\030'
            return ((ConnectManager)f.f()).k();

        case 25: // '\031'
            return ((ConnectManager)f.f()).l();
        }
    }

    public void onStart()
    {
        f.a(this);
        super.onStart();
    }

    public void onStop()
    {
        f.b(this);
        if (f.c())
        {
            ((ConnectManager)f.f()).b(this);
        }
        super.onStop();
    }
}
