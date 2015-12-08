// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class ekt extends eke
{

    public final List b;

    public ekt(List list)
    {
        String s = String.valueOf(list);
        super((new StringBuilder(String.valueOf(s).length() + 21)).append("Media IDs not found: ").append(s).toString());
        b = new ArrayList(list);
    }
}
