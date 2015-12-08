// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;

public class PlusOneDummyView extends FrameLayout
{
    private static class a
        implements d
    {

        private Context mContext;

        public Drawable getDrawable(int i)
        {
            return mContext.getResources().getDrawable(0x1080004);
        }

        public boolean isValid()
        {
            return true;
        }

        private a(Context context)
        {
            mContext = context;
        }

    }

    private static class b
        implements d
    {

        private Context mContext;

        public Drawable getDrawable(int i)
        {
            Object obj;
            Resources resources;
            try
            {
                resources = mContext.createPackageContext("com.google.android.gms", 4).getResources();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            switch (i)
            {
            case 2: // '\002'
                obj = "ic_plusone_tall";
                break;

            default:
                obj = "ic_plusone_standard";
                break;

            case 0: // '\0'
                obj = "ic_plusone_small";
                break;

            case 1: // '\001'
                obj = "ic_plusone_medium";
                break;
            }
              goto _L1
_L3:
            return resources.getDrawable(resources.getIdentifier(((String) (obj)), "drawable", "com.google.android.gms"));
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public boolean isValid()
        {
            try
            {
                mContext.createPackageContext("com.google.android.gms", 4).getResources();
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                return false;
            }
            return true;
        }

        private b(Context context)
        {
            mContext = context;
        }

    }

    private static class c
        implements d
    {

        private Context mContext;

        public Drawable getDrawable(int i)
        {
            i;
            JVM INSTR tableswitch 0 2: default 28
        //                       0 64
        //                       1 70
        //                       2 76;
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

        private c(Context context)
        {
            mContext = context;
        }

    }

    private static interface d
    {

        public abstract Drawable getDrawable(int i);

        public abstract boolean isValid();
    }


    public static final String TAG = "PlusOneDummyView";

    public PlusOneDummyView(Context context, int i)
    {
        super(context);
        context = new Button(context);
        context.setEnabled(false);
        context.setBackgroundDrawable(jT().getDrawable(i));
        Point point = cY(i);
        addView(context, new android.widget.FrameLayout.LayoutParams(point.x, point.y, 17));
    }

    private Point cY(int i)
    {
        Point point;
        int j;
        byte byte0;
        byte0 = 24;
        j = 20;
        point = new Point();
        i;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 112
    //                   1 106
    //                   2 122;
           goto _L1 _L2 _L3 _L4
_L1:
        i = 38;
        j = 24;
_L6:
        android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f = TypedValue.applyDimension(1, i, displaymetrics);
        float f1 = TypedValue.applyDimension(1, j, displaymetrics);
        point.x = (int)((double)f + 0.5D);
        point.y = (int)((double)f1 + 0.5D);
        return point;
_L3:
        i = 32;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 14;
        i = byte0;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 50;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private d jT()
    {
        Object obj1 = new b(getContext());
        Object obj = obj1;
        if (!((d) (obj1)).isValid())
        {
            obj = new c(getContext());
        }
        obj1 = obj;
        if (!((d) (obj)).isValid())
        {
            obj1 = new a(getContext());
        }
        return ((d) (obj1));
    }
}
