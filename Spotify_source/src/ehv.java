// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public final class ehv
    implements ehm
{

    final ObjectMapper a;

    public ehv(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    public final ehn a(byte abyte0[])
    {
        return new ehw(this, a.readTree(abyte0));
    }

    public final byte[] a(List list)
    {
        return a.writeValueAsBytes(list);
    }
}
