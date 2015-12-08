// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.a.a.a.a.f;
import org.a.a.a.a.g;
import org.a.a.a.l;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProduct, LabsSize, LabsFlavor, LabsVariant, 
//            LabsTopping, LabsSide

public class LabsProductLine
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED = "RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED";
    public static final String TAG = com/dominos/android/sdk/core/models/LabsProductLine.getSimpleName();
    public static final String TOO_MANY_DIPPING_CUPS_ERROR_CODE = "TOO_MANY_DIPPING_CUPS_ERROR_CODE";
    public static final String TOO_MANY_SAUCES_SAND_SLICE_ERROR_CODE = "TOO_MANY_SAUCES_SAND_SLICE_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_LEFT_ERROR_CODE = "TOO_MANY_TOPPINGS_LEFT_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_PASTA_ERROR_CODE = "TOO_MANY_TOPPINGS_PASTA_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_RIGHT_ERROR_CODE = "TOO_MANY_TOPPINGS_RIGHT_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_SAND_ERROR_CODE = "TOO_MANY_TOPPINGS_SAND_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_SAND_SLICE_ERROR_CODE = "TOO_MANY_TOPPINGS_SAND_SLICE_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_SAUCE_ERROR_CODE = "TOO_MANY_TOPPINGS_SAUCE_ERROR_CODE";
    public static final String TOO_MANY_TOPPINGS_WHOLE_ERROR_CODE = "TOO_MANY_TOPPINGS_WHOLE_ERROR_CODE";
    public static final String VALID_TOPPINGS_QUANTITY_CODE = "VALID_TOPPINGS_QUANTITY_CODE";
    private boolean autoRemove;
    private List availableSidesList;
    private List availableToppingsList;
    private Map defaultSidesMap;
    private Map defaultToppingsMap;
    private Map descriptionMap;
    private LabsFlavor flavor;
    private int id;
    private boolean needsCustomization;
    private double price;
    private LabsProduct product;
    private int quantity;
    private List sidesList;
    private LabsSize size;
    private int status;
    private List statusItemList;
    private List toppingsList;
    private LabsVariant variant;

    public LabsProductLine()
    {
        id = -1;
        price = -1D;
        quantity = 1;
        status = 0;
        product = new LabsProduct();
        size = new LabsSize();
        flavor = new LabsFlavor();
        toppingsList = new ArrayList();
        sidesList = new ArrayList();
        statusItemList = new ArrayList();
        descriptionMap = new HashMap();
    }

    private LabsProductLine(Parcel parcel)
    {
        setId(parcel.readInt());
        variant = (LabsVariant)parcel.readParcelable(com/dominos/android/sdk/core/models/LabsVariant.getClassLoader());
        product = (LabsProduct)parcel.readParcelable(com/dominos/android/sdk/core/models/LabsProduct.getClassLoader());
        size = (LabsSize)parcel.readParcelable(com/dominos/android/sdk/core/models/LabsSize.getClassLoader());
        flavor = (LabsFlavor)parcel.readParcelable(com/dominos/android/sdk/core/models/LabsFlavor.getClassLoader());
        setPrice(parcel.readDouble());
        setQuantity(parcel.readInt());
        Bundle bundle = parcel.readBundle();
        bundle.setClassLoader(com/dominos/android/sdk/core/models/LabsTopping.getClassLoader());
        toppingsList = bundle.getParcelableArrayList("toppings");
        bundle.setClassLoader(com/dominos/android/sdk/core/models/LabsSide.getClassLoader());
        sidesList = bundle.getParcelableArrayList("sides");
        int j = parcel.readInt();
        if (j > 0)
        {
            HashMap hashmap = new HashMap();
            for (int i = 0; i < j; i++)
            {
                String s = parcel.readString();
                String s1 = parcel.readString();
                descriptionMap.put(s, s1);
            }

            descriptionMap = hashmap;
        }
    }

    LabsProductLine(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public LabsProductLine(LabsProductLine labsproductline)
    {
        id = labsproductline.id;
        price = labsproductline.price;
        quantity = labsproductline.quantity;
        status = labsproductline.status;
        product = labsproductline.product;
        size = labsproductline.size;
        flavor = labsproductline.flavor;
        variant = labsproductline.variant;
        needsCustomization = labsproductline.needsCustomization;
        autoRemove = labsproductline.autoRemove;
        if (labsproductline.toppingsList != null)
        {
            toppingsList = new ArrayList(labsproductline.toppingsList);
        }
        if (labsproductline.sidesList != null)
        {
            sidesList = new ArrayList(labsproductline.sidesList);
        }
        if (labsproductline.statusItemList != null)
        {
            statusItemList = new ArrayList(labsproductline.statusItemList);
        }
        if (labsproductline.availableToppingsList != null)
        {
            availableToppingsList = new ArrayList(labsproductline.availableToppingsList);
        }
        if (labsproductline.availableSidesList != null)
        {
            availableSidesList = new ArrayList(labsproductline.availableSidesList);
        }
        if (labsproductline.defaultToppingsMap != null)
        {
            defaultToppingsMap = new HashMap(labsproductline.defaultToppingsMap);
        }
        if (labsproductline.defaultSidesMap != null)
        {
            defaultSidesMap = new HashMap(labsproductline.defaultSidesMap);
        }
        if (labsproductline.descriptionMap != null)
        {
            descriptionMap = new HashMap(labsproductline.descriptionMap);
        }
    }

    public LabsProductLine(LabsVariant labsvariant)
    {
        variant = labsvariant;
    }

    private void addMissingDefaultToppings(List list, List list1, List list2)
    {
        if (defaultToppingsMap != null)
        {
            Iterator iterator = defaultToppingsMap.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (String)iterator.next();
                if (!containsTopping(((String) (obj)), list, list1, list2) && !((LabsTopping)defaultToppingsMap.get(obj)).isCheese())
                {
                    obj = new LabsTopping((LabsTopping)defaultToppingsMap.get(obj));
                    ((LabsTopping) (obj)).reset();
                    list.add(obj);
                }
            }
        }
    }

    private double adjustQtyForCheese(double d)
    {
        double d1 = 2D;
        if (d == 3D)
        {
            d = d1;
        } else
        if (d == 2D)
        {
            d = 1.0D;
        } else
        if (d == 0.5D)
        {
            d = 0.5D;
        } else
        {
            d = 0.0D;
        }
        d1 = d;
        if (isPanPizza())
        {
            d1 = d + 1.0D;
        }
        return d1;
    }

    private boolean containsTopping(String s, List list, List list1, List list2)
    {
label0:
        {
            for (list = list.iterator(); list.hasNext();)
            {
                if (l.a(s, ((LabsTopping)list.next()).getCode()))
                {
                    return true;
                }
            }

            if (list1 == null)
            {
                break label0;
            }
            list = list1.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
            } while (!l.a(s, ((LabsTopping)list.next()).getCode()));
            return true;
        }
