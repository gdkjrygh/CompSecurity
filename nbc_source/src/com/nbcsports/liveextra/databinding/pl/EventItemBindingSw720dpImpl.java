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
import com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView;

// Referenced classes of package com.nbcsports.liveextra.databinding.pl:
//            EventItemBinding

public class EventItemBindingSw720dpImpl extends EventItemBinding
{
    public static class OnClickHandlersImpl
        implements android.view.View.OnClickListener
    {

        private com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers value;

        public void onClick(View view)
        {
            value.onClick(view);
        }

        public OnClickHandlersImpl setValue(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers handlers)
        {
            value = handlers;
            OnClickHandlersImpl onclickhandlersimpl = this;
            if (handlers == null)
            {
                onclickhandlersimpl = null;
            }
            return onclickhandlersimpl;
        }

        public OnClickHandlersImpl()
        {
        }
    }


    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder mBinder;
    private long mDirtyFlags;
    private com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers mHandlers;
    private OnClickHandlersImpl mOnClickHandlers;
    private final EventItemView mboundView0;
    private final LinearLayout mboundView1;
    private final TextView mboundView4;

    public EventItemBindingSw720dpImpl(View view)
    {
        this(view, mapBindings(view, 6, sIncludes, sViewsWithIds));
    }

    private EventItemBindingSw720dpImpl(View view, Object aobj[])
    {
        super(view, 4, (LinearLayout)aobj[5], (TextView)aobj[2], (ImageView)aobj[3]);
        mDirtyFlags = -1L;
        eventTime.setTag(null);
        mboundView0 = (EventItemView)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (LinearLayout)aobj[1];
        mboundView1.setTag(null);
        mboundView4 = (TextView)aobj[4];
        mboundView4.setTag(null);
        playIcon.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeBinder(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder, int i)
    {
        i;
        JVM INSTR lookupswitch 4: default 44
    //                   0: 113
    //                   20: 46
    //                   21: 90
    //                   35: 69;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L3:
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
_L5:
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
_L4:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2L;
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
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
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
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    private boolean onChangeIsStartBinder(ObservableBoolean observableboolean, int i)
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
        long l2;
        l2 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        Object obj = null;
        Object obj5 = null;
        Object obj3 = null;
        Object obj7 = null;
        Object obj2 = null;
        Object obj6 = null;
        Object obj4 = null;
        boolean flag4 = false;
        com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder = mBinder;
        boolean flag3 = false;
        boolean flag2 = false;
        com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers handlers = mHandlers;
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        long l1 = l2;
        boolean flag1 = flag3;
        if ((47L & l2) != 0L)
        {
            Object obj1 = obj7;
            if ((41L & l2) != 0L)
            {
                if (binder != null)
                {
                    obj = binder.time;
                }
                updateRegistration(0, ((android.databinding.Observable) (obj)));
                obj1 = obj7;
                if (obj != null)
                {
                    obj1 = (String)((ObservableField) (obj)).get();
                }
            }
            obj = obj6;
            long l = l2;
            if ((42L & l2) != 0L)
            {
                obj = obj5;
                if (binder != null)
                {
                    obj = binder.isStart;
                }
                updateRegistration(1, ((android.databinding.Observable) (obj)));
                flag1 = flag4;
                if (obj != null)
                {
                    flag1 = ((ObservableBoolean) (obj)).get();
                }
                if (flag1)
                {
                    l = l2 | 128L;
                } else
                {
                    l = l2 | 64L;
                }
                if (flag1)
                {
                    obj = getRoot().getResources().getString(0x7f070190);
                } else
                {
                    obj = getRoot().getResources().getString(0x7f0700e0);
                }
            }
            i = ((flag) ? 1 : 0);
            obj2 = obj;
            l1 = l;
            flag1 = flag3;
            obj3 = obj1;
            if ((44L & l) != 0L)
            {
                obj2 = obj4;
                if (binder != null)
                {
                    obj2 = binder.isSeekEnabled;
                }
                updateRegistration(2, ((android.databinding.Observable) (obj2)));
                flag1 = flag2;
                if (obj2 != null)
                {
                    flag1 = ((ObservableBoolean) (obj2)).get();
                }
                if (flag1)
                {
                    l1 = l | 512L;
                } else
                {
                    l1 = l | 256L;
                }
                if (flag1)
                {
                    i = getRoot().getResources().getColor(0x7f0e004a);
                    obj3 = obj1;
                    obj2 = obj;
                } else
                {
                    i = getRoot().getResources().getColor(0x7f0e0031);
                    obj2 = obj;
                    obj3 = obj1;
                }
            }
        }
        if ((41L & l1) != 0L)
        {
            eventTime.setText(((CharSequence) (obj3)));
        }
        if ((44L & l1) != 0L)
        {
            obj1 = mboundView1;
            if (mOnClickHandlers == null)
            {
                obj = (new OnClickHandlersImpl()).setValue(handlers);
                mOnClickHandlers = ((OnClickHandlersImpl) (obj));
            } else
            {
                obj = mOnClickHandlers.setValue(handlers);
            }
            ViewBindingAdapter.setOnClick(((View) (obj1)), ((android.view.View.OnClickListener) (obj)), flag1);
        }
        if ((42L & l1) != 0L)
        {
            mboundView4.setText(((CharSequence) (obj2)));
        }
        if ((44L & l1) != 0L)
        {
            BindingUtils.setImageTint(playIcon, i);
        }
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder getBinder()
    {
        return mBinder;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers getHandlers()
    {
        return mHandlers;
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
            return onChangeIsStartBinder((ObservableBoolean)obj, j);

        case 2: // '\002'
            return onChangeIsSeekEnabledBinder((ObservableBoolean)obj, j);

        case 3: // '\003'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder)
    {
        updateRegistration(3, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    public void setHandlers(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers handlers)
    {
        mHandlers = handlers;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 16L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        handlers;
        this;
        JVM INSTR monitorexit ;
        throw handlers;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 6: // '\006'
            setBinder((com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder)obj);
            return true;

        case 12: // '\f'
            setHandlers((com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers)obj);
            break;
        }
        return true;
    }

    static 
    {
        sViewsWithIds = new SparseIntArray();
        sViewsWithIds.put(0x7f0f0080, 5);
    }
}
