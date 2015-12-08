// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import me.lyft.android.common.Unit;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.subjects.PublishSubject;

public class SearchToolbarView extends FrameLayout
{

    ImageView clearButton;
    EditText editText;
    final PublishSubject editablePublishSubject = PublishSubject.create();
    final PublishSubject homePressedPublishSubject = PublishSubject.create();
    final TextWatcher textWatcher = new TextWatcher() {

        final SearchToolbarView this$0;

        public void afterTextChanged(Editable editable)
        {
            updateClearButtonState(editable);
            editablePublishSubject.onNext(editable);
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

            
            {
                this$0 = SearchToolbarView.this;
                super();
            }
    };

    public SearchToolbarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f030141, this, true);
    }

    private void updateClearButtonState(CharSequence charsequence)
    {
        ImageView imageview = clearButton;
        byte byte0;
        if (charsequence.length() <= 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void focusFieldAndShowKeyboard()
    {
        Keyboard.showKeyboard(editText);
    }

    public void hideKeyboard()
    {
        Keyboard.hideKeyboard(editText);
    }

    public Observable observeHomeClicked()
    {
        return homePressedPublishSubject.asObservable();
    }

    public Observable observeTextChange()
    {
        return editablePublishSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        editText.addTextChangedListener(textWatcher);
        updateClearButtonState(editText.getText().toString());
    }

    void onClearClicked()
    {
        editText.setText("");
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        editText.removeTextChangedListener(textWatcher);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    void onHomeClicked()
    {
        homePressedPublishSubject.onNext(Unit.create());
    }

}
