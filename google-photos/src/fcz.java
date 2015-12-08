// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class fcz
{

    final mmv a;

    public fcz(mmv mmv1)
    {
        a = mmv1;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = a.a(i).d("device_mgmt_user_actions").a("dismissal_count", 0);
        a.b(i).h("device_mgmt_user_actions").c("dismissal_count", j + 1).d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
