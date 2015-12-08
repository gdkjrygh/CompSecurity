// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class km
    implements android.view.View.OnTouchListener
{

    final KikConversationsFragment a;

    km(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return motionevent.getPointerCount() >= 2;
    }
}
