// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class jeu
    implements Runnable
{

    private jet a;

    jeu(jet jet1)
    {
        a = jet1;
        super();
    }

    public final void run()
    {
        boolean flag1 = false;
        if (a.a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a.f = a.a.getCurrentPosition();
        int i = a.d.a(a.f);
        a.c.a(i, false);
        if (!a.a.isPlaying()) goto _L1; else goto _L3
_L3:
        if (a.a.getDuration() > 0 && !a.c.f && a.b.a()) goto _L5; else goto _L4
_L4:
        mk.a(a.e, this);
        return;
_L5:
        float f;
        Object obj;
        f = (float)a.f / (float)a.a.getDuration();
        obj = a.b;
        if (((jgf) (obj)).a == null) goto _L7; else goto _L6
_L6:
        boolean flag;
        jge jge1 = ((jgf) (obj)).a;
        flag = flag1;
        if (f > jge1.a)
        {
            flag = flag1;
            if (f < jge1.b)
            {
                flag = true;
            }
        }
        if (!flag) goto _L8; else goto _L7
_L7:
        f = 1.0F;
_L9:
        obj = a.a;
        float f1;
        jgg jgg1;
        int j;
        int k;
        int l;
        if (jfq.g())
        {
            if (!((jfq) (obj)).e())
            {
                obj.g = f;
            } else
            {
                ((jfq) (obj)).a(f);
            }
        }
        if (true) goto _L4; else goto _L8
_L8:
        jgg1 = ((jgf) (obj)).c;
        j = (int)((float)((jgf) (obj)).b * f);
        if (jgg1.c == jgg1.d)
        {
            f = jgg1.b;
        } else
        {
            k = jgg1.c - j;
            l = jgg1.d;
            if (k >= 0)
            {
                f = (float)k / 400F;
            } else
            {
                f = (float)(j - l) / 400F;
            }
            f1 = jgg1.b;
            j = (int)(10F * f);
            if (jgg1.a.containsKey(Integer.valueOf(j)))
            {
                f = ((Float)jgg1.a.get(Integer.valueOf(j))).floatValue();
            } else
            {
                f = (float)Math.min(Math.floor(f), 1.0D);
            }
            f = f * (f1 - 1.0F) + 1.0F;
        }
          goto _L9
    }
}
