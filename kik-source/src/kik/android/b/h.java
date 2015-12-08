// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.kik.cards.util.b;
import kik.android.chat.activity.k;
import kik.android.e.a;

// Referenced classes of package kik.android.b:
//            g

final class h
    implements a
{

    final g a;

    h(g g)
    {
        a = g;
        super();
    }

    public final Intent a(Context context, String s, int i)
    {
        Object obj;
        Uri uri;
        uri = Uri.parse(s);
        if (uri != null && uri.getScheme() != null && "native".equals(uri.getScheme()))
        {
            s = uri.getSchemeSpecificPart();
            context = s;
            if (s.startsWith("//"))
            {
                context = s.substring(2, s.length() - 2);
            }
            return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("kik-")).append(context).append("://").toString()));
        }
        if (uri == null || uri.toString().equals("data:///"))
        {
            return null;
        }
        obj = uri.getScheme();
        if (obj == null)
        {
            return null;
        }
        if (!((String) (obj)).equals("http")) goto _L2; else goto _L1
_L1:
        s = "card";
_L4:
        s = uri.buildUpon().scheme(s).toString();
        obj = new kik.android.chat.fragment.KikCardBrowserFragment.a();
        ((kik.android.chat.fragment.KikCardBrowserFragment.a) (obj)).a(s).b(b.b(s)).a(i);
        return k.a(((kik.android.util.an) (obj)), context).e();
_L2:
        s = ((String) (obj));
        if (((String) (obj)).equals("https"))
        {
            s = "cards";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
