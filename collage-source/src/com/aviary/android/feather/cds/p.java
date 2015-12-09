// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.aviary.android.feather.cds.a.c;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.h;
import com.aviary.android.feather.common.utils.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService, h, j

public final class p
{

    static com.aviary.android.feather.common.a.a.c a;
    AviaryCdsService b;
    a.b c;
    NotificationManager d;
    Context e;
    android.support.v4.app.NotificationCompat.Builder f;

    p(AviaryCdsService aviarycdsservice, a.b b1)
    {
        b = aviarycdsservice;
        e = aviarycdsservice.getBaseContext();
        c = b1;
        d = (NotificationManager)e.getSystemService("notification");
    }

    public static android.support.v4.app.NotificationCompat.Builder a(Context context)
    {
        int i = h.a(context, "aviary_iap_notification_ok", "drawable");
        String s = h.b(context, "feather_iap_restore_all", "Restore All");
        String s1 = h.b(context, "feather_iap_restore_all_in_progress", "Restore All in Progress");
        return (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(i).setContentTitle(s).setContentText(s1).setTicker(s1).setProgress(100, 0, true).setContentIntent(b(context)).setOngoing(true);
    }

    private List a(ArrayList arraylist, String s, int i, int k)
    {
        a.c("onDownloadMissingIcons: %d", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        ArrayList arraylist1 = new ArrayList();
        int i1 = arraylist.size();
        double d2 = k - i;
        a.b("icons to be downloaded: %d", new Object[] {
            Integer.valueOf(i1)
        });
        arraylist = arraylist.iterator();
        double d1 = 0.0D;
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            m.a a1 = (m.a)arraylist.next();
            a.b("checking icon for %s", new Object[] {
                a1.a()
            });
            boolean flag;
            try
            {
                flag = b.a(e, s, false, a1);
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                flag = false;
            }
            catch (AssertionError assertionerror)
            {
                assertionerror.printStackTrace();
                flag = false;
            }
            if (!flag)
            {
                arraylist1.add(new AviaryCdsService.a(7, (new StringBuilder()).append("Failed to download icon for ").append(a1.f().f()).toString()));
                arraylist.remove();
            }
            a(100, (int)((d1 / (double)i1) * d2) + i, false);
            d1 = 1.0D + d1;
        } while (true);
        return arraylist1;
    }

    private List a(List list, int i, int k)
    {
        double d1;
        double d2;
        ArrayList arraylist;
        Iterator iterator;
        int i1;
        a.c("onDownloadPacks %d items", new Object[] {
            Integer.valueOf(list.size())
        });
        i1 = list.size();
        d2 = k - i;
        arraylist = new ArrayList();
        iterator = list.iterator();
        d1 = 0.0D;
_L2:
        String s;
        m.a a1;
        String s2;
        long l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (m.a)iterator.next();
        l1 = a1.p();
        s = null;
        s2 = a1.a();
        list = null;
        String s1 = com.aviary.android.feather.cds.h.a(e, l1, true);
        s = s1;
_L3:
        if (s == null)
        {
            a.d((new StringBuilder()).append("failed to start download for ").append(s2).toString());
            if (list != null)
            {
                arraylist.add(new AviaryCdsService.a(8, (new StringBuilder()).append("Failed to download ").append(s2).append(". ").append(list.toString()).toString()));
            } else
            {
                arraylist.add(new AviaryCdsService.a(8, (new StringBuilder()).append("Download failed for ").append(s2).toString()));
            }
            iterator.remove();
        } else
        {
            a.b("started download request for %s (result:%s)", new Object[] {
                a1.a(), s
            });
        }
        a(100, (int)((d1 / (double)i1) * d2) + i, false);
        l.a(1000L);
        d1 = 1.0D + d1;
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
        list;
          goto _L3
    }

    private void a(int i, int k, boolean flag)
    {
        f.setProgress(i, k, flag);
        d.notify(22322, f.build());
    }

    private void a(Context context, ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() == 0)
        {
            int i = h.a(context, "aviary_iap_notification_ok", "drawable");
            arraylist = h.b(context, "feather_notification_restore_all_completed", "Restore all completed");
            String s = h.b(context, "feather_notification_no_items_to_restore", "No item needs to be restored");
            context = (new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(arraylist).setContentText(s).setTicker(arraylist).setContentIntent(b(context)).setSmallIcon(i);
            d.notify(22322, context.build());
        }
    }

    private void a(Context context, ArrayList arraylist, List list)
    {
        a.c("onComplete: %d - %d", new Object[] {
            Integer.valueOf(arraylist.size()), Integer.valueOf(list.size())
        });
        d.cancel(22322);
        if (list.size() == 0)
        {
            a(context, arraylist);
        }
        a(context, list);
    }

    private void a(Context context, List list)
    {
        if (list == null || list.size() < 1)
        {
            return;
        }
        String s = h.b(context, "feather_notification_some_items_cant_be_restored", "Some items could not be restored");
        String s1 = h.b(context, "feather_please_try_again_later", "Please try again later");
        String s2 = h.b(context, "feather_notification_n_items_cant_be_restored", "%1$s items could not be restored");
        context = (new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(String.format(s2, new Object[] {
            Integer.valueOf(list.size())
        })).setContentText(s).setTicker(s).setSubText(s1).setAutoCancel(true).setContentIntent(b(context)).setLights(0xffff0000, 500, 1500).setVibrate(new long[] {
            0L, 100L, 200L, 300L
        }).setSmallIcon(0x1080078);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            android.support.v4.app.NotificationCompat.InboxStyle inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
            Iterator iterator = list.iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                inboxstyle.addLine(((AviaryCdsService.a)iterator.next()).getLocalizedMessage());
                i++;
            } while (i <= 2);
            if (list.size() > 3)
            {
                int k = list.size();
                inboxstyle.setSummaryText((new StringBuilder()).append("+").append(k - 3).append(" more").toString());
            }
            context.setStyle(inboxstyle);
        }
        d.notify(22334, context.build());
    }

