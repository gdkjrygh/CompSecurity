// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            af, s

static final class b
    implements Runnable
{

    private af a;
    private int b;

    public final void run()
    {
        org.json.JSONObject jsonobject = a.a(b);
        a.a.a(jsonobject);
    }

    public (af af1)
    {
        a = null;
        a = af1;
        b = 2500;
    }
}
