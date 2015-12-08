// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import com.google.android.apps.photos.actionqueue.InternalReceiver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dio
    implements jhl
{

    private static final long a;
    private final noz b;
    private final Context c;

    public dio(Context context)
    {
        c = context;
        b = noz.a(context, 3, "OnlineActionService", new String[0]);
    }

    public final long a()
    {
        return a;
    }

    public final void a(Intent intent)
    {
        InternalReceiver.a(intent);
    }

    public final void b(Intent intent)
    {
        intent = (mmv)olm.a(c, mmv);
        npk npk1 = (npk)olm.a(c, npk);
        Iterator iterator = intent.a(new String[] {
            "logged_in"
        }).iterator();
label0:
        do
        {
            if (iterator.hasNext())
            {
                int j = ((Integer)iterator.next()).intValue();
                if (b.a())
                {
                    noy.a(j);
                }
                dij dij1 = new dij(c, j);
                dip dip1 = dip.a;
                int i = 0;
                do
                {
label1:
                    {
                        intent = dij1.a;
                        boolean flag;
                        if (0L == DatabaseUtils.longForQuery(mvj.b(((dik) (intent)).a, ((dik) (intent)).b), "SELECT count(*) FROM action_queue", null))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        intent = dip1;
                        if (flag)
                        {
                            if (npk1.a())
                            {
                                break label1;
                            }
                            intent = dip.b;
                        }
                        if (b.a())
                        {
                            noy.a(j);
                            noy.a("actions", Integer.valueOf(i));
                            noy.a("result", intent);
                        }
                        continue label0;
                    }
                    dij1.a();
                    i++;
                } while (true);
            }
            return;
        } while (true);
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(10L);
    }
}
