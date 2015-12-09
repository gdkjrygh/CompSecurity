// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.Closeable;
import java.io.Flushable;

// Referenced classes of package c:
//            ae, f

public interface ac
    extends Closeable, Flushable
{

    public abstract void close();

    public abstract void flush();

    public abstract ae timeout();

    public abstract void write(f f, long l);
}
