// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kg
    implements Runnable
{

    final int a;
    final KikConversationsFragment b;

    kg(KikConversationsFragment kikconversationsfragment, int i)
    {
        b = kikconversationsfragment;
        a = i;
        super();
    }

    public final void run()
    {
        Toast.makeText(b.k.getContext(), b.getString(a), 0).show();
    }
}
