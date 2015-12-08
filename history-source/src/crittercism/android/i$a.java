// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            i

static final class a
    implements Runnable
{

    private boolean a;
    private boolean b;
    private i c;

    public final boolean a()
    {
        return b;
    }

    public final void run()
    {
        if (a)
        {
            b = c.c();
            return;
        } else
        {
            c.b();
            return;
        }
    }

    public (i j)
    {
        b = false;
        c = j;
        a = true;
    }
}
