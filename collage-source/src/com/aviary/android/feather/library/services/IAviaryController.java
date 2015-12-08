// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.library.services.drag.DragLayer;

public interface IAviaryController
{

    public abstract Context a();

    public abstract Object a(Class class1);

    public abstract void a(int i);

    public abstract void a(CharSequence charsequence);

    public abstract void a(boolean flag);

    public abstract Activity b();

    public abstract Matrix d();

    public abstract void e();

    public abstract void f();

    public abstract DragLayer g();

    public abstract b h();
}
