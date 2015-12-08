// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            NumericKeyboard, KeyboardImageButton

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (NumericKeyboard)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, NumericKeyboard numerickeyboard, Object obj)
    {
        numerickeyboard.delButton = (KeyboardImageButton)viewinjector.on((View)viewinjector.on(obj, 0x7f0d0252, "field 'delButton'"), 0x7f0d0252, "field 'delButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((NumericKeyboard)obj);
    }

    public void reset(NumericKeyboard numerickeyboard)
    {
        numerickeyboard.delButton = null;
    }

    public ()
    {
    }
}
