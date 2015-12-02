// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.language.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateService, CheckUpdateDialog

public class UpdateHelper
{
    public static final class UpdateType extends Enum
    {

        public static final UpdateType ActionMode;
        public static final UpdateType SettingAPP;
        public static final UpdateType SettingOther;
        public static final UpdateType Silent;
        private static final UpdateType a[];

        public static UpdateType valueOf(String s)
        {
            return (UpdateType)Enum.valueOf(com/qihoo/security/v5/UpdateHelper$UpdateType, s);
        }

        public static UpdateType[] values()
        {
            return (UpdateType[])a.clone();
        }

        static 
        {
            Silent = new UpdateType("Silent", 0);
            SettingAPP = new UpdateType("SettingAPP", 1);
            ActionMode = new UpdateType("ActionMode", 2);
            SettingOther = new UpdateType("SettingOther", 3);
            a = (new UpdateType[] {
                Silent, SettingAPP, ActionMode, SettingOther
            });
        }

        private UpdateType(String s, int i)
        {
            super(s, i);
        }
    }


    public static boolean a = false;

    private static void a(Context context)
    {
        if (!com.qihoo.security.locale.language.b.a(context))
        {
            return;
        } else
        {
            Intent intent = new Intent(context, com/qihoo/security/v5/UpdateService);
            intent.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
            intent.putExtra("type", 0);
            context.startService(intent);
            return;
        }
    }

    private static void a(Context context, int i)
    {
        if (context == null)
        {
            return;
        }
        if (!com.qihoo.security.locale.language.b.a(context))
        {
            b(context);
            return;
        } else
        {
            Intent intent = new Intent(context, com/qihoo/security/v5/CheckUpdateDialog);
            intent.putExtra("type", i);
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            return;
        }
    }

    public static void a(Context context, UpdateType updatetype)
    {
        a = false;
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[UpdateType.values().length];
                try
                {
                    a[UpdateType.SettingOther.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[UpdateType.Silent.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[UpdateType.SettingAPP.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[UpdateType.ActionMode.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[updatetype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.qihoo.security.support.b.c(19008);
            com.qihoo.security.support.b.b(27001);
            a(context, 3001);
            return;

        case 2: // '\002'
            a(context);
            return;

        case 3: // '\003'
            com.qihoo.security.support.b.b(27004);
            if (SecurityApplication.b())
            {
                q.a().a(0x7f0c018a);
                return;
            } else
            {
                a(context, 3002);
                return;
            }

        case 4: // '\004'
            com.qihoo.security.support.b.b(27003);
            break;
        }
        if (SecurityApplication.b())
        {
            q.a().a(0x7f0c018a);
            return;
        } else
        {
            a(context, 3002);
            return;
        }
    }

    private static void b(Context context)
    {
        com.qihoo.security.dialog.b b1 = new com.qihoo.security.dialog.b(context, 0x7f0c00c4, 0x7f0c00c5);
        b1.setButtonText(new int[] {
            0x7f0c01d1, 0x7f0c014f
        });
        b1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(context, b1) {

                final Context a;
                final com.qihoo.security.dialog.b b;

                public void onClick(View view)
                {
                    if (f.b())
                    {
                        com.qihoo.security.support.b.b(27006);
                        com.qihoo.security.locale.language.b.c(a);
                        Utils.dismissDialog(b);
                    }
                }

            
            {
                a = context;
                b = b1;
                super();
            }
            }, new android.view.View.OnClickListener(b1) {

                final com.qihoo.security.dialog.b a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(a);
                }

            
            {
                a = b1;
                super();
            }
            }
        });
        b1.setOnKeyListener(new android.content.DialogInterface.OnKeyListener(b1) {

            final com.qihoo.security.dialog.b a;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    Utils.dismissDialog(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = b1;
                super();
            }
        });
        com.qihoo.security.support.b.b(27005);
        Utils.showDialog(b1);
    }

}
