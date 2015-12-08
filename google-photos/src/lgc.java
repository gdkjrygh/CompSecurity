// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

final class lgc
    implements Runnable
{

    private String a;
    private Integer b;
    private lfn c;
    private lga d;
    private lgb e;

    lgc(lgb lgb1, String s, Integer integer, lfn lfn1, lga lga1)
    {
        e = lgb1;
        a = s;
        b = integer;
        c = lfn1;
        d = lga1;
        super();
    }

    public final void run()
    {
        Integer integer;
        lga lga1;
        lgb lgb1;
        Object obj;
        Object obj1;
        lgb1 = e;
        obj1 = a;
        integer = b;
        obj = c;
        lga1 = d;
        lqh.d("DiskLoader: Starting to load resource from Disk.");
        Object obj2 = ((lfn) (obj)).a(lgb.a(new FileInputStream(lgb1.b(((String) (obj1))))));
        if (obj2 != null)
        {
            try
            {
                lqh.d((new StringBuilder("Saved resource loaded: ")).append(lgb.c(((String) (obj1)))).toString());
                lga1.a(Status.a, obj2, lgb.b, lgb1.a(((String) (obj1))));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                lqh.a((new StringBuilder("Saved resource not found: ")).append(lgb.c(((String) (obj1)))).toString());
            }
            catch (lfz lfz2)
            {
                lqh.a((new StringBuilder("Saved resource is corrupted: ")).append(lgb.c(((String) (obj1)))).toString());
            }
        }
        if (integer == null)
        {
            lga1.a(Status.c, null, null, 0L);
            return;
        }
        obj1 = lgb1.c.getResources().openRawResource(integer.intValue());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        obj = ((lfn) (obj)).a(lgb.a(((java.io.InputStream) (obj1))));
        if (obj != null)
        {
            try
            {
                lqh.d((new StringBuilder("Default resource loaded: ")).append(lgb1.c.getResources().getResourceEntryName(integer.intValue())).toString());
                lga1.a(Status.a, obj, lgb.a, 0L);
                return;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                lqh.a((new StringBuilder("Default resource not found. ID: ")).append(integer).toString());
            }
            catch (lfz lfz1)
            {
                lqh.a((new StringBuilder("Default resource resource is corrupted: ")).append(integer).toString());
            }
        }
        lga1.a(Status.c, null, null, 0L);
        return;
    }
}