label1:
        {
            if (list2 == null)
            {
                break label1;
            }
            list = list2.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break label1;
                }
            } while (!l.a(s, ((LabsTopping)list.next()).getCode()));
            return true;
        }
        return false;
    }

    private int getNoOfSauces()
    {
        Iterator iterator = getToppingsList().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsTopping labstopping = (LabsTopping)iterator.next();
            if (labstopping.isSauce() && labstopping.isToppingAdded())
            {
                i++;
            }
        } while (true);
        return i;
    }

    private double getOptionQty()
    {
        double d1;
        Iterator iterator = toppingsList.iterator();
        d1 = 0.0D;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                Iterator iterator1 = labstopping.getOptionKeyList().iterator();
                double d = d1;
                do
                {
                    d1 = d;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if (!labstopping.isSauce())
                    {
                        double d2 = labstopping.getQuantityForPart(s);
                        d1 = d2;
                        if (labstopping.getCode().equalsIgnoreCase("C"))
                        {
                            d1 = adjustQtyForCheese(d2);
                        }
                        d += d1;
                    }
                } while (true);
            }
        } while (true);
        return d1;
    }

    private double getOptionQtyLeft()
    {
        double d1;
        Iterator iterator = toppingsList.iterator();
        d1 = 0.0D;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                Iterator iterator1 = labstopping.getOptionKeyList().iterator();
                double d = d1;
                do
                {
                    d1 = d;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if ((StringHelper.equals(s, "1/2") || StringHelper.equals(s, "1/1")) && !labstopping.isSauce())
                    {
                        double d2 = labstopping.getQuantityForPart(s);
                        d1 = d2;
                        if (labstopping.getCode().equalsIgnoreCase("C"))
                        {
                            d1 = adjustQtyForCheese(d2);
                        }
                        d += d1;
                    }
                } while (true);
            }
        } while (true);
        return d1;
    }

    private double getOptionQtyRight()
    {
        double d1;
        Iterator iterator = toppingsList.iterator();
        d1 = 0.0D;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                Iterator iterator1 = labstopping.getOptionKeyList().iterator();
                double d = d1;
                do
                {
                    d1 = d;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if ((StringHelper.equals(s, "2/2") || StringHelper.equals(s, "1/1")) && !labstopping.isSauce())
                    {
                        double d2 = labstopping.getQuantityForPart(s);
                        d1 = d2;
                        if (labstopping.getCode().equalsIgnoreCase("C"))
                        {
                            d1 = adjustQtyForCheese(d2);
                        }
                        d += d1;
                    }
                } while (true);
            }
        } while (true);
        return d1;
    }

    private double getOptionQtyWhole()
    {
        double d1;
        Iterator iterator = toppingsList.iterator();
        d1 = 0.0D;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                Iterator iterator1 = labstopping.getOptionKeyList().iterator();
                double d = d1;
                do
                {
                    d1 = d;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if (StringHelper.equals(s, "1/1") && !labstopping.isSauce())
                    {
                        double d2 = labstopping.getQuantityForPart(s);
                        d1 = d2;
                        if (labstopping.getCode().equalsIgnoreCase("C"))
                        {
                            d1 = adjustQtyForCheese(d2);
                        }
                        d += d1;
                    }
                } while (true);
            }
        } while (true);
        return d1;
    }

    private String getToppingAlternateName(LabsTopping labstopping, HashMap hashmap)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(labstopping.getName());
        if (labstopping.getQuantityForPart(labstopping.getPartWithQuantity()) != 1.0D)
        {
            stringbuilder.append(" (").append((String)hashmap.get(Double.valueOf(labstopping.getQuantityForPart(labstopping.getPartWithQuantity())))).append(")");
        }
        return StringHelper.trim(stringbuilder.toString());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsProductLine))
            {
                return false;
            }
            obj = (LabsProductLine)obj;
            if (quantity != ((LabsProductLine) (obj)).quantity)
            {
                return false;
            }
            if (sidesList == null ? ((LabsProductLine) (obj)).sidesList != null : !sidesList.equals(((LabsProductLine) (obj)).sidesList))
            {
                return false;
            }
            if (toppingsList == null ? ((LabsProductLine) (obj)).toppingsList != null : !toppingsList.equals(((LabsProductLine) (obj)).toppingsList))
            {
                return false;
            }
            if (variant == null ? ((LabsProductLine) (obj)).variant != null : !variant.equals(((LabsProductLine) (obj)).variant))
            {
                return false;
            }
        }
        return true;
    }

    public List getAvailableSidesList()
    {
        return availableSidesList;
    }

    public List getAvailableToppingsList()
    {
        return availableToppingsList;
    }

    public String getCode()
    {
        if (variant != null)
        {
            return variant.getCode();
        } else
        {
            return "";
        }
    }

    public Map getDefaultSidesMap()
    {
        return defaultSidesMap;
    }

    public Map getDefaultToppingsMap()
    {
        return defaultToppingsMap;
    }

    public Map getDescriptionMap()
    {
        return descriptionMap;
    }

    public LabsFlavor getFlavor()
    {
        return flavor;
    }

    public String getFormattedFlavor()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (size != null)
        {
            stringbuilder.append(size.getName());
        }
        if (flavor != null)
        {
            if (size != null)
            {
                stringbuilder.append(" - ");
            }
            stringbuilder.append(flavor.getName());
        }
        if (stringbuilder.length() == 0)
        {
            if (variant != null)
            {
                return variant.getName();
            } else
            {
                return "Null Variant!";
            }
        } else
        {
            return stringbuilder.toString();
        }
    }

    public String getFormattedNameFordSync()
    {
        String s1 = getFormattedFlavor();
        String s;
        if (product != null)
        {
            s = product.getName();
        } else
        {
            s = "Null Product!";
        }
        return String.format("%s %s", new Object[] {
            s1, s
        });
    }

    public String getFormattedPrice()
    {
        if (price == -1D)
        {
            return "$-.--";
        } else
        {
            return String.format("$%.2f", new Object[] {
                Double.valueOf(price)
            });
        }
    }

    public int getId()
    {
        return id;
    }

    public int getMaxDippingCups()
    {
        int j;
        if (defaultSidesMap != null)
        {
            Iterator iterator = defaultSidesMap.keySet().iterator();
            int i = 0;
            do
            {
                j = i;
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                i = ((LabsSide)defaultSidesMap.get(s)).getDefaultQuantity() + i;
            } while (true);
        } else
        {
            j = 0;
        }
        return j;
    }

    public String getName()
    {
        if (variant != null)
        {
            return variant.getName();
        }
        if (product != null)
        {
            return product.getName();
        } else
        {
            return "";
        }
    }

    public String getOptionDescription(HashMap hashmap, String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (product.getPartCount() == 2)
        {
            Object obj = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            if (toppingsList != null)
            {
                for (Iterator iterator = toppingsList.iterator(); iterator.hasNext();)
                {
                    LabsTopping labstopping2 = (LabsTopping)iterator.next();
                    Iterator iterator1 = labstopping2.getOptionKeyList().iterator();
                    while (iterator1.hasNext()) 
                    {
                        String s3 = (String)iterator1.next();
                        if (StringHelper.equals(s3, "1/1"))
                        {
                            if (labstopping2.getQuantityForPart(s3) > 0.0D)
                            {
                                ((List) (obj)).add(labstopping2);
                            } else
                            if (labstopping2.isCheese() && !labstopping2.isToppingAdded())
                            {
                                ((List) (obj)).add(labstopping2);
                            }
                        }
                        if (StringHelper.equals(s3, "1/2"))
                        {
                            if (labstopping2.getQuantityForPart(s3) > 0.0D)
                            {
                                LabsTopping labstopping3 = new LabsTopping(labstopping2);
                                labstopping3.reset();
                                labstopping3.setQuantityForPart(s3, labstopping2.getQuantityForPart(s3));
                                arraylist1.add(labstopping3);
                            } else
                            if (labstopping2.isCheese() && labstopping2.getQuantityForPart("2/2") > 0.0D)
                            {
                                LabsTopping labstopping5 = new LabsTopping(labstopping2);
                                labstopping5.reset();
                                labstopping5.setQuantityForPart(s3, labstopping2.getQuantityForPart(s3));
                                arraylist1.add(labstopping5);
                            }
                        }
                        if (StringHelper.equals(s3, "2/2"))
                        {
                            if (labstopping2.getQuantityForPart(s3) > 0.0D)
                            {
                                LabsTopping labstopping4 = new LabsTopping(labstopping2);
                                labstopping4.reset();
                                labstopping4.setQuantityForPart(s3, labstopping2.getQuantityForPart(s3));
                                arraylist.add(labstopping4);
                            } else
                            if (labstopping2.isCheese() && labstopping2.getQuantityForPart("1/2") > 0.0D)
                            {
                                LabsTopping labstopping6 = new LabsTopping(labstopping2);
                                labstopping6.reset();
                                labstopping6.setQuantityForPart(s3, labstopping2.getQuantityForPart(s3));
                                arraylist.add(labstopping6);
                            }
                        }
                    }
                }

            }
            addMissingDefaultToppings(((List) (obj)), arraylist1, arraylist);
            obj = ((List) (obj)).iterator();
            boolean flag = true;
            while (((Iterator) (obj)).hasNext()) 
            {
                LabsTopping labstopping1 = (LabsTopping)((Iterator) (obj)).next();
                if (flag)
                {
                    stringbuilder.append(s);
                    if (labstopping1.isCheese() || getDefaultToppingsMap().containsKey(labstopping1.getCode()))
                    {
                        stringbuilder.append(getToppingAlternateName(labstopping1, hashmap));
                    } else
                    {
                        stringbuilder.append(labstopping1.getFormattedName(hashmap));
                    }
                    flag = false;
                } else
                {
                    stringbuilder.append(", ");
                    if (labstopping1.isCheese() || getDefaultToppingsMap().containsKey(labstopping1.getCode()))
                    {
                        stringbuilder.append(getToppingAlternateName(labstopping1, hashmap));
                    } else
                    {
                        stringbuilder.append(labstopping1.getFormattedName(hashmap));
                    }
                }
            }
            s = arraylist1.iterator();
            flag = true;
            while (s.hasNext()) 
            {
                LabsTopping labstopping = (LabsTopping)s.next();
                if (flag)
                {
                    stringbuilder.append("\n");
                    stringbuilder.append(s1);
                    if (labstopping.isCheese())
                    {
                        stringbuilder.append(getToppingAlternateName(labstopping, hashmap));
                    } else
                    {
                        stringbuilder.append(labstopping.getFormattedName(hashmap));
                    }
                    flag = false;
                } else
                {
                    stringbuilder.append(", ");
                    if (labstopping.isCheese())
                    {
                        stringbuilder.append(getToppingAlternateName(labstopping, hashmap));
                    } else
                    {
                        stringbuilder.append(labstopping.getFormattedName(hashmap));
                    }
                }
            }
            s = arraylist.iterator();
            flag = true;
            while (s.hasNext()) 
            {
                s1 = (LabsTopping)s.next();
                if (flag)
                {
                    stringbuilder.append("\n");
                    stringbuilder.append(s2);
                    if (s1.isCheese())
                    {
                        stringbuilder.append(getToppingAlternateName(s1, hashmap));
                    } else
                    {
                        stringbuilder.append(s1.getFormattedName(hashmap));
                    }
                    flag = false;
                } else
                {
                    stringbuilder.append(", ");
                    if (s1.isCheese())
                    {
                        stringbuilder.append(getToppingAlternateName(s1, hashmap));
                    } else
                    {
                        stringbuilder.append(s1.getFormattedName(hashmap));
                    }
                }
            }
        } else
        if (toppingsList != null)
        {
            boolean flag1 = true;
            s = new ArrayList();
            for (s1 = toppingsList.iterator(); s1.hasNext(); s.add((LabsTopping)s1.next())) { }
            addMissingDefaultToppings(s, null, null);
            for (s = s.iterator(); s.hasNext();)
            {
                s1 = (LabsTopping)s.next();
                if (flag1)
                {
                    stringbuilder.append(getToppingAlternateName(s1, hashmap));
                    flag1 = false;
                } else
                {
                    stringbuilder.append(", ");
                    stringbuilder.append(getToppingAlternateName(s1, hashmap));
                }
            }

        }
        if (sidesList != null)
        {
            boolean flag2;
            if (toppingsList == null || toppingsList.isEmpty())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            hashmap = sidesList.iterator();
            do
            {
                if (!hashmap.hasNext())
                {
                    break;
                }
                s = (LabsSide)hashmap.next();
                if (s.getQuantityForPart("1/1") > 0.0D)
                {
                    if (flag2)
                    {
                        stringbuilder.append(s.getName());
                        flag2 = false;
                    } else
                    {
                        stringbuilder.append(", ");
                        stringbuilder.append(s.getName());
                    }
                }
            } while (true);
        }
        return stringbuilder.toString();
    }

    public double getOptionQtySandSlice()
    {
        Iterator iterator = toppingsList.iterator();
        double d = 0.0D;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsTopping labstopping = (LabsTopping)iterator.next();
            String s = labstopping.getCode();
            if (!labstopping.isSauce() && !s.equalsIgnoreCase("C") && !s.equalsIgnoreCase("Pv"))
            {
                d += labstopping.getQuantityForPart(labstopping.getPartWithQuantity());
            }
        } while (true);
        return d;
    }

    public double getPrice()
    {
        return price;
    }

    public LabsProduct getProduct()
    {
        return product;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public List getSidesList()
    {
        return sidesList;
    }

    public LabsSize getSize()
    {
        return size;
    }

    public int getStatus()
    {
        return status;
    }

    public List getStatusItemList()
    {
        return statusItemList;
    }

    public List getToppingsList()
    {
        return toppingsList;
    }

    public LabsVariant getVariant()
    {
        return variant;
    }

    public boolean hasOptions()
    {
        return availableSidesList != null && availableSidesList.size() > 0 || availableToppingsList != null && availableToppingsList.size() > 0;
    }

    public boolean hasSides()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (availableSidesList != null)
        {
            flag = flag1;
            if (availableSidesList.size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean hasToppings()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (availableToppingsList != null)
        {
            flag = flag1;
            if (availableToppingsList.size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        int i1;
        if (variant == null)
        {
            i = 0;
        } else
        {
            i = variant.hashCode();
        }
        i1 = quantity;
        if (toppingsList != null)
        {
            j = toppingsList.hashCode();
        } else
        {
            j = 0;
        }
        if (sidesList != null)
        {
            k = sidesList.hashCode();
        }
        return (j + (i * 31 + i1) * 31) * 31 + k;
    }

    public boolean isAutoRemove()
    {
        return autoRemove;
    }

    public boolean isBuildYourOwnHoagie()
    {
        if (product != null)
        {
            return product.getCode().equalsIgnoreCase("S_HGBYO");
        } else
        {
            return false;
        }
    }

    public boolean isBuildYourOwnPasta()
    {
        if (product != null)
        {
            return product.getCode().equalsIgnoreCase("S_BUILD");
        } else
        {
            return false;
        }
    }

    public boolean isBuildYourOwnSandwichSlide()
    {
        if (product != null)
        {
            return product.getCode().equalsIgnoreCase("S_BUILD2");
        } else
        {
            return false;
        }
    }

    public boolean isDessert()
    {
        if (product != null)
        {
            return product.getProductType().equalsIgnoreCase("Dessert");
        } else
        {
            return false;
        }
    }

    public boolean isEqualTo(Object obj)
    {
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        if (obj == null || !(obj instanceof LabsProductLine))
        {
            return false;
        }
        obj = (LabsProductLine)obj;
        if (sidesList == null ? ((LabsProductLine) (obj)).sidesList != null : !sidesList.equals(((LabsProductLine) (obj)).sidesList))
        {
            return false;
        }
        if (toppingsList == null)
        {
            return ((LabsProductLine) (obj)).toppingsList == null;
        }
        iterator = toppingsList.iterator();
_L2:
        boolean flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        LabsTopping labstopping = (LabsTopping)iterator.next();
        Iterator iterator1 = ((LabsProductLine) (obj)).toppingsList.iterator();
        LabsTopping labstopping1;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_194;
            }
            labstopping1 = (LabsTopping)iterator1.next();
        } while (!labstopping.getCode().equals(labstopping1.getCode()));
        flag = true;
_L3:
        if (!flag)
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return variant == null ? ((LabsProductLine) (obj)).variant != null : !variant.equals(((LabsProductLine) (obj)).variant);
        flag = false;
          goto _L3
    }

    public boolean isErrorStatus()
    {
        return status < 0;
    }

    public boolean isNeedsCustomization()
    {
        return needsCustomization;
    }

    public boolean isPanPizza()
    {
        if (flavor != null)
        {
            return flavor.getCode().equalsIgnoreCase("NPAN");
        } else
        {
            return false;
        }
    }

    public boolean isSalad()
    {
        if (product != null)
        {
            return product.getProductType().equalsIgnoreCase("GSalad");
        } else
        {
            return false;
        }
    }

    public void loadDefaultOptions()
    {
        if (toppingsList == null)
        {
            toppingsList = new ArrayList();
        }
        HashMap hashmap = new HashMap();
        LabsTopping labstopping;
        for (Iterator iterator = toppingsList.iterator(); iterator.hasNext(); hashmap.put(labstopping.getCode(), labstopping))
        {
            labstopping = (LabsTopping)iterator.next();
        }

        if (getDefaultToppingsMap() != null)
        {
            Iterator iterator1 = getDefaultToppingsMap().keySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator1.next();
                if (!hashmap.containsKey(obj))
                {
                    obj = (LabsTopping)getDefaultToppingsMap().get(obj);
                    ((LabsTopping) (obj)).setQuantityForPart("1/1", ((LabsTopping) (obj)).getDefaultQuantity());
                    toppingsList.add(obj);
                }
            } while (true);
        }
        if (sidesList == null)
        {
            sidesList = new ArrayList();
        }
        hashmap = new HashMap();
        LabsSide labsside;
        for (Iterator iterator2 = sidesList.iterator(); iterator2.hasNext(); hashmap.put(labsside.getCode(), labsside))
        {
            labsside = (LabsSide)iterator2.next();
        }

        if (getDefaultSidesMap() != null)
        {
            Iterator iterator3 = getDefaultSidesMap().keySet().iterator();
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                Object obj1 = (String)iterator3.next();
                if (!hashmap.containsKey(obj1))
                {
                    obj1 = (LabsSide)getDefaultSidesMap().get(obj1);
                    ((LabsSide) (obj1)).setQuantityForPart("1/1", ((LabsSide) (obj1)).getDefaultQuantity());
                    sidesList.add(obj1);
                }
            } while (true);
        }
    }

    public void resetToDefaultOptions()
    {
        setQuantity(1);
        if (toppingsList == null)
        {
            toppingsList = new ArrayList();
        }
        toppingsList.clear();
        Object obj;
        for (Iterator iterator = getDefaultToppingsMap().keySet().iterator(); iterator.hasNext(); toppingsList.add(obj))
        {
            obj = (String)iterator.next();
            obj = (LabsTopping)getDefaultToppingsMap().get(obj);
            ((LabsTopping) (obj)).setQuantityForPart("1/1", ((LabsTopping) (obj)).getDefaultQuantity());
        }

        if (sidesList == null)
        {
            sidesList = new ArrayList();
        }
        sidesList.clear();
        Object obj1;
        for (Iterator iterator1 = getDefaultSidesMap().keySet().iterator(); iterator1.hasNext(); sidesList.add(obj1))
        {
            obj1 = (String)iterator1.next();
            obj1 = (LabsSide)getDefaultSidesMap().get(obj1);
            ((LabsSide) (obj1)).setQuantityForPart("1/1", ((LabsSide) (obj1)).getDefaultQuantity());
        }

    }

    public void setAutoRemove(boolean flag)
    {
        autoRemove = flag;
    }

    public void setAvailableSidesList(List list)
    {
        availableSidesList = list;
    }

    public void setAvailableToppingsList(List list)
    {
        availableToppingsList = list;
    }

    public void setDefaultSidesMap(Map map)
    {
        defaultSidesMap = map;
    }

    public void setDefaultToppingsMap(Map map)
    {
        defaultToppingsMap = map;
    }

    public void setDescriptionMap(Map map)
    {
        descriptionMap = map;
    }

    public void setFlavor(LabsFlavor labsflavor)
    {
        flavor = labsflavor;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setNeedsCustomization(boolean flag)
    {
        needsCustomization = flag;
    }

    public void setPrice(double d)
    {
        price = d;
    }

    public void setProduct(LabsProduct labsproduct)
    {
        product = labsproduct;
    }

    public void setQuantity(int i)
    {
        quantity = i;
    }

    public void setSidesList(List list)
    {
        sidesList = list;
    }

    public void setSize(LabsSize labssize)
    {
        size = labssize;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStatusItemList(List list)
    {
        statusItemList = list;
    }

    public void setToppingsList(List list)
    {
        toppingsList = list;
    }

    public void setVariant(LabsVariant labsvariant)
    {
        variant = labsvariant;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public boolean toppingsDiffer(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || !(obj instanceof LabsProductLine))
        {
            return false;
        }
        obj = (LabsProductLine)obj;
        if (toppingsList != null) goto _L4; else goto _L3
_L3:
        if (((LabsProductLine) (obj)).toppingsList != null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (!toppingsList.equals(((LabsProductLine) (obj)).toppingsList))
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String validateSidesOptionsQuantity()
    {
        if (product.getMaxOptionQty() > 0) goto _L2; else goto _L1
_L1:
        return "VALID_TOPPINGS_QUANTITY_CODE";
_L2:
        if (!product.getProductType().equals("Pasta"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (getOptionQty() > (double)product.getMaxOptionQty())
        {
            return "TOO_MANY_TOPPINGS_PASTA_ERROR_CODE";
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!product.getProductType().equals("Sandwich"))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = product.getCode().equals("S_BUILD2");
        if (flag)
        {
            if (flag && getNoOfSauces() > 1)
            {
                return "TOO_MANY_SAUCES_SAND_SLICE_ERROR_CODE";
            }
            if (getOptionQtySandSlice() > 3D)
            {
                return "TOO_MANY_TOPPINGS_SAND_SLICE_ERROR_CODE";
            }
        } else
        {
            if (isBuildYourOwnHoagie() && getNoOfSauces() > product.getMaxSauceQty())
            {
                return "TOO_MANY_TOPPINGS_SAUCE_ERROR_CODE";
            }
            if (getOptionQty() > (double)product.getMaxOptionQty())
            {
                return "TOO_MANY_TOPPINGS_SAND_ERROR_CODE";
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (getOptionQtyWhole() > (double)product.getMaxOptionQty())
        {
            return "TOO_MANY_TOPPINGS_WHOLE_ERROR_CODE";
        }
        if (getOptionQtyLeft() > (double)product.getMaxOptionQty())
        {
            return "TOO_MANY_TOPPINGS_LEFT_ERROR_CODE";
        }
        if (getOptionQtyRight() > (double)product.getMaxOptionQty())
        {
            return "TOO_MANY_TOPPINGS_RIGHT_ERROR_CODE";
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(getId());
        parcel.writeParcelable(variant, i);
        parcel.writeParcelable(product, i);
        parcel.writeParcelable(size, i);
        parcel.writeParcelable(flavor, i);
        parcel.writeDouble(price);
        parcel.writeInt(quantity);
        Bundle bundle = new Bundle();
        Object obj;
        if (toppingsList != null)
        {
            obj = (ArrayList)toppingsList;
        } else
        {
            obj = new ArrayList();
        }
        bundle.putParcelableArrayList("toppings", ((ArrayList) (obj)));
        if (sidesList != null)
        {
            obj = (ArrayList)sidesList;
        } else
        {
            obj = new ArrayList();
        }
        bundle.putParcelableArrayList("sides", ((ArrayList) (obj)));
        if (descriptionMap != null && descriptionMap.size() > 0)
        {
            parcel.writeInt(descriptionMap.size());
            String s;
            for (obj = descriptionMap.keySet().iterator(); ((Iterator) (obj)).hasNext(); parcel.writeString((String)descriptionMap.get(s)))
            {
                s = (String)((Iterator) (obj)).next();
                parcel.writeString(s);
            }

        }
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsProductLine createFromParcel(Parcel parcel)
        {
            return new LabsProductLine(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsProductLine[] newArray(int i)
        {
            return new LabsProductLine[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
