// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import android.graphics.Matrix;
import java.util.ArrayList;

final class e
{

    String a;
    String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    ArrayList k;
    ArrayList l;
    Matrix m;

    private e()
    {
        k = new ArrayList();
        l = new ArrayList();
        m = null;
    }

    e(byte byte0)
    {
        this();
    }

    public final e a(e e1)
    {
        e e2;
label0:
        {
            e2 = new e();
            e2.a = e1.a;
            e2.b = a;
            e2.c = e1.c;
            e2.d = e1.d;
            e2.f = e1.f;
            e2.e = e1.e;
            e2.g = e1.g;
            e2.h = e1.h;
            e2.i = e1.i;
            e2.j = e1.j;
            e2.k = k;
            e2.l = l;
            e2.m = m;
            if (e1.m != null)
            {
                if (m != null)
                {
                    break label0;
                }
                e2.m = e1.m;
            }
            return e2;
        }
        Matrix matrix = new Matrix(m);
        matrix.preConcat(e1.m);
        e2.m = matrix;
        return e2;
    }
}
