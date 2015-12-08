// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedList;

public final class hwy
    implements mti, omb, oor, opn, opt, opv
{

    final Object a = new Object();
    mtj b;
    Context c;
    LinkedList d;
    final HashSet e = new HashSet();

    hwy(opd opd1, hyb hyb)
    {
        d = new LinkedList();
        opd1.a(this);
        e.add(hyb);
    }

    public final void X_()
    {
        b.a(new hwz(this, c, "file_read"));
    }

    public final void a(Activity activity)
    {
        c = activity;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (mtj)olm1.a(mtj);
        b.a(this);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (s.equals("file_read") && mue1 != null && mue1.b == 200)
        {
            s = mue1.a().getCharSequenceArrayList("file_entries");
            if (s != null)
            {
                d = new LinkedList(s);
            }
        }
    }

    public final void c()
    {
        b.b(this);
        e.clear();
        d.clear();
    }
}
