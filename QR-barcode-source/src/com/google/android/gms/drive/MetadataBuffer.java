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
import com.google.android.gms.internal.kd;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata

public final class MetadataBuffer extends DataBuffer
{
    private static class a extends Metadata
    {

        private final DataHolder II;
        private final int JY;
        private final int Ns;

        static int a(a a1)
        {
            return a1.Ns;
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

        public a(DataHolder dataholder, int i)
        {
            II = dataholder;
            Ns = i;
            JY = dataholder.ar(i);
        }
    }


    private final String Nq;
    private a Nr;

    public MetadataBuffer(DataHolder dataholder, String s)
    {
        super(dataholder);
        Nq = s;
        dataholder.gy().setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public Metadata get(int i)
    {
        a a1;
label0:
        {
            a a2 = Nr;
            if (a2 != null)
            {
                a1 = a2;
                if (a.a(a2) == i)
                {
                    break label0;
                }
            }
            a1 = new a(II, i);
            Nr = a1;
        }
        return a1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return Nq;
    }
}
