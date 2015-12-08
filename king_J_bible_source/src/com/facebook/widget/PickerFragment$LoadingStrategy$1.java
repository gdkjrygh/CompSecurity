// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;
import android.support.v4.content.Loader;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.widget:
//            PickerFragment, GraphObjectPagingLoader, SimpleGraphObjectCursor

class this._cls1
    implements android.support.v4.app.s._cls1
{

    final LoadReset this$1;

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return CreateLoader();
    }

    public void onLoadFinished(Loader loader, SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        if (loader != ader)
        {
            throw new FacebookException("Received callback for unknown loader.");
        } else
        {
            LoadFinished((GraphObjectPagingLoader)loader, simplegraphobjectcursor);
            return;
        }
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished((Loader)loader, (SimpleGraphObjectCursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        if (loader != ader)
        {
            throw new FacebookException("Received callback for unknown loader.");
        } else
        {
            LoadReset((GraphObjectPagingLoader)loader);
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
