// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;
import java.util.List;

public final class bhd extends rb
{

    private CropOverlayView b;

    public bhd(CropOverlayView cropoverlayview, View view)
    {
        b = cropoverlayview;
        super(view);
    }

    protected final int a(float f, float f1)
    {
        int j = CropOverlayView.a(b, f, f1);
        int i = j;
        if (j == 0)
        {
            i = -1;
        }
        return i;
    }

    protected final void a(int i, AccessibilityEvent accessibilityevent)
    {
        accessibilityevent.setContentDescription(CropOverlayView.b(b, i));
        accessibilityevent.setClassName(com/google/android/apps/consumerphotoeditor/views/CropOverlayView.getName());
    }

    protected final void a(int i, pa pa1)
    {
        RectF rectf = new RectF();
        i;
        JVM INSTR tableswitch 1 15: default 84
    //                   1 85
    //                   2 187
    //                   3 429
    //                   4 252
    //                   5 84
    //                   6 512
    //                   7 84
    //                   8 317
    //                   9 595
    //                   10 84
    //                   11 84
    //                   12 678
    //                   13 84
    //                   14 84
    //                   15 382;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L1 _L7 _L8 _L1 _L1 _L9 _L1 _L1 _L10
_L1:
        return;
_L2:
        rectf.set(CropOverlayView.M(b).left - (float)CropOverlayView.N(b), CropOverlayView.M(b).top, CropOverlayView.M(b).left + (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom);
_L12:
        Rect rect = new Rect();
        rectf.round(rect);
        pa1.b(rect);
        pa1.c(CropOverlayView.b(b, i));
        pa1.a(16);
        return;
_L3:
        rectf.set(CropOverlayView.M(b).left, CropOverlayView.M(b).top - (float)CropOverlayView.N(b), CropOverlayView.M(b).right, CropOverlayView.M(b).top + (float)CropOverlayView.N(b));
        continue; /* Loop/switch isn't completed */
_L5:
        rectf.set(CropOverlayView.M(b).right - (float)CropOverlayView.N(b), CropOverlayView.M(b).top, CropOverlayView.M(b).right + (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom);
        continue; /* Loop/switch isn't completed */
_L7:
        rectf.set(CropOverlayView.M(b).left, CropOverlayView.M(b).bottom - (float)CropOverlayView.N(b), CropOverlayView.M(b).right, CropOverlayView.M(b).bottom + (float)CropOverlayView.N(b));
        continue; /* Loop/switch isn't completed */
_L10:
        rectf.set(CropOverlayView.M(b).left, CropOverlayView.M(b).top, CropOverlayView.M(b).right, CropOverlayView.M(b).bottom);
        continue; /* Loop/switch isn't completed */
_L4:
        rectf.set(CropOverlayView.M(b).left - (float)CropOverlayView.N(b), CropOverlayView.M(b).top - (float)CropOverlayView.N(b), CropOverlayView.M(b).left + (float)CropOverlayView.N(b), CropOverlayView.M(b).top + (float)CropOverlayView.N(b));
        continue; /* Loop/switch isn't completed */
_L6:
        rectf.set(CropOverlayView.M(b).right - (float)CropOverlayView.N(b), CropOverlayView.M(b).top - (float)CropOverlayView.N(b), CropOverlayView.M(b).right + (float)CropOverlayView.N(b), CropOverlayView.M(b).top + (float)CropOverlayView.N(b));
        continue; /* Loop/switch isn't completed */
_L8:
        rectf.set(CropOverlayView.M(b).left - (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom - (float)CropOverlayView.N(b), CropOverlayView.M(b).left + (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom + (float)CropOverlayView.N(b));
        continue; /* Loop/switch isn't completed */
_L9:
        rectf.set(CropOverlayView.M(b).right - (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom - (float)CropOverlayView.N(b), CropOverlayView.M(b).right + (float)CropOverlayView.N(b), CropOverlayView.M(b).bottom + (float)CropOverlayView.N(b));
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected final void a(List list)
    {
        if (CropOverlayView.M(b).isEmpty())
        {
            return;
        }
        list.add(Integer.valueOf(3));
        if (b.a(CropOverlayView.f(b).m, 0.0F))
        {
            list.add(Integer.valueOf(2));
        }
        list.add(Integer.valueOf(6));
        if (b.a(CropOverlayView.f(b).m, 0.0F))
        {
            list.add(Integer.valueOf(1));
        }
        list.add(Integer.valueOf(15));
        if (b.a(CropOverlayView.f(b).m, 0.0F))
        {
            list.add(Integer.valueOf(4));
        }
        list.add(Integer.valueOf(9));
        if (b.a(CropOverlayView.f(b).m, 0.0F))
        {
            list.add(Integer.valueOf(8));
        }
        list.add(Integer.valueOf(12));
    }
}
