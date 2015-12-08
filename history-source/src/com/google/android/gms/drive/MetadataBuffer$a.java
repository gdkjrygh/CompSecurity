// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.m;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.internal.ln;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static class au extends Metadata
{

    private final DataHolder JG;
    private final int La;
    private final int OD;

    static int a(au au)
    {
        return au.OD;
    }

    protected Object a(MetadataField metadatafield)
    {
        return metadatafield.a(JG, OD, La);
    }

    public Object freeze()
    {
        return iy();
    }

    public boolean isDataValid()
    {
        return !JG.isClosed();
    }

    public Metadata iy()
    {
        MetadataBundle metadatabundle = MetadataBundle.iZ();
        Iterator iterator = e.iY().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (!(metadatafield instanceof b) && metadatafield != ln.RI)
            {
                metadatafield.a(JG, metadatabundle, OD, La);
            }
        } while (true);
        return new m(metadatabundle);
    }

    public Field(DataHolder dataholder, int i)
    {
        JG = dataholder;
        OD = i;
        La = dataholder.au(i);
    }
}
