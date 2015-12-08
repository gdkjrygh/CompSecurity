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
//            GoalEventItemBinding

public class GoalEventItemBindingSw600dpImpl extends GoalEventItemBinding
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
    private final TextView mboundView3;
    private final TextView mboundView6;

    public GoalEventItemBindingSw600dpImpl(View view)
    {
        this(view, mapBindings(view, 8, sIncludes, sViewsWithIds));
    }

    private GoalEventItemBindingSw600dpImpl(View view, Object aobj[])
    {
        super(view, 6, (LinearLayout)aobj[7], (TextView)aobj[4], (ImageView)aobj[5], (ImageView)aobj[2]);
        mDirtyFlags = -1L;
        eventTime.setTag(null);
        mboundView0 = (EventItemView)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (LinearLayout)aobj[1];
        mboundView1.setTag(null);
        mboundView3 = (TextView)aobj[3];
        mboundView3.setTag(null);
        mboundView6 = (TextView)aobj[6];
        mboundView6.setTag(null);
        playIcon.setTag(null);
        teamShield.setTag(null);
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
        JVM INSTR lookupswitch 6: default 60
    //                   0: 175
    //                   20: 62
    //                   23: 152
    //                   31: 108
    //                   33: 85
    //                   35: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
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
_L6:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 16L;
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
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L7:
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
        mDirtyFlags = mDirtyFlags | 32L;
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

    private boolean onChangeLastNameBinder(ObservableField observablefield, int i)
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

    private boolean onChangeTeamAbbrBinder(ObservableField observablefield, int i)
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
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeTeamIconBinder(ObservableField observablefield, int i)
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
        mDirtyFlags = mDirtyFlags | 16L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
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
        String s1 = null;
        Object obj8 = null;
        Object obj1 = null;
        ObservableField observablefield = null;
        String s3 = null;
        Object obj9 = null;
        Object obj7 = null;
        Object obj6 = null;
        ObservableField observablefield1 = null;
        Object obj3 = null;
        Object obj5 = null;
        com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder = mBinder;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        Object obj4 = null;
        com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers handlers = mHandlers;
        int j = 0;
        int i = 0;
        long l2 = l1;
        String s2 = obj4;
        if ((191L & l1) != 0L)
        {
            String s = obj9;
            if ((161L & l1) != 0L)
            {
                if (binder != null)
                {
                    obj1 = binder.time;
                }
                updateRegistration(0, ((android.databinding.Observable) (obj1)));
                s = obj9;
                if (obj1 != null)
                {
                    s = (String)((ObservableField) (obj1)).get();
                }
            }
            obj1 = obj8;
            if ((162L & l1) != 0L)
            {
                if (binder != null)
                {
                    observablefield = binder.teamAbbr;
                }
                updateRegistration(1, observablefield);
                obj1 = obj8;
                if (observablefield != null)
                {
                    obj1 = (String)observablefield.get();
                }
            }
            long l = l1;
            if ((164L & l1) != 0L)
            {
                Object obj2 = obj7;
                if (binder != null)
                {
                    obj2 = binder.isSeekEnabled;
                }
                updateRegistration(2, ((android.databinding.Observable) (obj2)));
                flag = flag2;
                if (obj2 != null)
                {
                    flag = ((ObservableBoolean) (obj2)).get();
                }
                if (flag)
                {
                    l = l1 | 512L;
                } else
                {
                    l = l1 | 256L;
                }
                if (flag)
                {
                    i = getRoot().getResources().getColor(0x7f0e004a);
                } else
                {
                    i = getRoot().getResources().getColor(0x7f0e0031);
                }
            }
            obj2 = obj5;
            if ((168L & l) != 0L)
            {
                obj3 = obj6;
                if (binder != null)
                {
                    obj3 = binder.lastName;
                }
                updateRegistration(3, ((android.databinding.Observable) (obj3)));
                obj2 = obj5;
                if (obj3 != null)
                {
                    obj2 = (String)((ObservableField) (obj3)).get();
                }
            }
            j = i;
            l2 = l;
            flag1 = flag;
            obj3 = obj2;
            s1 = ((String) (obj1));
            s2 = obj4;
            s3 = s;
            if ((176L & l) != 0L)
            {
                if (binder != null)
                {
                    observablefield1 = binder.teamIcon;
                }
                updateRegistration(4, observablefield1);
                j = i;
                l2 = l;
                flag1 = flag;
                obj3 = obj2;
                s1 = ((String) (obj1));
                s2 = obj4;
                s3 = s;
                if (observablefield1 != null)
                {
                    s2 = (String)observablefield1.get();
                    s3 = s;
                    s1 = ((String) (obj1));
                    obj3 = obj2;
                    flag1 = flag;
                    l2 = l;
                    j = i;
                }
            }
        }
        if ((161L & l2) != 0L)
        {
            eventTime.setText(s3);
        }
        if ((164L & l2) != 0L)
        {
            obj1 = mboundView1;
            Object obj;
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
        if ((162L & l2) != 0L)
        {
            mboundView3.setText(s1);
        }
        if ((168L & l2) != 0L)
        {
            mboundView6.setText(((CharSequence) (obj3)));
        }
        if ((164L & l2) != 0L)
        {
            BindingUtils.setImageTint(playIcon, j);
        }
        if ((176L & l2) != 0L)
        {
            EventItemView.setTeamIcon(teamShield, s2);
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
        mDirtyFlags = 128L;
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
            return onChangeTeamAbbrBinder((ObservableField)obj, j);

        case 2: // '\002'
            return onChangeIsSeekEnabledBinder((ObservableBoolean)obj, j);

        case 3: // '\003'
            return onChangeLastNameBinder((ObservableField)obj, j);

        case 4: // '\004'
            return onChangeTeamIconBinder((ObservableField)obj, j);

        case 5: // '\005'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder)
    {
        updateRegistration(5, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 32L;
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
        mDirtyFlags = mDirtyFlags | 64L;
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
        sViewsWithIds.put(0x7f0f0080, 7);
    }
}
