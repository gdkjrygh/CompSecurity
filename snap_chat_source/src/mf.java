// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.model.Friend;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class mf extends oD
    implements oS.a
{

    public static final int MIN_USERNAME_LENGTH = 3;
    private static final String TAG = "FindVerifiedUserTask";
    private final Bus mBus;
    private final String mQuery;
    private final List mVerifiedFriends;

    public mf(String s)
    {
        this(s, Mf.a());
    }

    private mf(String s, Bus bus)
    {
        mVerifiedFriends = new ArrayList();
        mQuery = s;
        mBus = bus;
        registerCallback(QU, this);
    }

    static List a(mf mf1)
    {
        return mf1.mVerifiedFriends;
    }

    public abstract void a(List list);

    public abstract void b(List list);

    public String getPath()
    {
        return "/bq/find_verified_user";
    }

    public pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new QT()).a(mQuery)));
    }

    public void onJsonResult(Object obj, pi pi1)
    {
        obj = (QU)obj;
        if (pi1.c() && obj != null)
        {
            if (((QU) (obj)).b())
            {
                for (obj = ((QU) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); mVerifiedFriends.add(new Friend(pi1)))
                {
                    pi1 = (QV)((Iterator) (obj)).next();
                }

            }
            PG.a(new Runnable() {

                final mf this$0;

                public final void run()
                {
                    b(mf.a(mf.this));
                }

            
            {
                this$0 = mf.this;
                super();
            }
            });
            return;
        } else
        {
            Timber.d("FindVerifiedUserTask", "Request failed: %s", new Object[] {
                pi1.d()
            });
            mBus.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f0801fb));
            PG.a(new Runnable() {

                final mf this$0;

                public final void run()
                {
                    a(mf.a(mf.this));
                }

            
            {
                this$0 = mf.this;
                super();
            }
            });
            return;
        }
    }
}
