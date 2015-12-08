// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cqv extends brl
{

    private final int d;

    public cqv(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        d = j;
    }

    public final String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        Object obj = super.a;
        int i = super.b;
        int k = super.c;
        ((DataHolder) (obj)).a("data", i);
        obj = ((DataHolder) (obj)).d[k].getBlob(i, ((DataHolder) (obj)).c.getInt("data"));
        Object obj1 = new HashMap(d);
        for (int j = 0; j < d; j++)
        {
            cqt cqt1 = new cqt(a, b + j);
            if (cqt1.b("asset_key") != null)
            {
                ((Map) (obj1)).put(cqt1.b("asset_key"), cqt1);
            }
        }

        StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
        stringbuilder.append((new StringBuilder("uri=")).append(Uri.parse(b("path"))).toString());
        StringBuilder stringbuilder1 = new StringBuilder(", dataSz=");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(obj.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(((Map) (obj1)).size()).toString());
        if (flag && !((Map) (obj1)).isEmpty())
        {
            stringbuilder.append(", assets=[");
            obj1 = ((Map) (obj1)).entrySet().iterator();
            for (obj = ""; ((Iterator) (obj1)).hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((cqi)entry.getValue()).a()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
