// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import okio.ByteString;
import okio.SegmentedByteString;

public final class grf
{

    private static final grn a = grn.a("application/x-www-form-urlencoded");
    private final hch b = new hch();

    public grf()
    {
    }

    public final grf a(String s, String s1)
    {
        if (b.b > 0L)
        {
            b.b(38);
        }
        grj.a(b, s, 0, s.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        b.b(61);
        grj.a(b, s1, 0, s1.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        return this;
    }

    public final grs a()
    {
        grn grn1 = a;
        Object obj = b;
        if (((hch) (obj)).b > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("size > Integer.MAX_VALUE: ")).append(((hch) (obj)).b).toString());
        }
        int i = (int)((hch) (obj)).b;
        if (i == 0)
        {
            obj = ByteString.a;
        } else
        {
            obj = new SegmentedByteString(((hch) (obj)), i);
        }
        return new grs._cls1(grn1, ((ByteString) (obj)));
    }

}
