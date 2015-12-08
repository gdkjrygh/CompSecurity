// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bo
{

    public static void a(android.app.Notification.Builder builder, bt bt1)
    {
        int i = 0;
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(0, null, null);
        if (bt1.b() != null)
        {
            android.app.RemoteInput aremoteinput[] = ce.a(bt1.b());
            for (int j = aremoteinput.length; i < j; i++)
            {
                builder1.addRemoteInput(aremoteinput[i]);
            }

        }
        if (bt1.a() != null)
        {
            builder1.addExtras(bt1.a());
        }
        builder.addAction(builder1.build());
    }
}
