// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector,  , Object obj)
    {
        . = (EditText)ector.ail((View)ector.ail(obj, 0x7f0e022a, "field 'updateEmail'"), 0x7f0e022a, "field 'updateEmail'");
        . = (Button)ector.ttonOk((View)ector.ttonOk(obj, 0x7f0e022c, "field 'dialogButtonOk'"), 0x7f0e022c, "field 'dialogButtonOk'");
        .ncel = (Button)ector.ttonCancel((View)ector.ttonCancel(obj, 0x7f0e022e, "field 'dialogButtonCancel'"), 0x7f0e022e, "field 'dialogButtonCancel'");
        .ncel = (TextView)ector.ext((View)ector.ext(obj, 0x7f0e0229, "field 'mDialogText'"), 0x7f0e0229, "field 'mDialogText'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1. = null;
        inject1.ncel = null;
        inject1.ncel = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
