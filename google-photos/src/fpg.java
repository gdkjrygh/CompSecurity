// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public final class fpg
    implements nug, omb, ooa, oob, opl, ops, opt, opu, opv
{

    private final Activity a;
    private final int b;
    private fpj c;
    private boolean d;

    public fpg(Activity activity, opd opd1, int i)
    {
        a = activity;
        b = i;
        opd1.a(this);
    }

    private void a(Rect rect)
    {
        if (d)
        {
            a.getWindow().getDecorView().setPadding(rect.left, 0, rect.right, 0);
            a.findViewById(b).setPadding(0, 0, 0, 0);
            return;
        } else
        {
            a.getWindow().getDecorView().setPadding(0, 0, 0, 0);
            a.findViewById(b).setPadding(rect.left, 0, rect.right, 0);
            return;
        }
    }

    public final void V_()
    {
        c.d.a(this);
    }

    public final void X_()
    {
        c.d.a(this, true);
    }

    public final void a()
    {
        d = false;
        a(c.a);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (fpj)olm1.a(fpj);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBoolean("com.google.android.apps.photos.insetview.ActionModeWindowInsetsMixin.in_action_mode");
        }
    }

    public final void b_(Object obj)
    {
        a(((fpj)obj).a);
    }

    public final void c()
    {
        d = true;
        a(c.a);
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.apps.photos.insetview.ActionModeWindowInsetsMixin.in_action_mode", d);
    }
}
