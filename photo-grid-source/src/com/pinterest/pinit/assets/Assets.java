// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit.assets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.pinterest.pinit.assets.buttons.WhiteHdpi;
import com.pinterest.pinit.assets.buttons.WhiteMdpi;
import com.pinterest.pinit.assets.buttons.WhiteXhdpi;

public class Assets
{

    public static final int DENSITY_DEFAULT = 160;
    public static final int DENSITY_HIGH = 240;
    public static final int DENSITY_MEDIUM = 160;
    public static final int DENSITY_TV = 213;
    public static final int DENSITY_XHIGH = 320;
    public static final int DENSITY_XXHIGH = 480;
    private static int statesDown[] = {
        0x10100a7
    };
    private static int statesUp[] = {
        0x101009e
    };

    public Assets()
    {
    }

    private static byte[] decode(String s)
    {
        return Base64.decode(s, 0);
    }

    public static StateListDrawable getPinItDrawable(Context context)
    {
        Resources resources;
        StateListDrawable statelistdrawable;
        int i;
        resources = context.getResources();
        i = resources.getDisplayMetrics().densityDpi;
        statelistdrawable = new StateListDrawable();
        i;
        JVM INSTR lookupswitch 3: default 60
    //                   240: 210
    //                   320: 200
    //                   480: 200;
           goto _L1 _L2 _L3 _L3
_L1:
        context = decode(WhiteMdpi.getDown());
_L7:
        context = BitmapFactory.decodeByteArray(context, 0, context.length);
        byte abyte0[] = context.getNinePatchChunk();
        NinePatch.isNinePatchChunk(abyte0);
        statelistdrawable.addState(statesDown, new NinePatchDrawable(resources, context, abyte0, new Rect(), null));
        i;
        JVM INSTR lookupswitch 3: default 148
    //                   240: 230
    //                   320: 220
    //                   480: 220;
           goto _L4 _L5 _L6 _L6
_L5:
        break MISSING_BLOCK_LABEL_230;
_L4:
        context = decode(WhiteMdpi.getUp());
_L8:
        context = BitmapFactory.decodeByteArray(context, 0, context.length);
        byte abyte1[] = context.getNinePatchChunk();
        NinePatch.isNinePatchChunk(abyte1);
        statelistdrawable.addState(statesUp, new NinePatchDrawable(resources, context, abyte1, new Rect(), null));
        return statelistdrawable;
_L3:
        context = decode(WhiteXhdpi.getDown());
          goto _L7
_L2:
        context = decode(WhiteHdpi.getDown());
          goto _L7
_L6:
        context = decode(WhiteXhdpi.getUp());
          goto _L8
        context = decode(WhiteHdpi.getUp());
          goto _L8
    }

}
