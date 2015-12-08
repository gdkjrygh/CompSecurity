// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import IP;
import Iy;
import Jo;
import Vv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.Timber;

public class ChatCameraButton extends View
{

    public boolean a;
    public boolean b;
    public boolean c;
    public MediaPlayer d;
    private Vv e;
    private Handler f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Drawable n;
    private final Drawable o;
    private Paint p;
    private final float q;
    private final RectF r;
    private final RectF s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;
    private boolean x;
    private Runnable y;

    public ChatCameraButton(Context context, AttributeSet attributeset)
    {
label0:
        {
            super(context, attributeset);
            f = new Handler();
            g = a(context, 0x7f0c0032);
            h = a(context, 0x7f0c000a);
            i = a(context, 0x7f0c0043);
            m = a(context, 0x7f0c0065);
            n = getResources().getDrawable(0x7f0200b2);
            o = getResources().getDrawable(0x7f0200b3);
            p = g;
            j = new Paint();
            j.setColor(-1);
            j.setTextAlign(android.graphics.Paint.Align.CENTER);
            j.setTextSize(getResources().getDimensionPixelSize(0x7f0a0144));
            k = new Paint();
            k.setColor(-1);
            k.setAntiAlias(true);
            k.setStyle(android.graphics.Paint.Style.STROKE);
            float f1 = Jo.a(4F, context);
            k.setStrokeWidth(f1);
            l = new Paint();
            l.setColor(-1);
            l.setAntiAlias(true);
            l.setStyle(android.graphics.Paint.Style.STROKE);
            f1 = Jo.a(7F, context);
            l.setStrokeWidth(f1);
            q = Jo.a(10F, context);
            r = new RectF();
            s = new RectF();
            c = false;
            v = false;
            w = false;
            x = false;
            y = new Runnable() {

                private ChatCameraButton a;

                public final void run()
                {
                    ChatCameraButton.a(a);
                    if (ChatCameraButton.b(a))
                    {
                        ChatCameraButton.c(a);
                        return;
                    } else
                    {
                        ChatCameraButton.a(a, SystemClock.elapsedRealtime());
                        ChatCameraButton.d(a);
                        a.invalidate();
                        return;
                    }
                }

            
            {
                a = ChatCameraButton.this;
                super();
            }
            };
            if (!isInEditMode())
            {
                if (!IP.c(Build.MODEL, "GT-S7500"))
                {
                    break label0;
                }
                d = MediaPlayer.create(context, 0x7f070006);
            }
            return;
        }
        context = new Thread(context) {

            private Context a;
            private ChatCameraButton b;

            public final void run()
            {
                ChatCameraButton.a(b, MediaPlayer.create(a, 0x7f070006));
            }

            
            {
                b = ChatCameraButton.this;
                a = context;
                super();
            }
        };
        context.setName("HerePresenceButton Load Sound Thread");
        context.start();
    }

    static long a(ChatCameraButton chatcamerabutton, long l1)
    {
        chatcamerabutton.u = l1;
        return l1;
    }

    private static Paint a(Context context, int i1)
    {
        i1 = context.getResources().getColor(i1);
        context = new Paint();
        context.setColor(i1);
        context.setAntiAlias(true);
        return context;
    }

    static MediaPlayer a(ChatCameraButton chatcamerabutton, MediaPlayer mediaplayer)
    {
        chatcamerabutton.d = mediaplayer;
        return mediaplayer;
    }

    private void a()
    {
        if (!w)
        {
            f.postDelayed(y, 3000L);
            w = true;
            v = false;
        }
    }

    private void a(Canvas canvas)
    {
        n.setBounds(canvas.getClipBounds());
        n.draw(canvas);
    }

    static boolean a(ChatCameraButton chatcamerabutton)
    {
        chatcamerabutton.w = false;
        return false;
    }

    static boolean b(ChatCameraButton chatcamerabutton)
    {
        return chatcamerabutton.x;
    }

    static void c(ChatCameraButton chatcamerabutton)
    {
        chatcamerabutton.a();
    }

    static boolean d(ChatCameraButton chatcamerabutton)
    {
        chatcamerabutton.v = true;
        return true;
    }

