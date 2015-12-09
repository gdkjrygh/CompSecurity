// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;

public final class dfi extends Dialog
{

    private Button a;

    protected dfi(Context context, int i)
    {
        super(context, i);
    }

    static Button a(dfi dfi1, Button button)
    {
        dfi1.a = button;
        return button;
    }

    public final Button a()
    {
        return a;
    }
}
