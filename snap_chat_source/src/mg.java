// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class mg extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(Map map);
    }


    private static final String PATH = "/bq/flush_snap_state";
    private static final String TAG = "FlushSnapStateTask";
    private Map mEsIdToSnapStates;
    private a mFlushSnapStateCallback;

    public mg(Map map, a a1)
    {
        mEsIdToSnapStates = new HashMap();
        Map map1;
        Object obj;
        Object obj1;
        for (map = map.entrySet().iterator(); map.hasNext(); map1.put(obj, (new SD()).a(((SD) (obj1)).a()).a(((SD) (obj1)).b()).b(((SD) (obj1)).c()).a(((SD) (obj1)).d()).a(((SD) (obj1)).e()).b(((SD) (obj1)).g()).c(((SD) (obj1)).h())))
        {
            obj1 = (java.util.Map.Entry)map.next();
            map1 = mEsIdToSnapStates;
            obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (SD)((java.util.Map.Entry) (obj1)).getValue();
        }

        mFlushSnapStateCallback = a1;
        registerCallback(QR, this);
    }

    public final String getPath()
    {
        return "/bq/flush_snap_state";
    }

    public final pn getRequestPayload()
    {
        QQ qq = (new QQ()).a(mEsIdToSnapStates);
        Timber.c("FlushSnapStateTask", (new StringBuilder("Making request ")).append(qq).toString(), new Object[0]);
        return new oO(qq);
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (QR)obj;
        if (pi1.c() && obj != null)
        {
            if (IJ.a(((QR) (obj)).a()))
            {
                Timber.c("FlushSnapStateTask", "Failed due to request throttling", new Object[0]);
                mFlushSnapStateCallback.a();
                return;
            } else
            {
                mFlushSnapStateCallback.a(mEsIdToSnapStates);
                return;
            }
        } else
        {
            Timber.c("FlushSnapStateTask", (new StringBuilder("Failed to flush snap state to server: ")).append(pi1.mResponseCode).toString(), new Object[0]);
            mFlushSnapStateCallback.a();
            return;
        }
    }
}
