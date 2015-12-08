// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.vm;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            b

public final class ImageManager
{

    private static final Object a = new Object();
    private static HashSet b = new HashSet();
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final vm g;
    private final Map h;
    private final Map i;
    private final Map j;

    static Object a()
    {
        return a;
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.h;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.c;
    }

    static HashSet b()
    {
        return b;
    }

    static vm c(ImageManager imagemanager)
    {
        return imagemanager.g;
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.j;
    }

    static Map e(ImageManager imagemanager)
    {
        return imagemanager.i;
    }

    static ExecutorService f(ImageManager imagemanager)
    {
        return imagemanager.e;
    }

    static Handler g(ImageManager imagemanager)
    {
        return imagemanager.d;
    }

    static b h(ImageManager imagemanager)
    {
        return imagemanager.f;
    }

}
