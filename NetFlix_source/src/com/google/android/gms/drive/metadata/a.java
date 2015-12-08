// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.fq;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            MetadataField

public abstract class a
    implements MetadataField
{

    private final String FM;
    private final Set FN;
    private final int FO;

    protected a(String s, int i)
    {
        FM = (String)fq.b(s, "fieldName");
        FN = Collections.singleton(s);
        FO = i;
    }

    protected a(String s, Collection collection, int i)
    {
        FM = (String)fq.b(s, "fieldName");
        FN = Collections.unmodifiableSet(new HashSet(collection));
        FO = i;
    }

    public final Object a(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = FN.iterator(); iterator.hasNext();)
        {
            if (dataholder.hasNull((String)iterator.next(), i, j))
            {
                return null;
            }
        }

        return b(dataholder, i, j);
    }

    protected abstract void a(Bundle bundle, Object obj);

    public final void a(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        fq.b(dataholder, "dataHolder");
        fq.b(metadatabundle, "bundle");
        metadatabundle.b(this, a(dataholder, i, j));
    }

    public final void a(Object obj, Bundle bundle)
    {
        fq.b(bundle, "bundle");
        if (obj == null)
        {
            bundle.putString(getName(), null);
            return;
        } else
        {
            a(bundle, obj);
            return;
        }
    }

    protected abstract Object b(DataHolder dataholder, int i, int j);

    public final Object d(Bundle bundle)
    {
        fq.b(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return e(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object e(Bundle bundle);

    public final Collection fR()
    {
        return FN;
    }

    public final String getName()
    {
        return FM;
    }

    public String toString()
    {
        return FM;
    }
}
