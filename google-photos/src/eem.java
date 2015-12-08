// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

public class eem
    implements mmt, mti, nuc, omb, opn, ops, opv
{

    public final nud a = new ntz(this);
    public int b;
    private final een c = new een(this, new Handler());
    private ContentResolver d;
    private dus e;
    private mmr f;
    private mtj g;

    public eem(opd opd1)
    {
        opd1.a(this);
    }

    private void a(int i)
    {
        if (b != i)
        {
            b = i;
            a.b();
        }
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (dus)olm1.a(dus);
        f = (mmr)olm1.a(mmr);
        f.a(this);
        g = (mtj)olm1.a(mtj);
        g.a(this);
        d = context.getContentResolver();
        context = e.a().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            olm1 = (String)context.next();
            olm1 = (dur)e.a(olm1);
            if (olm1.b() != null)
            {
                d.registerContentObserver(olm1.b(), false, c);
            }
        } while (true);
        if (bundle != null)
        {
            a(bundle.getInt("unread_card_count"));
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (s.equals("GetCardCountTask") && mue1 != null && !mue1.c() && f.d() == mue1.a().getInt("account_id"))
        {
            a(mue1.a().getInt("unread_card_num"));
        }
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        a(0);
        b();
    }

    final void b()
    {
        if (!f.e())
        {
            return;
        } else
        {
            g.b("GetCardCountTask");
            g.a(new eeo(f.d()));
            return;
        }
    }

    public final void c()
    {
        g.b(this);
        d.unregisterContentObserver(c);
    }

    public final void e(Bundle bundle)
    {
        if (b != 0)
        {
            bundle.putInt("unread_card_count", b);
        }
    }
}
