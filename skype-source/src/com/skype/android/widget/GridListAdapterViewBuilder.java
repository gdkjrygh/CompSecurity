// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.android.app.favorites.Favorite;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.async.UiCallback;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.widget:
//            SkypeAvatarView, PathType

public class GridListAdapterViewBuilder
{
    private final class a
        implements AsyncCallback
    {

        final GridListAdapterViewBuilder a;
        private final Contact b;

        public final void done(AsyncResult asyncresult)
        {
            if (!asyncresult.d())
            {
                Object obj = (Bitmap)asyncresult.a();
                asyncresult = (GridListAdapter.GridItemViewHolder)asyncresult.b();
                if (obj != null)
                {
                    obj = GridListAdapterViewBuilder.a(a).a(b, ((Bitmap) (obj)));
                    GridListAdapterViewBuilder.a(a, asyncresult, b, ((Drawable) (obj)));
                }
            }
        }

        public a(Contact contact)
        {
            a = GridListAdapterViewBuilder.this;
            super();
            b = contact;
        }
    }


    private ContactUtil a;
    private ImageCache b;
    private Activity c;
    private ObjectIdMap d;
    private GroupAvatarUtil e;
    private DefaultAvatars f;
    private int g;

    public GridListAdapterViewBuilder(Activity activity, ContactUtil contactutil, ImageCache imagecache, ObjectIdMap objectidmap, DefaultAvatars defaultavatars, GroupAvatarUtil groupavatarutil)
    {
        g = 1;
        c = activity;
        a = contactutil;
        b = imagecache;
        d = objectidmap;
        f = defaultavatars;
        e = groupavatarutil;
    }

    static ContactUtil a(GridListAdapterViewBuilder gridlistadapterviewbuilder)
    {
        return gridlistadapterviewbuilder.a;
    }

    private void a(Drawable drawable)
    {
        if (drawable instanceof LayerDrawable)
        {
            int i = c.getResources().getDimensionPixelSize(0x7f0c00c6);
            ((LayerDrawable)drawable).setLayerInset(1, i, i, i, i);
        }
    }

    static void a(GridListAdapter.GridItemViewHolder griditemviewholder)
    {
        a(griditemviewholder, true);
    }

    private static void a(GridListAdapter.GridItemViewHolder griditemviewholder, boolean flag)
    {
        if (griditemviewholder.displayNameContainer != null)
        {
            griditemviewholder = griditemviewholder.displayNameContainer;
            int i;
            if (flag)
            {
                i = 0x7f020078;
            } else
            {
                i = 0;
            }
            griditemviewholder.setBackgroundResource(i);
        }
    }

    static void a(GridListAdapterViewBuilder gridlistadapterviewbuilder, GridListAdapter.GridItemViewHolder griditemviewholder, Contact contact, Drawable drawable)
    {
        gridlistadapterviewbuilder.a(false, griditemviewholder, contact, drawable);
    }

    private void a(boolean flag, GridListAdapter.GridItemViewHolder griditemviewholder, Contact contact, Drawable drawable)
    {
        griditemviewholder.avatar.setPresenceVisible(true);
        boolean flag1 = ContactUtil.b(contact.getType());
        drawable = new LayerDrawable(new Drawable[] {
            drawable, c.getResources().getDrawable(0x7f020173)
        });
        SkypeAvatarView skypeavatarview = griditemviewholder.avatar;
        if (flag1)
        {
            contact = PathType.b;
        } else
        {
            contact = null;
        }
        skypeavatarview.setAlternativeShape(contact);
        if (flag)
        {
            a(griditemviewholder, false);
            a(drawable);
        } else
        {
            a(griditemviewholder, true);
        }
        griditemviewholder.avatar.setImageDrawable(drawable);
    }

    public final void a(int i)
    {
        g = i;
    }

    public final void a(GridListAdapter.GridItemViewHolder griditemviewholder, Contact contact)
    {
        if (griditemviewholder.bitmapFuture != null)
        {
            griditemviewholder.bitmapFuture.cancel(true);
        }
        griditemviewholder.displayName.setText(contact.getDisplaynameProp());
        Object obj = contact.getDisplaynameProp();
        com.skype.Contact.AVAILABILITY availability = contact.getAvailabilityProp();
        com.skype.Contact.TYPE type = contact.getTypeProp();
        a.a(griditemviewholder.presenceIcon, type, availability);
        griditemviewholder.displayName.setContentDescription(a.a(((String) (obj)), availability));
        a.a(griditemviewholder.displayName, type);
        obj = b.c(contact);
        if (obj != null)
        {
            a(false, griditemviewholder, contact, ((Drawable) (new BitmapDrawable(c.getResources(), ((Bitmap) (obj))))));
            return;
        } else
        {
            a(true, griditemviewholder, contact, a.a(contact.getIdentity(), contact.getType(), com.skype.android.res.DefaultAvatars.AvatarSize.c));
            UiCallback uicallback = new UiCallback(c, new a(contact));
            griditemviewholder.bitmapFuture = b.b(contact, griditemviewholder, uicallback);
            return;
        }
    }

    public final void a(GridListAdapter.GridItemViewHolder griditemviewholder, Favorite favorite)
    {
        griditemviewholder.displayName.setText(favorite.getDisplayName());
        Drawable drawable = f.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, favorite.getIdentity());
        a(drawable);
        griditemviewholder.avatar.setImageDrawable(drawable);
        griditemviewholder.avatar.setPresenceVisible(false);
        a(griditemviewholder, false);
        UiCallback uicallback = new UiCallback(c, new AsyncCallback(griditemviewholder) {

            final GridListAdapter.GridItemViewHolder a;
            final GridListAdapterViewBuilder b;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    SkypeAvatarView skypeavatarview = (SkypeAvatarView)asyncresult.b();
                    asyncresult = (Bitmap)asyncresult.a();
                    if (asyncresult != null)
                    {
                        skypeavatarview.setImageBitmap(asyncresult);
                        GridListAdapterViewBuilder.a(a);
                    }
                }
            }

            
            {
                b = GridListAdapterViewBuilder.this;
                a = griditemviewholder;
                super();
            }
        });
        if (!TextUtils.isEmpty(favorite.getPicture()))
        {
            Object obj = null;
            try
            {
                favorite = (Conversation)d.a(favorite.getConversationObjectId(), com/skype/Conversation);
            }
            // Misplaced declaration of an exception variable
            catch (Favorite favorite)
            {
                favorite.printStackTrace();
                favorite = obj;
            }
            e.a(favorite, griditemviewholder.avatar, uicallback);
            return;
        } else
        {
            b.a(favorite, griditemviewholder.avatar, uicallback);
            return;
        }
    }
}
