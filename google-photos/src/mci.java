// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.herrevad.NetworkQualityReport;

public class mci
{

    public final NetworkQualityReport a;

    public mci(NetworkQualityReport networkqualityreport)
    {
        a = networkqualityreport;
    }

    public NetworkQualityReport a()
    {
        return a;
    }

    public mci a(int i)
    {
        a.b = i;
        return this;
    }

    public mci a(long l)
    {
        a.c = l;
        return this;
    }

    public mci a(String s, String s1)
    {
        a.g.putString(s, s1);
        return this;
    }

    public mci b(long l)
    {
        a.d = l;
        return this;
    }

    public mci c(long l)
    {
        a.e = l;
        return this;
    }
}
