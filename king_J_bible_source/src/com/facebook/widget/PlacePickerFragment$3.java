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
        if (false)
        {
            Listener listener = getOnErrorListener();
            if (listener == null)
            {
                break MISSING_BLOCK_LABEL_192;
            }
            listener.onError(PlacePickerFragment.this, null);
        }
_L2:
        return;
        Object obj;
        obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        Listener listener1 = getOnErrorListener();
        if (listener1 != null)
        {
            listener1.onError(PlacePickerFragment.this, ((FacebookException) (obj)));
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
        if (facebookexception != null)
        {
            Listener listener2 = getOnErrorListener();
            if (listener2 != null)
            {
                listener2.onError(PlacePickerFragment.this, facebookexception);
                return;
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] {
                    facebookexception
                });
                return;
            }
        } else
        {
            return;
        }
        facebookexception;
        if (false)
        {
            Listener listener3 = getOnErrorListener();
            if (listener3 != null)
            {
                listener3.onError(PlacePickerFragment.this, null);
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] {
                    null
                });
            }
        }
        throw facebookexception;
        Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] {
            null
        });
        return;
    }

    Listener()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
