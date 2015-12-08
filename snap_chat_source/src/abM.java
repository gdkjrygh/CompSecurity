// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class abM extends aeN
{

    public final int a;

    private abM(int i, int j)
    {
        super(i);
        a = j;
    }

    public static abM a(ArrayList arraylist, int i)
    {
        int j = arraylist.size();
        abM abm = new abM(j, i);
        for (i = 0; i < j; i++)
        {
            abm.a(i, (abL)arraylist.get(i));
        }

        abm.L = false;
        return abm;
    }

    public final abL a(int i)
    {
        return (abL)d(i);
    }

    public final void a(aeG aeg)
    {
        int j = aeg.b();
        int k = super.K.length;
        int i = 0;
        while (i < k) 
        {
            abL abl = (abL)d(i);
            try
            {
                abl.a(aeg);
            }
            // Misplaced declaration of an exception variable
            catch (aeG aeg)
            {
                throw aeM.a(aeg, (new StringBuilder("...while writing ")).append(abl).toString());
            }
            i++;
        }
        i = (aeg.b() - j) / 2;
        if (i != b())
        {
            throw new RuntimeException((new StringBuilder("write length mismatch; expected ")).append(b()).append(" but actually wrote ").append(i).toString());
        } else
        {
            return;
        }
    }

    public final int b()
    {
        int i = super.K.length;
        if (i == 0)
        {
            return 0;
        } else
        {
            abL abl = a(i - 1);
            i = abl.d();
            return abl.f() + i;
        }
    }

    public final int c()
    {
        int l = super.K.length;
        int j = 0;
        int i = 0;
        while (j < l) 
        {
            abL abl = (abL)d(j);
            if (!(abl instanceof abJ))
            {
                continue;
            }
            aec aec = ((abJ)abl).a;
            if (!(aec instanceof aef))
            {
                continue;
            }
            int k;
            boolean flag;
            if (abl.c.b == 113)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = ((aef)aec).a(flag);
            if (k > i)
            {
                i = k;
            }
            j++;
        }
        return i;
    }
}
