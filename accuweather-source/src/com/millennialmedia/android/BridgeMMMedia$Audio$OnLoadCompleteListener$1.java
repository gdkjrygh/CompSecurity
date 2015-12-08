// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.SoundPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMMedia

class this._cls1 extends TimerTask
{

    final this._cls1 this$1;

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = cess._mth300(this._cls1.this).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            int i = cess._mth400(this._cls1.this).play(integer.intValue(), 0.0F, 0.0F, 0, 0, 1.0F);
            if (i != 0)
            {
                cess._mth400(this._cls1.this).stop(i);
                LoadComplete(cess._mth400(this._cls1.this), integer.intValue(), 0);
                arraylist.add(integer);
            }
        } while (true);
        cess._mth300(this._cls1.this).removeAll(arraylist);
        if (cess._mth300(this._cls1.this).size() == 0)
        {
            cess._mth500(this._cls1.this).cancel();
            cess._mth500(this._cls1.this).purge();
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
