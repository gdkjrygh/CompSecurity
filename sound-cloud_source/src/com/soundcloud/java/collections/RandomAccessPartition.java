// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.soundcloud.java.collections:
//            Partition

class RandomAccessPartition extends Partition
    implements RandomAccess
{

    RandomAccessPartition(List list, int i)
    {
        super(list, i);
    }
}
