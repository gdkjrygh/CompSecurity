// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;

public final class fny
{

    public final boolean a;
    public final qp b;
    public final DrawerLayout c;

    public fny(rf rf1, DrawerLayout drawerlayout)
    {
        c = drawerlayout;
        a = dgn.a(rf1);
        if (a)
        {
            b = new qp(rf1, drawerlayout);
            return;
        } else
        {
            b = null;
            rf1.f().g();
            return;
        }
    }
}
