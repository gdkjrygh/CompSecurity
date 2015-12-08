// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class nnf
{

    public final String a;
    final Context b;
    public final nkp c;
    final String d;
    final pyp e;
    final qor f;
    final pkw g;
    long h;
    String i;
    public boolean j;
    long k;
    Uri l;
    Uri m;
    nkp n;

    nnf(Context context, Uri uri, String s, String s1, pyp pyp, qor qor, pkw pkw)
    {
        b = context;
        l = uri;
        m = uri;
        d = s;
        e = pyp;
        f = qor;
        g = pkw;
        long l1;
        if (s1 == null)
        {
            s1 = b.c(context, uri);
        }
        a = s1;
        context = a(m);
        c = context;
        n = c;
        if (context == null)
        {
            l1 = 0L;
        } else
        {
            l1 = ((nkp) (context)).b;
        }
        k = l1;
        if (k <= 0L)
        {
            context = String.valueOf(m);
            throw new nmg((new StringBuilder(String.valueOf(context).length() + 17)).append("Empty content at ").append(context).toString());
        }
        s = null;
        int i1;
        if (oql.b(uri))
        {
            context = a(uri, a);
            s = ((nng) (context)).a;
            h = ((nng) (context)).b;
        } else
        {
            h = System.currentTimeMillis();
        }
        context = s;
        if (s == null)
        {
            context = uri.toString();
        }
        i1 = context.lastIndexOf('/');
        uri = context;
        if (i1 != -1)
        {
            uri = context.substring(i1 + 1);
        }
        i = uri;
    }

    private nng a(Uri uri, String s)
    {
_L1:
        s = b.getContentResolver().query(uri, new String[] {
            "datetaken", "_data"
        }, null, null, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        uri = new nng(s.getString(s.getColumnIndexOrThrow("_data")), s.getLong(s.getColumnIndexOrThrow("datetaken")));
        if (s != null)
        {
            s.close();
        }
        return uri;
        if (!oql.b(s) && !oql.c(s)) goto _L2; else goto _L1
_L2:
        uri = String.valueOf(uri);
        throw new nmf((new StringBuilder(String.valueOf(uri).length() + 20)).append("Invalid content at: ").append(uri).toString(), true);
        uri = String.valueOf(uri);
        throw new nmg((new StringBuilder(String.valueOf(uri).length() + 20)).append("No content for URI: ").append(uri).toString());
        uri;
_L4:
        if (s != null)
        {
            s.close();
        }
        throw uri;
        uri;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    nkp a(Uri uri)
    {
        ContentResolver contentresolver = b.getContentResolver();
        try
        {
            uri = nkp.b(contentresolver.openInputStream(uri));
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }
}
