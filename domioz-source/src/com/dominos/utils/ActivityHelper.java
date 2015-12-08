// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.Toast;
import com.dominos.App;
import com.dominos.activities.BaseActivity;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.dialogs.GeneralAlertDialog;
import com.dominos.dialogs.GeneralAlertDialog_;
import com.dominos.fragments.AlertDialogFragment;
import com.dominos.fragments.AlertDialogFragment_;
import com.dominos.fragments.OptionAlertFragment;
import com.dominos.fragments.OptionAlertFragment_;
import java.util.List;

// Referenced classes of package com.dominos.utils:
//            AlertType

public class ActivityHelper
{

    private static final String ALERT_DIALOG_TAG = "AlertDialogFragment";
    private static final String DISCONTINUED_ALERT_DIALOG_TAG = "DiscontinueDialogFragment";
    private static final String LOG_TAG = com/dominos/utils/ActivityHelper.getSimpleName();
    private static final String MULTI_OPTION_DIALOG = "MultiOptionButtonDialogFragment";
    BaseActivity mActivity;
    private Toast mToast;

    public ActivityHelper()
    {
    }

    private String getString(int i)
    {
        return mActivity.getString(i);
    }

    private String getString(int i, String s)
    {
        return mActivity.getString(i, new Object[] {
            s
        });
    }

    public void showAlert(AlertType alerttype)
    {
        showAlert(alerttype, null, null, null, null);
    }

    public void showAlert(AlertType alerttype, AlertActionCallback alertactioncallback)
    {
        showAlert(alerttype, null, null, null, alertactioncallback);
    }

    public void showAlert(AlertType alerttype, String s, AlertActionCallback alertactioncallback)
    {
        showAlert(alerttype, s, null, null, alertactioncallback);
    }

