// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class GestureRecognizer
{

    boolean a;
    boolean b;
    boolean c;
    boolean d;
    final a e = new a();
    final a f = new a();
    int g;
    int h;

    public GestureRecognizer()
    {
        a = false;
        b = false;
        c = false;
        d = false;
    }

    static boolean a(Stroke stroke)
    {
        int i = 1;
        boolean flag2 = false;
        boolean flag = false;
        boolean flag5 = false;
        boolean flag4;
        for (boolean flag3 = false; i < stroke.a.size() - 1; flag3 = flag4)
        {
            boolean flag1 = flag5;
            if (stroke.a(i - 1).a < stroke.a(i).a)
            {
                flag1 = flag5;
                if (stroke.a(i + 1).a < stroke.a(i).a)
                {
                    flag1 = true;
                }
            }
            flag4 = flag3;
            if (stroke.a(i - 1).a > stroke.a(i).a)
            {
                flag4 = flag3;
                if (stroke.a(i + 1).a > stroke.a(i).a)
                {
                    flag4 = true;
                }
            }
            flag3 = flag2;
            if (stroke.a(i - 1).b < stroke.a(i).b)
            {
                flag3 = flag2;
                if (stroke.a(i + 1).b < stroke.a(i).b)
                {
                    flag3 = true;
                }
            }
            flag5 = flag;
            if (stroke.a(i - 1).b > stroke.a(i).b)
            {
                flag5 = flag;
                if (stroke.a(i + 1).b > stroke.a(i).b)
                {
                    flag5 = true;
                }
            }
            if (flag1 && flag4 || flag3 && flag5)
            {
                return true;
            }
            i++;
            flag2 = flag3;
            flag = flag5;
            flag5 = flag1;
        }

        return false;
    }

    static boolean a(Stroke stroke, boolean flag)
    {
        stroke = stroke.iterator();
        float f1;
        if (flag)
        {
            f1 = 3.402823E+38F;
        } else
        {
            f1 = 0.0F;
        }
        while (stroke.hasNext()) 
        {
            float f2 = ((com.google.android.libraries.handwriting.base.Stroke.Point)stroke.next()).a;
            if (flag && f1 < f2)
            {
                return false;
            }
            if (!flag && f1 > f2)
            {
                return false;
            }
            f1 = f2;
        }
        return true;
    }
}
