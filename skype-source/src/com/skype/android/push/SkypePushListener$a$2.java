// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import com.skype.android.util.ConversationUtil;
import java.util.EnumSet;
import java.util.LinkedHashSet;

// Referenced classes of package com.skype.android.push:
//            SkypePushListener

static final class nit> extends nit>
{

    final String[] getContextLabels(SkyLib skylib)
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        skylib = ConversationUtil.a(skylib);
        if (skylib.contains(com.skype.S.NGC_LYNC_CALLING_ENABLED))
        {
            linkedhashset.add("NGCL2S");
        }
        if (skylib.contains(com.skype.S.NGC_SKYPE_CALLING_ENABLED))
        {
            linkedhashset.add("NGCS2S");
        }
        if (skylib.contains(com.skype.S.NGC_GROUP_CALLING_ENABLED))
        {
            linkedhashset.add("NGCGVC");
        }
        linkedhashset.add("");
        return (String[])linkedhashset.toArray(new String[linkedhashset.size()]);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
