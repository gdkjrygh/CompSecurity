// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.pin.view.modules.util.IconTextCellView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.AtMentionSpan;
import com.pinterest.ui.text.HashTag;
import com.pinterest.ui.text.HashTagUtils;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupBasicModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    private IconTextCellView _boardVw;
    private CharSequence _createdAtText;
    private TextView _createdAtTv;
    private TextView _descriptionTv;
    private LinearLayout _descriptionWrapper;
    private View _endDivider;
    private IconTextCellView _pinnerVw;

    public PinCloseupBasicModule(Context context)
    {
        super(context);
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_BASIC;
    }

    protected boolean hasContent()
    {
        return true;
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(1);
        addView(getDividerView(), -1, Constants.HAIRLINE);
        _descriptionWrapper = new LinearLayout(getContext());
        _descriptionWrapper.setOrientation(0);
        addView(_descriptionWrapper, -1, -1);
        _descriptionTv = new TextView(getContext(), null, 0x7f0100dc);
        _descriptionWrapper.addView(_descriptionTv, new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F));
        _createdAtTv = new TextView(getContext(), null, 0x7f0100dd);
        _descriptionWrapper.addView(_createdAtTv, new android.widget.LinearLayout.LayoutParams(-2, -2, 0.0F));
        int i = (int)Resources.dimension(0x7f0a0186);
        int j = (int)Resources.dimension(0x7f0a0184);
        _pinnerVw = new IconTextCellView(getContext());
        _pinnerVw.setImageOval(true);
        _pinnerVw.setOnClickListener(this);
        _pinnerVw.setPadding(j, i, j, i / 2);
        _pinnerVw.setBackgroundResource(0x7f020283);
        addView(_pinnerVw, -1, -2);
        _boardVw = new IconTextCellView(getContext());
        _boardVw.setImageRounded(true);
        _boardVw.setOnClickListener(this);
        _boardVw.setBackgroundResource(0x7f020283);
        _boardVw.setPadding(j, i / 2, j, i);
        addView(_boardVw, -1, -2);
        _endDivider = getDividerView();
        addView(_endDivider, -1, Constants.HAIRLINE);
    }

    public void onClick(View view)
    {
        if (view == _pinnerVw)
        {
            Pinalytics.a(ElementType.PIN_USER, ComponentType.MODAL_PIN, _pin.getUserUid());
            Events.post(new Navigation(Location.USER, _pin.getUser()));
        } else
        if (view == _boardVw)
        {
            Pinalytics.a(ElementType.PIN_BOARD, ComponentType.MODAL_PIN, _pin.getBoardUid());
            if (_pin.getBoard() != null)
            {
                Events.post(new Navigation(Location.BOARD, _pin.getBoard()));
                return;
            } else
            {
                Events.post(new Navigation(Location.BOARD, _pin.getBoardUid()));
                return;
            }
        }
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        if (_pin.isCSR())
        {
            setVisibility(8);
        } else
        {
            if (StringUtils.isNotEmpty(_pin.getCleanDescription()))
            {
                Object obj2 = _pin.getDescription();
                Object obj = HashTagUtils.getSpans(((String) (obj2)), '#');
                Object obj1 = HashTagUtils.getSpans(((String) (obj2)), '@');
                if (((ArrayList) (obj)).size() > 0 || ((ArrayList) (obj1)).size() > 0)
                {
                    obj2 = new SpannableString(((CharSequence) (obj2)));
                    HashTagUtils.setSpans(((SpannableString) (obj2)), ((ArrayList) (obj)), com/pinterest/ui/text/HashTag);
                    HashTagUtils.setSpans(((SpannableString) (obj2)), ((ArrayList) (obj1)), com/pinterest/ui/text/AtMentionSpan);
                    _descriptionTv.setText(((CharSequence) (obj2)));
                    _descriptionTv.setMovementMethod(LinkMovementMethod.getInstance());
                } else
                {
                    _descriptionTv.setText(((CharSequence) (obj2)));
                }
                _descriptionTv.setVisibility(0);
                obj = null;
                obj1 = _pin.getCreatedAt();
                if (obj1 != null)
                {
                    obj = FuzzyDateFormatter.a(((java.util.Date) (obj1)), true);
                }
                _createdAtText = ((CharSequence) (obj));
                _createdAtTv.setText(_createdAtText);
                _createdAtTv.setVisibility(0);
            } else
            {
                _descriptionTv.setVisibility(8);
                _createdAtTv.setVisibility(8);
            }
            obj = _pin.getUser();
            if (obj != null)
            {
                _pinnerVw.setImageUrl(((User) (obj)).getImageMediumUrl());
                if (StringUtils.isNotBlank(((User) (obj)).getFullName()))
                {
                    _pinnerVw.setTitle((new StringBuilder("<b>")).append(((User) (obj)).getFullName()).append("</b>").toString());
                }
            }
            obj = _pin.getBoard();
            if (obj != null)
            {
                _boardVw.setImageUrl(((Board) (obj)).getImagePreviewUrl());
                if (StringUtils.isNotBlank(((Board) (obj)).getName()))
                {
                    _boardVw.setTitle(Resources.string(0x7f0704c2, new Object[] {
                        (new StringBuilder("<b>")).append(((Board) (obj)).getName()).append("</b>").toString()
                    }));
                }
            }
            if (_pin.isCSR())
            {
                _pinnerVw.setVisibility(8);
                _boardVw.setVisibility(8);
                _endDivider.setVisibility(4);
                return;
            }
        }
    }
}
