// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.skype:
//            NativeWeakRef, VideoImpl, ObjectInterfaceFactory, a

static final class factory extends NativeWeakRef
{

    private ObjectInterfaceFactory factory;

    public final void destroyNativeObject()
    {
        factory.destroyVideo(nativeObject);
    }

    eQueue(ObjectInterfaceFactory objectinterfacefactory, a a1, ReferenceQueue referencequeue, int i)
    {
        super(a1, referencequeue, i);
        factory = objectinterfacefactory;
    }
}
