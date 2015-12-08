// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;
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

    private final String QY;
    private final Set QZ;
    private final Set Ra;
    private final int Rb;

    protected a(String s, int j)
    {
        QY = (String)jx.b(s, "fieldName");
        QZ = Collections.singleton(s);
        Ra = Collections.emptySet();
        Rb = j;
    }

    protected a(String s, Collection collection, Collection collection1, int j)
    {
        QY = (String)jx.b(s, "fieldName");
        QZ = Collections.unmodifiableSet(new HashSet(collection));
        Ra = Collections.unmodifiableSet(new HashSet(collection1));
        Rb = j;
    }

    public final Object a(DataHolder dataholder, int j, int k)
    {
        if (b(dataholder, j, k))
        {
            return c(dataholder, j, k);
        } else
        {
            return null;
        }
    }

    protected abstract void a(Bundle bundle, Object obj);

    public final void a(DataHolder dataholder, MetadataBundle metadatabundle, int j, int k)
    {
        jx.b(dataholder, "dataHolder");
        jx.b(metadatabundle, "bundle");
        metadatabundle.b(this, a(dataholder, j, k));
    }

    public final void a(Object obj, Bundle bundle)
    {
        jx.b(bundle, "bundle");
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

    protected boolean b(DataHolder dataholder, int j, int k)
    {
        for (Iterator iterator = QZ.iterator(); iterator.hasNext();)
        {
            if (dataholder.h((String)iterator.next(), j, k))
            {
                return false;
            }
        }

        return true;
    }

    protected abstract Object c(DataHolder dataholder, int j, int k);

    public final String getName()
    {
        return QY;
    }

    public final Object h(Bundle bundle)
    {
        jx.b(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return i(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object i(Bundle bundle);

    public String toString()
    {
        return QY;
    }
}
