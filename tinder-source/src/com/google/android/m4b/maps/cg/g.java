// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.u;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.internal.k;
import com.google.android.m4b.maps.y.p;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            f

public class g extends com.google.android.m4b.maps.df.v.a
{

    private static final String c = com/google/android/m4b/maps/cg/g.getSimpleName();
    final b a;
    u b;
    private final ViewGroup d;
    private final f e;

    private g(b b1, ViewGroup viewgroup, f f1)
    {
        a = b1;
        d = viewgroup;
        e = f1;
    }

    private View a(k k1)
    {
        boolean flag = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj = (View)com.google.android.m4b.maps.da.d.a(b.a(k1));
_L6:
        Object obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
        k1;
        throw new RuntimeRemoteException(k1);
_L3:
        try
        {
            if (b != null)
            {
                obj = (View)com.google.android.m4b.maps.da.d.a(b.b(k1));
                break MISSING_BLOCK_LABEL_57;
            }
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            throw new RuntimeRemoteException(k1);
        }
        obj = null;
        obj1 = obj;
        if (obj == null)
        {
            if (p.b(k1.m()))
            {
                return null;
            }
            obj1 = e;
            obj = k1.m();
            ((f) (obj1)).a.setText(((CharSequence) (obj)));
            obj1 = ((f) (obj1)).a;
            int i;
            if (obj != null)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj1)).setVisibility(i);
            obj = e;
            k1 = k1.o();
            ((f) (obj)).b.setText(k1);
            obj = ((f) (obj)).b;
            if (k1 != null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            obj1 = e;
        }
        d.removeAllViews();
        d.addView(((View) (obj1)));
        obj1 = d;
_L4:
        return ((View) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static g a(b b1, Context context, Resources resources)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundDrawable(resources.getDrawable(com.google.android.m4b.maps.h.e.maps_popup_pointer_button_normal));
        return new g(b1, linearlayout, f.a(context));
    }

    public final Bitmap a(k k1, int i, int j)
    {
        try
        {
            k1 = a(k1);
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            if (ab.a(c, 6))
            {
                Log.e(c, "Error while creating the info window.");
            }
            k1.printStackTrace();
            k1 = null;
        }
        if (k1 != null)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000);
            j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
            k1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            k1.measure(i, j);
            i = k1.getMeasuredWidth();
            j = k1.getMeasuredHeight();
            if (i == 0 || j == 0)
            {
                if (ab.a(c, 5))
                {
                    Log.w(c, "Info window has a width or height of zero.");
                    return null;
                }
            } else
            {
                k1.layout(0, 0, i, j);
                Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
                k1.draw(new Canvas(bitmap));
                return bitmap;
            }
        }
        return null;
    }

}
