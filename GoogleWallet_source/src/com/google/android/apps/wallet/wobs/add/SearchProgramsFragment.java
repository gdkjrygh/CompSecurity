// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.autocomplete.AutoCompleteTile;
import com.google.android.apps.wallet.widgets.autocomplete.RpcAutoCompleteAdapter;
import com.google.common.base.Strings;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ProgramCardsUiProperties, ProgramCardsHandler, Program

public class SearchProgramsFragment extends WalletFragment
{
    final class ProgramSuggestionsAdapter extends RpcAutoCompleteAdapter
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
            throws com.google.android.apps.wallet.widgets.autocomplete.RpcAutoCompleteAdapter.GetSuggestionsException
        {
            try
            {
                s = handler.search(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new com.google.android.apps.wallet.widgets.autocomplete.RpcAutoCompleteAdapter.GetSuggestionsException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new com.google.android.apps.wallet.widgets.autocomplete.RpcAutoCompleteAdapter.GetSuggestionsException(s);
            }
            return s;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_program_search_list_item, viewgroup, false);
            }
            view = (ImageView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.Logo);
            viewgroup = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.MerchantName);
            TextView textview = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.ProgramName);
            Program program = getItem(i);
            if (program != null)
            {
                if (program.getLogoImageUrl() != null)
                {
                    picasso.load(Uri.parse(program.getLogoImageUrl())).resizeDimen(com.google.android.apps.walletnfcrel.R.dimen.wobs_program_search_list_logo_size, com.google.android.apps.walletnfcrel.R.dimen.wobs_program_search_list_logo_size).into(view);
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
                viewgroup.setText(getString(com.google.android.apps.walletnfcrel.R.string.wobs_add_adhoc_list_item_text, new Object[] {
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

        ProgramSuggestionsAdapter()
        {
            this$0 = SearchProgramsFragment.this;
            super(getActivity(), threadChecker);
        }
    }

    public static interface SearchProgramsCallback
    {

        public abstract String getMerchantName();

        public abstract ProgramCardsHandler getProgramCardsHandler();

        public abstract ProgramCardsUiProperties getUiProperties();

        public abstract void onDiscoverableProgramSelected(Program program);

        public abstract void onMerchantNameEntered(String s);

        public abstract void onMerchantNameSelected(String s);
    }


    private AutoCompleteTile autoCompleteTile;
    private SearchProgramsCallback callback;
    private ProgramCardsHandler handler;
    private LayoutInflater inflater;
    public Picasso picasso;
    public ThreadChecker threadChecker;
    private ProgramCardsUiProperties uiProperties;

    public SearchProgramsFragment()
    {
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            callback = (SearchProgramsCallback)activity;
            handler = callback.getProgramCardsHandler();
            uiProperties = callback.getUiProperties();
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException(String.valueOf(activity.getClass().getSimpleName()).concat(" must implement SearchProgramsCallback"));
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getActivity().setTitle(uiProperties.getSearchProgramsFragmentTitle());
    }

    public final View onCreateView(final LayoutInflater view, final ViewGroup autoCompleteAdapter, Bundle bundle)
    {
        inflater = view;
        view = inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_search_programs, autoCompleteAdapter, false);
        autoCompleteTile = (AutoCompleteTile)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.MerchantNameSearch);
        autoCompleteAdapter = new ProgramSuggestionsAdapter();
        autoCompleteTile.setAdapter(autoCompleteAdapter);
        autoCompleteTile.addTextChangedListener(new DefaultTextWatcher() {

            final SearchProgramsFragment this$0;
            final ProgramSuggestionsAdapter val$autoCompleteAdapter;

            public final void afterTextChanged(Editable editable)
            {
                ProgramSuggestionsAdapter programsuggestionsadapter = autoCompleteAdapter;
                if (editable.length() > 0)
                {
                    editable = editable.toString();
                } else
                {
                    editable = null;
                }
                programsuggestionsadapter.setUserEnteredMerchantName(editable);
            }

            
            {
                this$0 = SearchProgramsFragment.this;
                autoCompleteAdapter = programsuggestionsadapter;
                super();
            }
        });
        autoCompleteTile.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SearchProgramsFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                Views.hideSoftKeyboard(getActivity(), view1);
                adapterview = (Program)adapterview.getAdapter().getItem(i);
                if (adapterview == null)
                {
                    adapterview = autoCompleteTile.getText().toString();
                    callback.onMerchantNameSelected(adapterview);
                    return;
                } else
                {
                    callback.onDiscoverableProgramSelected(adapterview);
                    return;
                }
            }

            
            {
                this$0 = SearchProgramsFragment.this;
                super();
            }
        });
        autoCompleteTile.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SearchProgramsFragment this$0;
            final View val$view;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 5)
                {
                    if (textview.getText() != null && !Strings.isNullOrEmpty(textview.getText().toString()))
                    {
                        Views.hideSoftKeyboard(getActivity(), view);
                        textview = textview.getText().toString();
                        callback.onMerchantNameEntered(textview);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = SearchProgramsFragment.this;
                view = view1;
                super();
            }
        });
        if (callback.getMerchantName() != null)
        {
            autoCompleteTile.setText(callback.getMerchantName());
        }
        getActivity().getWindow().setSoftInputMode(5);
        return view;
    }




}
