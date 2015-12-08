// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
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

    private final String PB;
    private final Set PC;
    private final Set PD;
    private final int PE;

    protected a(String s, int i)
    {
        PB = (String)o.b(s, "fieldName");
        PC = Collections.singleton(s);
        PD = Collections.emptySet();
        PE = i;
    }

    protected a(String s, Collection collection, Collection collection1, int i)
    {
        PB = (String)o.b(s, "fieldName");
        PC = Collections.unmodifiableSet(new HashSet(collection));
        PD = Collections.unmodifiableSet(new HashSet(collection1));
        PE = i;
    }

    public final Object a(DataHolder dataholder, int i, int j)
    {
        if (b(dataholder, i, j))
        {
            return c(dataholder, i, j);
        } else
        {
            return null;
        }
    }

    protected abstract void a(Bundle bundle, Object obj);

    public final void a(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        o.b(dataholder, "dataHolder");
        o.b(metadatabundle, "bundle");
        metadatabundle.b(this, a(dataholder, i, j));
    }

    public final void a(Object obj, Bundle bundle)
    {
        o.b(bundle, "bundle");
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

    protected boolean b(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = PC.iterator(); iterator.hasNext();)
        {
            if (dataholder.h((String)iterator.next(), i, j))
            {
                return false;
            }
        }

        return true;
    }

    protected abstract Object c(DataHolder dataholder, int i, int j);

    public final Object f(Bundle bundle)
    {
        o.b(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return g(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object g(Bundle bundle);

    public final String getName()
    {
        return PB;
    }

    public String toString()
    {
        return PB;
    }
}
