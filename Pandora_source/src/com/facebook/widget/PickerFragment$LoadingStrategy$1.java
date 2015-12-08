// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;
import android.support.v4.content.i;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.widget:
//            PickerFragment, GraphObjectPagingLoader, SimpleGraphObjectCursor

class this._cls1
    implements android.support.v4.app.s._cls1
{

    final LoadReset this$1;

    public i onCreateLoader(int i, Bundle bundle)
    {
        return CreateLoader();
    }

    public void onLoadFinished(i i, SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        if (i != ader)
        {
            throw new FacebookException("Received callback for unknown loader.");
        } else
        {
            LoadFinished((GraphObjectPagingLoader)i, simplegraphobjectcursor);
            return;
        }
    }

    public volatile void onLoadFinished(i i, Object obj)
    {
        onLoadFinished(i, (SimpleGraphObjectCursor)obj);
    }

    public void onLoaderReset(i i)
    {
        if (i != ader)
        {
            throw new FacebookException("Received callback for unknown loader.");
        } else
        {
            LoadReset((GraphObjectPagingLoader)i);
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
