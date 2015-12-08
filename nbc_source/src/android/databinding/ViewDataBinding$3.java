// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding

static final class akListener
    implements eateWeakListener
{

    public akListener create(ViewDataBinding viewdatabinding, int i)
    {
        return (new akMapListener(viewdatabinding, i)).getListener();
    }

    akListener()
    {
    }
}
