// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

final class ihr extends nzc
{

    String a;
    boolean b;
    private final String c;
    private final String d;
    private final noz e;

    public ihr(Context context, int i, String s, String s1)
    {
        super(context, (new nyh()).a(context, i).a(), "readmediacollectionsbyid", new pcn(), new pco());
        c = s;
        d = s1;
        e = noz.a(context, "ReadCollectionUrlOp", new String[0]);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcn)qlw;
        qlw.a = new qgy();
        Object obj = new qga();
        obj.a = new qcb();
        ((qga) (obj)).a.j = new qcf();
        ((qga) (obj)).a.l = new qct();
        ((pcn) (qlw)).a.b = ((qga) (obj));
        obj = new qbl();
        obj.c = c;
        obj.a = new qbx();
        ((qbl) (obj)).a.a = d;
        obj.b = new qfa();
        qez qez1 = new qez();
        qez1.a = 1;
        qez1.b = Boolean.valueOf(false);
        ((qbl) (obj)).b.a = (new qez[] {
            qez1
        });
        ((pcn) (qlw)).a.a = (new qbl[] {
            obj
        });
    }

    protected final void b(qlw qlw)
    {
        qlw = (pco)qlw;
        if (qlw != null && ((pco) (qlw)).a != null && ((pco) (qlw)).a.b.length > 0)
        {
            qlw = ((pco) (qlw)).a.b[0];
            if (qlw != null && ((qfz) (qlw)).b != null)
            {
                a = ((qfz) (qlw)).b.j.a;
                b = b.a(((qfz) (qlw)).b.l.a, false);
            }
        }
        TextUtils.isEmpty(a);
    }
}
