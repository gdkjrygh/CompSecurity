// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class fmx
{

    public final Bundle a = new Bundle();

    fmx()
    {
    }

    public final fmo a()
    {
        if (a.get("com.google.android.apps.photos.core.media_collection") == null)
        {
            throw new IllegalArgumentException("You must provide a media collection");
        } else
        {
            fmo fmo1 = new fmo();
            fmo1.f(a);
            return fmo1;
        }
    }

    public final fmx a(int i)
    {
        a.putInt("grid_portrait_column_count", i);
        return this;
    }

    public final fmx a(ekq ekq)
    {
        a.putParcelable("com.google.android.apps.photos.core.media_collection", ekq);
        return this;
    }

    public final fmx a(ekw ekw)
    {
        a.putParcelable("com.google.android.apps.photos.core.query_options", ekw);
        return this;
    }

    public final fmx a(eyz eyz)
    {
        a.putSerializable("date_header_type", eyz);
        return this;
    }

    public final fmx a(fnj fnj)
    {
        a.putSerializable("view_type", fnj);
        return this;
    }

    public final fmx a(boolean flag)
    {
        a.putBoolean("handle_scale_transitions", flag);
        return this;
    }
}
