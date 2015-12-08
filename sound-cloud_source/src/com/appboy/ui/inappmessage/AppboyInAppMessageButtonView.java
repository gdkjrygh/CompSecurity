// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.appboy.d;

public class AppboyInAppMessageButtonView extends Button
{

    private static final String a;

    public AppboyInAppMessageButtonView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        String s;
        int i;
        try
        {
            attributeset = context.obtainStyledAttributes(attributeset, com.appboy.ui.n.f.com_appboy_ui_inappmessage_AppboyInAppMessageButtonView);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        i = 0;
        if (i >= attributeset.getIndexCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if (attributeset.getIndex(i) != com.appboy.ui.n.f.com_appboy_ui_inappmessage_AppboyInAppMessageButtonView_appboyInAppMessageCustomFontFile)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s = attributeset.getString(i);
        try
        {
            setTypeface(Typeface.createFromAsset(context.getAssets(), s));
        }
        catch (Exception exception) { }
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        attributeset.recycle();
        return;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/inappmessage/AppboyInAppMessageButtonView.getName()
        });
    }
}
