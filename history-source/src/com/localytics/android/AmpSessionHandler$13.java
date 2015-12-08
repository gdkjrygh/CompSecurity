// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, Constants

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    Object call(Object aobj[])
    {
        aobj = new JSONObject();
        int i = 0;
        do
        {
            if (i >= 10)
            {
                break;
            }
            try
            {
                ((JSONObject) (aobj)).put((new StringBuilder()).append("c").append(i).toString(), getCustomDimension(i));
            }
            catch (JSONException jsonexception)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "[JavaScriptClient]: Failed to get custom dimension");
                }
            }
            i++;
        } while (true);
        return ((JSONObject) (aobj)).toString();
    }

    ()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
