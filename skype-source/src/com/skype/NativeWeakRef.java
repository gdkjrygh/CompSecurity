// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class NativeWeakRef extends WeakReference
{

    protected final int nativeObject;

    public NativeWeakRef(Object obj, ReferenceQueue referencequeue, int i)
    {
        super(obj, referencequeue);
        nativeObject = i;
    }

    public abstract void destroyNativeObject();
}
