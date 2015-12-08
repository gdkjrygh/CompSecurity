// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;


// Referenced classes of package org.apache.http:
//            ParseException, HeaderElement

public interface Header
{

    public abstract HeaderElement[] getElements()
        throws ParseException;

    public abstract String getName();

    public abstract String getValue();
}
