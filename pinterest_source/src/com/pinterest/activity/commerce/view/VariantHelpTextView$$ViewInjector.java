// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            VariantHelpTextView

public class 
{

    public static void inject(butterknife.lpTextView lptextview, VariantHelpTextView varianthelptextview, Object obj)
    {
        varianthelptextview._helpText = (TextView)lptextview._helpText(obj, 0x7f0f044d, "field '_helpText'");
    }

    public static void reset(VariantHelpTextView varianthelptextview)
    {
        varianthelptextview._helpText = null;
    }

    public ()
    {
    }
}
