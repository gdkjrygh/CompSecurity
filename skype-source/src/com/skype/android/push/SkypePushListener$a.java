// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import com.skype.android.util.ConversationUtil;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.skype.android.push:
//            SkypePushListener

private static abstract class <init> extends Enum
{

    private static final NGC_AND_P2P $VALUES[];
    public static final NGC_AND_P2P NGC_AND_P2P;
    public static final NGC_AND_P2P P2P;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/push/SkypePushListener$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract String[] getContextLabels(SkyLib skylib);

    String[] getUnregisterContextLabels(SkyLib skylib, a_3B_.clone clone)
    {
        HashSet hashset = new HashSet();
        Collections.addAll(hashset, getContextLabels(skylib));
        skylib = clone.getContextLabels(skylib);
        int j = skylib.length;
        for (int i = 0; i < j; i++)
        {
            hashset.remove(skylib[i]);
        }

        return (String[])hashset.toArray(new String[hashset.size()]);
    }

    static 
    {
        P2P = new SkypePushListener.a("P2P", 0) {

            final String[] getContextLabels(SkyLib skylib)
            {
                return (new String[] {
                    ""
                });
            }

        };
        NGC_AND_P2P = new SkypePushListener.a("NGC_AND_P2P", 1) {

            final String[] getContextLabels(SkyLib skylib)
            {
                LinkedHashSet linkedhashset = new LinkedHashSet();
                skylib = ConversationUtil.a(skylib);
                if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_LYNC_CALLING_ENABLED))
                {
                    linkedhashset.add("NGCL2S");
                }
                if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_SKYPE_CALLING_ENABLED))
                {
                    linkedhashset.add("NGCS2S");
                }
                if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_ENABLED))
                {
                    linkedhashset.add("NGCGVC");
                }
                linkedhashset.add("");
                return (String[])linkedhashset.toArray(new String[linkedhashset.size()]);
            }

        };
        $VALUES = (new .VALUES[] {
            P2P, NGC_AND_P2P
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