    private void a(CharSequence charsequence, AviaryCdsService.a a1, CharSequence charsequence1, int i)
    {
        int k = 0;
        a.e("onProgressError: %s", new Object[] {
            a1
        });
        CharSequence charsequence2 = charsequence1;
        if (a1 != null)
        {
            if (a1.getMessage() != null)
            {
                charsequence1 = a1.getMessage();
            }
            k = a1.a();
            charsequence2 = charsequence1;
        }
        a(charsequence, charsequence2, i, k);
    }

    private void a(CharSequence charsequence, CharSequence charsequence1, int i, int k)
    {
        charsequence1 = (new android.support.v4.app.NotificationCompat.Builder(e)).setSmallIcon(0x1080078).setContentTitle(charsequence).setContentText(charsequence1).setTicker(charsequence);
        StringBuilder stringbuilder = (new StringBuilder()).append("Error code: ").append(i);
        if (k > 0)
        {
            charsequence = (new StringBuilder()).append(", Cause: ").append(k).toString();
        } else
        {
            charsequence = "";
        }
        charsequence = charsequence1.setSubText(stringbuilder.append(charsequence).toString()).setOngoing(false).setContentIntent(b(e)).build();
        d.cancel(22322);
        d.notify(22322, charsequence);
    }

    private static PendingIntent b(Context context)
    {
        return PendingIntent.getService(context, 0, new Intent(), 0);
    }

