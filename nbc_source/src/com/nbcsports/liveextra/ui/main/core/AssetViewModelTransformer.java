// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.AppSharedPreferences;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetFilter, AssetViewModel

public class AssetViewModelTransformer extends ContextWrapper
{

    public AssetViewModelTransformer(Context context)
    {
        super(context);
    }

    private void applyAuthFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;

            public boolean evaluate(Asset asset)
            {
                return asset.isFree();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        });
    }

    private void applyBlackoutFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;

            public boolean evaluate(Asset asset)
            {
                return !asset.hasBlackout();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        });
    }

    private void applyDateFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;

            public boolean evaluate(Asset asset)
            {
                return asset.isLive() || asset.isFuture() && asset.getStart().getDateTime().isAfter(DateTime.now());
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        });
    }

    private void applyExpirationFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;

            public boolean evaluate(Asset asset)
            {
                return !asset.isExpired();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        });
    }

    private void applyGeoFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;
            final GeoRequestResponse val$lastKnownGeoLocation;

            public boolean evaluate(Asset asset)
            {
label0:
                {
                    String s = AppSharedPreferences.getSetting(getApplicationContext(), "PREF_SELECTED_DMA");
                    if (!TextUtils.isEmpty(asset.getRsndma()))
                    {
                        if (s == null)
                        {
                            s = "";
                        }
                        if (!asset.isInMarket(s))
                        {
                            if (lastKnownGeoLocation != null)
                            {
                                s = lastKnownGeoLocation.NielsonDMA;
                            } else
                            {
                                s = "";
                            }
                            if (!asset.isInMarket(s))
                            {
                                break label0;
                            }
                        }
                    }
                    return true;
                }
                return false;
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                lastKnownGeoLocation = georequestresponse;
                super();
            }
        });
    }

    private void applyNowPlayingFilter(List list)
    {
    }

    private void applyPlatformFilter(List list)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;

            public boolean evaluate(Asset asset)
            {
                Resources resources = getResources();
                return asset.isPlatformEnabled(resources.getString(0x7f070033), resources.getString(0x7f070032));
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        });
    }

    private void applySportFilter(List list, final Sport sport)
    {
        CollectionUtils.filter(list, new Predicate() {

            final AssetViewModelTransformer this$0;
            final Sport val$sport;

            public boolean evaluate(Asset asset)
            {
                if (asset == null || asset.getSportCode() == null)
                {
                    return false;
                } else
                {
                    return asset.getSportCode().equals(sport.getCode());
                }
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                sport = sport1;
                super();
            }
        });
    }

    public List transform(List list, Sport sport, final SortOrder order, EnumSet enumset)
    {
        EnumSet enumset1 = enumset;
        if (enumset == null)
        {
            enumset1 = EnumSet.noneOf(com/nbcsports/liveextra/ui/main/core/AssetFilter);
        }
        applyPlatformFilter(list);
        if (sport != null)
        {
            applySportFilter(list, sport);
        }
        if (enumset1.contains(AssetFilter.RSN))
        {
            applyGeoFilter(list);
        }
        if (enumset1.contains(AssetFilter.PAST_EVENTS))
        {
            applyDateFilter(list);
        }
        if (!list.isEmpty() && order != SortOrder.NONE)
        {
            Collections.sort(list, new Comparator() {

                final AssetViewModelTransformer this$0;
                final SortOrder val$order;

                public int compare(Asset asset, Asset asset1)
                {
                    int i;
                    int j;
                    if (asset.isLive())
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (asset1.isLive())
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    if (i < j)
                    {
                        return 1;
                    }
                    if (i > j)
                    {
                        return -1;
                    }
                    if (order == SortOrder.ASC)
                    {
                        return asset.getStart().getDateTime().compareTo(asset1.getStart().getDateTime());
                    } else
                    {
                        return asset1.getStart().getDateTime().compareTo(asset.getStart().getDateTime());
                    }
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((Asset)obj, (Asset)obj1);
                }

            
            {
                this$0 = AssetViewModelTransformer.this;
                order = sortorder;
                super();
            }
            });
        }
        return new ArrayList(CollectionUtils.collect(list, new Transformer() {

            final AssetViewModelTransformer this$0;

            public AssetViewModel transform(Asset asset)
            {
                return new AssetViewModel(asset);
            }

            public volatile Object transform(Object obj)
            {
                return transform((Asset)obj);
            }

            
            {
                this$0 = AssetViewModelTransformer.this;
                super();
            }
        }));
    }

    public List transform(List list, SortOrder sortorder)
    {
        return transform(list, null, sortorder, null);
    }

    public List transform(List list, SortOrder sortorder, EnumSet enumset)
    {
        return transform(((List) (new ArrayList(list))), null, sortorder, enumset);
    }

    public List transform(Set set, Sport sport, SortOrder sortorder, EnumSet enumset)
    {
        return transform(((List) (new ArrayList(set))), sport, sortorder, enumset);
    }

    public List transform(Set set, SortOrder sortorder)
    {
        return transform(((List) (new ArrayList(set))), null, sortorder, null);
    }

    public List transform(Set set, SortOrder sortorder, EnumSet enumset)
    {
        return transform(((List) (new ArrayList(set))), null, sortorder, enumset);
    }
}
