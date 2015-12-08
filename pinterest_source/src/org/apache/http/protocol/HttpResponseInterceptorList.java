// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

public interface HttpResponseInterceptorList
{

    public abstract void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor);

    public abstract void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor, int i);

    public abstract void clearResponseInterceptors();

    public abstract HttpResponseInterceptor getResponseInterceptor(int i);

    public abstract int getResponseInterceptorCount();

    public abstract void removeResponseInterceptorByClass(Class class1);

    public abstract void setInterceptors(List list);
}
