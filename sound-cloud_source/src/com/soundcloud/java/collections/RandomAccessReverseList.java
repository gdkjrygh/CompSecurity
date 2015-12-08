// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.soundcloud.java.collections:
//            ReverseList

class RandomAccessReverseList extends ReverseList
    implements RandomAccess
{

    RandomAccessReverseList(List list)
    {
        super(list);
    }
}
