// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hn;
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

    private final String JE;
    private final Set JF;
    private final Set JG;
    private final int JH;

    protected a(String s, int i)
    {
        JE = (String)hn.b(s, "fieldName");
        JF = Collections.singleton(s);
        JG = Collections.emptySet();
        JH = i;
    }

    protected a(String s, Collection collection, Collection collection1, int i)
    {
        JE = (String)hn.b(s, "fieldName");
        JF = Collections.unmodifiableSet(new HashSet(collection));
        JG = Collections.unmodifiableSet(new HashSet(collection1));
        JH = i;
    }

    public final Object a(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = JF.iterator(); iterator.hasNext();)
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
        hn.b(dataholder, "dataHolder");
        hn.b(metadatabundle, "bundle");
        metadatabundle.b(this, a(dataholder, i, j));
    }

    public final void a(Object obj, Bundle bundle)
    {
        hn.b(bundle, "bundle");
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
        hn.b(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return f(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object f(Bundle bundle);

    public final String getName()
    {
        return JE;
    }

    public final Collection gx()
    {
        return JF;
    }

    public String toString()
    {
        return JE;
    }
}
