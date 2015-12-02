// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.Bundle;
import android.os.Messenger;
import com.facebook.common.process.c;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public class a
{

    Messenger a;
    public final int b;
    public final c c;

    protected a(Messenger messenger, int i, c c1)
    {
        Preconditions.checkNotNull(c1);
        a = messenger;
        b = i;
        c = c1;
    }

    public static a a(Bundle bundle)
    {
        Messenger messenger = (Messenger)bundle.getParcelable("key_messenger");
        Preconditions.checkNotNull(messenger, "The messenger is not in the bundle passed in");
        int i = bundle.getInt("key_pid", -1);
        if (i == -1)
        {
            throw new IllegalArgumentException("The pid is not in the bundle passed in");
        } else
        {
            bundle = bundle.getString("key_process_name");
            Preconditions.checkNotNull(bundle, "The process name is not in the bundle passed in");
            return new a(messenger, i, com.facebook.common.process.c.a(bundle));
        }
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        b(bundle);
        return bundle;
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("key_messenger", a);
        bundle.putInt("key_pid", b);
        bundle.putString("key_process_name", c.b());
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof a)
        {
            flag = flag1;
            if (b == ((a)obj).b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return b;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("messenger: ", a).add("pid: ", Integer.valueOf(b)).add("process name:", c).toString();
    }
}