    public void onDraw(Canvas canvas)
    {
        int i1 = 0;
        if (c)
        {
            canvas.drawRect(r, i);
            canvas.drawRoundRect(r, q, q, l);
            Rect rect = new Rect();
            String s1 = getResources().getString(0x7f0800a9);
            j.getTextBounds(s1, 0, s1.length(), rect);
            float f1 = canvas.getWidth() / 2;
            i1 = canvas.getHeight();
            canvas.drawText(s1, f1, (rect.height() + i1) / 2, j);
            return;
        }
        canvas.drawRect(r, g);
        long l1 = SystemClock.elapsedRealtime() - u;
        if (a || b)
        {
            Paint paint = m;
            if (l1 < 200L)
            {
                float f2 = (l1 * (long)getWidth()) / 200L;
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, f2, paint);
                invalidate();
            } else
            {
                canvas.drawRect(r, paint);
                o.setBounds(canvas.getClipBounds());
                o.draw(canvas);
                p = paint;
            }
            a(canvas);
        } else
        if (t)
        {
            Paint paint1 = h;
            if (l1 < 200L && !v)
            {
                float f3 = ((long)getWidth() * l1) / 200L;
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, f3, paint1);
                invalidate();
            } else
            {
                canvas.drawRect(r, paint1);
                l1 -= 200L;
                if (l1 >= 1600L || x)
                {
                    a();
                } else
                {
                    l1 %= 800L;
                    float f4 = 0.33F * (float)getHeight();
                    float f5 = Iy.a((float)(getWidth() / 2) - f4, (float)getWidth() * 0.14F, (float)l1 / 800F);
                    float f6 = Iy.a((float)(getWidth() / 2) + f4, (float)getWidth() * 0.86F, (float)l1 / 800F);
                    s.set(f5, (float)(getHeight() / 2) - f4, f6, f4 + (float)(getHeight() / 2));
                    int j1 = 255 - (int)(((float)l1 * 255F) / 800F);
                    Paint paint2;
                    if (j1 >= 0)
                    {
                        if (j1 > 255)
                        {
                            i1 = 255;
                        } else
                        {
                            i1 = j1;
                        }
                    }
                    k.setAlpha(i1);
                    canvas.drawOval(s, k);
                    k.setAlpha(255);
                    invalidate();
                }
                p = paint1;
            }
            a(canvas);
        } else
        {
            paint2 = p;
            f.removeCallbacks(y);
            w = false;
            v = false;
            if (l1 < 200L)
            {
                f4 = ((200L - l1) * (long)getWidth()) / 200L;
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, f4, paint2);
                invalidate();
            }
            a(canvas);
        }
        canvas.drawRoundRect(r, q, q, l);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        r.set(0.0F, 0.0F, i1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (e != null)
        {
            e.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setCashSwipeDetected(boolean flag)
    {
        if (flag == b)
        {
            return;
        } else
        {
            u = SystemClock.elapsedRealtime();
            b = flag;
            invalidate();
            return;
        }
    }

    public void setCashtagDetected(boolean flag)
    {
        if (flag == a)
        {
            return;
        } else
        {
            u = SystemClock.elapsedRealtime();
            a = flag;
            invalidate();
            return;
        }
    }

    public void setIsEmoji(boolean flag)
    {
        if (c != flag)
        {
            c = flag;
            invalidate();
        }
    }

    public void setIsTyping(boolean flag)
    {
        x = flag;
    }

    public void setPresent(boolean flag)
    {
        if (flag != t) goto _L2; else goto _L1
_L1:
        return;
_L2:
        t = flag;
        if (a || b) goto _L1; else goto _L3
_L3:
        u = SystemClock.elapsedRealtime();
        invalidate();
        if (!flag) goto _L1; else goto _L4
_L4:
        if (d == null) goto _L1; else goto _L5
_L5:
        d.start();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        Timber.d("ChatCameraButton", (new StringBuilder("Failed to play sound effect: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
        return;
    }

    public void setTouchSubscriber(Vv vv)
    {
        e = vv;
    }
}
