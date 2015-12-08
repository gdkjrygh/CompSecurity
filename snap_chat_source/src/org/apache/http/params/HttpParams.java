// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;


public interface HttpParams
{

    public abstract HttpParams setBooleanParameter(String s, boolean flag);

    public abstract HttpParams setIntParameter(String s, int i);

    public abstract HttpParams setParameter(String s, Object obj);
}
