// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.internal.provider.SpotifyProvider;
import ecf;
import gmm;
import java.io.IOException;

public class MediaProvider extends ContentProvider
{

    private UriMatcher a;
    private ecf b;

    public MediaProvider()
    {
    }

    private boolean a()
    {
        String as[];
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        if (b == null)
        {
            b = new ecf(getContext());
        }
        j = Binder.getCallingUid();
        as = getContext().getPackageManager().getPackagesForUid(j);
        flag = flag1;
        if (as == null) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= k) goto _L2; else goto _L3
_L3:
        String s = as[i];
        if (!b.a(getContext(), s, j)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b()
    {
        String s = getContext().getString(0x7f08064e);
        a = new UriMatcher(-1);
        a.addURI(s, "image/*", 0);
        a.addURI(s, "background", 1);
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        return null;
    }

    public boolean onCreate()
    {
        gmm.a(getContext());
        return true;
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a()) goto _L2; else goto _L1
_L1:
        uri = super.openAssetFile(uri, s);
_L5:
        this;
        JVM INSTR monitorexit ;
        return uri;
_L2:
        if (a == null)
        {
            b();
        }
        a.match(uri);
        JVM INSTR tableswitch 1 1: default 128
    //                   1 66;
           goto _L3 _L4
_L3:
        uri = super.openAssetFile(uri, s);
          goto _L5
_L4:
        long l = Binder.clearCallingIdentity();
        AssetFileDescriptor assetfiledescriptor = getContext().getAssets().openFd("mediaapi_background.png");
        uri = assetfiledescriptor;
        Binder.restoreCallingIdentity(l);
          goto _L5
        uri;
        throw uri;
        IOException ioexception;
        ioexception;
        Logger.a(ioexception, ioexception.getMessage(), new Object[0]);
        Binder.restoreCallingIdentity(l);
          goto _L3
        uri;
        Binder.restoreCallingIdentity(l);
        throw uri;
          goto _L5
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a()) goto _L2; else goto _L1
_L1:
        uri = super.openFile(uri, s);
_L5:
        this;
        JVM INSTR monitorexit ;
        return uri;
_L2:
        if (a == null)
        {
            b();
        }
        a.match(uri);
        JVM INSTR tableswitch 0 0: default 119
    //                   0 66;
           goto _L3 _L4
_L3:
        uri = super.openFile(uri, s);
          goto _L5
_L4:
        long l = Binder.clearCallingIdentity();
        uri = SpotifyProvider.b.buildUpon().encodedPath(uri.getEncodedPath()).build();
        uri = getContext().getContentResolver().openFileDescriptor(uri, s);
        Binder.restoreCallingIdentity(l);
          goto _L5
        uri;
        throw uri;
        uri;
        Binder.restoreCallingIdentity(l);
        throw uri;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }
}
