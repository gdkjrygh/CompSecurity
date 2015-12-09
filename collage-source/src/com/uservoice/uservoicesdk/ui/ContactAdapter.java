// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.CustomField;
import com.uservoice.uservoicesdk.model.Ticket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter, SpinnerAdapter

public class ContactAdapter extends InstantAnswersAdapter
{

    private int CUSTOM_PREDEFINED_FIELD;
    private int CUSTOM_TEXT_FIELD;
    private Map customFieldValues;

    public ContactAdapter(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        CUSTOM_TEXT_FIELD = 8;
        CUSTOM_PREDEFINED_FIELD = 9;
        customFieldValues = new HashMap(Session.getInstance().getConfig().getCustomFields());
        continueButtonMessage = com.uservoice.uservoicesdk.R.string.uv_contact_continue_button;
        deflectingType = "Ticket";
    }

    private boolean validateCustomFields()
    {
        for (Iterator iterator = Session.getInstance().getClientConfig().getCustomFields().iterator(); iterator.hasNext();)
        {
            Object obj = (CustomField)iterator.next();
            if (((CustomField) (obj)).isRequired())
            {
                obj = (String)customFieldValues.get(((CustomField) (obj)).getName());
                if (obj == null || ((String) (obj)).length() == 0)
                {
                    return false;
                }
            }
        }

        return true;
    }

    protected void doSubmit()
    {
        if (validateCustomFields())
        {
            Ticket.createTicket(textField.getText().toString(), emailField.getText().toString(), nameField.getText().toString(), customFieldValues, new _cls3(context));
            return;
        } else
        {
            isPosting = false;
            Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_custom_fields_validation, 0).show();
            return;
        }
    }

    protected List getDetailRows()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(new Integer[] {
            Integer.valueOf(EMAIL_FIELD), Integer.valueOf(NAME_FIELD), Integer.valueOf(SPACE)
        }));
        for (Iterator iterator = Session.getInstance().getClientConfig().getCustomFields().iterator(); iterator.hasNext();)
        {
            if (((CustomField)iterator.next()).isPredefined())
            {
                arraylist.add(Integer.valueOf(CUSTOM_PREDEFINED_FIELD));
            } else
            {
                arraylist.add(Integer.valueOf(CUSTOM_TEXT_FIELD));
            }
        }

        return arraylist;
    }

    public Object getItem(int i)
    {
        int j = getItemViewType(i);
        if (j == CUSTOM_PREDEFINED_FIELD || j == CUSTOM_TEXT_FIELD)
        {
            List list = getRows();
            int k;
            int l;
            if (list.contains(Integer.valueOf(CUSTOM_PREDEFINED_FIELD)))
            {
                k = list.indexOf(Integer.valueOf(CUSTOM_PREDEFINED_FIELD));
            } else
            {
                k = list.size();
            }
            if (list.contains(Integer.valueOf(CUSTOM_TEXT_FIELD)))
            {
                l = list.indexOf(Integer.valueOf(CUSTOM_TEXT_FIELD));
            } else
            {
                l = list.size();
            }
            k = Math.min(k, l);
            return Session.getInstance().getClientConfig().getCustomFields().get(i - k);
        } else
        {
            return super.getItem(i);
        }
    }

    protected String getSubmitString()
    {
        return context.getString(com.uservoice.uservoicesdk.R.string.uv_send_message);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        View view1 = view;
        if (view == null)
        {
            if (j == CUSTOM_TEXT_FIELD)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
            } else
            if (j == CUSTOM_PREDEFINED_FIELD)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_select_field_item, null);
            } else
            {
                return super.getView(i, view, viewgroup);
            }
        }
        if (j == CUSTOM_TEXT_FIELD)
        {
            view = (TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
            viewgroup = (EditText)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
            CustomField customfield = (CustomField)getItem(i);
            String s = (String)customFieldValues.get(customfield.getName());
            view.setText(customfield.getName());
            viewgroup.setHint(com.uservoice.uservoicesdk.R.string.uv_value);
            viewgroup.setInputType(64);
            viewgroup.setText(s);
            viewgroup.setOnFocusChangeListener(new _cls1(customfield, viewgroup));
        } else
        if (j == CUSTOM_PREDEFINED_FIELD)
        {
            view = (CustomField)getItem(i);
            viewgroup = (String)customFieldValues.get(view.getName());
            ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(view.getName());
            Spinner spinner = (Spinner)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_select_field);
            spinner.setOnItemSelectedListener(new _cls2(view));
            spinner.setAdapter(new SpinnerAdapter(context, view.getPredefinedValues()));
            if (viewgroup != null && view.getPredefinedValues().contains(viewgroup))
            {
                spinner.setSelection(view.getPredefinedValues().indexOf(viewgroup) + 1);
                return view1;
            }
        } else
        {
            return super.getView(i, view1, viewgroup);
        }
        return view1;
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount() + 2;
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
