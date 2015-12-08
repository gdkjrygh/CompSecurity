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
import com.google.android.gms.internal.ir;
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

        private final DataHolder DD;
        private final int EA;
        private final int HR;

        static int a(a a1)
        {
            return a1.HR;
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

        public a(DataHolder dataholder, int i)
        {
            DD = dataholder;
            HR = i;
            EA = dataholder.ae(i);
        }
    }


    private static final String HO[];
    private final String HP;
    private a HQ;

    public MetadataBuffer(DataHolder dataholder, String s)
    {
        super(dataholder);
        HP = s;
        dataholder.eP().setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public Metadata get(int i)
    {
        a a1;
label0:
        {
            a a2 = HQ;
            if (a2 != null)
            {
                a1 = a2;
                if (a.a(a2) == i)
                {
                    break label0;
                }
            }
            a1 = new a(DD, i);
            HQ = a1;
        }
        return a1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return HP;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = e.gz().iterator(); iterator.hasNext(); arraylist.addAll(((MetadataField)iterator.next()).gx())) { }
        HO = (String[])arraylist.toArray(new String[0]);
    }
}
