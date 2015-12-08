// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.e.i;
import kik.android.util.bf;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ff extends bf
{

    final KikChatFragment a;

    ff(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        a.k.b(KikChatFragment.z(a));
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        if (KikChatFragment.aM(a) > 0)
        {
            KikChatFragment.aN(a);
        }
    }
}
