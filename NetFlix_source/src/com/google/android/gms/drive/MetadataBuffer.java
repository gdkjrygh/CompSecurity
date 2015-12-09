// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, b

public final class MetadataBuffer extends DataBuffer
{
    private static class a extends Metadata
    {

        private final DataHolder BB;
        private final int BE;
        private final int EO;

        static int a(a a1)
        {
            return a1.EO;
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

        public a(DataHolder dataholder, int i)
        {
            BB = dataholder;
            EO = i;
            BE = dataholder.G(i);
        }
    }


    private static final String EL[];
    private final String EM;
    private a EN;

    public MetadataBuffer(DataHolder dataholder, String s)
    {
        super(dataholder);
        EM = s;
    }

    public Metadata get(int i)
    {
        a a1;
label0:
        {
            a a2 = EN;
            if (a2 != null)
            {
                a1 = a2;
                if (a.a(a2) == i)
                {
                    break label0;
                }
            }
            a1 = new a(BB, i);
            EN = a1;
        }
        return a1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return EM;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = c.fS().iterator(); iterator.hasNext(); arraylist.addAll(((MetadataField)iterator.next()).fR())) { }
        EL = (String[])arraylist.toArray(new String[0]);
    }
}
