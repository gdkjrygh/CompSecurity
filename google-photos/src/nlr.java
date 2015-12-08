// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class nlr
{

    final Context a;
    public final Uri b;
    final int c;
    final ejr d;
    final nlj e;
    final long f;
    final noz g;
    volatile boolean h;
    private final boolean i;
    private final long j;
    private final nli k = new nli();

    public nlr(Context context, Uri uri, int l, boolean flag, long l1, long l2, nlj nlj1)
    {
        a = context;
        b = uri;
        c = l;
        i = flag;
        e = nlj1;
        d = (ejr)olm.a(context, ejr);
        f = l1;
        j = l2;
        g = noz.a(context, 3, "MediaUriSync", new String[] {
            "perf", "sync"
        });
    }

    nlt a()
    {
        nlt nlt1;
        boolean flag2;
        boolean flag3;
        flag3 = true;
        flag2 = true;
        nlt1 = new nlt();
        boolean flag = e.a(c, i);
        if (!flag)
        {
            if (flag)
            {
                nlj nlj1 = e;
                if (nlt1.a > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                nlj1.a(flag);
            }
            e.a(false, this);
            return nlt1;
        }
        String as[] = nlk.a(b);
        oql.c(b);
        nlu nlu1 = new nlu(this, as, "datetaken", f, j);
        a(3000, ((nls) (nlu1)));
        nlt1.a = nlu1.a;
        if (flag)
        {
            nlj nlj2 = e;
            if (nlt1.a > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            nlj2.a(flag);
        }
        nlj2 = e;
        if (!h)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        nlj2.a(flag, this);
        nlt1.b = 0;
        return nlt1;
        Exception exception;
        exception;
        flag = false;
_L2:
        if (flag)
        {
            nlj nlj3 = e;
            boolean flag1;
            if (nlt1.a > 0)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            nlj3.a(flag1);
        }
        e.a(false, this);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(int l, nls nls1)
    {
        l = 0;
_L2:
        Cursor cursor;
label0:
        {
            if (!h)
            {
                cursor = nls1.a(3000, l);
                if (cursor != null)
                {
                    break label0;
                }
            }
            return;
        }
        nls1.a(cursor);
        if (cursor.getCount() >= 3000)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (g.a())
        {
            noy.a("total pages", Integer.valueOf(l / 3000));
        }
        cursor.close();
        return;
        l += 3000;
        cursor.close();
        if (true) goto _L2; else goto _L1
_L1:
        nls1;
        cursor.close();
        throw nls1;
    }
}
