// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.ArrayList;

public class ci
{
    public class a
    {

        public String a;
        public int b;
        final ci c;

        public a(String s, int i)
        {
            c = ci.this;
            super();
            a = s;
            b = i;
        }
    }


    ArrayList a;

    public ci()
    {
        a = new ArrayList();
    }

    public int a()
    {
        return a.size();
    }

    public a a(int i)
    {
        return (a)a.get(i);
    }

    public void a(String s, int i)
    {
        a.add(new a(s, i));
    }
}
