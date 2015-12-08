// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class tf
{

    final List a;
    final CB b;
    final StoryLoadingContext c;
    final AS d;
    final CB.a e;
    private final Br f;

    private tf(List list, Br br, CB cb, StoryLoadingContext storyloadingcontext, AS as)
    {
        e = new CB.a() {

            private tf a;

            public final void a(CB.b b1)
            {
                a.a(b1);
            }

            
            {
                a = tf.this;
                super();
            }
        };
        a = list;
        f = br;
        b = cb;
        c = storyloadingcontext;
        d = as;
    }

    public tf(List list, StoryLoadingContext storyloadingcontext)
    {
        this(((List) (new ArrayList(list))), Br.a(), new CB(), storyloadingcontext, AS.a());
    }

    protected final void a(CB.b b1)
    {
        Timber.c("StorySnapLoadTask", "Download for %s complete. Result:%s cachingException:%s", new Object[] {
            b1.c, b1.a, b1.b
        });
        List list = b1.c;
        List list1 = b1.d;
        pi pi1 = b1.a;
        Iterator iterator = list.iterator();
        boolean flag1 = false;
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bk bk = (Bk)iterator.next();
            if (pi1 != null && pi1.mResponseCode == 404 || pi1.c() && !list1.contains(bk.mMediaId))
            {
                bk.aI();
                bk.l();
            } else
            if (b1.a())
            {
                bk.n();
                if (bk.am() == 0)
                {
                    flag = true;
                } else
                {
                    flag1 = true;
                }
            } else
            {
                bk.l();
                if (bk.Z())
                {
                    bk.aI();
                }
            }
        } while (true);
        if (f != null)
        {
            if (flag)
            {
                f.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                    com.snapchat.android.database.table.DbTable.DatabaseTable.STORY_SNAP_IMAGE_FILES, com.snapchat.android.database.table.DbTable.DatabaseTable.MY_SNAP_IMAGE_FILES
                });
            }
            if (flag1)
            {
                f.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                    com.snapchat.android.database.table.DbTable.DatabaseTable.STORY_SNAP_VIDEO_FILES, com.snapchat.android.database.table.DbTable.DatabaseTable.MY_SNAP_VIDEO_FILES
                });
            }
        }
        a(list);
    }

    protected abstract void a(List list);
}
