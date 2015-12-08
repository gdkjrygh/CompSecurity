// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.view.View;
import com.google.wallet.wobl.exception.WoblException;
import java.net.URI;

public interface WoblHolder
{

    public abstract void cancel();

    public abstract View getView()
        throws WoblException;

    public abstract void setSource(com.google.wallet.proto.NanoWalletWobl.Layout layout, URI uri);
}
