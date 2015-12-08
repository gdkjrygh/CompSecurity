// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;

final class lang.Object
    implements android.view.OnClickListener
{

    private HX a;

    public final void onClick(View view)
    {
        a.m.toggle();
    }

    >(HX hx)
    {
        a = hx;
        super();
    }
}
