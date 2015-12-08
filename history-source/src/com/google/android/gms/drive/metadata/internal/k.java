// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public class k extends b
{

    public k(String s, int j)
    {
        super(s, Collections.singleton(s), Collections.emptySet(), j);
    }

    public static final Collection bn(String s)
        throws JSONException
    {
        if (s == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        s = new JSONArray(s);
        for (int j = 0; j < s.length(); j++)
        {
            arraylist.add(s.getString(j));
        }

        return Collections.unmodifiableCollection(arraylist);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Collection)obj);
    }

    protected void a(Bundle bundle, Collection collection)
    {
        bundle.putStringArrayList(getName(), new ArrayList(collection));
    }

    protected Object c(DataHolder dataholder, int j, int l)
    {
        return d(dataholder, j, l);
    }

    protected Collection d(DataHolder dataholder, int j, int l)
    {
        try
        {
            dataholder = bn(dataholder.c(getName(), j, l));
        }
        // Misplaced declaration of an exception variable
        catch (DataHolder dataholder)
        {
            throw new IllegalStateException("DataHolder supplied invalid JSON", dataholder);
        }
        return dataholder;
    }

    protected Object i(Bundle bundle)
    {
        return n(bundle);
    }

    protected Collection n(Bundle bundle)
    {
        return bundle.getStringArrayList(getName());
    }
}
