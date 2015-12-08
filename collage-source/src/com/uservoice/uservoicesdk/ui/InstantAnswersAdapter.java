// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            Utils

public abstract class InstantAnswersAdapter extends BaseAdapter
    implements android.view.ViewGroup.OnHierarchyChangeListener, android.widget.AdapterView.OnItemClickListener
{

    protected int BUTTON;
    protected int EMAIL_FIELD;
    protected int HEADING;
    protected int INSTANT_ANSWER;
    protected int LOADING;
    protected int NAME_FIELD;
    protected int SPACE;
    protected int TEXT;
    protected FragmentActivity context;
    protected int continueButtonMessage;
    protected String deflectingType;
    protected EditText emailField;
    protected LayoutInflater inflater;
    protected List instantAnswers;
    protected boolean isPosting;
    protected EditText nameField;
    protected State state;
    protected EditText textField;

    public InstantAnswersAdapter(FragmentActivity fragmentactivity)
    {
        TEXT = 0;
        BUTTON = 1;
        HEADING = 2;
        LOADING = 3;
        INSTANT_ANSWER = 4;
        EMAIL_FIELD = 5;
        NAME_FIELD = 6;
        SPACE = 7;
    /* block-local class not found */
    class State {}

        state = State.INIT;
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
    }

    protected abstract void doSubmit();

    public int getCount()
    {
        if (isLoading())
        {
            return 1;
        } else
        {
            return getRows().size();
        }
    }

    protected abstract List getDetailRows();

    public Object getItem(int i)
    {
        if (getItemViewType(i) == INSTANT_ANSWER)
        {
            return instantAnswers.get(i - getRows().indexOf(Integer.valueOf(INSTANT_ANSWER)));
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (isLoading())
        {
            return LOADING;
        } else
        {
            return ((Integer)getRows().get(i)).intValue();
        }
    }

    protected List getRows()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(TEXT));
        if (state != State.INIT && state != State.INIT_LOADING && !instantAnswers.isEmpty())
        {
            arraylist.add(Integer.valueOf(SPACE));
            arraylist.add(Integer.valueOf(HEADING));
        }
        if (state == State.INSTANT_ANSWERS || state == State.DETAILS)
        {
            if (instantAnswers.size() > 0)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
            if (instantAnswers.size() > 1)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
            if (instantAnswers.size() > 2)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
        }
        if (state == State.DETAILS)
        {
            arraylist.add(Integer.valueOf(SPACE));
            arraylist.addAll(getDetailRows());
        }
        arraylist.add(Integer.valueOf(BUTTON));
        return arraylist;
    }

    protected abstract String getSubmitString();

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        byte byte0;
        int j;
        boolean flag1;
        byte0 = 0;
        flag1 = false;
        j = getItemViewType(i);
        viewgroup = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (j != LOADING) goto _L4; else goto _L3
_L3:
        viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
_L2:
        if (j != BUTTON) goto _L6; else goto _L5
_L5:
        view = (Button)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_contact_button);
        if (state != State.INIT_LOADING)
        {
            flag1 = true;
        }
        view.setEnabled(flag1);
    /* anonymous class not found */
    class _anm4 {}

        _cls4..SwitchMap.com.uservoice.uservoicesdk.ui.InstantAnswersAdapter.State[state.ordinal()];
        JVM INSTR tableswitch 1 4: default 120
    //                   1 349
    //                   2 358
    //                   3 367
    //                   4 377;
           goto _L7 _L8 _L9 _L10 _L11
_L7:
        return viewgroup;
