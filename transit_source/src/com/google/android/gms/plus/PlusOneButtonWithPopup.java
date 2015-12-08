// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fm;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton, PlusOneDummyView

public final class PlusOneButtonWithPopup extends ViewGroup
{

    private String hN;
    private String it;
    private int mSize;
    private View re;
    private int rf;
    private android.view.View.OnClickListener rk;

    public PlusOneButtonWithPopup(Context context)
    {
        this(context, null);
    }

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = PlusOneButton.getSize(context, attributeset);
        rf = PlusOneButton.getAnnotation(context, attributeset);
        re = new PlusOneDummyView(context, mSize);
        addView(re);
    }

    private int c(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        switch (k)
        {
        default:
            return i;

        case -2147483648: 
        case 1073741824: 
            return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j, k);
        }
    }

    private void cS()
    {
        if (re != null)
        {
            removeView(re);
        }
        re = fm.a(getContext(), mSize, rf, hN, it);
        if (rk != null)
        {
            setOnClickListener(rk);
        }
        addView(re);
    }

    private fj cT()
        throws RemoteException
    {
        fj fj1 = com.google.android.gms.internal.fj.a.ap((IBinder)re.getTag());
        if (fj1 == null)
        {
            if (Log.isLoggable("PlusOneButtonWithPopup", 5))
            {
                Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
            }
            throw new RemoteException();
        } else
        {
            return fj1;
        }
    }

    public void cancelClick()
    {
        if (re == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        cT().cancelClick();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public PendingIntent getResolution()
    {
        if (re == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        PendingIntent pendingintent = cT().getResolution();
        return pendingintent;
        RemoteException remoteexception;
        remoteexception;
        return null;
    }

    public void initialize(String s, String s1)
    {
        dm.a(s, "Url must not be null");
        hN = s;
        it = s1;
        cS();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        re.layout(getPaddingLeft(), getPaddingTop(), k - i - getPaddingRight(), l - j - getPaddingBottom());
    }

    protected void onMeasure(int i, int j)
    {
        int k = getPaddingLeft() + getPaddingRight();
        int l = getPaddingTop() + getPaddingBottom();
        re.measure(c(i, k), c(j, l));
        setMeasuredDimension(k + re.getMeasuredWidth(), l + re.getMeasuredHeight());
    }

    public void reinitialize()
    {
        if (re == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        cT().reinitialize();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public void setAnnotation(int i)
    {
        rf = i;
        cS();
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        rk = onclicklistener;
        re.setOnClickListener(onclicklistener);
    }

    public void setSize(int i)
    {
        mSize = i;
        cS();
    }
}
