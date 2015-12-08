// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public class ezz
{

    public final fab a;
    public final mmv b;
    public final noz c;
    public final noz d;
    public final Context e;
    public final evk f;

    public ezz(Context context, fab fab, evk evk1, String s)
    {
        e = context;
        a = fab;
        f = evk1;
        b = (mmv)olm.a(context, mmv);
        c = noz.a(context, s, new String[0]);
        d = noz.a(context, 2, s, new String[] {
            "perf"
        });
    }

    public fab a()
    {
        return a;
    }

    public void a(int i)
    {
        android.database.sqlite.SQLiteDatabase sqlitedatabase;
        int j;
        long l;
        try
        {
            sqlitedatabase = mvj.a(e, i);
        }
        catch (mmy mmy1)
        {
            return;
        }
        l = noy.a();
        j = f.a(sqlitedatabase);
        if (d.a())
        {
            noy.a("processor", a);
            noy.a(i);
            noy.a("duration", l);
            noy.a("rows", Integer.valueOf(j));
        }
    }

    public boolean b()
    {
        Iterator iterator = b.a().iterator();
_L2:
        int i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = ((Integer)iterator.next()).intValue();
        boolean flag = f.a(i);
        if (flag)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
        return false;
        mmy mmy1;
        mmy1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void c()
    {
        for (Iterator iterator = b.a().iterator(); iterator.hasNext(); a(((Integer)iterator.next()).intValue())) { }
    }
}
