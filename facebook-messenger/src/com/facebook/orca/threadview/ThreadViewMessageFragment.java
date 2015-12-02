// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.q;
import android.text.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.annotations.LoggedInUserKey;
import com.facebook.auth.annotations.ViewerContextUserId;
import com.facebook.base.fragment.FbFragment;
import com.facebook.c.s;
import com.facebook.common.e.h;
import com.facebook.common.w.n;
import com.facebook.debug.log.l;
import com.facebook.g;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.l.x;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.share.ShareMediaVideo;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.f;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.annotations.IsEmptyComposeLikeEnabled;
import com.facebook.orca.annotations.IsMmsSendPermitted;
import com.facebook.orca.annotations.IsSmsSendPermitted;
import com.facebook.orca.attachments.ImageAttachmentData;
import com.facebook.orca.common.ui.widgets.SlidingOutSuggestionView;
import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.compose.ap;
import com.facebook.orca.d.af;
import com.facebook.orca.d.m;
import com.facebook.orca.dialog.MenuDialogFragment;
import com.facebook.orca.dialog.MenuDialogItem;
import com.facebook.orca.dialog.e;
import com.facebook.orca.dialog.j;
import com.facebook.orca.f.p;
import com.facebook.orca.f.r;
import com.facebook.orca.messageview.MessageViewActivity;
import com.facebook.orca.mutators.DeleteMessagesDialogFragment;
import com.facebook.orca.mutators.ResendMessageDialogFragment;
import com.facebook.orca.notify.as;
import com.facebook.orca.p.b;
import com.facebook.orca.photos.view.PhotoViewActivity;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.a.c;
import com.facebook.user.Name;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserKey;
import com.facebook.widget.animatablelistview.d;
import com.facebook.widget.animatablelistview.k;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.listview.o;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threadview:
//            ac, s, ad, k, 
//            i, cy, j, ae, 
//            ai, ar, af, dm, 
//            dg, dh, RowReceiptParticipant, w, 
//            ak, cp, cx, cz, 
//            da, db, dc, dd, 
//            de, df

