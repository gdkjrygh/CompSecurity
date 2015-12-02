// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.facebook.common.w.n;
import com.facebook.g;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.orca.annotations.IsNewPhotoUploadEnabled;
import com.facebook.orca.photos.b.ab;
import com.facebook.orca.photos.b.h;
import com.facebook.orca.photos.b.k;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.d.c;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.b.a;
import com.facebook.widget.f;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.compose:
//            l, k, i, j

public class ComposeAttachmentContainer extends f
{

    private static final int a[] = {
        0x10100a7
    };
    private static final int b[] = new int[0];
    private final LayoutInflater c;
    private final a d;
    private final d e;
    private final k f;
    private final h g;
    private final javax.inject.a h;
    private final ab i;
    private final com.facebook.common.executors.a j;
    private final l k;
    private final com.facebook.ui.images.d.h l;
    private final LinkedHashMap m;
    private final LinearLayout n;
    private final HorizontalScrollView o;
    private com.facebook.orca.compose.k p;
    private String q;
    private boolean r;

    public ComposeAttachmentContainer(Context context)
    {
        this(context, null);
    }

    public ComposeAttachmentContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ComposeAttachmentContainer(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        m = ik.b();
        context = getInjector();
        c = (LayoutInflater)context.a(android/view/LayoutInflater);
        d = (a)context.a(com/facebook/ui/media/b/a);
        e = (d)context.a(com/facebook/ui/media/attachments/d);
        f = (k)context.a(com/facebook/orca/photos/b/k);
        g = (h)context.a(com/facebook/orca/photos/b/h);
        h = context.b(java/lang/Boolean, com/facebook/orca/annotations/IsNewPhotoUploadEnabled);
        i = (ab)context.a(com/facebook/orca/photos/b/ab);
        j = (com.facebook.common.executors.a)context.a(com/facebook/common/executors/a);
        setContentView(com.facebook.k.orca_compose_attachment_view);
        n = (LinearLayout)getView(i.compose_attachments);
        o = (HorizontalScrollView)getView(i.compose_attachment_scroll);
        k = new l(this, null);
        i1 = getContext().getResources().getDimensionPixelSize(g.orca_compose_attachment_item_image_width_height);
        context = (new com.facebook.ui.images.d.i()).a(0).c(i1).b(0).d(i1).a(true);
        context.a((new com.facebook.ui.images.d.d()).a(1.0F).b(0.0F).c(0.0F).b(0.5F).c(0.5F).a(c.CENTER).e());
        l = context.j();
    }

    static LinkedHashMap a(ComposeAttachmentContainer composeattachmentcontainer)
    {
        return composeattachmentcontainer.m;
    }

    static void a(ComposeAttachmentContainer composeattachmentcontainer, com.facebook.ui.media.attachments.a a1)
    {
        composeattachmentcontainer.a(a1);
    }

    private void a(com.facebook.ui.media.attachments.a a1)
    {
        if (m.isEmpty())
        {
            return;
        }
        a1 = (View)m.remove(a1);
        if (a1 != null)
        {
            n.removeView(a1);
        }
        if (n.getChildCount() == 0)
        {
            o.setVisibility(8);
        }
        c();
    }

    private void a(List list, String s)
    {
        for (list = list.iterator(); list.hasNext(); a((com.facebook.ui.media.attachments.a)list.next(), s)) { }
    }

    private boolean a(CharSequence charsequence, com.facebook.ui.media.attachments.a a1)
    {
        return ((Boolean)h.b()).booleanValue() && !com.facebook.common.w.n.a(charsequence) && !r && a1.a().c() == com.facebook.ui.media.attachments.g.PHOTO;
    }

    static ab b(ComposeAttachmentContainer composeattachmentcontainer)
    {
        return composeattachmentcontainer.i;
    }

    static void b(ComposeAttachmentContainer composeattachmentcontainer, com.facebook.ui.media.attachments.a a1)
    {
        composeattachmentcontainer.b(a1);
    }

