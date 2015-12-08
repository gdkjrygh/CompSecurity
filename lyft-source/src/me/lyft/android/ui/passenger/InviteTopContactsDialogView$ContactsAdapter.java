// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.RequestCreator;
import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.providers.UserContact;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteTopContactsDialogView

class this._cls0 extends ArrayAdapter
{

    final InviteTopContactsDialogView this$0;

    private String getFirstNameAndLastInitial(String s)
    {
        s = s.split(",")[0].split(" ");
        if (s.length > 1)
        {
            return String.format("%s %s.", new Object[] {
                s[0], Character.valueOf(s[s.length - 1].charAt(0))
            });
        } else
        {
            return s[0];
        }
    }

    public int getCount()
    {
        return Math.min(super.getCount(), InviteTopContactsDialogView.access$200(InviteTopContactsDialogView.this));
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        UserContact usercontact;
        String s;
        if (view == null)
        {
            view = InviteTopContactsDialogView.access$300(InviteTopContactsDialogView.this).inflate(0x7f03008b, viewgroup, false);
            viewgroup = new >(InviteTopContactsDialogView.this, view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (this._cls0)view.getTag();
        }
        usercontact = (UserContact)getItem(i);
        s = getFirstNameAndLastInitial(usercontact.getName());
        ((getFirstNameAndLastInitial) (viewgroup)).iew.setText(s);
        if (!Strings.isNullOrEmpty(usercontact.getPhotoUri()))
        {
            imageLoader.load(usercontact.getPhotoUri()).placeholder(0x7f0201fc).fit().into(((iew) (viewgroup)).View);
            return view;
        } else
        {
            i = InviteTopContactsDialogView.access$400(InviteTopContactsDialogView.this)[i % InviteTopContactsDialogView.access$400(InviteTopContactsDialogView.this).length];
            ((this._cls0) (viewgroup)).View.setColorFilter(i, android.graphics.Holder.imageView);
            imageLoader.load(0x7f0201fc).fit().into(((View) (viewgroup)).View);
            return view;
        }
    }

    public (Context context, List list)
    {
        this$0 = InviteTopContactsDialogView.this;
        super(context, 0x7f03008b, list);
    }
}
