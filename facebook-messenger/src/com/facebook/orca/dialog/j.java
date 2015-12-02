// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.os.Parcelable;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.orca.dialog:
//            MenuDialogParams, MenuDialogItem

public class j
{

    private int a;
    private String b;
    private List c;
    private Parcelable d;

    public j()
    {
        c = hq.a();
    }

    public int a()
    {
        return a;
    }

    public j a(int i)
    {
        a = i;
        return this;
    }

    public j a(Parcelable parcelable)
    {
        d = parcelable;
        return this;
    }

    public j a(MenuDialogItem menudialogitem)
    {
        c.add(menudialogitem);
        return this;
    }

    public String b()
    {
        return b;
    }

    public List c()
    {
        return c;
    }

    public Parcelable d()
    {
        return d;
    }

    public MenuDialogParams e()
    {
        return new MenuDialogParams(this);
    }
}
