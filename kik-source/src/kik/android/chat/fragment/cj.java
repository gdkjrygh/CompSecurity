// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            ci, ck, KikChatFragment

final class cj extends r
{

    final String a;
    final ci b;

    cj(ci ci1, String s)
    {
        b = ci1;
        a = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        b.a.b(new ck(this, ((Boolean) (obj))));
    }
}
