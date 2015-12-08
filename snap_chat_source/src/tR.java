// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.StorySnapTable;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public final class tR extends StorySnapTable
{

    private static tR a;

    private tR()
    {
        KH kh = new KH();
        Bt.a();
        uh.a();
        this(kh);
    }

    private tR(KH kh)
    {
        super(kh, KQ.MY_STORY_KEYS_AND_IVS);
    }

    public static tR a()
    {
        tR;
        JVM INSTR monitorenter ;
        tR tr;
        if (a == null)
        {
            a = new tR();
        }
        tr = a;
        tR;
        JVM INSTR monitorexit ;
        return tr;
        Exception exception;
        exception;
        throw exception;
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    protected final void a(List list)
    {
        Bj bj;
        Map map;
        map = uh.a(mDatabase);
        bj = Bj.a();
        List list1 = bj.mMyPostedStorySnapLogbooksForDatabase;
        list1;
        JVM INSTR monitorenter ;
        Iterator iterator;
        bj.mMyPostedStorySnapLogbooksForDatabase.clear();
        iterator = list.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Bk bk = (Bk)iterator.next();
        if (!bk.aG()) goto _L4; else goto _L3
_L3:
        Timber.c("StoryLibrary", "Not loading expired StorySnap from database %s", new Object[] {
            bk.toString()
        });
          goto _L5
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
_L4:
        String s = bk.mPostedStoryId;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        Timber.e("StoryLibrary", "Corrupted data. Story Snap should always have a story ID %s", new Object[] {
            bk
        });
          goto _L5
        StoryGroup storygroup = (StoryGroup)bj.mStories.get(s);
        if (storygroup != null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        storygroup = new StoryGroup(s);
        bj.mStories.put(s, storygroup);
        list = (Map)map.get(s);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_439;
        }
        Object obj = (List)list.get(bk.d());
        if (obj == null) goto _L7; else goto _L6
_L6:
        list = new SO();
        if (!((List) (obj)).isEmpty())
        {
            list.a(Integer.valueOf(((List) (obj)).size()));
            Iterator iterator1 = ((List) (obj)).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (((SR)iterator1.next()).b().booleanValue())
                {
                    list.b(Integer.valueOf(IJ.a(list.b()) + 1));
                }
            } while (true);
        }
_L9:
        list = new StorySnapLogbook(bk, ((List) (obj)), list);
        list.mStoryId = s;
        storygroup.i().add(list);
        bj.a(list);
          goto _L5
_L2:
        list1;
        JVM INSTR monitorexit ;
        list = bj.mStories;
        list;
        JVM INSTR monitorenter ;
        obj = bj.mStories.values().iterator();
_L8:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_426;
            }
            storygroup = (StoryGroup)((Iterator) (obj)).next();
            if ((storygroup instanceof AN) || storygroup.m() != 0)
            {
                break MISSING_BLOCK_LABEL_409;
            }
            ((Iterator) (obj)).remove();
        } while (true);
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        Collections.sort(storygroup.i(), new AW());
          goto _L8
        list;
        JVM INSTR monitorexit ;
        bj.m();
        return;
_L7:
        list = null;
          goto _L9
        list = null;
        obj = null;
          goto _L9
    }

    public final String c()
    {
        return "MyPostedStorySnapTable";
    }

    public final void c(Br br)
    {
        if (m() == null)
        {
            return;
        }
        i().lock();
        Object obj;
        Object obj1;
        mDatabase.beginTransaction();
        br = Bj.a().i();
        obj = new ArrayList();
        obj1 = br.iterator();
_L2:
        Bk bk;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            bk = ((StorySnapLogbook)((Iterator) (obj1)).next()).mStorySnap;
        } while (bk == null);
        ((List) (obj)).add(bk);
        if (true) goto _L2; else goto _L1
_L1:
        br;
        mDatabase.endTransaction();
        i().unlock();
        throw br;
        (new KH()).a(((List) (obj)), KQ.MY_STORY_KEYS_AND_IVS);
        j();
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (ReleaseManager.f())
        {
            Timber.c("MyPostedStorySnapTable", (new StringBuilder("saveToDatabase MyPostedStorySnapTable ")).append(((List) (obj)).size()).append(" item(s)").toString(), new Object[0]);
        }
        obj = ((List) (obj)).iterator();
_L4:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_228;
            }
            obj1 = a((Bk)((Iterator) (obj)).next());
        } while (obj1 == null);
        if (((ContentValues) (obj1)).size() <= 0) goto _L4; else goto _L3
_L3:
        mDatabase.insert("MyPostedStorySnapTable", null, ((ContentValues) (obj1)));
          goto _L4
        uh.a().a(mDatabase, br);
        mDatabase.setTransactionSuccessful();
        mDatabase.endTransaction();
        i().unlock();
        return;
    }
}
