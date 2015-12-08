// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.media.OnMediaGroupAvatarLoaded;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.recycler.RecyclerListDecorator;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter, ChangeGroupPictureDialog, ParticipantRemoveDialog

public class ParticipantListFragment extends SkypeListFragment
    implements android.view.View.OnClickListener, OnUserEventListener
{

    ParticipantAdapter adapter;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    DefaultAvatars defaultAvatars;
    GroupAvatarUtil groupAvatarUtil;
    ImageCache imageCache;
    private UiCallback imageCallback;
    private ImageView imageView;
    LayoutExperience layoutExperience;
    Navigation navigation;

    public ParticipantListFragment()
    {
    }

    private void setAvatarImage(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            imageView.setImageBitmap(bitmap);
            return;
        } else
        {
            imageView.setImageDrawable(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, conversation.getIdentityProp()));
            return;
        }
    }

    private void updateList()
    {
        adapter.update(conversation);
        adapter.setParticipantsRemovable(ConversationUtil.h(conversation));
    }

    private void updatePicture()
    {
        groupAvatarUtil.a(conversation, imageView, imageCallback);
    }

    protected int getLayoutId()
    {
        if (layoutExperience.isMultipane())
        {
            return 0x7f0300cb;
        } else
        {
            return super.getLayoutId();
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_META_PICTURE || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_PICTURE);
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131756168 2131756168: default 24
    //                   2131756168 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (ConversationUtil.z(conversation))
        {
            ((ChangeGroupPictureDialog)SkypeDialogFragment.create(conversation, com/skype/android/app/chat/ChangeGroupPictureDialog)).show(getFragmentManager());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
    }

    void onEvent(OnMediaGroupAvatarLoaded onmediagroupavatarloaded)
    {
        updatePicture();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnParticipantListChange onparticipantlistchange)
    {
        if (conversation.getObjectID() == onparticipantlistchange.getSender().getObjectID())
        {
            updateList();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            imageCache.b(conversation.getIdentityProp());
            break;
        }
        updatePicture();
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, (Contact)obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Contact contact, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (Contact)obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Contact contact)
    {
        if (0x7f100486 == i)
        {
            ((ParticipantRemoveDialog)SkypeDialogFragment.create(conversationUtil.a(conversation, ((Contact)itemviewholder.getData()).getIdentity()), com/skype/android/app/chat/ParticipantRemoveDialog)).show(getFragmentManager());
            return;
        } else
        {
            navigation.chat(contact, false);
            return;
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (Contact)obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Contact contact)
    {
        return false;
    }

    public void onResume()
    {
        super.onResume();
        updateList();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = LayoutInflater.from(getActivity()).inflate(0x7f0300cc, null);
        imageView = (ImageView)bundle.findViewById(0x7f100488);
        Button button = (Button)bundle.findViewById(0x7f100489);
        imageCallback = new UiCallback((Activity)view.getContext(), new AsyncCallback() {

            final ParticipantListFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    asyncresult = (Bitmap)asyncresult.a();
                    setAvatarImage(asyncresult);
                    imageView.setVisibility(0);
                }
            }

            
            {
                this$0 = ParticipantListFragment.this;
                super();
            }
        });
        ViewUtil.a(this, new View[] {
            imageView, button
        });
        view = new RecyclerListDecorator(getActivity(), adapter);
        view.a(bundle);
        getListView().setAdapter(view);
        adapter.setOnUserEventListener(0, this);
        setListShown(true);
        updatePicture();
    }


}
