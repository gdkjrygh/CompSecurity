// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

public abstract class hw
    implements Iterator
{

    protected hw()
    {
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
