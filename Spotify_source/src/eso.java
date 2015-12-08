// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class eso
{

    public final String a;
    public int b;
    public int c;
    public boolean d;

    public eso(String s, int i, int j, boolean flag)
    {
        a = s;
        c = i;
        b = j;
        d = flag;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        boolean flag1;
        if (flag != d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1, (new StringBuilder("following is already ")).append(flag).toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        i = c + 1;
        c = i;
_L1:
        c = i;
        d = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        i = c - 1;
        c = i;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof eso))
            {
                return false;
            }
            obj = (eso)obj;
            if (!TextUtils.equals(a, ((eso) (obj)).a) || b != ((eso) (obj)).b || c != ((eso) (obj)).c || d != ((eso) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        int k;
        int l;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        k = b;
        l = c;
        if (d)
        {
            j = 1;
        }
        return ((i * 31 + k) * 31 + l) * 31 + j;
    }

    public final String toString()
    {
        return String.format(Locale.US, "uri: %s  followingCount: %s  followersCount: %s  isFollowing: %s", new Object[] {
            a, Integer.valueOf(b), Integer.valueOf(c), Boolean.valueOf(d)
        });
    }
}
