// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.text.Editable;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import com.snapchat.android.Timber;
import java.util.Locale;
import java.util.Vector;
import org.xml.sax.XMLReader;

public final class HtmlTagHandler
    implements android.text.Html.TagHandler
{
    public static final class Tag extends Enum
    {

        private static final Tag $VALUES[];
        public static final Tag LI;
        public static final Tag OL;
        public static final Tag UL;
        public static final Tag UNKNOWN;

        public static Tag fromValue(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                return UNKNOWN;
            }
            Tag tag;
            try
            {
                tag = valueOf(s.toUpperCase(Locale.US));
            }
            catch (Exception exception)
            {
                Timber.e("HtmlTagHandler", (new StringBuilder("Failed to convert ")).append(s).append(" into Tag. ").append(exception).toString(), new Object[0]);
                return UNKNOWN;
            }
            return tag;
        }

        public static Tag valueOf(String s)
        {
            return (Tag)Enum.valueOf(com/snapchat/android/util/HtmlTagHandler$Tag, s);
        }

        public static Tag[] values()
        {
            return (Tag[])$VALUES.clone();
        }

        static 
        {
            UL = new Tag("UL", 0);
            OL = new Tag("OL", 1);
            LI = new Tag("LI", 2);
            UNKNOWN = new Tag("UNKNOWN", 3);
            $VALUES = (new Tag[] {
                UL, OL, LI, UNKNOWN
            });
        }

        private Tag(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int LIST_ITEM_INDENT = 16;
    private static final String NEW_LINE_DELIMITER = "\n";
    private static final String ORDERED_LIST_INDEX_TRAILER = ". ";
    private static final String TAG = "HtmlTagHandler";
    private int mListItemCount;
    private final Vector mListParents;

    public HtmlTagHandler()
    {
        this(new Vector());
    }

    private HtmlTagHandler(Vector vector)
    {
        mListItemCount = 0;
        mListParents = vector;
    }

    public final void handleTag(boolean flag, String s, Editable editable, XMLReader xmlreader)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$util$HtmlTagHandler$Tag[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$HtmlTagHandler$Tag = new int[Tag.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$HtmlTagHandler$Tag[Tag.UL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$HtmlTagHandler$Tag[Tag.OL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$HtmlTagHandler$Tag[Tag.LI.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.util.HtmlTagHandler.Tag[Tag.fromValue(s).ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 37
    //                   3 68;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (flag)
        {
            mListParents.add(s);
        } else
        {
            mListParents.remove(s);
        }
        mListItemCount = 0;
        return;
_L3:
        if (!flag)
        {
            s = (String)mListParents.lastElement();
            switch (_cls1..SwitchMap.com.snapchat.android.util.HtmlTagHandler.Tag[Tag.fromValue(s).ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                editable.append("\n");
                s = editable.toString().split("\n");
                int k = s.length;
                int i = editable.length();
                k = s[k - 1].length();
                editable.setSpan(new BulletSpan(mListParents.size() * 16), i - k - 1, editable.length(), 0);
                return;

            case 2: // '\002'
                mListItemCount = mListItemCount + 1;
                break;
            }
            editable.append("\n");
            s = editable.toString().split("\n");
            int j = s.length;
            j = editable.length() - s[j - 1].length() - 1;
            editable.insert(j, (new StringBuilder()).append(mListItemCount).append(". ").toString());
            editable.setSpan(new android.text.style.LeadingMarginSpan.Standard(mListParents.size() * 16), j, editable.length(), 0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
