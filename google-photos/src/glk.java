// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public class glk
{

    final ekk a;

    public glk(Context context)
    {
        Object obj = olm.c(context, gkg);
        context = new ekm();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); context.a(((gkg)((Iterator) (obj)).next()).a)) { }
        a = context.a();
    }
}
