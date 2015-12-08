// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
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
//            Metadata

public final class MetadataBuffer extends DataBuffer
{
    private static class a extends Metadata
    {

        private final DataHolder JG;
        private final int La;
        private final int OD;

        static int a(a a1)
        {
            return a1.OD;
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

        public a(DataHolder dataholder, int i)
        {
            JG = dataholder;
            OD = i;
            La = dataholder.au(i);
        }
    }


    private final String OB;
    private a OC;

    public MetadataBuffer(DataHolder dataholder, String s)
    {
        super(dataholder);
        OB = s;
        dataholder.gV().setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public Metadata get(int i)
    {
        a a1;
label0:
        {
            a a2 = OC;
            if (a2 != null)
            {
                a1 = a2;
                if (a.a(a2) == i)
                {
                    break label0;
                }
            }
            a1 = new a(JG, i);
            OC = a1;
        }
        return a1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return OB;
    }
}
