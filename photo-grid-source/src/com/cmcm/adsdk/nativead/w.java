// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import com.cmcm.a.a.a;
import com.cmcm.a.a.c;
import com.cmcm.a.a.d;
import com.cmcm.adsdk.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            h

public abstract class w
    implements c
{

    protected String mAdTypeName;
    protected Context mContext;
    protected h mNativeAdListener;
    public String mPositionId;
    protected e requestParams;

    protected w(Context context, String s, String s1)
    {
        mPositionId = null;
        mContext = context;
        mPositionId = s;
        mAdTypeName = s1;
    }

    protected abstract List getAdList(int i);

    public String getAdName()
    {
        return mAdTypeName;
    }

    protected abstract void removeAdFromPool(a a1);

    protected void removeExpiredAds(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (list == null) goto _L2; else goto _L1
_L1:
        int i = list.size();
        if (i != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        list = list.iterator();
        while (list.hasNext()) 
        {
            if (((a)list.next()).i())
            {
                list.remove();
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
        list;
        throw list;
    }

    public void setAdListener(d d)
    {
    }

    public void setLoadCallBack(h h)
    {
        mNativeAdListener = h;
    }

    public void setRequestParams(e e)
    {
        requestParams = e;
    }
}
