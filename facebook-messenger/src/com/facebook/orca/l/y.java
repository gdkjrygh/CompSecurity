// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.threads.MessagesCollection;
import com.google.common.base.Function;
import java.util.Collection;

final class y
    implements Function
{

    y()
    {
    }

    public Collection a(MessagesCollection messagescollection)
    {
        return messagescollection.b();
    }

    public Object apply(Object obj)
    {
        return a((MessagesCollection)obj);
    }
}
