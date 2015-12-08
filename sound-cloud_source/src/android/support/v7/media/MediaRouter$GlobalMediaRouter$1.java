// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.support.v4.media.session.MediaSessionCompat;

class this._cls0
    implements android.support.v4.media.session.eListener
{

    final moteControlClient this$0;

    public void onActiveChanged()
    {
label0:
        {
            if (cess._mth300(this._cls0.this) != null)
            {
                if (!cess._mth300(this._cls0.this).isActive())
                {
                    break label0;
                }
                dRemoteControlClient(cess._mth300(this._cls0.this).getRemoteControlClient());
            }
            return;
        }
        moveRemoteControlClient(cess._mth300(this._cls0.this).getRemoteControlClient());
    }

    iveChangeListener()
    {
        this$0 = this._cls0.this;
        super();
    }
}