_L4:
        if (j == BUTTON)
        {
            viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_contact_button_item, null);
            ((Button)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_contact_button)).setOnClickListener(new _cls1());
            continue; /* Loop/switch isn't completed */
        }
        if (j == HEADING)
        {
            viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item, null);
            continue; /* Loop/switch isn't completed */
        }
        if (j == INSTANT_ANSWER)
        {
            viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_instant_answer_item, null);
            continue; /* Loop/switch isn't completed */
        }
        if (j == SPACE)
        {
            viewgroup = new LinearLayout(context);
            viewgroup.setPadding(0, 30, 0, 0);
            continue; /* Loop/switch isn't completed */
        }
        if (j == TEXT)
        {
            viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_contact_text_item, null);
            view = (EditText)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text);
            restoreEnteredText(textField, view, "");
            textField = view;
            textField.addTextChangedListener(new _cls2());
            continue; /* Loop/switch isn't completed */
        }
        if (j != EMAIL_FIELD)
        {
            viewgroup = view;
            if (j != NAME_FIELD)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
        continue; /* Loop/switch isn't completed */
_L8:
        view.setText(com.uservoice.uservoicesdk.R.string.uv_next);
        return viewgroup;
_L9:
        view.setText(com.uservoice.uservoicesdk.R.string.uv_loading);
        return viewgroup;
_L10:
        view.setText(continueButtonMessage);
        return viewgroup;
_L11:
        view.setText(getSubmitString());
        return viewgroup;
_L6:
        EditText edittext;
        if (j == INSTANT_ANSWER)
        {
            Utils.displayInstantAnswer(viewgroup, (BaseModel)getItem(i));
            view = viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider);
            if (getRows().lastIndexOf(Integer.valueOf(INSTANT_ANSWER)) == i)
            {
                byte0 = 8;
            }
            view.setVisibility(byte0);
            return viewgroup;
        }
        if (j != EMAIL_FIELD && j != NAME_FIELD)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = (TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
        edittext = (EditText)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
        if (j == EMAIL_FIELD)
        {
            view.setText(com.uservoice.uservoicesdk.R.string.uv_your_email_address);
            restoreEnteredText(emailField, edittext, Session.getInstance().getEmail());
            emailField = edittext;
            edittext.setHint(com.uservoice.uservoicesdk.R.string.uv_email_address_hint);
            edittext.setInputType(32);
            return viewgroup;
        }
        if (j != NAME_FIELD) goto _L7; else goto _L12
_L12:
        view.setText(com.uservoice.uservoicesdk.R.string.uv_your_name);
        restoreEnteredText(nameField, edittext, Session.getInstance().getName());
        nameField = edittext;
        edittext.setHint(com.uservoice.uservoicesdk.R.string.uv_name_hint);
        edittext.setInputType(96);
        return viewgroup;
        if (j != HEADING) goto _L7; else goto _L13
_L13:
        view = (TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
        Iterator iterator = instantAnswers.iterator();
        i = 0;
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BaseModel basemodel = (BaseModel)iterator.next();
            if (basemodel instanceof Article)
            {
                flag = true;
            }
            if (basemodel instanceof Suggestion)
            {
                i = 1;
            }
        } while (true);
        if (flag)
        {
            if (i != 0)
            {
                i = com.uservoice.uservoicesdk.R.string.uv_matching_articles_and_ideas;
            } else
            {
                i = com.uservoice.uservoicesdk.R.string.uv_matching_articles;
            }
        } else
        {
            i = com.uservoice.uservoicesdk.R.string.uv_matching_ideas;
        }
        view.setText(i);
        return viewgroup;
        if (true) goto _L2; else goto _L14
_L14:
    }

    public int getViewTypeCount()
    {
        return 8;
    }

    public boolean hasText()
    {
        return textField != null && textField.getText().toString().length() != 0;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) == INSTANT_ANSWER;
    }

    protected boolean isLoading()
    {
        return Session.getInstance().getClientConfig() == null;
    }

    public void notHelpful()
    {
        if (state == State.INSTANT_ANSWERS)
        {
            state = State.DETAILS;
            notifyDataSetChanged();
        }
    }

    protected void onButtonTapped()
    {
        if (state != State.INIT) goto _L2; else goto _L1
_L1:
        if (textField != null) goto _L4; else goto _L3
_L3:
        String s;
        return;
_L4:
        if ((s = textField.getText().toString().trim()).length() != 0)
        {
            state = State.INIT_LOADING;
            notifyDataSetChanged();
            Deflection.setSearchText(s);
            ((InputMethodManager)context.getSystemService("input_method")).toggleSoftInput(1, 0);
            Article.loadInstantAnswers(s, new _cls3(context));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (state == State.INSTANT_ANSWERS)
        {
            state = State.DETAILS;
            notifyDataSetChanged();
            return;
        }
        if (state == State.DETAILS)
        {
            String s1 = nameField.getText().toString();
            String s2 = emailField.getText().toString();
            if (!SigninManager.isValidEmail(s2))
            {
                Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_bad_email_format, 0).show();
                return;
            }
            if (!isPosting)
            {
                isPosting = true;
                Session.getInstance().persistIdentity(s1, s2);
                doSubmit();
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onChildViewAdded(View view, View view1)
    {
        if (state == State.DETAILS && emailField != null)
        {
            emailField.requestFocus();
        } else
        if (textField != null)
        {
            textField.requestFocus();
            return;
        }
    }

    public void onChildViewRemoved(View view, View view1)
    {
        onChildViewAdded(null, null);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (getItemViewType(i) == INSTANT_ANSWER)
        {
            Deflection.trackDeflection("show", deflectingType, (BaseModel)getItem(i));
            Utils.showModel(context, (BaseModel)getItem(i), deflectingType);
        }
    }

    protected void restoreEnteredText(EditText edittext, EditText edittext1, String s)
    {
        if (edittext != null)
        {
            edittext = edittext.getText().toString();
            if (!TextUtils.isEmpty(edittext))
            {
                s = edittext;
            }
            edittext1.setText(s);
            edittext1.setSelection(edittext1.getText().length());
            return;
        } else
        {
            edittext1.setText(s);
            edittext1.setSelection(edittext1.getText().length());
            return;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
