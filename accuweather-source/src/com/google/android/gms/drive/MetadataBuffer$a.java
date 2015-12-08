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
import com.google.android.gms.internal.ir;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static class ae extends Metadata
{

    private final DataHolder DD;
    private final int EA;
    private final int HR;

    static int a(ae ae)
    {
        return ae.HR;
    }

    protected Object a(MetadataField metadatafield)
    {
        return metadatafield.a(DD, HR, EA);
    }

    public Object freeze()
    {
        return gg();
    }

    public Metadata gg()
    {
        MetadataBundle metadatabundle = MetadataBundle.gA();
        Iterator iterator = e.gz().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (!(metadatafield instanceof b) && metadatafield != ir.Kn)
            {
                metadatafield.a(DD, metadatabundle, HR, EA);
            }
        } while (true);
        return new l(metadatabundle);
    }

    public boolean isDataValid()
    {
        return !DD.isClosed();
    }

    public Field(DataHolder dataholder, int i)
    {
        DD = dataholder;
        HR = i;
        EA = dataholder.ae(i);
    }
}
