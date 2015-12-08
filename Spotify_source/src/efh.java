// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class efh
{

    long a;
    public long b;

    public efh()
    {
        dmz.a(ggb);
        ggb.a();
        a = gcf.a() / 1000L;
        b = gcf.b() / 1000L;
        ((gff)dmz.a(gff)).a(new gfh() {

            private efh a;

            public final void a(long l)
            {
                efh efh1 = a;
                efh1.a = l;
                efh1.b = gcf.b() / 1000L;
            }

            
            {
                a = efh.this;
                super();
            }
        });
    }
}
