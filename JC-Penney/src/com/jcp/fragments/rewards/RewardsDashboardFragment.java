// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.activities.RewardsCardViewActivity;
import com.jcp.adapters.RewardsItemAdapter;
import com.jcp.b.a;
import com.jcp.c.aa;
import com.jcp.c.af;
import com.jcp.e.ag;
import com.jcp.e.e;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.as;
import com.jcp.fragments.s;
import com.jcp.fragments.t;
import com.jcp.model.PromotionDetails;
import com.jcp.model.Promotions;
import com.jcp.model.rewards.Balance;
import com.jcp.model.rewards.Category;
import com.jcp.model.rewards.Certificate;
import com.jcp.model.rewards.PerkTypes;
import com.jcp.model.rewards.Punches;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.model.rewards.RewardsTier;
import com.jcp.settings.model.CartSettings;
import com.jcp.settings.model.JCPSettings;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bt;
import com.jcp.util.k;
import com.jcp.views.TypefaceTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.fragments.rewards:
//            aa

public class RewardsDashboardFragment extends s
    implements ag, e
{

    private RewardsItemAdapter a;
    private int b;
    private int c;
    private RewardsProfile d;
    private List e;
    private aa f;
    protected TextView jcpennyPts;
    protected ListView listView;
    protected ImageView perkImgItmEight;
    protected ImageView perkImgItmFive;
    protected ImageView perkImgItmFour;
    protected ImageView perkImgItmOne;
    protected ImageView perkImgItmSeven;
    protected ImageView perkImgItmSix;
    protected ImageView perkImgItmThree;
    protected ImageView perkImgItmTwo;
    protected TextView perkPts;
    protected TextView perktypeOneAwayPurchase;
    protected TextView perktypeTwoAwayPurchase;
    protected TextView pointsLabel;
    protected LinearLayout rewardsStartShoppingHeader;
    protected ImageView tierIcon;
    protected TypefaceTextView tierName;
    protected TextView totalEarnedPts;

    public RewardsDashboardFragment()
    {
        e = new ArrayList();
    }

    private void U()
    {
        e.clear();
        listView.setAdapter(null);
        listView.setFocusable(false);
        b(d);
        a = new RewardsItemAdapter(this, 0x7f03005d, e);
        listView.setAdapter(a);
        a(listView);
    }

    private void V()
    {
        if (f == null)
        {
            f = new aa(i());
            f.a(this);
        }
        f.b(true);
    }

    private void W()
    {
        if (d != null)
        {
            List list = d.getRewards();
            if (list != null)
            {
                for (int i = 0; i < list.size(); i++)
                {
                    ((Certificate)list.get(i)).setIsApplied(false);
                    ((Certificate)list.get(i)).setPromoId(null);
                }

            }
        }
    }

    private String a(ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (errormessageentitycontainer != null)
        {
            return errormessageentitycontainer.getErrorMessage();
        } else
        {
            return a(0x7f070236);
        }
    }

    static List a(RewardsDashboardFragment rewardsdashboardfragment)
    {
        return rewardsdashboardfragment.e;
    }

    private void a(int i, ImageView imageview, ImageView imageview1, ImageView imageview2, ImageView imageview3)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            imageview.setAlpha(0.3F);
            // fall through

        case 1: // '\001'
            imageview1.setAlpha(0.3F);
            // fall through

        case 2: // '\002'
            imageview2.setAlpha(0.3F);
            // fall through

        case 3: // '\003'
            imageview3.setAlpha(0.3F);
            break;
        }
    }

    private void a(Promotions promotions)
    {
        W();
        if (promotions != null && !promotions.getPromotions().isEmpty() && d != null)
        {
            promotions = promotions.getPromotions();
            List list = d.getRewards();
label0:
            for (int i = 0; i < list.size(); i++)
            {
                Iterator iterator = promotions.iterator();
                PromotionDetails promotiondetails;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    promotiondetails = (PromotionDetails)iterator.next();
                } while (!"REWARDS".equals(promotiondetails.getType()) || !promotiondetails.getSerialNumber().equalsIgnoreCase(((Certificate)list.get(i)).getSerialNumber()));
                ((Certificate)list.get(i)).setIsApplied(true);
                ((Certificate)list.get(i)).setPromoId(promotiondetails.getId());
            }

        }
    }

    private void a(PerkTypes perktypes, PerkTypes perktypes1)
    {
        byte byte0;
        if (b(perktypes, perktypes1))
        {
            perktypeOneAwayPurchase.setText((new StringBuilder()).append(perktypes.getPunches().getRemaining().intValue() - perktypes.getPunches().getEarned().intValue()).append(" ").append(j().getString(0x7f07032f)).toString());
        } else
        {
            perktypeOneAwayPurchase.setText(" ");
        }
        if (b(perktypes, perktypes1))
        {
            perktypeTwoAwayPurchase.setText((new StringBuilder()).append(perktypes1.getPunches().getRemaining().intValue() - perktypes1.getPunches().getEarned().intValue()).append(" ").append(j().getString(0x7f07032f)).toString());
        } else
        {
            perktypeTwoAwayPurchase.setText(" ");
        }
        a(perktypes.getPunches().getEarned().intValue(), perkImgItmOne, perkImgItmTwo, perkImgItmThree, perkImgItmFour);
        a(perktypes1.getPunches().getEarned().intValue(), perkImgItmFive, perkImgItmSix, perkImgItmSeven, perkImgItmEight);
        tierName.setText(d.getTier().getName());
        perktypes = d.getTier().getCode();
        byte0 = -1;
        perktypes.hashCode();
        JVM INSTR lookupswitch 3: default 264
    //                   -1637567956: 347
    //                   2031313: 317
    //                   2193504: 332;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_347;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            tierIcon.setImageDrawable(j().getDrawable(0x7f020089));
            return;

        case 1: // '\001'
            tierIcon.setImageDrawable(j().getDrawable(0x7f020087));
            return;

        case 2: // '\002'
            tierIcon.setImageDrawable(j().getDrawable(0x7f020088));
            break;
        }
        break MISSING_BLOCK_LABEL_415;
