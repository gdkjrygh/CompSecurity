// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.play.image:
//            BitmapLoader

final class this._cls0
    implements Runnable
{

    final BitmapLoader this$0;

    public final void run()
    {
        for (Iterator iterator = BitmapLoader.access$600(BitmapLoader.this).values().iterator(); iterator.hasNext();)
        {
            questListenerWrapper questlistenerwrapper = (questListenerWrapper)iterator.next();
            List list = questlistenerwrapper.handlers;
            int j = list.size();
            int i = 0;
            while (i < j) 
            {
                tmapContainer tmapcontainer = (tmapContainer)list.get(i);
                tmapcontainer.mBitmap = questlistenerwrapper.responseBitmap;
                tmapcontainer.mBitmapLoaded.onResponse(tmapcontainer);
                i++;
            }
        }

        BitmapLoader.access$600(BitmapLoader.this).clear();
        Runnable _tmp = BitmapLoader.access$1002$2c88b07b(BitmapLoader.this);
    }

    tmapLoadedHandler()
    {
        this$0 = BitmapLoader.this;
        super();
    }
}
