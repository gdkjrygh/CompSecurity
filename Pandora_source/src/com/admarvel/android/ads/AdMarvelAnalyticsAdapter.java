// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public abstract class AdMarvelAnalyticsAdapter
{

    protected AdMarvelAnalyticsAdapter(Context context)
    {
    }

    protected static AdMarvelAnalyticsAdapter createInstance(String s, Context context)
    {
        return (AdMarvelAnalyticsAdapter)createObject(s, context);
    }

    private static Object createObject(String s, Context context)
    {
        try
        {
            s = Class.forName(s).getDeclaredConstructor(new Class[] {
                android/content/Context
            });
            s.setAccessible(true);
            s = ((String) (s.newInstance(new Object[] {
                context
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s);
            return null;
        }
        return s;
    }

    public abstract String getAdapterAnalyticsVersion();

    protected abstract Map getEnhancedTargetParams(String s, Map map);

    protected abstract void onAdClick(String s, int i, Map map, String s1, String s2);

    protected abstract void onAdImpression(String s, int i, Map map, String s1);

    protected abstract void onAdRequest(String s, int i, Map map, String s1);

    protected abstract void pause();

    protected abstract void resume();

    protected abstract void start();

    protected abstract void stop();
}