_L3:
        if (perktypes.equals("BASE"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (perktypes.equals("GOLD"))
        {
            byte0 = 1;
        }
          goto _L5
        if (perktypes.equals("PLATINUM"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private void a(List list)
    {
        if (list != null)
        {
            Certificate certificate;
            for (list = list.iterator(); list.hasNext(); e.add(certificate))
            {
                certificate = (Certificate)list.next();
            }

        }
    }

    static RewardsItemAdapter b(RewardsDashboardFragment rewardsdashboardfragment)
    {
        return rewardsdashboardfragment.a;
    }

    private void b(String s1)
    {
        ac ac1 = i();
        if (bt.a(ac1) && d != null)
        {
            Object obj = (PerkTypes)d.getPerkTypes().get(0);
            if (((PerkTypes) (obj)).getName().equals(s1))
            {
                s1 = ((PerkTypes) (obj)).getCategory().getId();
                obj = ((PerkTypes) (obj)).getName();
            } else
            {
                obj = (PerkTypes)d.getPerkTypes().get(1);
                s1 = ((PerkTypes) (obj)).getCategory().getId();
                obj = ((PerkTypes) (obj)).getName();
            }
            ((MainActivity)ac1).a(s1, ((String) (obj)));
        }
    }

    private boolean b(PerkTypes perktypes, PerkTypes perktypes1)
    {
        return perktypes.getPunches().getRemaining() != null && perktypes.getPunches().getEarned() != null && perktypes1.getPunches().getRemaining() != null && perktypes1.getPunches().getEarned() != null;
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        listView.setVisibility(0);
        com.jcp.b.a.a(i(), 0x7f070317);
        af.b(i()).a(this);
        af.b(i()).f();
        a(listView);
        listView.setOnItemClickListener(new com.jcp.fragments.rewards.aa(this));
        try
        {
            b = Integer.parseInt(JCP.f().getCart().getMaxRewardsCount());
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            ae.a("Cart Summary Helper", (new StringBuilder()).append("NumberFormatException while converting string to int ").append(viewgroup).toString());
            viewgroup.printStackTrace();
            b = 10;
            return layoutinflater;
        }
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Dashboard";
    }

    public void a(int i, int j)
    {
        V();
    }

    public void a(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int l = android.view.View.MeasureSpec.makeMeasureSpec(listview.getWidth(), 0);
        Object obj = null;
        int j = 0;
        for (int i = 0; i < listadapter.getCount(); i++)
        {
            obj = listadapter.getView(i, ((View) (obj)), listview);
            ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(l, -2));
            ((View) (obj)).measure(l, 0);
            j += ((View) (obj)).getMeasuredHeight();
        }

        obj = listview.getLayoutParams();
        obj.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + j;
        listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        listview.requestLayout();
    }

    public void a(ErrorMessageEntityContainer errormessageentitycontainer, int i)
    {
        com.jcp.b.a.i();
        Toast.makeText(i(), a(errormessageentitycontainer), 0).show();
    }

    public void a(ErrorMessageEntityContainer errormessageentitycontainer, int i, int j)
    {
        com.jcp.b.a.i();
        Toast.makeText(i(), a(errormessageentitycontainer), 0).show();
    }

    public void a(Promotions promotions, int i)
    {
        if (i() != null && !i().isFinishing())
        {
            com.jcp.b.a.i();
            if (promotions != null && promotions.getPromotions() != null)
            {
                c = promotions.getPromotions().size();
            }
            a(promotions);
            U();
        }
    }

    public void a(Certificate certificate)
    {
        if (JCP.d().a() > 0)
        {
            if (certificate != null && certificate.isApplied())
            {
                com.jcp.b.a.a(i(), 0x7f070317);
                f.a(certificate.getPromoId(), 69, true);
                return;
            }
            if (c < b)
            {
                com.jcp.b.a.a(i(), 0x7f070317);
                f.a(certificate.getCode(), certificate.getSerialNumber(), "REWARDS", true);
                return;
            } else
            {
                au.a(i(), i().getString(0x7f070358));
                return;
            }
        } else
        {
            k.a(i(), a(0x7f0701bb), a(0x7f0701bc));
            return;
        }
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
        d = rewardsprofile;
        V();
    }

    public void a(String s1, String s2, int i)
    {
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s1)
    {
    }

    public void a_(String s1, int i)
    {
    }

    public void b()
    {
        a(a(0x7f070262));
        super.b();
    }

    public void b(int i, int j)
    {
        V();
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(RewardsProfile rewardsprofile)
    {
label0:
        {
            Object obj = rewardsprofile.getPerkTypes();
            PerkTypes perktypes;
            Object obj1;
            if (obj != null && ((List) (obj)).size() >= 2)
            {
                perktypes = (PerkTypes)((List) (obj)).get(0);
                obj = (PerkTypes)((List) (obj)).get(1);
            } else
            {
                obj = null;
                perktypes = null;
            }
            obj1 = rewardsprofile.getRewards();
            if (obj1 != null && !((List) (obj1)).isEmpty())
            {
                a(((List) (obj1)));
            } else
            {
                listView.setVisibility(8);
            }
            obj1 = rewardsprofile.getBalance();
            if (obj1 == null)
            {
                rewardsprofile = null;
            } else
            {
                rewardsprofile = ((Balance) (obj1)).getCertificates();
            }
            if (rewardsprofile != null)
            {
                boolean flag;
                boolean flag1;
                if (rewardsprofile.intValue() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                jcpennyPts.setText(String.valueOf(rewardsprofile));
            } else
            {
                jcpennyPts.setText(" ");
                flag = false;
            }
            rewardsprofile = ((Balance) (obj1)).getPerks();
            if (rewardsprofile != null)
            {
                if (rewardsprofile.intValue() > 0)
                {
                    flag = true;
                }
                perkPts.setText(String.valueOf(rewardsprofile));
            } else
            {
                perkPts.setText(" ");
            }
            rewardsprofile = ((Balance) (obj1)).getPoints();
            if (rewardsprofile != null)
            {
                if (rewardsprofile.intValue() > 0)
                {
                    flag = true;
                }
                totalEarnedPts.setText(String.valueOf(rewardsprofile));
                flag1 = flag;
                if (rewardsprofile.intValue() == 1)
                {
                    pointsLabel.setText(a(0x7f070318));
                    flag1 = flag;
                }
            } else
            {
                totalEarnedPts.setText(" ");
                flag1 = flag;
            }
            if (!flag1)
            {
                rewardsStartShoppingHeader.setVisibility(0);
            }
            if (perktypes != null && obj != null)
            {
                if (!perktypes.getName().equals("shoe"))
                {
                    break label0;
                }
                a(perktypes, ((PerkTypes) (obj)));
            }
            return;
        }
        a(((PerkTypes) (obj)), perktypes);
    }

    public void b(String s1, int i)
    {
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void launchRewardCardActivity()
    {
        if (d != null && d.getTier() != null)
        {
            Intent intent = new Intent(i(), com/jcp/activities/RewardsCardViewActivity);
            intent.putExtra("member_type", d.getTier().getCode());
            intent.putExtra("barcode_number", d.getBarcode());
            a(intent);
        }
    }

    public void onPerkTypeOneBtnClick()
    {
        b("shoe");
    }

    public void onPerkTypeTwoBtnClick()
    {
        b("bra");
    }

    public void onStartShopNowBtnClick()
    {
        t t1 = a(i());
        if (t1 != null)
        {
            t1.c(new as(), "HomeFragment");
        }
    }
}
