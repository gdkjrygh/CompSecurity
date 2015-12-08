// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package org.bouncycastle.util.io.pem:
//            PemObjectGenerator, PemGenerationException

public class PemObject
    implements PemObjectGenerator
{

    private static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private byte content[];
    private List headers;
    private String type;

    public PemObject(String s, List list, byte abyte0[])
    {
        type = s;
        headers = Collections.unmodifiableList(list);
        content = abyte0;
    }

    public PemObject(String s, byte abyte0[])
    {
        this(s, EMPTY_LIST, abyte0);
    }

    public PemObject generate()
        throws PemGenerationException
    {
        return this;
    }

    public byte[] getContent()
    {
        return content;
    }

    public List getHeaders()
    {
        return headers;
    }

    public String getType()
    {
        return type;
    }

}
