// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.translate.e.i;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.k;
import com.google.android.apps.translate.l;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ax

public class VoiceButton extends View
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private ax A;
    private boolean B;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final Bitmap j;
    private final Bitmap k;
    private final Paint l = new Paint();
    private final Paint m = new Paint();
    private final Paint n;
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private final LinearGradient s;
    private final LinearGradient t;
    private final RectF u;
    private final Paint v;
    private float w;
    private boolean x;
    private int y;
    private Bitmap z;

    public VoiceButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = BitmapFactory.decodeResource(getResources(), l.ic_voice_black);
        k = BitmapFactory.decodeResource(getResources(), l.ic_tts_black);
        l.setAntiAlias(true);
        l.setDither(true);
        l.setAlpha(255);
        l.setColorFilter(new PorterDuffColorFilter(0xffff0000, android.graphics.PorterDuff.Mode.SRC_IN));
        m.setAntiAlias(true);
        m.setDither(true);
        m.setStyle(android.graphics.Paint.Style.FILL);
        n = new Paint(m);
        context = context.getResources();
        float f1 = getResources().getDimension(k.voice_button_size);
        o = (f1 - (float)j.getWidth()) / 2.0F;
        p = f1 / 2.0F;
        q = p;
        r = q - getResources().getDisplayMetrics().density;
        s = new LinearGradient(0.0F, 0.0F, 0.0F, f1, context.getColor(j.voice_button_border_voice_active1), context.getColor(j.voice_button_border_voice_active2), android.graphics.Shader.TileMode.CLAMP);
        t = new LinearGradient(0.0F, 0.0F, 0.0F, f1, context.getColor(j.voice_button_border_tts_active1), context.getColor(j.voice_button_border_tts_active2), android.graphics.Shader.TileMode.CLAMP);
        u = new RectF(0.0F, 0.0F, f1, f1);
        v = new Paint(m);
        v.setShader(s);
        w = 0.0F;
        a = context.getColor(j.voice_button_border_paused);
        b = context.getColor(j.voice_button_back_paused);
        c = context.getColor(j.voice_button_icon_paused);
        d = context.getColor(j.voice_button_border_loading);
        e = context.getColor(j.voice_button_back_loading);
        f = context.getColor(j.voice_button_icon_voice_loading);
        g = context.getColor(j.voice_button_icon_tts_loading);
        h = context.getColor(j.voice_button_back_active);
        i = context.getColor(j.voice_button_icon_active);
        setState(0);
        setOnClickListener(new i(this));
        setOnLongClickListener(this);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawCircle(p, p, q, m);
        if (x)
        {
            float f1 = w;
            canvas.drawArc(u, f1, 90F, true, v);
            canvas.drawArc(u, f1 + 180F, 90F, true, v);
        }
        canvas.drawCircle(p, p, r, n);
        canvas.drawBitmap(z, o, o, l);
        if (x)
        {
            w = (w + 5F) % 360F;
            postInvalidate();
        }
    }

    public int getState()
    {
        return y;
    }

    public void onClick(View view)
    {
        if (A != null)
        {
            A.a(false);
        }
    }

    public boolean onLongClick(View view)
    {
        if (A != null)
        {
            B = true;
            A.a(true);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 42
    //                   1 50
    //                   2 36
    //                   3 42;
           goto _L1 _L2 _L3 _L1 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        B = false;
        continue; /* Loop/switch isn't completed */
_L3:
        if (B && A != null)
        {
            A.e();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setState(int i1)
    {
        x = false;
        i1;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 50
    //                   1 114
    //                   2 195
    //                   3 259
    //                   4 340;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        y = i1;
        postInvalidate();
        return;
_L2:
        m.setColor(a);
        m.setShader(null);
        n.setColor(b);
        l.setColorFilter(new PorterDuffColorFilter(c, android.graphics.PorterDuff.Mode.SRC_IN));
        z = j;
        continue; /* Loop/switch isn't completed */
_L3:
        m.setColor(d);
        m.setShader(null);
        n.setColor(e);
        l.setColorFilter(new PorterDuffColorFilter(f, android.graphics.PorterDuff.Mode.SRC_IN));
        v.setShader(s);
        x = true;
        z = j;
        continue; /* Loop/switch isn't completed */
_L4:
        m.setColor(-1);
        m.setShader(s);
        n.setColor(h);
        l.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
        z = j;
        continue; /* Loop/switch isn't completed */
_L5:
        m.setColor(d);
        m.setShader(null);
        n.setColor(e);
        l.setColorFilter(new PorterDuffColorFilter(g, android.graphics.PorterDuff.Mode.SRC_IN));
        v.setShader(t);
        x = true;
        z = k;
        continue; /* Loop/switch isn't completed */
_L6:
        m.setColor(-1);
        m.setShader(t);
        n.setColor(e);
        l.setColorFilter(new PorterDuffColorFilter(g, android.graphics.PorterDuff.Mode.SRC_IN));
        z = k;
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setVoiceButtonCallback(ax ax1)
    {
        A = ax1;
    }
}
