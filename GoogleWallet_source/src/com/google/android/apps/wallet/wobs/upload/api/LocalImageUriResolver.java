// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload.api;

import android.net.Uri;

public interface LocalImageUriResolver
{

    public abstract boolean isLocalImageUri(Uri uri);

    public abstract Uri resolveLocalImageUri(Uri uri);
}
