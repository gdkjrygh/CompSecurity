// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public class pm
{

    private static final pn b;
    public final Object a;

    public pm()
    {
        a = b.a(this);
    }

    public pm(Object obj)
    {
        a = obj;
    }

    public static List a()
    {
        return null;
    }

    public static pa b()
    {
        return null;
    }

    public pa a(int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            b = new pq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new po();
        } else
        {
            b = new pn();
        }
    }
}
