// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidJavascriptCommand, PlacementType

final class x extends MraidJavascriptCommand
{

    x(String s, String s1)
    {
        super(s, 6, s1, (byte)0);
    }

    final boolean a(PlacementType placementtype)
    {
        return placementtype == PlacementType.INLINE;
    }
}
