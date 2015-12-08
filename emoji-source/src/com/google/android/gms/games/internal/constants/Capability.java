// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import java.util.ArrayList;

public class Capability
{

    public static final ArrayList Ri;

    public Capability()
    {
    }

    static 
    {
        Ri = new ArrayList();
        Ri.add("ibb");
        Ri.add("rtp");
        Ri.add("unreliable_ping");
    }
}
