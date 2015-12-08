// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneDummyView

private static class <init>
    implements <init>
{

    private Context mContext;

    public Drawable getDrawable(int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 64
    //                   1 70
    //                   2 76;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = "ic_plusone_standard_off_client";
_L6:
        i = mContext.getResources().getIdentifier(s, "drawable", mContext.getPackageName());
        return mContext.getResources().getDrawable(i);
_L2:
        s = "ic_plusone_small_off_client";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "ic_plusone_medium_off_client";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ic_plusone_tall_off_client";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isValid()
    {
        int i = mContext.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", mContext.getPackageName());
        int j = mContext.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", mContext.getPackageName());
        int k = mContext.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", mContext.getPackageName());
        int l = mContext.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", mContext.getPackageName());
        return i != 0 && j != 0 && k != 0 && l != 0;
    }

    private (Context context)
    {
        mContext = context;
    }

    mContext(Context context, mContext mcontext)
    {
        this(context);
    }
}
