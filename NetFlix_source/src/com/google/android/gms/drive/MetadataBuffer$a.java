// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.c;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer, b

private static class G extends Metadata
{

    private final DataHolder BB;
    private final int BE;
    private final int EO;

    static int a(G g)
    {
        return g.EO;
    }

    protected Object a(MetadataField metadatafield)
    {
        return metadatafield.a(BB, EO, BE);
    }

    public Metadata fB()
    {
        MetadataBundle metadatabundle = MetadataBundle.fT();
        for (Iterator iterator = c.fS().iterator(); iterator.hasNext(); ((MetadataField)iterator.next()).a(BB, metadatabundle, EO, BE)) { }
        return new b(metadatabundle);
    }

    public Object freeze()
    {
        return fB();
    }

    public boolean isDataValid()
    {
        return !BB.isClosed();
    }

    public Field(DataHolder dataholder, int i)
    {
        BB = dataholder;
        EO = i;
        BE = dataholder.G(i);
    }
}
