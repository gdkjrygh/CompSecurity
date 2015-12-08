// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener, PlaySearchController, PlaySearchVoiceController

public class PlaySearchPlateTextContainer extends FrameLayout
    implements TextWatcher, android.widget.TextView.OnEditorActionListener, PlaySearchListener
{

    PlaySearchController mController;
    private final InputMethodManager mInputManager;
    private TextView mSearchBoxActiveTextView;
    private ImageView mSearchBoxIdleText;
    EditText mSearchBoxTextInput;
    private boolean mSuspendTextChangeCallback;
    PlaySearchVoiceController mVoiceController;

    public PlaySearchPlateTextContainer(Context context)
    {
        this(context, null);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mInputManager = (InputMethodManager)context.getSystemService("input_method");
    }

    private void setText(String s)
    {
        if (mController.mCurrentSearchMode != 3 || mSearchBoxTextInput.getText().toString().equals(s))
        {
            return;
        } else
        {
            mSuspendTextChangeCallback = true;
            mSearchBoxTextInput.setText(s);
            mSearchBoxTextInput.setSelection(s.length());
            mSuspendTextChangeCallback = false;
            return;
        }
    }

    private void triggerSearch()
    {
        if (TextUtils.getTrimmedLength(mController.mCurrentQuery) > 0)
        {
            mController.onSearch();
        }
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mVoiceController != null)
        {
            mVoiceController.cancelPendingVoiceSearch(getContext());
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i != 3) goto _L2; else goto _L1
_L1:
        triggerSearch();
_L4:
        return true;
_L2:
        if (keyevent == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = keyevent.getKeyCode();
        if (i == 66 || i == 160 || i == 84)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (keyevent.getAction() == 1)
        {
            triggerSearch();
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mSearchBoxIdleText = (ImageView)findViewById(0x7f0d0338);
        mSearchBoxActiveTextView = (TextView)findViewById(0x7f0d0339);
        mSearchBoxTextInput = (EditText)findViewById(0x7f0d033a);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final PlaySearchPlateTextContainer this$0;

            public final void onClick(View view)
            {
                if (mController != null)
                {
                    mController.setMode(3);
                }
            }

            
            {
                this$0 = PlaySearchPlateTextContainer.this;
                super();
            }
        };
        mSearchBoxIdleText.setOnClickListener(onclicklistener);
        mSearchBoxActiveTextView.setOnClickListener(onclicklistener);
    }

    public final void onModeChanged(int i)
    {
        i;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 33
    //                   2 100
    //                   3 137
    //                   4 235;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        mSearchBoxIdleText.setVisibility(0);
        mSearchBoxActiveTextView.setVisibility(8);
        mSearchBoxTextInput.setVisibility(8);
        mSearchBoxTextInput.setOnEditorActionListener(null);
        mSearchBoxTextInput.setOnClickListener(null);
_L7:
        mInputManager.hideSoftInputFromWindow(mSearchBoxTextInput.getWindowToken(), 0);
        mSearchBoxTextInput.removeTextChangedListener(this);
        return;
_L3:
        mSearchBoxIdleText.setVisibility(8);
        mSearchBoxActiveTextView.setVisibility(0);
        mSearchBoxTextInput.setVisibility(8);
        mSearchBoxTextInput.setOnEditorActionListener(null);
        continue; /* Loop/switch isn't completed */
_L4:
        mSearchBoxIdleText.setVisibility(8);
        mSearchBoxActiveTextView.setVisibility(8);
        mSearchBoxTextInput.setVisibility(0);
        mSearchBoxTextInput.addTextChangedListener(this);
        mSearchBoxTextInput.setOnEditorActionListener(this);
        mSearchBoxTextInput.setOnClickListener(null);
        mSearchBoxTextInput.requestFocus();
        mInputManager.showSoftInput(mSearchBoxTextInput, 0);
        if (mController != null)
        {
            mController.notifyQueryChangeInternal(true);
        }
        setText(mController.mCurrentQuery);
        return;
_L5:
        if (mController != null)
        {
            mController.setQueryInternal("", true);
        }
        if (mController != null && mVoiceController != null)
        {
            PlaySearchVoiceController playsearchvoicecontroller = mVoiceController;
            Context context = getContext();
            Object obj = new Intent("com.google.android.play.search.VOICE_SEARCH_RESULT");
            ((Intent) (obj)).setPackage(context.getPackageName());
            obj = PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x40000000);
            Intent intent = new Intent(PlaySearchVoiceController.sVoiceIntent);
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", ((android.os.Parcelable) (obj)));
            if (!playsearchvoicecontroller.mRegistered)
            {
                context.registerReceiver(playsearchvoicecontroller, new IntentFilter("com.google.android.play.search.VOICE_SEARCH_RESULT"));
                playsearchvoicecontroller.mRegistered = true;
            }
            context.startActivity(intent);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onQueryChanged$505cbf4b(String s)
    {
        mSearchBoxActiveTextView.setText(s);
        setText(s);
    }

    public final void onSearch$552c4e01()
    {
    }

    public final void onSuggestionClicked$299d808f()
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (mController != null && !mSuspendTextChangeCallback)
        {
            mController.setQueryInternal(charsequence.toString(), true);
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
label0:
        {
            super.onWindowFocusChanged(flag);
            if (flag && mController != null && mController.mCurrentSearchMode == 4)
            {
                if (mVoiceController != null)
                {
                    mVoiceController.cancelPendingVoiceSearch(getContext());
                }
                if (TextUtils.isEmpty(mController.mCurrentQuery))
                {
                    break label0;
                }
                mController.onSearch();
            }
            return;
        }
        if (hasFocus())
        {
            mController.setMode(3);
            return;
        } else
        {
            mController.switchToSteadyStateMode();
            return;
        }
    }

}
