// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.view.animation.Animation;

public class com.qihoo.security.opti.trashclear.ui.mainpage.a
{
    public static abstract class a
        implements android.view.animation.Animation.AnimationListener
    {

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        public a()
        {
        }
    }


    private static String a = null;
    private static String b = null;

    public static int a(float f)
    {
        byte byte0 = 100;
        int i = (int)(f / 1048576F);
        if (i < 10)
        {
            byte0 = 15;
        } else
        {
            if (i < 20)
            {
                return a(i, 15, 50, 10, 20);
            }
            if (i < 50)
            {
                return a(i, 50, 65, 20, 50);
            }
            if (i < 100)
            {
                return a(i, 65, 80, 50, 100);
            }
            if (i < 500)
            {
                return a(i, 80, 90, 100, 500);
            }
            if (i < 1024)
            {
                return a(i, 90, 100, 500, 1024);
            }
        }
        return byte0;
    }

    private static int a(int i, int j, int k, int l, int i1)
    {
        return ((k - j) * (i - l)) / (i1 - l) + j;
    }

    public static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(int i)
    {
        if (i >= 80)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER;
        }
        if (i < 50)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        } else
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE;
        }
    }

}
