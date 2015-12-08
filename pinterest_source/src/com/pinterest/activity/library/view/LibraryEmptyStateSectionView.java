// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.base.Colors;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.IconView;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibrarySectionGridView

public class LibraryEmptyStateSectionView extends LinearLayout
{

    IconView _boardAddIcon;
    LinearLayout _createBoardLayout;
    private android.view.View.OnClickListener _createBoardListener;
    TextView _emptyPinsTv;
    LibrarySectionGridView _sectionGridView;

    public LibraryEmptyStateSectionView(Context context)
    {
        this(context, null);
    }

    public LibraryEmptyStateSectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _createBoardListener = new _cls1();
        init();
    }

    public static LibraryEmptyStateSectionView get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof LibraryEmptyStateSectionView))
        {
            return new LibraryEmptyStateSectionView(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (LibraryEmptyStateSectionView)view;
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f030134, this);
        ButterKnife.a(this);
        _boardAddIcon.setTint(Colors.RED);
        setOnClickListener(_createBoardListener);
        _sectionGridView.configureUI(new LibrarySection(null, "empty_state", null));
    }

    public void showEmptyPinsMessage(String s)
    {
        _createBoardLayout.setVisibility(8);
        _emptyPinsTv.setVisibility(0);
        if (!TextUtils.isEmpty(s))
        {
            _emptyPinsTv.setText(Resources.string(0x7f07032c, new Object[] {
                s
            }));
        }
        setOnClickListener(null);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LibraryEmptyStateSectionView this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
        }

        _cls1()
        {
            this$0 = LibraryEmptyStateSectionView.this;
            super();
        }
    }

}
