// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.qihoo360.common.utils.Utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            d

public class SharedPref
{
    public static class CustomPrivateRingUriInfo
    {
    }

    public static final class CustomPrivateRingUriInfo.RingType extends Enum
    {

        public static final CustomPrivateRingUriInfo.RingType CUSTOM;
        public static final CustomPrivateRingUriInfo.RingType DEFUALT;
        public static final CustomPrivateRingUriInfo.RingType MUTE;
        private static final CustomPrivateRingUriInfo.RingType a[];

        public static CustomPrivateRingUriInfo.RingType valueOf(String s)
        {
            return (CustomPrivateRingUriInfo.RingType)Enum.valueOf(com/qihoo360/mobilesafe/share/SharedPref$CustomPrivateRingUriInfo$RingType, s);
        }

        public static CustomPrivateRingUriInfo.RingType[] values()
        {
            return (CustomPrivateRingUriInfo.RingType[])a.clone();
        }

        static 
        {
            DEFUALT = new CustomPrivateRingUriInfo.RingType("DEFUALT", 0);
            MUTE = new CustomPrivateRingUriInfo.RingType("MUTE", 1);
            CUSTOM = new CustomPrivateRingUriInfo.RingType("CUSTOM", 2);
            a = (new CustomPrivateRingUriInfo.RingType[] {
                DEFUALT, MUTE, CUSTOM
            });
        }

        private CustomPrivateRingUriInfo.RingType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final Map a;

    public static final String a(Context context)
    {
        String s;
        String s1;
        s = null;
        s1 = b(context, "system_mountpoint", ((String) (null)));
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        Object obj = new BufferedReader(new FileReader("/proc/mounts"));
_L4:
        s = ((BufferedReader) (obj)).readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.contains("/system")) goto _L4; else goto _L3
_L3:
        String as[];
        int j;
        as = s.split(" +");
        j = as.length;
        int i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        if (!s.startsWith("/dev") && !s.startsWith("/emmc") && !s.startsWith("emmc"))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        c(context, s);
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s;
        }
        return s;
        i++;
        if (true) goto _L5; else goto _L2
_L2:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return s1;
        context;
        context = s;
_L9:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (true)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        context;
        obj = null;
_L7:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw context;
        context;
        if (true) goto _L7; else goto _L6
_L6:
        context;
        context = ((Context) (obj));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(Context context, long l)
    {
        a(context, "total_clear_trash", b(context, "total_clear_trash", 0L) + l);
    }

    public static void a(Context context, String s)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_default", s);
    }

    public static final void a(Context context, String s, int i)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_default", s, i);
    }

    public static final void a(Context context, String s, long l)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_default", s, l);
    }

    public static final void a(Context context, String s, String s1)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_default", s, s1);
    }

    public static final void a(Context context, String s, boolean flag)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_default", s, flag);
    }

    public static boolean a(String s)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_default", s);
    }

    public static final int b(Context context, String s, int i)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_default", s, i);
    }

    public static final long b(Context context, String s, long l)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_default", s, l);
    }

    public static String b(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3 = null;
        obj2 = null;
        obj1 = b(context, "current_timestamp");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        obj = obj1;
        try
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = (new StringBuilder()).append(simpledateformat.format(simpledateformat.parse(((String) (obj1))))).append(((String) (obj1)).substring(((String) (obj1)).length() - 1)).toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        obj1 = new InputStreamReader(context.getAssets().open("timestamp"));
        context = (new BufferedReader(((java.io.Reader) (obj1)))).readLine();
        obj2 = context;
        context = ((Context) (obj2));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        ((InputStreamReader) (obj1)).close();
        context = ((Context) (obj2));
_L4:
        obj1 = b(((String) (context)));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj1 = context;
        }
        obj2 = b(((String) (obj)));
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj2 = obj;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        return ((String) (obj1));
        context;
        obj1 = null;
