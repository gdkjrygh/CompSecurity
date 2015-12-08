// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.HashMap;

public class FrivolousAnimationView extends ImageView
{

    private static HashMap c = new HashMap();
    public long a;
    private RectF b;
    private Fd d;
    private Bitmap e;
    private Paint f;
    private Bitmap g;
    private Paint h;

    public FrivolousAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new Fd(0);
        h = new Paint();
        h.setColor(0xff0000ff);
        h.setAntiAlias(true);
        f = new Paint();
        f.setColor(0xffff0000);
        f.setAntiAlias(true);
        a = 0x8000000000000000L;
        b = new RectF();
    }

    private static Bitmap a(int i, Canvas canvas, Context context)
    {
        Bitmap bitmap;
        if (canvas.getWidth() <= 0 || canvas.getHeight() <= 0)
        {
            bitmap = null;
        } else
        {
            String s = (new StringBuilder()).append(i).append("_").append(canvas.getWidth()).append("_").append(canvas.getHeight()).toString();
            Bitmap bitmap1 = (Bitmap)c.get(s);
            bitmap = bitmap1;
            if (bitmap1 == null)
            {
                context = context.getResources();
                if (context == null)
                {
                    return null;
                }
                try
                {
                    context = BitmapFactory.decodeResource(context, i);
                }
                // Misplaced declaration of an exception variable
                catch (Canvas canvas)
                {
                    if (ReleaseManager.e())
                    {
                        throw new RuntimeException("Could not get drawable! Bad resource perchance?");
                    } else
                    {
                        return null;
                    }
                }
                if (context == null)
                {
                    return null;
                } else
                {
                    canvas = Bitmap.createScaledBitmap(context, canvas.getWidth(), canvas.getHeight(), true);
                    c.put(s, canvas);
                    return canvas;
                }
            }
        }
        return bitmap;
    }

    public final void a(long l)
    {
        a = l;
        invalidate();
    }

    public void onDraw(Canvas canvas)
    {
        long l = 0L;
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = d.a;
        j = d.b;
        if (j != 0 && i != 0) goto _L2; else goto _L1
_L1:
        setContentDescription("");
        super.onDraw(canvas);
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l1;
        canvas.drawColor(0);
        if (g == null || g.getHeight() != canvas.getHeight() || g.getWidth() != canvas.getWidth())
        {
            g = a(j, canvas, getContext());
            if (g != null)
            {
                h.setShader(new BitmapShader(g, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        if (e == null || e.getHeight() != canvas.getHeight() || e.getWidth() != canvas.getWidth())
        {
            e = a(i, canvas, getContext());
            if (e != null)
            {
                f.setShader(new BitmapShader(e, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        l1 = System.currentTimeMillis() - a;
        float f1;
        if (l1 >= 0L)
        {
label0:
            {
                if (l1 <= 500L)
                {
                    break label0;
                }
                l = 500L;
            }
        }
_L8:
        f1 = 360F * (1.0F - (float)l / 500F);
        b.set(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
        if (f1 < 360F) goto _L4; else goto _L3
_L3:
        if (g == null) goto _L6; else goto _L5
_L5:
        canvas.drawRect(b, h);
_L9:
        i = d.b;
        if (i == 0x7f020044)
        {
            canvas = "unopened_sent_purple_icon";
        } else
        if (i == 0x7f020045)
        {
            canvas = "unopened_sent_red_icon";
        } else
        if (i == 0x7f020040)
        {
            canvas = "opened_sent_purple_icon";
        } else
        if (i == 0x7f020041)
        {
            canvas = "opened_sent_red_icon";
        } else
        if (i == 0x7f02003d)
        {
            canvas = "failed_to_send_gray_icon";
        } else
        if (i == 0x7f02013f)
        {
            canvas = "failed_to_send_exclamation_icon";
        } else
        if (i == 0x7f02003b)
        {
            canvas = "screenshotted_sent_purple_icon";
        } else
        if (i == 0x7f02003c)
        {
            canvas = "screenshotted_sent_red_icon";
        } else
        if (i == 0x7f020047)
        {
            canvas = "unopened_received_purple_icon";
        } else
        if (i == 0x7f020048)
        {
            canvas = "unopened_received_red_icon";
        } else
        if (i == 0x7f02002e)
        {
            canvas = "unopened_received_purple_birthday_icon";
        } else
        if (i == 0x7f02002f)
        {
            canvas = "unopened_received_red_birthday_icon";
        } else
        if (i == 0x7f020036)
        {
            canvas = "opened_received_purple_icon";
        } else
        if (i == 0x7f020037)
        {
            canvas = "opened_received_red_icon";
        } else
        if (i == 0x7f020038)
        {
            canvas = "replayed_sent_purple_icon";
        } else
        if (i == 0x7f020039)
        {
            canvas = "replayed_sent_red_icon";
        } else
        if (i == 0x7f020140)
        {
            canvas = "friend_request_icon";
        } else
        if (i == 0x7f020042)
        {
            canvas = "unopened_sent_blue_chat_icon";
        } else
        if (i == 0x7f02003e)
        {
            canvas = "opened_sent_blue_chat_icon";
        } else
        if (i == 0x7f02003a)
        {
            canvas = "screenshotted_sent_blue_chat_icon";
        } else
        if (i == 0x7f020046)
        {
            canvas = "unopened_received_blue_chat_icon";
        } else
        if (i == 0x7f020035)
        {
            canvas = "opened_received_blue_chat_icon";
        } else
        if (i == 0x7f020163)
        {
            canvas = "opened_gray_chat_icon";
        } else
        if (i == 0x7f020043)
        {
            canvas = "unopened_sent_cash_icon";
        } else
        if (i == 0x7f02003f)
        {
            canvas = "opened_sent_cash_icon";
        } else
        {
            if (i != 0x7f020033)
            {
                continue;
            }
            canvas = "unopened_received_cash_icon";
        }
        setContentDescription(canvas);
          goto _L7
        canvas;
        throw canvas;
        invalidate();
        l = l1;
          goto _L8
_L6:
        if (ReleaseManager.e())
        {
            throw new RuntimeException("Could not get Frivolous animation icon bitmap");
        }
        super.onDraw(canvas);
          goto _L7
_L4:
        if (e != null)
        {
            canvas.drawArc(b, -90F, f1, true, f);
        }
        if (g != null)
        {
            canvas.drawArc(b, f1 - 90F, 360F - f1, true, h);
        }
        if (false)
        {
            while (i != 0x7f020032) 
            {
                if (i == 0x7f020034)
                {
                    canvas = "refunded_cash_icon";
                } else
                {
                    canvas = null;
                }
                break MISSING_BLOCK_LABEL_302;
            }
            canvas = "opened_received_cash_icon";
            break MISSING_BLOCK_LABEL_302;
        }
          goto _L9
    }

    public void setIconResource(Fd fd)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (fd != null) goto _L2; else goto _L1
_L1:
        setBackgroundResource(0);
        int j = 0;
_L4:
        if (j != d.a)
        {
            setImageResource(j);
            e = null;
        }
        if (i != d.b)
        {
            g = null;
            invalidate();
        }
        d = fd;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        j = fd.a;
        i = fd.b;
        if (true) goto _L4; else goto _L3
_L3:
        fd;
        throw fd;
    }

}
