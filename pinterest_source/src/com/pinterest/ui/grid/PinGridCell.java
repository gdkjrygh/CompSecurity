// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.gson.JsonPrimitive;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.CommercePinGridView;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.ViewTagRequest;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.PinImpression;
import com.pinterest.schemas.event.PinImpressionRichType;
import com.pinterest.ui.BetterGestureDetector;
import com.pinterest.ui.feedback.PinFeedbackBase;
import com.pinterest.ui.grid.dialog.PromotedPinFeedbackDialog;
import com.pinterest.ui.grid.dialog.RecommendedPinFeedbackDialog;
import com.pinterest.ui.grid.pin.PinBackgroundDrawable;
import com.pinterest.ui.grid.pin.PinCellDrawable;
import com.pinterest.ui.grid.pin.PinCinematicDrawable;
import com.pinterest.ui.grid.pin.PinDividerDrawable;
import com.pinterest.ui.grid.pin.PinIconTextDrawable;
import com.pinterest.ui.grid.pin.PinImageDrawable;
import com.pinterest.ui.grid.pin.PinInfoDrawable;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView

public class PinGridCell extends View
    implements CommercePinGridView, ImpressionView
{

    private static final String CSR_ICON = Integer.toString(0x7f020181);
    private static final int CSR_ICON_RIGHT_PADDING = (int)Resources.dimension(0x7f0a00f8);
    private static final int CSR_ICON_SIZE = (int)Resources.dimension(0x7f0a01df);
    private static final int CSR_TITLE_TOP_OFFSET;
    private static final int IMAGE_NOT_LOADED = -1;
    protected static final int PADDING_ITEM;
    protected static final int PADDING_SIDE = (int)Resources.dimension(0x7f0a0195);
    protected static final String STR_CSR = Resources.string(0x7f0701b9);
    protected static final String STR_CSR_FROM = Resources.string(0x7f0701b8);
    protected static final String STR_ONTO = Resources.string(0x7f0704c4);
    protected static final String STR_PICKED_FOR_YOU = Resources.string(0x7f0703f2);
    protected static final String STR_POPULAR_IN = Resources.string(0x7f070464);
    protected static final String STR_PROMOTED_BY = Resources.string(0x7f07046d);
    protected static final String STR_RELATED_PIN = Resources.string(0x7f070491);
    protected static final String STR_SAVED_BY = Resources.string(0x7f0704c0);
    protected static final String STR_SOURCE = Resources.string(0x7f0703da);
    private static final String TAG = com/pinterest/ui/grid/PinGridCell.getName();
    protected int LONG_PRESS_TIMEOUT;
    private PinBackgroundDrawable _backgroundDrawable;
    private boolean _cached;
    private Rect _cellPadding;
    private PinIconTextDrawable _csrHeaderDrawable;
    private PinDividerDrawable _dividerDrawable;
    private PinIconTextDrawable _domainDrawable;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private BetterGestureDetector _gestureDetector;
    private String _imageUrl;
    private PinImpression _impression;
    private long _impressionStart;
    private PinInfoDrawable _infoDrawable;
    private boolean _isDisplayedOnHomefeed;
    private boolean _isRelatedPin;
    private int _measuredHeight;
    private int _measuredWidth;
    private PinIconTextDrawable _ontoDrawable;
    private boolean _overrideClicks;
    private int _percentageVisible;
    private Pin _pin;
    private PinCinematicDrawable _pinCinematicDrawable;
    private PinImageDrawable _pinDrawable;
    private CachableRoundedBitmap.ImageListener _pinDrawableListener;
    private NinePatchDrawable _pinMask;
    private int _pinPosition;
    private String _popularInTitle;
    private boolean _renderCSRHeader;
    private boolean _renderCinematic;
    private boolean _renderCompactUser;
    private boolean _renderDescription;
    private boolean _renderDomain;
    private long _renderDuration;
    private boolean _renderHashtag;
    private boolean _renderInterest;
    private boolean _renderLargePin;
    private boolean _renderOnto;
    private boolean _renderSocial;
    private boolean _renderSource;
    private long _renderStart;
    private boolean _renderThrough;
    private boolean _renderUser;
    private PinIconTextDrawable _sourceDrawable;
    private PinIconTextDrawable _throughDrawable;
    private PinIconTextDrawable _userDrawable;
    com.pinterest.ui.BetterGestureDetector.SimpleOnGestureListener onGestureListener;

    public PinGridCell(Context context)
    {
        this(context, null);
    }

    public PinGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        LONG_PRESS_TIMEOUT = 200;
        _renderCompactUser = false;
        _renderUser = true;
        _renderInterest = false;
        _renderDescription = true;
        _renderSource = true;
        _renderOnto = true;
        _renderDomain = false;
        _overrideClicks = false;
        _renderThrough = false;
        _renderSocial = true;
        _renderLargePin = false;
        _renderCinematic = false;
        _renderHashtag = false;
        _renderCSRHeader = false;
        _cellPadding = new Rect();
        _measuredHeight = 0;
        _measuredWidth = 0;
        _backgroundDrawable = new PinBackgroundDrawable();
        _pinDrawable = new PinImageDrawable(this);
        _pinCinematicDrawable = new PinCinematicDrawable(this);
        _infoDrawable = new PinInfoDrawable(this);
        _userDrawable = new PinIconTextDrawable(this);
        _ontoDrawable = new PinIconTextDrawable(this);
        _sourceDrawable = new PinIconTextDrawable(this);
        _throughDrawable = new PinIconTextDrawable(this);
        _domainDrawable = new PinIconTextDrawable(this);
        _dividerDrawable = new PinDividerDrawable();
        _csrHeaderDrawable = new PinIconTextDrawable(this);
        _isDisplayedOnHomefeed = false;
        _pinDrawableListener = new _cls1();
        onGestureListener = new _cls2();
        _eventsSubscriber = new _cls3();
        init();
    }

    private void drawBackground(Canvas canvas)
    {
        _backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        _backgroundDrawable.draw(canvas);
    }

    private void drawCSRHeader(Canvas canvas)
    {
        if (!_renderCSRHeader)
        {
            return;
        } else
        {
            _csrHeaderDrawable.draw(canvas);
            return;
        }
    }

    private void drawDomain(Canvas canvas)
    {
        if (!_renderDomain)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_domainDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _domainDrawable.draw(canvas);
            return;
        }
    }

    private void drawInfo(Canvas canvas)
    {
        if (_renderDescription)
        {
            _infoDrawable.draw(canvas);
            if (BuyableProductHelper.isPinAvailable(_pin))
            {
                setId(0x7f0f0004);
            }
        }
    }

    private void drawOnto(Canvas canvas)
    {
        if (!_renderOnto)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_ontoDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _ontoDrawable.draw(canvas);
            return;
        }
    }

    private void drawOverlay(Canvas canvas)
    {
        _pinMask.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        _pinMask.draw(canvas);
    }

    private void drawPin(Canvas canvas)
    {
        if (_renderCSRHeader)
        {
            _dividerDrawable.setY(_pinDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
        }
        _pinDrawable.draw(canvas);
        if (BooleanUtils.isTrue(_pin.getIsCinematic()) && StringUtils.isNotEmpty(_pin.getCinematicSrc()))
        {
            _pinCinematicDrawable.draw(canvas);
        }
    }

    private void drawSource(Canvas canvas)
    {
        if (!_renderSource)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_sourceDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _sourceDrawable.draw(canvas);
            return;
        }
    }

    private void drawThrough(Canvas canvas)
    {
        if (!_renderThrough)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_throughDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _throughDrawable.draw(canvas);
            return;
        }
    }

    private void drawUser(Canvas canvas)
    {
        if (!_renderUser && !_renderCompactUser)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_userDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _userDrawable.draw(canvas);
            return;
        }
    }

    public static PinGridCell from(View view, Context context)
    {
        if (view instanceof PinGridCell)
        {
            return (PinGridCell)view;
        } else
        {
            return new PinGridCell(context);
        }
    }

    private void init()
    {
        _userDrawable.setOval(true);
        _pinMask = (NinePatchDrawable)Resources.drawable(0x7f0200be);
        _pinMask.getPadding(_cellPadding);
        _gestureDetector = new BetterGestureDetector(getContext(), onGestureListener);
        _gestureDetector.setLongPressTimeout(LONG_PRESS_TIMEOUT);
        _pinDrawable.setImageListener(_pinDrawableListener);
    }

    private boolean isCinematicPin(Pin pin)
    {
        return pin != null && BooleanUtils.isTrue(pin.getIsCinematic()) && StringUtils.isNotEmpty(pin.getCinematicSrc()) && _renderCinematic;
    }

    private boolean isFeedBackExp()
    {
        return Experiments.c(true);
    }

    private boolean openPinCloseup(Pin pin)
    {
        Object obj = (PinterestAdapterView)getParent();
        if (((PinterestAdapterView) (obj)).getAdapter() instanceof PinGridAdapter)
        {
            obj = (PinFeed)((PinGridAdapter)((PinterestAdapterView) (obj)).getAdapter()).getDataSource();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            int i = ((PinFeed) (obj)).getItemIndex(pin);
            StopWatch.get().start("pin_closeup");
            pin = new Navigation(Location.PIN_PAGER);
            pin.putExtra("com.pinterest.EXTRA_FEED", obj);
            pin.putIntParcelable("com.pinterest.EXTRA_PIN_POSITION", i);
            if (_isDisplayedOnHomefeed)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            pin.putIntParcelable("com.pinterest.EXTRA_IS_HOMEFEED_PIN", i);
            Events.post(pin);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean shouldShowFeedbackLine()
    {
        return _pin.shouldShowPromoterInGrid() || _pin.getRecommendationMessage() != null && !_pin.getRecommendationMessage().equals(Pin.STR_PROMOTED);
    }

    private void showPromotedFeedbackDialog()
    {
        if (isFeedBackExp())
        {
            PinFeedbackBase.get(getContext(), _pin).showFeedBack();
            return;
        } else
        {
            Events.post(new DialogEvent(PromotedPinFeedbackDialog.newInstance(_pin, false)));
            return;
        }
    }

    private void showRecommendationFeedbackDialog()
    {
        if (isFeedBackExp())
        {
            PinFeedbackBase.get(getContext(), _pin).showFeedBack();
            return;
        } else
        {
            Events.post(new DialogEvent(RecommendedPinFeedbackDialog.newInstance(_pin)));
            return;
        }
    }

    private void unTouchAll()
    {
        _pinDrawable.setPressed(false);
        _pinCinematicDrawable.setPressed(false);
        _infoDrawable.setPressed(false);
        _sourceDrawable.setPressed(false);
        _ontoDrawable.setPressed(false);
        _throughDrawable.setPressed(false);
        _userDrawable.setPressed(false);
        _domainDrawable.setPressed(false);
        _csrHeaderDrawable.setPressed(false);
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.dispatchTouchEvent(motionevent);
        if (motionevent.getAction() == 3)
        {
            onGestureListener.onScroll(null, null, 0.0F, 0.0F);
        }
        return flag | _gestureDetector.onTouchEvent(motionevent);
    }

    public PinImpression getImpression()
    {
        return _impression;
    }

    public boolean getIsDisplayedOnHomefeed()
    {
        return _isDisplayedOnHomefeed;
    }

    public int getPercentageVisible()
    {
        return _percentageVisible;
    }

    public PinImpression getPinImpression()
    {
        return _impression;
    }

    public int getPriceHeight()
    {
        if (BuyableProductHelper.isPinAvailable(_pin))
        {
            return _infoDrawable.getPriceHeight();
        } else
        {
            return 0;
        }
    }

    public int getYOffset()
    {
        if (BuyableProductHelper.isPinAvailable(_pin))
        {
            return _pinDrawable.getHeight();
        } else
        {
            return 0;
        }
    }

    public PinImpression markImpressionEnd()
    {
        if (_impression == null || _pin == null)
        {
            return null;
        }
        PinImpression pinimpression = _impression;
        pinimpression.setPinIdStr(_pin.getUid());
        pinimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
        pinimpression.setSlotIndex((short)_pinPosition);
        if (_imageUrl != null)
        {
            pinimpression.setRenderDuration(_renderDuration);
            pinimpression.setImageURL(_imageUrl);
            pinimpression.setCached(_cached);
        }
        if (StringUtils.isNotEmpty(_pin.getCinematicSrc()) && BooleanUtils.isTrue(_pin.getIsCinematic()))
        {
            float f = _pinCinematicDrawable.getNumberOfFramesShown(_pin.getCinematicSrc());
            PLog.info(TAG, new Object[] {
                (new StringBuilder("number of frames seen are :")).append(f).toString()
            });
            pinimpression.setLoops(f);
        }
        if (BuyableProductHelper.isPinBuyable(_pin))
        {
            pinimpression.addToRichTypes(PinImpressionRichType.BUYABLE);
        }
        if (ModelHelper.isValid(_pin.getViewTags()) && pinimpression.getEndTime() - pinimpression.getTime() > 0x3b9aca00L)
        {
            String as[] = _pin.getViewTags().split(",,");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (!StringUtils.isEmpty(s))
                {
                    String as1[] = s.split(",");
                    ApiHttpClient.addToRequestQueue(new ViewTagRequest(as1[1], as1[0]), null);
                }
            }

        }
        _impressionStart = 0L;
        return pinimpression;
    }

    public volatile Object markImpressionEnd()
    {
        return markImpressionEnd();
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new PinImpression();
        _impression.setTime(_impressionStart);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/task/education/view/EducationToolTipView$CommerceHomeFeedToolTipEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        if (BooleanUtils.isTrue(Boolean.valueOf(isCinematicPin(_pin))))
        {
            _pin = null;
            _pinCinematicDrawable.prepareForReuse();
        }
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        if (_pin != null)
        {
            drawBackground(canvas);
            drawCSRHeader(canvas);
            drawPin(canvas);
            drawInfo(canvas);
            drawUser(canvas);
            drawSource(canvas);
            drawThrough(canvas);
            drawOnto(canvas);
            drawDomain(canvas);
            drawOverlay(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        _measuredWidth = android.view.View.MeasureSpec.getSize(i);
        if (_measuredWidth < 0)
        {
            _measuredWidth = 100;
        }
        if (_pin != null)
        {
            boolean flag1 = _pin.shouldShowPromoterInGrid();
            _dividerDrawable.setWidth(_measuredWidth);
            _dividerDrawable.setHeight(PinCellDrawable.DIVIDER_HEIGHT);
            _measuredHeight = 0;
            if (_pin.isCSR())
            {
                _csrHeaderDrawable.setTitle(STR_CSR);
                _csrHeaderDrawable.setY(_measuredHeight);
                _csrHeaderDrawable.setWidth(_measuredWidth);
                _csrHeaderDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _csrHeaderDrawable.setTitleTopOffset(CSR_TITLE_TOP_OFFSET);
                _csrHeaderDrawable.setIconSize(CSR_ICON_SIZE);
                _csrHeaderDrawable.setIconRightPadding(CSR_ICON_RIGHT_PADDING);
                _csrHeaderDrawable.measure();
                _measuredHeight = _measuredHeight + _csrHeaderDrawable.getHeight();
            }
            _pinDrawable.setPin(_pin);
            Object obj = _pinDrawable;
            Object obj1;
            boolean flag;
            if (_pin.isGif() && BooleanUtils.isFalse(Boolean.valueOf(isCinematicPin(_pin))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((PinImageDrawable) (obj)).setGifPin(flag);
            _pinDrawable.setRenderLargePin(_renderLargePin);
            _pinDrawable.setY(_measuredHeight);
            _pinDrawable.setWidth(_measuredWidth);
            _pinDrawable.setPadding(_cellPadding);
            _pinDrawable.measure();
            _measuredHeight = _measuredHeight + _pinDrawable.getHeight();
            if (BooleanUtils.isTrue(Boolean.valueOf(isCinematicPin(_pin))))
            {
                _pinCinematicDrawable.setPin(_pin);
                _pinCinematicDrawable.setWidth(_pinDrawable.getWidth());
                _pinCinematicDrawable.initLogging(_pin.getCinematicSrc());
                _pinCinematicDrawable.measure();
                _measuredHeight = _pinCinematicDrawable.getHeight();
                _pinDrawable.setHeight(_measuredHeight);
            }
            if (_renderDescription)
            {
                _infoDrawable.setRenderSocial(_renderSocial);
                _infoDrawable.setRenderLargePin(_renderLargePin);
                _infoDrawable.setY(_measuredHeight);
                _infoDrawable.setWidth(_measuredWidth);
                _infoDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _infoDrawable.setPin(_pin);
                _infoDrawable.setRenderHashtag(_renderHashtag);
                _infoDrawable.measure();
                _measuredHeight = _measuredHeight + _infoDrawable.getHeight();
            }
            if (_renderSource && !_pin.hasAttribution())
            {
                _renderSource = false;
            }
            if (_renderDomain && (_pin.getDomain() == null || _pin.getDomain().length() <= 0))
            {
                _renderDomain = false;
            }
            obj = _pin.getUser();
            if (_renderCompactUser)
            {
                Interest interest = _pin.getInterest();
                if (_renderInterest && interest != null)
                {
                    PinIconTextDrawable pinicontextdrawable = _userDrawable;
                    if (_popularInTitle != null)
                    {
                        obj1 = _popularInTitle;
                    } else
                    {
                        obj1 = STR_POPULAR_IN;
                    }
                    pinicontextdrawable.setTitle(((String) (obj1)));
                    _userDrawable.setSubTitle(interest.getName());
                } else
                {
                    if (obj != null)
                    {
                        _userDrawable.setTitle(((User) (obj)).getFullName());
                    }
                    obj1 = _pin.getBoard();
                    if (obj1 != null)
                    {
                        _userDrawable.setSubTitle(((Board) (obj1)).getName());
                    }
                }
                if (flag1)
                {
                    _userDrawable.showFeedbackIcon(true);
                    _userDrawable.setIcon(PinIconTextDrawable.FEEDBACK_ICON);
                    if (_pin.getPromoterUser() != null)
                    {
                        obj = _pin.getPromoterUser();
                    }
                    _userDrawable.setTitle(STR_PROMOTED_BY);
                    obj1 = obj;
                    if (obj != null)
                    {
                        _userDrawable.setSubTitle(((User) (obj)).getFullName());
                        obj1 = obj;
                    }
                } else
                {
                    obj1 = obj;
                }
                _userDrawable.setY(_measuredHeight);
                _userDrawable.setWidth(_measuredWidth);
                _userDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _userDrawable.measure();
                _measuredHeight = _measuredHeight + _userDrawable.getHeight();
            } else
            {
                obj1 = obj;
            }
            if (_renderUser)
            {
                if (obj1 != null)
                {
                    _userDrawable.setTitle(((User) (obj1)).getFullName());
                }
                _userDrawable.setSubTitle(STR_SAVED_BY);
                _userDrawable.setReverseOrder(true);
                _userDrawable.setY(_measuredHeight);
                _userDrawable.setWidth(_measuredWidth);
                _userDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _userDrawable.measure();
                _measuredHeight = _measuredHeight + _userDrawable.getHeight();
            }
            if (_renderSource)
            {
                if (_pin.hasAttribution())
                {
                    _sourceDrawable.setOval(false);
                    _sourceDrawable.setSubTitle(STR_SOURCE);
                    _sourceDrawable.setTitle(_pin.getAttribution());
                }
                _sourceDrawable.setReverseOrder(true);
                _sourceDrawable.setY(_measuredHeight);
                _sourceDrawable.setWidth(_measuredWidth);
                _sourceDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _sourceDrawable.measure();
                _measuredHeight = _measuredHeight + _sourceDrawable.getHeight();
            }
            if (_renderOnto)
            {
                obj = _pin.getBoard();
                if (obj != null)
                {
                    _ontoDrawable.setTitle(((Board) (obj)).getName());
                }
                _ontoDrawable.setSubTitle(STR_ONTO);
                _ontoDrawable.setReverseOrder(true);
                _ontoDrawable.setY(_measuredHeight);
                _ontoDrawable.setWidth(_measuredWidth);
                _ontoDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _ontoDrawable.measure();
                _measuredHeight = _measuredHeight + _ontoDrawable.getHeight();
            }
            if (_renderThrough)
            {
                if (_pin.getIsDynamicallyInserted() && _pin.getRelatedParentPin() != null && _pin.getRelatedParentPin().getBoard() != null)
                {
                    _throughDrawable.setSubTitle(_pin.getRelatedParentPin().getBoard().getName());
                    _throughDrawable.setTitle(STR_RELATED_PIN);
                } else
                {
                    obj = _pin.getBoard();
                    if (obj != null)
                    {
                        _throughDrawable.setSubTitle(((Board) (obj)).getName());
                        _throughDrawable.setTitle(STR_PICKED_FOR_YOU);
                    }
                }
                _throughDrawable.showFeedbackIcon(true);
                _throughDrawable.setIcon(PinIconTextDrawable.FEEDBACK_ICON);
                _throughDrawable.setReverseOrder(false);
                _throughDrawable.setY(_measuredHeight);
                _throughDrawable.setWidth(_measuredWidth);
                _throughDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _throughDrawable.measure();
                _measuredHeight = _measuredHeight + _throughDrawable.getHeight();
            }
            if (_renderDomain)
            {
                if (_pin.isCSR())
                {
                    _domainDrawable.setTitle(STR_CSR_FROM);
                    _domainDrawable.setSubTitle(_pin.getDomain());
                } else
                {
                    _domainDrawable.setTitle(_pin.getDomain());
                }
                _domainDrawable.setY(_measuredHeight);
                _domainDrawable.setWidth(_measuredWidth);
                _domainDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _domainDrawable.measure();
                _measuredHeight = _measuredHeight + _domainDrawable.getHeight();
            }
            _measuredHeight = _measuredHeight + _cellPadding.height();
        }
        super.onMeasure(i, j);
        setMeasuredDimension(_measuredWidth, _measuredHeight);
    }

    public void prepareForReuse()
    {
        _pinDrawable.prepareForReuse();
        _pinCinematicDrawable.prepareForReuse();
        _infoDrawable.prepareForReuse();
        _userDrawable.prepareForReuse();
        _ontoDrawable.prepareForReuse();
        _throughDrawable.prepareForReuse();
        _sourceDrawable.prepareForReuse();
        _domainDrawable.prepareForReuse();
        _csrHeaderDrawable.prepareForReuse();
    }

    public void setCellPadding(Rect rect)
    {
        _cellPadding = rect;
    }

    public void setCropPinImage(boolean flag)
    {
        _pinDrawable.setAutoCrop(flag);
    }

    public void setIsDisplayedOnHomefeed(boolean flag)
    {
        _isDisplayedOnHomefeed = flag;
    }

    public void setIsRelatedPin(boolean flag)
    {
        _isRelatedPin = flag;
    }

    public void setOverrideClicks(boolean flag)
    {
        _overrideClicks = flag;
    }

    public void setPercentageVisible(int i)
    {
        _percentageVisible = i;
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin == null)
        {
            return;
        }
        boolean flag1;
        if (_pin != null && _pin.getUid().equals(pin.getUid()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _pin = pin;
        if (!flag1)
        {
            prepareForReuse();
        }
        unTouchAll();
        if (!flag && !flag1)
        {
            _renderStart = SystemClock.elapsedRealtime();
            _renderDuration = -1L;
            _cached = false;
            if (_renderLargePin)
            {
                pin = _pin.getImageLargeUrl();
            } else
            {
                pin = _pin.getImageMediumUrl();
            }
            _imageUrl = pin;
            StopWatch.get().logTimeStamp("ttrfp_tmp_log", "ts_80_to_load_pin_img", true).putAuxData("ttrfp_tmp_log", "sts_80_to_load_img_url", new JsonPrimitive(_imageUrl), true).startSubWatch("ttrfp_tmp_log", "du_80_1st_img_loaded");
            if (BooleanUtils.isTrue(Boolean.valueOf(isCinematicPin(_pin))))
            {
                if (StringUtils.isNotEmpty(_pin.getCinematicCoverSrc()))
                {
                    _pinDrawable.loadImage(_pin.getCinematicCoverSrc());
                }
                _pinCinematicDrawable.loadImage(_pin.getCinematicSrc());
            } else
            {
                _pinDrawable.loadImage(_imageUrl);
            }
            if (_renderInterest)
            {
                pin = _pin.getInterest();
                if (pin != null && pin.getImageSmallUrl() != null)
                {
                    _userDrawable.loadImage(pin.getImageSmallUrl());
                    _userDrawable.setOval(false);
                }
            } else
            if (_renderUser || _renderCompactUser)
            {
                User user = _pin.getUser();
                pin = user;
                if (_pin.getPromoterUid() != null)
                {
                    pin = user;
                    if (_pin.getPromoterUser() != null)
                    {
                        pin = _pin.getPromoterUser();
                    }
                }
                if (pin != null)
                {
                    _userDrawable.loadImage(pin.getImageMediumUrl());
                    _userDrawable.setOval(true);
                }
            }
            if (_pin.hasRichPinGridData())
            {
                _infoDrawable.loadSiteIcon(_pin.getRichIcon());
            } else
            if (_pin.hasPlaceGridData())
            {
                _infoDrawable.loadSiteIcon(_pin.getPlace().getSourceIcon());
            }
            if (_renderSource)
            {
                if (_pin.hasAttribution())
                {
                    _sourceDrawable.loadImage(_pin.getAttrProviderIconUrl());
                } else
                {
                    _renderSource = false;
                }
            }
            if (_renderOnto)
            {
                pin = _pin.getBoard();
                if (pin != null)
                {
                    _ontoDrawable.loadImage(pin.getImagePreviewUrl());
                }
            }
            if (_renderThrough)
            {
                pin = _pin.getRecommendationBoard();
                if (pin != null)
                {
                    _throughDrawable.loadImage(pin.getImagePreviewUrl());
                } else
                if (_pin.getIsDynamicallyInserted() && _pin.getRelatedParentPin() != null && _pin.getRelatedParentPin().getImageSquareUrl() != null)
                {
                    _throughDrawable.loadImage(_pin.getRelatedParentPin().getImageSquareUrl());
                } else
                if (_pin.getBoard() != null)
                {
                    _throughDrawable.loadImage(_pin.getBoard().getImagePreviewUrl());
                }
            }
            if (_renderCSRHeader)
            {
                _csrHeaderDrawable.loadImage(CSR_ICON);
            }
        }
        requestLayout();
    }

    public void setPinPosition(int i)
    {
        _pinPosition = i;
    }

    public void setPopularInTitle(String s)
    {
        _popularInTitle = s;
    }

    public void setPressed(boolean flag)
    {
        super.setPressed(flag);
        if (!flag)
        {
            unTouchAll();
        }
    }

    public void setRenderCSRHeader(boolean flag)
    {
        _renderCSRHeader = flag;
    }

    public void setRenderCinematicPin(boolean flag)
    {
        _renderCinematic = flag;
    }

    public void setRenderCompactUser(boolean flag)
    {
        _renderCompactUser = flag;
    }

    public void setRenderDescription(boolean flag)
    {
        _renderDescription = flag;
    }

    public void setRenderDomain(boolean flag)
    {
        _renderDomain = flag;
    }

    public void setRenderHashtag(boolean flag)
    {
        _renderHashtag = flag;
    }

    public void setRenderInterest(boolean flag)
    {
        if (flag)
        {
            _renderInterest = true;
            _renderCompactUser = true;
            return;
        } else
        {
            _renderInterest = false;
            return;
        }
    }

    public void setRenderLargePin(boolean flag)
    {
        _renderLargePin = flag;
    }

    public void setRenderOnto(boolean flag)
    {
        _renderOnto = flag;
    }

    public void setRenderSocial(boolean flag)
    {
        _renderSocial = flag;
    }

    public void setRenderSource(boolean flag)
    {
        _renderSource = flag;
    }

    public void setRenderThrough(boolean flag)
    {
        _renderThrough = flag;
    }

    public void setRenderUser(boolean flag)
    {
        _renderUser = flag;
    }

    static 
    {
        PADDING_ITEM = (int)Resources.dimension(0x7f0a0191);
        CSR_TITLE_TOP_OFFSET = PADDING_ITEM + 1;
    }


/*
    static long access$002(PinGridCell pingridcell, long l)
    {
        pingridcell._renderDuration = l;
        return l;
    }

*/














/*
    static boolean access$202(PinGridCell pingridcell, boolean flag)
    {
        pingridcell._cached = flag;
        return flag;
    }

*/













    private class _cls1 extends CachableRoundedBitmap.ImageListener
    {

        final PinGridCell this$0;

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            long l = 0L;
            long l1 = SystemClock.elapsedRealtime();
            bitmap = PinGridCell.this;
            if (_renderStart > 0L)
            {
                l = l1 - _renderStart;
            }
            bitmap._renderDuration = l;
            bitmap = PinGridCell.this;
            boolean flag;
            if (loadedfrom == com.squareup.picasso.Picasso.LoadedFrom.a || loadedfrom == com.squareup.picasso.Picasso.LoadedFrom.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bitmap._cached = flag;
            StopWatch.get().stopSubWatch("ttrfp_tmp_log", "du_80_1st_img_loaded").putAuxData("ttrfp_tmp_log", "sts_80_1st_loaded_img_url", new JsonPrimitive(_imageUrl), false).putAuxData("ttrfp_tmp_log", "sts_80_1st_loaded_img_from", new JsonPrimitive(String.valueOf(loadedfrom)), false);
            Events.post(new ImageLoadEvent());
        }

        _cls1()
        {
            this$0 = PinGridCell.this;
            super();
        }

        private class ImageLoadEvent
        {

            public ImageLoadEvent()
            {
            }
        }

    }


    private class _cls2 extends com.pinterest.ui.BetterGestureDetector.SimpleOnGestureListener
    {

        public boolean isDown;
        public final int minTouch = ViewConfiguration.getPressedStateDuration();
        final PinGridCell this$0;
        public final int touchDelay = ViewConfiguration.getTapTimeout();

        public boolean onDown(MotionEvent motionevent)
        {
            resolveTouch(motionevent, true, false);
            return true;
        }

        public void onLongPress(MotionEvent motionevent)
        {
            resolveTouch(null, false, true);
            while (_overrideClicks || !_pinDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY())) 
            {
                return;
            }
            if (_isRelatedPin)
            {
                motionevent = ComponentType.RELATED_PIN;
            } else
            {
                motionevent = ComponentType.FLOWED_PIN;
            }
            Pinalytics.a(EventType.LONG_PRESS, ElementType.PIN_SOURCE_IMAGE, motionevent, _pin.getUid(), _pin.getLoggingAuxData(_pinPosition), null);
            Events.post(new ShowPinContextMenuEvent(_pin));
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            resolveTouch(null, false, true);
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            int i = (int)(motionevent.getDownTime() - motionevent.getEventTime());
            class _cls1
                implements Runnable
            {

                final _cls2 this$1;

                public void run()
                {
                    unTouchAll();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            boolean flag;
            if (i < touchDelay)
            {
                i = touchDelay - i;
            } else
            {
                i = minTouch;
            }
            resolveTouch(motionevent, true, true);
            postDelayed(new _cls1(), i);
            if (_isRelatedPin)
            {
                motionevent = ComponentType.RELATED_PIN;
            } else
            {
                motionevent = ComponentType.FLOWED_PIN;
            }
            if (_pinDrawable.isPressed() || _csrHeaderDrawable.isPressed())
            {
                Pinalytics.a(ElementType.PIN_SOURCE_IMAGE, motionevent, _pin.getUid(), _pin.getLoggingAuxData(_pinPosition));
                if (BooleanUtils.isTrue(Boolean.valueOf(isCinematicPin(_pin))) && _pinCinematicDrawable != null)
                {
                    _pinCinematicDrawable.prepareForReuse();
                }
                Object obj;
                String s;
                if (_overrideClicks)
                {
                    Events.post(new OverrideNavigationEvent(2, _pin.getUid()));
                } else
                {
                    PinHashtagListDialog pinhashtaglistdialog;
                    boolean flag1;
                    if (getParent() instanceof PinterestAdapterView)
                    {
                        flag1 = openPinCloseup(_pin);
                    } else
                    {
                        flag1 = false;
                    }
                    if (!flag1)
                    {
                        StopWatch.get().start("pin_closeup");
                        Events.post(new Navigation(Location.PIN, _pin));
                    }
                }
                playSoundEffect(0);
                flag = true;
            } else
            {
                flag = false;
            }
            i = ((flag) ? 1 : 0);
            if (_renderCompactUser)
            {
                i = ((flag) ? 1 : 0);
                if (_userDrawable.isPressed())
                {
                    i = ((flag) ? 1 : 0);
                    if (!flag)
                    {
                        if (_renderInterest)
                        {
                            Pinalytics.a(ElementType.PIN_INTEREST, motionevent, _pin.getInterestUid());
                            if (_overrideClicks)
                            {
                                Events.post(new OverrideNavigationEvent(7, _pin.getInterestUid()));
                            } else
                            {
                                obj = _pin.getInterest();
                                if (obj != null)
                                {
                                    if (((Interest) (obj)).getFollowing() == null)
                                    {
                                        ((Interest) (obj)).setFollowing(Boolean.valueOf(true));
                                    }
                                    StopWatch.get().start("interest_ttrfp");
                                    Events.post(new Navigation(Location.INTEREST, ((com.pinterest.api.model.Model) (obj))));
                                }
                            }
                        } else
                        {
                            Pinalytics.a(ElementType.PIN_BOARD, motionevent, _pin.getBoardUid());
                            if (_overrideClicks)
                            {
                                Events.post(new OverrideNavigationEvent(4, _pin.getBoardUid()));
                            } else
                            {
                                obj = _pin.getBoard();
                                if (obj != null)
                                {
                                    Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                                }
                            }
                        }
                        playSoundEffect(0);
                        i = 1;
                    }
                }
            }
            flag = i;
            if (_throughDrawable.isPressed())
            {
                flag = i;
                if (i == 0)
                {
                    if (_pin.getIsDynamicallyInserted() && _pin.getRelatedParentPin() != null)
                    {
                        openPinCloseup(_pin.getRelatedParentPin());
                    }
                    obj = _pin.getBoard();
                    flag = i;
                    if (obj != null)
                    {
                        Pinalytics.a(ElementType.PIN_BOARD, motionevent, ((Board) (obj)).getUid());
                        if (_overrideClicks)
                        {
                            Events.post(new OverrideNavigationEvent(4, _pin.getBoardUid()));
                        } else
                        {
                            Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                        }
                        playSoundEffect(0);
                        flag = true;
                    }
                }
            }
            i = ((flag) ? 1 : 0);
            if (_infoDrawable.isPressed())
            {
                i = ((flag) ? 1 : 0);
                if (!flag)
                {
                    Pinalytics.a(ElementType.PIN_DESCRIPTION, motionevent);
                    if (!_overrideClicks && _pin.hasHashtag())
                    {
                        obj = _pin.getSpanWords();
                        if (((ArrayList) (obj)).size() == 1)
                        {
                            HashTagUtils.gotoTarget((String)((ArrayList) (obj)).get(0));
                        } else
                        {
                            pinhashtaglistdialog = PinHashtagListDialog.newInstance();
                            pinhashtaglistdialog.setHashTags(((java.util.List) (obj)));
                            Events.post(new DialogEvent(pinhashtaglistdialog));
                        }
                    }
                    playSoundEffect(0);
                    i = 1;
                }
            }
            flag = i;
            if (_throughDrawable.isIconPressed())
            {
                flag = i;
                if (i == 0)
                {
                    if (_pin.getRecommendationReason() != null || _pin.getIsDynamicallyInserted())
                    {
                        Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_PFY, motionevent);
                        if (!_overrideClicks)
                        {
                            showRecommendationFeedbackDialog();
                        }
                    }
                    playSoundEffect(0);
                    flag = true;
                }
            }
            i = ((flag) ? 1 : 0);
            if (_userDrawable.isIconPressed())
            {
                i = ((flag) ? 1 : 0);
                if (!flag)
                {
                    if (_pin.shouldShowPromoterInGrid())
                    {
                        Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_PROMOTED, motionevent);
                        if (!_overrideClicks)
                        {
                            showPromotedFeedbackDialog();
                        }
                    }
                    playSoundEffect(0);
                    i = 1;
                }
            }
            flag = i;
            if (_renderUser)
            {
                flag = i;
                if (_userDrawable.isPressed())
                {
                    flag = i;
                    if (i == 0)
                    {
                        if (_overrideClicks)
                        {
                            Events.post(new OverrideNavigationEvent(3, _pin.getUserUid()));
                        } else
                        {
                            Pinalytics.a(ElementType.PIN_USER, motionevent, _pin.getUserUid());
                            Events.post(new Navigation(Location.USER, _pin.getUser()));
                        }
                        playSoundEffect(0);
                        flag = true;
                    }
                }
            }
            i = ((flag) ? 1 : 0);
            if (_sourceDrawable.isPressed())
            {
                i = ((flag) ? 1 : 0);
                if (!flag)
                {
                    getContext();
                    if (_pin.hasAttribution())
                    {
                        s = _pin.getAttrAuthorUrl();
                        obj = s;
                        if (s == null)
                        {
                            obj = _pin.getClickThroughUrl();
                        }
                        Pinalytics.a(ElementType.PIN_ATTRIBUTION, motionevent);
                        if (_overrideClicks)
                        {
                            Events.post(new OverrideNavigationEvent(5, ((String) (obj))));
                        } else
                        {
                            obj = new Navigation(Location.BROWSER, ((String) (obj)));
                            ((Navigation) (obj)).putExtra("Referer", _pin.getPinterestLink());
                            Events.post(obj);
                        }
                    } else
                    if (_pin.getDomain() != null)
                    {
                        Pinalytics.a(ElementType.PIN_DOMAIN, motionevent);
                        if (_overrideClicks)
                        {
                            Events.post(new OverrideNavigationEvent(4, _pin.getDomain()));
                        } else
                        {
                            Events.post(new Navigation(Location.DOMAIN, _pin.getDomain()));
                        }
                    }
                    i = ((flag) ? 1 : 0);
                    if (_overrideClicks)
                    {
                        playSoundEffect(0);
                        i = 1;
                    }
                }
            }
            flag = i;
            if (_ontoDrawable.isPressed())
            {
                flag = i;
                if (i == 0)
                {
                    obj = _pin.getBoard();
                    flag = i;
                    if (obj != null)
                    {
                        Pinalytics.a(ElementType.PIN_BOARD, motionevent, ((Board) (obj)).getUid());
                        if (_overrideClicks)
                        {
                            Events.post(new OverrideNavigationEvent(4, _pin.getBoardUid()));
                        } else
                        {
                            Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                        }
                        playSoundEffect(0);
                        flag = true;
                    }
                }
            }
            if (_domainDrawable.isPressed() && !flag)
            {
                Pinalytics.a(ElementType.PIN_DOMAIN, motionevent);
                if (_overrideClicks)
                {
                    Events.post(new OverrideNavigationEvent(4, _pin.getDomain()));
                } else
                if (_pin.isCSR())
                {
                    Events.post(new Navigation(Location.BROWSER, _pin.getLink()));
                } else
                {
                    Events.post(new Navigation(Location.DOMAIN, _pin.getDomain()));
                }
                playSoundEffect(0);
            }
            return true;
        }

        public void resolveTouch(MotionEvent motionevent, boolean flag, boolean flag1)
        {
            unTouchAll();
            if (isEnabled() && (isDown != flag || flag1) && motionevent != null)
            {
                if (_csrHeaderDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _csrHeaderDrawable.setPressed(true);
                }
                if (_pinDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _pinDrawable.setPressed(true);
                }
                if (_userDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    if (_userDrawable.getIconBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                    {
                        _userDrawable.setIconPressed(true);
                    } else
                    {
                        _userDrawable.setPressed(true);
                    }
                }
                if (_sourceDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _sourceDrawable.setPressed(true);
                }
                if (_ontoDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _ontoDrawable.setPressed(true);
                }
                if (_throughDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    if (_throughDrawable.getIconBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                    {
                        _throughDrawable.setIconPressed(true);
                    } else
                    {
                        _throughDrawable.setPressed(true);
                    }
                }
                if (_infoDrawable.isClickable() && _infoDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _infoDrawable.setPressed(true);
                }
                if (_domainDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    _domainDrawable.setPressed(true);
                }
            }
            isDown = flag;
            if (flag1)
            {
                invalidate();
                return;
            } else
            {
                postInvalidateDelayed(touchDelay);
                return;
            }
        }

        _cls2()
        {
            this$0 = PinGridCell.this;
            super();
            isDown = false;
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinGridCell this$0;

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationToolTipView.CommerceHomeFeedToolTipEvent commercehomefeedtooltipevent)
        {
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/education/view/EducationToolTipView$CommerceHomeFeedToolTipEvent
            });
            if (!StopWatch.get().isActive("pin_closeup") && BuyableProductHelper.isPinAvailable(_pin))
            {
                Events.post(new Navigation(Location.PIN, _pin));
            }
        }

        _cls3()
        {
            this$0 = PinGridCell.this;
            super();
        }
    }

}
