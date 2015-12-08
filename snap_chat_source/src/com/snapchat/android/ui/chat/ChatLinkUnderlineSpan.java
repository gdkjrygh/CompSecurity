// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.text.style.URLSpan;

public class ChatLinkUnderlineSpan extends URLSpan
    implements LineBackgroundSpan
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type Underline;
        public static final Type Url;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/snapchat/android/ui/chat/ChatLinkUnderlineSpan$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            Underline = new Type("Underline", 0);
            Url = new Type("Url", 1);
            $VALUES = (new Type[] {
                Underline, Url
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public final boolean a;
    private Paint b;
    private final int c;
    private final int d;
    private final Type e;

    public ChatLinkUnderlineSpan(If.a a1, int i, Type type, boolean flag)
    {
        this(a1, type, flag);
        b.setColor(i);
    }

    private ChatLinkUnderlineSpan(If.a a1, Type type, boolean flag)
    {
        super(a1.url);
        b = new Paint();
        c = a1.start;
        d = a1.end;
        e = type;
        a = flag;
        b.setStrokeWidth(3F);
        b.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    public ChatLinkUnderlineSpan(String s, int i, int j, Type type)
    {
        super(s);
        c = i;
        d = j;
        e = type;
        a = true;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int j, int k, int l, int i1, 
            CharSequence charsequence, int j1, int k1, int l1)
    {
        if (e == Type.Underline)
        {
            i = 0;
            if (c > j1)
            {
                i = (int)paint.measureText(charsequence.subSequence(j1, c).toString());
            }
            j = (int)paint.measureText(charsequence.subSequence(Math.max(j1, c), Math.min(k1, d)).toString());
            canvas.drawLine(i, l + 3, i + j, l + 3, b);
        }
    }

    public void updateDrawState(TextPaint textpaint)
    {
        if (e == Type.Url)
        {
            textpaint.setColor(textpaint.linkColor);
            textpaint.setUnderlineText(true);
        }
    }
}
