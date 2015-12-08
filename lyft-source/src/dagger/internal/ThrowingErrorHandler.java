// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Iterator;
import java.util.List;

public final class ThrowingErrorHandler
    implements Linker.ErrorHandler
{

    public ThrowingErrorHandler()
    {
    }

    public void handleErrors(List list)
    {
        if (list.isEmpty())
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Errors creating object graph:");
        String s;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append("\n  ").append(s))
        {
            s = (String)list.next();
        }

        throw new IllegalStateException(stringbuilder.toString());
    }
}
