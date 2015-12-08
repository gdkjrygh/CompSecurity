// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.appboy.f;
import com.appboy.ui.v;

public class AppboyInAppMessageTextView extends TextView
{

    private static final String a;

    public AppboyInAppMessageTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        String s;
        Exception exception;
        int i;
        try
        {
            attributeset = context.obtainStyledAttributes(attributeset, v.c);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(a, "Error while checking for custom typeface.", context);
            return;
        }
        i = 0;
        if (i >= attributeset.getIndexCount())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (attributeset.getIndex(i) != v.d)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s = attributeset.getString(i);
        setTypeface(Typeface.createFromAsset(context.getAssets(), s));
_L1:
        i++;
        break MISSING_BLOCK_LABEL_18;
        exception;
        Log.w(a, (new StringBuilder("Error loading custom typeface from: ")).append(s).toString(), exception);
          goto _L1
        attributeset.recycle();
        return;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/inappmessage/AppboyInAppMessageTextView.getName()
        });
    }
}
