// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.user.adapter.MyUserBoardGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actions.ScrollableListener;
import com.pinterest.ui.scrollview.ObservableScrollView;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView, AdapterFooterView, AdapterEmptyView

public class PinterestGridView extends ObservableScrollView
{

    private PinterestBaseAdapter _adapter;
    private PinterestAdapterView.PinterAdapterViewListener _adapterViewListener;
    PinterestAdapterView _adapterVw;
    LinearLayout _content;
    AdapterEmptyView _emptyVw;
    AdapterFooterView _footerVw;
    private int _headerCount;
    private boolean _hideFooter;
    private android.widget.AdapterView.OnItemClickListener _onItemClickListener;
    private android.widget.AdapterView.OnItemLongClickListener _onItemLongClickListener;
    private OnStateSetListener _onStateSetListener;
    private float _pendingOffset;
    private State _state;

    public PinterestGridView(Context context)
    {
        this(context, null);
    }

    public PinterestGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinterestGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _state = State.LOADING;
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301f7, this, true);
        ButterKnife.a(this);
        resetViewListener();
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.Pinterest);
            int i = attributeset.getDimensionPixelSize(2, -1);
            int j = attributeset.getDimensionPixelSize(1, -1);
            int k = attributeset.getResourceId(3, -1);
            attributeset.recycle();
            if (i != -1)
            {
                _adapterVw.setOuterPadding(i);
            }
            if (j != -1)
            {
                _adapterVw.setBrickPadding(j);
            }
            if (k != -1)
            {
                _adapterVw.setColumnCountRes(k);
            }
        }
        _footerVw.setShadowVisibility(8);
        _adapterVw.setAdapter(_adapter);
        _adapterVw.setContainingScrollView(this);
        _adapterVw.setListener(_adapterViewListener);
        _adapterVw.setOnItemClickListener(_onItemClickListener);
        _adapterVw.setOnItemLongClickListener(_onItemLongClickListener);
        _adapterVw.setAdapter(_adapter);
        setFillViewport(true);
        updateView();
    }

    private void restoreScrollPosition()
    {
        if (_pendingOffset > 0.0F)
        {
            final float offset = _pendingOffset;
            _pendingOffset = 0.0F;
            getViewTreeObserver().addOnPreDrawListener(new _cls2());
        }
    }

    public View addHeaderView(int i)
    {
        View view = LayoutInflater.from(getContext()).inflate(i, _content, false);
        _content.addView(view, _headerCount);
        _headerCount = _headerCount + 1;
        return view;
    }

    public void addHeaderView(View view)
    {
        addHeaderView(view, -1, -2);
    }

    public void addHeaderView(View view, int i, int j)
    {
        addHeaderView(view, i, j, 0, 0);
    }

    public void addHeaderView(View view, int i, int j, int k, int l)
    {
        if (view == null)
        {
            return;
        } else
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i, j);
            layoutparams.topMargin = k;
            layoutparams.bottomMargin = l;
            _content.addView(view, _headerCount, layoutparams);
            _headerCount = _headerCount + 1;
            return;
        }
    }

    public void addListener(final ScrollableListener listener)
    {
        super.addListener(new _cls1());
    }

    public void appendDataSource(Feed feed)
    {
        Feed feed1 = _adapter.getDataSource();
        if (feed1 == null)
        {
            _adapter.setDataSource(feed);
            return;
        } else
        {
            feed1.appendItems(feed);
            _adapter.notifyDataSetChanged();
            return;
        }
    }

    public void cleanupView()
    {
        if (_adapter != null)
        {
            _adapter.onStop();
        }
        setOnStateSetListener(null);
        setAdapterViewListener(null);
        setOnItemClickListener(null);
        setOnItemLongClickListener(null);
        if (_content != null && _footerVw != null)
        {
            _content.removeView(_footerVw);
        }
    }

    public void forceMakeCurrent()
    {
        if (_adapterVw != null)
        {
            _adapterVw.onScroll(this, scrollY, scrollOldY);
        }
    }

    public PinterestAdapterView getAdapterView()
    {
        return _adapterVw;
    }

    public AdapterEmptyView getEmptyView()
    {
        return _emptyVw;
    }

    public AdapterFooterView getFooterView()
    {
        return _footerVw;
    }

    public int getHeaderCount()
    {
        return _headerCount;
    }

    public State getState()
    {
        return _state;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (_adapter != null)
        {
            _adapter.onStart();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        _pendingOffset = ((SavedState) (parcelable)).offset;
        restoreScrollPosition();
        super.onRestoreInstanceState(parcelable.getSuperState());
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.offset = (float)scrollY / (float)_adapterVw.getMeasuredHeight();
        return savedstate;
    }

    public void removeHeaderView(View view)
    {
        _content.removeView(view);
    }

    public void reset()
    {
        _adapterVw.reset();
    }

    public void setAdapter(PinterestBaseAdapter pinterestbaseadapter)
    {
        _adapter = pinterestbaseadapter;
        _adapterVw.setAdapter(_adapter);
    }

    public void setAdapterViewListener(PinterestAdapterView.PinterAdapterViewListener pinteradapterviewlistener)
    {
        _adapterViewListener = pinteradapterviewlistener;
        _adapterVw.setListener(_adapterViewListener);
    }

    public void setAdapterViewPadding(int i, int j, int k, int l)
    {
        _adapterVw.setPadding(i, j, k, l);
    }

    public void setContentBackgroundColor(int i)
    {
        _content.setBackgroundColor(i);
    }

    public void setContentPadding(int i, int j, int k, int l)
    {
        _content.setPadding(i, j, k, l);
    }

    public void setDataSource(Feed feed)
    {
        _adapter.setDataSource(feed);
        reset();
    }

    public void setEmptyIcon(int i)
    {
        if (_emptyVw != null)
        {
            _emptyVw.setCenterIcon(i);
        }
    }

    public void setEmptyIllustrations(int i, int j, int k)
    {
        _emptyVw.setEmptyIllustrations(i, j, k);
    }

    public void setEmptyMessage(int i)
    {
        if (_emptyVw != null)
        {
            _emptyVw.setMessage(i);
        }
    }

    public void setEmptyMessage(String s)
    {
        if (_emptyVw != null)
        {
            _emptyVw.setMessage(s);
        }
    }

    public void setFanUtilParams(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams)
    {
        _emptyVw.setFanUtilParams(fanutilparams);
    }

    public void setHideFooter(boolean flag)
    {
        _hideFooter = flag;
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        _onItemClickListener = onitemclicklistener;
        _adapterVw.setOnItemClickListener(_onItemClickListener);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        _onItemLongClickListener = onitemlongclicklistener;
        _adapterVw.setOnItemLongClickListener(_onItemLongClickListener);
    }

    public void setOnStateSetListener(OnStateSetListener onstatesetlistener)
    {
        _onStateSetListener = onstatesetlistener;
        if (_onStateSetListener != null)
        {
            _onStateSetListener.onSet(_state);
        }
    }

    public void setPinImpressionType(PinImpressionType pinimpressiontype)
    {
        if (_adapterVw != null)
        {
            _adapterVw.setPinImpressionType(pinimpressiontype);
        }
    }

    public void setState(State state)
    {
        _state = state;
        updateView();
        if (_onStateSetListener != null)
        {
            _onStateSetListener.onSet(state);
        }
    }

    protected void updateView()
    {
        byte byte0;
        byte byte2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        byte2 = 8;
        flag1 = false;
        flag = false;
        Object obj;
        byte byte1;
        if (_adapter == null || _adapter.getCount() == 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (_adapter instanceof MyUserBoardGridAdapter)
        {
            _adapter.getCount();
        }
        obj = _adapterVw;
        if (byte0 != 0)
        {
            byte1 = 8;
        } else
        {
            byte1 = 0;
        }
        ((PinterestAdapterView) (obj)).setVisibility(byte1);
        obj = _footerVw;
        if (byte0 != 0)
        {
            byte1 = 8;
        } else
        {
            byte1 = 0;
        }
        ((AdapterFooterView) (obj)).setVisibility(byte1);
        obj = _adapterVw;
        if (byte0 != 0)
        {
            byte1 = 8;
        } else
        {
            byte1 = 0;
        }
        ((PinterestAdapterView) (obj)).setVisibility(byte1);
        _cls3..SwitchMap.com.pinterest.ui.grid.PinterestGridView.State[_state.ordinal()];
        JVM INSTR tableswitch 1 3: default 140
    //                   1 204
    //                   2 275
    //                   3 341;
           goto _L1 _L2 _L3 _L4
_L1:
        _emptyVw.setVisibility(8);
        _emptyVw.setState(2);
        _footerVw.setState(2);
        obj = _footerVw;
        Object obj1;
        int i;
        if (_hideFooter)
        {
            flag2 = false;
        }
        ViewHelper.setVisibility(((View) (obj)), flag2);
        return;
_L2:
        obj1 = _emptyVw;
        if (byte0 != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((AdapterEmptyView) (obj1)).setVisibility(i);
        obj1 = _footerVw;
        i = byte2;
        if (byte0 == 0)
        {
            if (_hideFooter)
            {
                i = byte2;
            } else
            {
                i = 0;
            }
        }
        ((AdapterFooterView) (obj1)).setVisibility(i);
        _emptyVw.setState(0);
        _footerVw.setState(0);
        return;
_L3:
        obj1 = _emptyVw;
        if (byte0 != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((AdapterEmptyView) (obj1)).setVisibility(i);
        obj1 = _footerVw;
        if (byte0 != 0) goto _L6; else goto _L5
_L5:
        byte0 = flag;
        if (!_hideFooter) goto _L7; else goto _L6
_L6:
        byte0 = 8;
_L7:
        ((AdapterFooterView) (obj1)).setVisibility(byte0);
        _emptyVw.setState(1);
        _footerVw.setState(1);
        return;
_L4:
        obj1 = _emptyVw;
        if (byte0 != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((AdapterEmptyView) (obj1)).setVisibility(i);
        obj1 = _footerVw;
        if (byte0 != 0) goto _L9; else goto _L8
_L8:
        byte0 = flag1;
        if (!_hideFooter) goto _L10; else goto _L9
_L9:
        byte0 = 8;
_L10:
        ((AdapterFooterView) (obj1)).setVisibility(byte0);
        _emptyVw.setState(1);
        _footerVw.setState(1);
        return;
    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ERROR;
        public static final State LOADED;
        public static final State LOADING;
        public static final State NONE;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/pinterest/ui/grid/PinterestGridView$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            LOADED = new State("LOADED", 0);
            LOADING = new State("LOADING", 1);
            ERROR = new State("ERROR", 2);
            NONE = new State("NONE", 3);
            $VALUES = (new State[] {
                LOADED, LOADING, ERROR, NONE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final PinterestGridView this$0;
        final float val$offset;

        public boolean onPreDraw()
        {
            int i = (int)(offset * (float)_adapterVw.getMeasuredHeight());
            scrollTo(0, i);
            onScrollChanged(0, i, 0, 0);
            getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        _cls2()
        {
            this$0 = PinterestGridView.this;
            offset = f;
            super();
        }
    }


    private class _cls1 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final PinterestGridView this$0;
        final ScrollableListener val$listener;

        public void onLayout()
        {
            super.onLayout();
            if (listener != null && com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(listener.getClass()))
            {
                ((com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener)listener).onLayout();
            }
        }

        public void onMeasure()
        {
            super.onMeasure();
            if (listener != null && com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(listener.getClass()))
            {
                ((com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener)listener).onMeasure();
            }
        }

        public void onScroll(View view, int i, int j, int k, int l)
        {
            _adapterVw.onScroll((ScrollView)view, j, l);
            if (listener != null)
            {
                listener.onScroll(view, i, j, k, l);
            }
        }

        _cls1()
        {
            this$0 = PinterestGridView.this;
            listener = scrollablelistener;
            super();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        float offset;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(offset);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            offset = parcel.readFloat();
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }


    private class OnStateSetListener
    {

        public abstract void onSet(State state);
    }


    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[];

        static 
        {
            $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State = new int[State.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[State.LOADING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[State.LOADED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[State.ERROR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
