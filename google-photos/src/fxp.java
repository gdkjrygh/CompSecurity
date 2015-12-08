// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.localmedia.ui.LocalPhotosHeaderView;
import java.util.List;

public final class fxp
    implements hgo
{

    private final fux a;

    public fxp(fux fux1)
    {
        a = fux1;
    }

    public final int a()
    {
        return aa.z;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        afn1 = (LocalPhotosHeaderView)afn1.a;
        fxr fxr1 = (fxr)olm.a(afn1.getContext(), fxr);
        afn1.a = a;
        afn1.b = fxr1;
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return (long)((Integer)a.b.get(0)).intValue() + 0x3fffffffffffffffL;
    }
}
