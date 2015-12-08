// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.List;

public abstract class lgj
{

    private lfp a;
    private lfn b;
    private kdh c;

    public lgj(lfp lfp1, lfn lfn1)
    {
        this(lfp1, lfn1, kdj.c());
    }

    private lgj(lfp lfp1, lfn lfn1, kdh kdh1)
    {
        boolean flag = true;
        super();
        if (lfp1.a.size() != 1)
        {
            flag = false;
        }
        b.b(flag);
        a = lfp1;
        b = lfn1;
        c = kdh1;
    }

    protected abstract void a(lfq lfq1);

    public final void a(lgk lgk1)
    {
        lqh.a((new StringBuilder("ResourceManager: Failed to download a resource: ")).append(lgk1.name()).toString());
        lgk1 = (lfh)a.a.get(0);
        a(new lfq(new lfr(Status.c, lgk1, lfs.a)));
    }

    public final void a(byte abyte0[])
    {
        Object obj;
        lfh lfh1;
        lfs lfs1;
        long l;
        long l1;
        lqh.d((new StringBuilder("ResourceManager: Resource downloaded from Network: ")).append(a.a()).toString());
        lfh1 = (lfh)a.a.get(0);
        lfs1 = lfs.a;
        obj = null;
        l1 = 0L;
        l = l1;
        Object obj1 = b.a(abyte0);
        l = l1;
        obj = obj1;
        l1 = c.a();
        if (obj1 == null)
        {
            l = l1;
            obj = obj1;
            try
            {
                lqh.c("Parsed resource from network is null");
            }
            catch (lfz lfz1)
            {
                lqh.c("Resource from network is corrupted");
                lfz1 = ((lfz) (obj));
                l1 = l;
            }
        }
        if (obj1 != null)
        {
            abyte0 = new lfr(Status.a, lfh1, abyte0, (lfv)obj1, lfs1, l1);
        } else
        {
            abyte0 = new lfr(Status.c, lfh1, lfs.a);
        }
        a(new lfq(abyte0));
        return;
    }
}
