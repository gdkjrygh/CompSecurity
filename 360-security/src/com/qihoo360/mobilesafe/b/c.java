// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.nineoldandroids.a.d;
import com.nineoldandroids.a.k;

public class c
{

    public static transient int a(float f, int ai[])
    {
        ai = k.a(new Object(), "color", ai);
        ai.a(new d());
        ai.c(1000);
        ai.e((long)((float)1000 * f));
        return ((Integer)ai.o()).intValue();
    }

    public static int a(Context context, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return context.getResources().getColor(0x7f080058);
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return context.getResources().getColor(0x7f080057);
        } else
        {
            return context.getResources().getColor(0x7f080056);
        }
    }

    public static void a(View view, int i)
    {
        view = (GradientDrawable)view.getBackground();
        view.mutate();
        view.setStroke(1, i);
        view.setColor(i);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidateSelf();
        }
    }
}
