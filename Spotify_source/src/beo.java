// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

public final class beo
{

    private final Context a;
    private final bgb b;

    private beo(Context context, bgb bgb1)
    {
        a = context;
        b = bgb1;
    }

    public beo(Context context, String s)
    {
        this(context, bfk.a(context, s, new cew()));
    }

    public final ben a()
    {
        ben ben1;
        try
        {
            ben1 = new ben(a, b.a());
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to build AdLoader.", remoteexception);
            return null;
        }
        return ben1;
    }

    public final beo a(bem bem)
    {
        try
        {
            b.a(new bfj(bem));
        }
        // Misplaced declaration of an exception variable
        catch (bem bem)
        {
            bka.c("Failed to set AdListener.", bem);
            return this;
        }
        return this;
    }

    public final beo a(bey bey)
    {
        try
        {
            b.a(new NativeAdOptionsParcel(bey));
        }
        // Misplaced declaration of an exception variable
        catch (bey bey)
        {
            bka.c("Failed to specify native ad options", bey);
            return this;
        }
        return this;
    }

    public final beo a(bfb bfb)
    {
        try
        {
            b.a(new cdb(bfb));
        }
        // Misplaced declaration of an exception variable
        catch (bfb bfb)
        {
            bka.c("Failed to add app install ad listener", bfb);
            return this;
        }
        return this;
    }

    public final beo a(bfd bfd)
    {
        try
        {
            b.a(new cdc(bfd));
        }
        // Misplaced declaration of an exception variable
        catch (bfd bfd)
        {
            bka.c("Failed to add content ad listener", bfd);
            return this;
        }
        return this;
    }
}
