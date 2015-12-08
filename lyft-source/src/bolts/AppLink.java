// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public class AppLink
{

    private Uri a;
    private List b;
    private Uri c;

    public AppLink(Uri uri, List list, Uri uri1)
    {
        a = uri;
        uri = list;
        if (list == null)
        {
            uri = Collections.emptyList();
        }
        b = uri;
        c = uri1;
    }
}
