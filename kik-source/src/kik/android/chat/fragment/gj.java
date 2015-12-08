// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gj extends r
{

    final KikChatInfoFragment a;

    gj(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        KikChatInfoFragment.a(a, ((Bundle) (obj)));
    }
}
