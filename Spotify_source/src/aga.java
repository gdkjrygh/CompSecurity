// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.bmwgroup.connected.car.internal.SdkManager;

public final class aga extends afa
    implements ahe
{

    private static final ahn d = ahn.a("connected.car.sdk");

    public aga(adl adl, adm adm)
    {
        super(adl, adm);
        d.b("InternalPlayerScreen() constructor", new Object[0]);
    }

    public final ahg a()
    {
        d.b("getArtist() -> %s", new Object[] {
            b
        });
        return new agc(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(91)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(88)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(101)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(98)
        }));
    }

    public final ahx a(int i)
    {
        if (i >= 0 && i < 8)
        {
            if (super.c[i] == null)
            {
                super.c[i] = new agv(String.format("%s:%d", new Object[] {
                    SdkManager.a.a(), Integer.valueOf(i)
                }));
            }
            return super.c[i];
        } else
        {
            throw new IndexOutOfBoundsException();
        }
    }

    public final ahf b()
    {
        d.b("getAlbum() -> %s", new Object[] {
            b
        });
        return new agb(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(92)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(89)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(102)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(99)
        }));
    }

    public final ahh c()
    {
        d.b("getTitle() -> %s", new Object[] {
            b
        });
        return new agh(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(93)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(90)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(103)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(100)
        }));
    }

    public final ahw d()
    {
        d.b("getCover() -> %s", new Object[] {
            b
        });
        return new agd(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(86)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(97)
        }));
    }

    public final ahj e()
    {
        d.b("getProgress() -> %s", new Object[] {
            b
        });
        return new agf(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(96)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(107)
        }));
    }

    public final ahv f()
    {
        return new agg(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(94)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(105)
        }));
    }

    public final ahv g()
    {
        return new agg(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(95)
        }), String.format("%s$%d", new Object[] {
            b, Integer.valueOf(106)
        }));
    }

}
