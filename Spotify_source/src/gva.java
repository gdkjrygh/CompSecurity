// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class gva extends WeakReference
{

    final guz a;

    public gva(guz guz, Object obj, ReferenceQueue referencequeue)
    {
        super(obj, referencequeue);
        a = guz;
    }
}