_L9:
        context = ((Context) (obj2));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((InputStreamReader) (obj1)).close();
        context = ((Context) (obj2));
          goto _L4
        context;
        context = ((Context) (obj2));
          goto _L4
        context;
        obj1 = null;
_L8:
        context = ((Context) (obj2));
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        ((InputStreamReader) (obj1)).close();
        context = ((Context) (obj2));
          goto _L4
        context;
        context = ((Context) (obj2));
          goto _L4
        context;
        obj = obj3;
_L7:
        if (obj != null)
        {
            try
            {
                ((InputStreamReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
_L2:
        if (TextUtils.isEmpty(context))
        {
            return ((String) (obj2));
        }
        if (context.compareTo(((String) (obj))) > 0) goto _L1; else goto _L6
_L6:
        return ((String) (obj2));
        context;
        context = ((Context) (obj2));
          goto _L4
        context;
        obj = obj1;
          goto _L7
        context;
          goto _L8
        context;
          goto _L9
    }

    public static String b(Context context, String s)
    {
        return b(context, s, ((String) (null)));
    }

    public static final String b(Context context, String s, String s1)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_default", s, s1);
    }

    private static String b(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            s1 = obj;
            if (s.matches("^[0-9]{8}[A,B]{1}$"))
            {
                s1 = (new StringBuilder()).append("AV").append(Integer.valueOf(s.substring(0, s.length() - 1)).intValue() * 5).append(s.substring(s.length() - 1)).toString();
            }
        }
        return s1;
    }

    public static void b(Context context, long l)
    {
        a(context, "last_come_in_size", l);
    }

    public static final boolean b(Context context, String s, boolean flag)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_default", s, flag);
    }

    public static final void c(Context context, String s)
    {
        a(context, "system_mountpoint", s);
    }

    public static boolean c(Context context)
    {
        context = b(context, "skfutv");
        return context != null && Utils.compareVersion(context, "1.0.8.3742") > 0;
    }

    public static long d(Context context)
    {
        return b(context, "total_clear_trash", 0L);
    }

    public static void d(Context context, String s)
    {
        a(context, "current_timestamp", s);
    }

    public static long e(Context context)
    {
        return b(context, "last_come_in_size", -1L);
    }

    static 
    {
        a = new HashMap();
        a.put("init_done", Integer.valueOf(4));
        a.put("protection.show.google.loginin_ok_dlg", Integer.valueOf(4));
        a.put("float_windown_req_ad_last_time", Integer.valueOf(3));
        a.put("float_windown_ad_id", Integer.valueOf(2));
        a.put("float_windown_ad_title", Integer.valueOf(1));
        a.put("float_windown_ad_type", Integer.valueOf(2));
        a.put("float_windown_ad_url", Integer.valueOf(1));
        a.put("float_windown_ad_icon_url", Integer.valueOf(1));
        a.put("float_windown_ad_end_time", Integer.valueOf(3));
        a.put("float_windown_ad_view_count", Integer.valueOf(2));
        a.put("float_windown_ad_click_count", Integer.valueOf(2));
        a.put("setting_package_monitor", Integer.valueOf(4));
        a.put("setting_auto_update", Integer.valueOf(4));
        a.put("setting_auto_start", Integer.valueOf(4));
        a.put("setting_float_view_show_1", Integer.valueOf(4));
        a.put("setting_float_view_show_2", Integer.valueOf(4));
        a.put("setting_root_get", Integer.valueOf(4));
        a.put("cloud_scan_time", Integer.valueOf(3));
        a.put("cloud_scan_executed", Integer.valueOf(4));
        a.put("malware_scan_time", Integer.valueOf(3));
        a.put("malware_full_scan_time", Integer.valueOf(3));
        a.put("malware_full_scan_first", Integer.valueOf(4));
        a.put("malware_states_for_home", Integer.valueOf(2));
        a.put("malware_protect_days", Integer.valueOf(3));
        a.put("malware_guide", Integer.valueOf(2));
        a.put("malware_states_for_exam", Integer.valueOf(4));
        a.put("system_mountpoint", Integer.valueOf(1));
        a.put("current_timestamp", Integer.valueOf(1));
        a.put("key_sheild_db_init", Integer.valueOf(4));
        a.put("last_stat", Integer.valueOf(3));
        a.put("last_account_report_time", Integer.valueOf(3));
        a.put("last_appbox_report_time", Integer.valueOf(3));
        a.put("license", Integer.valueOf(4));
        a.put("notification", Integer.valueOf(4));
        a.put("user_ex", Integer.valueOf(4));
        a.put("reg", Integer.valueOf(4));
        a.put("language", Integer.valueOf(1));
        a.put("language_index", Integer.valueOf(2));
        a.put("sp.key.update.check.timestp", Integer.valueOf(3));
        a.put("skfutv", Integer.valueOf(1));
        a.put("sp.key.trb", Integer.valueOf(3));
        a.put("shortcut_created", Integer.valueOf(4));
        a.put("shortcut_boost_created", Integer.valueOf(4));
        a.put("key_switcher_item_order", Integer.valueOf(1));
        a.put("key_float_view_guide_time", Integer.valueOf(2));
        a.put("sider_bar_bottom_new_function", Integer.valueOf(4));
        a.put("guide_ver", Integer.valueOf(2));
        a.put("corp_test_time", Integer.valueOf(3));
        a.put("guide_slide_clear", Integer.valueOf(4));
        a.put("guide_process_clear", Integer.valueOf(4));
        a.put("block_language_mode", Integer.valueOf(1));
        a.put("add_contact_notify", Integer.valueOf(4));
        a.put("block_switch", Integer.valueOf(4));
        a.put("blockcall_rule", Integer.valueOf(2));
        a.put("undisturb_mode", Integer.valueOf(2));
        a.put("undisturb_stimeh", Integer.valueOf(2));
        a.put("undisturb_stimem", Integer.valueOf(2));
        a.put("undisturb_etimeh", Integer.valueOf(2));
        a.put("undisturb_etimem", Integer.valueOf(2));
        a.put("is_undisturb_guided", Integer.valueOf(4));
        a.put("reset_language_config", Integer.valueOf(4));
        a.put("locale_data_migration", Integer.valueOf(4));
        a.put("lockscreen_clear_time", Integer.valueOf(2));
        a.put("unlockscreen_notify_enable", Integer.valueOf(4));
        a.put("lockscreen_clear_enable", Integer.valueOf(4));
        a.put("g_cid", Integer.valueOf(2));
        a.put("g_subcid", Integer.valueOf(1));
        a.put("gp_url", Integer.valueOf(1));
        a.put("qihoo_cookie_q", Integer.valueOf(1));
        a.put("qihoo_cookie_t", Integer.valueOf(1));
        a.put("quc_id", Integer.valueOf(1));
        a.put("quc_email", Integer.valueOf(1));
        a.put("quc_username", Integer.valueOf(1));
        a.put("quc_nickname", Integer.valueOf(1));
        a.put("User_headpic_url", Integer.valueOf(1));
        a.put("quc_have_head_pic", Integer.valueOf(4));
        a.put("quc_score", Integer.valueOf(1));
        a.put("quc_level", Integer.valueOf(1));
        a.put("quc_level_down", Integer.valueOf(1));
        a.put("quc_level_up", Integer.valueOf(1));
        a.put("quc_account_type", Integer.valueOf(2));
        a.put("quc_account_network_http_type", Integer.valueOf(4));
        a.put("quc_account_last_email", Integer.valueOf(1));
        a.put("quc_account_last_qid", Integer.valueOf(1));
        a.put("key_feedback_backup_email", Integer.valueOf(1));
        a.put("quc_account_exp_anim_switch", Integer.valueOf(4));
        a.put("quc_last_update_level_time", Integer.valueOf(3));
        a.put("key_update_next_check_values", Integer.valueOf(2));
        a.put("key_show_locale_upgrade_dialog", Integer.valueOf(4));
        a.put("guide_block", Integer.valueOf(4));
        a.put("google_play_rate_exp_need", Integer.valueOf(4));
        a.put("google_play_rate_exp", Integer.valueOf(4));
        a.put("last_time_guide_rate", Integer.valueOf(3));
        a.put("total_count_guide_rate", Integer.valueOf(2));
        a.put("LaunchImg", Integer.valueOf(1));
        a.put("key_show_side_bar", Integer.valueOf(4));
        a.put("guide_opt_clear", Integer.valueOf(4));
        a.put("show_appmgr_move_warning_dialog", Integer.valueOf(4));
        a.put("show_scan_pause_tip", Integer.valueOf(2));
        a.put("show_usb_debug_for_root_dialog", Integer.valueOf(4));
        a.put("show_appmgr_system_app_warning_dialog", Integer.valueOf(4));
        a.put("key_firewall_fb_all", Integer.valueOf(4));
        a.put("app_lock_guide", Integer.valueOf(4));
        a.put("app_lock_enabled", Integer.valueOf(4));
        a.put("app_lock_resume_time", Integer.valueOf(3));
        a.put("app_lock_mode", Integer.valueOf(2));
        a.put("app_lock_app_ops_manager", Integer.valueOf(4));
        a.put("app_lock_frequently_unlock", Integer.valueOf(4));
        a.put("app_lock_is_enable_3.2.5", Integer.valueOf(4));
        a.put("screenlock_frist_alter", Integer.valueOf(4));
        a.put("app_lock_system_clear_enabled", Integer.valueOf(4));
        a.put("private_first_enter", Integer.valueOf(4));
        a.put("private_space_record_mms", Integer.valueOf(4));
        a.put("private_space_record_call", Integer.valueOf(4));
        a.put("private_space_contact", Integer.valueOf(4));
        a.put("private_notify", Integer.valueOf(4));
        a.put("private_vibrate", Integer.valueOf(4));
        a.put("private_mainmenu_title", Integer.valueOf(1));
        a.put("private_space_self_define_icon_resid", Integer.valueOf(2));
        a.put("user_custom_private_text", Integer.valueOf(1));
        a.put("user_custom_private_pic", Integer.valueOf(1));
        a.put("user_custom_private_pic_call", Integer.valueOf(1));
        a.put("custom_privatesms_ring", Integer.valueOf(1));
        a.put("private_open", Integer.valueOf(4));
        a.put("private_auto_sms", Integer.valueOf(4));
        a.put("private_auto_sms_content", Integer.valueOf(2));
        a.put("private_fake_ui_password", Integer.valueOf(1));
        a.put("private_fake_ui_enable", Integer.valueOf(1));
        a.put("private_fake_ui_pattern", Integer.valueOf(1));
        a.put("unzip_expand_lang_pkgs_switch", Integer.valueOf(1));
        a.put("last_trash_scan_time", Integer.valueOf(3));
        a.put("last_trash_clear_time", Integer.valueOf(3));
        a.put("last_exam_clear_time", Integer.valueOf(3));
        a.put("exam_recommend_id", Integer.valueOf(2));
        a.put("exam_scan_elapsed_time", Integer.valueOf(2));
        a.put("appbox_new_function_enable_last_time", Integer.valueOf(3));
        a.put("splash_show_image_count", Integer.valueOf(2));
        a.put("unlock_show_image_count", Integer.valueOf(2));
        a.put("last_time_cancel_residual_file_dialog", Integer.valueOf(3));
        a.put("start_time_silence_residual_file_dialog", Integer.valueOf(3));
        a.put("last_time_cancel_add_file_dialog", Integer.valueOf(3));
        a.put("start_time_silence_add_file_dialog", Integer.valueOf(3));
        a.put("l_c_extend", Integer.valueOf(4));
        a.put("l_c_default", Integer.valueOf(4));
        a.put("l_c_name", Integer.valueOf(1));
        a.put("l_c_pkg", Integer.valueOf(1));
        a.put("l_c_path", Integer.valueOf(1));
        a.put("app_box_data_timestamp", Integer.valueOf(3));
        a.put("app_box_previous_time", Integer.valueOf(3));
        a.put("app_box_data", Integer.valueOf(1));
        a.put("app_box_isNew", Integer.valueOf(4));
        a.put("app_box_createdShortcut", Integer.valueOf(4));
        a.put("bkup_sys_contacts_count", Integer.valueOf(2));
        a.put("bkup_sys_sms_count", Integer.valueOf(2));
        a.put("bkup_sys_mms_count", Integer.valueOf(2));
        a.put("bkup_sys_calendar_count", Integer.valueOf(2));
        a.put("bkup_flow", Integer.valueOf(1));
        a.put("fv_enabled", Integer.valueOf(4));
        a.put("fv_mode", Integer.valueOf(2));
        a.put("fv_land_x", Integer.valueOf(2));
        a.put("fv_land_Y", Integer.valueOf(2));
        a.put("fv_port_x", Integer.valueOf(2));
        a.put("fv_port_Y", Integer.valueOf(2));
        a.put("SaveFeedbackAddress", Integer.valueOf(1));
        a.put("SaveFeedbackContent", Integer.valueOf(1));
        a.put("SavedCategory", Integer.valueOf(2));
        a.put("pp_protection_opened_21", Integer.valueOf(4));
        a.put("pp_protection_guide_mask_display_times", Integer.valueOf(2));
        a.put("pp_protection_opened", Integer.valueOf(4));
        a.put("pp_security_token", Integer.valueOf(1));
        a.put("pp_passwd_token", Integer.valueOf(1));
        a.put("protection_password", Integer.valueOf(1));
        a.put("pp_safety_number", Integer.valueOf(1));
        a.put("pp_number_token", Integer.valueOf(1));
        a.put("pp_safety_sms", Integer.valueOf(1));
        a.put("pp_imsi", Integer.valueOf(1));
        a.put("pp_imsi_token", Integer.valueOf(1));
        a.put("pp_location", Integer.valueOf(4));
        a.put("pp_screen_locked", Integer.valueOf(4));
        a.put("pp_uninstall_prevent", Integer.valueOf(4));
        a.put("pp_has_show_readme", Integer.valueOf(4));
        a.put("pp_safety_account", Integer.valueOf(1));
        a.put("protection_remaind_backup", Integer.valueOf(1));
        a.put("pp_show_net_provider_dialog", Integer.valueOf(4));
        a.put("protection_mc", Integer.valueOf(2));
        a.put("protection_mt", Integer.valueOf(3));
        a.put("protection_qihoo_token_q", Integer.valueOf(1));
        a.put("protection_qihoo_token_t", Integer.valueOf(1));
        a.put("protection_qihoo_id", Integer.valueOf(1));
        a.put("protection_google_token", Integer.valueOf(1));
        a.put("protection_google_id", Integer.valueOf(1));
        a.put("protection_google_email", Integer.valueOf(1));
        a.put("protection_google_nickname", Integer.valueOf(1));
        a.put("pp_safety_account", Integer.valueOf(1));
        a.put("show_protection_anim_times", Integer.valueOf(1));
        a.put("protection_send_sms_times", Integer.valueOf(2));
        a.put("enter_app_from_main", Integer.valueOf(1));
        a.put("fv_enabled", Integer.valueOf(4));
        a.put("fv_mode", Integer.valueOf(2));
        a.put("fv_land_x", Integer.valueOf(1));
        a.put("fv_land_Y", Integer.valueOf(1));
        a.put("fv_port_x", Integer.valueOf(1));
        a.put("fv_port_Y", Integer.valueOf(1));
        a.put("nt_m_month_quota", Integer.valueOf(3));
        a.put("net_traffic_service_eabled", Integer.valueOf(4));
        a.put("key_rating_lastest_show_time", Integer.valueOf(3));
        a.put("leak_sms_service", Integer.valueOf(3));
        a.put("leak_sms_broadcast", Integer.valueOf(3));
        a.put("leak_exynos_mem", Integer.valueOf(3));
        a.put("leak_x401", Integer.valueOf(3));
        a.put("leak_remote_wipe", Integer.valueOf(3));
        a.put("leak_samsung_backup", Integer.valueOf(3));
        a.put("net_traffic_service_eabled", Integer.valueOf(4));
        a.put("net_traffic_alert_enabled", Integer.valueOf(4));
        a.put("set_nettrafic_value", Integer.valueOf(4));
        a.put("net_traffic_first_apptraffic", Integer.valueOf(4));
        a.put("nt_m_name", Integer.valueOf(1));
        a.put("nt_m_valueday", Integer.valueOf(2));
        a.put("nt_m_month_quota", Integer.valueOf(3));
        a.put("nt_m_month_threshold", Integer.valueOf(2));
        a.put("nt_m_month_alert_times", Integer.valueOf(2));
        a.put("nt_m_day_alert_threshold", Integer.valueOf(3));
        a.put("nt_m_day_alert_times", Integer.valueOf(2));
        a.put("nt_m_first", Integer.valueOf(4));
        a.put("nt_m_rx", Integer.valueOf(3));
        a.put("nt_m_tx", Integer.valueOf(3));
        a.put("nt_w_name", Integer.valueOf(1));
        a.put("nt_w_valueday", Integer.valueOf(2));
        a.put("nt_w_month_quota", Integer.valueOf(3));
        a.put("nt_w_month_threshold", Integer.valueOf(2));
        a.put("nt_w_month_alert_times", Integer.valueOf(2));
        a.put("nt_w_day_alert_threshold", Integer.valueOf(3));
        a.put("nt_w_day_alert_times", Integer.valueOf(2));
        a.put("nt_w_first", Integer.valueOf(4));
        a.put("nt_w_rx", Integer.valueOf(3));
        a.put("nt_w_tx", Integer.valueOf(3));
        a.put("nt_m2_name", Integer.valueOf(1));
        a.put("nt_m2_valueday", Integer.valueOf(2));
        a.put("nt_m2_month_quota", Integer.valueOf(3));
        a.put("nt_m2_month_threshold", Integer.valueOf(2));
        a.put("nt_m2_month_alert_times", Integer.valueOf(2));
        a.put("nt_m2_day_alert_threshold", Integer.valueOf(3));
        a.put("nt_m2_day_alert_times", Integer.valueOf(2));
        a.put("nt_m2_first", Integer.valueOf(4));
        a.put("nt_m2_rx", Integer.valueOf(3));
        a.put("nt_m2_tx", Integer.valueOf(3));
        a.put("key_language_upgrade", Integer.valueOf(1));
        a.put("key_language_notice_new", Integer.valueOf(1));
        a.put("key_notice_language_upgrade_show_times", Integer.valueOf(2));
        a.put("key_notice_language_upgrade_time", Integer.valueOf(3));
        a.put("key_app_version", Integer.valueOf(2));
        a.put("sp_key_process_is_daemon", Integer.valueOf(4));
        a.put("key_adv_card_id", Integer.valueOf(3));
        a.put("key_adv_card_pkg", Integer.valueOf(1));
        a.put("key_notice_push_one_day", Integer.valueOf(3));
        a.put("key_notice_push_six_hour", Integer.valueOf(3));
        a.put("key_notice_boost_show_time", Integer.valueOf(3));
        a.put("key_notice_boost_click_time", Integer.valueOf(3));
        a.put("key_check_ave_config_over", Integer.valueOf(4));
        a.put("sp_key_virus_show_dialog_uninstall", Integer.valueOf(4));
        a.put("sp_key_virus_show_dialog_forcestop", Integer.valueOf(4));
        a.put("sp_key_last_cq_locale", Integer.valueOf(1));
    }
}
