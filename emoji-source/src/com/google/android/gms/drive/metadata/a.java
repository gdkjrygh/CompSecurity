// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hm;
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

    private final String JH;
    private final Set JI;
    private final Set JJ;
    private final int JK;

    protected a(String s, int i)
    {
        JH = (String)hm.b(s, "fieldName");
        JI = Collections.singleton(s);
        JJ = Collections.emptySet();
        JK = i;
    }

    protected a(String s, Collection collection, Collection collection1, int i)
    {
        JH = (String)hm.b(s, "fieldName");
        JI = Collections.unmodifiableSet(new HashSet(collection));
        JJ = Collections.unmodifiableSet(new HashSet(collection1));
        JK = i;
    }

    public final Object a(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = JI.iterator(); iterator.hasNext();)
        {
            if (dataholder.h((String)iterator.next(), i, j))
            {
                return null;
            }
        }

        return b(dataholder, i, j);
    }

    protected abstract void a(Bundle bundle, Object obj);

    public final void a(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        hm.b(dataholder, "dataHolder");
        hm.b(metadatabundle, "bundle");
        metadatabundle.b(this, a(dataholder, i, j));
    }

    public final void a(Object obj, Bundle bundle)
    {
        hm.b(bundle, "bundle");
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

    public final Object e(Bundle bundle)
    {
        hm.b(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return f(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object f(Bundle bundle);

    public final Collection gC()
    {
        return JI;
    }

    public final String getName()
    {
        return JH;
    }

    public String toString()
    {
        return JH;
    }
}
