// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.support.v4.app.FragmentActivity;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Forum;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter, SpinnerAdapter

public class PostIdeaAdapter extends InstantAnswersAdapter
{

    private static int CATEGORY = 9;
    private static int DESCRIPTION = 8;
    private static int HELP = 10;
    private static int TEXT_HEADING = 11;
    private Spinner categorySelect;
    private EditText descriptionField;

    public PostIdeaAdapter(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        continueButtonMessage = com.uservoice.uservoicesdk.R.string.uv_post_idea_continue_button;
        deflectingType = "Suggestion";
    }

    protected void doSubmit()
    {
        SigninManager.signIn(context, emailField.getText().toString(), nameField.getText().toString(), new _cls1());
    }

    protected List getDetailRows()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(DESCRIPTION));
        if (Session.getInstance().getForum().getCategories().size() > 0)
        {
            arraylist.add(Integer.valueOf(CATEGORY));
        }
        arraylist.add(Integer.valueOf(SPACE));
        arraylist.add(Integer.valueOf(EMAIL_FIELD));
        arraylist.add(Integer.valueOf(NAME_FIELD));
        return arraylist;
    }

    protected List getRows()
    {
        List list = super.getRows();
        list.add(0, Integer.valueOf(TEXT_HEADING));
        if (state == InstantAnswersAdapter.State.DETAILS)
        {
            list.add(Integer.valueOf(HELP));
        }
        return list;
    }

    protected String getSubmitString()
    {
        return context.getString(com.uservoice.uservoicesdk.R.string.uv_submit_idea);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        View view1 = view;
        if (view == null)
        {
            if (j == DESCRIPTION)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
                ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_description_heading);
                view = (EditText)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
                restoreEnteredText(descriptionField, view, "");
                descriptionField = view;
                descriptionField.setInputType(0x20001);
                descriptionField.setMinLines(1);
                descriptionField.setHint(com.uservoice.uservoicesdk.R.string.uv_idea_description_hint);
            } else
            if (j == CATEGORY)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_select_field_item, null);
                view = (TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
                categorySelect = (Spinner)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_select_field);
                categorySelect.setAdapter(new SpinnerAdapter(context, Session.getInstance().getForum().getCategories()));
                view.setText(com.uservoice.uservoicesdk.R.string.uv_category);
            } else
            if (j == HELP)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_idea_help_item, null);
            } else
            if (j == TEXT_HEADING)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item, null);
                ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_text_heading);
            } else
            {
                view1 = super.getView(i, view, viewgroup);
            }
        }
        if (j == DESCRIPTION || j == CATEGORY || j == HELP || j == TEXT_HEADING)
        {
            return view1;
        }
        if (j == TEXT)
        {
            view = (EditText)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text);
            view.setHint(com.uservoice.uservoicesdk.R.string.uv_idea_text_hint);
            view.setMinLines(1);
            view.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(140)
            });
            return view1;
        } else
        {
            return super.getView(i, view1, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount() + 4;
    }




    /* member class not found */
    class _cls1 {}

}
