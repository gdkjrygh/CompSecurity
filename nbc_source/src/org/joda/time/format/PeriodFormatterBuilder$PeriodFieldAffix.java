// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Set;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static interface 
{

    public abstract int calculatePrintedLength(int i);

    public abstract void finish(Set set);

    public abstract String[] getAffixes();

    public abstract int parse(String s, int i);

    public abstract void printTo(Writer writer, int i)
        throws IOException;

    public abstract void printTo(StringBuffer stringbuffer, int i);

    public abstract int scan(String s, int i);
}
