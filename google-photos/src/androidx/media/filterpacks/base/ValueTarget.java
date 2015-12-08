// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import ajw;
import akv;
import android.os.Handler;
import k;

public final class ValueTarget extends ahn
{

    private Handler mHandler;
    private k mListener$767da1bc;

    public ValueTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mListener$767da1bc = null;
        mHandler = null;
    }

    public final ajw b()
    {
        return (new ajw()).a("value", 2, aif.b()).a();
    }

    protected final void e()
    {
        Object obj;
label0:
        {
            obj = a("value").a().d();
            if (mListener$767da1bc != null)
            {
                if (mHandler == null)
                {
                    break label0;
                }
                obj = ((aig) (obj)).m();
                mHandler.post(new akv(this, obj));
            }
            return;
        }
        ((aig) (obj)).m();
    }
}
