// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.fragments;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class FragmentModule
{

    private final Fragment fragment;
    private final ScreenManager screenManager = new ScreenManager(provideConfiguration(), provideDisplay());

    public FragmentModule(Fragment fragment1)
    {
        fragment = fragment1;
    }

    private Configuration provideConfiguration()
    {
        return fragment.getResources().getConfiguration();
    }

    private Display provideDisplay()
    {
        return fragment.getActivity().getWindowManager().getDefaultDisplay();
    }

    public static ExecutorServiceFactory provideExecutorFactory()
    {
        return new ExecutorServiceFactory();
    }

    public static Handler provideUiThreadHandler()
    {
        return new Handler();
    }

    public final Handler provideBackgroundHandler()
    {
        final FutureTask handlerProvider = new FutureTask(new Callable() {

            final FragmentModule this$0;

            private static Handler call()
                throws Exception
            {
                return new Handler();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = FragmentModule.this;
                super();
            }
        });
        (new Thread(new Runnable() {

            final FragmentModule this$0;
            final FutureTask val$handlerProvider;

            public final void run()
            {
                Looper.prepare();
                handlerProvider.run();
                Looper.loop();
            }

            
            {
                this$0 = FragmentModule.this;
                handlerProvider = futuretask;
                super();
            }
        })).start();
        try
        {
            handlerProvider = (Handler)handlerProvider.get();
        }
        catch (Exception exception)
        {
            throw new IllegalStateException("Could not start background thread", exception);
        }
        return handlerProvider;
    }

    public final Context provideContext()
    {
        return fragment.getActivity();
    }

    public final Fragment provideFragment()
    {
        return fragment;
    }

    public final PackageManager providePackageManager()
    {
        return provideContext().getPackageManager();
    }

    public final Resources provideResources()
    {
        return fragment.getResources();
    }

    public final ScreenManager provideScreenManager()
    {
        return screenManager;
    }

    public final Vibrator provideVibrator()
    {
        return (Vibrator)fragment.getActivity().getSystemService("vibrator");
    }
}