public class ThreadViewMessageFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/threadview/ThreadViewMessageFragment;
    private static final l b = new l();
    private Handler Z;
    private View aA;
    private com.facebook.orca.compose.av aB;
    private ar aC;
    private android.view.ViewTreeObserver.OnGlobalFocusChangeListener aD;
    private android.widget.AbsListView.OnScrollListener aE;
    private ThreadViewSpec aF;
    private ap aG;
    private com.facebook.common.w.q aH;
    private boolean aI;
    private b aJ;
    private x aK;
    private com.facebook.orca.p.d aL;
    private MessagesCollection aM;
    private ThreadSummary aN;
    private List aO;
    private String aP;
    private boolean aQ;
    private boolean aR;
    private com.facebook.zero.ui.l aS;
    private MenuDialogFragment aT;
    private e aU;
    private com.facebook.orca.photos.c.a aV;
    private c aW;
    private f aX;
    private Drawable aY;
    private Drawable aZ;
    private com.facebook.orca.attachments.a aa;
    private com.facebook.orca.share.a ab;
    private com.facebook.orca.common.ui.widgets.text.a ac;
    private p ad;
    private av ae;
    private m af;
    private af ag;
    private s ah;
    private a ai;
    private a aj;
    private a ak;
    private a al;
    private a am;
    private h an;
    private ViewGroup ao;
    private View ap;
    private BetterListView aq;
    private EmptyListViewItem ar;
    private ViewGroup as;
    private SlidingOutSuggestionView at;
    private SlidingOutSuggestionView au;
    private ImageView av;
    private ImageView aw;
    private w ax;
    private ak ay;
    private ComposeFragment az;
    private d c;
    private InputMethodManager d;
    private r e;
    private ClipboardManager f;
    private com.facebook.orca.threadview.k g;
    private com.facebook.widget.listview.l h;
    private com.facebook.orca.f.k i;

    public ThreadViewMessageFragment()
    {
        aF = ThreadViewSpec.a;
        aG = ap.SHRUNK;
        aK = x.a;
    }

    private void Y()
    {
        aS.a(p());
        aT = (MenuDialogFragment)p().a("message_menu_dialog");
        if (aT != null)
        {
            aT.a(aU);
        }
    }

    private ac Z()
    {
        ac ac1;
        if (c.isEmpty())
        {
            ac1 = null;
        } else
        {
            ac ac2 = (ac)c.getItem(0);
            ac1 = ac2;
            if (ac2 != com.facebook.orca.threadview.s.a)
            {
                ac1 = ac2;
                if (ac2 != com.facebook.orca.threadview.s.b)
                {
                    ac1 = ac2;
                    if (ac2 != com.facebook.orca.threadview.s.c)
                    {
                        return null;
                    }
                }
            }
        }
        return ac1;
    }

    static s a(ThreadViewMessageFragment threadviewmessagefragment)
    {
        return threadviewmessagefragment.ah;
    }

    public static ThreadViewMessageFragment a(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("chatStyle", flag);
        ThreadViewMessageFragment threadviewmessagefragment = new ThreadViewMessageFragment();
        threadviewmessagefragment.g(bundle);
        return threadviewmessagefragment;
    }

    private List a(MessagesCollection messagescollection, List list, ThreadSummary threadsummary, boolean flag)
    {
        Object obj;
        ArrayList arraylist;
        Object obj1;
        boolean flag1;
        arraylist = hq.a();
        obj = null;
        obj1 = (String)ai.b();
        obj1 = list.iterator();
        for (list = ((List) (obj)); ((Iterator) (obj1)).hasNext(); list = ((List) (obj)))
        {
            Message message = (Message)((Iterator) (obj1)).next();
            obj = new ad(message, aX, aa.b(message), aa.e(message));
            arraylist.add(obj);
            a(((ad) (list)), message);
        }

        obj = g.a(messagescollection, threadsummary);
        obj1 = messagescollection.b().iterator();
        flag1 = false;
_L9:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Message message1;
        com.facebook.orca.threadview.i i1;
        boolean flag2;
        message1 = (Message)((Iterator) (obj1)).next();
        i1 = (com.facebook.orca.threadview.i)((Map) (obj)).get(message1.d());
        messagescollection = null;
        flag2 = aX.b(message1);
        if (i1 == null || flag1 && flag2) goto _L4; else goto _L3
_L3:
        com.facebook.orca.threadview.cy.a[i1.d().ordinal()];
        JVM INSTR tableswitch 1 3: default 240
    //                   1 318
    //                   2 367
    //                   3 381;
           goto _L5 _L6 _L7 _L8
_L5:
        if (i1 != null && i1.d() != j.SENDER || flag2)
        {
            flag1 = true;
        }
        messagescollection = new ad(message1, aX, aa.b(message1), aa.e(message1), messagescollection);
        arraylist.add(messagescollection);
        a(((ad) (list)), message1);
        list = messagescollection;
          goto _L9
_L6:
        if (threadsummary.h())
        {
            messagescollection = com.facebook.orca.threadview.ae.a(i1.a(), message1, i1.e());
        } else
        {
            messagescollection = com.facebook.orca.threadview.ae.a(i1.a(), message1, flag2, threadsummary.j().size());
        }
          goto _L5
_L7:
        messagescollection = com.facebook.orca.threadview.ae.a(i1.b(), message1);
          goto _L5
_L8:
        messagescollection = com.facebook.orca.threadview.ae.b(i1.c(), message1);
          goto _L5
_L4:
        if (!flag2 || flag1)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        if (aX.a(message1) && aW.a)
        {
            messagescollection = com.facebook.orca.threadview.ae.a(message1);
        } else
        if (message1.u() == 901 && aW.c)
        {
            messagescollection = com.facebook.orca.threadview.ae.c(message1);
        } else
        {
            if (message1.u() != 0 || !aW.b)
            {
                break MISSING_BLOCK_LABEL_546;
            }
            messagescollection = com.facebook.orca.threadview.ae.b(message1);
        }
          goto _L5
_L2:
        if (flag && aK.c() && aJ.b())
        {
            arraylist.add(0, new ai(aJ.a()));
        }
        return arraylist;
        messagescollection = null;
          goto _L5
    }

    private void a(int i1, int j1, int k1)
    {
        if (!aI) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 != 0 || j1 <= 0 || k1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ac ac1 = (ac)c.getItem(0);
        if (ac1 != com.facebook.orca.threadview.s.b && ac1 != com.facebook.orca.threadview.s.a)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aC == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aC.a(false);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        af();
        return;
    }

    private void a(View view, View view1)
    {
        boolean flag;
        if (view1 != null)
        {
            view = view1.getParent();
        } else
        {
            view = null;
        }
_L3:
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (view != aA) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        if (flag)
        {
            d();
        }
        return;
_L2:
        view = view.getParent();
          goto _L3
        flag = false;
          goto _L4
    }

    private void a(x x1)
    {
        if (aK == x1)
        {
            return;
        } else
        {
            b(x1);
            return;
        }
    }

    private void a(Share share)
    {
        Object obj;
        ShareMedia sharemedia;
        sharemedia = ab.a(share);
        if (sharemedia != null)
        {
            obj = sharemedia.c();
        } else
        {
            obj = null;
        }
        if (!"link".equals(obj)) goto _L2; else goto _L1
_L1:
        b(new Intent("android.intent.action.VIEW", Uri.parse(sharemedia.a())));
_L4:
        return;
_L2:
        if ("photo".equals(obj))
        {
            share = aa.a(sharemedia);
            obj = new Intent(n(), com/facebook/orca/photos/view/PhotoViewActivity);
            ((Intent) (obj)).putExtra("imageData", share);
            ah.a(((Intent) (obj)), n());
            return;
        }
        if (!"video".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        share = sharemedia.f();
        if (share.b() == null) goto _L4; else goto _L3
_L3:
        share = Uri.parse(share.b().replaceAll("https://", "http://"));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(share, "video/*");
        b(intent);
        return;
        if (n.a(share.e())) goto _L4; else goto _L5
_L5:
        b(new Intent("android.intent.action.VIEW", Uri.parse(share.e())));
        return;
    }

    private void a(ap ap1)
    {
        az.a(ap1);
        aC.a(ap1);
        ao.requestLayout();
    }

    private void a(ThreadSummary threadsummary)
    {
        ThreadSummary threadsummary1 = aN;
        aN = threadsummary;
        if (threadsummary1 == null)
        {
            aa();
        }
    }

    private void a(ThreadSummary threadsummary, MessagesCollection messagescollection, List list)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (threadsummary != null)
        {
            flag = flag1;
            if (messagescollection != null)
            {
                flag = flag1;
                if (!messagescollection.e())
                {
                    Object obj = null;
                    threadsummary = obj;
                    if (list != null)
                    {
                        threadsummary = obj;
                        if (!list.isEmpty())
                        {
                            threadsummary = (Message)list.get(0);
                        }
                    }
                    messagescollection = messagescollection.c();
                    if (threadsummary != null && threadsummary.f() > messagescollection.f())
                    {
                        flag = flag1;
                    } else
                    {
                        threadsummary = messagescollection.i();
                        if (threadsummary != null && threadsummary.e() != null && !Objects.equal(threadsummary.e(), al.b()))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
        }
        az.b(flag);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, int i1, int j1, int k1)
    {
        threadviewmessagefragment.a(i1, j1, k1);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, Intent intent)
    {
        threadviewmessagefragment.b(intent);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, View view, View view1)
    {
        threadviewmessagefragment.a(view, view1);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, x x1)
    {
        threadviewmessagefragment.a(x1);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, Share share)
    {
        threadviewmessagefragment.a(share);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, ac ac1)
    {
        threadviewmessagefragment.b(ac1);
    }

    static void a(ThreadViewMessageFragment threadviewmessagefragment, boolean flag)
    {
        threadviewmessagefragment.b(flag);
    }

    private void a(ac ac1)
    {
        ac ac2 = Z();
        k k1 = c.a();
        if (ac2 == com.facebook.orca.threadview.s.a || ac2 == com.facebook.orca.threadview.s.b || ac2 == com.facebook.orca.threadview.s.c)
        {
            k1.a(0);
        }
        if (ac1 != null)
        {
            k1.a(0, ac1);
        }
        k1.b();
    }

    private void a(ad ad1)
    {
        Object obj = ad1.b();
        Intent intent = new Intent(n(), com/facebook/orca/messageview/MessageViewActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("thread_id", aF.d());
        intent.putExtra("message", ((Parcelable) (obj)));
        obj = ad1.d();
        if (obj != null && ((ae) (obj)).b() == af.GROUP_READ)
        {
            intent.putParcelableArrayListExtra("readers", hq.a(((ae) (obj)).c()));
        }
        if (!aN.h())
        {
            ad1 = f(c.c().indexOf(ad1));
            if (!ad1.isEmpty())
            {
                intent.putParcelableArrayListExtra("other_readers", ad1);
            }
        }
        ah.a(intent, n());
    }

    private void a(ad ad1, Message message)
    {
        if (ad1 != null)
        {
            ad1.a(a(0x36ee80L, ad1.b(), message));
        }
    }

    private void a(com.facebook.widget.listview.n n1)
    {
        if (n1.a() != o.BOTTOM) goto _L2; else goto _L1
_L1:
        ad();
_L4:
        af();
        return;
_L2:
        int i1 = 0;
        do
        {
            if (i1 < c.getCount())
            {
label0:
                {
                    long l1 = c.getItemId(i1);
                    Integer integer = (Integer)n1.b().get(Long.valueOf(l1));
                    if (integer == null)
                    {
                        break label0;
                    }
                    if (i1 > 0)
                    {
                        aq.setSelectionFromTop(i1, integer.intValue());
                    }
                }
            }
            if (true)
            {
                continue;
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(long l1, Message message, Message message1)
    {
        return message.f() - message1.f() > l1;
    }

    private boolean a(MenuDialogItem menudialogitem, Integer integer)
    {
        if (integer.intValue() < 0 || integer.intValue() >= c.getCount())
        {
            com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("onMenuItemSelected with invalid index: ").append(integer).toString());
            return true;
        }
        integer = ((Integer) (c.getItem(integer.intValue())));
        int i1 = menudialogitem.a();
        if (integer instanceof ad)
        {
            ad ad1 = (ad)integer;
            integer = ad1.b();
            if (i1 == 0)
            {
                ae.a((new cb("click")).f("context_menu_item").g("MENU_ITEM_COPY"));
                f.setText(integer.b());
                return true;
            }
            if (i1 == 1)
            {
                ae.a((new cb("click")).f("context_menu_item").g("MENU_ITEM_DELETE"));
                menudialogitem = new Bundle();
                menudialogitem.putString("thread_id", integer.e());
                menudialogitem.putStringArrayList("message_ids", hq.a(new String[] {
                    integer.d()
                }));
                integer = new DeleteMessagesDialogFragment();
                integer.g(menudialogitem);
                integer.a(p(), "delete_message_dialog_tag");
                return true;
            }
            if (i1 == 2)
            {
                ae.a((new cb("click")).f("context_menu_item").g("MENU_ITEM_DETAILS"));
                a(ad1);
                return true;
            }
            if (i1 == 3)
            {
                ae.a((new cb("click")).f("context_menu_item").g("MENU_ITEM_SAVE_IMAGE"));
                menudialogitem = (ImageAttachmentData)menudialogitem.d();
                aV.a(menudialogitem.b(), menudialogitem.f());
                return true;
            }
        }
        return false;
    }

    static boolean a(ThreadViewMessageFragment threadviewmessagefragment, MenuDialogItem menudialogitem, Integer integer)
    {
        return threadviewmessagefragment.a(menudialogitem, integer);
    }

    static boolean a(ThreadViewMessageFragment threadviewmessagefragment, ac ac1, Parcelable parcelable)
    {
        return threadviewmessagefragment.a(ac1, parcelable);
    }

    private boolean a(ac ac1, Parcelable parcelable)
    {
        if (ac1 instanceof ad)
        {
            Message message = ((ad)ac1).b();
            j j1 = new j();
            j1.a(com.facebook.o.message_context_menu_title);
            int i1 = c.c().indexOf(ac1);
            ac1 = new Bundle();
            ac1.putInt("message_position", i1);
            j1.a(ac1);
            if (message.a())
            {
                j1.a(new MenuDialogItem(0, com.facebook.o.message_context_menu_copy_message, null));
            }
            j1.a(new MenuDialogItem(1, com.facebook.o.message_context_menu_delete_message, null));
            if (message.c())
            {
                j1.a(new MenuDialogItem(2, com.facebook.o.message_context_menu_message_details, null));
            }
            if (parcelable != null && (parcelable instanceof ImageAttachmentData) && com.facebook.orca.photos.c.a.a())
            {
                ac1 = (ImageAttachmentData)parcelable;
                j1.a(new MenuDialogItem(3, com.facebook.o.message_context_menu_save_image, ac1));
            }
            aT = new MenuDialogFragment(j1.e());
            aT.a(aU);
            aT.a(p(), "message_menu_dialog");
            return true;
        } else
        {
            return false;
        }
    }

    private void aa()
    {
        if (aF.a())
        {
            com.facebook.orca.compose.MessageDraft messagedraft = null;
            String s1 = aF.d();
            if (ad.a(s1))
            {
                messagedraft = ad.b(s1);
            } else
            if (aN != null)
            {
                messagedraft = aN.z();
            }
            if (messagedraft != null)
            {
                az.a(messagedraft);
                return;
            }
        }
    }

    private void ab()
    {
        if (!aF.a())
        {
            return;
        } else
        {
            com.facebook.orca.compose.MessageDraft messagedraft = az.c();
            ad.a(aF.d(), messagedraft);
            return;
        }
    }

    private void ac()
    {
        if (az.Q() && !((Boolean)am.b()).booleanValue())
        {
            com.facebook.ui.d.a.a(n()).a(com.facebook.o.app_error_dialog_title).b(com.facebook.o.send_empty_message).a();
        } else
        {
            if (com.facebook.orca.threadview.dm.a(aF) && !az.P())
            {
                com.facebook.ui.d.a.a(n()).a(com.facebook.o.app_error_dialog_title).b(com.facebook.o.send_attachments_too_large).a();
                return;
            }
            Message message = az.O();
            e.a(message, "thread_view", aP);
            ad();
            az.R();
            az.T();
            if (aB != null)
            {
                aB.a();
                return;
            }
        }
    }

    private void ad()
    {
        int i1;
label0:
        {
            i1 = aq.getCount();
            if (i1 > 0)
            {
                int j1 = aq.getLastVisiblePosition();
                int k1 = aq.getChildCount();
                if (j1 < i1 - 1)
                {
                    if (j1 >= i1 - k1)
                    {
                        break label0;
                    }
                    aq.setSelection(i1 - 1);
                }
            }
            return;
        }
        aq.smoothScrollToPosition(i1 - 1);
    }

    private boolean ae()
    {
        es es1;
        if (!c.isEmpty())
        {
            if (!(es1 = c.d()).isEmpty())
            {
                return (ac)es1.get(es1.size() - 1) instanceof ai;
            }
        }
        return false;
    }

    private void af()
    {
        int i1 = 0;
        if (aR)
        {
            boolean flag;
            if (!W())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (aQ != flag)
            {
                aQ = flag;
                ImageView imageview = aw;
                if (!flag)
                {
                    i1 = 8;
                }
                imageview.setVisibility(i1);
                return;
            }
        }
    }

    private void ag()
    {
        if (ar == null)
        {
            return;
        }
        if (aF == null || !aF.b() || aF.e().b() == null || n.a(aF.e().b().getFirstName()))
        {
            ar.setMessage(o().getString(com.facebook.o.thread_no_updates));
            return;
        } else
        {
            ar.setMessage(o().getString(com.facebook.o.thread_no_messages_start_conversation, new Object[] {
                aF.e().b().getFirstName()
            }));
            return;
        }
    }

    static android.widget.AbsListView.OnScrollListener b(ThreadViewMessageFragment threadviewmessagefragment)
    {
        return threadviewmessagefragment.aE;
    }

    private void b(Intent intent)
    {
        Uri uri = intent.getData();
        boolean flag;
        if (uri != null && uri.getScheme().equals("tel"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            aS.a(com.facebook.zero.a.c.k, p(), intent);
            return;
        } else
        {
            ah.b(intent, n());
            return;
        }
    }

    private void b(x x1)
    {
        aK = x1;
        b(true);
    }

    static void b(ThreadViewMessageFragment threadviewmessagefragment, ac ac1)
    {
        threadviewmessagefragment.c(ac1);
    }

    private void b(ac ac1)
    {
        if (aG != ap.EXPANDED) goto _L2; else goto _L1
_L1:
        O();
_L4:
        return;
_L2:
        Message message;
        if (!(ac1 instanceof ad))
        {
            continue; /* Loop/switch isn't completed */
        }
        ac1 = (ad)ac1;
        message = ac1.b();
        if (!message.c()) goto _L4; else goto _L3
_L3:
        ae.a((new cb("click")).f("message").g(message.d()).b("threadid", message.e()));
        a(ac1);
        return;
        if (ac1 != com.facebook.orca.threadview.s.b && ac1 != com.facebook.orca.threadview.s.a) goto _L4; else goto _L5
_L5:
        aC.a(true);
        return;
    }

    private void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag3 = ae();
        boolean flag2;
        if (!flag3 && aK.c())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag3 || aK.c())
        {
            flag1 = false;
        }
        if (flag1 && flag)
        {
            aq.postDelayed(new dg(this), 1000L);
        } else
        if (flag2 || flag1)
        {
            List list = a(aM, aO, aN, false);
            (new dh(c, an)).a(flag2, hq.a(list), aJ.a());
            return;
        }
    }

    private void c(Bundle bundle)
    {
        aG = (ap)bundle.getSerializable("composeMode");
        aH = (com.facebook.common.w.q)bundle.getSerializable("canReplyTo");
        if (aG != ap.SHRUNK)
        {
            d();
        }
        if (bundle.containsKey("trigger"))
        {
            a(bundle.getString("trigger"));
        }
    }

    static void c(ThreadViewMessageFragment threadviewmessagefragment)
    {
        threadviewmessagefragment.ac();
    }

    private void c(ac ac1)
    {
        if (!(ac1 instanceof ad) || p().a("resend_dialog") != null)
        {
            return;
        } else
        {
            ResendMessageDialogFragment.a(((ad)ac1).b()).a(p(), "resend_dialog");
            return;
        }
    }

    private ArrayList f(int i1)
    {
        java.util.HashMap hashmap = ik.a();
        for (i1++; i1 < c.getCount(); i1++)
        {
            Object obj = c.getItem(i1);
            if (!(obj instanceof ad))
            {
                continue;
            }
            obj = (ad)obj;
            if (((ad) (obj)).d() != null && ((ad) (obj)).d().b() == af.GROUP_READ)
            {
                Iterator iterator = ((ad) (obj)).d().c().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    RowReceiptParticipant rowreceiptparticipant = (RowReceiptParticipant)iterator.next();
                    UserKey userkey1 = rowreceiptparticipant.a().e();
                    if (!hashmap.containsKey(userkey1))
                    {
                        hashmap.put(userkey1, rowreceiptparticipant.a());
                    }
                } while (true);
            }
            if (((ad) (obj)).b().u() != 0)
            {
                continue;
            }
            UserKey userkey = ((ad) (obj)).b().i().e();
            if (!hashmap.containsKey(userkey) && !Objects.equal(userkey, i.b()))
            {
                hashmap.put(userkey, ((ad) (obj)).b().i());
            }
        }

        return hq.a(hashmap.values());
    }

    public void A()
    {
        super.A();
        z().getViewTreeObserver().addOnGlobalFocusChangeListener(aD);
        ax.a();
        if (ay != null)
        {
            ay.a();
        }
    }

    public void B()
    {
        super.B();
        z().getViewTreeObserver().removeOnGlobalFocusChangeListener(aD);
        ab();
        Z.removeCallbacksAndMessages(null);
    }

    public void C()
    {
        super.C();
        aC = null;
    }

    public void O()
    {
        if (aH == com.facebook.common.w.q.NO || aG == ap.SHRUNK && aA.getVisibility() != 8)
        {
            return;
        } else
        {
            aA.setVisibility(0);
            a(ap.SHRUNK);
            aG = ap.SHRUNK;
            ap.requestFocus();
            d.hideSoftInputFromWindow(ap.getWindowToken(), 0);
            aq.setSelector(aY);
            as.setVisibility(0);
            return;
        }
    }

    void P()
    {
        aA.setVisibility(8);
        a(ap.SHRUNK);
        ap.requestFocus();
        d.hideSoftInputFromWindow(ap.getWindowToken(), 0);
        as.setVisibility(0);
    }

    public ComposeFragment Q()
    {
        return az;
    }

    public int R()
    {
        Rect rect = new Rect();
        ((ViewParent)z()).getChildVisibleRect(aA, rect, null);
        return aA.getTop();
    }

    public void T()
    {
        int i1 = 0;
        int j1 = aq.getFirstVisiblePosition();
        View view = aq.getChildAt(0);
        if (view != null)
        {
            i1 = view.getTop();
        }
        aq.setSelectionFromTop(j1, i1);
    }

    public void U()
    {
        a(com.facebook.orca.threadview.s.b);
        aI = true;
    }

    public void V()
    {
        if (c != null)
        {
            c.b();
        }
        if (az != null)
        {
            az.U();
        }
        aN = null;
        aM = null;
        aO = null;
        aF = ThreadViewSpec.a;
        aK = x.a;
        if (aJ != null)
        {
            aJ.a(null);
        }
    }

    public boolean W()
    {
        return aq.b();
    }

    public void X()
    {
        az.Y();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.orca_thread_view_messages_tab, viewgroup, false);
    }

    public void a()
    {
        b();
        aJ.a(false);
        az.V();
        ab();
        if (aG == ap.EXPANDED)
        {
            O();
        }
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        aE = onscrolllistener;
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, true);
    }

    public void a(ThreadViewSpec threadviewspec, boolean flag)
    {
        if (ThreadViewSpec.a(threadviewspec, aF))
        {
            return;
        }
        if (flag)
        {
            V();
        }
        aF = threadviewspec;
        if (ax != null)
        {
            ax.a(aF);
        }
        if (az != null)
        {
            az.a(aF);
        }
        ag();
    }

    public void a(com.facebook.orca.compose.av av1)
    {
        aB = av1;
        if (az != null)
        {
            az.a(av1);
        }
    }

    public void a(ar ar1)
    {
        aC = ar1;
    }

    public void a(cp cp1)
    {
        if (cp1.a != aN || cp1.b != aM || cp1.c != aO) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        com.facebook.widget.listview.n n1;
        Message message;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (aN == null || !Objects.equal(cp1.a.a(), aN.a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(cp1.a);
        aM = cp1.b;
        aO = cp1.c;
        a(aN, aM, aO);
        aJ.a(ac.a(aN));
        flag2 = com.facebook.orca.threadview.dm.a(aF);
        if (flag2 && aN != null && !aN.h())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!((Boolean)aj.b()).booleanValue() && flag2)
        {
            aH = com.facebook.common.w.q.NO;
        } else
        if (!((Boolean)ak.b()).booleanValue() && flag1)
        {
            aH = com.facebook.common.w.q.NO;
        } else
        if (aN != null)
        {
            if (aN.v())
            {
                cp1 = com.facebook.common.w.q.YES;
            } else
            {
                cp1 = com.facebook.common.w.q.NO;
            }
            aH = cp1;
        } else
        {
            aH = com.facebook.common.w.q.YES;
        }
        if (aH == com.facebook.common.w.q.YES && aA.getVisibility() == 8)
        {
            O();
        } else
        if (aH == com.facebook.common.w.q.NO && aA.getVisibility() != 8)
        {
            P();
        }
        n1 = h.c(aq);
        if (aN == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(aM, aO, aN, true);
        cp1 = ((cp) (obj));
        if (!aM.e())
        {
            cp1 = ((cp) (obj));
            if (!aM.d())
            {
                if (aI)
                {
                    ((List) (obj)).add(com.facebook.orca.threadview.s.b);
                    cp1 = ((cp) (obj));
                } else
                {
                    ((List) (obj)).add(com.facebook.orca.threadview.s.a);
                    cp1 = ((cp) (obj));
                }
            }
        }
        (new dh(c, an)).a(hq.a(cp1));
        aq.setEmptyView(ar);
        a(n1);
        aI = false;
        if (!flag) goto _L1; else goto _L3
_L3:
        aJ.a(true);
        b(aJ.c());
        return;
        if (aO == null) goto _L1; else goto _L4
_L4:
        cp1 = hq.a();
        obj = (String)ai.b();
        obj = aO.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            message = (Message)((Iterator) (obj)).next();
            cp1.add(new ad(message, aX, aa.b(message), aa.e(message)));
        }
        break MISSING_BLOCK_LABEL_292;
    }

    public void a(String s1)
    {
        aP = s1;
        if (az != null)
        {
            az.c(s1);
        }
    }

    public void b()
    {
        android.support.v4.app.Fragment fragment = p().a("resend_dialog");
        if (fragment instanceof DialogFragment)
        {
            ((DialogFragment)fragment).a();
        }
        fragment = p().a("message_menu_dialog");
        if (fragment instanceof DialogFragment)
        {
            ((DialogFragment)fragment).a();
        }
    }

    public void c()
    {
        a(com.facebook.orca.threadview.s.c);
    }

    public void c(boolean flag)
    {
        if (flag)
        {
            af.a();
            ag.b();
        }
    }

    public void d()
    {
        if (aH == com.facebook.common.w.q.NO)
        {
            return;
        } else
        {
            aA.setVisibility(0);
            a(ap.EXPANDED);
            aG = ap.EXPANDED;
            aq.setSelector(aZ);
            as.setVisibility(8);
            ad();
            return;
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Object obj = S();
        com.facebook.orca.threadview.s s1 = (com.facebook.orca.threadview.s)((t) (obj)).a(com/facebook/orca/threadview/s);
        d = (InputMethodManager)((t) (obj)).a(android/view/inputmethod/InputMethodManager);
        e = (r)((t) (obj)).a(com/facebook/orca/f/r);
        f = (ClipboardManager)((t) (obj)).a(android/text/ClipboardManager);
        g = (com.facebook.orca.threadview.k)((t) (obj)).a(com/facebook/orca/threadview/k);
        aJ = (b)((t) (obj)).a(com/facebook/orca/p/b);
        i = (com.facebook.orca.f.k)((t) (obj)).a(com/facebook/orca/f/k);
        aa = (com.facebook.orca.attachments.a)((t) (obj)).a(com/facebook/orca/attachments/a);
        ab = (com.facebook.orca.share.a)((t) (obj)).a(com/facebook/orca/share/a);
        ac = (com.facebook.orca.common.ui.widgets.text.a)((t) (obj)).a(com/facebook/orca/common/ui/widgets/text/a);
        ad = (p)((t) (obj)).a(com/facebook/orca/f/p);
        ai = ((t) (obj)).b(java/lang/String, com/facebook/auth/annotations/ViewerContextUserId);
        ae = (av)((t) (obj)).a(com/facebook/analytics/av);
        af = (m)((t) (obj)).a(com/facebook/orca/d/m);
        ag = (af)((t) (obj)).a(com/facebook/orca/d/af);
        ah = (s)((t) (obj)).a(com/facebook/c/s);
        aS = (com.facebook.zero.ui.l)((t) (obj)).a(com/facebook/zero/ui/l);
        aj = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsSendPermitted);
        ak = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsMmsSendPermitted);
        al = ((t) (obj)).b(com/facebook/user/UserKey, com/facebook/auth/annotations/LoggedInUserKey);
        am = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsEmptyComposeLikeEnabled);
        aV = (com.facebook.orca.photos.c.a)((t) (obj)).a(com/facebook/orca/photos/c/a);
        aW = ((com.facebook.orca.threadview.a.a)((t) (obj)).a(com/facebook/orca/threadview/a/a)).a();
        aX = (f)((t) (obj)).a(com/facebook/messages/model/threads/f);
        an = (h)((t) (obj)).a(com/facebook/common/e/h);
        ao = (ViewGroup)d(i.update_list_container);
        ap = d(i.create_dummy_focus_elt);
        aq = (BetterListView)d(i.messages_list);
        ar = (EmptyListViewItem)d(i.threadview_updates_empty_item);
        as = (ViewGroup)d(i.thread_view_suggestion_popovers);
        at = (SlidingOutSuggestionView)d(i.thread_view_mute_warning);
        au = (SlidingOutSuggestionView)d(i.thread_view_sms_upsell);
        av = (ImageView)d(i.messages_list_shadow_top);
        aw = (ImageView)d(i.messages_list_shadow_bottom);
        az = (ComposeFragment)q().a(i.messages_compose);
        if (aB != null)
        {
            az.a(aB);
        }
        aA = az.z();
        az.c(aP);
        aS.a(com.facebook.zero.a.c.k, a(com.facebook.o.zero_external_url_dialog_content), new cx(this));
        aU = new cz(this);
        s1.a(new da(this));
        aq.setOnItemClickListener(new db(this));
        c = new d(n(), s1);
        aq.setAdapter(c);
        aq.setDividerHeight(0);
        aq.setStackFromBottom(true);
        aq.setTranscriptMode(1);
        aq.setItemsCanFocus(true);
        aq.setOnScrollListener(new dc(this));
        aq.setEmptyView(ar);
        h = new com.facebook.widget.listview.l();
        com.facebook.widget.animatablelistview.l.a(aq, c);
        a(aq);
        aY = aq.getSelector();
        aZ = o().getDrawable(com.facebook.h.transparent_drawable);
        ag();
        if (aF.a() && com.facebook.orca.threadview.dm.a(aF))
        {
            ay = new ak((com.facebook.prefs.shared.d)((t) (obj)).a(com/facebook/prefs/shared/d), au);
        } else
        {
            au.setVisibility(8);
        }
        ax = new w((com.facebook.prefs.shared.d)((t) (obj)).a(com/facebook/prefs/shared/d), (as)((t) (obj)).a(com/facebook/orca/notify/as), at);
        ax.a(aF);
        aD = new dd(this);
        if (!aF.c())
        {
            az.a(aF);
        }
        az.a(ap.SHRUNK);
        az.a(new de(this));
        aL = new df(this);
        aJ.a(aL);
        Z = new Handler();
        obj = k();
        if (obj != null && ((Bundle) (obj)).getBoolean("chatStyle", false))
        {
            z().findViewById(i.message_list_container).setBackgroundDrawable(new ColorDrawable(o().getColor(com.facebook.f.chat_thread_view_message_background)));
            View view = z().findViewById(i.bottom_divider);
            view.getLayoutParams().height = o().getDimensionPixelSize(g.chat_thread_compose_divider_width);
            view.setBackgroundDrawable(new ColorDrawable(o().getColor(com.facebook.f.chat_thread_view_divider)));
            aR = true;
            av.setImageResource(com.facebook.h.orca_chat_thread_list_shadow_top);
            av.setVisibility(0);
            aw.setImageResource(com.facebook.h.orca_chat_thread_list_shadow_bottom);
            aw.setVisibility(0);
            s1.a(false);
        }
        if (bundle != null)
        {
            c(bundle);
        }
        Y();
    }

    public void e(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            aq.setOverScrollMode(i1);
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putSerializable("composeMode", aG);
        bundle.putSerializable("canReplyTo", aH);
        bundle.putSerializable("trigger", aP);
    }

    public void f()
    {
        super.f();
        aJ.a(true);
        b(aJ.c());
    }

    public void g()
    {
        super.g();
        aJ.a(false);
    }

}
