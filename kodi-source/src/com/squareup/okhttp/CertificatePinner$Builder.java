// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.squareup.okhttp:
//            CertificatePinner

public static final class 
{

    private final Map hostnameToPins = new LinkedHashMap();

    public CertificatePinner build()
    {
        return new CertificatePinner(this, null);
    }


    public ()
    {
    }
}
