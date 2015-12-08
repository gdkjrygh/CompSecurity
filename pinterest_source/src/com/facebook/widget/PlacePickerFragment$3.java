// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.widget:
//            PlacePickerFragment

class this._cls0
    implements Runnable
{

    final PlacePickerFragment this$0;

    public void run()
    {
        loadData(true);
        return;
        Object obj;
        obj;
        Listener listener = getOnErrorListener();
        if (listener != null)
        {
            listener.onError(PlacePickerFragment.this, ((FacebookException) (obj)));
            return;
        } else
        {
            Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] {
                obj
            });
            return;
        }
        obj;
        FacebookException facebookexception = new FacebookException(((Throwable) (obj)));
        Listener listener1 = getOnErrorListener();
        if (listener1 != null)
        {
            listener1.onError(PlacePickerFragment.this, facebookexception);
            return;
        } else
        {
            Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] {
                facebookexception
            });
            return;
        }
        facebookexception;
        throw facebookexception;
    }

    Listener()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
