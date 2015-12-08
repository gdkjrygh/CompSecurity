// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.os.Handler;
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
    private final Map g;
    private final Map h;

    static Context a(ImageManager imagemanager)
    {
        return imagemanager.c;
    }

    static Object a()
    {
        return a;
    }

    static HashSet b()
    {
        return b;
    }

    static Map b(ImageManager imagemanager)
    {
        return imagemanager.h;
    }

    static Map c(ImageManager imagemanager)
    {
        return imagemanager.g;
    }

    static ExecutorService d(ImageManager imagemanager)
    {
        return imagemanager.e;
    }

    static Handler e(ImageManager imagemanager)
    {
        return imagemanager.d;
    }

    static b f(ImageManager imagemanager)
    {
        return imagemanager.f;
    }

}
