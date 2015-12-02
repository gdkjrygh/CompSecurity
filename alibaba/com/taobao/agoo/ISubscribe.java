// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.agoo;

import java.util.List;

public interface ISubscribe
{

    public abstract void onFailure(String s, String s1);

    public abstract void onSuccess(String s, List list);
}
