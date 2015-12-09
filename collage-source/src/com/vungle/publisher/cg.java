// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.image.BitmapFactory;

public interface cg
{

    public abstract void a(Context context, String s);

    public abstract void a(Class class1);

    public abstract void setBitmapFactory(BitmapFactory bitmapfactory);

    public abstract void setWrapperFramework(WrapperFramework wrapperframework);

    public abstract void setWrapperFrameworkVersion(String s);
}
