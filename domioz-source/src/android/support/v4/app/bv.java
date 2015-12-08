// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            ca, co

final class bv
{

    public static void a(android.app.Notification.Builder builder, ca ca1)
    {
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(ca1.a(), ca1.b(), ca1.c());
        if (ca1.e() != null)
        {
            android.app.RemoteInput aremoteinput[] = co.a(ca1.e());
            int j = aremoteinput.length;
            for (int i = 0; i < j; i++)
            {
                builder1.addRemoteInput(aremoteinput[i]);
            }

        }
        if (ca1.d() != null)
        {
            builder1.addExtras(ca1.d());
        }
        builder.addAction(builder1.build());
    }
}
