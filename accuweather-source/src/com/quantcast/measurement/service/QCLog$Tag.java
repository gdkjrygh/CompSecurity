// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCLog

public static class safeTag
{

    public final String safeTag;

    public (Class class1)
    {
        String s = class1.getSimpleName();
        class1 = s;
        if (s.length() > 21)
        {
            class1 = s.substring(s.length() - 21);
        }
        safeTag = (new StringBuilder()).append("q.").append(class1).toString();
    }
}
