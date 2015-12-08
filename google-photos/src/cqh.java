// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cqh
{

    public final nny a;
    public final coj b;
    public final long c;
    public final long d;

    private cqh(nny nny1, coj coj1, long l, long l1, boolean flag)
    {
        a = (nny)b.a(nny1, "mediaIdentifier", null);
        b = (coj)b.a(coj1, "type", null);
        c = ((Long)b.a(Long.valueOf(l), "creationTimeUs", null)).longValue();
        d = b.b(l1, "durationUs");
    }

    public static cqh a(cnz cnz1)
    {
        return new cqh(cnz1.a(), cnz1.b().e, cnz1.b().b, cnz1.e(), cnz1.f());
    }
}
