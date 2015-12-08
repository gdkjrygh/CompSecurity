// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.fragments.settings.customfriendmoji.FriendmojiPickerFragment;
import com.squareup.otto.Bus;

final class lang.Object
    implements android.view.OnClickListener
{

    private java.util.ntry a;

    public final void onClick(View view)
    {
        Mf.a().a(new Oi(FriendmojiPickerFragment.a((String)a.getKey())));
    }

    >(java.util.ntry ntry)
    {
        a = ntry;
        super();
    }
}
