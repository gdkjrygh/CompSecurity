// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import java.util.concurrent.Future;

public interface a
    extends Future
{

    public abstract boolean a();

    public abstract Exception b();

    public abstract Object get();
}
