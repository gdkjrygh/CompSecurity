// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.settings.PreferenceCategory;

final class ibr
    implements oaa
{

    private ibq a;

    ibr(ibq ibq1)
    {
        a = ibq1;
        super();
    }

    public final boolean a(nzw nzw, Object obj)
    {
        boolean flag;
        flag = ((Boolean)obj).booleanValue();
        nzw = ibq.b(a);
        int i = ibq.a(a);
        ((ics) (nzw)).a.b(i).h("com.google.android.apps.photos.settings.notifications").c("enabled", flag).d();
        if (!flag || ibq.c(a)) goto _L2; else goto _L1
_L1:
        ibq.e(a).b(ibq.d(a));
        ibq.e(a).b(ibq.f(a));
        ibq.a(a, true);
_L4:
        ibq.g(a).a(Boolean.valueOf(((Boolean)obj).booleanValue()));
        return true;
_L2:
        if (!flag && ibq.c(a))
        {
            ibq.e(a).c(ibq.d(a));
            ibq.e(a).c(ibq.f(a));
            ibq.a(a, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
