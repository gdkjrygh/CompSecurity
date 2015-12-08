// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import af;
import ame;
import amh;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import azh;
import b;
import com.google.android.apps.photos.list.PhotoTileView;
import fli;
import fqj;
import fqk;
import gat;
import iqq;
import iqr;
import mmr;
import olm;

public class StoryElementPickerView extends PhotoTileView
    implements fqk
{

    private static boolean C;
    private static Paint D;
    private static Paint E;
    private static Bitmap F;
    private static NinePatchDrawable G;
    private static Bitmap H;
    private static int I;
    private static Bitmap J;
    private static int K;
    private static Drawable L;
    public static Rect s;
    public boolean A;
    public final azh B;
    private final Rect M;
    private final Rect N;
    public final fli t;
    public final amh u;
    public boolean v;
    public boolean w;
    public Integer x;
    public fqj y;
    public iqr z;

    public StoryElementPickerView(Context context)
    {
        this(context, null);
    }

    public StoryElementPickerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        M = new Rect();
        N = new Rect();
        B = new iqq(this);
        attributeset = context.getApplicationContext().getResources();
        if (!C)
        {
            Paint paint = new Paint();
            D = paint;
            paint.setColor(attributeset.getColor(af.T));
            D.setStyle(android.graphics.Paint.Style.FILL);
            paint = new Paint();
            E = paint;
            paint.setColor(attributeset.getColor(af.O));
            E.setStyle(android.graphics.Paint.Style.FILL);
            F = a(attributeset, b.AA);
            G = (NinePatchDrawable)attributeset.getDrawable(b.Aw);
            int i = attributeset.getDimensionPixelSize(b.Ag);
            H = a(attributeset, b.AB);
            I = attributeset.getDimensionPixelSize(b.Ah);
            s = new Rect(0, 0, I + i + H.getWidth(), i + I + H.getHeight());
            J = a(attributeset, b.Ax);
            K = attributeset.getDimensionPixelSize(b.Ai);
            C = true;
            L = new ColorDrawable(attributeset.getColor(af.S));
        }
        a(L);
        t = (fli)olm.a(context, fli);
        u = (amh)olm.a(context, amh);
    }

    private static Bitmap a(Resources resources, int i)
    {
        try
        {
            resources = BitmapFactory.decodeResource(resources, i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            Log.e("StoryElementPickerView", "decodeResource(Resources, int) threw an OOME", resources);
            return null;
        }
        return resources;
    }

    public static Drawable f()
    {
        return L;
    }

    public final void a(fqj fqj1)
    {
        if (fqj1 == y && z != null)
        {
            z.a(this);
        }
    }

    public final void a(String s1, boolean flag)
    {
        s1 = new gat(s1, ((mmr)olm.a(getContext(), mmr)).d());
        u.a(s1).a(t.d()).a(B);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (y == null) goto _L2; else goto _L1
_L1:
        fqj fqj1;
        int i;
        int j;
        int k;
        fqj1 = y;
        i = (int)motionevent.getX();
        k = (int)motionevent.getY();
        j = motionevent.getAction();
        if (j == 3) goto _L4; else goto _L3
_L3:
        if (fqj1.a.contains(i, k)) goto _L6; else goto _L5
_L5:
        boolean flag;
        flag = flag1;
        if (j == 1)
        {
            fqj1.c = false;
            flag = flag1;
        }
_L10:
        if (flag)
        {
            return true;
        }
          goto _L2
_L6:
        j;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 105
    //                   1 113;
           goto _L7 _L8 _L9
_L7:
        flag = true;
          goto _L10
_L8:
        fqj1.c = true;
          goto _L7
_L9:
        if (fqj1.c && fqj1.b != null)
        {
            fqj1.b.a(fqj1);
        }
_L4:
        fqj1.c = false;
          goto _L7
_L2:
        return super.dispatchTouchEvent(motionevent);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!v) goto _L2; else goto _L1
_L1:
        canvas.drawRect(M, E);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (x == null)
        {
            canvas.drawBitmap(F, (getWidth() - F.getWidth()) / 2, (getHeight() - F.getHeight()) / 2, null);
        } else
        {
            canvas.drawBitmap(F, getWidth() - x.intValue() / 2 - F.getWidth() / 2, (getHeight() - F.getHeight()) / 2, null);
        }
        G.setBounds(N);
        G.draw(canvas);
_L4:
        if (y != null)
        {
            i = getWidth();
            j = H.getWidth();
            k = I;
            l = getHeight();
            i1 = H.getHeight();
            j1 = I;
            canvas.drawBitmap(H, i - j - k, l - i1 - j1, null);
        }
        if (A)
        {
            canvas.drawBitmap(J, getWidth() - J.getWidth() - K, K, null);
        }
        return;
_L2:
        if (w)
        {
            canvas.drawRect(M, D);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (y != null)
        {
            Rect rect = y.a;
            rect.offsetTo(k - i - rect.width(), l - j - rect.height());
        }
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        M.set(0, 0, i, j);
        N.set(0, j - G.getIntrinsicHeight(), i, j);
    }

    public void setSelected(boolean flag)
    {
        v = flag;
        invalidate();
    }
}
