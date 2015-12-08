// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.home.LockableViewPager;

final class fop
    implements nug
{

    private fok a;

    fop(fok fok1)
    {
        a = fok1;
        super();
    }

    public final void b_(Object obj)
    {
        if (((hyy)obj).b())
        {
            fok.g(a).u = true;
            return;
        } else
        {
            fok.g(a).u = false;
            return;
        }
    }
}