    public void showAlert(AlertType alerttype, String s, String s1, String as[], AlertActionCallback alertactioncallback)
    {
        Object obj;
        Object obj1;
        obj = getString(0x7f0800b9);
        obj1 = null;
        _cls5..SwitchMap.com.dominos.utils.AlertType[alerttype.ordinal()];
        JVM INSTR tableswitch 1 106: default 456
    //                   1 457
    //                   2 488
    //                   3 512
    //                   4 536
    //                   5 560
    //                   6 573
    //                   7 586
    //                   8 603
    //                   9 620
    //                   10 637
    //                   11 654
    //                   12 671
    //                   13 688
    //                   14 705
    //                   15 722
    //                   16 739
    //                   17 756
    //                   18 773
    //                   19 843
    //                   20 860
    //                   21 877
    //                   22 894
    //                   23 911
    //                   24 928
    //                   25 945
    //                   26 962
    //                   27 979
    //                   28 992
    //                   29 1016
    //                   30 1033
    //                   31 1050
    //                   32 1067
    //                   33 1084
    //                   34 1101
    //                   35 1122
    //                   36 1139
    //                   37 1152
    //                   38 1165
    //                   39 1178
    //                   40 1199
    //                   41 1220
    //                   42 1241
    //                   43 1262
    //                   44 1283
    //                   45 1300
    //                   46 1324
    //                   47 1337
    //                   48 1350
    //                   49 1367
    //                   50 1388
    //                   51 1410
    //                   52 1431
    //                   53 1445
    //                   54 1453
    //                   55 1466
    //                   56 1483
    //                   57 1500
    //                   58 1513
    //                   59 1526
    //                   60 1539
    //                   61 1552
    //                   62 1565
    //                   63 1578
    //                   64 1591
    //                   65 1604
    //                   66 1617
    //                   67 1643
    //                   68 1656
    //                   69 1669
    //                   70 1683
    //                   71 1697
    //                   72 1710
    //                   73 1723
    //                   74 1736
    //                   75 1749
    //                   76 1770
    //                   77 1787
    //                   78 1804
    //                   79 1821
    //                   80 1838
    //                   81 1855
    //                   82 1872
    //                   83 1888
    //                   84 1896
    //                   85 1904
    //                   86 1925
    //                   87 1941
    //                   88 1957
    //                   89 1974
    //                   90 1991
    //                   91 2008
    //                   92 2025
    //                   93 2042
    //                   94 2066
    //                   95 2082
    //                   96 2095
    //                   97 2108
    //                   98 2121
    //                   99 2134
    //                   100 2147
    //                   101 2160
    //                   102 2173
    //                   103 2186
    //                   104 2199
    //                   105 2212
    //                   106 2226;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99 _L100 _L101 _L102 _L103 _L104 _L105 _L106 _L107
_L1:
        return;
_L2:
        obj = getString(0x7f0802da);
        alerttype = getString(0x7f0802d9, s);
        s = ((String) (obj));
_L109:
        showAlert(s, ((String) (alerttype)), s1, as, alertactioncallback);
        return;
_L3:
        alerttype = getString(0x7f0802da);
        obj = getString(0x7f0802d7, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L4:
        alerttype = getString(0x7f080443);
        obj = getString(0x7f0802d9, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L5:
        alerttype = getString(0x7f0802c5);
        obj = getString(0x7f0802c6, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L6:
        alerttype = getString(0x7f0801de);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L7:
        alerttype = getString(0x7f0801de);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L8:
        s = getString(0x7f0800bb);
        alerttype = getString(0x7f080089);
        continue; /* Loop/switch isn't completed */
_L9:
        s = getString(0x7f0800bb);
        alerttype = getString(0x7f0800f6);
        continue; /* Loop/switch isn't completed */
_L10:
        s = getString(0x7f08039a);
        alerttype = getString(0x7f080399);
        continue; /* Loop/switch isn't completed */
_L11:
        s = getString(0x7f080114);
        alerttype = getString(0x7f0801d2);
        continue; /* Loop/switch isn't completed */
_L12:
        s = getString(0x7f0802ca);
        alerttype = getString(0x7f0802cb);
        continue; /* Loop/switch isn't completed */
_L13:
        s = getString(0x7f0801da);
        alerttype = getString(0x7f08008a);
        continue; /* Loop/switch isn't completed */
_L14:
        s = getString(0x7f08038d);
        alerttype = getString(0x7f080389);
        continue; /* Loop/switch isn't completed */
_L15:
        s = getString(0x7f0800ce);
        alerttype = getString(0x7f0800cd);
        continue; /* Loop/switch isn't completed */
_L16:
        s = getString(0x7f0800d8);
        alerttype = getString(0x7f0800d7);
        continue; /* Loop/switch isn't completed */
_L17:
        s = getString(0x7f0800da);
        alerttype = getString(0x7f0800d9);
        continue; /* Loop/switch isn't completed */
_L18:
        s = getString(0x7f0800d4);
        alerttype = getString(0x7f0800d3);
        continue; /* Loop/switch isn't completed */
_L19:
        alerttype = getString(0x7f0800cc);
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(getString(0x7f0800ca));
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append(" ");
        ((StringBuilder) (obj)).append(getString(0x7f0800cb));
        obj = ((StringBuilder) (obj)).toString();
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L20:
        s = getString(0x7f0800d2);
        alerttype = getString(0x7f0800d1);
        continue; /* Loop/switch isn't completed */
_L21:
        s = getString(0x7f0800db);
        alerttype = getString(0x7f080060);
        continue; /* Loop/switch isn't completed */
_L22:
        s = getString(0x7f0800db);
        alerttype = getString(0x7f0802fb);
        continue; /* Loop/switch isn't completed */
_L23:
        s = getString(0x7f080201);
        alerttype = getString(0x7f080200);
        continue; /* Loop/switch isn't completed */
_L24:
        s = getString(0x7f080303);
        alerttype = getString(0x7f080302);
        continue; /* Loop/switch isn't completed */
_L25:
        s = getString(0x7f08019a);
        alerttype = getString(0x7f08019b);
        continue; /* Loop/switch isn't completed */
_L26:
        s = getString(0x7f08011d);
        alerttype = getString(0x7f08011b);
        continue; /* Loop/switch isn't completed */
_L27:
        s = getString(0x7f0802a3);
        alerttype = getString(0x7f0802a2);
        continue; /* Loop/switch isn't completed */
_L28:
        alerttype = getString(0x7f080255);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L29:
        alerttype = getString(0x7f080255);
        obj = getString(0x7f080347, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L30:
        s = getString(0x7f0801ca);
        alerttype = getString(0x7f0801c3);
        continue; /* Loop/switch isn't completed */
_L31:
        s = getString(0x7f0801ca);
        alerttype = getString(0x7f0801c6);
        continue; /* Loop/switch isn't completed */
_L32:
        s = getString(0x7f080451);
        alerttype = getString(0x7f080450);
        continue; /* Loop/switch isn't completed */
_L33:
        s = getString(0x7f080127);
        alerttype = getString(0x7f080247);
        continue; /* Loop/switch isn't completed */
_L34:
        s = getString(0x7f0801dc);
        alerttype = getString(0x7f0801db);
        continue; /* Loop/switch isn't completed */
_L35:
        showScrollableAlert(getString(0x7f08026b), getString(0x7f08026a), as, alertactioncallback);
        return;
_L36:
        s = getString(0x7f08012c);
        alerttype = getString(0x7f08005f);
        continue; /* Loop/switch isn't completed */
_L37:
        s = getString(0x7f080178);
        alerttype = obj1;
        continue; /* Loop/switch isn't completed */
_L38:
        s = getString(0x7f080176);
        alerttype = obj1;
        continue; /* Loop/switch isn't completed */
_L39:
        alerttype = getString(0x7f0802b7);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L40:
        showScrollableAlert(getString(0x7f0800e4), getString(0x7f0800e3), as, alertactioncallback);
        return;
_L41:
        showScrollableAlert(getString(0x7f080109), getString(0x7f080108), as, alertactioncallback);
        return;
_L42:
        showScrollableAlert(getString(0x7f0800e8), getString(0x7f08029b), as, alertactioncallback);
        return;
_L43:
        showScrollableAlert(getString(0x7f080142), getString(0x7f0803b2), as, alertactioncallback);
        return;
_L44:
        showScrollableAlert(getString(0x7f080142), getString(0x7f08014a), as, alertactioncallback);
        return;
_L45:
        showScrollableAlert(((String) (obj)), getString(0x7f080388), as, alertactioncallback);
        return;
_L46:
        alerttype = getString(0x7f080206);
        obj = getString(0x7f080205, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L47:
        alerttype = getString(0x7f08011e);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L48:
        alerttype = getString(0x7f0802fc);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L49:
        s = getString(0x7f08024f);
        alerttype = getString(0x7f08024d);
        continue; /* Loop/switch isn't completed */
_L50:
        showScrollableAlert(getString(0x7f08016f), getString(0x7f08016e), as, alertactioncallback);
        return;
_L51:
        showScrollableAlert(getString(0x7f08025e), getString(0x7f08025d, s), as, alertactioncallback);
        return;
_L52:
        showScrollableAlert(getString(0x7f080257), getString(0x7f080256), as, alertactioncallback);
        return;
_L53:
        alerttype = getString(0x7f080304, s);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L54:
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L55:
        alerttype = getString(0x7f080288);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L56:
        s = getString(0x7f080287);
        alerttype = getString(0x7f080286);
        continue; /* Loop/switch isn't completed */
_L57:
        s = getString(0x7f0801c9);
        alerttype = getString(0x7f0801c8);
        continue; /* Loop/switch isn't completed */
_L58:
        alerttype = getString(0x7f08044d);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L59:
        alerttype = getString(0x7f080308);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L60:
        alerttype = getString(0x7f08044e);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L61:
        alerttype = getString(0x7f080305);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L62:
        alerttype = getString(0x7f0801c8);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L63:
        alerttype = getString(0x7f080306);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L64:
        alerttype = getString(0x7f080307);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L65:
        alerttype = getString(0x7f08044c);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L66:
        alerttype = getString(0x7f080454);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L67:
        showCustomLookGeneralAlert(getString(0x7f0800fd), getString(0x7f0800fc), getString(0x7f0800b8), null, alertactioncallback);
        return;
_L68:
        alerttype = getString(0x7f080357);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L69:
        alerttype = getString(0x7f080255);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L70:
        alerttype = getString(0x7f080347, s);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L71:
        alerttype = getString(0x7f0802db, s);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L72:
        alerttype = getString(0x7f080262);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L73:
        alerttype = getString(0x7f0801a7);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L74:
        alerttype = getString(0x7f0801d6);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L75:
        alerttype = getString(0x7f08032b);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L76:
        showScrollableAlert(getString(0x7f0800ec), getString(0x7f0800eb), as, alertactioncallback);
        return;
_L77:
        s = getString(0x7f080105);
        alerttype = getString(0x7f080104);
        continue; /* Loop/switch isn't completed */
_L78:
        s = getString(0x7f080125);
        alerttype = getString(0x7f080124);
        continue; /* Loop/switch isn't completed */
_L79:
        s = getString(0x7f080123);
        alerttype = getString(0x7f080122);
        continue; /* Loop/switch isn't completed */
_L80:
        s = getString(0x7f08036c);
        alerttype = getString(0x7f080082);
        continue; /* Loop/switch isn't completed */
_L81:
        s = getString(0x7f080291);
        alerttype = getString(0x7f080290);
        continue; /* Loop/switch isn't completed */
_L82:
        s = getString(0x7f080252);
        alerttype = getString(0x7f080251);
        continue; /* Loop/switch isn't completed */
_L83:
        obj = getString(0x7f080142);
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L84:
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L85:
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L86:
        showScrollableAlert(getString(0x7f08026b), getString(0x7f08026a), as, alertactioncallback);
        return;
_L87:
        obj = getString(0x7f080142);
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L88:
        obj = getString(0x7f0802ce);
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L89:
        s = getString(0x7f080142);
        alerttype = getString(0x7f080143);
        continue; /* Loop/switch isn't completed */
_L90:
        s = getString(0x7f080142);
        alerttype = getString(0x7f080144);
        continue; /* Loop/switch isn't completed */
_L91:
        s = getString(0x7f08020b);
        alerttype = getString(0x7f08020a);
        continue; /* Loop/switch isn't completed */
_L92:
        s = getString(0x7f08020d);
        alerttype = getString(0x7f08020c);
        continue; /* Loop/switch isn't completed */
_L93:
        s = getString(0x7f08020e);
        alerttype = getString(0x7f080209);
        continue; /* Loop/switch isn't completed */
_L94:
        alerttype = getString(0x7f080204);
        obj = getString(0x7f080203, s);
        s = alerttype;
        alerttype = ((AlertType) (obj));
        continue; /* Loop/switch isn't completed */
_L95:
        obj = getString(0x7f0801cc);
        alerttype = s;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L96:
        alerttype = getString(0x7f08014e);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L97:
        alerttype = getString(0x7f080153);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L98:
        alerttype = getString(0x7f080154);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L99:
        alerttype = getString(0x7f08014f);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L100:
        alerttype = getString(0x7f080152);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L101:
        alerttype = getString(0x7f080155);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L102:
        alerttype = getString(0x7f0801ae);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L103:
        alerttype = getString(0x7f0801b8);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L104:
        alerttype = getString(0x7f0801ad);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L105:
        alerttype = getString(0x7f0801df);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L106:
        alerttype = getString(0x7f080266, s);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L107:
        alerttype = getString(0x7f08032b);
        s = ((String) (obj));
        if (true) goto _L109; else goto _L108
_L108:
    }

    public void showAlert(AlertType alerttype, String as[])
    {
        showAlert(alerttype, null, null, as, null);
    }

    public void showAlert(String s, String s1, AlertActionCallback alertactioncallback)
    {
        showAlert(s, s1, null, null, alertactioncallback);
    }

    public void showAlert(String s, String s1, String s2, final String domCommands[], final AlertActionCallback callback)
    {
        if (!mActivity.isActivityOnTop())
        {
            LogUtil.d(LOG_TAG, "cannot show scrollable alert, activity not visible", new Object[0]);
            return;
        } else
        {
            s = AlertDialogFragment_.builder().mTitle(s).mMessage(s1).build();
            s.setOnAlertDismissListener(new _cls3());
            s.show(mActivity.getSupportFragmentManager(), "AlertDialogFragment");
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow(s2));
            return;
        }
    }

    public void showCustomLookGeneralAlert(String s, String s1, String s2, final String domCommands[], final AlertActionCallback callback)
    {
        if (!mActivity.isActivityOnTop())
        {
            LogUtil.d(LOG_TAG, "cannot show scrollable alert, activity not visible", new Object[0]);
            return;
        } else
        {
            s = GeneralAlertDialog_.builder().mTitle(s).mMessage(s1).mPositiveButtonText(s2).build();
            s.setGeneralAlertDialogClickListener(new _cls4());
            s.show(mActivity.getSupportFragmentManager(), "DiscontinueDialogFragment");
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
            return;
        }
    }

    public void showOptionAlert(AlertType alerttype, List list, String as[], OptionAlertActionCallback optionalertactioncallback)
    {
        String s1;
        String s2;
        s1 = "";
        s2 = "";
        _cls5..SwitchMap.com.dominos.utils.AlertType[alerttype.ordinal()];
        JVM INSTR lookupswitch 13: default 132
    //                   31: 133
    //                   107: 181
    //                   108: 227
    //                   109: 255
    //                   110: 291
    //                   111: 319
    //                   112: 347
    //                   113: 393
    //                   114: 440
    //                   115: 477
    //                   116: 514
    //                   117: 542
    //                   118: 579;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        return;
_L2:
        String s;
        alerttype = getString(0x7f080451);
        s1 = getString(0x7f080450);
        list = getString(0x7f080434);
        s = getString(0x7f08007a);
_L16:
        showOptionDialog(alerttype, s1, list, s, s2, as, optionalertactioncallback);
        return;
_L3:
        alerttype = getString(0x7f080239);
        s1 = getString(0x7f080248);
        list = getString(0x7f080264);
        s = getString(0x7f0800f9);
        s2 = getString(0x7f08026d);
        continue; /* Loop/switch isn't completed */
_L4:
        alerttype = getString(0x7f08026f);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        continue; /* Loop/switch isn't completed */
_L5:
        alerttype = getString(0x7f0800b9);
        s1 = getString(0x7f08018d);
        list = getString(0x7f080434);
        s = getString(0x7f0800a9);
        continue; /* Loop/switch isn't completed */
_L6:
        alerttype = getString(0x7f08026f);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        continue; /* Loop/switch isn't completed */
_L7:
        alerttype = getString(0x7f08026e);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        continue; /* Loop/switch isn't completed */
_L8:
        alerttype = getString(0x7f080208);
        s1 = getString(0x7f080207);
        s = getString(0x7f08007a);
        list = getString(0x7f080076);
        s2 = getString(0x7f080329);
        continue; /* Loop/switch isn't completed */
_L9:
        alerttype = getString(0x7f0801f7);
        s1 = getString(0x7f0801f8, (String)list.get(0));
        list = getString(0x7f080346);
        s = getString(0x7f08007a);
        continue; /* Loop/switch isn't completed */
_L10:
        alerttype = getString(0x7f080194);
        s1 = getString(0x7f0800bd);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        continue; /* Loop/switch isn't completed */
_L11:
        alerttype = getString(0x7f080161);
        s1 = getString(0x7f080160);
        list = getString(0x7f08015f);
        s = getString(0x7f08015e);
        continue; /* Loop/switch isn't completed */
_L12:
        alerttype = getString(0x7f080270);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        continue; /* Loop/switch isn't completed */
_L13:
        alerttype = getString(0x7f0803c6);
        s1 = getString(0x7f0803c5);
        list = getString(0x7f0803c4);
        s = getString(0x7f0803c3);
        continue; /* Loop/switch isn't completed */
_L14:
        alerttype = getString(0x7f0800b9);
        s1 = getString(0x7f080159);
        list = getString(0x7f080345);
        s = getString(0x7f0801d8);
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void showOptionAlert(AlertType alerttype, String as[], OptionAlertActionCallback optionalertactioncallback)
    {
        showOptionAlert(alerttype, null, as, optionalertactioncallback);
    }

    public void showOptionDialog(String s, String s1, String s2, String s3, String s4, final String domCommands[], final OptionAlertActionCallback callback)
    {
        if (!mActivity.isActivityOnTop())
        {
            LogUtil.d(LOG_TAG, "cannot show option dialog, activity not visible", new Object[0]);
            return;
        }
        OptionAlertFragment optionalertfragment = (OptionAlertFragment)mActivity.getSupportFragmentManager().a("MultiOptionButtonDialogFragment");
        if (optionalertfragment != null)
        {
            mActivity.getSupportFragmentManager().a().a(optionalertfragment).b();
        }
        s = OptionAlertFragment_.builder().mTitle(s).mMessage(s1).mPositiveButtonText(s2);
        if (!StringHelper.isEmpty(s3))
        {
            s.mNegativeButtonText(s3);
        }
        if (!StringHelper.isEmpty(s4))
        {
            s.mNeutralButtonText(s4);
        }
        s = s.build();
        s.setOptionClickListener(new _cls2());
        s.show(mActivity.getSupportFragmentManager(), "MultiOptionButtonDialogFragment");
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
    }

    public void showScrollableAlert(String s, String s1, final String domCommands[], final AlertActionCallback callback)
    {
        if (!mActivity.isActivityOnTop())
        {
            LogUtil.d(LOG_TAG, "cannot show scrollable alert, activity not visible", new Object[0]);
            return;
        } else
        {
            s = AlertDialogFragment_.builder().mTitle(s).mMessage(s1).mMessageScrollable(true).build();
            s.setOnAlertDismissListener(new _cls1());
            s.show(mActivity.getSupportFragmentManager(), "AlertDialogFragment");
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
            return;
        }
    }

    public void showToast(String s, int i)
    {
        if (mToast != null)
        {
            mToast.cancel();
        }
        mToast = Toast.makeText(mActivity, s, i);
        mToast.show();
    }


    private class _cls5
    {

        static final int $SwitchMap$com$dominos$utils$AlertType[];

        static 
        {
            $SwitchMap$com$dominos$utils$AlertType = new int[AlertType.values().length];
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_OFFLINE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror117) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_OFFLINE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror116) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_UNAVAILABLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror115) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_UNAVAILABLE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror114) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.NO_LONGER_DELIVERY_AREA.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror113) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror112) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_CLOSED.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror111) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_CLOSED.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror110) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.NO_NETWORK.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror109) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.NETWORK_ERROR.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror108) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CONNECTION_ERROR.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror107) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CART_EMPTY.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror106) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GOOGLE_WALLET_UNAVAILABLE.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror105) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_CANNOT_COMBINE.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror104) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_NOT_AVAILABLE.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror103) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_LIMIT_REACHED.ordinal()] = 16;
            }
            catch (NoSuchFieldError nosuchfielderror102) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_CARRYOUT_ONLY.ordinal()] = 17;
            }
            catch (NoSuchFieldError nosuchfielderror101) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.BELOW_MINIMUM_ORDER_AMOUNT.ordinal()] = 18;
            }
            catch (NoSuchFieldError nosuchfielderror100) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_INVALID.ordinal()] = 19;
            }
            catch (NoSuchFieldError nosuchfielderror99) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_ERROR_UNKNOWN.ordinal()] = 20;
            }
            catch (NoSuchFieldError nosuchfielderror98) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_NO_COUPONS.ordinal()] = 21;
            }
            catch (NoSuchFieldError nosuchfielderror97) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.REORDER_PRODUCT_OR_COUPON_CHANGED.ordinal()] = 22;
            }
            catch (NoSuchFieldError nosuchfielderror96) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_DIPPING_CUPS.ordinal()] = 23;
            }
            catch (NoSuchFieldError nosuchfielderror95) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SIGN_IN_FAILURE.ordinal()] = 24;
            }
            catch (NoSuchFieldError nosuchfielderror94) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DISPLAY_ESPANOL.ordinal()] = 25;
            }
            catch (NoSuchFieldError nosuchfielderror93) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SESSION_TIMED_OUT.ordinal()] = 26;
            }
            catch (NoSuchFieldError nosuchfielderror92) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_ERROR.ordinal()] = 27;
            }
            catch (NoSuchFieldError nosuchfielderror91) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DUPLICATE_ADDRESS_SAVE_ERROR.ordinal()] = 28;
            }
            catch (NoSuchFieldError nosuchfielderror90) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GLUTEN_FREE_CRUST.ordinal()] = 29;
            }
            catch (NoSuchFieldError nosuchfielderror89) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.HEARTY_MARINARA_UNAVAILABLE_ON_PAN.ordinal()] = 30;
            }
            catch (NoSuchFieldError nosuchfielderror88) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TRACKER_UNAVAILABLE.ordinal()] = 31;
            }
            catch (NoSuchFieldError nosuchfielderror87) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TRACKER_PROVIDE_FEEDBACK.ordinal()] = 32;
            }
            catch (NoSuchFieldError nosuchfielderror86) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_NOT_FOUND.ordinal()] = 33;
            }
            catch (NoSuchFieldError nosuchfielderror85) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.REMEMBER_ME_HELP.ordinal()] = 34;
            }
            catch (NoSuchFieldError nosuchfielderror84) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.FORGOT_PASSWORD.ordinal()] = 35;
            }
            catch (NoSuchFieldError nosuchfielderror83) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.INVALID_PASSWORD.ordinal()] = 36;
            }
            catch (NoSuchFieldError nosuchfielderror82) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.INVALID_EMAIL.ordinal()] = 37;
            }
            catch (NoSuchFieldError nosuchfielderror81) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SHOP_RUNNER_UNAVAILABLE.ordinal()] = 38;
            }
            catch (NoSuchFieldError nosuchfielderror80) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CREATE_PIZZA_PROFILE_HELP.ordinal()] = 39;
            }
            catch (NoSuchFieldError nosuchfielderror79) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.EASY_ORDER_HELP.ordinal()] = 40;
            }
            catch (NoSuchFieldError nosuchfielderror78) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SELECT_CREDIT_CARD_TYPE.ordinal()] = 41;
            }
            catch (NoSuchFieldError nosuchfielderror77) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.WALLET_BACKING_NOT_ACCEPTED.ordinal()] = 42;
            }
            catch (NoSuchFieldError nosuchfielderror76) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_AMOUNT_HIGH.ordinal()] = 43;
            }
            catch (NoSuchFieldError nosuchfielderror75) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_DISABLED.ordinal()] = 44;
            }
            catch (NoSuchFieldError nosuchfielderror74) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CASH_LIMIT_EXCEEDED.ordinal()] = 45;
            }
            catch (NoSuchFieldError nosuchfielderror73) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.EXPIRATION_DATE_INVALID.ordinal()] = 46;
            }
            catch (NoSuchFieldError nosuchfielderror72) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.REGISTRATION_ERROR_EMAIL_ALREADY_USED.ordinal()] = 47;
            }
            catch (NoSuchFieldError nosuchfielderror71) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CART_PRICING_FAILED.ordinal()] = 48;
            }
            catch (NoSuchFieldError nosuchfielderror70) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_IS_REMOVED.ordinal()] = 49;
            }
            catch (NoSuchFieldError nosuchfielderror69) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.PRODUCT_IS_REMOVED.ordinal()] = 50;
            }
            catch (NoSuchFieldError nosuchfielderror68) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.BOTH_PRODUCT_COUPON_REMOVED.ordinal()] = 51;
            }
            catch (NoSuchFieldError nosuchfielderror67) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_ITEMS.ordinal()] = 52;
            }
            catch (NoSuchFieldError nosuchfielderror66) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_FORM_ERROR_MESSAGE.ordinal()] = 53;
            }
            catch (NoSuchFieldError nosuchfielderror65) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SAMSUNG_TV_APP_NOT_FOUND.ordinal()] = 54;
            }
            catch (NoSuchFieldError nosuchfielderror64) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR.ordinal()] = 55;
            }
            catch (NoSuchFieldError nosuchfielderror63) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_PAN_PIZZA.ordinal()] = 56;
            }
            catch (NoSuchFieldError nosuchfielderror62) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_LEFT.ordinal()] = 57;
            }
            catch (NoSuchFieldError nosuchfielderror61) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_WHOLE.ordinal()] = 58;
            }
            catch (NoSuchFieldError nosuchfielderror60) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_RIGHT.ordinal()] = 59;
            }
            catch (NoSuchFieldError nosuchfielderror59) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_PASTA.ordinal()] = 60;
            }
            catch (NoSuchFieldError nosuchfielderror58) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAUCE.ordinal()] = 61;
            }
            catch (NoSuchFieldError nosuchfielderror57) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAND.ordinal()] = 62;
            }
            catch (NoSuchFieldError nosuchfielderror56) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAND_SLICE.ordinal()] = 63;
            }
            catch (NoSuchFieldError nosuchfielderror55) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_SAUCES_SAND_SLICE.ordinal()] = 64;
            }
            catch (NoSuchFieldError nosuchfielderror54) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED.ordinal()] = 65;
            }
            catch (NoSuchFieldError nosuchfielderror53) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE.ordinal()] = 66;
            }
            catch (NoSuchFieldError nosuchfielderror52) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_MISSING_STREET_NUMBER.ordinal()] = 67;
            }
            catch (NoSuchFieldError nosuchfielderror51) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_TO_PROFILE_ERROR.ordinal()] = 68;
            }
            catch (NoSuchFieldError nosuchfielderror50) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_TO_PROFILE_DUPLICATE.ordinal()] = 69;
            }
            catch (NoSuchFieldError nosuchfielderror49) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_ONLINE_ISSUE.ordinal()] = 70;
            }
            catch (NoSuchFieldError nosuchfielderror48) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR.ordinal()] = 71;
            }
            catch (NoSuchFieldError nosuchfielderror47) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_HISTORY_CALL_FAIL.ordinal()] = 72;
            }
            catch (NoSuchFieldError nosuchfielderror46) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.NEW_CUSTOMER_LOYALTY_ENROLL_FAIL.ordinal()] = 73;
            }
            catch (NoSuchFieldError nosuchfielderror45) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_PRICE_OR_PLACE_ORDER_FAIL.ordinal()] = 74;
            }
            catch (NoSuchFieldError nosuchfielderror44) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CVV_HELP_DIALOG.ordinal()] = 75;
            }
            catch (NoSuchFieldError nosuchfielderror43) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DUPLICATE_NICKNAME_DIALOG.ordinal()] = 76;
            }
            catch (NoSuchFieldError nosuchfielderror42) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GENERAL_CREDIT_CARD_ERROR_DIALOG.ordinal()] = 77;
            }
            catch (NoSuchFieldError nosuchfielderror41) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GET_CARD_LIST_ERROR_DIALOG.ordinal()] = 78;
            }
            catch (NoSuchFieldError nosuchfielderror40) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG.ordinal()] = 79;
            }
            catch (NoSuchFieldError nosuchfielderror39) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SAVE_TO_PROFILE_HELP_DIALOG.ordinal()] = 80;
            }
            catch (NoSuchFieldError nosuchfielderror38) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.PRIMARY_CARD_HELP_DIALOG.ordinal()] = 81;
            }
            catch (NoSuchFieldError nosuchfielderror37) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_CREDIT_CARD_FIELD.ordinal()] = 82;
            }
            catch (NoSuchFieldError nosuchfielderror36) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_PASSWORD_FIELDS.ordinal()] = 83;
            }
            catch (NoSuchFieldError nosuchfielderror35) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_REGISTRATION_FIELDS.ordinal()] = 84;
            }
            catch (NoSuchFieldError nosuchfielderror34) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.KEEP_ME_SIGNED_IN_INFO.ordinal()] = 85;
            }
            catch (NoSuchFieldError nosuchfielderror33) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_CHECKOUT_FIELDS.ordinal()] = 86;
            }
            catch (NoSuchFieldError nosuchfielderror32) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_PHONE_INFO.ordinal()] = 87;
            }
            catch (NoSuchFieldError nosuchfielderror31) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_GENERIC_CREDIT_CARD_ERROR.ordinal()] = 88;
            }
            catch (NoSuchFieldError nosuchfielderror30) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_GENERIC_PULSE_ERROR.ordinal()] = 89;
            }
            catch (NoSuchFieldError nosuchfielderror29) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT.ordinal()] = 90;
            }
            catch (NoSuchFieldError nosuchfielderror28) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_NOT_ALLOWED_FOR_DELIVERY.ordinal()] = 91;
            }
            catch (NoSuchFieldError nosuchfielderror27) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CLOSED.ordinal()] = 92;
            }
            catch (NoSuchFieldError nosuchfielderror26) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_MINIMUM_DELIVERY_AMOUNT.ordinal()] = 93;
            }
            catch (NoSuchFieldError nosuchfielderror25) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_FIELDS_USER_INFO.ordinal()] = 94;
            }
            catch (NoSuchFieldError nosuchfielderror24) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_DUPLICATE.ordinal()] = 95;
            }
            catch (NoSuchFieldError nosuchfielderror23) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_MORE_BALANCE.ordinal()] = 96;
            }
            catch (NoSuchFieldError nosuchfielderror22) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_MORE_THAN_ORDER.ordinal()] = 97;
            }
            catch (NoSuchFieldError nosuchfielderror21) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_ERROR.ordinal()] = 98;
            }
            catch (NoSuchFieldError nosuchfielderror20) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_NUMBER_ERROR.ordinal()] = 99;
            }
            catch (NoSuchFieldError nosuchfielderror19) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_AMOUNT_LOW.ordinal()] = 100;
            }
            catch (NoSuchFieldError nosuchfielderror18) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_OPT_OUT_ERROR.ordinal()] = 101;
            }
            catch (NoSuchFieldError nosuchfielderror17) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_CANNOT_REDEEM.ordinal()] = 102;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_NOT_ENOUGH_POINTS.ordinal()] = 103;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.NON_LOYALTY_STORE.ordinal()] = 104;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_REDEMPTION_LIMIT.ordinal()] = 105;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_NO_BASE_COUPON.ordinal()] = 106;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.APP_FEEDBACK_REQUEST.ordinal()] = 107;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_ITEM_FROM_ORDER.ordinal()] = 108;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOCATION_ERROR.ordinal()] = 109;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD.ordinal()] = 110;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_COUPON.ordinal()] = 111;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.CHECKOUT_FAIL_ALERT.ordinal()] = 112;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_OPT_OUT_CONFIRMATION.ordinal()] = 113;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.SIGN_OUT_ALERT.ordinal()] = 114;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.ENABLE_LOCATION.ordinal()] = 115;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.REMOVE_SAVED_ADDRESS.ordinal()] = 116;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.PEBBLE_DETECTED_MESSAGE.ordinal()] = 117;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_REMOVE.ordinal()] = 118;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements com.dominos.fragments.AlertDialogFragment.OnAlertDialogListener
    {

        final ActivityHelper this$0;
        final AlertActionCallback val$callback;
        final String val$domCommands[];

        public void onAlertDismiss()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onAlertDismissed();
            }
        }

        _cls3()
        {
            this$0 = ActivityHelper.this;
            domCommands = as;
            callback = alertactioncallback;
            super();
        }

        private class AlertActionCallback
        {

            public abstract void onAlertDismissed();

            public AlertActionCallback()
            {
            }
        }

    }


    private class _cls4
        implements com.dominos.dialogs.GeneralAlertDialog.GeneralAlertDialogClickListener
    {

        final ActivityHelper this$0;
        final AlertActionCallback val$callback;
        final String val$domCommands[];

        public void onDialogCanceled()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onAlertDismissed();
            }
        }

        public void onPositiveButtonClicked()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onAlertDismissed();
            }
        }

        _cls4()
        {
            this$0 = ActivityHelper.this;
            domCommands = as;
            callback = alertactioncallback;
            super();
        }
    }


    private class _cls2
        implements com.dominos.fragments.OptionAlertFragment.OnOptionClickListener
    {

        final ActivityHelper this$0;
        final OptionAlertActionCallback val$callback;
        final String val$domCommands[];

        public void onNegativeClick()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onNegativeButtonClicked();
            }
        }

        public void onNeutralClick()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onNeutralButtonClicked();
            }
        }

        public void onPositiveClick()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onPositiveButtonClicked();
            }
        }

        _cls2()
        {
            this$0 = ActivityHelper.this;
            domCommands = as;
            callback = optionalertactioncallback;
            super();
        }

        private class OptionAlertActionCallback
        {

            public abstract void onNegativeButtonClicked();

            public abstract void onNeutralButtonClicked();

            public abstract void onPositiveButtonClicked();

            public OptionAlertActionCallback()
            {
            }
        }

    }


    private class _cls1
        implements com.dominos.fragments.AlertDialogFragment.OnAlertDialogListener
    {

        final ActivityHelper this$0;
        final AlertActionCallback val$callback;
        final String val$domCommands[];

        public void onAlertDismiss()
        {
            if (domCommands != null)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(domCommands));
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            if (callback != null)
            {
                callback.onAlertDismissed();
            }
        }

        _cls1()
        {
            this$0 = ActivityHelper.this;
            domCommands = as;
            callback = alertactioncallback;
            super();
        }
    }

}
