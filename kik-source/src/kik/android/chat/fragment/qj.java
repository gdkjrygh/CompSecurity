// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.Iterator;
import java.util.List;
import kik.a.d.f;
import kik.a.e.i;
import kik.android.util.bf;

// Referenced classes of package kik.android.chat.fragment:
//            MissedConversationsFragment

final class qj extends bf
{

    final MissedConversationsFragment a;

    qj(MissedConversationsFragment missedconversationsfragment)
    {
        a = missedconversationsfragment;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        f f1;
        for (aobj = a.a.B().iterator(); ((Iterator) (aobj)).hasNext(); a.a.b(f1.b()))
        {
            f1 = (f)((Iterator) (aobj)).next();
        }

        f f2;
        for (aobj = a.a.C().iterator(); ((Iterator) (aobj)).hasNext(); a.a.b(f2.b()))
        {
            f2 = (f)((Iterator) (aobj)).next();
        }

        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        a.J();
    }
}
