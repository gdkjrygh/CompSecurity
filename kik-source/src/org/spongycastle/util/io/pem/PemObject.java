// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package org.spongycastle.util.io.pem:
//            PemObjectGenerator

public class PemObject
    implements PemObjectGenerator
{

    private static final List a = Collections.unmodifiableList(new ArrayList());
    private String b;
    private List c;
    private byte d[];

    private PemObject(String s, List list, byte abyte0[])
    {
        b = s;
        c = Collections.unmodifiableList(list);
        d = abyte0;
    }

    public PemObject(String s, byte abyte0[])
    {
        this(s, a, abyte0);
    }

    public final String a()
    {
        return b;
    }

    public final List b()
    {
        return c;
    }

    public final byte[] c()
    {
        return d;
    }

    public final PemObject d()
    {
        return this;
    }

}
