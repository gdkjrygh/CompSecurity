// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.l;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.internal.iq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata

public final class MetadataBuffer extends DataBuffer
{
    private static class a extends Metadata
    {

        private final DataHolder DG;
        private final int ED;
        private final int HU;

        static int a(a a1)
        {
            return a1.HU;
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

        public a(DataHolder dataholder, int i)
        {
            DG = dataholder;
            HU = i;
            ED = dataholder.ae(i);
        }
    }


    private static final String HR[];
    private final String HS;
    private a HT;

    public MetadataBuffer(DataHolder dataholder, String s)
    {
        super(dataholder);
        HS = s;
        dataholder.eU().setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public Metadata get(int i)
    {
        a a1;
label0:
        {
            a a2 = HT;
            if (a2 != null)
            {
                a1 = a2;
                if (a.a(a2) == i)
                {
                    break label0;
                }
            }
            a1 = new a(DG, i);
            HT = a1;
        }
        return a1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return HS;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = e.gE().iterator(); iterator.hasNext(); arraylist.addAll(((MetadataField)iterator.next()).gC())) { }
        HR = (String[])arraylist.toArray(new String[0]);
    }
}
