// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import java.util.List;

public final class dpa
{

    public static dph a(dpi dpi1)
    {
        return new dph(dpi1.a());
    }

    public static dpi a(PorcelainIcon porcelainicon)
    {
        return new dpi(porcelainicon);
    }

    public static dpk a(String s)
    {
        return new dpk(s);
    }

    public static dpu a(String s, List list)
    {
        return new dpu(s, ImmutableList.a(list));
    }

    public static PorcelainJsonImmutableLinearCollection b(String s, List list)
    {
        return new PorcelainJsonImmutableLinearCollection(s, ImmutableList.a(list));
    }

    public static dpo b(String s)
    {
        return new dpo(s);
    }
}
