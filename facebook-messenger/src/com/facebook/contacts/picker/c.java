// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.widget.Filter;
import android.widget.Filterable;
import com.facebook.widget.a.f;
import com.facebook.widget.a.k;

// Referenced classes of package com.facebook.contacts.picker:
//            b, w, d, u

public abstract class c extends b
    implements Filterable, w, k
{

    public c()
    {
    }

    public abstract u a();

    public abstract void b();

    public f c()
    {
        return a();
    }

    public Filter getFilter()
    {
        return new d(this);
    }
}
