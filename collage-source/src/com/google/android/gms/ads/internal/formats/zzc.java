// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;

public class zzc extends com.google.android.gms.internal.bj.a
{

    private final Uri mUri;
    private final Drawable zzvJ;

    public zzc(Drawable drawable, Uri uri)
    {
        zzvJ = drawable;
        mUri = uri;
    }

    public Uri getUri()
        throws RemoteException
    {
        return mUri;
    }

    public a zzdr()
        throws RemoteException
    {
        return b.a(zzvJ);
    }
}
