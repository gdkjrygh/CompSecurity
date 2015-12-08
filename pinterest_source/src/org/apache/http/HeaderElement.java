// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;


// Referenced classes of package org.apache.http:
//            NameValuePair

public interface HeaderElement
{

    public abstract String getName();

    public abstract NameValuePair getParameter(int i);

    public abstract NameValuePair getParameterByName(String s);

    public abstract int getParameterCount();

    public abstract NameValuePair[] getParameters();

    public abstract String getValue();
}
