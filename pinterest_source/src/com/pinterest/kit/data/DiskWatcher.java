// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.data;

import android.os.Environment;
import android.os.FileObserver;
import java.io.File;

public abstract class DiskWatcher
{

    protected FileObserver _observer;
    protected int _observingMask;
    protected String _observingPath;

    protected DiskWatcher(String s)
    {
        this(s, 4095);
    }

    protected DiskWatcher(String s, int i)
    {
        _observingPath = s;
        _observingMask = i;
    }

    public static String findScreenShotPath()
    {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Screenshots");
        if (!file.exists())
        {
            return null;
        } else
        {
            return file.getAbsolutePath();
        }
    }

    protected void ensureObserver()
    {
        if (_observer != null || _observingPath == null)
        {
            return;
        } else
        {
            _observer = new _cls1(_observingPath, _observingMask);
            return;
        }
    }

    protected abstract void onEvent(int i);

    public void start()
    {
        ensureObserver();
        if (_observer != null)
        {
            _observer.startWatching();
        }
    }

    public void stop()
    {
        if (_observer != null)
        {
            _observer.stopWatching();
        }
    }

    private class _cls1 extends FileObserver
    {

        final DiskWatcher this$0;

        public void onEvent(final int event, String s)
        {
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;
                final int val$event;

                public void run()
                {
                    onEvent(event);
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    event = i;
                    super();
                }
            }

            (new Handler(Looper.getMainLooper())).post(new _cls1());
        }

        _cls1(String s, int i)
        {
            this$0 = DiskWatcher.this;
            super(s, i);
        }
    }

}
