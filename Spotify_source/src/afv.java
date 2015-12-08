// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afv extends aez
    implements agx
{

    private aha c[];

    public afv(adl adl, adm adm)
    {
        super(adl, adm);
        a.b("InternalListScreen(mIdent=%s, this=%s, parent=%s, l=%s)", new Object[] {
            b, this, adl, adm
        });
    }

    public final aha a(int i)
    {
        a.b("getList(%d) mLists=%s", new Object[] {
            Integer.valueOf(i), c
        });
        if (c != null && i >= 0 && i < c.length)
        {
            a.b("getList(%d) -> %s", new Object[] {
                Integer.valueOf(i), c[i]
            });
            return c[i];
        } else
        {
            a.b("getList(%d) -> null", new Object[] {
                Integer.valueOf(i)
            });
            return null;
        }
    }

    public final void a()
    {
        a.b("setNumberOfLists(%d)", new Object[] {
            Integer.valueOf(1)
        });
        c = new afu[1];
        for (int i = 0; i <= 0; i++)
        {
            c[0] = new afu(String.format("%s:%d", new Object[] {
                b, Integer.valueOf(0)
            }));
            ((afu)c[0]).a(true);
        }

        a.b("setNumberOfLists() initalized list", new Object[0]);
    }
}
