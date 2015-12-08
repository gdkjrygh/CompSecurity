// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.servicemgr.LoMoType;
import java.util.EnumMap;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter

static final class pe.STANDARD extends EnumMap
{

    pe(Class class1)
    {
        super(class1);
        put(LoMoType.BILLBOARD, pe.BILLBOARD);
        put(LoMoType.CHARACTERS, pe.CHARACTER);
        put(LoMoType.CONTINUE_WATCHING, pe.CW);
        put(LoMoType.INSTANT_QUEUE, pe.IQ);
        put(LoMoType.FLAT_GENRE, pe.STANDARD);
        put(LoMoType.SOCIAL_FRIEND, pe.STANDARD);
        put(LoMoType.SOCIAL_GROUP, pe.STANDARD);
        put(LoMoType.SOCIAL_POPULAR, pe.STANDARD);
        put(LoMoType.STANDARD, pe.STANDARD);
    }
}
