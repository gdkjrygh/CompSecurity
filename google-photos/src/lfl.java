// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class lfl extends lgj
{

    private final lfk a;
    private lfi b;

    public lfl(lfi lfi1, lfp lfp, lfn lfn, lfk lfk1)
    {
        b = lfi1;
        super(lfp, lfn);
        a = lfk1;
    }

    protected final void a(lfq lfq1)
    {
        byte abyte0[] = lfq1.a;
        Object obj = b;
        String s = ((lfr) (abyte0)).e.a;
        Status status = ((lfr) (abyte0)).a;
        lfv lfv = ((lfr) (abyte0)).f;
        if (((lfi) (obj)).d.containsKey(s))
        {
            ((lfm)((lfi) (obj)).d.get(s)).a = ((lfi) (obj)).b.a();
            obj = Status.a;
        } else
        {
            ((lfi) (obj)).d.put(s, new lfm(status, lfv, ((lfi) (obj)).b.a()));
        }
        if (((lfr) (abyte0)).a == Status.a && ((lfr) (abyte0)).b == lfs.a && ((lfr) (abyte0)).c != null && ((lfr) (abyte0)).c.length > 0)
        {
            obj = b.a;
            s = ((lfr) (abyte0)).e.a();
            abyte0 = ((lfr) (abyte0)).c;
            ((lgb) (obj)).d.execute(new lgd(((lgb) (obj)), s, abyte0));
            lqh.d("Resource successfully load from Network.");
            a.a(lfq1);
            return;
        }
        obj = new StringBuilder("Response status: ");
        if (((lfr) (abyte0)).a.b())
        {
            lfq1 = "SUCCESS";
        } else
        {
            lfq1 = "FAILURE";
        }
        lqh.d(((StringBuilder) (obj)).append(lfq1).toString());
        if (((lfr) (abyte0)).a.b())
        {
            lqh.d((new StringBuilder("Response source: ")).append(((lfr) (abyte0)).b.toString()).toString());
            lqh.d((new StringBuilder("Response size: ")).append(((lfr) (abyte0)).c.length).toString());
        }
        b.a(((lfr) (abyte0)).e, a);
    }
}
