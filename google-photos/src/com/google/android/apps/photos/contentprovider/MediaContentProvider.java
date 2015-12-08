// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import eip;
import eir;
import eis;
import eiz;
import ejb;
import ejc;
import eje;
import ejg;
import ejn;
import ejv;
import ekp;
import feu;
import fzu;
import fzw;
import java.util.Arrays;
import noy;
import noz;
import olm;
import p;

public class MediaContentProvider extends ContentProvider
{

    private UriMatcher a;
    private ejn b;
    private eis c;
    private eip d;
    private ejc e;
    private eje f;
    private noz g;

    public MediaContentProvider()
    {
    }

    private boolean a(Uri uri)
    {
        return a.match(uri) != -1;
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        a = eiz.a(providerinfo.authority);
        b = (ejn)olm.a(context, ejn);
        c = (eis)olm.a(context, eis);
        e = (ejc)olm.a(context, ejc);
        d = (eip)olm.a(context, eip);
        f = (eje)olm.a(context, eje);
        g = noz.a(context, 3, "MediaContentProvider", new String[0]);
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException("delete not supported");
    }

    public String getType(Uri uri)
    {
        if (a(uri))
        {
            return ejv.a(b.a(uri));
        } else
        {
            return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("delete not supported");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        boolean flag = a(uri);
        String s1 = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(s1).length() + 17)).append("Unsupported Uri: ").append(s1).toString());
        flag = "r".equals(s);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unsupported mode on read-only provider: ".concat(s);
        } else
        {
            s = new String("Unsupported mode on read-only provider: ");
        }
        p.a(flag, s);
        s = eiz.a(uri);
        if (g.a())
        {
            noy.a("uri", uri);
            noy.a("identifier", s);
        }
        return d.a(s, f);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        boolean flag = a(uri);
        s = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(s).length() + 17)).append("Unsupported Uri: ").append(s).toString());
        s = eiz.a(uri);
        if (g.a())
        {
            noy.a("uri", uri);
            noy.a("identifier", s);
            noy.a("projection", Arrays.toString(as));
        }
        as1 = e;
        uri = ((eiz) (s)).d.getScheme();
        if ("content".equals(uri))
        {
            uri = as1.a(s);
        } else
        if ("file".equals(uri))
        {
            uri = as1.b(s);
            uri.b = ((ejc) (as1)).b.a(s);
            s = ((eiz) (s)).d.getLastPathSegment();
            if (!TextUtils.isEmpty(s))
            {
                uri.a = s;
            }
            uri = uri.a();
        } else
        if ("mediaKey".equals(uri))
        {
            uri = as1.b(s);
            uri.b = ((ejc) (as1)).b.a(s);
            s = ((ejc) (as1)).c.a(s, ejc.a);
            if (s != null)
            {
                as1 = (feu)s.b(feu);
                if (as1 != null)
                {
                    as1 = ((feu) (as1)).b;
                    if (!TextUtils.isEmpty(as1))
                    {
                        uri.a = as1;
                    }
                }
                s = (fzu)s.b(fzu);
                if (s != null)
                {
                    s = ((fzu) (s)).a.c;
                    if (s != null)
                    {
                        uri.f = s.longValue();
                    }
                }
            }
            uri = uri.a();
        } else
        {
            uri = String.valueOf(((eiz) (s)).d);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 24)).append("Uri has unknown scheme: ").append(uri).toString());
        }
        return eis.a(as, uri);
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("update not supported");
    }
}
