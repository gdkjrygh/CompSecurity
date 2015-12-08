// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Device;
import com.pinterest.base.FollowUtils;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.pinterest.activity.findfriend.adapter:
//            FriendSearchAdapter

public class FindFriendsListAdapter extends FriendSearchAdapter
{

    private static final int CONTACT_INFO_PAGE_SIZE = 20;
    protected static final int EMAIL_LIMIT = 2000;
    private ActionSheetFragment _actionSheet;
    private String _apiTag;
    private Context _context;
    private final AtomicInteger _numPendingRequests = new AtomicInteger(0);

    public FindFriendsListAdapter(Context context, ActionSheetFragment actionsheetfragment)
    {
        super(context);
        _context = context;
        _actionSheet = actionsheetfragment;
    }

    private void createActionButton(final PersonListCell listCell, int i, com.pinterest.ui.text.PButton.ButtonStyle buttonstyle, TypeAheadItem typeaheaditem)
    {
        listCell.createActionButton(Resources.string(i), new _cls3());
        listCell.setActionButtonStyle(buttonstyle);
        listCell.setActionButtonTag(typeaheaditem);
        listCell.setTag(typeaheaditem);
    }

    private void handleViewClick(final View contact, final PersonListCell listCell)
    {
        Device.hideSoftKeyboard(contact);
        contact = ((View) (contact.getTag()));
        if (!(contact instanceof TypeAheadItem))
        {
            return;
        }
        contact = (TypeAheadItem)contact;
        if (!TextUtils.isEmpty(contact.getPinterestUid()))
        {
            boolean flag;
            if (!contact.isFollowedByMe())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            contact.setFollowedByMe(flag);
            updateFollowBtnState(listCell, contact);
            FollowUtils.getInstance().followUser(contact.getPinterestUid(), contact.isFollowedByMe(), new _cls4(), _apiTag);
            return;
        }
        _actionSheet.clear();
        _actionSheet.addHeader(Resources.string(0x7f070306));
        if (contact.getEmails().size() > 0)
        {
            _actionSheet.addFooter(Resources.string(0x7f070307));
        }
        String s;
        for (listCell = contact.getEmails().iterator(); listCell.hasNext(); _actionSheet.addItem(s, new _cls5()))
        {
            s = (String)listCell.next();
        }

        String s1;
        for (listCell = contact.getPhoneNumbers().iterator(); listCell.hasNext(); _actionSheet.addItem(s1, new _cls6()))
        {
            s1 = (String)listCell.next();
        }

        _actionSheet.show();
    }

    private void updateFollowBtnState(PersonListCell personlistcell, TypeAheadItem typeaheaditem)
    {
        int i = 0x7f0702ab;
        com.pinterest.ui.text.PButton.ButtonStyle buttonstyle = com.pinterest.ui.text.PButton.ButtonStyle.RED;
        if (typeaheaditem.isFollowedByMe())
        {
            i = 0x7f0705b2;
            buttonstyle = com.pinterest.ui.text.PButton.ButtonStyle.PLAIN;
        }
        personlistcell.updateActionButton(Resources.string(i), buttonstyle);
    }

