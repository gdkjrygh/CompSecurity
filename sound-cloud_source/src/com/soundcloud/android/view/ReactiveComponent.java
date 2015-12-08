// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import rx.Y;
import rx.b;

public interface ReactiveComponent
{

    public abstract b buildObservable();

    public abstract Y connectObservable(b b);
}