    private void b(com.facebook.ui.media.attachments.a a1)
    {
        if (p != null)
        {
            p.a(a1);
        }
    }

    static com.facebook.common.executors.a c(ComposeAttachmentContainer composeattachmentcontainer)
    {
        return composeattachmentcontainer.j;
    }

    private void c()
    {
        if (p != null)
        {
            p.a();
        }
    }

    public void a()
    {
        m.clear();
        n.removeAllViews();
        o.setVisibility(8);
        c();
    }

    public void a(com.facebook.ui.media.attachments.a a1, String s)
    {
        if (a1 == null)
        {
            c();
            return;
        }
        View view = null;
        if (a1.a().c() == com.facebook.ui.media.attachments.g.PHOTO)
        {
            view = c.inflate(com.facebook.k.orca_composer_attachment_item, n, false);
            ((UrlImage)view.findViewById(i.composer_attachment_item_image)).setImageParams(com.facebook.ui.images.b.m.a(a1.a().d()).a(l).a());
            n.addView(view);
            o.setVisibility(0);
        }
        MediaResource mediaresource = a1.a();
        if (a(((CharSequence) (s)), a1))
        {
            mediaresource = f.a(a1.a(), s);
        }
        s = e.b(mediaresource);
        if (view != null)
        {
            view.findViewById(i.composer_attachment_item_remove).setOnClickListener(new com.facebook.orca.compose.i(this, s));
            view.setOnClickListener(new j(this, a1));
            o.setVisibility(0);
        }
        m.put(s, view);
        c();
    }

    public boolean b()
    {
        return m.isEmpty();
    }

    public LinkedHashMap getMediaAttachments()
    {
        return m;
    }

    public List getMediaResources()
    {
        ArrayList arraylist = hq.a();
        for (Iterator iterator = m.keySet().iterator(); iterator.hasNext(); arraylist.add(((com.facebook.ui.media.attachments.a)iterator.next()).a())) { }
        return arraylist;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        g.a(k);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g.b(k);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!parcelable.getClass().equals(com/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState))
        {
            super.onRestoreInstanceState(parcelable);
        } else
        {
            Object obj = (SavedAttachmentState)parcelable;
            super.onRestoreInstanceState(((SavedAttachmentState) (obj)).getSuperState());
            a();
            m.clear();
            if (((SavedAttachmentState) (obj)).a != null)
            {
                r = ((SavedAttachmentState) (obj)).c;
                q = ((SavedAttachmentState) (obj)).b;
                parcelable = hq.a();
                MediaResource mediaresource;
                for (obj = ((SavedAttachmentState) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); parcelable.add(e.b(mediaresource)))
                {
                    mediaresource = (MediaResource)((Iterator) (obj)).next();
                }

                a(parcelable, q);
                return;
            }
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedAttachmentState savedattachmentstate = new SavedAttachmentState(super.onSaveInstanceState());
        ArrayList arraylist = hq.a();
        for (Iterator iterator = m.keySet().iterator(); iterator.hasNext(); arraylist.add(((com.facebook.ui.media.attachments.a)iterator.next()).a())) { }
        savedattachmentstate.c = r;
        savedattachmentstate.a = arraylist;
        savedattachmentstate.b = q;
        return savedattachmentstate;
    }

    public void setComposingSmsThread(boolean flag)
    {
        r = flag;
    }

    public void setListener(com.facebook.orca.compose.k k1)
    {
        p = k1;
    }


    private class SavedAttachmentState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new com.facebook.orca.compose.n();
        ArrayList a;
        String b;
        boolean c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            if (c)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            parcel.writeArray(a.toArray());
            parcel.writeString(b);
        }


        public SavedAttachmentState(Parcel parcel)
        {
            boolean flag = true;
            super(parcel);
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            c = flag;
            a = parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader());
            b = parcel.readString();
        }

        public SavedAttachmentState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
