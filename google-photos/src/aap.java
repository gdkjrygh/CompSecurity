// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;

final class aap extends aai
{

    private static final ArrayList i;
    private final AudioManager j;
    private final aar k = new aar(this);
    private int l;

    public aap(Context context)
    {
        super(context);
        l = -1;
        j = (AudioManager)context.getSystemService("audio");
        context.registerReceiver(k, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        a();
    }

    static AudioManager a(aap aap1)
    {
        return aap1.j;
    }

    private void a()
    {
        Object obj = super.a.getResources();
        int i1 = j.getStreamMaxVolume(3);
        l = j.getStreamVolume(3);
        obj = (new yq("DEFAULT_ROUTE", ((Resources) (obj)).getString(b.cf))).a(i).b(3).a(0).e(1).d(i1).c(l).a();
        a((new yy()).a(((yp) (obj))).a());
    }

    static void b(aap aap1)
    {
        aap1.a();
    }

    static int c(aap aap1)
    {
        return aap1.l;
    }

    public final yw a(String s)
    {
        if (s.equals("DEFAULT_ROUTE"))
        {
            return new aaq(this);
        } else
        {
            return null;
        }
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arraylist = new ArrayList();
        i = arraylist;
        arraylist.add(intentfilter);
    }
}
