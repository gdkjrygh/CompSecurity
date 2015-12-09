// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToFacebookRecipient;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToRecipient;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fvz
{

    public Context a;
    public fxr b;
    public String c;
    public String d;
    public Verified e;
    public CanSendToRecipient f;
    public CanSendToFacebookRecipient g;
    public Optional h;

    public fvz()
    {
        h = Optional.e();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof fvz))
            {
                return false;
            }
            obj = (fvz)obj;
            if (g != ((fvz) (obj)).g)
            {
                return false;
            }
            if (f != ((fvz) (obj)).f)
            {
                return false;
            }
            if (a == null ? ((fvz) (obj)).a != null : !a.equals(((fvz) (obj)).a))
            {
                return false;
            }
            if (h == null ? ((fvz) (obj)).h != null : !h.equals(((fvz) (obj)).h))
            {
                return false;
            }
            if (d == null ? ((fvz) (obj)).d != null : !d.equals(((fvz) (obj)).d))
            {
                return false;
            }
            if (b == null ? ((fvz) (obj)).b != null : !b.equals(((fvz) (obj)).b))
            {
                return false;
            }
            if (c == null ? ((fvz) (obj)).c != null : !c.equals(((fvz) (obj)).c))
            {
                return false;
            }
            if (e == null ? ((fvz) (obj)).e != null : !e.equals(((fvz) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        } else
        {
            k = 0;
        }
        if (d != null)
        {
            l = d.hashCode();
        } else
        {
            l = 0;
        }
        if (e != null)
        {
            i1 = e.hashCode();
        } else
        {
            i1 = 0;
        }
        if (f != null)
        {
            j1 = f.hashCode();
        } else
        {
            j1 = 0;
        }
        if (g != null)
        {
            k1 = g.hashCode();
        } else
        {
            k1 = 0;
        }
        if (h != null)
        {
            l1 = h.hashCode();
        }
        return (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l1;
    }
}
