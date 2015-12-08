// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesItem, FacebookInvitesStorage

public class FacebookInvitesItemRenderer
    implements CellRenderer
{
    public static interface OnFacebookInvitesClickListener
    {

        public abstract void onFacebookInvitesCloseButtonClicked(int i);

        public abstract void onFacebookInvitesInviteButtonClicked(int i);
    }


    private final FacebookInvitesStorage facebookInvitesStorage;
    private final ImageOperations imageOperations;
    private OnFacebookInvitesClickListener onFacebookInvitesClickListener;

    public FacebookInvitesItemRenderer(ImageOperations imageoperations, FacebookInvitesStorage facebookinvitesstorage)
    {
        imageOperations = imageoperations;
        facebookInvitesStorage = facebookinvitesstorage;
    }

    private void setClickListeners(View view, final int position)
    {
        view.findViewById(0x7f0f00d6).setOnClickListener(new _cls1());
        view.findViewById(0x7f0f0171).setOnClickListener(new _cls2());
    }

    private void setFriendImage(View view, int i, List list, int j)
    {
        view = (ImageView)view.findViewById(i);
        if (list.size() > j)
        {
            view.setVisibility(0);
            imageOperations.displayCircular((String)list.get(j), view);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        view.setEnabled(false);
        list = (FacebookInvitesItem)list.get(i);
        if (list.hasPictures())
        {
            list = list.getFacebookFriendPictureUrls();
            view.findViewById(0x7f0f016b).setVisibility(0);
            view.findViewById(0x7f0f0170).setVisibility(8);
            setFriendImage(view, 0x7f0f016c, list, 0);
            setFriendImage(view, 0x7f0f016d, list, 1);
            setFriendImage(view, 0x7f0f016e, list, 2);
        } else
        {
            view.findViewById(0x7f0f016b).setVisibility(8);
            view.findViewById(0x7f0f0170).setVisibility(0);
        }
        setClickListeners(view, i);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030069, viewgroup, false);
    }

    public void setOnFacebookInvitesClickListener(OnFacebookInvitesClickListener onfacebookinvitesclicklistener)
    {
        onFacebookInvitesClickListener = onfacebookinvitesclicklistener;
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FacebookInvitesItemRenderer this$0;
        final int val$position;

        public void onClick(View view)
        {
            facebookInvitesStorage.setDismissed();
            if (onFacebookInvitesClickListener != null)
            {
                onFacebookInvitesClickListener.onFacebookInvitesCloseButtonClicked(position);
            }
        }

        _cls1()
        {
            this$0 = FacebookInvitesItemRenderer.this;
            position = i;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FacebookInvitesItemRenderer this$0;
        final int val$position;

        public void onClick(View view)
        {
            facebookInvitesStorage.setClicked();
            if (onFacebookInvitesClickListener != null)
            {
                onFacebookInvitesClickListener.onFacebookInvitesInviteButtonClicked(position);
            }
        }

        _cls2()
        {
            this$0 = FacebookInvitesItemRenderer.this;
            position = i;
            super();
        }
    }

}
