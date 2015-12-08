// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.dynamicgrid.DynamicGridFragment;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.base.Device;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinGridCell;
import com.pinterest.ui.grid.PinGridCellHidden;
import com.pinterest.ui.grid.PinGridFlipContainer;
import java.util.List;

// Referenced classes of package com.pinterest.adapter:
//            PinterestBaseAdapter, LoadMoreListener

public class PinGridAdapter extends PinterestBaseAdapter
{

    private static List _cinematicPinsLocations = new _cls1();
    protected static boolean _isPinHeightExp = false;
    private boolean _cropPinImage;
    private boolean _disableClicks;
    private boolean _forceShowInterest;
    protected boolean _isFeedbackExp;
    private boolean _isHomefeedAdapter;
    private boolean _isRelatedContent;
    private boolean _overrideClicks;
    private boolean _renderCSRHeader;
    private boolean _renderCinematic;
    private boolean _renderCompactUser;
    private boolean _renderDomain;
    private boolean _renderHashtag;
    private boolean _renderOnto;
    private boolean _renderSource;
    private boolean _renderThrough;
    private boolean _renderUser;

    public PinGridAdapter()
    {
        _renderCompactUser = false;
        _renderUser = true;
        _renderSource = true;
        _renderOnto = true;
        _renderThrough = false;
        _renderDomain = false;
        _overrideClicks = false;
        _cropPinImage = true;
        _forceShowInterest = false;
        _renderCinematic = false;
        _renderHashtag = false;
        _renderCSRHeader = false;
        _isFeedbackExp = false;
        _isHomefeedAdapter = false;
        _renderHashtag = Experiments.a(true);
        _isFeedbackExp = Experiments.c(false);
        _isPinHeightExp = Experiments.p();
    }

    private void enableCSRView(boolean flag)
    {
        _renderDomain = true;
        _renderCompactUser = false;
        _renderCSRHeader = true;
        if (flag)
        {
            _renderUser = false;
            _renderOnto = false;
        }
    }

    private View getHiddenCell(int i, Pin pin, View view, ViewGroup viewgroup, boolean flag)
    {
        if (_isFeedbackExp)
        {
            view = PinGridFlipContainer.from(view, viewgroup);
            updateGridCell(((PinGridFlipContainer) (view)).gridCell, i, pin, flag);
            view.setPin(pin, flag);
            return view;
        }
        if (view == null || !(view instanceof PinGridCellHidden))
        {
            if (view != null)
            {
                PLog.warn((new StringBuilder("PinGridCellHidden v: ")).append(view).toString(), new Object[0]);
            }
            view = new PinGridCellHidden(ViewHelper.getContext(view, viewgroup));
            view.setBackgroundColor(Resources.color(0x7f0e0016));
        } else
        {
            view = (PinGridCellHidden)view;
        }
        view.setPin(pin, flag);
        return view;
    }

    public static boolean isPinHeightExp()
    {
        return _isPinHeightExp;
    }

    private void updateGridCell(PinGridCell pingridcell, int i, Pin pin, boolean flag)
    {
        if (pin != null && pin.isCSR())
        {
            enableCSRView(_isRelatedContent);
        }
        pingridcell.setRenderLargePin(isLargePin(i));
        boolean flag1;
        if (!_disableClicks)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        pingridcell.setEnabled(flag1);
        pingridcell.setRenderCompactUser(_renderCompactUser);
        pingridcell.setRenderUser(_renderUser);
        pingridcell.setRenderSource(_renderSource);
        pingridcell.setRenderOnto(_renderOnto);
        pingridcell.setRenderThrough(_renderThrough);
        pingridcell.setRenderDomain(_renderDomain);
        pingridcell.setOverrideClicks(_overrideClicks);
        pingridcell.setCropPinImage(_cropPinImage);
        pingridcell.setIsRelatedPin(_isRelatedContent);
        pingridcell.setPinPosition(i);
        pingridcell.setRenderCinematicPin(_renderCinematic);
        pingridcell.setRenderHashtag(_renderHashtag);
        pingridcell.setRenderCSRHeader(_renderCSRHeader);
        pingridcell.setIsDisplayedOnHomefeed(_isHomefeedAdapter);
        if (pin != null && pin.getIsDynamicallyInserted())
        {
            pingridcell.setRenderThrough(true);
        }
        if (pin != null && pin.isFollowedInterestOrLocalPin() || _forceShowInterest)
        {
            pingridcell.setRenderInterest(true);
        } else
        {
            pingridcell.setRenderInterest(false);
        }
        if (_forceShowInterest)
        {
            pingridcell.setPopularInTitle(Resources.string(0x7f070054));
        } else
        {
            pingridcell.setPopularInTitle(null);
        }
        if (pin != null && pin.getRecommendationReason() != null)
        {
            pingridcell.setRenderThrough(true);
            pingridcell.setRenderCompactUser(false);
        }
        pingridcell.setPin(pin, flag);
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        StopWatch.get().logTimeStamp("ttrfp_tmp_log", "ts_70_to_load_pin_cell", true);
        Pin pin = (Pin)getItem(i);
        if (pin != null && ModelHelper.isValid(pin.getHiddenState()) && pin.getHiddenState().intValue() > 0)
        {
            return getHiddenCell(i, pin, view, viewgroup, flag);
        }
        if (!flag)
        {
            loadMore(i);
        }
        view = PinGridCell.from(view, ViewHelper.getContext(view, viewgroup));
        updateGridCell(view, i, pin, flag);
        return view;
    }

