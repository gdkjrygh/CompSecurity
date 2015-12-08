// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.PROPKEY;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.widget:
//            ActionSpinner

public class CallActionSpinner extends ActionSpinner
{

    private ContactUtil d;
    private ConversationUtil e;
    private Contact f;
    private Conversation g;
    private LayerDrawable h;

    public CallActionSpinner(Context context)
    {
        super(context, null);
        c = context.getString(0x7f080065);
        d();
    }

    public CallActionSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d();
    }

    public CallActionSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d();
    }

    private void d()
    {
        setContentDescription(getContext().getString(0x7f080054));
    }

    public final Drawable a()
    {
        Object obj;
        if (h != null)
        {
            obj = h;
        } else
        {
            Drawable drawable = getResources().getDrawable(0x7f02004a);
            obj = drawable;
            if (a.size() > 1)
            {
                BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f020206);
                bitmapdrawable.setGravity(85);
                h = new LayerDrawable(new Drawable[] {
                    drawable, bitmapdrawable
                });
                h.setLayerInset(1, 0, 0, -5, -5);
                return h;
            }
        }
        return ((Drawable) (obj));
    }

    protected final View a(int i, View view, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        ActionSpinner.Item item = (ActionSpinner.Item)a.get(i);
        View view1 = view;
        if (view == null)
        {
            view1 = layoutinflater.inflate(0x7f03010e, viewgroup, false);
        }
        ((TextView)view1.findViewById(0x7f1001cc)).setText(item.a());
        ((TextView)view1.findViewById(0x7f100530)).setText(item.b());
        return view1;
    }

    protected final int b()
    {
        return 0x7f03010e;
    }

    protected final void c()
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        if (e.f(g) && !ContactUtil.g(f))
        {
            arraylist.add(new ActionSpinner.Item(getContext().getString(0x7f08018f), f.getIdentity(), PROPKEY.CONTACT_SKYPENAME));
        }
        iterator = d.j(f).iterator();
_L11:
        Pair pair;
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_350;
        }
        pair = (Pair)iterator.next();
        s1 = ((String)pair.second).trim();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[PROPKEY.values().length];
                try
                {
                    a[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[PROPKEY.CONTACT_ASSIGNED_PHONE1.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[PROPKEY.CONTACT_ASSIGNED_PHONE2.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PROPKEY.CONTACT_ASSIGNED_PHONE3.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PROPKEY.CONTACT_PSTNNUMBER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((PROPKEY)pair.first).ordinal()];
        JVM INSTR tableswitch 1 6: default 176
    //                   1 209
    //                   2 229
    //                   3 249
    //                   4 269
    //                   5 296
    //                   6 323;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_323;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        String s = getContext().getString(0x7f08011e);
_L12:
        arraylist.add(new ActionSpinner.Item(s, s1, pair.first));
        if (true) goto _L11; else goto _L10
_L10:
        s = getContext().getString(d.a("0"));
          goto _L12
_L5:
        s = getContext().getString(d.a("1"));
          goto _L12
_L6:
        s = getContext().getString(d.a("2"));
          goto _L12
_L7:
        s = getContext().getString(d.a(f.getAssignedPhone1LabelProp()));
          goto _L12
_L8:
        s = getContext().getString(d.a(f.getAssignedPhone2LabelProp()));
          goto _L12
        s = getContext().getString(d.a(f.getAssignedPhone3LabelProp()));
          goto _L12
        a = arraylist;
_L14:
        return;
_L2:
        if (g != null)
        {
            a = new ArrayList();
            if (e.f(g))
            {
                a.add(new ActionSpinner.Item(getContext().getString(0x7f08018f), g.getDisplaynameProp(), PROPKEY.CONVERSATION_IDENTITY));
                return;
            }
        } else
        {
            a = new ArrayList();
            return;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setDropDownVerticalOffset(getResources().getDimensionPixelSize(0x7f0c0002) - getBottom());
        }
    }

    public void setContact(Contact contact, Conversation conversation, ConversationUtil conversationutil, ContactUtil contactutil)
    {
        f = contact;
        g = conversation;
        d = contactutil;
        e = conversationutil;
        super.a(getContext(), null);
    }
}
