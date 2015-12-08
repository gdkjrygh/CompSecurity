// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Ho;
import android.os.AsyncTask;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui:
//            SwipeImageView

final class a extends AsyncTask
{

    private List a;
    private SwipeImageView b;

    protected final Object doInBackground(Object aobj[])
    {
        aobj = a.iterator();
        while (((Iterator) (aobj)).hasNext()) 
        {
            Ho ho = (Ho)((Iterator) (aobj)).next();
            boolean flag;
            if (!SwipeImageView.a(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ho.a(flag, SwipeImageView.b(b));
            b.postInvalidate();
        }
        return null;
    }

    (SwipeImageView swipeimageview, List list)
    {
        b = swipeimageview;
        a = list;
        super();
    }
}
