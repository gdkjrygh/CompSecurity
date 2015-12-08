// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.os.Bundle;
import com.kik.g.r;
import java.util.HashMap;

// Referenced classes of package kik.android.chat.activity:
//            k

final class l extends r
{

    final String a;

    l(String s)
    {
        a = s;
        super();
    }

    public final void a()
    {
        k.f().remove(a);
        super.a();
    }

    public final volatile void a(Object obj)
    {
        super.a((Bundle)obj);
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
    }
}
