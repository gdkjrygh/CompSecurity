// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class i extends b
{

    public i(String s, int j)
    {
        super(s, Collections.emptySet(), Collections.singleton(s), j);
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Collection)obj);
    }

    protected void a(Bundle bundle, Collection collection)
    {
        bundle.putParcelableArrayList(getName(), new ArrayList(collection));
    }

    protected Object g(Bundle bundle)
    {
        return l(bundle);
    }

    protected Collection l(Bundle bundle)
    {
        return bundle.getParcelableArrayList(getName());
    }
}
