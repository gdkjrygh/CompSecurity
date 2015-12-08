// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.webview.action.WebActionType;

public final class gjr
{

    public static final gjs a = new gju();

    gjr()
    {
    }

    public static gjs a(Context context, WebActionType webactiontype, Flags flags)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[WebActionType.values().length];
                try
                {
                    a[WebActionType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[WebActionType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[WebActionType.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[WebActionType.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[WebActionType.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[webactiontype.ordinal()])
        {
        default:
            Assertion.a("Action type not registered");
            return a;

        case 1: // '\001'
            return new gjw(context, flags);

        case 2: // '\002'
            return new gjv(context);

        case 3: // '\003'
            return new gjx(context, flags);

        case 4: // '\004'
            Assertion.a("CLOSE action type not supported or not registered.");
            return a;

        case 5: // '\005'
            Assertion.a("NO_MATCH action type not supported.");
            break;
        }
        return a;
    }

}
