// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.ui.ActionBarManager;

public final class foa
    implements fnz
{

    private ActionBarManager a;

    public foa(ActionBarManager actionbarmanager)
    {
        a = actionbarmanager;
        super();
    }

    public final void a(float f)
    {
        a.a(f);
    }

    public final void a(boolean flag)
    {
        int j = com.spotify.mobile.android.ui.ActionBarManager.State.a(com.spotify.mobile.android.ui.ActionBarManager.State.b);
        int i = j;
        if (flag)
        {
            i = (int)((float)j * a.h);
        }
        a.c.setAlpha(i);
    }
}
