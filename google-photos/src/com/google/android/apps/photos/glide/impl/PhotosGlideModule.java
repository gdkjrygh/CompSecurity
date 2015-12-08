// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.glide.impl;

import alz;
import amc;
import ana;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import art;
import ayc;
import ayt;
import b;
import ekp;
import fej;
import flp;
import flq;
import flt;
import flu;
import flv;
import fly;
import flz;
import gap;
import java.io.InputStream;
import java.nio.ByteBuffer;
import mjn;
import mjq;
import mjr;
import mjt;
import mju;
import mjx;
import mjz;
import olm;
import oqm;

public class PhotosGlideModule
    implements ayc
{

    private static final long a;

    public PhotosGlideModule()
    {
    }

    public final void a(Context context, alz alz1)
    {
        boolean flag = true;
        ana ana1 = ana.a;
        alz1.k.a((new ayt()).a(ana1));
        alz1.h = new fej(context, a);
        context = new art(context);
        b.a(true, "Bitmap pool screens must be greater than or equal to 0");
        context.b = 4F;
        if (((art) (context)).b < 0.0F)
        {
            flag = false;
        }
        b.a(flag, "Memory cache screens must be greater than or equal to 0");
        context.a = 2.0F;
        alz1.i = context.a();
    }

    public final void a(Context context, amc amc1)
    {
        mjz mjz1 = (mjz)olm.a(context, mjz);
        context = (mjx)olm.a(context, mjx);
        amc1.b(java/lang/String, java/io/InputStream, new mju()).b(java/lang/String, java/nio/ByteBuffer, new mjt()).a(mjn, java/nio/ByteBuffer, new mjq(mjz1, context)).a(mjn, java/io/InputStream, new mjr(mjz1, context)).a(gap, java/nio/ByteBuffer, new fly()).a(gap, java/io/InputStream, new flz()).a(gap, java/io/InputStream, new flq()).a(gap, android/os/ParcelFileDescriptor, new flp()).a(ekp, java/nio/ByteBuffer, new flt()).a(ekp, java/io/InputStream, new flv()).a(ekp, android/os/ParcelFileDescriptor, new flu());
    }

    static 
    {
        a = oqm.c.f * 500L;
    }
}
