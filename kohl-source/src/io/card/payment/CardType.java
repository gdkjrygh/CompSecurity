// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package io.card.payment:
//            X, ao, an, m

public final class CardType extends Enum
{

    public static final CardType AMEX;
    public static final CardType DISCOVER;
    public static final CardType INSUFFICIENT_DIGITS;
    public static final CardType JCB;
    public static final CardType MASTERCARD;
    public static final CardType UNKNOWN;
    public static final CardType VISA;
    private static int a;
    private static HashMap b;
    private static final CardType c[];
    public final String name;

    private CardType(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    private static Pair a(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = s;
        }
        return new Pair(s, s2);
    }

    public static CardType fromCardNumber(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return UNKNOWN;
        }
        HashSet hashset = new HashSet();
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s1 = (String)((Pair)entry.getKey()).first;
                String s2 = (String)((Pair)entry.getKey()).second;
                int i = Math.min(s.length(), s1.length());
                int j = Math.min(s.length(), s2.length());
                boolean flag;
                if (Integer.parseInt(s.substring(0, i)) < Integer.parseInt(s1.substring(0, i)))
                {
                    flag = false;
                } else
                if (Integer.parseInt(s.substring(0, j)) > Integer.parseInt(s2.substring(0, j)))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    hashset.add(entry.getValue());
                }
            } else
            {
                if (hashset.size() > 1)
                {
                    return INSUFFICIENT_DIGITS;
                }
                if (hashset.size() == 1)
                {
                    return (CardType)hashset.iterator().next();
                }
                return UNKNOWN;
            }
        } while (true);
    }

    public static CardType fromString(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        CardType cardtype = UNKNOWN;
_L6:
        return cardtype;
_L2:
        CardType acardtype[];
        int i;
        int j;
        acardtype = values();
        j = acardtype.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        CardType cardtype1;
        cardtype1 = acardtype[i];
        if (cardtype1 == UNKNOWN || cardtype1 == INSUFFICIENT_DIGITS)
        {
            continue; /* Loop/switch isn't completed */
        }
        cardtype = cardtype1;
        if (s.equalsIgnoreCase(cardtype1.toString())) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return UNKNOWN;
    }

    public static CardType valueOf(String s)
    {
        return (CardType)Enum.valueOf(io/card/payment/CardType, s);
    }

    public static CardType[] values()
    {
        return (CardType[])c.clone();
    }

    public final int cvvLength()
    {
        switch (X.a[ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 4;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return 3;
        }
    }

    public final String getDisplayName(String s)
    {
        switch (X.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return an.a(ao.c, s);

        case 2: // '\002'
            return an.a(ao.d, s);

        case 3: // '\003'
            return an.a(ao.e, s);

        case 4: // '\004'
            return an.a(ao.f, s);

        case 5: // '\005'
            return an.a(ao.g, s);
        }
    }

    public final Bitmap imageBitmap(Context context)
    {
        Bitmap bitmap = null;
        X.a[ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 58
    //                   2 78
    //                   3 85
    //                   4 71
    //                   5 64;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        String s = null;
_L8:
        if (s != null)
        {
            bitmap = m.c(s, context);
        }
        return bitmap;
_L2:
        s = "iVBORw0KGgoAAAANSUhEUgAAAEgAAAAyCAYAAAD/VJ3gAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYxIDY0LjE0MDk0OSwgMjAxMC8xMi8wNy0xMDo1NzowMSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNS4xIE1hY2ludG9zaCIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpGREQxQkY4QzA3MEQxMUUxOTRFNjk0MTlGNkZCQkFDMSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpGREQxQkY4RDA3MEQxMUUxOTRFNjk0MTlGNkZCQkFDMSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkZERDFCRjhBMDcwRDExRTE5NEU2OTQxOUY2RkJCQUMxIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkZERDFCRjhCMDcwRDExRTE5NEU2OTQxOUY2RkJCQUMxIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+Fqh7EQAACxtJREFUeNrkW1ts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";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "iVBORw0KGgoAAAANSUhEUgAAAEgAAAAyCAYAAAD/VJ3gAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowOTgwMTE3NDA3MjA2ODExOTE1REU3RTY0REM3MTU3MCIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDozNzQyMkVBOEY5RDYxMUUwQjI1QUU3RTc3MTQ0RDE5NSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDozNzQyMkVBN0Y5RDYxMUUwQjI1QUU3RTc3MTQ0RDE5NSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M1IE1hY2ludG9zaCI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjNDM0UwMUNCNDMyMDY4MTE5MTA5QjFENDlFMzEyM0M1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjA5ODAxMTc0MDcyMDY4MTE5MTVERTdFNjREQzcxNTcwIi8+IDwvcmRmOkRlc2NyaXB0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";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "iVBORw0KGgoAAAANSUhEUgAAAEgAAAAyCAYAAAD/VJ3gAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowOTgwMTE3NDA3MjA2ODExOTE1REU3RTY0REM3MTU3MCIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDozNzQyMkVBNEY5RDYxMUUwQjI1QUU3RTc3MTQ0RDE5NSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDozNzQyMkVBM0Y5RDYxMUUwQjI1QUU3RTc3MTQ0RDE5NSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M1IE1hY2ludG9zaCI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjNDM0UwMUNCNDMyMDY4MTE5MTA5QjFENDlFMzEyM0M1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjA5ODAxMTc0MDcyMDY4MTE5MTVERTdFNjREQzcxNTcwIi8+IDwvcmRmOkRlc2NyaXB0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";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "iVBORw0KGgoAAAANSUhEUgAAAEgAAAAyCAYAAAD/VJ3gAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowMTgwMTE3NDA3MjA2ODExQjY3Q0ZEMEU5QUE4MjlCMiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoxMDA2NTFEOTRCOTcxMUUxQTlEMDlCNjEzNzkyRDg5RSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoxMDA2NTFEODRCOTcxMUUxQTlEMDlCNjEzNzkyRDg5RSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M1IE1hY2ludG9zaCI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjQ0NDIzMEI2MTkyMDY4MTFCNjdDRkQwRTlBQTgyOUIyIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjAxODAxMTc0MDcyMDY4MTFCNjdDRkQwRTlBQTgyOUIyIi8+IDwvcmRmOkRlc2NyaXB0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";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "iVBORw0KGgoAAAANSUhEUgAAAEgAAAAyCAYAAAD/VJ3gAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYxIDY0LjE0MDk0OSwgMjAxMC8xMi8wNy0xMDo1NzowMSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNS4xIE1hY2ludG9zaCIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpGREQxQkY5MDA3MEQxMUUxOTRFNjk0MTlGNkZCQkFDMSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpGREQxQkY5MTA3MEQxMUUxOTRFNjk0MTlGNkZCQkFDMSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkZERDFCRjhFMDcwRDExRTE5NEU2OTQxOUY2RkJCQUMxIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkZERDFCRjhGMDcwRDExRTE5NEU2OTQxOUY2RkJCQUMxIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+IZc78QAADsZJREFUeNrkW3mM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";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int numberLength()
    {
        switch (X.a[ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 15;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return 16;

        case 6: // '\006'
            return a;
        }
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        AMEX = new CardType("AMEX", 0, "AmEx");
        DISCOVER = new CardType("DISCOVER", 1, "Discover");
        JCB = new CardType("JCB", 2, "JCB");
        MASTERCARD = new CardType("MASTERCARD", 3, "MasterCard");
        VISA = new CardType("VISA", 4, "Visa");
        UNKNOWN = new CardType("UNKNOWN", 5, "Unknown");
        INSUFFICIENT_DIGITS = new CardType("INSUFFICIENT_DIGITS", 6, "More digits required");
        c = (new CardType[] {
            AMEX, DISCOVER, JCB, MASTERCARD, VISA, UNKNOWN, INSUFFICIENT_DIGITS
        });
        a = 1;
        Object obj = new HashMap();
        b = ((HashMap) (obj));
        ((HashMap) (obj)).put(a("34", null), AMEX);
        b.put(a("37", null), AMEX);
        b.put(a("3528", "3589"), JCB);
        b.put(a("4", null), VISA);
        b.put(a("51", "55"), MASTERCARD);
        b.put(a("6011", null), DISCOVER);
        b.put(a("622126", "622925"), DISCOVER);
        b.put(a("644", "649"), DISCOVER);
        b.put(a("65", null), DISCOVER);
        obj = b.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            a = Math.max(a, ((String)((Pair)entry.getKey()).first).length());
            if (((Pair)entry.getKey()).second != null)
            {
                a = Math.max(a, ((String)((Pair)entry.getKey()).second).length());
            }
        } while (true);
    }
}
