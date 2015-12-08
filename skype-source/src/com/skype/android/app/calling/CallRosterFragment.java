// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.recycler.OneWayRecyclerView;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class CallRosterFragment extends SkypeFragment
    implements android.view.View.OnClickListener
{
    public static interface CallRosterFragmentCallback
    {

        public abstract void onCallRosterDismissed(CallRosterFragment callrosterfragment);

        public abstract void onCallRosterDisplayed(CallRosterFragment callrosterfragment);

        public abstract void onParticipantSelected(CallRosterFragment callrosterfragment, Participant participant);
    }

    public class ParticipantViewHolder extends android.support.v7.widget.RecyclerView.v
    {

        Future avatarFuture;
        SkypeAvatarView avatarView;
        TextView fullNameText;
        SymbolView participantHangupCall;
        TextView participantSectionText;
        TextView statusText;
        final CallRosterFragment this$0;

        public ParticipantViewHolder(View view)
        {
            this$0 = CallRosterFragment.this;
            super(view);
            view.setOnClickListener(CallRosterFragment.this);
            avatarView = (SkypeAvatarView)ViewUtil.a(view, 0x7f100240);
            participantHangupCall = (SymbolView)ViewUtil.a(view, 0x7f100259);
            fullNameText = (TextView)ViewUtil.a(view, 0x7f100241);
            participantSectionText = (TextView)ViewUtil.a(view, 0x7f10025b);
            statusText = (TextView)ViewUtil.a(view, 0x7f10025a);
        }
    }

    private final class a extends android.support.v7.widget.RecyclerView.a
    {

        private static final int VIEW_TYPE_ADD_PARTICIPANT = 3;
        private static final int VIEW_TYPE_HEADER = 2;
        private static final int VIEW_TYPE_PARTICIPANT = 1;
        UiCallback avatarCallback;
        private a comparator;
        private Map contacts;
        private ArrayList items;
        final CallRosterFragment this$0;

        private Contact getContactForParticipant(Participant participant)
        {
            Contact contact1 = (Contact)contacts.get(participant);
            Contact contact = contact1;
            if (contact1 == null)
            {
                contact = conversationUtil.b(participant);
                contacts.put(participant, contact);
            }
            return contact;
        }

        private void setItems(ArrayList arraylist)
        {
            items = arraylist;
            notifyDataSetChanged();
        }

        public final int getItemCount()
        {
            if (items == null)
            {
                return 0;
            } else
            {
                return items.size();
            }
        }

        public final int getItemViewType(int i)
        {
            Object obj = items.get(i);
            if (obj instanceof Participant)
            {
                return 1;
            }
            return obj != null ? 2 : 3;
        }

        public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
        {
            onBindViewHolder((ParticipantViewHolder)v, i);
        }

        public final void onBindViewHolder(ParticipantViewHolder participantviewholder, int i)
        {
            switch (getItemViewType(i))
            {
            default:
                return;

            case 1: // '\001'
                Object obj = (Participant)items.get(i);
                Contact contact = getContactForParticipant(((Participant) (obj)));
                contactUtil.a(participantviewholder.fullNameText, contact);
                participantviewholder.itemView.setTag(obj);
                participantviewholder.statusText.setText(contactUtil.d(contact));
                participantviewholder.participantHangupCall.setVisibility(4);
                if (participantviewholder.avatarFuture != null)
                {
                    participantviewholder.avatarFuture.cancel(true);
                }
                obj = participantviewholder.avatarView.a();
                ((PathClippedImageView) (obj)).setTag(contact);
                participantviewholder.avatarFuture = imageCache.a(contact, obj, avatarCallback);
                ((PathClippedImageView) (obj)).setClipCircleEnabled(true);
                contactUtil.a(participantviewholder.avatarView.b(), contact.getType(), contact.getAvailabilityProp());
                return;

            case 3: // '\003'
                android.graphics.drawable.Drawable drawable = defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.b);
                participantviewholder.itemView.setTag(null);
                participantviewholder.avatarView.setImageDrawable(drawable);
                participantviewholder.avatarView.b().setVisibility(4);
                participantviewholder.avatarView.a().setClipCircleEnabled(true);
                participantviewholder.fullNameText.setText(0x7f080460);
                return;

            case 2: // '\002'
                String s = (String)items.get(i);
                participantviewholder.itemView.setTag(s);
                participantviewholder.participantSectionText.setText(s);
                return;
            }
        }

        public final volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public final ParticipantViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03002f, viewgroup, false);
                return new ParticipantViewHolder(viewgroup);

            case 3: // '\003'
                viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030029, viewgroup, false);
                return new ParticipantViewHolder(viewgroup);

            case 2: // '\002'
                viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030030, viewgroup, false);
                return new ParticipantViewHolder(viewgroup);
            }
        }

        public final void update(Conversation conversation1)
        {
            Participant participant = conversationUtil.o(conversation1);
            Object obj = conversationUtil.a(conversation1, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
            conversation1 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                Participant participant1 = (Participant)((Iterator) (obj)).next();
                ConversationUtil conversationutil = conversationUtil;
                if (ConversationUtil.a(participant1))
                {
                    conversation1.add(participant1);
                } else
                {
                    arraylist.add(participant1);
                }
            }

            obj = getString(0x7f0802d5);
            String s = getString(0x7f0802f7);
            String s1 = getString(0x7f0802e8);
            Collections.sort(conversation1, comparator);
            Collections.sort(arraylist, comparator);
            ArrayList arraylist1 = new ArrayList();
            arraylist1.add(obj);
            arraylist1.add(participant);
            arraylist1.add(s);
            arraylist1.addAll(conversation1);
            if (arraylist.size() > 0)
            {
                arraylist1.add(s1);
                arraylist1.addAll(arraylist);
            }
            arraylist1.add(null);
            setItems(arraylist1);
        }


        public a()
        {
            this$0 = CallRosterFragment.this;
            super();
            avatarCallback = new UiCallback(getActivity(), new _cls1());
            contacts = new HashMap();
            comparator = new a();
        }
    }

    private final class a.a
        implements Comparator
    {

        private Collator collator;
        final a this$1;

        public final int compare(Participant participant, Participant participant1)
        {
            participant = getContactForParticipant(participant);
            participant1 = getContactForParticipant(participant1);
            participant = contactUtil.l(participant);
            participant1 = contactUtil.l(participant1);
            return collator.compare(participant, participant1);
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((Participant)obj, (Participant)obj1);
        }

        public a.a()
        {
            this$1 = a.this;
            super();
            collator = Collator.getInstance();
            collator.setStrength(0);
        }
    }


    private static final int REQUEST_ADD_PARTICIPANTS = 0;
    private a adapter;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    DefaultAvatars defaultAvatars;
    ImageCache imageCache;
    Navigation navigation;
    OneWayRecyclerView recyclerView;

    public CallRosterFragment()
    {
    }

    private void updateList()
    {
        adapter.update(conversation);
    }

    public void onAttach(Context context)
    {
        super.onAttach(context);
        if (getActivity() instanceof CallRosterFragmentCallback)
        {
            ((CallRosterFragmentCallback)getActivity()).onCallRosterDisplayed(this);
        }
    }

    public void onClick(View view)
    {
        if (view.getTag() == null)
        {
            view = navigation.intentFor(conversation, com/skype/android/app/chat/AddParticipantsActivity);
            view.putExtra("showMsgArea", false);
            view.putExtra("addToCall", true);
            startActivityForResult(view, 0);
        } else
        if ((view.getTag() instanceof Participant) && (getActivity() instanceof CallRosterFragmentCallback))
        {
            ((CallRosterFragmentCallback)getActivity()).onParticipantSelected(this, (Participant)view.getTag());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030031, viewgroup, false);
    }

    public void onDetach()
    {
        if (getActivity() instanceof CallRosterFragmentCallback)
        {
            ((CallRosterFragmentCallback)getActivity()).onCallRosterDismissed(this);
        }
        super.onDetach();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnParticipantListChange onparticipantlistchange)
    {
        if (conversation.getObjectID() == onparticipantlistchange.getSender().getObjectID())
        {
            updateList();
        }
    }

    public void onResume()
    {
        super.onResume();
        updateList();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view.bringToFront();
        adapter = new a();
        recyclerView.setAdapter(adapter);
    }

    // Unreferenced inner class com/skype/android/app/calling/CallRosterFragment$a$1

/* anonymous class */
    final class a._cls1
        implements AsyncCallback
    {

        final a this$1;

        public final void done(AsyncResult asyncresult)
        {
            ImageView imageview = (ImageView)asyncresult.b();
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                imageview.setImageBitmap(asyncresult);
                return;
            } else
            {
                asyncresult = (Contact)imageview.getTag();
                imageview.setImageDrawable(contactUtil.a(asyncresult, com.skype.android.res.DefaultAvatars.AvatarSize.b));
                return;
            }
        }

            
            {
                this$1 = a.this;
                super();
            }
    }

}
