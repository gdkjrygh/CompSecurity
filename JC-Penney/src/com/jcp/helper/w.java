// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.jcp.pojo.LocalAdProduct;

// Referenced classes of package com.jcp.helper:
//            v

class w
    implements Runnable
{

    final v a;
    private String b;
    private String c;

    public w(v v1, String s, String s1)
    {
        a = v1;
        super();
        b = s1;
        c = s;
    }

    public void run()
    {
        int j = 0;
        String s = v.a(a, b);
        Bundle bundle = new Bundle();
        bundle.putString("publicationId", c);
        if (s != null)
        {
            LocalAdProduct alocaladproduct[] = v.b(a, s);
            int l = alocaladproduct.length;
            for (int i = 0; i < l;)
            {
                LocalAdProduct localadproduct = alocaladproduct[i];
                int k = j;
                if (!TextUtils.isEmpty(localadproduct.getCategory()))
                {
                    k = j;
                    if (!TextUtils.isEmpty(localadproduct.getSku()))
                    {
                        k = v.a(a, j, localadproduct);
                    }
                }
                i++;
                j = k;
            }

            a.a.send(4, bundle);
            return;
        } else
        {
            a.a.send(2, bundle);
            return;
        }
    }
}
