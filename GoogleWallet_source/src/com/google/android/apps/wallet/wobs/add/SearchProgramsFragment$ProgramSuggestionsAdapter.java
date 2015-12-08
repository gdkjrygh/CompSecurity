// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.autocomplete.RpcAutoCompleteAdapter;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            SearchProgramsFragment, Program, ProgramCardsHandler

final class this._cls0 extends RpcAutoCompleteAdapter
{

    final SearchProgramsFragment this$0;
    private String userEnteredMerchantName;

    private Program getItem(int i)
    {
        if (userEnteredMerchantName != null && i == getCount() - 1)
        {
            return null;
        } else
        {
            return (Program)super.getItem(i);
        }
    }

    public final int getCount()
    {
        if (userEnteredMerchantName != null)
        {
            return super.getCount() + 1;
        } else
        {
            return super.getCount();
        }
    }

    public final volatile Object getItem(int i)
    {
        return getItem(i);
    }

    protected final List getSuggestions(String s)
        throws com.google.android.apps.wallet.widgets.autocomplete.erchantName
    {
        try
        {
            s = SearchProgramsFragment.access$200(SearchProgramsFragment.this).search(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.google.android.apps.wallet.widgets.autocomplete.nit>(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.google.android.apps.wallet.widgets.autocomplete.nit>(s);
        }
        return s;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = SearchProgramsFragment.access$300(SearchProgramsFragment.this).inflate(com.google.android.apps.walletnfcrel.er.this._fld0, viewgroup, false);
        }
        view = (ImageView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.er.this._fld0);
        viewgroup = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.er.this._fld0);
        TextView textview = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.er.this._fld0);
        Program program = getItem(i);
        if (program != null)
        {
            if (program.getLogoImageUrl() != null)
            {
                picasso.load(Uri.parse(program.getLogoImageUrl())).resizeDimen(com.google.android.apps.walletnfcrel.er.getItem, com.google.android.apps.walletnfcrel.er.getItem).into(view);
                view.setVisibility(0);
            } else
            {
                view.setVisibility(8);
            }
            if (program.getMerchantName() != null)
            {
                viewgroup.setText(program.getMerchantName());
                viewgroup.setVisibility(0);
            } else
            {
                viewgroup.setVisibility(8);
            }
            if (program.getProgramName() != null)
            {
                textview.setText(program.getProgramName());
                textview.setVisibility(0);
                return view1;
            } else
            {
                textview.setVisibility(8);
                return view1;
            }
        } else
        {
            view.setVisibility(8);
            viewgroup.setText(getString(com.google.android.apps.walletnfcrel.er.getItem, new Object[] {
                userEnteredMerchantName
            }));
            viewgroup.setVisibility(0);
            textview.setVisibility(8);
            return view1;
        }
    }

    final void setUserEnteredMerchantName(String s)
    {
        userEnteredMerchantName = s;
        notifyDataSetChanged();
    }

    Exception()
    {
        this$0 = SearchProgramsFragment.this;
        super(getActivity(), threadChecker);
    }
}
