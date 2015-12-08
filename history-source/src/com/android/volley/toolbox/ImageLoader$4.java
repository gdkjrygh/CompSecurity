// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            ImageLoader

class this._cls0
    implements Runnable
{

    final ImageLoader this$0;

    public void run()
    {
        for (Iterator iterator = ImageLoader.access$200(ImageLoader.this).values().iterator(); iterator.hasNext();)
        {
            tchedImageRequest tchedimagerequest = (tchedImageRequest)iterator.next();
            Iterator iterator1 = tchedImageRequest.access._mth300(tchedimagerequest).iterator();
            while (iterator1.hasNext()) 
            {
                ageContainer agecontainer = (ageContainer)iterator1.next();
                if (ageContainer.access._mth400(agecontainer) != null)
                {
                    if (tchedimagerequest.getError() == null)
                    {
                        ageContainer.access._mth502(agecontainer, tchedImageRequest.access._mth000(tchedimagerequest));
                        ageContainer.access._mth400(agecontainer).onResponse(agecontainer, false);
                    } else
                    {
                        ageContainer.access._mth400(agecontainer).onErrorResponse(tchedimagerequest.getError());
                    }
                }
            }
        }

        ImageLoader.access$200(ImageLoader.this).clear();
        ImageLoader.access$602(ImageLoader.this, null);
    }

    ageListener()
    {
        this$0 = ImageLoader.this;
        super();
    }
}
