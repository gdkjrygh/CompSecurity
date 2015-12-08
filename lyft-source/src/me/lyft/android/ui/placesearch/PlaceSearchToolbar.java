// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.subjects.PublishSubject;

public class PlaceSearchToolbar extends FrameLayout
{

    AppFlow appFlow;
    View backButton;
    final PublishSubject backButtonTapSubject = PublishSubject.create();
    View clearButton;
    ImageView iconImageView;
    private TextWatcher onQueryChanged;
    final PublishSubject queryChangeSubject = PublishSubject.create();
    EditText queryEditText;

    public PlaceSearchToolbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onQueryChanged = new TextWatcher() {

            final PlaceSearchToolbar this$0;

            public void afterTextChanged(Editable editable)
            {
                editable = editable.toString();
                queryChangeSubject.onNext(editable);
                invalidateClearButtonVisibility(editable);
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = PlaceSearchToolbar.this;
                super();
            }
        };
        inflate(context, 0x7f0300f9, this);
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            clearButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PlaceSearchToolbar this$0;

                public void onClick(View view)
                {
                    clearQuery();
                }

            
            {
                this$0 = PlaceSearchToolbar.this;
                super();
            }
            });
            backButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PlaceSearchToolbar this$0;

                public void onClick(View view)
                {
                    backButtonTapSubject.onNext(Unit.create());
                    goBack();
                }

            
            {
                this$0 = PlaceSearchToolbar.this;
                super();
            }
            });
            Scoop.a(this).b(this);
            return;
        }
    }

    private void clearQuery()
    {
        Keyboard.showKeyboard(queryEditText);
        queryEditText.setText("");
    }

    private void goBack()
    {
        appFlow.goBack();
    }

    private void invalidateClearButtonVisibility(String s)
    {
        if (s.length() > 0)
        {
            clearButton.setVisibility(0);
            return;
        } else
        {
            clearButton.setVisibility(8);
            return;
        }
    }

    public Observable observeBackButtonTap()
    {
        return backButtonTapSubject.asObservable();
    }

    public Observable observeQueryChange()
    {
        return queryChangeSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            queryEditText.addTextChangedListener(onQueryChanged);
            invalidateClearButtonVisibility(queryEditText.getText().toString());
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        queryEditText.removeTextChangedListener(onQueryChanged);
    }

    public void setHintId(int i)
    {
        queryEditText.setHint(i);
    }

    public void setIconId(int i)
    {
        iconImageView.setImageResource(i);
    }

    public void setQuery(String s)
    {
        queryEditText.setText(s);
    }

    public void showKeyboard()
    {
        Keyboard.showKeyboard(queryEditText);
    }



}
