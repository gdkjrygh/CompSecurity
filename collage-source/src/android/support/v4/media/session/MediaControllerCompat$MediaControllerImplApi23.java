// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat

static class <init> extends <init>
{

    public <init> getTransportControls()
    {
        Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
        if (obj != null)
        {
            return new nit>(obj);
        } else
        {
            return null;
        }
    }

    public (Context context,  )
        throws RemoteException
    {
        super(context, );
    }

    public <init>(Context context, MediaSessionCompat mediasessioncompat)
    {
        super(context, mediasessioncompat);
    }
}
