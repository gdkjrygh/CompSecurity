// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.HashMap;

public final class dgd
{

    private static HashMap a = new HashMap();
    private static final int b[] = {
        0x1010034, 0x7f0100d5
    };

    private dgd()
    {
    }

    public static Typeface a(Context context, int i)
    {
        dgd;
        JVM INSTR monitorenter ;
        TypedArray typedarray = context.obtainStyledAttributes(i, dfh.aS);
        String s = typedarray.getString(dfh.aT);
        typedarray.recycle();
        context = a(context, s);
        dgd;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Typeface a(Context context, AttributeSet attributeset, int i)
    {
        dgd;
        JVM INSTR monitorenter ;
        TypedArray typedarray1;
        typedarray1 = context.obtainStyledAttributes(attributeset, b, i, 0);
        i = typedarray1.getResourceId(0, -1);
        attributeset = null;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        TypedArray typedarray = context.obtainStyledAttributes(i, dfh.aS);
        attributeset = typedarray.getString(dfh.aT);
        typedarray.recycle();
        String s = typedarray1.getString(1);
        if (s != null)
        {
            attributeset = s;
        }
        typedarray1.recycle();
        context = a(context, ((String) (attributeset)));
        dgd;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Typeface a(Context context, String s)
    {
        Object obj = null;
        Typeface typeface = null;
        dgd;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        dgd;
        JVM INSTR monitorexit ;
        return typeface;
_L2:
        if (gqh.a(context)) goto _L1; else goto _L3
_L3:
        if (!a.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        typeface = (Typeface)a.get(s);
          goto _L1
        context = context.getResources().getAssets();
        typeface = Typeface.createFromAsset(context, s);
_L4:
        a.put(s, typeface);
          goto _L1
        context;
        throw context;
        context;
        Log.e(dgd.getName(), (new StringBuilder("Failed to load font asset: ")).append(s).toString(), context);
        typeface = obj;
          goto _L4
    }

    public static Typeface b(Context context, int i)
    {
        dgd;
        JVM INSTR monitorenter ;
        TypedArray typedarray = context.obtainStyledAttributes(new int[] {
            i
        });
        i = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        context = a(context, i);
        dgd;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Typeface c(Context context, int i)
    {
        dgd;
        JVM INSTR monitorenter ;
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedvalue, true);
        context = a(context, (String)typedvalue.string);
        dgd;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

}
