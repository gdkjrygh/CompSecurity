// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            Action

class action extends WeakReference
{

    final Action action;

    public (Action action1, Object obj, ReferenceQueue referencequeue)
    {
        super(obj, referencequeue);
        action = action1;
    }
}
