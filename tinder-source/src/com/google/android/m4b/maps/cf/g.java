// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            i, p, q

public final class g
{
    public static final class a
    {

        Object a;
        a b;
        public int c;
    }

    public static final class b
    {

        private a a;
        private a b;

        final a a()
        {
            this;
            JVM INSTR monitorenter ;
            throw new NullPointerException();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }
    }

    public final class c
        implements p
    {

        public final q a(Class class1)
        {
            throw new NullPointerException();
        }
    }


    static String d = null;
    private static final List e = new ArrayList();
    private static final List f = new ArrayList();
    final c a;
    int b;
    int c;
    private int g;

    public static void a(String s, String s1)
    {
        int j = GLES20.glGetError();
        if (j != 0)
        {
            if (ab.a(s, 6))
            {
                String s2 = String.valueOf(GLU.gluErrorString(j));
                Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(s2).length())).append(s1).append(": glError ").append(s2).append("  ").append(j).toString());
            }
            Thread.dumpStack();
            System.exit(1);
            throw new i(j);
        } else
        {
            return;
        }
    }

    final void a()
    {
        throw new NullPointerException();
    }

}
