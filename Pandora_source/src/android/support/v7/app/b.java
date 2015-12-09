// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            g, ActionBarActivity

class b extends g
{
    class a extends e.a
    {

        final b a;

        a(android.view.Window.Callback callback)
        {
            a = b.this;
            super(b.this, callback);
        }
    }


    b(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new a(callback);
    }
}
