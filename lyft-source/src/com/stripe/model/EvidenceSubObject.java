// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public final class EvidenceSubObject extends StripeObject
{

    protected String accessActivityLog;
    protected String billingAddress;
    protected String cancellationPolicy;
    protected String cancellationPolicyDisclosure;
    protected String cancellationRebuttal;
    protected String customerCommunication;
    protected String customerEmailAddress;
    protected String customerName;
    protected String customerPurchaseIp;
    protected String customerSignature;
    protected String duplicateChargeDocumentation;
    protected String duplicateChargeExplanation;
    protected String duplicateChargeId;
    protected String productDescription;
    protected String receipt;
    protected String refundPolicy;
    protected String refundPolicyDisclosure;
    protected String refundRefusalExplanation;
    protected String serviceDate;
    protected String serviceDocumentation;
    protected String shippingAddress;
    protected String shippingDate;
    protected String shippingDocumentation;
    protected String shippingTrackingNumber;
    protected String uncategorizedFile;
    protected String uncategorizedText;

    public EvidenceSubObject()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (EvidenceSubObject)obj;
            if (accessActivityLog == null ? ((EvidenceSubObject) (obj)).accessActivityLog != null : !accessActivityLog.equals(((EvidenceSubObject) (obj)).accessActivityLog))
            {
                return false;
            }
            if (billingAddress == null ? ((EvidenceSubObject) (obj)).billingAddress != null : !billingAddress.equals(((EvidenceSubObject) (obj)).billingAddress))
            {
                return false;
            }
            if (cancellationPolicy == null ? ((EvidenceSubObject) (obj)).cancellationPolicy != null : !cancellationPolicy.equals(((EvidenceSubObject) (obj)).cancellationPolicy))
            {
                return false;
            }
            if (cancellationPolicyDisclosure == null ? ((EvidenceSubObject) (obj)).cancellationPolicyDisclosure != null : !cancellationPolicyDisclosure.equals(((EvidenceSubObject) (obj)).cancellationPolicyDisclosure))
            {
                return false;
            }
            if (cancellationRebuttal == null ? ((EvidenceSubObject) (obj)).cancellationRebuttal != null : !cancellationRebuttal.equals(((EvidenceSubObject) (obj)).cancellationRebuttal))
            {
                return false;
            }
            if (customerCommunication == null ? ((EvidenceSubObject) (obj)).customerCommunication != null : !customerCommunication.equals(((EvidenceSubObject) (obj)).customerCommunication))
            {
                return false;
            }
            if (customerEmailAddress == null ? ((EvidenceSubObject) (obj)).customerEmailAddress != null : !customerEmailAddress.equals(((EvidenceSubObject) (obj)).customerEmailAddress))
            {
                return false;
            }
            if (customerName == null ? ((EvidenceSubObject) (obj)).customerName != null : !customerName.equals(((EvidenceSubObject) (obj)).customerName))
            {
                return false;
            }
            if (customerPurchaseIp == null ? ((EvidenceSubObject) (obj)).customerPurchaseIp != null : !customerPurchaseIp.equals(((EvidenceSubObject) (obj)).customerPurchaseIp))
            {
                return false;
            }
            if (customerSignature == null ? ((EvidenceSubObject) (obj)).customerSignature != null : !customerSignature.equals(((EvidenceSubObject) (obj)).customerSignature))
            {
                return false;
            }
            if (duplicateChargeDocumentation == null ? ((EvidenceSubObject) (obj)).duplicateChargeDocumentation != null : !duplicateChargeDocumentation.equals(((EvidenceSubObject) (obj)).duplicateChargeDocumentation))
            {
                return false;
            }
            if (duplicateChargeExplanation == null ? ((EvidenceSubObject) (obj)).duplicateChargeExplanation != null : !duplicateChargeExplanation.equals(((EvidenceSubObject) (obj)).duplicateChargeExplanation))
            {
                return false;
            }
            if (duplicateChargeId == null ? ((EvidenceSubObject) (obj)).duplicateChargeId != null : !duplicateChargeId.equals(((EvidenceSubObject) (obj)).duplicateChargeId))
            {
                return false;
            }
            if (productDescription == null ? ((EvidenceSubObject) (obj)).productDescription != null : !productDescription.equals(((EvidenceSubObject) (obj)).productDescription))
            {
                return false;
            }
            if (receipt == null ? ((EvidenceSubObject) (obj)).receipt != null : !receipt.equals(((EvidenceSubObject) (obj)).receipt))
            {
                return false;
            }
            if (refundPolicy == null ? ((EvidenceSubObject) (obj)).refundPolicy != null : !refundPolicy.equals(((EvidenceSubObject) (obj)).refundPolicy))
            {
                return false;
            }
            if (refundPolicyDisclosure == null ? ((EvidenceSubObject) (obj)).refundPolicyDisclosure != null : !refundPolicyDisclosure.equals(((EvidenceSubObject) (obj)).refundPolicyDisclosure))
            {
                return false;
            }
            if (refundRefusalExplanation == null ? ((EvidenceSubObject) (obj)).refundRefusalExplanation != null : !refundRefusalExplanation.equals(((EvidenceSubObject) (obj)).refundRefusalExplanation))
            {
                return false;
            }
            if (serviceDate == null ? ((EvidenceSubObject) (obj)).serviceDate != null : !serviceDate.equals(((EvidenceSubObject) (obj)).serviceDate))
            {
                return false;
            }
            if (serviceDocumentation == null ? ((EvidenceSubObject) (obj)).serviceDocumentation != null : !serviceDocumentation.equals(((EvidenceSubObject) (obj)).serviceDocumentation))
            {
                return false;
            }
            if (shippingAddress == null ? ((EvidenceSubObject) (obj)).shippingAddress != null : !shippingAddress.equals(((EvidenceSubObject) (obj)).shippingAddress))
            {
                return false;
            }
            if (shippingDate == null ? ((EvidenceSubObject) (obj)).shippingDate != null : !shippingDate.equals(((EvidenceSubObject) (obj)).shippingDate))
            {
                return false;
            }
            if (shippingDocumentation == null ? ((EvidenceSubObject) (obj)).shippingDocumentation != null : !shippingDocumentation.equals(((EvidenceSubObject) (obj)).shippingDocumentation))
            {
                return false;
            }
            if (shippingTrackingNumber == null ? ((EvidenceSubObject) (obj)).shippingTrackingNumber != null : !shippingTrackingNumber.equals(((EvidenceSubObject) (obj)).shippingTrackingNumber))
            {
                return false;
            }
            if (uncategorizedFile == null ? ((EvidenceSubObject) (obj)).uncategorizedFile != null : !uncategorizedFile.equals(((EvidenceSubObject) (obj)).uncategorizedFile))
            {
                return false;
            }
            if (uncategorizedText == null ? ((EvidenceSubObject) (obj)).uncategorizedText != null : !uncategorizedText.equals(((EvidenceSubObject) (obj)).uncategorizedText))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccessActivityLog()
    {
        return accessActivityLog;
    }

    public String getBillingAddress()
    {
        return billingAddress;
    }

    public String getCancellationPolicy()
    {
        return cancellationPolicy;
    }

    public String getCancellationPolicyDisclosure()
    {
        return cancellationPolicyDisclosure;
    }

    public String getCancellationRebuttal()
    {
        return cancellationRebuttal;
    }

    public String getCustomerCommunication()
    {
        return customerCommunication;
    }

    public String getCustomerEmailAddress()
    {
        return customerEmailAddress;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerPurchaseIp()
    {
        return customerPurchaseIp;
    }

    public String getCustomerSignature()
    {
        return customerSignature;
    }

    public String getDuplicateChargeDocumentation()
    {
        return duplicateChargeDocumentation;
    }

    public String getDuplicateChargeExplanation()
    {
        return duplicateChargeExplanation;
    }

    public String getDuplicateChargeId()
    {
        return duplicateChargeId;
    }

    public String getProductDescription()
    {
        return productDescription;
    }

    public String getReceipt()
    {
        return receipt;
    }

    public String getRefundPolicy()
    {
        return refundPolicy;
    }

    public String getRefundPolicyDisclosure()
    {
        return refundPolicyDisclosure;
    }

    public String getRefundRefusalExplanation()
    {
        return refundRefusalExplanation;
    }

    public String getServiceDate()
    {
        return serviceDate;
    }

    public String getServiceDocumentation()
    {
        return serviceDocumentation;
    }

    public String getShippingAddress()
    {
        return shippingAddress;
    }

    public String getShippingDate()
    {
        return shippingDate;
    }

    public String getShippingDocumentation()
    {
        return shippingDocumentation;
    }

    public String getShippingTrackingNumber()
    {
        return shippingTrackingNumber;
    }

    public String getUncategorizedFile()
    {
        return uncategorizedFile;
    }

    public String getUncategorizedText()
    {
        return uncategorizedText;
    }

    public int hashCode()
    {
        int j6 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        if (productDescription != null)
        {
            i = productDescription.hashCode();
        } else
        {
            i = 0;
        }
        if (customerName != null)
        {
            j = customerName.hashCode();
        } else
        {
            j = 0;
        }
        if (customerEmailAddress != null)
        {
            k = customerEmailAddress.hashCode();
        } else
        {
            k = 0;
        }
        if (customerPurchaseIp != null)
        {
            l = customerPurchaseIp.hashCode();
        } else
        {
            l = 0;
        }
        if (billingAddress != null)
        {
            i1 = billingAddress.hashCode();
        } else
        {
            i1 = 0;
        }
        if (receipt != null)
        {
            j1 = receipt.hashCode();
        } else
        {
            j1 = 0;
        }
        if (shippingAddress != null)
        {
            k1 = shippingAddress.hashCode();
        } else
        {
            k1 = 0;
        }
        if (shippingDate != null)
        {
            l1 = shippingDate.hashCode();
        } else
        {
            l1 = 0;
        }
        if (shippingTrackingNumber != null)
        {
            i2 = shippingTrackingNumber.hashCode();
        } else
        {
            i2 = 0;
        }
        if (customerSignature != null)
        {
            j2 = customerSignature.hashCode();
        } else
        {
            j2 = 0;
        }
        if (shippingDocumentation != null)
        {
            k2 = shippingDocumentation.hashCode();
        } else
        {
            k2 = 0;
        }
        if (accessActivityLog != null)
        {
            l2 = accessActivityLog.hashCode();
        } else
        {
            l2 = 0;
        }
        if (serviceDate != null)
        {
            i3 = serviceDate.hashCode();
        } else
        {
            i3 = 0;
        }
        if (serviceDocumentation != null)
        {
            j3 = serviceDocumentation.hashCode();
        } else
        {
            j3 = 0;
        }
        if (customerCommunication != null)
        {
            k3 = customerCommunication.hashCode();
        } else
        {
            k3 = 0;
        }
        if (duplicateChargeId != null)
        {
            l3 = duplicateChargeId.hashCode();
        } else
        {
            l3 = 0;
        }
        if (duplicateChargeExplanation != null)
        {
            i4 = duplicateChargeExplanation.hashCode();
        } else
        {
            i4 = 0;
        }
        if (duplicateChargeDocumentation != null)
        {
            j4 = duplicateChargeDocumentation.hashCode();
        } else
        {
            j4 = 0;
        }
        if (refundPolicy != null)
        {
            k4 = refundPolicy.hashCode();
        } else
        {
            k4 = 0;
        }
        if (refundPolicyDisclosure != null)
        {
            l4 = refundPolicyDisclosure.hashCode();
        } else
        {
            l4 = 0;
        }
        if (refundRefusalExplanation != null)
        {
            i5 = refundRefusalExplanation.hashCode();
        } else
        {
            i5 = 0;
        }
        if (cancellationPolicy != null)
        {
            j5 = cancellationPolicy.hashCode();
        } else
        {
            j5 = 0;
        }
        if (cancellationPolicyDisclosure != null)
        {
            k5 = cancellationPolicyDisclosure.hashCode();
        } else
        {
            k5 = 0;
        }
        if (cancellationRebuttal != null)
        {
            l5 = cancellationRebuttal.hashCode();
        } else
        {
            l5 = 0;
        }
        if (uncategorizedText != null)
        {
            i6 = uncategorizedText.hashCode();
        } else
        {
            i6 = 0;
        }
        if (uncategorizedFile != null)
        {
            j6 = uncategorizedFile.hashCode();
        }
        return (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j6;
    }

    public void setAccessActivityLog(String s)
    {
        accessActivityLog = s;
    }

    public void setBillingAddress(String s)
    {
        billingAddress = s;
    }

    public void setCancellationPolicy(String s)
    {
        cancellationPolicy = s;
    }

    public void setCancellationPolicyDisclosure(String s)
    {
        cancellationPolicyDisclosure = s;
    }

    public void setCancellationRebuttal(String s)
    {
        cancellationRebuttal = s;
    }

    public void setCustomerCommunication(String s)
    {
        customerCommunication = s;
    }

    public void setCustomerEmailAddress(String s)
    {
        customerEmailAddress = s;
    }

    public void setCustomerName(String s)
    {
        customerName = s;
    }

    public void setCustomerPurchaseIp(String s)
    {
        customerPurchaseIp = s;
    }

    public void setCustomerSignature(String s)
    {
        customerSignature = s;
    }

    public void setDuplicateChargeDocumentation(String s)
    {
        duplicateChargeDocumentation = s;
    }

    public void setDuplicateChargeExplanation(String s)
    {
        duplicateChargeExplanation = s;
    }

    public void setDuplicateChargeId(String s)
    {
        duplicateChargeId = s;
    }

    public void setProductDescription(String s)
    {
        productDescription = s;
    }

    public void setReceipt(String s)
    {
        receipt = s;
    }

    public void setRefundPolicy(String s)
    {
        refundPolicy = s;
    }

    public void setRefundPolicyDisclosure(String s)
    {
        refundPolicyDisclosure = s;
    }

    public void setRefundRefusalExplanation(String s)
    {
        refundRefusalExplanation = s;
    }

    public void setServiceDate(String s)
    {
        serviceDate = s;
    }

    public void setServiceDocumentation(String s)
    {
        serviceDocumentation = s;
    }

    public void setShippingAddress(String s)
    {
        shippingAddress = s;
    }

    public void setShippingDate(String s)
    {
        shippingDate = s;
    }

    public void setShippingDocumentation(String s)
    {
        shippingDocumentation = s;
    }

    public void setShippingTrackingNumber(String s)
    {
        shippingTrackingNumber = s;
    }

    public void setUncategorizedFile(String s)
    {
        uncategorizedFile = s;
    }

    public void setUncategorizedText(String s)
    {
        uncategorizedText = s;
    }
}
