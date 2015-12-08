// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package com.dominos.utils:
//            ViewWithErrorMessage

public class CreditCardValidator
{

    private Context context;
    private List views;

    public CreditCardValidator(Context context1, List list)
    {
        context = context1;
        views = list;
    }

    private void handleSpinner(StringBuilder stringbuilder, ViewWithErrorMessage viewwitherrormessage, Spinner spinner)
    {
        if (spinner.getSelectedItemPosition() == 0)
        {
            stringbuilder.append(viewwitherrormessage.getInputRequiredErrorMessage());
        }
    }

    public static boolean isValidExpirationDate(String s, String s1)
    {
        boolean flag1 = true;
        if (s != null && s.length() > 0 && s.length() <= 2) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        int i;
        int j;
        int k;
        int l;
        if (s1 == null || s1.length() <= 0 || s1.length() > 4)
        {
            return false;
        }
        i = Integer.valueOf(s).intValue();
        j = Integer.valueOf(s1).intValue();
        s = Calendar.getInstance();
        k = s.get(2);
        l = s.get(1);
        if (j < l)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (j != l) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i >= k + 1) goto _L4; else goto _L5
_L5:
        return false;
    }

    public static boolean isValidNumber(String s)
    {
        boolean flag = true;
        if (s == null || s.length() <= 0)
        {
            flag = false;
        } else
        {
            int ai[] = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            };
            int ai1[] = {
                0, 2, 4, 6, 8, 1, 3, 5, 7, 9
            };
            int k = s.length() - 1;
            int i = 0;
            int j = 0;
            while (k >= 0) 
            {
                int l = (new int[][] {
                    ai, ai1
                })[i & 1][Character.digit(s.charAt(k), 10)];
                k--;
                j = l + j;
                i++;
            }
            if (j % 10 != 0)
            {
                return false;
            }
        }
        return flag;
    }

    private boolean isValidSecurityCode(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return Pattern.matches("\\d{3,4}", s);
        }
    }

    private boolean isValidZip(String s, boolean flag)
    {
        if (s != null)
        {
            if (!flag && s.trim().length() == 0)
            {
                return true;
            } else
            {
                return Pattern.matches("\\d{5}", s);
            }
        } else
        {
            return false;
        }
    }

    public String validate(AnonymousCreditCard anonymouscreditcard, boolean flag)
    {
        String s = validateViewsForExistingInput();
        if (StringHelper.isNotEmpty(s))
        {
            return s;
        } else
        {
            return validateCreditCard(anonymouscreditcard, flag);
        }
    }

    public String validateCreditCard(AnonymousCreditCard anonymouscreditcard, boolean flag)
    {
        String s = "";
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = anonymouscreditcard.getFullCardNumber();
        if (!isValidNumber(s1) || CreditCardType.fromCardNumber(s1) == CreditCardType.UNKNOWN)
        {
            stringbuilder.append(context.getString(0x7f080174));
        }
        if (!isValidExpirationDate(anonymouscreditcard.getMonth(), anonymouscreditcard.getYear()))
        {
            stringbuilder.append(context.getString(0x7f08011e));
        }
        if (!isValidSecurityCode(anonymouscreditcard.getSecurityCode()))
        {
            stringbuilder.append(context.getString(0x7f080175));
        }
        if (!isValidZip(anonymouscreditcard.getZip(), flag))
        {
            stringbuilder.append(context.getString(0x7f08017a));
        }
        anonymouscreditcard = s;
        if (stringbuilder.length() > 0)
        {
            anonymouscreditcard = stringbuilder.toString();
        }
        return anonymouscreditcard;
    }

    public String validateViewsForExistingInput()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = null;
        Iterator iterator = views.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ViewWithErrorMessage viewwitherrormessage = (ViewWithErrorMessage)iterator.next();
            Object obj1 = viewwitherrormessage.getView();
            if (obj1 instanceof EditText)
            {
                obj1 = (EditText)obj1;
                String s1 = ((EditText) (obj1)).getText().toString().trim();
                if (s1.length() <= 0)
                {
                    if (obj == null)
                    {
                        obj = obj1;
                    }
                    stringbuilder.append(viewwitherrormessage.getInputRequiredErrorMessage());
                } else
                {
                    ((EditText) (obj1)).setText(s1);
                }
            } else
            if (obj1 instanceof Spinner)
            {
                handleSpinner(stringbuilder, viewwitherrormessage, (Spinner)obj1);
            }
        } while (true);
        if (stringbuilder.length() > 0)
        {
            String s = stringbuilder.toString();
            if (obj != null)
            {
                ((EditText) (obj)).requestFocus();
            }
            return s;
        } else
        {
            return "";
        }
    }
}
