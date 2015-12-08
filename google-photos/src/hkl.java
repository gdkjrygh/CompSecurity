// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class hkl
    implements nuc, opl, ops, opv
{

    public final nud a = new ntz(this);
    public boolean b;

    public hkl(opd opd1)
    {
        opd1.a(this);
    }

    public final hkl a(olm olm1)
    {
        olm1.a(hkl, this);
        return this;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getBoolean("com.google.android.apps.photos.remotemedia.ExtraAlbumEditMode");
            b();
        }
    }

    public void b()
    {
        a.b();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.apps.photos.remotemedia.ExtraAlbumEditMode", b);
    }
}
