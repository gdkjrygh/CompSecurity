// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.pandora.android.util.SearchBox;
import com.pandora.android.util.s;

// Referenced classes of package p.ca:
//            s

class .Object
    implements com.pandora.android.util.chBox.a
{

    final p.ca.s a;

    public void a(String s1)
    {
        if (!s.h(a))
        {
            s.c(a, true);
        } else
        {
            s.a(a, s1);
            if (!s.a(s1))
            {
                s.i(a).d();
                return;
            }
        }
    }

    .String(p.ca.s s1)
    {
        a = s1;
        super();
    }
}
