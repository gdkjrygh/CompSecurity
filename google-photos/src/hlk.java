// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public class hlk
    implements omb, opl, ops, opv
{

    public hgz a;
    public CharSequence b;
    public boolean c;
    public int d;
    public hll e;

    public hlk(opd opd1)
    {
        opd1.a(this);
    }

    public void a(int i)
    {
        c = false;
        int j = i;
        if (i > d)
        {
            j = i - 1;
        }
        a.a(d, j);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hgz)olm1.a(hgz);
        b = context.getResources().getText(b.wy);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = bundle.getBoolean("com.google.android.apps.photos.remotemedia.reorder.ExtraAlbumMoveMode");
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.apps.photos.remotemedia.reorder.ExtraAlbumMoveMode", c);
    }
}
