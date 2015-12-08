// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;

import java.util.Collection;

// Referenced classes of package org.bouncycastle.util:
//            StoreException, Selector

public interface Store
{

    public abstract Collection getMatches(Selector selector)
        throws StoreException;
}
