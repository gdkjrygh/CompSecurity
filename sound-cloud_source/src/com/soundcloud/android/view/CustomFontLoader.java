// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.soundcloud.android.SoundCloudApplication;
import java.lang.ref.SoftReference;
import java.util.Hashtable;
import java.util.Map;

public final class CustomFontLoader
{

    private static final Map fontCache = new Hashtable();

    private CustomFontLoader()
    {
    }

    public static void applyCustomFont(Context context, TextView textview, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.CustomFontTextView);
        String s = attributeset.getString(0);
        if (s != null)
        {
            textview.setTypeface(getFont(context, s));
            textview.setPaintFlags(textview.getPaintFlags() | 0x80);
        }
        attributeset.recycle();
    }

    public static Typeface getFont(Context context, String s)
    {
        Map map = fontCache;
        map;
        JVM INSTR monitorenter ;
        Object obj = (SoftReference)fontCache.get(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (Typeface)((SoftReference) (obj)).get();
_L5:
        Typeface typeface;
        typeface = ((Typeface) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        typeface = Typeface.createFromAsset(context.getAssets(), s);
        obj = typeface;
        fontCache.put(s, new SoftReference(typeface));
_L3:
        map;
        JVM INSTR monitorexit ;
        return typeface;
        context;
        context = SoundCloudApplication.TAG;
        typeface = ((Typeface) (obj));
          goto _L3
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
