// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.app.Dialog;
import android.widget.Toast;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddToPlaylistDialogFragment

private final class <init> extends DefaultSubscriber
{

    final AddToPlaylistDialogFragment this$0;

    public final void onNext(PropertySet propertyset)
    {
        propertyset = getDialog();
        Toast.makeText(getActivity(), 0x7f070069, 0).show();
        if (propertyset != null)
        {
            propertyset.dismiss();
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ()
    {
        this$0 = AddToPlaylistDialogFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
