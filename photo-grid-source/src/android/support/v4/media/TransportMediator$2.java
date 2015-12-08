// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//            TransportMediator, TransportPerformer

class this._cls0
    implements android.view.tMediator._cls2
{

    final TransportMediator this$0;

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (TransportMediator.isMediaKey(i))
        {
            return mCallbacks.onMediaButtonDown(i, keyevent);
        } else
        {
            return false;
        }
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        return false;
    }

    public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
    {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (TransportMediator.isMediaKey(i))
        {
            return mCallbacks.onMediaButtonUp(i, keyevent);
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = TransportMediator.this;
        super();
    }
}
