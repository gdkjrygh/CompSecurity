// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            am, af

final class n extends am
{

    static final n b = new n();
    private static final long serialVersionUID = 0L;

    private n()
    {
        super(af.d(), 0);
    }

    private Object readResolve()
    {
        return b;
    }

}
