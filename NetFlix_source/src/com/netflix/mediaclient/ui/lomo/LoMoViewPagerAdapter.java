// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.lolomo.KidsCharacterPagerAdapter;
import java.util.EnumMap;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPager, BillboardPagerAdapter, CwPagerAdapter, IqPagerAdapter, 
//            GenreLoMoPagerAdapter, LoadingViewAdapter, ErrorViewAdapter, StandardLoMoPagerAdapter, 
//            RowAdapter, RowAdapterCallbacks

public class LoMoViewPagerAdapter extends PagerAdapter
{
    static class Memento
    {

        final BaseProgressivePagerAdapter.Memento adapterMemento;
        final BasicLoMo lomo;
        final Type preErrorState;
        final Type state;

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("lomo: ");
            String s;
            if (lomo == null)
            {
                s = "n/a";
            } else
            {
                s = lomo.getTitle();
            }
            return stringbuilder.append(s).append(", state: ").append(state).append(", adapter: ").append(adapterMemento).toString();
        }

        protected Memento(Type type, Type type1, BasicLoMo basiclomo, RowAdapter rowadapter)
        {
            state = type;
            preErrorState = type1;
            lomo = basiclomo;
            adapterMemento = (BaseProgressivePagerAdapter.Memento)rowadapter.saveToMemento();
        }
    }

    private static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type BILLBOARD;
        public static final Type CHARACTER;
        public static final Type CW;
        public static final Type ERROR;
        public static final Type IQ;
        public static final Type LOADING;
        public static final Type STANDARD;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/netflix/mediaclient/ui/lomo/LoMoViewPagerAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            STANDARD = new Type("STANDARD", 0);
            LOADING = new Type("LOADING", 1);
            ERROR = new Type("ERROR", 2);
            IQ = new Type("IQ", 3);
            CW = new Type("CW", 4);
            BILLBOARD = new Type("BILLBOARD", 5);
            CHARACTER = new Type("CHARACTER", 6);
            $VALUES = (new Type[] {
                STANDARD, LOADING, ERROR, IQ, CW, BILLBOARD, CHARACTER
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private static final EnumMap LOMO_TYPE_TABLE = new EnumMap(com/netflix/mediaclient/servicemgr/LoMoType) {

            
            {
                put(LoMoType.BILLBOARD, Type.BILLBOARD);
                put(LoMoType.CHARACTERS, Type.CHARACTER);
                put(LoMoType.CONTINUE_WATCHING, Type.CW);
                put(LoMoType.INSTANT_QUEUE, Type.IQ);
                put(LoMoType.FLAT_GENRE, Type.STANDARD);
                put(LoMoType.SOCIAL_FRIEND, Type.STANDARD);
                put(LoMoType.SOCIAL_GROUP, Type.STANDARD);
                put(LoMoType.SOCIAL_POPULAR, Type.STANDARD);
                put(LoMoType.STANDARD, Type.STANDARD);
            }
    };
    private static final String TAG = "LoMoViewPagerAdapter";
    private final NetflixActivity activity;
    private final RowAdapter billboard;
    private final BroadcastReceiver browseReceiver = new BroadcastReceiver() {

        final LoMoViewPagerAdapter this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null)
            {
                Log.w("LoMoViewPagerAdapter", "Received null intent");
            } else
            {
                context = intent.getAction();
                if (Log.isLoggable("LoMoViewPagerAdapter", 2))
                {
                    Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("browseReceiver inovoked with Action: ").append(context).toString());
                }
                if ("com.netflix.mediaclient.intent.action.BA_CW_REFRESH".equals(context))
                {
                    if (Type.CW.equals(state))
                    {
                        Log.v("LoMoViewPagerAdapter", "Reloading cw row ");
                        refresh(loMo, listViewPos);
                    }
                    pager.invalidateCwCache();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.BA_IQ_REFRESH".equals(context))
                {
                    if (Type.IQ.equals(state))
                    {
                        Log.v("LoMoViewPagerAdapter", "Reloading iq row ");
                        refresh(loMo, listViewPos);
                    }
                    pager.invalidateIqCache();
                    return;
                }
            }
        }

            
            {
                this$0 = LoMoViewPagerAdapter.this;
                super();
            }
    };
    private final RowAdapter character;
    private RowAdapter currentAdapter;
    private final RowAdapter cw;
    private final RowAdapter error;
    private final RowAdapter iq;
    private boolean isDestroyed;
    private int listViewPos;
    private BasicLoMo loMo;
    private final RowAdapter loading;
    private final android.view.View.OnClickListener onReloadClickListener = new android.view.View.OnClickListener() {

        final LoMoViewPagerAdapter this$0;

        public void onClick(View view1)
        {
            reload();
        }

            
            {
                this$0 = LoMoViewPagerAdapter.this;
                super();
            }
    };
    private final LoMoViewPager pager;
    private final RowAdapterCallbacks pagerAdapterCallbacks = new RowAdapterCallbacks() {

        final LoMoViewPagerAdapter this$0;

        public NetflixActivity getActivity()
        {
            return activity;
        }

        public void notifyParentOfDataSetChange()
        {
            if (Log.isLoggable("LoMoViewPagerAdapter", 2))
            {
                Log.v("LoMoViewPagerAdapter", "Notified parent of data set change");
            }
            notifyDataSetChanged();
            pager.notifyDataSetChanged();
            if (pager.getCurrentItem() == 0)
            {
                if (Log.isLoggable("LoMoViewPagerAdapter", 2))
                {
                    Log.v("LoMoViewPagerAdapter", "Data loaded for page 0 - saving state");
                }
                pager.saveStateAndTrack(0);
            }
        }

        public void notifyParentOfError()
        {
            if (state != Type.ERROR)
            {
                preErrorState = state;
            }
            if (Log.isLoggable("LoMoViewPagerAdapter", 2))
            {
                Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("Pre-error state: ").append(preErrorState).toString());
            }
            setState(Type.ERROR);
            notifyDataSetChanged();
            showReloadViews();
        }

            
            {
                this$0 = LoMoViewPagerAdapter.this;
                super();
            }
    };
    private Type preErrorState;
    private final View reloadView;
    private final RowAdapter standard;
    private Type state;
    private final ViewRecycler viewRecycler;

    public LoMoViewPagerAdapter(LoMoViewPager lomoviewpager, ServiceManager servicemanager, ViewRecycler viewrecycler, View view, boolean flag)
    {
        pager = lomoviewpager;
        viewRecycler = viewrecycler;
        activity = (NetflixActivity)lomoviewpager.getContext();
        reloadView = view;
        registerBrowseNotificationReceiver();
        view.setOnClickListener(onReloadClickListener);
        character = new KidsCharacterPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        billboard = new BillboardPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        cw = new CwPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        iq = new IqPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        if (flag)
        {
            lomoviewpager = new GenreLoMoPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        } else
        {
            lomoviewpager = new StandardLoMoPagerAdapter(servicemanager, pagerAdapterCallbacks, viewrecycler);
        }
        standard = lomoviewpager;
        loading = new LoadingViewAdapter(pagerAdapterCallbacks, viewrecycler);
        error = new ErrorViewAdapter(pagerAdapterCallbacks);
        currentAdapter = loading;
        state = Type.LOADING;
    }

    private View getView(int i)
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("getView pos: ").append(i).toString());
        }
        if (currentAdapter.hasMoreData() && isLastItem(i))
        {
            return loading.getView(i);
        } else
        {
            return currentAdapter.getView(i);
        }
    }

    private void hideReloadViews()
    {
        reloadView.setVisibility(8);
    }

    private boolean isLastItem(int i)
    {
        return i == getCount() - 1;
    }

    private void registerBrowseNotificationReceiver()
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("Registering browse notification receiver, ").append(browseReceiver.hashCode()).toString());
        }
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.BA_IQ_REFRESH");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.BA_CW_REFRESH");
        activity.registerReceiver(browseReceiver, intentfilter);
    }

    private void setState(Type type)
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("new state: ").append(type).toString());
        }
        state = type;
        static class _cls5
        {

            static final int $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[];
            static final int $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType = new int[LoMoType.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.BILLBOARD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.CONTINUE_WATCHING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.CHARACTERS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type = new int[Type.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.STANDARD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.IQ.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.CW.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.BILLBOARD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[Type.CHARACTER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.netflix.mediaclient.ui.lomo.LoMoViewPagerAdapter.Type[type.ordinal()])
        {
        default:
            throw new IllegalStateException("Bad state");

        case 1: // '\001'
            currentAdapter = standard;
            return;

        case 2: // '\002'
            currentAdapter = loading;
            return;

        case 3: // '\003'
            currentAdapter = error;
            return;

        case 4: // '\004'
            currentAdapter = iq;
            return;

        case 5: // '\005'
            currentAdapter = cw;
            return;

        case 6: // '\006'
            currentAdapter = billboard;
            return;

        case 7: // '\007'
            currentAdapter = character;
            break;
        }
    }

    private void showLoading()
    {
        hideReloadViews();
        setState(Type.LOADING);
        notifyDataSetChanged();
    }

    private void showReloadViews()
    {
        reloadView.setVisibility(0);
    }

    private void unregisterBrowseNotificationReceiver()
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("Unregistering browse notification receiver, ").append(browseReceiver.hashCode()).toString());
        }
        activity.unregisterReceiver(browseReceiver);
    }

    public void destroy()
    {
        Log.v("LoMoViewPagerAdapter", "Destroying adapter");
        unregisterBrowseNotificationReceiver();
        isDestroyed = true;
        notifyDataSetChanged();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("destroying item: ").append(obj.getClass().getSimpleName()).append(", pos: ").append(i).toString());
        }
        viewgroup.removeView((View)obj);
        viewRecycler.push((View)obj);
    }

    public int getCount()
    {
        int i = 0;
        if (isDestroyed)
        {
            return 0;
        }
        int j = currentAdapter.getCount();
        if (currentAdapter.hasMoreData())
        {
            i = 1;
        }
        return j + i;
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public android.widget.LinearLayout.LayoutParams getLayoutParams(LoMoType lomotype)
    {
        _cls5..SwitchMap.com.netflix.mediaclient.servicemgr.LoMoType[lomotype.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 82
    //                   2 95
    //                   3 108;
           goto _L1 _L2 _L3 _L4
_L1:
        int i = standard.getRowHeightInPx();
_L6:
        Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("Creating layout params with height: ").append(i).toString());
        return new android.widget.LinearLayout.LayoutParams(-1, i);
_L2:
        i = billboard.getRowHeightInPx();
        continue; /* Loop/switch isn't completed */
_L3:
        i = cw.getRowHeightInPx();
        continue; /* Loop/switch isn't completed */
_L4:
        i = character.getRowHeightInPx();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean hasMoreData()
    {
        return currentAdapter.hasMoreData();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("instantiateItem, pos: ").append(i).toString());
        }
        View view = getView(i);
        viewgroup.addView(view);
        return view;
    }

    public void invalidateRequestId()
    {
        currentAdapter.invalidateRequestId();
    }

    public boolean isLoading()
    {
        return state == Type.LOADING;
    }

    public boolean isShowingBillboard()
    {
        return state == Type.BILLBOARD;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void refresh(BasicLoMo basiclomo, int i)
    {
        Type type = (Type)LOMO_TYPE_TABLE.get(basiclomo.getType());
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("refreshing: ").append(i).append(", ");
            String s;
            if (basiclomo == null)
            {
                s = "n/a";
            } else
            {
                s = basiclomo.getTitle();
            }
            Log.v("LoMoViewPagerAdapter", stringbuilder.append(s).append(", new state: ").append(type).toString());
        }
        listViewPos = i;
        hideReloadViews();
        loMo = basiclomo;
        showLoading();
        setState(type);
        currentAdapter.refreshData(basiclomo, i);
    }

    public void reload()
    {
        if (Log.isLoggable("LoMoViewPagerAdapter", 2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Reloading data, ").append(listViewPos).append(", ");
            String s;
            if (loMo == null)
            {
                s = "n/a";
            } else
            {
                s = loMo.getTitle();
            }
            Log.v("LoMoViewPagerAdapter", stringbuilder.append(s).append(", preErrorState state: ").append(preErrorState).toString());
        }
        showLoading();
        setState(preErrorState);
        currentAdapter.refreshData(loMo, listViewPos);
    }

    public void restoreFromMemento(Memento memento)
    {
        loMo = memento.lomo;
        Type type = memento.state;
        View view = reloadView;
        int i;
        if (type == Type.ERROR)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (type == Type.ERROR || type == Type.LOADING)
        {
            if (Log.isLoggable("LoMoViewPagerAdapter", 2))
            {
                Log.v("LoMoViewPagerAdapter", "Page was in error or loading state - ignoring restoration");
            }
            return;
        } else
        {
            preErrorState = memento.preErrorState;
            setState(type);
            currentAdapter.restoreFromMemento(memento.adapterMemento);
            return;
        }
    }

    public Memento saveToMemento()
    {
        return new Memento(state, preErrorState, loMo, currentAdapter);
    }

    public void trackPresentation(int i)
    {
        currentAdapter.trackPresentation(i);
    }





/*
    static Type access$102(LoMoViewPagerAdapter lomoviewpageradapter, Type type)
    {
        lomoviewpageradapter.preErrorState = type;
        return type;
    }

*/






}
