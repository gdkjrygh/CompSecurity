// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afu extends agr
    implements aha
{

    public aht a[];

    public afu(String s)
    {
        super(s);
        b.b("InternalList(%s)", new Object[] {
            s
        });
    }

    public final void a(aht aaht[])
    {
        {
            Object obj = b;
            String as2[];
            String as3[];
            String as4[];
            int ai[];
            int i;
            if (aaht != null)
            {
                i = aaht.length;
            } else
            {
                i = -1;
            }
            ((ahn) (obj)).b("setItems(%s) %d", new Object[] {
                aaht, Integer.valueOf(i)
            });
            a = aaht;
            if (aaht == null || aaht.length <= 0)
            {
                break MISSING_BLOCK_LABEL_647;
            }
            obj = aaht[0];
            Object obj1;
            String as1[];
            byte abyte1[];
            ahb ahb1;
            byte byte0;
            int i1;
            if ((obj instanceof ahd) || (obj instanceof agz) || (obj instanceof ahb))
            {
                b.b("setItems() creating litems with length %d", new Object[] {
                    Integer.valueOf(aaht.length)
                });
                as2 = new String[aaht.length];
                as3 = new String[aaht.length];
                as4 = new String[aaht.length];
                ai = new int[aaht.length];
                i = 0;
                for (int k = 0; k < aaht.length;)
                {
                    byte abyte0[] = ((ahb)aaht[k]).a();
                    if (abyte0 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Icon for item with index ")).append(k).append(" is null. No null icons allowed.").toString());
                    }
                    ai[k] = abyte0.length;
                    int l = ai[k];
                    b.b("setItems(): iconSizes[%d]=%d", new Object[] {
                        Integer.valueOf(k), Integer.valueOf(ai[k])
                    });
                    k++;
                    i += l;
                }

                abyte1 = new byte[i];
                b.b("setItems(): total iconsSize=%d", new Object[] {
                    Integer.valueOf(i)
                });
                i = 0;
                i1 = 0;
            } else
            {
                b.b("setItems() creating sitems with length %d", new Object[] {
                    Integer.valueOf(aaht.length)
                });
                String as[] = new String[aaht.length];
                int j = 0;
                while (j < aaht.length) 
                {
                    ahc ahc1 = (ahc)aaht[j];
                    String s = ahc1.b();
                    b.b("setItems() si.getLine()=%s", new Object[] {
                        s
                    });
                    if (s == null)
                    {
                        as[j] = "";
                    } else
                    {
                        as[j] = new String(ahc1.b());
                    }
                    j++;
                }
                d.a(c, as, null, null, null, null);
                return;
            }
        }
        if (i1 >= aaht.length) goto _L2; else goto _L1
_L1:
        ahb1 = (ahb)aaht[i1];
        abyte0 = null;
        if (!(ahb1 instanceof ahd)) goto _L4; else goto _L3
_L3:
        as1 = new String[3];
        if (((ahd)ahb1).b() == null)
        {
            abyte0 = "<null>";
        } else
        {
            abyte0 = ((ahd)ahb1).b();
        }
        as1[0] = abyte0;
        as1[1] = "<null>";
        byte0 = 2;
        obj1 = "<null>";
        abyte0 = as1;
_L8:
        as1[byte0] = ((String) (obj1));
_L6:
        if (abyte0.length > 2)
        {
            as4[i1] = abyte0[2];
        }
        if (abyte0.length > 1)
        {
            as3[i1] = abyte0[1];
        }
        if (abyte0.length > 0)
        {
            as2[i1] = abyte0[0];
        }
        if (ahb1.a() != null)
        {
            System.arraycopy(ahb1.a(), 0, abyte1, i, ai[i1]);
            i = ai[i1] + i;
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (ahb1 instanceof agz)
        {
            as1 = new String[2];
            if (((agz)ahb1).b() == null)
            {
                abyte0 = "<null>";
            } else
            {
                abyte0 = ((agz)ahb1).b();
            }
            as1[0] = abyte0;
            byte0 = 1;
            obj1 = "<null>";
            abyte0 = as1;
            continue; /* Loop/switch isn't completed */
        }
        if (!(ahb1 instanceof ahb))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new String[1];
        if (((ahb)ahb1).b() == null)
        {
            abyte0 = "<null>";
        } else
        {
            abyte0 = ((ahb)ahb1).b();
        }
        obj1[0] = abyte0;
        abyte0 = ((byte []) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
        if (!(ahb1 instanceof ahc)) goto _L6; else goto _L7
_L7:
        as1 = new String[1];
        byte0 = 0;
        if (((ahc)ahb1).b() == null)
        {
            obj1 = "<null>";
            abyte0 = as1;
        } else
        {
            obj1 = ((ahc)ahb1).b();
            abyte0 = as1;
        }
        if (true) goto _L8; else goto _L2
_L2:
        d.a(c, as2, as3, as4, ai, abyte1);
        return;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_279;
_L9:
    }
}
