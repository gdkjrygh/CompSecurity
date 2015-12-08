// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ViewUtil;

public class EditEmailActivity extends SkypeActivity
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener
{

    private static final int MAX_EMAIL_FIELDS = 4;
    private static final String STATE_EDIT_TEXT_IDS = "STATE_EDIT_TEXT_IDS";
    private static final String STATE_NUM_VISIBLE_FIELDS = "STATE_NUM_VISIBLE_FIELDS";
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    TextView addNewButton;
    private int editTextIds[];
    ViewGroup emailEditTextsContainer;
    private View inputViews[];
    SkyLib lib;
    ObjectIdMap map;
    private int numVisibleFields;
    private MenuItem saveButton;

    public EditEmailActivity()
    {
        numVisibleFields = 1;
    }

    private ImageButton getClearButton(int i)
    {
        return (ImageButton)inputViews[i].findViewById(0x7f100367);
    }

    private EditText getEditText(int i)
    {
        return (EditText)inputViews[i].findViewById(editTextIds[i]);
    }

    private String[] getEmails()
    {
        String s = account.getStrProperty(PROPKEY.CONTACT_EMAILS);
        String as[] = new String[4];
        if (s.length() != 0)
        {
            String as1[] = s.split(" ");
            for (int i = 0; i < as1.length && i < 4; i++)
            {
                as[i] = as1[i];
            }

        }
        return as;
    }

    private int getLastVisible()
    {
        int j = 0;
        for (int i = 0; i < 4; i++)
        {
            if (inputViews[i].getVisibility() == 0)
            {
                j = i;
            }
        }

        return j;
    }

    private void initEditTexts()
    {
        int i = 0;
        while (i < 4) 
        {
            EditText edittext = getEditText(i);
            if (TextUtils.isEmpty(edittext.getText().toString()) && i > numVisibleFields - 1)
            {
                inputViews[i].setVisibility(8);
            } else
            {
                inputViews[i].setVisibility(0);
            }
            edittext.setOnFocusChangeListener(this);
            i++;
        }
        updateAddButtonVisibility();
        validateEmails();
    }

    private void initFields(boolean flag)
    {
        String as[];
        LayoutInflater layoutinflater;
        int i;
        if (flag)
        {
            as = getEmails();
        } else
        {
            as = null;
        }
        inputViews = new View[4];
        emailEditTextsContainer.removeAllViews();
        layoutinflater = LayoutInflater.from(this);
        i = 0;
        while (i < 4) 
        {
            Object obj = layoutinflater.inflate(0x7f030085, null);
            inputViews[i] = ((View) (obj));
            emailEditTextsContainer.addView(((View) (obj)));
            obj = (EditText)inputViews[i].findViewById(0x7f100368);
            ((EditText) (obj)).setId(editTextIds[i]);
            if (flag && !TextUtils.isEmpty(as[i]))
            {
                ((EditText) (obj)).setText(as[i]);
            }
            if (i == 0)
            {
                getClearButton(i).setVisibility(4);
            } else
            {
                getClearButton(i).setTag(Integer.valueOf(i));
                getClearButton(i).setOnClickListener(this);
            }
            i++;
        }
    }

    private void saveAndClose()
    {
        if (!validateEmails())
        {
            return;
        }
        Object obj = new StringBuilder();
        boolean flag = true;
        int i = 0;
        while (i < 4) 
        {
            String s = getEditText(i).getText().toString().trim();
            boolean flag1 = flag;
            if (!s.isEmpty())
            {
                if (!flag)
                {
                    ((StringBuilder) (obj)).append(" ");
                } else
                {
                    flag = false;
                }
                ((StringBuilder) (obj)).append(s);
                flag1 = flag;
            }
            i++;
            flag = flag1;
        }
        obj = ((StringBuilder) (obj)).toString().trim();
        if (!account.setStrProperty(PROPKEY.CONTACT_EMAILS, ((String) (obj))))
        {
            (new com.skype.android.app.main.EditPropertyFragment.ProfileErrorDialogFragment()).show(getSupportFragmentManager(), null);
            return;
        } else
        {
            finish();
            return;
        }
    }

    private void setFocusOnEditText(int i)
    {
        EditText edittext = getEditText(i);
        edittext.requestFocus();
        edittext.setSelection(edittext.getText().toString().length());
    }

    private void updateAddButtonVisibility()
    {
        boolean flag = true;
        for (int i = 0; i < 4; i++)
        {
            if (inputViews[i].getVisibility() != 0)
            {
                flag = false;
            }
        }

        TextView textview = addNewButton;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    private boolean validateEmails()
    {
        if (saveButton != null) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        boolean flag = true;
        int i = 0;
        do
        {
            flag1 = flag;
            if (i >= 4)
            {
                continue;
            }
            EditText edittext = getEditText(i);
            flag1 = flag;
            if (edittext.getVisibility() == 0)
            {
                if (!validateEmail(edittext.getText().toString()))
                {
                    edittext.setError(getString(0x7f0803bc));
                    flag1 = false;
                } else
                {
                    edittext.setError(null);
                    flag1 = flag;
                }
            }
            i++;
            flag = flag1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        int i;
        if (view != addNewButton)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        i = 0;
_L5:
        if (i >= 4) goto _L2; else goto _L1
_L1:
        if (inputViews[i].getVisibility() == 0) goto _L4; else goto _L3
_L3:
        inputViews[i].setVisibility(0);
        getEditText(i).requestFocus();
        numVisibleFields = numVisibleFields + 1;
_L2:
        updateAddButtonVisibility();
        setFocusOnEditText(getLastVisible());
        return;
_L4:
        i++;
          goto _L5
        if (view instanceof ImageButton)
        {
            int j = ((Integer)view.getTag()).intValue();
            getEditText(j).setText("");
            getEditText(j).setError(null);
            inputViews[j].setVisibility(8);
            numVisibleFields = numVisibleFields - 1;
        }
          goto _L2
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = true;
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitleWithRecents(0x7f0802ae);
        if (bundle != null)
        {
            numVisibleFields = bundle.getInt("STATE_NUM_VISIBLE_FIELDS", 1);
            editTextIds = bundle.getIntArray("STATE_EDIT_TEXT_IDS");
        }
        if (editTextIds == null)
        {
            editTextIds = new int[4];
            for (int i = 0; i < editTextIds.length; i++)
            {
                editTextIds[i] = ViewUtil.a();
            }

        }
        if (bundle != null)
        {
            flag = false;
        }
        initFields(flag);
        addNewButton.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001a, menu);
        saveButton = menu.findItem(0x7f1005bb);
        menu.findItem(0x7f1005de).setVisible(false);
        menu.findItem(0x7f1005dd).setVisible(false);
        return true;
    }

    public void onFocusChange(View view, boolean flag)
    {
        validateEmails();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756475: 
            saveAndClose();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        initEditTexts();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("STATE_NUM_VISIBLE_FIELDS", numVisibleFields);
        bundle.putIntArray("STATE_EDIT_TEXT_IDS", editTextIds);
    }

    protected boolean validateEmail(String s)
    {
        while (TextUtils.isEmpty(s.trim()) || lib.validateProfileString(PROPKEY.CONTACT_EMAILS, s, false).m_return == com.skype.SkyLib.VALIDATERESULT.VALIDATED_OK) 
        {
            return true;
        }
        return false;
    }
}
