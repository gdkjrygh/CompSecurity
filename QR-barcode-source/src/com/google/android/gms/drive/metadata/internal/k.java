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

    public k(String s, int i)
    {
        super(s, Collections.singleton(s), Collections.emptySet(), i);
    }

    public static final Collection bk(String s)
        throws JSONException
    {
        if (s == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        s = new JSONArray(s);
        for (int i = 0; i < s.length(); i++)
        {
            arraylist.add(s.getString(i));
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

    protected Object c(DataHolder dataholder, int i, int j)
    {
        return d(dataholder, i, j);
    }

    protected Collection d(DataHolder dataholder, int i, int j)
    {
        try
        {
            dataholder = bk(dataholder.c(getName(), i, j));
        }
        // Misplaced declaration of an exception variable
        catch (DataHolder dataholder)
        {
            throw new IllegalStateException("DataHolder supplied invalid JSON", dataholder);
        }
        return dataholder;
    }

    protected Object g(Bundle bundle)
    {
        return l(bundle);
    }

    protected Collection l(Bundle bundle)
    {
        return bundle.getStringArrayList(getName());
    }
}
