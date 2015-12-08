// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experiment;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.ExperimentsApi;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.developer.DeveloperHelper;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class Experiments
{

    private static boolean a = false;
    private static boolean b = false;
    private static HashSet c = new HashSet();
    private static Map d = new HashMap();
    private static Map e = new HashMap();
    private static Map f = new _cls1();
    private static Map g = new _cls2();

    public static boolean A()
    {
        return b("scroll_perf_experiment", "enabled", true);
    }

    public static boolean B()
    {
        return b("android_user_suggestion_boards", true);
    }

    public static boolean C()
    {
        return b("android_pin_impression", true);
    }

    public static boolean D()
    {
        return b("android_news_empty_state", false);
    }

    public static boolean E()
    {
        return b("android_pin_feedback", "enabled_triple_dot", false);
    }

    public static boolean F()
    {
        return b("android_native_account_recovery", true);
    }

    public static boolean G()
    {
        return b("android_in_app_camera", true);
    }

    public static boolean H()
    {
        return b("android_commerce", true);
    }

    public static boolean I()
    {
        return c("android_commerce", true) || a("android_commerce", "enabled_shop_space_banner", true);
    }

    public static boolean J()
    {
        return b("android_follow_module", true);
    }

    public static boolean K()
    {
        return b("android_send_share_merge", true);
    }

    public static boolean L()
    {
        boolean flag = false;
        if (b("android_send_share_merge", "enabled_log", false) || b("android_send_share_merge", "control_log", true) || c("android_send_share_merge", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean M()
    {
        return b("movie_metadata_amplification", true);
    }

    public static boolean N()
    {
        return b("android_contextual_explore_tab", true);
    }

    public static boolean O()
    {
        return b("android_place_pins", true);
    }

    public static boolean P()
    {
        return b("android_aggregated_pins", true);
    }

    public static boolean Q()
    {
        return a("android_aggregated_pins", "blackread", true);
    }

    public static boolean R()
    {
        return b("recipe_metadata_amplification", true);
    }

    public static boolean S()
    {
        return b("android_show_nearby_pins_on_closeup", "enabled", true);
    }

    public static boolean T()
    {
        return b("android_flashlight_closeup", true);
    }

    public static boolean U()
    {
        return DeveloperHelper.d() || b("android_csr", true);
    }

    public static boolean V()
    {
        return b("android_url_pin_another", true);
    }

    public static boolean W()
    {
        boolean flag = false;
        if (a("android_dynamic_insertion_related_pins", "enabled_inline_insertion", false) || a("android_dynamic_insertion_related_pins", "enabled", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean X()
    {
        return a("android_dynamic_insertion_related_pins", "enabled_inline_insertion", true);
    }

    public static void Y()
    {
        b = true;
    }

    public static void Z()
    {
        PinterestJsonObject pinterestjsonobject = DiskCache.getJsonObject("MY_EXPERIMENTS");
        if (pinterestjsonobject != null)
        {
            a(pinterestjsonobject);
        } else
        {
            PinterestJsonObject pinterestjsonobject1 = af();
            if (pinterestjsonobject1 != null)
            {
                a(pinterestjsonobject1);
                return;
            }
        }
    }

    public static String a(String s1, boolean flag)
    {
        String s2 = null;
        String s3 = null;
        if (!ApplicationInfo.isNonProduction() || !a)
        {
            boolean flag1 = false;
            s3 = (String)e.get(s1);
            if (s3 != null)
            {
                s2 = s3;
                if (s3.equals(""))
                {
                    s2 = null;
                }
                flag1 = true;
            }
            if (!flag1 && ApplicationInfo.isNonProduction())
            {
                s3 = (String)g.get(s1);
                if (s3 != null)
                {
                    e.put(s1, s3);
                    s2 = s3;
                    flag1 = true;
                }
            }
            if (!flag1)
            {
                s2 = (String)d.get(s1);
                Map map = e;
                if (s2 == null)
                {
                    s3 = "";
                } else
                {
                    s3 = s2;
                }
                map.put(s1, s3);
            }
            s3 = s2;
            if (flag)
            {
                a(s1);
                return s2;
            }
        }
        return s3;
    }

    public static void a(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null)
        {
            Iterator iterator = pinterestjsonobject.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                String s2 = pinterestjsonobject.c(s1).a("group", "");
                if (s2 != null)
                {
                    d.put(s1, s2);
                }
            } while (true);
        }
    }

    public static void a(String s1)
    {
        while (c.contains(s1) || a(s1, false) == null) 
        {
            return;
        }
        ExperimentsApi.a(s1, new _cls3(s1));
    }

    public static void a(String s1, String s2)
    {
        if (ApplicationInfo.isNonProduction())
        {
            g.put(s1, s2);
        }
    }

    public static boolean a()
    {
        return b("android_action_filter", false);
    }

    private static boolean a(String s1, String s2, boolean flag)
    {
        s1 = a(s1, flag);
        return s1 != null && s1.equalsIgnoreCase(s2);
    }

    public static boolean a(boolean flag)
    {
        return b("android_hashtag_feed_v2", flag);
    }

    public static void aa()
    {
        ExperimentsApi.a(new ExperimentApiResponse());
    }

    public static void ab()
    {
        e.clear();
        d.clear();
        c.clear();
        DiskCache.delete("MY_EXPERIMENTS");
    }

    public static void ac()
    {
        e.clear();
    }

    public static Map ad()
    {
        return f;
    }

    static HashSet ae()
    {
        return c;
    }

    private static PinterestJsonObject af()
    {
        PinterestJsonObject pinterestjsonobject;
        pinterestjsonobject = MyUser.getJson();
        if (pinterestjsonobject == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        pinterestjsonobject = pinterestjsonobject.c("gatekeeper_experiments");
        return pinterestjsonobject;
        Exception exception;
        exception;
        return null;
    }

    public static void b(String s1, String s2)
    {
        if (ApplicationInfo.isNonProduction())
        {
            Map map = e;
            String s3;
            if (s2 == null)
            {
                s3 = "";
            } else
            {
                s3 = s2;
            }
            map.put(s1, s3);
            d.put(s1, s2);
        }
    }

    public static boolean b()
    {
        return b("android_clickthrough_to_device_browser", false);
    }

    private static boolean b(String s1, String s2, boolean flag)
    {
        s1 = a(s1, flag);
        return s1 != null && s1.startsWith(s2);
    }

    private static boolean b(String s1, boolean flag)
    {
label0:
        {
            boolean flag1 = false;
            if (!b(s1, "enabled", flag))
            {
                flag = flag1;
                if (!c(s1, false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static boolean b(boolean flag)
    {
        return b("android_m5_typeahead_cache", flag);
    }

    public static boolean c()
    {
        return b("android_multistep_signup", false);
    }

    private static boolean c(String s1, boolean flag)
    {
        return a(s1, "employees", flag) || a(s1, "employee", flag);
    }

    public static boolean c(boolean flag)
    {
        return b("android_pin_feedback", flag);
    }

    public static boolean d()
    {
        return b("android_multistep_signup", "control", false);
    }

    public static boolean d(boolean flag)
    {
        return b("android_topics_in_search", flag);
    }

    public static boolean e()
    {
        boolean flag = false;
        if (f() || b("android_phone_number_signup", "app_terms", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean e(boolean flag)
    {
        return b("discover_android_follow_board_rec", flag);
    }

    public static boolean f()
    {
        return b("android_phone_number_signup", "facebook", false);
    }

    public static boolean g()
    {
        return b("android_phone_number_signup", "multistep_no_phone", false);
    }

    public static boolean h()
    {
        return b("android_multistep_signup", "continue_email", false);
    }

    public static boolean i()
    {
        return b("android_multistep_signup", "passwordless", false);
    }

    public static boolean j()
    {
        return b("topical_feeds_android", false);
    }

    public static boolean k()
    {
        return b("topical_feeds_android", "enabled_all_at_front", false);
    }

    public static boolean l()
    {
        return b("pinvitational_philippines", false);
    }

    public static boolean m()
    {
        return b("android_link_feedback_toolbar", true);
    }

    public static boolean n()
    {
        return a("restrict_collaborator_invites", "rollout", false);
    }

    public static boolean o()
    {
        return b("interests_feed_blended_pin_annotation_android2", false);
    }

    public static boolean p()
    {
        return b("android_pin_max_height", true);
    }

    public static float q()
    {
        String s1 = a("android_pin_max_height", false);
        if (StringUtils.isEmpty(s1))
        {
            return 0.0F;
        }
        if ("employees".equals(s1))
        {
            return 0.2F;
        }
        int i1;
        try
        {
            i1 = Integer.parseInt(s1.substring(s1.length() - 2));
        }
        catch (Exception exception)
        {
            return 0.0F;
        }
        return (float)i1 / 100F;
    }

    public static boolean r()
    {
        String s1 = a("android_pin_max_height", false);
        if (StringUtils.isEmpty(s1) || !s1.startsWith("enabled"))
        {
            return false;
        } else
        {
            return s1.contains("promoted");
        }
    }

    public static boolean s()
    {
        boolean flag = false;
        if (a("android_search_autocomplete", "multiobject_m5", false) || a("android_search_autocomplete", "multiobject_rotw", false) || c("android_search_autocomplete", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean t()
    {
        boolean flag = false;
        if (a("android_search_autocomplete", "multiobject_m5", false) || c("android_search_autocomplete", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean u()
    {
        return b("android_closeup_inline_gallery", true);
    }

    public static boolean v()
    {
        return b("android_offline_access", true);
    }

    public static boolean w()
    {
        return b("android_api_certificate_pinning", true);
    }

    public static boolean x()
    {
        return b("library_android", true);
    }

    public static boolean y()
    {
        return b("android_homefeed_builder", true);
    }

    public static boolean z()
    {
        return b("android_group_board_sign_up", true);
    }


    private class _cls3 extends ApiResponseHandler
    {

        final String a;

        public final void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            Experiments.ae().add(a);
        }

        _cls3(String s1)
        {
            a = s1;
            super();
        }
    }


    private class ExperimentApiResponse extends ApiResponseHandler
    {

        private boolean a;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new ExperimentsLoaded(a));
        }

        public void onFinish()
        {
            super.onFinish();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)apiresponse.getData();
            if (pinterestjsonobject != null)
            {
                try
                {
                    Experiments.a(pinterestjsonobject);
                    DiskCache.setJsonObject("MY_EXPERIMENTS", pinterestjsonobject);
                }
                catch (Exception exception) { }
            }
            super.onSuccess(apiresponse);
            a = true;
            Experiments.Y();
            Events.post(new ExperimentsLoaded(a));
            return;
        }

        public ExperimentApiResponse()
        {
            a = false;
        }

        private class ExperimentsLoaded
        {

            public boolean a;

            public ExperimentsLoaded(boolean flag)
            {
                a = flag;
            }
        }

    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put("restrict_collaborator_invites", new String[] {
                "rollout", "none"
            });
            put("android_action_filter", new String[] {
                "employee", "control", "enabled"
            });
            put("library_android", new String[] {
                "employees", "control", "enabled"
            });
            put("pinvitational_philippines", new String[] {
                "control", "enabled", "employees"
            });
            put("topical_feeds_android", new String[] {
                "enabled", "control", "employees", "enabled_all_at_front"
            });
            put("android_closeup_inline_gallery", new String[] {
                "no_group", "control", "enabled", "employees"
            });
            put("android_hashtag_feed_v2", new String[] {
                "control", "enabled", "employee"
            });
            put("android_homefeed_builder", new String[] {
                "control", "enabled", "employee"
            });
            put("android_group_board_sign_up", new String[] {
                "control", "enabled", "employee"
            });
            put("android_user_suggestion_boards", new String[] {
                "control", "enabled", "employees"
            });
            put("android_sign_up_tos_refresh", new String[] {
                "control", "enabled", "employees"
            });
            put("android_pin_impression", new String[] {
                "control", "enabled", "employees"
            });
            put("android_pin_feedback", new String[] {
                "control", "enabled", "enabled_triple_dot", "employees"
            });
            put("android_in_app_camera", new String[] {
                "control", "enabled", "employees"
            });
            put("android_m5_typeahead_cache", new String[] {
                "control", "enabled", "employees"
            });
            put("android_send_share_merge", new String[] {
                "control_log", "enabled_log", "control", "enabled", "employees"
            });
            put("movie_metadata_amplification", new String[] {
                "control", "enabled", "employees"
            });
            put("android_news_empty_state", new String[] {
                "control", "enabled", "employees"
            });
            put("android_place_pins", new String[] {
                "control", "enabled", "employees"
            });
            put("android_contextual_explore_tab", new String[] {
                "control", "enabled", "employees"
            });
            put("android_commerce", new String[] {
                "control", "enabled", "employees"
            });
            put("android_pin_max_height", new String[] {
                "control", "enabled_20", "enabled_30", "enabled_40", "enabled_promoted_30", "employees"
            });
            put("recipe_metadata_amplification", new String[] {
                "control", "enabled", "employees"
            });
            put("android_show_nearby_pins_on_closeup", new String[] {
                "control", "enabled"
            });
            put("android_dynamic_insertion_related_pins", new String[] {
                "control", "enabled", "enabled_inline_insertion"
            });
        }
    }


    private class _cls2 extends HashMap
    {

        _cls2()
        {
            put("restrict_collaborator_invites", "rollout");
            put("android_action_filter", "employee");
            put("library_android", "employees");
            put("android_hashtag_feed_v2", "employees");
            put("android_homefeed_builder", "enabled");
            put("android_pin_impression", "employees");
            put("android_pin_feedback", "employees");
            put("android_m5_typeahead_cache", "employees");
            put("movie_metadata_amplification", "enabled");
            put("android_place_pins", "employees");
            put("discover_android_follow_board_rec", "employees");
            put("android_pin_max_height", "employees");
            put("android_show_nearby_pins_on_closeup", "enabled");
            put("android_dynamic_insertion_related_pins", "enabled");
        }
    }

}
