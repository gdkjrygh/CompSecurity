// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.pinterest.activity.search.model.TypeAheadItem;
import java.util.Collections;
import java.util.List;

public class ContactsAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

    private final OnItemClickListener contactItemListener;
    private List contacts;

    public ContactsAdapter(OnItemClickListener onitemclicklistener)
    {
        contacts = Collections.EMPTY_LIST;
        contactItemListener = onitemclicklistener;
    }

    public int getItemCount()
    {
        return contacts.size();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((SendShareTargetViewHolder)viewholder, i);
    }

    public void onBindViewHolder(SendShareTargetViewHolder sendsharetargetviewholder, int i)
    {
        sendsharetargetviewholder.bind((TypeAheadItem)contacts.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public SendShareTargetViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new SendShareTargetViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0301fe, viewgroup, false));
    }

    public void setContacts(List list)
    {
        contacts = list;
        notifyDataSetChanged();
    }



    private class SendShareTargetViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        TypeAheadItem _contact;
        ImageView _iconIv;
        TextView _iconOverlayTv;
        TextView _textTv;
        RoundProfileImageCell _webIconIv;
        final ContactsAdapter this$0;

        private void bindContact(TypeAheadItem typeaheaditem)
        {
            if (!TextUtils.isEmpty(typeaheaditem.getImageUri()))
            {
                _iconIv.setVisibility(8);
                _webIconIv.setVisibility(0);
                ImageCache.loadImage(_webIconIv, typeaheaditem.getImageUri());
            } else
            {
                _iconIv.setVisibility(0);
                _iconOverlayTv.setVisibility(0);
                _webIconIv.setVisibility(8);
                _iconIv.setBackgroundResource(0x7f020245);
                _iconOverlayTv.setText(getInitials(typeaheaditem));
            }
            _textTv.setText(typeaheaditem.getTitle());
        }

        private void bindSearchPlaceholder()
        {
            _iconIv.setVisibility(0);
            _webIconIv.setVisibility(8);
            android.graphics.drawable.Drawable drawable = DrawableUtils.tintIcon(Resources.drawable(0x7f0201ee), 0x7f0e00bf);
            _iconIv.setImageDrawable(drawable);
            _iconIv.setBackgroundResource(0x7f0200cc);
            int i = (int)Resources.dimension(0x7f0a015f);
            _iconIv.setPadding(i, i, i, i);
            _textTv.setText(0x7f0704c8);
        }

        private String getInitials(TypeAheadItem typeaheaditem)
        {
            typeaheaditem = typeaheaditem.getTitle().split("@")[0].split("\\W", 2);
            StringBuilder stringbuilder = new StringBuilder(3);
            for (int i = 0; i < typeaheaditem.length; i++)
            {
                CharSequence charsequence = typeaheaditem[i];
                if (!TextUtils.isEmpty(charsequence))
                {
                    stringbuilder.append(charsequence.charAt(0));
                }
            }

            return stringbuilder.toString().toUpperCase();
        }

        public void bind(TypeAheadItem typeaheaditem)
        {
            _contact = typeaheaditem;
            _webIconIv.clear();
            _iconOverlayTv.setVisibility(8);
            _iconIv.setImageResource(0x106000d);
            switch (_cls1..SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[typeaheaditem.getItemType().ordinal()])
            {
            default:
                bindContact(typeaheaditem);
                return;

            case 1: // '\001'
                bindSearchPlaceholder();
                break;
            }
        }

        public SendShareTargetViewHolder(View view)
        {
            this$0 = ContactsAdapter.this;
            super(view);
            ButterKnife.a(this, view);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final SendShareTargetViewHolder this$1;
                final ContactsAdapter val$this$0;

                public void onClick(View view1)
                {
                    contactItemListener.onItemClick(_contact, contacts.indexOf(_contact));
                }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>

                private class OnItemClickListener
                {

                    public abstract void onItemClick(TypeAheadItem typeaheaditem, int i);
                }

            }

            view.setOnClickListener(new _cls1());
        }

        private class _cls1
        {

            static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];

            static 
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.TypeAheadItem.ItemType.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.SEARCH_PLACEHOLDER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

    }

}
