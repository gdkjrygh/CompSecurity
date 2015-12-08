// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

final class jfh extends mtf
{

    private final int a;
    private final String b;
    private final jdy c;
    private final jdr j;

    public jfh(int i, String s, jdy jdy1, jdr jdr)
    {
        super("RequestMediaItemTask");
        a = i;
        b = s;
        c = jdy1;
        j = jdr;
    }

    protected final mue a(Context context)
    {
        Object obj;
        obj = null;
        int i = a;
        String s = b;
        ArrayList arraylist = new ArrayList();
        arraylist.add(djf.a(s));
        context = djh.a(context, i, arraylist);
        context.d();
        if (!context.l()) goto _L2; else goto _L1
_L1:
        context = obj;
_L4:
        if (context == null)
        {
            return new mue(false);
        }
        break; /* Loop/switch isn't completed */
_L2:
        qgg aqgg[] = ((djh) (context)).a.b;
        context = obj;
        if (aqgg != null)
        {
            context = obj;
            if (aqgg.length != 0)
            {
                context = aqgg[0];
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1 = c;
        jdr jdr = j;
        if (((jdy) (obj1)).a())
        {
            context = jdy.a(((jdy) (obj1)).a.a.toString(), context, jdr);
        } else
        {
            context = jdy.a(context, jdr);
        }
        obj1 = new mue(true);
        ((mue) (obj1)).a().putParcelable("videoFeature", context);
        return ((mue) (obj1));
    }
}
