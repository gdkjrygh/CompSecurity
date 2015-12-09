// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;


// Referenced classes of package com.fitbit.widget:
//            WidgetUpdaterService_

class a extends org.androidannotations.a.
{

    final WidgetUpdaterService_ a;

    public void a()
    {
        try
        {
            WidgetUpdaterService_.a(a);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (WidgetUpdaterService_ widgetupdaterservice_, String s, int i, String s1)
    {
        a = widgetupdaterservice_;
        super(s, i, s1);
    }
}
