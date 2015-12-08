// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ScrollView;
import com.skype.Contact;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.contacts.ContactSearchAdapter;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityEditTextDecorator;
import com.skype.android.util.accessibility.AccessibilityUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.widget:
//            ContactSpan, InterceptionListener, VirtualAccessibilityNodeProvider, QueryStringUpdater, 
//            ParticipantUpdater

public class ParticipantsEditText extends MultiAutoCompleteTextView
    implements OnUserEventListener
{
    private final class a
        implements android.widget.MultiAutoCompleteTextView.Tokenizer
    {

        final ParticipantsEditText a;

        public final int findTokenEnd(CharSequence charsequence, int i)
        {
            int k = charsequence.length();
            do
            {
label0:
                {
                    int j = k;
                    if (i < k)
                    {
                        if (charsequence.charAt(i) != ' ')
                        {
                            break label0;
                        }
                        j = i;
                    }
                    return j;
                }
                i++;
            } while (true);
        }

        public final int findTokenStart(CharSequence charsequence, int i)
        {
            boolean flag = false;
            charsequence = (ContactSpan[])a.getText().getSpans(0, a.getText().length(), com/skype/android/widget/ContactSpan);
            i = ((flag) ? 1 : 0);
            if (charsequence != null)
            {
                i = ((flag) ? 1 : 0);
                if (charsequence.length > 0)
                {
                    charsequence = charsequence[charsequence.length - 1];
                    i = a.getText().getSpanEnd(charsequence) + 1;
                }
            }
            return i;
        }

        public final CharSequence terminateToken(CharSequence charsequence)
        {
            int i = charsequence.length();
            if (i > 0 && charsequence.charAt(i - 1) == ' ')
            {
                return charsequence;
            }
            if (charsequence instanceof Spanned)
            {
                SpannableString spannablestring = new SpannableString((new StringBuilder()).append(charsequence).append(" ").toString());
                TextUtils.copySpansFrom((Spanned)charsequence, 0, charsequence.length(), java/lang/Object, spannablestring, 0);
                return spannablestring;
            } else
            {
                return (new StringBuilder()).append(charsequence).append(" ").toString();
            }
        }

        private a()
        {
            a = ParticipantsEditText.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements TextWatcher
    {

        final ParticipantsEditText a;

        public final void afterTextChanged(Editable editable)
        {
            if (editable == null || editable.toString().trim().isEmpty())
            {
                Editable editable1 = a.getText();
                ContactSpan acontactspan[] = (ContactSpan[])editable1.getSpans(0, a.getText().length(), com/skype/android/widget/ContactSpan);
                int j = acontactspan.length;
                for (int i = 0; i < j; i++)
                {
                    editable1.removeSpan(acontactspan[i]);
                }

                if (a.contacts.size() > 0)
                {
                    a.contacts.clear();
                    a.adapter.setCurrentParticipants(a.getContacts());
                }
                if (editable != null && editable.length() > 0)
                {
                    editable.clear();
                }
            }
            a.clearSelectedSpan();
        }

        public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (j <= k) goto _L2; else goto _L1
_L1:
            j = 0;
            charsequence = null;
            if (a.selectedSpan == null) goto _L4; else goto _L3
_L3:
            charsequence = a.selectedSpan;
            i = 1;
_L10:
            if (charsequence == null) goto _L6; else goto _L5
_L5:
            Object obj;
            int l;
            obj = a.getText();
            l = a.getSpanStart(charsequence);
            k = a.getSpanEnd(charsequence);
            if (k != l) goto _L7; else goto _L6
_L6:
            return;
_L4:
            i = a.getSelectionStart();
            obj = (ContactSpan[])a.getText().getSpans(i, i, com/skype/android/widget/ContactSpan);
            i = j;
            if (obj.length > 0)
            {
                charsequence = obj[0];
                i = j;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            j = k;
            if (k > ((Editable) (obj)).length())
            {
                j = ((Editable) (obj)).length();
            }
            a.removeSpan(((Editable) (obj)), charsequence, l, j);
            if (i == 0) goto _L6; else goto _L8
_L8:
            a.clearSelectedSpan();
            ((Editable) (obj)).append(" ");
            return;
_L2:
            a.scrollEditToBottom();
            return;
            if (true) goto _L10; else goto _L9
_L9:
        }

        private b()
        {
            a = ParticipantsEditText.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final int SPAN_FLAGS = 33;
    private static final Logger log = Logger.getLogger("ParticipantsEditText");
    private AccessibilityEditTextDecorator accessibilityDecorator;
    private AccessibilityUtil accessibilityUtil;
    private ContactSearchAdapter adapter;
    private Field autocompleteEditText_mPopup;
    private ContactSpan.Builder builder;
    private ContactUtil contactUtil;
    private HashSet contacts;
    private int defaultSelectionColor;
    private List existingContacts;
    private float lastX;
    private float lastY;
    private Method localConvertToLocalHorizontalCoordinate;
    private Method localGetLineAtCoordinate;
    private Method localGetOffsetAtCoordinate;
    private ObjectIdMap map;
    private ParticipantUpdater participantUpdater;
    private float scaledTouchSlop;
    private ScrollView scrollView;
    private ContactSpan selectedSpan;
    private b textWatcher;
    private a tokenizer;
    private QueryStringUpdater updater;
    private InterceptionListener virtualAccessibilityNodeProvider;

    public ParticipantsEditText(Context context)
    {
        super(context);
        contacts = new HashSet();
        textWatcher = new b((byte)0);
        tokenizer = new a((byte)0);
        lastX = 0.0F;
        lastY = 0.0F;
    }

    public ParticipantsEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        contacts = new HashSet();
        textWatcher = new b((byte)0);
        tokenizer = new a((byte)0);
        lastX = 0.0F;
        lastY = 0.0F;
    }

    public ParticipantsEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        contacts = new HashSet();
        textWatcher = new b((byte)0);
        tokenizer = new a((byte)0);
        lastX = 0.0F;
        lastY = 0.0F;
    }

    private int _getOffsetAtCoordinate(int i, float f)
    {
        try
        {
            f = ((Float)localConvertToLocalHorizontalCoordinate.invoke(this, new Object[] {
                Float.valueOf(f)
            })).floatValue();
            i = getLayout().getOffsetForHorizontal(i, f);
        }
        catch (Exception exception)
        {
            log.severe("Something weird happen in [_getOffsetAtCoordinate]");
            exception.printStackTrace();
            return -1;
        }
        return i;
    }

    private ContactSpan addContact(Contact contact, int i, int j)
    {
        return addContact(contact, i, j, false, false);
    }

    private ContactSpan addContact(Contact contact, int i, int j, boolean flag, boolean flag1)
    {
        Editable editable = getText();
        if (contacts.add(contact))
        {
            SpannableString spannablestring = new SpannableString((new StringBuilder()).append(contactUtil.l(contact)).append(" ").toString());
            contact = createContactSpan(contact, flag, flag1);
            spannablestring.setSpan(contact, 0, spannablestring.length() - 1, 33);
            editable.replace(i, j, spannablestring);
            adapter.setCurrentParticipants(getContacts());
            return contact;
        } else
        {
            editable.replace(i, j, "");
            return null;
        }
    }

    private void clearSelectedSpan()
    {
        if (selectedSpan != null)
        {
            selectSpan(selectedSpan, false);
            selectedSpan = null;
        }
        setCursorVisible(true);
    }

    private boolean clickedDeleteRegion(ContactSpan contactspan, float f, float f1)
    {
        Rect rect = getSpanPositionOnScreen(contactspan);
        int i = getResources().getDimensionPixelSize(0x7f0c00c0);
        rect.right = rect.right + i;
        rect.bottom = rect.bottom + i;
        rect.bottom = rect.bottom - i;
        return rect.contains((int)f, (int)f1) && f > (float)(rect.right - contactspan.d() - i * 2);
    }

    private ContactSpan createContactSpan(Contact contact, boolean flag, boolean flag1)
    {
        if (builder == null)
        {
            builder = new ContactSpan.Builder(getContext(), contactUtil);
        }
        return (ContactSpan)builder.a(getPaint(), contact, getWidgetWidth(), flag, flag1);
    }

    private ContactSpan findSpan(int i)
    {
        ContactSpan acontactspan[] = (ContactSpan[])getText().getSpans(0, getText().length(), com/skype/android/widget/ContactSpan);
        for (int j = 0; j < acontactspan.length; j++)
        {
            ContactSpan contactspan = acontactspan[j];
            int k = getSpanStart(contactspan);
            int l = getSpanEnd(contactspan);
            if (i >= k && i <= l)
            {
                return contactspan;
            }
        }

        return null;
    }

    private int findText(Editable editable, int i)
    {
        if (editable.charAt(i) != ' ')
        {
            return i;
        } else
        {
            return -1;
        }
    }

    private ListView getListView()
    {
        if (autocompleteEditText_mPopup == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        ListView listview = ((ListPopupWindow)autocompleteEditText_mPopup.get(this)).getListView();
        return listview;
        IllegalAccessException illegalaccessexception;
        illegalaccessexception;
        log.warning("Could not retrieve mPopup field value");
        return null;
    }

    private int getOffsetForPositionInWidget(float f, float f1)
    {
        if (getLayout() == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = ((Integer)localGetLineAtCoordinate.invoke(this, new Object[] {
                Float.valueOf(f1)
            })).intValue();
            i = ((Integer)localGetOffsetAtCoordinate.invoke(this, new Object[] {
                Integer.valueOf(i), Float.valueOf(f)
            })).intValue();
        }
        catch (Exception exception)
        {
            log.severe("Something weird happen in [getOffsetForPositionInWidget]");
            exception.printStackTrace();
            return -1;
        }
        return i;
    }

    private int getSpanEnd(ContactSpan contactspan)
    {
        return getText().getSpanEnd(contactspan);
    }

    private Rect getSpanPositionOnScreen(ContactSpan contactspan)
    {
        Layout layout = getLayout();
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 0;
        int i = getSpanStart(contactspan);
        int j = getSpanEnd(contactspan);
        float f = layout.getPrimaryHorizontal(i);
        float f1 = layout.getPrimaryHorizontal(j);
        contactspan = new Rect();
        layout.getLineBounds(layout.getLineForOffset(i), contactspan);
        i = (ai[1] - getScrollY()) + getCompoundPaddingTop();
        contactspan.top = ((Rect) (contactspan)).top + i;
        contactspan.bottom = ((Rect) (contactspan)).bottom + i;
        contactspan.left = (int)((float)((Rect) (contactspan)).left + (((float)ai[0] + f + (float)getCompoundPaddingLeft()) - (float)getScrollX()));
        contactspan.right = (int)(((float)((Rect) (contactspan)).left + f1) - f);
        return contactspan;
    }

    private int getSpanStart(ContactSpan contactspan)
    {
        return getText().getSpanStart(contactspan);
    }

    private int getWidgetWidth()
    {
        return getWidth() - (getPaddingLeft() + getPaddingRight());
    }

    private int putOffsetInRange(int i)
    {
        int j = i;
        Editable editable = getText();
        int i1 = editable.length();
        int k = i1;
        int j1 = i1 - 1;
        i1 = k;
        for (int l = j1; l >= 0 && editable.charAt(l) == ' '; l--)
        {
            i1--;
        }

        if (i >= i1)
        {
            return i;
        }
        for (Editable editable1 = getText(); j >= 0 && findText(editable1, j) == -1 && findSpan(j) == null; j--) { }
        return j;
    }

    private void scrollEditToBottom()
    {
        if (scrollView != null && builder != null)
        {
            scrollView.scrollBy(0, builder.a() * getLineCount());
        }
    }

    private ContactSpan selectSpan(ContactSpan contactspan, boolean flag)
    {
        boolean flag1 = false;
        int i = getSpanStart(contactspan);
        int j = getSpanEnd(contactspan);
        Editable editable = getText();
        selectedSpan = null;
        if (i == -1 || j == -1)
        {
            log.warning("The span doesn't exist or may be a span a user was editing");
            setSelection(editable.length());
            flag = true;
        } else
        {
            removeTextChangedListener(textWatcher);
            contacts.remove(contactspan.a());
            editable.removeSpan(contactspan);
            contactspan = addContact(contactspan.a(), i, j + 1, flag, false);
            addTextChangedListener(textWatcher);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = flag1;
            }
        }
        setCursorVisible(flag);
        requestFocus();
        return contactspan;
    }

    private void setActionModeCallbackIfNecessary()
    {
        setCustomSelectionActionModeCallback(new android.view.ActionMode.Callback() {

            final ParticipantsEditText a;

            public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
            {
                return false;
            }

            public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
            {
                return false;
            }

            public final void onDestroyActionMode(ActionMode actionmode)
            {
            }

            public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
            {
                return false;
            }

            
            {
                a = ParticipantsEditText.this;
                super();
            }
        });
    }

    private void setSpanSelected(ContactSpan contactspan)
    {
        selectedSpan = selectSpan(contactspan, true);
        sendAccessibilityEvent(4);
    }

    float _convertToLocalHorizontalCoordinate(float f)
    {
        f = Math.max(0.0F, f - (float)getTotalPaddingLeft());
        return Math.min(getWidth() - getTotalPaddingRight() - 1, f) + (float)getScrollX();
    }

    int _getLineAtCoordinate(float f)
    {
        f = Math.max(0.0F, f - (float)getTotalPaddingTop());
        f = Math.min(getHeight() - getTotalPaddingBottom() - 1, f);
        float f1 = getScrollY();
        return getLayout().getLineForVertical((int)(f + f1));
    }

    public void addContact(Contact contact)
    {
        removeTextChangedListener(textWatcher);
        Editable editable = getText();
        clearComposingText();
        if (editable.length() > 0)
        {
            replaceWithSpan(editable);
        }
        int i = editable.length();
        addContact(contact, i, i);
        setSelection(editable.length());
        addTextChangedListener(textWatcher);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (isPopupShowing())
            {
                ListView listview = getListView();
                if (listview != null)
                {
                    virtualAccessibilityNodeProvider.a(listview);
                    return (AccessibilityNodeProvider)virtualAccessibilityNodeProvider;
                }
            } else
            {
                virtualAccessibilityNodeProvider.a();
            }
        }
        return null;
    }

    public List getAddedContacts()
    {
        return new ArrayList(contacts);
    }

    public List getContacts()
    {
        ArrayList arraylist = new ArrayList(existingContacts.size() + contacts.size());
        arraylist.addAll(existingContacts);
        arraylist.addAll(contacts);
        return arraylist;
    }

    public CharSequence getContentDescription()
    {
        return accessibilityDecorator.a(getContext().getString(0x7f080050), true);
    }

    ContactSpan getLastSpan()
    {
        Object obj = null;
        ContactSpan acontactspan[] = getSortedSpans();
        ContactSpan contactspan = obj;
        if (acontactspan != null)
        {
            contactspan = obj;
            if (acontactspan.length > 0)
            {
                contactspan = acontactspan[acontactspan.length - 1];
            }
        }
        return contactspan;
    }

    public int getParticipantCount()
    {
        return contacts.size();
    }

    ContactSpan[] getSortedSpans()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList((ContactSpan[])getText().getSpans(0, getText().length(), com/skype/android/widget/ContactSpan)));
        Collections.sort(arraylist, new Comparator(getText()) {

            final Spannable a;
            final ParticipantsEditText b;

            public final int compare(Object obj, Object obj1)
            {
                obj = (ContactSpan)obj;
                obj1 = (ContactSpan)obj1;
                int i = a.getSpanStart(obj);
                int j = a.getSpanStart(obj1);
                if (i < j)
                {
                    return -1;
                }
                return i <= j ? 0 : 1;
            }

            
            {
                b = ParticipantsEditText.this;
                a = spannable;
                super();
            }
        });
        return (ContactSpan[])arraylist.toArray(new ContactSpan[arraylist.size()]);
    }

    public boolean hasContact(Contact contact)
    {
        return contacts.contains(contact);
    }

    public void init(ContactUtil contactutil, ContactSearchAdapter contactsearchadapter, ObjectIdMap objectidmap)
    {
        contactUtil = contactutil;
        adapter = contactsearchadapter;
        accessibilityUtil = new AccessibilityUtil(getContext());
        map = objectidmap;
        defaultSelectionColor = ViewUtil.a(this);
        scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setThreshold(1);
        setInputType(getInputType() | 0x80000);
        contactutil = getText();
        contactutil.setSpan(this, 0, contactutil.length(), 18);
        contactsearchadapter.setShowSections(false);
        setDropDownAnchor(0x7f100214);
        int i = getResources().getDimensionPixelSize(0x7f0c00c3);
        setDropDownWidth(getResources().getDisplayMetrics().widthPixels - i * 2);
        setDropDownHorizontalOffset(i);
        contactsearchadapter.setOnUserEventListener(0, this);
        setAdapter(contactsearchadapter);
        setTokenizer(tokenizer);
        setLongClickable(false);
        addTextChangedListener(textWatcher);
        contactutil = getClass().getSuperclass().getSuperclass();
        try
        {
            localGetLineAtCoordinate = contactutil.getDeclaredMethod("getLineAtCoordinate", new Class[] {
                Float.TYPE
            });
            localGetLineAtCoordinate.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (ContactSearchAdapter contactsearchadapter)
        {
            try
            {
                localGetLineAtCoordinate = getClass().getDeclaredMethod("_getLineAtCoordinate", new Class[] {
                    Float.TYPE
                });
            }
            // Misplaced declaration of an exception variable
            catch (ContactSearchAdapter contactsearchadapter)
            {
                contactsearchadapter.printStackTrace();
            }
        }
        try
        {
            localGetOffsetAtCoordinate = contactutil.getDeclaredMethod("getOffsetAtCoordinate", new Class[] {
                Integer.TYPE, Float.TYPE
            });
            localGetOffsetAtCoordinate.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (ContactSearchAdapter contactsearchadapter)
        {
            try
            {
                localGetOffsetAtCoordinate = getClass().getDeclaredMethod("_getOffsetAtCoordinate", new Class[] {
                    Integer.TYPE, Float.TYPE
                });
            }
            // Misplaced declaration of an exception variable
            catch (ContactSearchAdapter contactsearchadapter)
            {
                contactsearchadapter.printStackTrace();
            }
        }
        try
        {
            localConvertToLocalHorizontalCoordinate = contactutil.getDeclaredMethod("convertToLocalHorizontalCoordinate", new Class[] {
                Float.TYPE
            });
            localConvertToLocalHorizontalCoordinate.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (ContactUtil contactutil)
        {
            try
            {
                localConvertToLocalHorizontalCoordinate = getClass().getDeclaredMethod("_convertToLocalHorizontalCoordinate", new Class[] {
                    Float.TYPE
                });
            }
            // Misplaced declaration of an exception variable
            catch (ContactUtil contactutil)
            {
                contactutil.printStackTrace();
            }
        }
        setActionModeCallbackIfNecessary();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            try
            {
                autocompleteEditText_mPopup = android/widget/AutoCompleteTextView.getDeclaredField("mPopup");
                autocompleteEditText_mPopup.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (ContactUtil contactutil)
            {
                log.warning("Could not obtain field handle to mPopup");
            }
            virtualAccessibilityNodeProvider = new VirtualAccessibilityNodeProvider(this);
            return;
        } else
        {
            virtualAccessibilityNodeProvider = null;
            return;
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        int i = editorinfo.imeOptions & 0xff;
        if ((i & 6) != 0)
        {
            editorinfo.imeOptions = editorinfo.imeOptions ^ i;
            editorinfo.imeOptions = editorinfo.imeOptions | 6;
        }
        if ((editorinfo.imeOptions & 0x40000000) != 0)
        {
            editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        }
        return inputconnection;
    }

    public void onEditorAction(int i)
    {
        if (i == 6 && updater != null)
        {
            updater.onDone();
        }
    }

    public void onFilterComplete(int i)
    {
        super.onFilterComplete(i);
        if (i > 0)
        {
            if (virtualAccessibilityNodeProvider != null)
            {
                virtualAccessibilityNodeProvider.a();
            }
            accessibilityUtil.a(this, getContext().getString(0x7f080093, new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!TextUtils.isEmpty(getContentDescription()))
        {
            accessibilitynodeinfo.setText(getContentDescription());
        }
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        addContact((Contact)map.a(((ContactItem)obj).getContactObjectId(), com/skype/Contact));
        participantUpdater.onParticipantListChanged(getParticipantCount());
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 66 && getListSelection() == -1)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && selectedSpan != null)
        {
            clearSelectedSpan();
            return true;
        } else
        {
            return super.onKeyPreIme(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 66 && getListSelection() == -1 && !enoughToFilter() && updater != null)
        {
            updater.onDone();
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!TextUtils.isEmpty(getText()))
        {
            super.onRestoreInstanceState(null);
        } else
        {
            super.onRestoreInstanceState(parcelable);
            parcelable = getSortedSpans();
            int j = parcelable.length;
            for (int i = 0; i < j; i++)
            {
                ContactSpan contactspan = parcelable[i];
                contacts.add(contactspan.a());
            }

            if (parcelable.length > 0)
            {
                participantUpdater.onParticipantListChanged(getParticipantCount());
                return;
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        clearSelectedSpan();
        return super.onSaveInstanceState();
    }

    public void onSelectionChanged(int i, int j)
    {
        int k;
        int l;
        int i1;
        if (selectedSpan != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0) goto _L2; else goto _L1
_L1:
        k = getContext().getResources().getColor(0x106000d);
        i1 = j;
        l = i;
_L4:
        setHighlightColor(k);
        super.onSelectionChanged(l, i1);
        return;
_L2:
        int j1 = defaultSelectionColor;
        ContactSpan contactspan = getLastSpan();
        k = j1;
        l = i;
        i1 = j;
        if (contactspan != null)
        {
            k = j1;
            l = i;
            i1 = j;
            if (i < getText().getSpanEnd(contactspan) + 1)
            {
                i1 = Math.min(getText().length(), getText().getSpanEnd(contactspan) + 1);
                l = i1;
                setSelection(l);
                k = j1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSizeChanged(int i, int j, int k, int l)
    {
        if (scrollView != null) goto _L2; else goto _L1
_L1:
        ViewParent viewparent = getParent();
_L7:
        if (viewparent == null) goto _L2; else goto _L3
_L3:
        if (!(viewparent instanceof ScrollView)) goto _L5; else goto _L4
_L4:
        scrollView = (ScrollView)viewparent;
_L2:
        return;
_L5:
        viewparent = viewparent.getParent();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (isFocused()) goto _L2; else goto _L1
_L1:
        flag2 = super.onTouchEvent(motionevent);
_L4:
        return flag2;
_L2:
        boolean flag;
        int i;
        i = motionevent.getAction();
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        lastX = motionevent.getX();
        lastY = motionevent.getY();
        flag = flag1;
_L6:
        if (!flag)
        {
            return super.onTouchEvent(motionevent);
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i != 1) goto _L6; else goto _L5
_L5:
        float f;
        float f1;
        f = motionevent.getX();
        f1 = motionevent.getY();
        flag = flag1;
        if (Math.abs(f - lastX) >= scaledTouchSlop) goto _L6; else goto _L7
_L7:
        flag = flag1;
        if (Math.abs(f1 - lastY) >= scaledTouchSlop) goto _L6; else goto _L8
_L8:
        ContactSpan contactspan = findSpan(putOffsetInRange(getOffsetForPositionInWidget(f, f1)));
        if (contactspan == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        if (selectedSpan != null)
        {
            if (contactspan.c())
            {
                break MISSING_BLOCK_LABEL_179;
            }
            clearSelectedSpan();
        }
        setSpanSelected(contactspan);
_L9:
        flag = true;
          goto _L6
        if (clickedDeleteRegion(selectedSpan, f, f1))
        {
            removeSpan(getText(), selectedSpan, getSpanStart(selectedSpan), getSpanEnd(selectedSpan) + 1);
        }
        clearSelectedSpan();
          goto _L9
        flag = flag1;
        if (selectedSpan != null)
        {
            clearSelectedSpan();
            flag = true;
        }
          goto _L6
    }

    void removeSpan(Editable editable, ContactSpan contactspan, int i, int j)
    {
        editable.removeSpan(contactspan);
        editable.delete(i, j);
        contacts.remove(contactspan.a());
        adapter.setCurrentParticipants(getContacts());
        setCursorVisible(true);
        participantUpdater.onParticipantListChanged(getParticipantCount());
    }

    protected void replaceText(CharSequence charsequence)
    {
    }

    public void replaceWithSpan(Editable editable)
    {
        int i = 0;
        Object obj = getLastSpan();
        if (obj != null)
        {
            i = editable.getSpanEnd(obj);
        }
        int j = editable.length();
        if (contacts.size() == 0)
        {
            obj = "";
        } else
        {
            obj = " ";
        }
        editable.replace(i, j, ((CharSequence) (obj)));
    }

    public void setExistingContacts(List list)
    {
        existingContacts = list;
        adapter.setCurrentParticipants(getContacts());
        accessibilityDecorator = new AccessibilityEditTextDecorator(this);
    }

    public void setParticipantUpdater(ParticipantUpdater participantupdater)
    {
        participantUpdater = participantupdater;
    }

    public void setQueryUpdater(QueryStringUpdater querystringupdater)
    {
        updater = querystringupdater;
    }








}
