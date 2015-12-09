// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.AudioManager;

// Referenced classes of package android.support.v7.media:
//            SystemMediaRouteProvider

final class this._cls0 extends this._cls0
{

    final this._cls0 this$0;

    public void onSetVolume(int i)
    {
        this._mth0(this._cls0.this).setStreamVolume(3, i, 0);
        this._mth0(this._cls0.this);
    }

    public void onUpdateVolume(int i)
    {
        int j = this._mth0(this._cls0.this).getStreamVolume(3);
        if (Math.min(this._mth0(this._cls0.this).getStreamMaxVolume(3), Math.max(0, j + i)) != j)
        {
            this._mth0(this._cls0.this).setStreamVolume(3, j, 0);
        }
        this._mth0(this._cls0.this);
    }

    Y()
    {
        this$0 = this._cls0.this;
        super();
    }
}
