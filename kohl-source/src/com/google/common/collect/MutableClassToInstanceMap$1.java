// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapConstraint, MutableClassToInstanceMap

static final class 
    implements MapConstraint
{

    public void checkKeyValue(Class class1, Object obj)
    {
        MutableClassToInstanceMap.access$000(class1, obj);
    }

    public volatile void checkKeyValue(Object obj, Object obj1)
    {
        checkKeyValue((Class)obj, obj1);
    }

    ()
    {
    }
}
