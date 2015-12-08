// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhy

public final class zzad
{

    private final String zznc;
    private final JSONObject zznd;
    private final String zzne;
    private final String zznf;
    private final boolean zzng;

    public zzad(String s, zzhy zzhy1, String s1, JSONObject jsonobject, boolean flag)
    {
        zznf = zzhy1.zzzH;
        zznd = jsonobject;
        zzne = s;
        zznc = s1;
        zzng = flag;
    }

    public final String zzaW()
    {
        return zznc;
    }

    public final String zzaX()
    {
        return zznf;
    }

    public final JSONObject zzaY()
    {
        return zznd;
    }

    public final String zzaZ()
    {
        return zzne;
    }

    public final boolean zzba()
    {
        return zzng;
    }
}
