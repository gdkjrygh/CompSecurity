// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog;

import com.dominos.nina.dialog.agent.BaseAgency;
import com.dominos.nina.dialog.agent.CarryoutCommandAgent;
import com.dominos.nina.dialog.agent.CarryoutGuard;
import com.dominos.nina.dialog.agent.CarryoutLoadGuard;
import com.dominos.nina.dialog.agent.CarryoutSelectionAgent;
import com.dominos.nina.dialog.agent.CartCommandAgent;
import com.dominos.nina.dialog.agent.CartCompleteGuard;
import com.dominos.nina.dialog.agent.CartConfirmAgent;
import com.dominos.nina.dialog.agent.CartGuard;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.dialog.agent.CouponConfirmAgent;
import com.dominos.nina.dialog.agent.CouponGlobalCommandAgent;
import com.dominos.nina.dialog.agent.CouponGuard;
import com.dominos.nina.dialog.agent.CouponSelectionAgent;
import com.dominos.nina.dialog.agent.CouponWizardGuard;
import com.dominos.nina.dialog.agent.DeliveryCommandAgent;
import com.dominos.nina.dialog.agent.DeliveryGuard;
import com.dominos.nina.dialog.agent.DeliverySelectionAgent;
import com.dominos.nina.dialog.agent.EasyOrderConfirmAgent;
import com.dominos.nina.dialog.agent.GlobalAgent;
import com.dominos.nina.dialog.agent.IntentionAgent;
import com.dominos.nina.dialog.agent.NavigationGuard;
import com.dominos.nina.dialog.agent.NewOrderGuard;
import com.dominos.nina.dialog.agent.OrderGuard;
import com.dominos.nina.dialog.agent.ProductCategoryAgent;
import com.dominos.nina.dialog.agent.ProductCommandAgent;
import com.dominos.nina.dialog.agent.ProductCompleteGuard;
import com.dominos.nina.dialog.agent.ProductConfirmAgent;
import com.dominos.nina.dialog.agent.ProductFlavorAgent;
import com.dominos.nina.dialog.agent.ProductOptionsAgent;
import com.dominos.nina.dialog.agent.ProductOptionsSide1Agent;
import com.dominos.nina.dialog.agent.ProductOptionsSide2Agent;
import com.dominos.nina.dialog.agent.ProductQuantityAgent;
import com.dominos.nina.dialog.agent.ProductSizeAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.ProfileAuthGuard;
import com.dominos.nina.dialog.agent.ProfileGuard;
import com.dominos.nina.dialog.agent.RecentOrderConfirmAgent;
import com.dominos.nina.dialog.agent.RecentOrderSelectionAgent;
import com.dominos.nina.dialog.agent.ServiceMethodAgent;
import com.dominos.nina.dialog.agent.UpsellAgent;
import com.dominos.nina.dialog.agent.UpsellAskGuard;
import com.dominos.nina.dialog.agent.UpsellGuard;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.dialog.agent.VanityAgent;
import com.nuance.b.a.a;
import com.nuance.b.a.ae;
import com.nuance.b.a.af;
import com.nuance.b.a.ag;
import com.nuance.b.a.ah;
import com.nuance.b.a.ak;
import com.nuance.b.a.b;
import com.nuance.b.a.d;
import com.nuance.b.a.g;
import com.nuance.b.a.q;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DialogModelBuilder
{

    static final String BOOLEAN_SLOT = "YESNO";
    static final String NUMBER_SLOT = "NUMBER";
    private static final Pattern ZIP_PATTERN = Pattern.compile("\\b(\\d)(\\d)(\\d)(\\d)(\\d)\\b");
    private static final Pattern nonAsciiAllowQuotes = Pattern.compile("[^ -~\u2018\u2019]");
    ak mInterpretationHandler;

    public DialogModelBuilder(ak ak)
    {
        mInterpretationHandler = ak;
    }

    private static String filterTextInput(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            Matcher matcher = ZIP_PATTERN.matcher(s);
            s1 = s;
            if (matcher.find())
            {
                StringBuilder stringbuilder = new StringBuilder(s.length() + 10);
                int i = 0;
                int j;
                do
                {
                    stringbuilder.append(s.substring(i, matcher.start()));
                    stringbuilder.append(matcher.group(1));
                    for (i = 2; i <= 5; i++)
                    {
                        stringbuilder.append(" ");
                        stringbuilder.append(matcher.group(i));
                    }

                    j = matcher.end();
                    i = j;
                } while (matcher.find());
                stringbuilder.append(s.substring(j));
                return stringbuilder.toString();
            }
        }
        return s1;
    }

    public static String globalTextFilter(String s)
    {
        return filterTextInput(nonAsciiAllowQuotes.matcher(s).replaceAll("")).replaceAll("&", "and");
    }

    transient BaseAgency _(String s, g g1, b b1, q q1, a aa[])
    {
        s = new BaseAgency(s, g1, q1);
        s.setInterpretationHandler(mInterpretationHandler);
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            s.addChild(aa[i]);
        }

        if (b1 != null)
        {
            s.setActivationCondition(b1);
        }
        return s;
    }

    transient BaseAgency _(String s, g g1, b b1, a aa[])
    {
        return _(s, g1, b1, q.a, aa);
    }

    transient BaseAgency _(String s, g g1, a aa[])
    {
        return _(s, g1, null, aa);
    }

    public ae buildDialogModel(String s)
    {
        BaseAgency baseagency = buildMainAgencyTree();
        baseagency.activateGlobalCommand(new ah[] {
            ah.d
        });
        baseagency.activateGlobalCommand(new ah[] {
            ah.a
        });
        Locale locale = new Locale("en_US");
        HashMap hashmap = new HashMap();
        hashmap.put("en_US", "toplevel.gram");
        s = new ae("DominosMobile", "Dominos", s, hashmap, af.c, baseagency, new Locale[] {
            locale
        });
        s.a(ag.a);
        s.a(new _cls1(), locale);
        return s;
    }

    BaseAgency buildMainAgencyTree()
    {
        BaseAgency baseagency = _("Dominos", g.a, new a[] {
            _("Application", g.b, new a[] {
                new IntentionAgent("NAVIGATION", SlotMode.Mandatory), _("TaskAgency", g.c, new a[] {
                    buildOrderAgencyTree(), _("NavigationAgency", g.b, b.a(new d("IntentionAgent"), "order"), new a[] {
                        new NavigationGuard("NAVIGATION_GUARD")
                    })
                }), new GlobalAgent("GLOBAL_COMMAND", SlotMode.OptionalCorrectable), new VanityAgent("VANITY_COMMAND", SlotMode.OptionalCorrectable), new CouponGlobalCommandAgent("COUPON_GLOBAL_COMMAND", SlotMode.OptionalCorrectable), new ProductsAgent("PRODUCTS", SlotMode.Optional)
            })
        });
        baseagency.freezeChildAgentOrder();
        return baseagency;
    }

    BaseAgency buildOrderAgencyTree()
    {
        return _("OrderAgency", g.b, (new d("IntentionAgent")).a("order"), new a[] {
            new UserIntentionAgent("OR_USERINTENT", SlotMode.MandatoryCorrectable), _("OrderMethodAgency", g.c, (new d("UserIntentionAgent")).a("new").a((new d("UserIntentionAgent")).a("easy").a((new d("UserIntentionAgent")).a("recent")).a((new d("UserIntentionAgent")).a("show_easy"))), new a[] {
                _("ProfileOrderAgency", g.b, (new d("UserIntentionAgent")).a("easy").a((new d("UserIntentionAgent")).a("recent").a((new d("UserIntentionAgent")).a("show_easy"))), new a[] {
                    new ProfileGuard("PO_GUARD"), _("EasyOrderAgency", g.b, (new d("UserIntentionAgent")).a("easy").a((new d("UserIntentionAgent")).a("show_easy")), q.b, new a[] {
                        new EasyOrderConfirmAgent("YESNO", SlotMode.Mandatory)
                    }), _("RecentOrderAgency", g.b, (new d("UserIntentionAgent")).a("recent"), q.b, new a[] {
                        new RecentOrderSelectionAgent("NUMBER", SlotMode.MandatoryCorrectable), new RecentOrderConfirmAgent("YESNO", SlotMode.OptionalCorrectable)
                    }), new ProfileAuthGuard("PO_AUTHGUARD")
                }), _("NewOrderAgency", g.b, (new d("UserIntentionAgent")).a("new"), new a[] {
                    new ServiceMethodAgent("NO_SERVICE", SlotMode.Mandatory), _("DeliveryAgency", g.b, (new d("ServiceMethodAgent")).a("delivery"), q.b, new a[] {
                        new DeliverySelectionAgent("NUMBER", SlotMode.Mandatory), new DeliveryCommandAgent("DA_COMMAND", SlotMode.OptionalCorrectable), new DeliveryGuard("DA_GUARD")
                    }), _("CarryoutAgency", g.b, (new d("ServiceMethodAgent")).a("carryout"), q.b, new a[] {
                        new CarryoutLoadGuard("CARRY_LOADGUARD"), new CarryoutSelectionAgent("NUMBER", SlotMode.Mandatory), new CarryoutCommandAgent("CARRY_COMMAND", SlotMode.OptionalCorrectable), new CarryoutGuard("CARRY_GUARD")
                    }), new NewOrderGuard("NO_GUARD")
                })
            }), _("CartAgency", g.b, (new d("UserIntentionAgent")).a("cart"), new a[] {
                new CartConfirmAgent("YESNO", SlotMode.MandatoryCorrectable), new CartCommandAgent("CA_COMMAND", SlotMode.OptionalCorrectable), new CartGuard("CA_GUARD")
            }), _("CouponAgency", g.b, (new d("UserIntentionAgent")).a("coupon"), new a[] {
                new CouponSelectionAgent("NUMBER", SlotMode.MandatoryCorrectable), new CouponGuard("CO_GUARD")
            }), _("CouponWizardAgency", g.b, (new d("UserIntentionAgent")).a("coupon_wizard"), new a[] {
                new CouponCommandAgent("CO_COMMAND", SlotMode.OptionalCorrectable), new CouponConfirmAgent("YESNO", SlotMode.OptionalCorrectable), new CouponWizardGuard("CO_WIZ_GUARD")
            }), _("SingleProductEditAgency", g.b, (new d("UserIntentionAgent")).a("detail"), new a[] {
                new ProductCategoryAgent("PR_CATEGORY", SlotMode.OptionalCorrectable), new ProductFlavorAgent("PR_FLAVOR", SlotMode.OptionalCorrectable), new ProductSizeAgent("PR_SIZE", SlotMode.OptionalCorrectable), new ProductOptionsAgent("PR_OPTIONS", SlotMode.OptionalCorrectable), new ProductOptionsSide1Agent("PR_OPTIONS_S1", SlotMode.OptionalCorrectable), new ProductOptionsSide2Agent("PR_OPTIONS_S2", SlotMode.OptionalCorrectable), new ProductQuantityAgent("PR_QTY", SlotMode.OptionalCorrectable), new ProductCompleteGuard("PR_COMPLETE_GUARD"), new ProductConfirmAgent("YESNO", SlotMode.MandatoryCorrectable), new ProductCommandAgent("PR_COMMAND", SlotMode.OptionalCorrectable)
            }), new CartCompleteGuard("CA_COMPLETE_GUARD"), _("UpsellAgency", g.b, (new d("UserIntentionAgent")).a("checkout"), new a[] {
                new UpsellAskGuard("UP_ASK_GUARD"), new UpsellAgent("YESNO", SlotMode.Mandatory), new UpsellGuard("UP_GUARD")
            }), new OrderGuard("OR_GUARD")
        });
    }


    private class _cls1
        implements em
    {

        final DialogModelBuilder this$0;

        public String filter(String s)
        {
            s = DialogModelBuilder.globalTextFilter(s);
            if (s != null)
            {
                return s.toLowerCase();
            } else
            {
                return null;
            }
        }

        _cls1()
        {
            this$0 = DialogModelBuilder.this;
            super();
        }
    }


    private class SlotMode extends Enum
    {

        private static final SlotMode $VALUES[];
        public static final SlotMode Mandatory;
        public static final SlotMode MandatoryCorrectable;
        public static final SlotMode Optional;
        public static final SlotMode OptionalCorrectable;

        public static SlotMode valueOf(String s)
        {
            return (SlotMode)Enum.valueOf(com/dominos/nina/dialog/DialogModelBuilder$SlotMode, s);
        }

        public static SlotMode[] values()
        {
            return (SlotMode[])$VALUES.clone();
        }

        static 
        {
            Mandatory = new SlotMode("Mandatory", 0);
            MandatoryCorrectable = new SlotMode("MandatoryCorrectable", 1);
            Optional = new SlotMode("Optional", 2);
            OptionalCorrectable = new SlotMode("OptionalCorrectable", 3);
            $VALUES = (new SlotMode[] {
                Mandatory, MandatoryCorrectable, Optional, OptionalCorrectable
            });
        }

        private SlotMode(String s, int i)
        {
            super(s, i);
        }
    }

}
