// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.a;

import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.data.domain.device.c;

public class e
{
    public static abstract class a
    {

        protected boolean a;
        protected boolean b;

        public boolean a()
        {
            return a;
        }

        public boolean b()
        {
            return b;
        }

        public a()
        {
            a = true;
            b = true;
        }
    }

    public static class b extends a
    {

        public b()
        {
        }
    }

    public static class c extends a
    {

        public c(boolean flag)
        {
            a = flag;
            b = false;
        }
    }


    public e()
    {
    }

    public static a a(Device device)
    {
        if (device == null || device.m() == null || device.n() == null)
        {
            return new b();
        }
        if (!device.x())
        {
            return new b();
        }
        com.fitbit.data.domain.device.c c1 = device.m();
        if (c1.a().b() || c1.b().b())
        {
            return new c(c1.a().a());
        }
        if (c1.a().a(c1.b()) != 0 && device.x() && device.w())
        {
            return new c(c1.a().a());
        } else
        {
            return new b();
        }
    }
}
