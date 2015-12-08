// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            HttpParameterMap, THMStatusCode

interface TDURLConnection
{

    public abstract long a(String s);

    public abstract long a(String s, HttpParameterMap httpparametermap);

    public abstract String a();

    public abstract void a(Map map);

    public abstract String b();

    public abstract void c();

    public abstract InputStream d();

    public abstract int e();

    public abstract void f();

    public abstract THMStatusCode g();
}
