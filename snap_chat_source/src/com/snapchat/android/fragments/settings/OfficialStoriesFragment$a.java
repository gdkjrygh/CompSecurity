// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import SN;
import java.util.Comparator;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            OfficialStoriesFragment

public static final class 
    implements Comparator
{

    public static int a(SN sn, SN sn1)
    {
        return sn.b().compareTo(sn1.b());
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((SN)obj, (SN)obj1);
    }

    public ()
    {
    }
}
