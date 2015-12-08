// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cqi
{

    public final cmd a;
    final cno b;

    private cqi(cmd cmd1, cno cno1)
    {
        a = (cmd)b.a(cmd1, "intervalMetrics", null);
        b = (cno)b.a(cno1, "audioMetrics", null);
    }

    public static cqi a(cmf cmf1)
    {
        return new cqi((cmd)b.a(cmf1.e(), "intervalMetrics", null), new cno((cmi)b.a(cmf1.d(), "pointMetrics", null)));
    }
}
