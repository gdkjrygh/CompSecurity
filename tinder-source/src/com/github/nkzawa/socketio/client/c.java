// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.b.a;

public final class c
{
    public static interface a
    {

        public abstract void a();
    }


    public static a a(com.github.nkzawa.b.a a1, String s, com.github.nkzawa.b.a.a a2)
    {
        a1.a(s, a2);
        return new a(a1, s, a2) {

            final com.github.nkzawa.b.a a;
            final String b;
            final com.github.nkzawa.b.a.a c;

            public final void a()
            {
                a.c(b, c);
            }

            
            {
                a = a1;
                b = s;
                c = a2;
                super();
            }
        };
    }
}
