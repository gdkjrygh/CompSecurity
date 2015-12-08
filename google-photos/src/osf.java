// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ShortBuffer;

public final class osf
    implements osd
{

    final osg a = new osg();
    final float b;
    boolean c;
    private final osc d;
    private boolean e;

    public osf(osc osc1, float f)
    {
        d = (osc)p.a(osc1);
        b = f;
    }

    public final float a(osh osh)
    {
        return a.a(osh) * b;
    }

    public final void a()
    {
        c = true;
        d.a();
    }

    public final void a(long l)
    {
        a.a(l);
    }

    public final void a(ShortBuffer shortbuffer, int i, int j)
    {
        boolean flag;
        if (!e)
        {
            osg osg1 = a;
            osi osi1;
            if (osg1.a == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "ticksPerSample already set (%s)", new Object[] {
                Integer.valueOf(osg1.a)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "Invalid samplesPerSec (%s)", new Object[] {
                Integer.valueOf(i)
            });
            osg1.a = 0x6baa80 / i;
            osg1 = a;
            osi1 = osi.a(j);
            if (osg1.b == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "channelCount already set");
            osg1.b = (osi)p.a(osi1);
            e = true;
        }
        if (i == 0x6baa80 / a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "samplesPerSec changed from %s to %s", new Object[] {
            Integer.valueOf(0x6baa80 / a.a), Integer.valueOf(i)
        });
        if (j == a.b.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "channelCount changed from %s to %s", new Object[] {
            Integer.valueOf(a.b.a), Integer.valueOf(j)
        });
        a.a(shortbuffer);
        d.a();
    }
}
