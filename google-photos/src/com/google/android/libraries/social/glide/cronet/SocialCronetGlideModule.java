// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.glide.cronet;

import alz;
import amc;
import android.content.Context;
import ata;
import atp;
import ayc;
import java.io.InputStream;
import java.nio.ByteBuffer;
import mji;
import mjj;
import mjm;
import nah;
import oni;

public final class SocialCronetGlideModule
    implements ayc
{

    private static final oni a = new oni("debug.photos.enable_net_log");

    public SocialCronetGlideModule()
    {
    }

    public final void a(Context context, alz alz)
    {
    }

    public final void a(Context context, amc amc1)
    {
        nah nah1 = new nah();
        context = new mjm(context);
        mjj mjj1 = new mjj(nah1, context);
        amc1.a.c(ata, java/io/InputStream, mjj1);
        amc1.b(ata, java/nio/ByteBuffer, new mji(nah1, context));
    }

}
