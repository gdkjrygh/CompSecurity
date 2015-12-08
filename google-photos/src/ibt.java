// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ibt
    implements oaa
{

    private ibq a;

    ibt(ibq ibq1)
    {
        a = ibq1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        nzw = ibq.b(a);
        int i = ibq.a(a);
        boolean flag = ((Boolean)obj).booleanValue();
        ((ics) (nzw)).a.b(i).h("com.google.android.apps.photos.settings.notifications").c("vibration", flag).d();
        return true;
    }
}
