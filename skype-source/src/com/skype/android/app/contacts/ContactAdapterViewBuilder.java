// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SkypeAvatarView;
import java.util.Locale;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

public class ContactAdapterViewBuilder
{
    static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a CONTACT;
        public static final a CONTACT_DIRECTORY;
        public static final a HEADER;
        public static final a SEARCH_RESULT;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/contacts/ContactAdapterViewBuilder$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            HEADER = new a("HEADER", 0);
            SEARCH_RESULT = new a("SEARCH_RESULT", 1);
            CONTACT = new a("CONTACT", 2);
            CONTACT_DIRECTORY = new a("CONTACT_DIRECTORY", 3);
            $VALUES = (new a[] {
                HEADER, SEARCH_RESULT, CONTACT, CONTACT_DIRECTORY
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private AccessibilityUtil accessibility;
    private ContactUtil contactUtil;
    private ImageCache imageCache;
    private AsyncCallback imageCallback;
    private AsyncCallback moodCallback;

    public ContactAdapterViewBuilder(ContactUtil contactutil, ImageCache imagecache, AccessibilityUtil accessibilityutil)
    {
        imageCallback = new AsyncCallback() {

            final ContactAdapterViewBuilder this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    Object obj = (ContactAdapter.FullContactItemHolder)asyncresult.b();
                    SkypeAvatarView skypeavatarview = ((ContactAdapter.FullContactItemHolder) (obj)).avatarView;
                    asyncresult = (Bitmap)asyncresult.a();
                    if (asyncresult != null)
                    {
                        obj = ((ContactAdapter.FullContactItemHolder) (obj)).contact;
                        setImageForView(skypeavatarview, contactUtil.a(((ContactItem) (obj)).getIdentity(), ((ContactItem) (obj)).getType(), ((ContactItem) (obj)).isBlocked(), asyncresult));
                    }
                }
            }

            
            {
                this$0 = ContactAdapterViewBuilder.this;
                super();
            }
        };
        moodCallback = new AsyncCallback() {

            final ContactAdapterViewBuilder this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (asyncresult.d()) goto _L2; else goto _L1
_L1:
                TextView textview;
                CharSequence charsequence = (CharSequence)asyncresult.a();
                asyncresult = (ContactAdapter.FullContactItemHolder)asyncresult.b();
                textview = ((ContactAdapter.FullContactItemHolder) (asyncresult)).statusMessage;
                com.skype.Contact.AVAILABILITY availability = ((ContactAdapter.FullContactItemHolder) (asyncresult)).contact.getAvailability();
                asyncresult = charsequence;
                static final class _cls3
                {

                    static final int $SwitchMap$com$skype$Contact$AVAILABILITY[];

                    static 
                    {
                        $SwitchMap$com$skype$Contact$AVAILABILITY = new int[com.skype.Contact.AVAILABILITY.values().length];
                        try
                        {
                            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.AWAY.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.AWAY_FROM_MOBILE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.ONLINE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.ONLINE_FROM_MOBILE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (charsequence.length() == 0)
                {
                    switch (_cls3..SwitchMap.com.skype.Contact.AVAILABILITY[availability.ordinal()])
                    {
                    default:
                        asyncresult = charsequence;
                        break;

                    case 1: // '\001'
                    case 2: // '\002'
                    case 3: // '\003'
                    case 4: // '\004'
                        break MISSING_BLOCK_LABEL_117;
                    }
                }
_L3:
                byte byte0;
                if (TextUtils.isEmpty(asyncresult))
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                textview.setVisibility(byte0);
                textview.setText(asyncresult);
_L2:
                return;
                asyncresult = textview.getContext().getString(0x7f080294);
                  goto _L3
            }

            
            {
                this$0 = ContactAdapterViewBuilder.this;
                super();
            }
        };
        contactUtil = contactutil;
        imageCache = imagecache;
        accessibility = accessibilityutil;
    }

    private Spannable buildAndHighlightName(ContactItem contactitem, String s, Resources resources)
    {
label0:
        {
label1:
            {
                String s2 = contactUtil.a(contactitem.getDisplayName(), contactitem.getType());
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s2);
                if (TextUtils.isEmpty(s))
                {
                    break label0;
                }
                Locale locale = Locale.getDefault();
                String s1 = s.toUpperCase(locale);
                int j = s2.toUpperCase(locale).indexOf(s1);
                int k = j + s.length();
                int i;
                if (j >= 0)
                {
                    i = k;
                    if (k >= 0)
                    {
                        break label1;
                    }
                }
                contactitem = contactitem.getIdentity();
                j = contactitem.toUpperCase(locale).indexOf(s1);
                i = j + s.length();
                if (j < 0 || i < 0)
                {
                    j = 0;
                    i = 0;
                } else
                {
                    spannablestringbuilder.append('(');
                    int l = spannablestringbuilder.length();
                    spannablestringbuilder.append(contactitem);
                    spannablestringbuilder.append(')');
                    j += l;
                    i += l;
                }
            }
            spannablestringbuilder.setSpan(new ForegroundColorSpan(resources.getColor(0x7f0f00d3)), j, i, 0);
        }
        return spannablestringbuilder;
    }

    private boolean isEmail(String s)
    {
        return s != null && s.contains("@");
    }

    private void setAvatarForHolder(ContactItem contactitem, ContactAdapter.FullContactItemHolder fullcontactitemholder)
    {
        if (fullcontactitemholder.bitmapFuture != null)
        {
            fullcontactitemholder.bitmapFuture.cancel(true);
        }
        boolean flag = ContactUtil.b(contactitem.getType());
        SkypeAvatarView skypeavatarview = fullcontactitemholder.avatarView;
        Object obj;
        if (flag)
        {
            obj = PathType.b;
        } else
        {
            obj = null;
        }
        skypeavatarview.setAlternativeShape(((PathType) (obj)));
        if (contactitem.isLocalContact())
        {
            if (TextUtils.isEmpty(contactitem.getPstnNumber()))
            {
                obj = com.skype.Contact.TYPE.EXTERNAL;
            } else
            {
                obj = com.skype.Contact.TYPE.PSTN;
            }
        } else
        {
            obj = contactitem.getType();
        }
        obj = contactUtil.a(contactitem.getIdentity(), ((com.skype.Contact.TYPE) (obj)), com.skype.android.res.DefaultAvatars.AvatarSize.a);
        setImageForView(fullcontactitemholder.avatarView, ((Drawable) (obj)));
        if (!contactitem.isLocalContact())
        {
            fullcontactitemholder.bitmapFuture = imageCache.a(contactitem, fullcontactitemholder, imageCallback);
        }
    }

    private void setImageForView(SkypeAvatarView skypeavatarview, Drawable drawable)
    {
        skypeavatarview.setImageDrawable(drawable);
        skypeavatarview.setVisibility(0);
    }

    private void setStatusText(ContactAdapter.FullContactItemHolder fullcontactitemholder, Context context, a a1)
    {
        if (fullcontactitemholder.moodFuture != null)
        {
            fullcontactitemholder.moodFuture.cancel(true);
        }
        int i = 0;
        TextView textview = fullcontactitemholder.statusMessage;
        if (fullcontactitemholder.contact.isBlocked())
        {
            textview.setText(0x7f0802a3);
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else
        if (fullcontactitemholder.contact.isLocalContact())
        {
            a1 = fullcontactitemholder.contact.getPstnNumber();
            context = a1;
            if (TextUtils.isEmpty(a1))
            {
                context = fullcontactitemholder.contact.getEmailAddress();
            }
            textview.setText(context);
        } else
        if (a1 == a.CONTACT_DIRECTORY)
        {
            fullcontactitemholder = contactUtil.f(fullcontactitemholder.contact.getCountry());
            if (fullcontactitemholder == null)
            {
                i = 4;
            } else
            {
                textview.setText(fullcontactitemholder);
            }
        } else
        if (fullcontactitemholder.contact.isAuthorized())
        {
            context = fullcontactitemholder.contact;
            fullcontactitemholder.moodFuture = contactUtil.a(context.getType(), context.getContactObjectId(), context.getRichMood(), context.getMood(), context.getMoodTimestamp(), fullcontactitemholder, moodCallback);
        } else
        {
            i = 8;
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        textview.setVisibility(i);
    }

    void bindContactView(ContactAdapter.FullContactItemHolder fullcontactitemholder, Context context, View view, ContactItem contactitem, String s, a a1, boolean flag)
    {
        Object obj;
        fullcontactitemholder.checkbox.setOnCheckedChangeListener(null);
        fullcontactitemholder.checkbox.setTag(Integer.valueOf(contactitem.getContactObjectId()));
        boolean flag1 = fullcontactitemholder.isItemChecked();
        fullcontactitemholder.checkbox.setChecked(flag1);
        if (accessibility.a())
        {
            AccessibilityUtil.a(new View[] {
                fullcontactitemholder.checkbox
            });
        }
        if (flag)
        {
            fullcontactitemholder.checkbox.setOnCheckedChangeListener(fullcontactitemholder);
        }
        highlightItem(view, flag1);
        obj = fullcontactitemholder.checkbox;
        SpannableStringBuilder spannablestringbuilder;
        int i;
        int j;
        int k;
        if (flag || flag1)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((CheckBox) (obj)).setVisibility(i);
        obj = contactUtil.a(contactitem.getDisplayName(), contactitem.getType());
        if (s == null) goto _L2; else goto _L1
_L1:
label0:
        {
            spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (obj)));
            j = ((String) (obj)).toUpperCase(Locale.getDefault()).indexOf(s.toUpperCase(Locale.getDefault()));
            k = j + s.length();
            if (j >= 0)
            {
                i = k;
                if (k >= 0)
                {
                    break label0;
                }
            }
            j = 0;
            i = 0;
        }
        spannablestringbuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(0x7f0f00d3)), j, i, 0);
        fullcontactitemholder.fullName.setText(spannablestringbuilder, android.widget.TextView.BufferType.SPANNABLE);
_L4:
        contactUtil.a(fullcontactitemholder.fullName, contactitem.getType());
        fullcontactitemholder.contact = contactitem;
        if (fullcontactitemholder.statusMessage != null)
        {
            setStatusText(fullcontactitemholder, context, a1);
        }
        if (fullcontactitemholder.bitmapFuture != null)
        {
            fullcontactitemholder.bitmapFuture.cancel(true);
        }
        fullcontactitemholder.avatarView.setVisibility(4);
        setAvatarForHolder(contactitem, fullcontactitemholder);
        if (accessibility.a() && fullcontactitemholder.checkbox.getVisibility() == 0)
        {
            view.setContentDescription(getLongDescription(fullcontactitemholder));
        }
        contactUtil.a(fullcontactitemholder.presenceIcon, contactitem.getType(), contactitem.getAvailability());
        return;
_L2:
        fullcontactitemholder.fullName.setText(((CharSequence) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
    }

    void bindHeaderView(ContactAdapter.a a1, Context context, String s)
    {
        a1.title.setText(s);
        a1.title.setContentDescription(context.getString(0x7f08007b, new Object[] {
            a1.title.getText()
        }));
    }

    void bindSearchResultView(ContactSearchAdapter.b b, Context context, ContactItem contactitem, String s)
    {
        context = buildAndHighlightName(contactitem, s, context.getResources());
        b.title.setText(context, android.widget.TextView.BufferType.SPANNABLE);
        contactUtil.a(b.title, contactitem.getType(), contactitem.getAvailability());
        contactUtil.a(b.title, contactitem.getType());
    }

    public String getLongDescription(ContactAdapter.FullContactItemHolder fullcontactitemholder)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(fullcontactitemholder.fullName.getText());
        stringbuilder.append(", ");
        stringbuilder.append(fullcontactitemholder.statusMessage.getText());
        boolean flag = fullcontactitemholder.checkbox.isChecked();
        fullcontactitemholder = fullcontactitemholder.checkbox.getContext();
        String s = fullcontactitemholder.getString(0x7f080073);
        if (flag)
        {
            stringbuilder.append(", ").append(String.format(s, new Object[] {
                fullcontactitemholder.getString(0x7f080074)
            }));
        } else
        {
            stringbuilder.append(", ").append(String.format(s, new Object[] {
                fullcontactitemholder.getString(0x7f0800e8)
            }));
        }
        return stringbuilder.toString();
    }

    public String getShortDescription(ContactAdapter.FullContactItemHolder fullcontactitemholder)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(fullcontactitemholder.fullName.getText());
        boolean flag = fullcontactitemholder.checkbox.isChecked();
        fullcontactitemholder = fullcontactitemholder.checkbox.getContext();
        if (flag)
        {
            stringbuilder.append(", ").append(fullcontactitemholder.getString(0x7f080074));
        } else
        {
            stringbuilder.append(", ").append(fullcontactitemholder.getString(0x7f0800e8));
        }
        return stringbuilder.toString();
    }

    public void highlightItem(View view, boolean flag)
    {
        View view1 = view.findViewById(0x7f10031c);
        if (view1 != null)
        {
            view1.setSelected(flag);
        }
        ((TextView)view.findViewById(0x7f10031a)).setSelected(flag);
        view = (TextView)view.findViewById(0x7f10031b);
        if (view != null)
        {
            view.setSelected(flag);
        }
    }


}
