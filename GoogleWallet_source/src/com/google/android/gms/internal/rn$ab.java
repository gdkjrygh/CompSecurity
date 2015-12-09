// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.IOUtils;

// Referenced classes of package com.google.android.gms.internal:
//            rn

final class li extends li
    implements com.google.android.gms.people..LoadImageResult
{

    private final Status EU;
    final rn aCC;
    private final ParcelFileDescriptor aCR;
    private final boolean aCS;
    private final int lh;
    private final int li;

    private void p(com.google.android.gms.common.api.plementation.b b)
    {
        if (b != null)
        {
            b.d(this);
        }
    }

    public final int getHeight()
    {
        return li;
    }

    public final ParcelFileDescriptor getParcelFileDescriptor()
    {
        return aCR;
    }

    public final Status getStatus()
    {
        return EU;
    }

    public final int getWidth()
    {
        return lh;
    }

    protected final void i(Object obj)
    {
        p((com.google.android.gms.common.api.plementation.b)obj);
    }

    protected final void iQ()
    {
        release();
    }

    public final void release()
    {
        if (aCR != null)
        {
            IOUtils.closeQuietly(aCR);
        }
    }

    public us(rn rn1, com.google.android.gms.common.api.plementation.b b, Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int j, int k)
    {
        aCC = rn1;
        super(rn1, b);
        EU = status;
        aCR = parcelfiledescriptor;
        aCS = flag;
        lh = j;
        li = k;
    }
}
