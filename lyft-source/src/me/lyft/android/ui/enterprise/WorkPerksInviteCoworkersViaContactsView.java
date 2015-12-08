// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import me.lyft.android.adapters.SeparatedListAdapter;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.WorkPerksAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.work.EnterpriseInviteRequestDTO;
import me.lyft.android.infrastructure.lyft.work.InviteTextDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.SecureSubscriber;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            EnterpriseContactsAdapter

public class WorkPerksInviteCoworkersViaContactsView extends LinearLayout
{

    private static final String CONTACTS_SECTION_HEADER = "Contacts";
    private static final String COWORKERS_SECTION_HEADER = "Coworkers";
    private static final String ENTERPRISE = "enterprise";
    private static final String SKIP_TOOLBAR_ITEM = "SKIP";
    private static final String SMS_SENT_INTENT = "SMS_SENT";
    AppFlow appFlow;
    Binder binder;
    SparseBooleanArray checked;
    Map companyContacts;
    Map companyEmailContacts;
    ContactsProvider contactsProvider;
    Integer coworkerContactSize;
    List coworkerContacts;
    EnterpriseContactsAdapter coworkerContactsAdapter;
    int datasetPosition;
    TextView inviteCoworkersHeaderTextView;
    LinearLayout inviteCoworkersView;
    InviteTextDTO inviteText;
    List invitesToSend;
    ListView listView;
    int listviewPosition;
    ILyftApi lyftApi;
    Map mobilePhoneContacts;
    Map noneCompanyEmailContacts;
    Map noneMobilePhoneContacts;
    private Integer numberOfSections;
    private Action1 onToolbarItemClicked;
    List otherContacts;
    EnterpriseContactsAdapter otherContactsAdapter;
    private final EnterpriseScreens.WorkPerksInviteCoworkersViaContactsScreen params;
    IProgressController progressController;
    TextView sendInvitesButton;
    ISmsService sendSmsService;
    private String senderCompany;
    private String senderEmail;
    SeparatedListAdapter separatedListAdapter;
    PendingIntent smsPendingIntent;
    Map smsToSend;
    Toolbar toolbar;
    Map uniqueCoworkerContacts;
    Map uniqueOtherContacts;
    List userContacts;
    UserOrganizationDTO userOrganization;
    IViewErrorHandler viewErrorHandler;

    public WorkPerksInviteCoworkersViaContactsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        numberOfSections = Integer.valueOf(2);
        smsToSend = new HashMap();
        companyContacts = new HashMap();
        mobilePhoneContacts = new HashMap();
        companyEmailContacts = new HashMap();
        noneMobilePhoneContacts = new HashMap();
        noneCompanyEmailContacts = new HashMap();
        uniqueCoworkerContacts = new TreeMap();
        uniqueOtherContacts = new TreeMap();
        onToolbarItemClicked = new Action1() {

            final WorkPerksInviteCoworkersViaContactsView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0017)
                {
                    appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailScreen(senderEmail, userOrganization));
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksInviteCoworkersViaContactsScreen)context.a();
    }

    private void addPhoneNumbersToCoworkersSection()
    {
        for (Iterator iterator = noneCompanyEmailContacts.values().iterator(); iterator.hasNext();)
        {
            UserContact usercontact = (UserContact)iterator.next();
            String s3 = usercontact.getName();
            String s;
            if (Strings.isNullOrEmpty(s3))
            {
                s = usercontact.getEmail().toLowerCase();
            } else
            {
                s = s3.toLowerCase();
            }
            if (!companyEmailContacts.containsKey((new StringBuilder()).append(s3).append(usercontact.getEmail()).toString()) && !uniqueCoworkerContacts.containsKey((new StringBuilder()).append(s).append("email").toString()) && companyContacts.containsKey(s3) && ((String)companyContacts.get(s3)).equalsIgnoreCase(senderCompany))
            {
                uniqueCoworkerContacts.put((new StringBuilder()).append(s).append("email").toString(), usercontact);
            } else
            {
                uniqueOtherContacts.put((new StringBuilder()).append(s3).append(usercontact.getEmail()).toString(), usercontact);
            }
        }

        for (Iterator iterator1 = mobilePhoneContacts.values().iterator(); iterator1.hasNext();)
        {
            UserContact usercontact1 = (UserContact)iterator1.next();
            String s4 = usercontact1.getName();
            String s1;
            if (Strings.isNullOrEmpty(s4))
            {
                s1 = usercontact1.getEmail().toLowerCase();
            } else
            {
                s1 = s4.toLowerCase();
            }
            if (!companyEmailContacts.containsKey((new StringBuilder()).append(s4).append(usercontact1.getEmail()).toString()) && companyContacts.containsKey(s4) && ((String)companyContacts.get(s4)).equalsIgnoreCase(senderCompany))
            {
                uniqueCoworkerContacts.put((new StringBuilder()).append(s1).append("phone").toString(), usercontact1);
            } else
            {
                uniqueOtherContacts.put((new StringBuilder()).append(s4).append(usercontact1.getPhoneNumber()).toString(), usercontact1);
            }
        }

        for (Iterator iterator2 = noneMobilePhoneContacts.values().iterator(); iterator2.hasNext();)
        {
            UserContact usercontact2 = (UserContact)iterator2.next();
            String s5 = usercontact2.getName();
            String s2;
            if (Strings.isNullOrEmpty(s5))
            {
                s2 = usercontact2.getEmail().toLowerCase();
            } else
            {
                s2 = s5.toLowerCase();
            }
            if (!companyEmailContacts.containsKey((new StringBuilder()).append(s5).append(usercontact2.getEmail()).toString()) && companyContacts.containsKey(s5) && ((String)companyContacts.get(s5)).equalsIgnoreCase(senderCompany) && !mobilePhoneContacts.containsKey(s5))
            {
                uniqueCoworkerContacts.put(s2, usercontact2);
            } else
            {
                uniqueOtherContacts.put((new StringBuilder()).append(s5).append(usercontact2.getPhoneNumber()).toString(), usercontact2);
            }
        }

    }

    private void filterContacts()
    {
        if (userContacts.size() > 0)
        {
            Iterator iterator = userContacts.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                UserContact usercontact = (UserContact)iterator.next();
                boolean flag3 = Strings.isNullOrEmpty(usercontact.getEmail());
                String s;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (usercontact.getPhoneNumber() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && usercontact.getPhoneNumber().getPhoneType() == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag3 && senderEmail.equalsIgnoreCase(usercontact.getEmail()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag3 && senderCompany.equalsIgnoreCase(getCompanyFromEmail(usercontact.getEmail())))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                s = usercontact.getName();
                if (flag3)
                {
                    if (Strings.isNullOrEmpty(usercontact.getCompany()))
                    {
                        if (flag && !mobilePhoneContacts.containsKey(s))
                        {
                            mobilePhoneContacts.put(s, usercontact);
                        } else
                        {
                            noneMobilePhoneContacts.put((new StringBuilder()).append(s).append(usercontact.getPhoneNumber()).toString(), usercontact);
                        }
                    } else
                    {
                        companyContacts.put(s, usercontact.getCompany());
                    }
                } else
                if (!flag1)
                {
                    if (flag2)
                    {
                        companyEmailContacts.put((new StringBuilder()).append(s).append(usercontact.getEmail()).toString(), usercontact);
                    } else
                    {
                        noneCompanyEmailContacts.put((new StringBuilder()).append(s).append(usercontact.getEmail()).toString(), usercontact);
                    }
                }
            } while (true);
        }
    }

    private static String getCompanyFromEmail(String s)
    {
        s = s.split("@");
        if (s.length > 1)
        {
            s = s[1].split("\\.");
            if (s.length > 1)
            {
                return s[0].toString();
            }
        }
        return "";
    }

    private void getInvitesToSend(ListView listview)
    {
        checked = listview.getCheckedItemPositions();
        coworkerContactSize = Integer.valueOf(coworkerContacts.size());
        int i = 0;
        while (i < checked.size()) 
        {
            listviewPosition = checked.keyAt(i);
            if (!checked.get(listviewPosition))
            {
                continue;
            }
            boolean flag;
            if (listviewPosition <= coworkerContactSize.intValue())
            {
                datasetPosition = listviewPosition - 1;
                listview = (UserContact)coworkerContacts.get(datasetPosition);
            } else
            {
                datasetPosition = listviewPosition - numberOfSections.intValue() - coworkerContactSize.intValue();
                listview = (UserContact)otherContacts.get(datasetPosition);
            }
            if (!Strings.isNullOrEmpty(listview.getEmail()))
            {
                me.lyft.android.infrastructure.lyft.invite.InviteDTO invitedto = listview.createEmailInvite();
                invitesToSend.add(invitedto);
            }
            if (listview.getPhoneNumber() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                smsToSend.put(listview.getName(), listview.getPhoneNumber().getPhoneNumber());
            }
            i++;
        }
    }

    private void initData()
    {
        userOrganization = params.getUserOrganization();
        inviteText = (InviteTextDTO)Objects.firstNonNull(userOrganization.getInviteText(), new InviteTextDTO(null, null, null, null));
        senderEmail = params.getEmail();
        senderCompany = getCompanyFromEmail(senderEmail);
    }

    private void onSendInvitesButtonClicked()
    {
        sendInvitesButton.setEnabled(false);
        sendInvites();
        if (smsToSend.size() > 0)
        {
            sendSms();
        }
        updateListview();
        appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailScreen(senderEmail, userOrganization));
    }

    private void populateSeparatedSectionList()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        coworkerContactsAdapter = new EnterpriseContactsAdapter(layoutinflater);
        otherContactsAdapter = new EnterpriseContactsAdapter(layoutinflater);
        separatedListAdapter = new SeparatedListAdapter(getContext());
        coworkerContacts = new ArrayList();
        otherContacts = new ArrayList();
        listView.setAdapter(separatedListAdapter);
        filterContacts();
        setUniqueContactGroups();
        coworkerContacts.addAll(uniqueCoworkerContacts.values());
        otherContacts.addAll(uniqueOtherContacts.values());
        if (coworkerContacts.size() > 0)
        {
            coworkerContactsAdapter.swapData(coworkerContacts);
            if (coworkerContactsAdapter != null)
            {
                separatedListAdapter.addSection("Coworkers", coworkerContactsAdapter);
            }
        } else
        {
            numberOfSections = Integer.valueOf(1);
        }
        otherContactsAdapter.swapData(otherContacts);
        if (otherContactsAdapter != null)
        {
            separatedListAdapter.addSection("Contacts", otherContactsAdapter);
        }
        listView.setAdapter(separatedListAdapter);
        separatedListAdapter.notifyDataSetChanged();
    }

    private void sendInvites()
    {
        final AsyncActionAnalytics analytics = WorkPerksAnalytics.trackSendInvitesAttempt();
        invitesToSend = new ArrayList();
        getInvitesToSend(listView);
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(lyftApi.sendEnterpriseInvites(new EnterpriseInviteRequestDTO(invitesToSend, "enterprise")), new AsyncCall() {

            final WorkPerksInviteCoworkersViaContactsView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                analytics.trackResponseSuccess(String.format("Invites sent: %d", new Object[] {
                    Integer.valueOf(invitesToSend.size())
                }));
                updateListview();
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    private void sendSms()
    {
        String s = (String)Objects.firstNonNull(inviteText.getSmsBody(), "");
        String s1;
        for (Iterator iterator = smsToSend.values().iterator(); iterator.hasNext(); sendSmsService.sendSms(s1, s))
        {
            s1 = (String)iterator.next();
        }

    }

    private void setInviteCoworkersHeader()
    {
        String s;
        if (userOrganization.getOrganization() != null)
        {
            s = userOrganization.getOrganization().getName();
        } else
        {
            s = "";
        }
        s = Strings.nullOrEmptyToDefault(s, getResources().getString(0x7f070104));
        inviteCoworkersHeaderTextView.setText(getResources().getString(0x7f0701b2, new Object[] {
            s
        }));
    }

    private void setSendInvitesButtonVisibility()
    {
        if (listView.getCheckedItemCount() > 0)
        {
            sendInvitesButton.setVisibility(0);
            return;
        } else
        {
            sendInvitesButton.setVisibility(8);
            return;
        }
    }

    private void setSendInvitesButtonVisibility(int i)
    {
        if (listView.getCheckedItemCount() > 0)
        {
            sendInvitesButton.setVisibility(0);
            int j = listView.getLastVisiblePosition();
            if (listView.isItemChecked(i) && i >= j - 1)
            {
                listView.post(new Runnable() {

                    final WorkPerksInviteCoworkersViaContactsView this$0;

                    public void run()
                    {
                        listView.smoothScrollByOffset(1);
                    }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                super();
            }
                });
            }
            return;
        } else
        {
            sendInvitesButton.setVisibility(8);
            return;
        }
    }

    private void setUniqueContactGroups()
    {
        for (Iterator iterator = companyEmailContacts.values().iterator(); iterator.hasNext();)
        {
            UserContact usercontact = (UserContact)iterator.next();
            String s;
            if (Strings.isNullOrEmpty(usercontact.getName()))
            {
                s = usercontact.getEmail().toLowerCase();
            } else
            {
                s = usercontact.getName().toLowerCase();
            }
            if (!uniqueCoworkerContacts.containsKey(s))
            {
                uniqueCoworkerContacts.put(s, usercontact);
            } else
            {
                uniqueOtherContacts.put((new StringBuilder()).append(usercontact.getName()).append(usercontact.getEmail()).toString(), usercontact);
            }
        }

        addPhoneNumbersToCoworkersSection();
    }

    private void updateContactListVisibility()
    {
        if (userContacts.size() > 0)
        {
            inviteCoworkersView.setVisibility(0);
            return;
        } else
        {
            appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailScreen(senderEmail, userOrganization));
            return;
        }
    }

    private void updateListview()
    {
        listView.clearChoices();
        smsToSend.clear();
        if (coworkerContacts.size() > 0)
        {
            coworkerContactsAdapter.notifyDataSetChanged();
        }
        if (otherContacts.size() > 0)
        {
            otherContactsAdapter.notifyDataSetChanged();
        }
        if (userContacts.size() > 0)
        {
            separatedListAdapter.notifyDataSetChanged();
        }
        updateContactListVisibility();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final WorkPerksInviteCoworkersViaContactsView this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                boolean flag;
                if (!view.isSelected())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                setSendInvitesButtonVisibility(i);
            }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle(getContext().getString(0x7f0701b1)).clearItems().addItem(0x7f0d0017, "SKIP");
        initData();
        setInviteCoworkersHeader();
        sendInvitesButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WorkPerksInviteCoworkersViaContactsView this$0;

            public void onClick(View view)
            {
                onSendInvitesButtonClicked();
            }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                super();
            }
        });
        contactsProvider.create().emails().phones().companies().observe().subscribe(new SecureSubscriber() {

            final WorkPerksInviteCoworkersViaContactsView this$0;

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((List)obj);
            }

            public void onSafeNext(List list)
            {
                userContacts = list;
                updateContactListVisibility();
                populateSeparatedSectionList();
                setSendInvitesButtonVisibility();
            }

            
            {
                this$0 = WorkPerksInviteCoworkersViaContactsView.this;
                super();
            }
        });
    }







}
