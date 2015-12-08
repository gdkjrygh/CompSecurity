// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            TagManager

class zzaAT
    implements 
{

    final TagManager zzaAT;

    public void zzI(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            TagManager.zza(zzaAT, map.toString());
        }
    }

    (TagManager tagmanager)
    {
        zzaAT = tagmanager;
        super();
    }
}
