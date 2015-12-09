// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.EditText;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;

// Referenced classes of package com.dominos.fragments.checkout:
//            IDominosFormFragment, UserInfoDisplayFragment_, DominosFormValidationResult

public class UserInfoDisplayFragment extends Fragment
    implements IDominosFormFragment
{

    public static final String TAG = "user_info_display";
    TextView email;
    Bundle mData;
    TextView name;
    TextView phone;
    EditText phoneExtensionTextBox;
    UserAuthorization userAuthorization;

    public UserInfoDisplayFragment()
    {
    }

    public static UserInfoDisplayFragment newInstance(Bundle bundle)
    {
        return UserInfoDisplayFragment_.builder().mData(bundle).build();
    }

    public void clearFields()
    {
        name.setText("");
        email.setText("");
        phone.setText("");
        mData = null;
    }

    public Bundle getData()
    {
        return mData;
    }

    public DominosFormValidationResult getValidationResult()
    {
        return new DominosFormValidationResult();
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        setData(mData);
    }

    public void setData(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        String s = (new StringBuilder()).append(bundle.getString("first_name")).append(" ").append(bundle.getString("last_name")).toString();
        name.setText(s);
        email.setText(bundle.getString("email"));
        String s1 = bundle.getString("phone_ext");
        s = bundle.getString("phone");
        bundle = s;
        if (s1 != null)
        {
            bundle = s;
            if (s1.length() > 0)
            {
                bundle = (new StringBuilder()).append(s).append(" Ext: ").append(s1).toString();
            }
        }
        phone.setText(bundle);
    }
}
