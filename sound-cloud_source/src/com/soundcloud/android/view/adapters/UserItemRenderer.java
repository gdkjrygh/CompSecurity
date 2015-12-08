// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.java.optional.Optional;
import java.util.List;

public class UserItemRenderer
    implements CellRenderer
{

    private final ImageOperations imageOperations;
    private final CondensedNumberFormatter numberFormatter;

    public UserItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter)
    {
        imageOperations = imageoperations;
        numberFormatter = condensednumberformatter;
    }

    private void loadImage(View view, UserItem useritem)
    {
        imageOperations.displayCircularInAdapterView(useritem.getEntityUrn(), ApiImageSize.getListItemImageSize(view.getContext()), (ImageView)view.findViewById(0x7f0f006f));
    }

    private void setOptionalCountry(View view, UserItem useritem)
    {
        useritem = useritem.getCountry();
        view = (TextView)view.findViewById(0x7f0f001b);
        if (useritem.isPresent())
        {
            view.setText((CharSequence)useritem.get());
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void setupFollowersCount(View view, UserItem useritem)
    {
        view = (TextView)view.findViewById(0x7f0f0017);
        int i = useritem.getFollowersCount();
        if (i >= 0)
        {
            view.setVisibility(0);
            view.setText(numberFormatter.format(i));
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (UserItem)list.get(i);
        ((TextView)view.findViewById(0x7f0f0018)).setText(list.getName());
        setOptionalCountry(view, list);
        setupFollowersCount(view, list);
        loadImage(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300db, viewgroup, false);
    }
}
