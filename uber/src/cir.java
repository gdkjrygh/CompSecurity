// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;

public abstract class cir
{

    public cir()
    {
    }

    public static cir i()
    {
        return j();
    }

    private static cir j()
    {
        return new cip();
    }

    public abstract float a();

    public abstract cir a(double d1);

    public abstract cir a(float f1);

    public abstract cir a(long l);

    public abstract cir a(UberLatLng uberlatlng);

    public abstract cir a(String s);

    public abstract float b();

    public abstract cir b(float f1);

    public abstract float c();

    public abstract cir c(float f1);

    public abstract double d();

    public abstract long e();

    public abstract String f();

    public abstract UberLatLng g();

    public final UberLocation h()
    {
        return UberLocation.a(a(), d(), b(), c(), e(), g(), f());
    }
}
