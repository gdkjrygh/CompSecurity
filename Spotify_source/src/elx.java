// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.HashMap;
import java.util.Map;

public final class elx
{

    final Map a = new HashMap();
    private final Resources b;

    public elx(Resources resources)
    {
        b = resources;
    }

    public final void a(String s, int i)
    {
        a.put(s, new Genre(null, s, null, b.getString(i), null, null, null, null));
    }

    public final void a(String s, String s1, int i)
    {
        a.put(s1, new Genre(null, s1, s, b.getString(i), null, null, null, null));
    }
}
