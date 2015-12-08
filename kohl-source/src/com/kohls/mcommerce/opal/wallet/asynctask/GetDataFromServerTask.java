// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.RewardService;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.KohlsCash;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.DeletedKohlsCashFromRewardsIdCache;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            BaseAsyncTask

public abstract class GetDataFromServerTask extends BaseAsyncTask
{

    private boolean isToastShown;

    public GetDataFromServerTask(Context context)
    {
        super(context);
        isToastShown = true;
    }

    public GetDataFromServerTask(Context context, boolean flag)
    {
        super(context);
        isToastShown = true;
        isToastShown = flag;
    }

    private Set getNotDeletedKohlsCashIds(List list)
    {
        HashSet hashset = new HashSet();
        Set set = DeletedKohlsCashFromRewardsIdCache.get(mContext.getApplicationContext(), "deleted");
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            KohlsCash kohlscash = (KohlsCash)list.next();
            if (kohlscash != null && !TextUtils.isEmpty(kohlscash.getKohlsCashNumber()) && !set.contains(kohlscash))
            {
                hashset.add(kohlscash.getKohlsCashNumber());
            }
        } while (true);
        return hashset;
    }

    protected WalletResponse addRewardsCashToWallet(List list)
    {
        Object obj = getNotDeletedKohlsCashIds(list);
        HashSet hashset = new HashSet();
        getWalletData();
        if (obj == null || ((Set) (obj)).size() == 0)
        {
            list = null;
        } else
        {
            list = WalletCache.get(mContext.getApplicationContext(), "rpwallet");
            if (list == null || !list.isSuccess() || list.getWalletItems() == null)
            {
                return null;
            }
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                boolean flag1 = false;
                Iterator iterator = list.getWalletItems().iterator();
                boolean flag;
                do
                {
                    flag = flag1;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WalletItemResponse walletitemresponse1 = (WalletItemResponse)iterator.next();
                    if (TextUtils.isEmpty(s) || !s.equals(walletitemresponse1.getId()))
                    {
                        continue;
                    }
                    flag = true;
                    break;
                } while (true);
                if (!flag)
                {
                    hashset.add(s);
                }
            } while (true);
            if (hashset == null || hashset.size() == 0)
            {
                return null;
            }
            if (!canAccessNetwork())
            {
                return null;
            }
            list = (new WalletService(new WeakReference(mContext))).getWalletByBulkLookup(hashset);
            if (list == null || !list.isSuccess())
            {
                return null;
            }
            obj = (new WalletService(new WeakReference(mContext))).addWalletItems(list.getWalletItems(), true);
            if (hasErrors(((com.kohls.mcommerce.opal.wallet.rest.containers.WalletBaseResponse) (obj))).booleanValue() || ((WalletResponse) (obj)).getAddedItems() == null)
            {
                return null;
            }
            list = ((List) (obj));
            if (mContext != null)
            {
                list = ((WalletResponse) (obj)).getAddedItems().iterator();
label0:
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    WalletItemResponse walletitemresponse = (WalletItemResponse)list.next();
                    Iterator iterator1 = hashset.iterator();
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            continue label0;
                        }
                    } while (!((String)iterator1.next()).equals(walletitemresponse.getId()));
                    walletitemresponse.setTypeCode("loyalty");
                } while (true);
                ((WalletResponse) (obj)).setWalletItems(((WalletResponse) (obj)).getCurrentItems());
                getWalletData();
                return ((WalletResponse) (obj));
            }
        }
        return list;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient abstract Void doInBackground(Void avoid[]);

    protected abstract void doOnPostExecute();

    protected Boolean getWalletData()
    {
        boolean flag;
        if (retrieveWalletResponse() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        super.onPostExecute(void1);
        if (mContext != null)
        {
            ListenerManager.getInstance().setDataAvailable(true);
            doOnPostExecute();
        }
    }

    protected void onPreExecute()
    {
        ListenerManager.getInstance().setDataAvailable(false);
        super.onPreExecute();
    }

    protected LoyaltyProfileResponse retrieveLoyaltyResponse(boolean flag, boolean flag1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (mContext != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!canAccessNetwork(true))
        {
            break; /* Loop/switch isn't completed */
        }
label0:
        {
            obj1 = new RewardService(new WeakReference(mContext));
            String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref();
            if (!TextUtils.isEmpty(s))
            {
                obj = ((RewardService) (obj1)).getRewardData(s);
            }
            if (!hasErrors(((com.kohls.mcommerce.opal.wallet.rest.containers.WalletBaseResponse) (obj)), flag, flag1).booleanValue())
            {
                break label0;
            }
            if (((LoyaltyProfileResponse) (obj)).getHttpStatusCode() == 200)
            {
                try
                {
                    RewardCache.commit(mContext.getApplicationContext(), obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return null;
                }
                return null;
            }
        }
        if (true) goto _L1; else goto _L3
        obj1 = obj;
        if (mContext != null)
        {
            Appconfig.LOYALTY_RESPONSE_FROM_CACHE = false;
            RewardCache.commit(mContext.getApplicationContext(), obj);
            obj1 = obj;
        }
_L5:
        return ((LoyaltyProfileResponse) (obj1));
_L3:
        Appconfig.LOYALTY_RESPONSE_FROM_CACHE = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected WalletResponse retrieveWalletResponse()
    {
        Object obj1 = null;
        if (mContext != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        if (!canAccessNetwork(true))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj = new WalletService(new WeakReference(mContext));
        obj1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = ((WalletService) (obj)).getWalletbyEmail(null);
        } else
        {
            obj = ((WalletService) (obj)).getWalletData(((String) (obj1)));
        }
        if (!hasErrors(((com.kohls.mcommerce.opal.wallet.rest.containers.WalletBaseResponse) (obj)), true, isToastShown).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((WalletResponse) (obj)).getHttpStatusCode() == 200)
        {
            WalletCache.commit(mContext.getApplicationContext(), "rpwallet", obj);
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setWalletId(((WalletResponse) (obj)).getWalletId());
        obj1 = obj;
        if (mContext != null)
        {
            WalletCache.commit(mContext.getApplicationContext(), "rpwallet", obj);
            obj1 = obj;
        }
        return ((WalletResponse) (obj1));
    }
}
