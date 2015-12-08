// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import java.util.Iterator;

public interface Status
{

    public abstract Long getDate();

    public abstract int getEffectiveLevel();

    public abstract int getLevel();

    public abstract String getMessage();

    public abstract Throwable getThrowable();

    public abstract boolean hasChildren();

    public abstract Iterator iterator();
}