    private ArrayList c()
        throws AviaryCdsService.a
    {
        Object obj;
        Cursor cursor;
        ArrayList arraylist;
        a.b("acquireRestoreList");
        arraylist = new ArrayList();
        obj = new ArrayList();
        cursor = e.getContentResolver().query(h.b(e, (new StringBuilder()).append("pack/type/").append(c.a()).append("/content/restore/list").toString()), new String[] {
            "pack_id as _id", "pack_id", "pack_type", "pack_identifier", "content_id", "content_contentPath", "content_contentURL", "content_displayName", "content_iconPath", "content_iconUrl", 
            "content_isFree", "content_purchased", "content_packId", "content_numItems"
        }, null, null, "pack_id ASC");
        if (cursor == null) goto _L2; else goto _L1
_L1:
        a.b("cursor.size: %d", new Object[] {
            Integer.valueOf(cursor.getCount())
        });
_L9:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        m.a a1;
        h.a a2;
        a1 = com.aviary.android.feather.cds.m.a.a(cursor);
        a1.a(com.aviary.android.feather.cds.n.a.a(cursor));
        a2 = com.aviary.android.feather.cds.h.a(e, a1);
        a.b("%s (%s) = %s", new Object[] {
            a1.f().f(), a1.a(), a2
        });
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[h.a.values().length];
                try
                {
                    a[com.aviary.android.feather.cds.h.a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.h.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[h.a.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.aviary.android.feather.cds._cls1.a[a2.ordinal()];
        JVM INSTR tableswitch 1 3: default 453
    //                   1 320
    //                   2 337
    //                   3 337;
           goto _L5 _L6 _L7 _L7
_L6:
        ((ArrayList) (obj)).add(a1);
_L5:
        if (true) goto _L9; else goto _L8
_L8:
        obj;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw obj;
_L7:
        arraylist.add(a1);
          goto _L9
_L4:
        com.aviary.android.feather.common.utils.d.a(cursor);
        if (arraylist.size() > 0)
        {
            List list;
            try
            {
                list = b.g().a(arraylist);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                throw new AviaryCdsService.a(1, ((Throwable) (obj)));
            }
            if (list == null)
            {
                throw new AviaryCdsService.a(1, "Purchased Inventory is empty");
            } else
            {
                a.b("inventoryList: %s", new Object[] {
                    list
                });
                ((ArrayList) (obj)).addAll(list);
                return ((ArrayList) (obj));
            }
        } else
        {
            a.a("checkPackList is empty");
            return ((ArrayList) (obj));
        }
_L2:
        throw new AviaryCdsService.a(2, "Restore Cursor is null");
    }

    public void a()
    {
    }

    void b()
    {
        String s = h.b(e, "feather_iap_failed_download_informations", "Failed to download the required informations");
        String s1 = h.b(e, "feather_iap_restore_all_failed", "Restore All Failed");
        f = a(e);
        a(100, 0, true);
        l.a(500L);
        a.b(">> DownloadManifest");
        c c1;
        ArrayList arraylist;
        Object obj;
        try
        {
            c1 = b.f();
        }
        catch (AviaryCdsService.a a1)
        {
            a1.printStackTrace();
            a(s1, a1, s, 1);
            return;
        }
        a(100, 5, false);
        arraylist = new ArrayList();
        a.b(">> RestoreOwnedPacks");
        try
        {
            arraylist.addAll(b.a(c1, c.a()));
        }
        catch (AviaryCdsService.a a2)
        {
            a2.printStackTrace();
            a(s1, a2, s, 2);
            return;
        }
        a(100, 20, false);
        a.b(">> RestoreMissingPacks");
        obj = com.aviary.android.feather.cds.h.a(e);
        h.b(((List) (obj)), c.a());
        a.b("legacy packs filtered: %s", new Object[] {
            obj
        });
        if (obj != null)
        {
            arraylist.addAll(b.a(c1, ((List) (obj)).iterator()));
        }
        a(100, 35, false);
        a.b(">> AcquireRestoreList");
        try
        {
            obj = c();
        }
        catch (AviaryCdsService.a a3)
        {
            a(s1, a3, s, 4);
            return;
        }
        a(100, 40, false);
        a.b(">> DownloadMissingIcons");
        arraylist.addAll(a(((ArrayList) (obj)), c1.a(), 40, 70));
        a.b(">> DownloadAll");
        arraylist.addAll(a(((List) (obj)), 70, 100));
        a(e, ((ArrayList) (obj)), arraylist);
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/cds/p.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }
}
