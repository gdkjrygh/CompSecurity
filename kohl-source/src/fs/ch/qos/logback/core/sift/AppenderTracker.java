// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;
import java.util.List;

public interface AppenderTracker
{

    public abstract Appender get(String s, long l);

    public abstract void put(String s, Appender appender, long l);

    public abstract void stopStaleAppenders(long l);

    public abstract List valueList();
}
