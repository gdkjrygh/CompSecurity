// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import java.util.Comparator;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            SpanManager, SnapchatTextStyle

final class yle
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (SnapchatTextStyle)obj;
        obj1 = (SnapchatTextStyle)obj1;
        return ((SnapchatTextStyle) (obj)).b - ((SnapchatTextStyle) (obj1)).b;
    }

    yle()
    {
    }
}