    public List getContactList()
    {
        HashMap hashmap = getContactsAsMap();
        ArrayList arraylist = new ArrayList(1000);
        Iterator iterator = getSortedContacts(1000).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (hashmap.containsKey(s))
            {
                arraylist.add(hashmap.get(s));
            }
        } while (true);
        updateUserStatus(arraylist, new UserIdResponseHandler(), 20);
        return arraylist;
    }

    protected HashMap getContactsAsMap()
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = getEmailContactList(2000).iterator(); iterator.hasNext();)
        {
            TypeAheadItem typeaheaditem = (TypeAheadItem)iterator.next();
            if (hashmap.containsKey(typeaheaditem.getUid()))
            {
                ((TypeAheadItem)hashmap.get(typeaheaditem.getUid())).addEmail(typeaheaditem.getIdentifier());
            } else
            {
                typeaheaditem.addEmail(typeaheaditem.getIdentifier());
                hashmap.put(typeaheaditem.getUid(), typeaheaditem);
            }
        }

        for (Iterator iterator1 = getPhoneContactList(1000).iterator(); iterator1.hasNext();)
        {
            TypeAheadItem typeaheaditem1 = (TypeAheadItem)iterator1.next();
            if (hashmap.containsKey(typeaheaditem1.getUid()))
            {
                ((TypeAheadItem)hashmap.get(typeaheaditem1.getUid())).addPhoneNumber(typeaheaditem1.getIdentifier());
            } else
            {
                typeaheaditem1.addPhoneNumber(typeaheaditem1.getIdentifier());
                hashmap.put(typeaheaditem1.getUid(), typeaheaditem1);
            }
        }

        return hashmap;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = super.getView(i, view, viewgroup);
        view = ((View) (getItem(i)));
        if (!(view instanceof TypeAheadItem) || !(viewgroup instanceof PersonListCell))
        {
            return viewgroup;
        }
        final TypeAheadItem contact = (TypeAheadItem)view;
        final PersonListCell listCell = (PersonListCell)viewgroup;
        if (TextUtils.isEmpty(contact.getPinterestUid()))
        {
            i = 0x7f0702fd;
            view = com.pinterest.ui.text.PButton.ButtonStyle.RED;
            listCell.setOnClickListener(new _cls1());
        } else
        {
            if (contact.isFollowedByMe())
            {
                i = 0x7f0705b2;
            } else
            {
                i = 0x7f0702ab;
            }
            if (contact.isFollowedByMe())
            {
                view = com.pinterest.ui.text.PButton.ButtonStyle.PLAIN;
            } else
            {
                view = com.pinterest.ui.text.PButton.ButtonStyle.RED;
            }
            listCell.setOnClickListener(new _cls2());
        }
        createActionButton(listCell, i, view, contact);
        return viewgroup;
    }

    public void notifyDataSetChanged()
    {
        if (_numPendingRequests.get() == 0)
        {
            super.notifyDataSetChanged();
            return;
        } else
        {
            fireContactsChangeEvent();
            return;
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    protected void updateUserStatus(List list, UserIdResponseHandler useridresponsehandler, int i)
    {
        boolean flag = false;
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList(1000);
        for (int j = 0; j < list.size(); j++)
        {
            TypeAheadItem typeaheaditem = (TypeAheadItem)list.get(j);
            String s;
            for (Iterator iterator = typeaheaditem.getEmails().iterator(); iterator.hasNext(); arraylist.add(s))
            {
                s = (String)iterator.next();
                hashmap.put(s, typeaheaditem);
            }

        }

        useridresponsehandler.emailToUserMap = hashmap;
        int i1 = (int)Math.ceil((1.0D * (double)arraylist.size()) / (double)i);
        for (int k = ((flag) ? 1 : 0); k < i1; k++)
        {
            int l = Math.min((k + 1) * i, arraylist.size());
            _numPendingRequests.incrementAndGet();
            MyUserApi.a(arraylist, i * k, l - 1, useridresponsehandler, _apiTag);
        }

    }







    private class _cls3
        implements android.view.View.OnClickListener
    {

        final FindFriendsListAdapter this$0;
        final PersonListCell val$listCell;

        public void onClick(View view)
        {
            handleViewClick(view, listCell);
        }

        _cls3()
        {
            this$0 = FindFriendsListAdapter.this;
            listCell = personlistcell;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.UserApi.UserFollowApiResponse
    {

        final FindFriendsListAdapter this$0;
        final TypeAheadItem val$contact;
        final PersonListCell val$listCell;

        public void onFailure()
        {
            TypeAheadItem typeaheaditem = contact;
            boolean flag;
            if (!contact.isFollowedByMe())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            typeaheaditem.setFollowedByMe(flag);
            updateFollowBtnState(listCell, contact);
        }

        public void onSuccess(User user)
        {
        }

        _cls4()
        {
            this$0 = FindFriendsListAdapter.this;
            contact = typeaheaditem;
            listCell = personlistcell;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final FindFriendsListAdapter this$0;
        final TypeAheadItem val$contact;

        public void onClick(View view)
        {
            _actionSheet.dismiss();
            Events.post(new ToastEvent(new BulkInviteSendToast(new InviteFriendEvent(contact.getIdentifier()), false)));
        }

        _cls5()
        {
            this$0 = FindFriendsListAdapter.this;
            contact = typeaheaditem;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final FindFriendsListAdapter this$0;
        final TypeAheadItem val$contact;

        public void onClick(View view)
        {
            _actionSheet.dismiss();
            InviteUtil.inviteUserSMS((Activity)_context, contact.getTitle(), contact.getIdentifier(), _apiTag);
        }

        _cls6()
        {
            this$0 = FindFriendsListAdapter.this;
            contact = typeaheaditem;
            super();
        }
    }


    private class UserIdResponseHandler extends ApiResponseHandler
    {

        protected Map emailToUserMap;
        final FindFriendsListAdapter this$0;

        public void onFinish()
        {
            super.onFinish();
            if (_numPendingRequests.decrementAndGet() == 0)
            {
                notifyDataSetChanged();
            }
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            pinterestjsonobject = pinterestjsonobject.c("data");
            if (pinterestjsonobject != null)
            {
                pinterestjsonobject = pinterestjsonobject.b().values().iterator();
                while (pinterestjsonobject.hasNext()) 
                {
                    PinterestJsonObject pinterestjsonobject1 = ((PinterestJsonObject)pinterestjsonobject.next()).c("data");
                    if (pinterestjsonobject1 != null)
                    {
                        String s = pinterestjsonobject1.a("user_id", "");
                        String s1 = pinterestjsonobject1.a("email", "");
                        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && emailToUserMap.containsKey(s1))
                        {
                            setPinterestDataOnContact(pinterestjsonobject1, s, s1);
                        }
                    }
                }
            }
        }

        protected TypeAheadItem setPinterestDataOnContact(PinterestJsonObject pinterestjsonobject, String s, String s1)
        {
            s1 = (TypeAheadItem)emailToUserMap.get(s1);
            if (TextUtils.isEmpty(s1.getPinterestUid()))
            {
                s1.setPinterestUid(s);
                s1.setFollowedByMe(pinterestjsonobject.a("followed_by_me").booleanValue());
            }
            return s1;
        }

        protected UserIdResponseHandler()
        {
            this$0 = FindFriendsListAdapter.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FindFriendsListAdapter this$0;
        final PersonListCell val$listCell;

        public void onClick(View view)
        {
            handleViewClick(view, listCell);
        }

        _cls1()
        {
            this$0 = FindFriendsListAdapter.this;
            listCell = personlistcell;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FindFriendsListAdapter this$0;
        final TypeAheadItem val$contact;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.USER, contact.getPinterestUid()));
        }

        _cls2()
        {
            this$0 = FindFriendsListAdapter.this;
            contact = typeaheaditem;
            super();
        }
    }

}
