// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.utils.ScTextUtils;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.comments:
//            Comment

public class CommentRenderer
    implements CellRenderer
{

    private final ImageOperations imageOperations;
    private final Resources resources;

    public CommentRenderer(Resources resources1, ImageOperations imageoperations)
    {
        resources = resources1;
        imageOperations = imageoperations;
    }

    private void setDate(View view, Date date)
    {
        date = ScTextUtils.formatTimeElapsedSince(resources, date.getTime(), true);
        ((TextView)view.findViewById(0x7f0f0166)).setText(date);
    }

    private void setUserAvatar(View view, Urn urn)
    {
        imageOperations.displayCircularInAdapterView(urn, ApiImageSize.getListItemImageSize(resources), (ImageView)view.findViewById(0x7f0f006f));
    }

    private void setUserName(View view, Comment comment)
    {
        view = textView(view, 0x7f0f0151);
        view.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        view.setText(resources.getString(0x7f070220, new Object[] {
            comment.getUsername(), ScTextUtils.formatTimestamp(comment.getTimeStamp(), TimeUnit.MILLISECONDS)
        }));
    }

    private TextView textView(View view, int i)
    {
        return (TextView)view.findViewById(i);
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (Comment)list.get(i);
        setUserName(view, list);
        textView(view, 0x7f0f0167).setText(list.getText());
        setUserAvatar(view, list.getUserUrn());
        setDate(view, list.getDate());
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030064, viewgroup, false);
    }
}
