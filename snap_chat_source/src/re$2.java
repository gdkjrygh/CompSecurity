// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

static final class >
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (BX)obj;
        obj1 = (BX)obj1;
        int j = ((BX) (obj1)).mScheduleDate.b(((BX) (obj)).mScheduleDate);
        int i = j;
        if (j == 0)
        {
            i = eQ.a(((BQ) (obj)).mPriority, ((BQ) (obj1)).mPriority);
        }
        return i;
    }

    >()
    {
    }
}
