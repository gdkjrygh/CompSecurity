// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

class o
{

    static InputStream a(ContentResolver contentresolver, Uri uri)
    {
        return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
    }
}