    public boolean isFeedbackExp()
    {
        return _isFeedbackExp;
    }

    public boolean isLargePin(int i)
    {
        return false;
    }

    public void onStart()
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof PinFeed)
            {
                ((PinFeed)_dataSource).registerForUpdateEvents();
            }
            _dataSource.setDataListener(_dataListener);
        }
    }

    public void onStop()
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof PinFeed)
            {
                ((PinFeed)_dataSource).unregisterForUpdateEvents();
            }
            _dataSource.setDataListener(null);
        }
        super.onStop();
    }

    public boolean restoreInstanceState(Bundle bundle)
    {
        boolean flag = super.restoreInstanceState(bundle);
        if (flag && !(_dataSource instanceof PinFeed))
        {
            _dataSource = null;
            bundle = String.format("%s.restoreInstanceState: not a PinFeed", new Object[] {
                getClass().getSimpleName()
            });
            CrashReporting.b(bundle);
            CrashReporting.a(new RuntimeException(bundle));
        }
        return flag;
    }

    public void setCropPinImage(boolean flag)
    {
        _cropPinImage = flag;
    }

    public void setDataSource(Feed feed)
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof PinFeed)
            {
                ((PinFeed)_dataSource).unregisterForUpdateEvents();
            }
            _dataSource.setDataListener(null);
        }
        super.setDataSource(feed);
        if (_dataSource != null)
        {
            if (_dataSource instanceof PinFeed)
            {
                ((PinFeed)_dataSource).registerForUpdateEvents();
            }
            _dataSource.setDataListener(_dataListener);
            if (_dataSource.getCount() > 0 && _dataSource.getCount() <= Device.getFirstRequestPageSize() && _loadMoreListener != null)
            {
                setLoading(true);
                _loadMoreListener.loadMore();
            }
        }
    }

    public void setDisableClicks(boolean flag)
    {
        _disableClicks = flag;
    }

    public void setForceShowInterest(boolean flag)
    {
        _forceShowInterest = flag;
    }

    public void setIsRelatedContent(boolean flag)
    {
        _isRelatedContent = flag;
    }

    public void setOverrideClicks(boolean flag)
    {
        _overrideClicks = flag;
    }

    public void setParentClass(Class class1)
    {
        if (_cinematicPinsLocations.contains(class1))
        {
            _renderCinematic = true;
        }
        if (class1.equals(com/pinterest/activity/dynamicgrid/DynamicGridFragment))
        {
            _isHomefeedAdapter = true;
        }
    }

    public void setRelatedContent(boolean flag)
    {
        _isRelatedContent = flag;
    }

    public void setRenderCompactUser(boolean flag)
    {
        _renderCompactUser = flag;
    }

    public void setRenderCompactUserOnly(boolean flag)
    {
        if (flag)
        {
            _renderCompactUser = true;
            _renderUser = false;
            _renderSource = false;
            _renderOnto = false;
            _renderThrough = false;
            _renderDomain = false;
            return;
        } else
        {
            _renderUser = true;
            _renderSource = true;
            _renderOnto = true;
            return;
        }
    }

    public void setRenderDomain(boolean flag)
    {
        _renderDomain = flag;
    }

    public void setRenderOnto(boolean flag)
    {
        _renderOnto = flag;
    }

    public void setRenderSource(boolean flag)
    {
        _renderSource = flag;
    }

    public void setRenderUser(boolean flag)
    {
        _renderUser = flag;
    }


    private class _cls1 extends ArrayList
    {

        _cls1()
        {
            add(com/pinterest/activity/dynamicgrid/DynamicGridFragment);
            add(com/pinterest/activity/home/HomeFragment);
            add(com/pinterest/activity/interest/InterestFragment);
            add(com/pinterest/activity/category/fragment/CategoryFragment);
            add(com/pinterest/activity/board/fragment/BoardFragment);
        }
    }

}
