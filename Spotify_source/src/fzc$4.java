// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.provider.PaymentState;

final class ang.Object
    implements an
{

    private fzc a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), dua.a, fzc.G(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        boolean flag2;
        flag2 = true;
        obj = (Cursor)obj;
        if (!((Cursor) (obj)).moveToFirst() || fzc.c(a)) goto _L2; else goto _L1
_L1:
        boolean flag;
        int i;
        boolean flag3;
        boolean flag5;
        flag5 = gcw.a(((Cursor) (obj)), 6);
        boolean flag1;
        boolean flag6;
        if (gcw.a(((Cursor) (obj)), 2) || fzc.d(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gcw.a(((Cursor) (obj)), 3) || fzc.e(a))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = gcw.a(((Cursor) (obj)), 4);
        flag6 = gcw.a(((Cursor) (obj)), 5);
        i = ((Cursor) (obj)).getInt(1);
        fzc.a(a, ((Cursor) (obj)).getInt(0));
        if (!flag6 || flag1) goto _L4; else goto _L3
_L3:
        fzc.f(a);
        fzc.g(a);
_L6:
        fzc.i(a);
_L2:
        return;
_L4:
        if (flag3 || fzc.h(a) != null && fzc.h(a).c())
        {
            boolean flag4;
            if (!flag5 && !flag)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (!flag5)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            if (flag && !fzc.j(a) && i > 0)
            {
                fzc.k(a);
                fzc.a(a, i);
            }
            fzc.a(a, flag4);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    (fzc fzc1)
    {
        a = fzc1;
        super();
    }
}
