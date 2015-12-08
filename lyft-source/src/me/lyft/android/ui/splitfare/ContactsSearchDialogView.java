// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.SearchToolbarView;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SearchHelper

public class ContactsSearchDialogView extends LinearLayout
{

    final ContactsAdapter adapter;
    AppFlow appFlow;
    Binder binder;
    MessageBus bus;
    final List contacts;
    final Action1 contactsFilteredAction = new Action1() {

        final ContactsSearchDialogView this$0;

        public volatile void call(Object obj)
        {
            call((SearchResult)obj);
        }

        public void call(SearchResult searchresult)
        {
            searchresult = getAddableContacts(searchresult);
            adapter.swapData(searchresult);
        }

            
            {
                this$0 = ContactsSearchDialogView.this;
                super();
            }
    };
    DialogFlow dialogFlow;
    TextView emptyView;
    IRideFareRepository fareRepository;
    ListView listView;
    final int maximumContributors;
    SearchToolbarView searchToolbarView;

    public ContactsSearchDialogView(Context context, AttributeSet attributeset)
    {
        int i = 0;
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        maximumContributors = fareRepository.getFare().getMaximumContributors();
        attributeset = (SplitFareDialogs.ContactsSearchDialog)attributeset.a();
        contacts = attributeset.getContacts();
        adapter = (new ContactsAdapter(LayoutInflater.from(context))).disableCategories();
        adapter.swapData(contacts);
        context = attributeset.getCheckedContacts();
        attributeset = attributeset.getDisabledContacts();
        boolean flag;
        if (context.size() >= maximumContributors)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (; i < contacts.size(); i++)
        {
            UserContact usercontact = (UserContact)contacts.get(i);
            if (context.contains(usercontact))
            {
                adapter.toggleChecked(i);
            }
            if (attributeset.contains(usercontact))
            {
                adapter.setItemDisabled(i);
            }
        }

        adapter.setHasMaxInvitesBeenHit(flag);
    }

    private List getAddableContacts(SearchResult searchresult)
    {
        if (searchresult.contactList.isEmpty())
        {
            String s = matchAsPhone(searchresult.query);
            if (!Strings.isNullOrEmpty(s))
            {
                searchresult = new ArrayList(1);
                searchresult.add((new UserContact("")).setContactPhone(new ContactPhone(s)).setCategory("#"));
                return searchresult;
            } else
            {
                listView.setVisibility(8);
                setEmptyViewText(searchresult.query);
                return null;
            }
        } else
        {
            searchresult = searchresult.contactList;
            listView.setVisibility(0);
            emptyView.setVisibility(8);
            return searchresult;
        }
    }

    private boolean isPossibleMatch(UserContact usercontact, String s, String s1)
    {
        String s2;
        String s3;
        if (usercontact.getPhoneNumber() != null)
        {
            s2 = usercontact.getPhoneNumber().getPhoneNumber();
        } else
        {
            s2 = null;
        }
        s3 = usercontact.getName().toLowerCase();
        usercontact = usercontact.getEmail();
        if (Strings.isNullOrEmpty(s))
        {
            return false;
        }
        if (s3.contains(s))
        {
            return true;
        }
        if (usercontact != null && usercontact.toLowerCase().contains(s))
        {
            return true;
        }
        return s1 != null && s2 != null && SearchHelper.isPhoneNumber(s2) && SearchHelper.normalizeNumber(s2).contains(s1);
    }

    private String matchAsPhone(String s)
    {
        if (SearchHelper.isPhoneNumber(s))
        {
            return SearchHelper.normalizeNumber(s);
        } else
        {
            return null;
        }
    }

    private void setEmptyViewText(String s)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            emptyView.setText(getResources().getString(0x7f0700c4, new Object[] {
                s
            }));
            emptyView.setVisibility(0);
            return;
        } else
        {
            emptyView.setVisibility(8);
            return;
        }
    }

    void dismiss()
    {
        searchToolbarView.hideKeyboard();
        dialogFlow.dismiss();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        searchToolbarView.focusFieldAndShowKeyboard();
        binder = Binder.attach(this);
        binder.bind(searchToolbarView.observeTextChange(), new Action1() {

            final ContactsSearchDialogView this$0;

            public void call(CharSequence charsequence)
            {
                search(charsequence);
            }

            public volatile void call(Object obj)
            {
                call((CharSequence)obj);
            }

            
            {
                this$0 = ContactsSearchDialogView.this;
                super();
            }
        });
        binder.bind(searchToolbarView.observeHomeClicked(), new Action1() {

            final ContactsSearchDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                dismiss();
            }

            
            {
                this$0 = ContactsSearchDialogView.this;
                super();
            }
        });
        binder.bind(appFlow.observeScreenChange(), new Action1() {

            final ContactsSearchDialogView this$0;

            public void call(Screen screen)
            {
                dialogFlow.dismiss(me/lyft/android/ui/splitfare/SplitFareDialogs$ContactsSearchDialog);
            }

            public volatile void call(Object obj)
            {
                call((Screen)obj);
            }

            
            {
                this$0 = ContactsSearchDialogView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            listView.setDivider(getResources().getDrawable(0x7f0201e4));
            listView.setAdapter(adapter);
            return;
        }
    }

    void onItemClicked(int i)
    {
        if (adapter.isItemDisabled(i) || adapter.getCheckedItemCount() >= maximumContributors && !adapter.isItemChecked(i))
        {
            return;
        } else
        {
            adapter.toggleChecked(i);
            bus.post(me/lyft/android/ui/splitfare/ContactsSearchDialogView$ContactSelectedEvent, adapter.getItem(i));
            dismiss();
            return;
        }
    }

    void search(final CharSequence query)
    {
        query = query.toString().toLowerCase();
        final String number = matchAsPhone(query);
        binder.bind(Observable.from(contacts).filter(new Func1() {

            final ContactsSearchDialogView this$0;
            final String val$number;
            final String val$query;

            public Boolean call(UserContact usercontact)
            {
                return Boolean.valueOf(isPossibleMatch(usercontact, query, number));
            }

            public volatile Object call(Object obj)
            {
                return call((UserContact)obj);
            }

            
            {
                this$0 = ContactsSearchDialogView.this;
                query = s;
                number = s1;
                super();
            }
        }).toList().map(new Func1() {

            final ContactsSearchDialogView this$0;
            final String val$query;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public SearchResult call(List list)
            {
                return new SearchResult(list, query);
            }

            
            {
                this$0 = ContactsSearchDialogView.this;
                query = s;
                super();
            }
        }), contactsFilteredAction);
    }



    private class SearchResult
    {

        public final List contactList;
        public final String query;

        private SearchResult(List list, String s)
        {
            contactList = list;
            query = s;
        }

    }

}
