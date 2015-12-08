// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.skype.android.mediacontent:
//            PackInfo, MediaContent

final class a extends AbstractList
{

    final PackInfo a;

    public final Object get(int i)
    {
        int j = a.b.size();
        if (i < j)
        {
            return (MediaContent)a.b.get(i);
        } else
        {
            return (MediaContent)a.a.get(i - j);
        }
    }

    public final int size()
    {
        return a.a.size() + a.b.size();
    }

    t(PackInfo packinfo)
    {
        a = packinfo;
        super();
    }
}
