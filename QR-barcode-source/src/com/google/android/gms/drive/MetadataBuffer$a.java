// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.l;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.internal.kd;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static class ar extends Metadata
{

    private final DataHolder II;
    private final int JY;
    private final int Ns;

    static int a(ar ar)
    {
        return ar.Ns;
    }

    protected Object a(MetadataField metadatafield)
    {
        return metadatafield.a(II, Ns, JY);
    }

    public Object freeze()
    {
        return hR();
    }

    public Metadata hR()
    {
        MetadataBundle metadatabundle = MetadataBundle.io();
        Iterator iterator = e.in().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (!(metadatafield instanceof b) && metadatafield != kd.Ql)
            {
                metadatafield.a(II, metadatabundle, Ns, JY);
            }
        } while (true);
        return new l(metadatabundle);
    }

    public boolean isDataValid()
    {
        return !II.isClosed();
    }

    public Field(DataHolder dataholder, int i)
    {
        II = dataholder;
        Ns = i;
        JY = dataholder.ar(i);
    }
}
