// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.content.Context;
import android.support.v7.app.m;

public class PandoraMediaRouteActionProvider extends m
{
    protected static final class a
        implements android.support.v4.view.d.b
    {

        public android.support.v4.view.d.b a;
        public android.support.v4.view.d.b b;

        public void a(boolean flag)
        {
            if (a != null)
            {
                a.a(flag);
            }
            if (b != null)
            {
                b.a(flag);
            }
        }

        protected a()
        {
        }
    }


    protected a a;

    public PandoraMediaRouteActionProvider(Context context)
    {
        super(context);
        a = new a();
        super.a(a);
    }

    public void a(android.support.v4.view.d.b b)
    {
        a.a = b;
    }
}
