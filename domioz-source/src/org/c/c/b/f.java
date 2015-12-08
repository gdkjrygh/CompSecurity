// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.util.List;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

public interface f
{

    public abstract boolean canRead(Class class1, n n);

    public abstract boolean canWrite(Class class1, n n);

    public abstract List getSupportedMediaTypes();

    public abstract Object read(Class class1, g g);

    public abstract void write(Object obj, n n, j j);
}
