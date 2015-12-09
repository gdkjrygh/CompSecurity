// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            EditAccountFragment, ai, aj, ak

public class _cls9
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, EditAccountFragment editaccountfragment, Object obj)
    {
        editaccountfragment.errorMsgTextView = (TextView)ector.TextView((View)ector.w(obj, 0x7f0e009e, "field 'errorMsgTextView'"), 0x7f0e009e, "field 'errorMsgTextView'");
        View view = (View)ector.w(obj, 0x7f0e0099, "field 'changeFirstName', method 'onChangeFirstNameTextChanged', and method 'afterChangeFirstNameTextChanged'");
        editaccountfragment.changeFirstName = (EditText)ector.rstName(view, 0x7f0e0099, "field 'changeFirstName'");
        ((TextView)view).addTextChangedListener(new ai(this, editaccountfragment));
        view = (View)ector.w(obj, 0x7f0e009b, "field 'changeLastName', method 'onChangeLastNameTextChanged', and method 'afterChangeLastNameTextChanged'");
        editaccountfragment.changeLastName = (EditText)ector.stName(view, 0x7f0e009b, "field 'changeLastName'");
        ((TextView)view).addTextChangedListener(new aj(this, editaccountfragment));
        obj = (View)ector.w(obj, 0x7f0e009d, "field 'changeEmail', method 'onChangeEmailTextChanged', and method 'afterChangeEmailTextChanged'");
        editaccountfragment.changeEmail = (EditText)ector.ail(((View) (obj)), 0x7f0e009d, "field 'changeEmail'");
        ((TextView)obj).addTextChangedListener(new ak(this, editaccountfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (EditAccountFragment)obj, obj1);
    }

    public void reset(EditAccountFragment editaccountfragment)
    {
        editaccountfragment.errorMsgTextView = null;
        editaccountfragment.changeFirstName = null;
        editaccountfragment.changeLastName = null;
        editaccountfragment.changeEmail = null;
    }

    public volatile void reset(Object obj)
    {
        reset((EditAccountFragment)obj);
    }

    public _cls9()
    {
    }
}
