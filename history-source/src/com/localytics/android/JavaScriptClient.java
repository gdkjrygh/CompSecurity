// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            AmpCallable, Constants

final class JavaScriptClient
{

    private Map mCallbacks;

    public JavaScriptClient(Map map)
    {
        mCallbacks = map;
    }

    private Object invoke(int i, Object aobj[])
    {
        Object obj1 = null;
        Object obj = obj1;
        if (mCallbacks != null)
        {
            AmpCallable ampcallable = (AmpCallable)mCallbacks.get(Integer.valueOf(i));
            obj = obj1;
            if (ampcallable != null)
            {
                obj = ampcallable.call(aobj);
            }
        }
        return obj;
    }

    public String getAttributes()
    {
        return (String)invoke(7, null);
    }

    public Map getCallbacks()
    {
        return mCallbacks;
    }

    public String getCustomDimensions()
    {
        return (String)invoke(6, null);
    }

    public String getIdentifiers()
    {
        return (String)invoke(5, null);
    }

    public String getJsGlueCode()
    {
        return String.format("javascript:(function() {  var localyticsScript = document.createElement('script');  localyticsScript.type = 'text/javascript';  localyticsScript.text = ' \t localytics.identifers = %s;\t localytics.customDimensions = %s;\t localytics.attributes = %s;    localytics.tagEvent = function(event, attributes, customDimensions, customerValueIncrease) {\t   localytics.nativeTagEvent(event, JSON.stringify(attributes), JSON.stringify(customDimensions), customerValueIncrease);    };    localytics.setCustomDimension = function(number, value) {      if (number != null && value != null)        localytics.nativeSetCustomDimension(number, value);    };    window.open = function(url) {      if (url != null)        localytics.navigate(url);    };    localytics.close = function() {      localytics.nativeClose();    };';  document.getElementsByTagName('body')[0].appendChild(localyticsScript);})()", new Object[] {
            getIdentifiers(), getCustomDimensions(), getAttributes()
        });
    }

    public void nativeClose()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "[JavaScriptClient]: nativeClose is being called");
        }
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final JavaScriptClient this$0;

            public void run()
            {
                invoke(4, null);
            }

            
            {
                this$0 = JavaScriptClient.this;
                super();
            }
        });
    }

    public void nativeSetCustomDimension(long l, String s)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "[JavaScriptClient]: nativeSetCustomDimension is being called");
        }
        invoke(8, new Object[] {
            Integer.valueOf((int)l), s
        });
    }

    public void nativeTagEvent(String s, String s1, String s2, long l)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "[JavaScriptClient]: nativeTagEvent is being called");
        }
        invoke(3, new Object[] {
            s, s1, s2, Long.valueOf(l)
        });
    }

    public void navigate(String s)
    {
        invoke(15, new String[] {
            s
        });
    }

}
