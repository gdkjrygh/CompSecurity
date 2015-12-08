// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hqz
    implements nug
{

    private hqv a;

    hqz(hqv hqv1)
    {
        a = hqv1;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (nwm)obj;
        hqv.b(a, ((Boolean)((nwm) (obj)).ai_().a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", Boolean.valueOf(false))).booleanValue());
        obj = (hqu)((nwm) (obj)).ai_().b(hqu);
        if (obj != hqv.g(a))
        {
            if (hqv.g(a) != null)
            {
                hqv.g(a).a().a(hqv.h(a));
            }
            hqv.a(a, ((hqu) (obj)));
            if (obj != null)
            {
                ((hqu) (obj)).a().a(hqv.h(a), true);
                hqv.a(a, ((hqu) (obj)).c(), 0.0F, 0.0F);
            }
        }
    }
}
