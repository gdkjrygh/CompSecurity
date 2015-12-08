// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.content.res.Resources;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.adapters.ViewBindingAdapter;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView;

// Referenced classes of package com.nbcsports.liveextra.databinding.pl:
//            PlayItemBinding

public class PlayItemBindingImpl extends PlayItemBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder mBinder;
    private long mDirtyFlags;
    private com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler mHandler;
    private final PlayItemView mboundView0;
    private final LinearLayout mboundView1;
    private final TextView mboundView2;

    public PlayItemBindingImpl(View view)
    {
        this(view, mapBindings(view, 5, sIncludes, sViewsWithIds));
    }

    private PlayItemBindingImpl(View view, Object aobj[])
    {
        super(view, 4, (TextView)aobj[4], (ImageView)aobj[3]);
        mDirtyFlags = -1L;
        detail.setTag(null);
        mboundView0 = (PlayItemView)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (LinearLayout)aobj[1];
        mboundView1.setTag(null);
        mboundView2 = (TextView)aobj[2];
        mboundView2.setTag(null);
        playIcon.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeBinder(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder binder, int i)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   0: 82
    //                   9: 59
    //                   35: 38;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L4:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L3:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    private boolean onChangeDetailBinder(ObservableField observablefield, int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeIsSeekEnabledBinder(ObservableBoolean observableboolean, int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    private boolean onChangeTimeBinder(ObservableField observablefield, int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    protected void executeBindings()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        Object obj4 = null;
        String s1 = null;
        Object obj3 = null;
        Object obj2 = null;
        com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler handler = mHandler;
        Object obj1 = null;
        com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder binder = mBinder;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        ObservableField observablefield = null;
        int j = 0;
        boolean flag = false;
        if ((54L & l1) == 0L);
        Object obj = obj1;
        long l2 = l1;
        if ((63L & l1) != 0L)
        {
            String s = obj3;
            if ((37L & l1) != 0L)
            {
                obj = obj4;
                if (binder != null)
                {
                    obj = binder.time;
                }
                updateRegistration(0, ((android.databinding.Observable) (obj)));
                s = obj3;
                if (obj != null)
                {
                    s = (String)((ObservableField) (obj)).get();
                }
            }
            int i = ((flag) ? 1 : 0);
            long l = l1;
            if ((54L & l1) != 0L)
            {
                obj = obj2;
                if (binder != null)
                {
                    obj = binder.isSeekEnabled;
                }
                updateRegistration(1, ((android.databinding.Observable) (obj)));
                flag2 = flag3;
                if (obj != null)
                {
                    flag2 = ((ObservableBoolean) (obj)).get();
                }
                Exception exception;
                if (flag2)
                {
                    l1 |= 128L;
                } else
                {
                    l1 |= 64L;
                }
                i = ((flag) ? 1 : 0);
                l = l1;
                flag1 = flag2;
                if ((38L & l1) != 0L)
                {
                    if (flag2)
                    {
                        i = getRoot().getResources().getColor(0x7f0e004a);
                        flag1 = flag2;
                        l = l1;
                    } else
                    {
                        i = getRoot().getResources().getColor(0x7f0e0031);
                        l = l1;
                        flag1 = flag2;
                    }
                }
            }
            j = i;
            obj = obj1;
            l2 = l;
            flag2 = flag1;
            s1 = s;
            if ((44L & l) != 0L)
            {
                if (binder != null)
                {
                    observablefield = binder.detail;
                }
                updateRegistration(3, observablefield);
                j = i;
                obj = obj1;
                l2 = l;
                flag2 = flag1;
                s1 = s;
                if (observablefield != null)
                {
                    obj = (String)observablefield.get();
                    s1 = s;
                    flag2 = flag1;
                    l2 = l;
                    j = i;
                }
            }
        }
        if ((44L & l2) != 0L)
        {
            detail.setText(((CharSequence) (obj)));
        }
        if ((54L & l2) != 0L)
        {
            ViewBindingAdapter.setOnClick(mboundView1, handler, flag2);
        }
        if ((37L & l2) != 0L)
        {
            mboundView2.setText(s1);
        }
        if ((38L & l2) != 0L)
        {
            BindingUtils.setImageTint(playIcon, j);
        }
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder getBinder()
    {
        return mBinder;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler getHandler()
    {
        return mHandler;
    }

    public boolean hasPendingBindings()
    {
        this;
        JVM INSTR monitorenter ;
        if (mDirtyFlags != 0L)
        {
            return true;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void invalidateAll()
    {
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = 32L;
        this;
        JVM INSTR monitorexit ;
        requestRebind();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean onFieldChange(int i, Object obj, int j)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            return onChangeTimeBinder((ObservableField)obj, j);

        case 1: // '\001'
            return onChangeIsSeekEnabledBinder((ObservableBoolean)obj, j);

        case 2: // '\002'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder)obj, j);

        case 3: // '\003'
            return onChangeDetailBinder((ObservableField)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder binder)
    {
        updateRegistration(2, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    public void setHandler(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler handler)
    {
        mHandler = handler;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 16L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        handler;
        this;
        JVM INSTR monitorexit ;
        throw handler;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 11: // '\013'
            setHandler((com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler)obj);
            return true;

        case 6: // '\006'
            setBinder((com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder)obj);
            return true;
        }
    }

}
