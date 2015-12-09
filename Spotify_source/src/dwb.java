// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

public final class dwb
{

    public static dwc a(Uri uri)
    {
        dwc dwc1;
        Object obj;
        boolean flag1;
        flag1 = false;
        dwc1 = new dwc();
        dwc1.b = uri;
        obj = uri.getScheme();
        if ("http".equals(obj) || "https".equals(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L5:
        dwc1.a = flag;
        if (!uri.isHierarchical() || uri.getQueryParameter("sp_req_login_token") == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        dwc1.a = true;
        uri = dwc1.b;
        obj = new android.net.Uri.Builder();
        ((android.net.Uri.Builder) (obj)).scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        Iterator iterator = dmt.a(URI.create(uri.toString()), "UTF-8").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            uri = (dmm)iterator.next();
            if (!((String)((dmm) (uri)).first).equals("sp_req_login_token"))
            {
                String s = (String)((dmm) (uri)).first;
                if ((String)((dmm) (uri)).second == null)
                {
                    uri = "";
                } else
                {
                    uri = (String)((dmm) (uri)).second;
                }
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, uri);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_258;
_L2:
        obj = uri.getHost();
        if ("spotify.com".equals(obj)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!"www.spotify.com".equals(obj)) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (!uri.toString().contains("notoken"))
        {
            flag = true;
        }
          goto _L5
        dwc1.b = ((android.net.Uri.Builder) (obj)).build();
        return dwc1;
    }
}
