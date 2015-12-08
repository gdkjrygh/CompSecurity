// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.SharedPreferences;
import android.webkit.ValueCallback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.net.GURLUtils;

public final class XWalkGeolocationPermissions
{
    public static interface Callback
    {

        public abstract void invoke(String s, boolean flag, boolean flag1);
    }


    private static final String PREF_PREFIX = (new StringBuilder()).append(org/xwalk/core/internal/XWalkGeolocationPermissions.getCanonicalName()).append("%").toString();
    private final SharedPreferences mSharedPreferences;

    public XWalkGeolocationPermissions(SharedPreferences sharedpreferences)
    {
        mSharedPreferences = sharedpreferences;
    }

    private String getOriginKey(String s)
    {
        s = GURLUtils.getOrigin(s);
        if (s.isEmpty())
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(PREF_PREFIX).append(s).toString();
        }
    }

    public void allow(String s)
    {
        s = getOriginKey(s);
        if (s != null)
        {
            mSharedPreferences.edit().putBoolean(s, true).apply();
        }
    }

    public void clear(String s)
    {
        s = getOriginKey(s);
        if (s != null)
        {
            mSharedPreferences.edit().remove(s).apply();
        }
    }

    public void clearAll()
    {
        android.content.SharedPreferences.Editor editor = null;
        Iterator iterator = mSharedPreferences.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.startsWith(PREF_PREFIX))
            {
                android.content.SharedPreferences.Editor editor1 = editor;
                if (editor == null)
                {
                    editor1 = mSharedPreferences.edit();
                }
                editor1.remove(s);
                editor = editor1;
            }
        } while (true);
        if (editor != null)
        {
            editor.apply();
        }
    }

    public void deny(String s)
    {
        s = getOriginKey(s);
        if (s != null)
        {
            mSharedPreferences.edit().putBoolean(s, false).apply();
        }
    }

    public void getAllowed(String s, final ValueCallback callback)
    {
        ThreadUtils.postOnUiThread(new Runnable() {

            final XWalkGeolocationPermissions this$0;
            final ValueCallback val$callback;
            final boolean val$finalAllowed;

            public void run()
            {
                callback.onReceiveValue(Boolean.valueOf(finalAllowed));
            }

            
            {
                this$0 = XWalkGeolocationPermissions.this;
                callback = valuecallback;
                finalAllowed = flag;
                super();
            }
        });
    }

    public void getOrigins(final ValueCallback callback)
    {
        final HashSet origins = new HashSet();
        Iterator iterator = mSharedPreferences.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.startsWith(PREF_PREFIX))
            {
                origins.add(s.substring(PREF_PREFIX.length()));
            }
        } while (true);
        ThreadUtils.postOnUiThread(new Runnable() {

            final XWalkGeolocationPermissions this$0;
            final ValueCallback val$callback;
            final Set val$origins;

            public void run()
            {
                callback.onReceiveValue(origins);
            }

            
            {
                this$0 = XWalkGeolocationPermissions.this;
                callback = valuecallback;
                origins = set;
                super();
            }
        });
    }

    public boolean hasOrigin(String s)
    {
        return mSharedPreferences.contains(getOriginKey(s));
    }

    public boolean isOriginAllowed(String s)
    {
        return mSharedPreferences.getBoolean(getOriginKey(s), false);
    }

}
