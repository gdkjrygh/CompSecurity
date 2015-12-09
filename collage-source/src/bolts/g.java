// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;

// Referenced classes of package bolts:
//            f

public class g
{

    private final f a = new f();

    public g()
    {
    }

    public boolean a()
    {
        return a.a();
    }

    public void b()
    {
        a.b();
    }

    public String toString()
    {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
            getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(a())
        });
    }
}
