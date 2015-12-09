// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.util;

import android.content.Context;
import com.ford.syncV4.e.i;
import java.util.concurrent.atomic.AtomicInteger;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fordsync.util:
//            ProxyImageHandler

public final class ProxyImageHandler_ extends ProxyImageHandler
{

    private static ProxyImageHandler_ instance_;
    private Context context_;

    private ProxyImageHandler_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static ProxyImageHandler_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ProxyImageHandler_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
    }

    public final void loadDefaultImages(i i, AtomicInteger atomicinteger, ProxyImageHandler.LoadDefaultImageCallback loaddefaultimagecallback)
    {
        a.a(new _cls2(i, atomicinteger, loaddefaultimagecallback));
    }

    public final void loadImage(i i, AtomicInteger atomicinteger, String s)
    {
        a.a(new _cls1(i, atomicinteger, s));
    }



    private class _cls2 extends org.androidannotations.api.c
    {

        final ProxyImageHandler_ this$0;
        final ProxyImageHandler.LoadDefaultImageCallback val$callback;
        final AtomicInteger val$correlationId;
        final i val$proxy;

        public void execute()
        {
            try
            {
                loadDefaultImages(proxy, correlationId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(i j, AtomicInteger atomicinteger, ProxyImageHandler.LoadDefaultImageCallback loaddefaultimagecallback)
        {
            this$0 = ProxyImageHandler_.this;
            proxy = j;
            correlationId = atomicinteger;
            callback = loaddefaultimagecallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls1 extends org.androidannotations.api.c
    {

        final ProxyImageHandler_ this$0;
        final AtomicInteger val$correlationId;
        final String val$imageReference;
        final i val$proxy;

        public void execute()
        {
            try
            {
                loadImage(proxy, correlationId, imageReference);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(i j, AtomicInteger atomicinteger, String s2)
        {
            this$0 = ProxyImageHandler_.this;
            proxy = j;
            correlationId = atomicinteger;
            imageReference = s2;
            super(final_s, final_i, final_s1);
        }
    }

}
