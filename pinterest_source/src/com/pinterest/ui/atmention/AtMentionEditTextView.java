// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.MultiAutoCompleteTextView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.AtMention;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Device;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.ui.atmention:
//            AtMentionAdapter

public class AtMentionEditTextView extends MultiAutoCompleteTextView
{

    private AtMentionAdapter _adapter;
    private String _pinUid;
    private AtMentionTokenizer _tokenizer;
    private TextWatcher onTextChanged;

    public AtMentionEditTextView(Context context)
    {
        super(context);
        _adapter = new AtMentionAdapter();
        onTextChanged = new _cls1();
        init();
    }

    public AtMentionEditTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _adapter = new AtMentionAdapter();
        onTextChanged = new _cls1();
        init();
    }

    public AtMentionEditTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _adapter = new AtMentionAdapter();
        onTextChanged = new _cls1();
        init();
    }

    private void init()
    {
        int i = 420;
        if (!isInEditMode()) goto _L2; else goto _L1
_L1:
        setDropDownWidth(i);
        _tokenizer = new AtMentionTokenizer(null);
        setTokenizer(_tokenizer);
        setAdapter(_adapter);
        addTextChangedListener(onTextChanged);
        return;
_L2:
        i = (int)(Device.getScreenWidth() * 0.8F);
        if (Device.isTablet())
        {
            i = Math.min(420, (int)(Device.getScreenWidth() * 0.8F));
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void submitAtMentionQuery(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            SearchApi.a(s, _pinUid, new _cls2());
        }
    }

    private void updateAdapterData(ApiResponse apiresponse)
    {
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (apiresponse instanceof PinterestJsonArray)
        {
            apiresponse = (PinterestJsonArray)apiresponse;
            ArrayList arraylist = new ArrayList();
            int i = 0;
            for (int j = apiresponse.a(); i < j; i++)
            {
                arraylist.add(AtMention.make(apiresponse.d(i)));
            }

            _adapter.replaceAll(arraylist);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void setPinUid(String s)
    {
        _pinUid = s;
    }




    private class _cls1
        implements TextWatcher
    {

        final AtMentionEditTextView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (enoughToFilter())
            {
                i = _tokenizer.findTokenStart(charsequence, getSelectionStart());
                j = _tokenizer.findTokenEnd(charsequence, getSelectionStart());
                submitAtMentionQuery(String.valueOf(charsequence.subSequence(i, j)));
            }
        }

        _cls1()
        {
            this$0 = AtMentionEditTextView.this;
            super();
        }
    }


    private class AtMentionTokenizer
        implements android.widget.MultiAutoCompleteTextView.Tokenizer
    {

        public int findTokenEnd(CharSequence charsequence, int i)
        {
            int j;
            for (j = charsequence.length(); i < j; i++)
            {
                if (charsequence.charAt(i) == ' ')
                {
                    return i;
                }
            }

            return j;
        }

        public int findTokenStart(CharSequence charsequence, int i)
        {
            if (charsequence.length() != 0)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            i = 0;
_L4:
            return i;
_L2:
            int j;
            j--;
_L5:
            if (j <= 0 || charsequence.charAt(j - 1) == '@')
            {
                continue; /* Loop/switch isn't completed */
            }
            if (charsequence.charAt(j - 1) != ' ') goto _L2; else goto _L1
_L1:
            return i;
            if (j == 0 && charsequence.charAt(0) != '@') goto _L4; else goto _L3
_L3:
            return j;
            j = i;
              goto _L5
        }

        public CharSequence terminateToken(CharSequence charsequence)
        {
            int i;
            for (i = charsequence.length(); i > 0 && charsequence.charAt(i - 1) == ' '; i--) { }
            if (i > 0 && charsequence.charAt(i - 1) == '@')
            {
                return charsequence;
            }
            Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION, ComponentType.MODAL_DIALOG);
            if (charsequence instanceof Spanned)
            {
                SpannableString spannablestring = new SpannableString((new StringBuilder()).append(charsequence).append(" ").toString());
                TextUtils.copySpansFrom((Spanned)charsequence, 0, charsequence.length(), java/lang/Object, spannablestring, 0);
                return spannablestring;
            } else
            {
                return (new StringBuilder()).append(charsequence).append(" ").toString();
            }
        }

        private AtMentionTokenizer()
        {
        }

        AtMentionTokenizer(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final AtMentionEditTextView this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            updateAdapterData(apiresponse);
        }

        _cls2()
        {
            this$0 = AtMentionEditTextView.this;
            super();
        }
    }

}
