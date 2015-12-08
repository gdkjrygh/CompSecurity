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
import com.google.android.gms.internal.iq;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static class ae extends Metadata
{

    private final DataHolder DG;
    private final int ED;
    private final int HU;

    static int a(ae ae)
    {
        return ae.HU;
    }

    protected Object a(MetadataField metadatafield)
    {
        return metadatafield.a(DG, HU, ED);
    }

    public Object freeze()
    {
        return gl();
    }

    public Metadata gl()
    {
        MetadataBundle metadatabundle = MetadataBundle.gF();
        Iterator iterator = e.gE().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (!(metadatafield instanceof b) && metadatafield != iq.Kq)
            {
                metadatafield.a(DG, metadatabundle, HU, ED);
            }
        } while (true);
        return new l(metadatabundle);
    }

    public boolean isDataValid()
    {
        return !DG.isClosed();
    }

    public Field(DataHolder dataholder, int i)
    {
        DG = dataholder;
        HU = i;
        ED = dataholder.ae(i);
    }
}
