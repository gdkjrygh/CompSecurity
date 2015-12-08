// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ies extends fud
{

    private final iet c;
    private Bundle d;
    private ied e;

    public ies(am am, opd opd, int i, iet iet1)
    {
        super(am, opd, i);
        c = iet1;
    }

    public final ei a(int i, Bundle bundle)
    {
        Object obj;
        ied ied1;
        int j;
        boolean flag;
        i = 1;
        boolean flag1 = true;
        j = bundle.getInt("account_id");
        obj = bundle.getParcelableArrayList("com.google.android.apps.photos.share.mediaList");
        bundle = (dhx)bundle.getParcelable("com.google.android.apps.photos.share.ShareMethodConstraints");
        ied1 = e;
        if (((dhx) (bundle)).a || ((dhx) (bundle)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "At-least one sharing method must be allowed");
        if (((dhx) (bundle)).a || !((dhx) (bundle)).b) goto _L2; else goto _L1
_L1:
        if (j != -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Can't share by link when logged out");
        bundle = Collections.singletonList(ied.a);
_L3:
        return new ien(b, bundle, j);
_L2:
        Object obj1;
        Iterator iterator;
        if (!((List) (obj)).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaList must not be empty");
        if (((List) (obj)).size() == 1)
        {
            bundle = "android.intent.action.SEND";
        } else
        {
            bundle = "android.intent.action.SEND_MULTIPLE";
        }
        obj1 = new ejx();
        iterator = ((Collection) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = ejv.a(((ekp)iterator.next()).c());
            if (ejv.a(s) || ejv.b(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "Content type must a subtype of either image or video.");
            if (((ejx) (obj1)).a == null)
            {
                obj1.a = s;
            } else
            if (((ejx) (obj1)).a != "*/*" && !((ejx) (obj1)).a.equals(s))
            {
                if (ejv.a(((ejx) (obj1)).a))
                {
                    if (ejv.a(s))
                    {
                        obj1.a = "image/*";
                    } else
                    {
                        obj1.a = "*/*";
                    }
                } else
                if (ejv.a(s))
                {
                    obj1.a = "*/*";
                } else
                {
                    obj1.a = "video/*";
                }
            }
        } while (true);
        if (((ejx) (obj1)).a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must add one or more content types to the builder.");
        obj1 = ied.a(bundle, ((ejx) (obj1)).a);
        bundle = new ArrayList(3);
        bundle.add(obj1);
        if (j == -1)
        {
            flag = false;
        } else
        {
label0:
            {
                if (((List) (obj)).size() != 1)
                {
                    break label0;
                }
                gfn gfn1 = (gfn)((ekp)((List) (obj)).get(0)).b(gfn);
                if (gfn1 == null || !gfn1.g() || !ied1.c.a())
                {
                    break label0;
                }
                flag = ied1.d.a(gfx.a, j);
            }
        }
_L4:
        if (flag)
        {
            bundle.add(ied.a);
        }
        if (((List) (obj)).size() != 1)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        obj = (hdv)((ekp)((List) (obj)).get(0)).b(hdv);
        if (obj == null || !((hdv) (obj)).m())
        {
            break MISSING_BLOCK_LABEL_578;
        }
_L5:
        if (i != 0)
        {
            bundle.add(ied.b);
        }
          goto _L3
        flag = true;
          goto _L4
        i = 0;
          goto _L5
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        super.a(context, olm1, bundle);
        e = (ied)olm1.a(ied);
    }

    void a(Bundle bundle)
    {
        if (b.a(bundle, d))
        {
            b(bundle);
            return;
        } else
        {
            d = bundle;
            c(bundle);
            return;
        }
    }

    public final void a(ei ei, Object obj)
    {
        ei = (List)obj;
        c.a(ei);
    }
}
