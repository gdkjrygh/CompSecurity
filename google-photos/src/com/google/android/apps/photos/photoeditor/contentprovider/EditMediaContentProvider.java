// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.photoeditor.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import b;
import eip;
import eix;
import eiy;
import eiz;
import ejm;
import euv;
import gtt;
import gtv;
import gtw;
import gtx;
import gty;
import gum;
import gur;
import olm;
import p;

public final class EditMediaContentProvider extends ContentProvider
{

    private static String a[] = {
        "original_uri_fullsize", "original_uri_screennail", "original_uri_thumbnail", "edit_data"
    };
    private UriMatcher b;
    private gtx c;
    private gty d;

    public EditMediaContentProvider()
    {
    }

    public static String a(Context context)
    {
        return context.getString(b.ug);
    }

    private static boolean a(Uri uri, UriMatcher urimatcher)
    {
        return urimatcher.match(uri) != -1;
    }

    public final void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        c = (gtx)olm.a(context, gtx);
        d = (gty)olm.a(context, gty);
        context = context.getString(b.ug);
        providerinfo = new UriMatcher(-1);
        providerinfo.addURI(context, "#/#", 0);
        providerinfo.addURI(context, "#/#/*", 1);
        b = providerinfo;
    }

    public final int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException("delete not supported");
    }

    public final String getType(Uri uri)
    {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("insert not supported");
    }

    public final boolean onCreate()
    {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String s)
    {
        boolean flag = s.equals("r");
        s = String.valueOf(s);
        gum gum1;
        if (s.length() != 0)
        {
            s = "Unsupported mode on read-only provider: ".concat(s);
        } else
        {
            s = new String("Unsupported mode on read-only provider: ");
        }
        p.a(flag, s);
        flag = a(uri, b);
        s = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(s).length() + 17)).append("Unsupported Uri: ").append(s).toString());
        s = gtt.a(uri);
        uri = d;
        if (((gtt) (s)).c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "openFileRequest must include a content size.");
        gum1 = ((gty) (uri)).b.a(((gtt) (s)).a, ((gtt) (s)).b);
        if (gum1 == null)
        {
            long l = ((gtt) (s)).b;
            throw new IllegalArgumentException((new StringBuilder(44)).append("Edit ID ").append(l).append(" does not exist.").toString());
        } else
        {
            s = new eiz(((gtt) (s)).a, euv.b, gum1.b, ((gtt) (s)).c);
            return ((gty) (uri)).a.a(s, ((gty) (uri)).c);
        }
    }

    public final Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        boolean flag1 = true;
        boolean flag = a(uri, b);
        s = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(s).length() + 17)).append("Unsupported Uri: ").append(s).toString());
        s = as;
        if (as == null)
        {
            s = a;
        }
        uri = gtt.a(uri);
        as = c;
        as1 = ((gtx) (as)).a.a(((gtt) (uri)).a, ((gtt) (uri)).b);
        if (as1 == null)
        {
            long l = ((gtt) (uri)).b;
            throw new IllegalArgumentException((new StringBuilder(44)).append("Edit ID ").append(l).append(" does not exist.").toString());
        }
        s1 = new gtw();
        s1.a = as.a(uri, ejm.c);
        s1.b = as.a(uri, ejm.b);
        s1.c = as.a(uri, ejm.a);
        s1.d = ((gum) (as1)).g;
        if (!b.c(((gtw) (s1)).a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must provide openFile() uri for fullsize original");
        if (!b.c(((gtw) (s1)).b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must provide openFile() uri for screennail original");
        if (!b.c(((gtw) (s1)).c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must provide openFile() uri for thumbnail original");
        if (((gtw) (s1)).d != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must set editData");
        uri = new gtv(s1);
        as = new eix(s);
        s = as.a();
        s.a("original_uri_fullsize", ((gtv) (uri)).a).a("original_uri_screennail", ((gtv) (uri)).b).a("original_uri_thumbnail", ((gtv) (uri)).c).a("edit_data", ((gtv) (uri)).d);
        as.a(s);
        return ((eix) (as)).a;
    }

    public final int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("update not supported");
    }

}
