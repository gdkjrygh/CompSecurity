// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.networkmanager.NetworkManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mq extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void a(RC rc, pi pi1);

        public abstract void a(List list);
    }


    private final a mCallback;

    public mq(a a1)
    {
        registerCallback(RC, this);
        mCallback = a1;
    }

    static a a(mq mq1)
    {
        return mq1.mCallback;
    }

    public void execute()
    {
        mNetworkManager.a(this, new com.snapchat.android.networkmanager.NetworkManager.a() {

            final mq this$0;

            public final void a(oV ov, pi pi1)
            {
                if (!pi1.c())
                {
                    mq.a(mq.this).a(null, pi1);
                }
            }

            
            {
                this$0 = mq.this;
                super();
            }
        });
    }

    protected String getPath()
    {
        return "/lens/load_schedule";
    }

    public void onJsonResult(Object obj, pi pi1)
    {
label0:
        {
            obj = (RC)obj;
            if (pi1.c())
            {
                if (obj != null && ((RC) (obj)).b())
                {
                    break label0;
                }
                mCallback.a(((RC) (obj)), pi1);
            }
            return;
        }
        pi1 = ((RC) (obj)).a();
        obj = new ArrayList();
        for (pi1 = pi1.entrySet().iterator(); pi1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)pi1.next();
            Iterator iterator = ((List)entry.getValue()).iterator();
            while (iterator.hasNext()) 
            {
                BX bx = new BX((Rg)iterator.next());
                bx.mScheduleDate = (als)entry.getKey();
                ((List) (obj)).add(bx);
            }
        }

        mCallback.a(((List) (obj)));
    }
}
