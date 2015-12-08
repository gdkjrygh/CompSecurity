// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            AppDocDetails

public static final class cachedSize extends MessageNano
{

    public String appCategory[];
    public String appType;
    public String autoAcquireFreeAppIfHigherVersionAvailableTag[];
    public String certificateHash[];
    public Set certificateSet[];
    public int contentRating;
    public boolean declaresIab;
    public String developerEmail;
    public String developerName;
    public String developerWebsite;
    public boolean everExternallyHosted;
    public boolean externallyHosted;
    public a file[];
    public boolean gamepadRequired;
    public boolean hasAppType;
    public boolean hasContentRating;
    public boolean hasDeclaresIab;
    public boolean hasDeveloperEmail;
    public boolean hasDeveloperName;
    public boolean hasDeveloperWebsite;
    public boolean hasEverExternallyHosted;
    public boolean hasExternallyHosted;
    public boolean hasGamepadRequired;
    public boolean hasInstallLocation;
    public boolean hasInstallNotes;
    public boolean hasInstallationSize;
    public boolean hasMajorVersionNumber;
    public boolean hasNumDownloads;
    public boolean hasPackageName;
    public boolean hasRecentChangesHtml;
    public boolean hasTitle;
    public boolean hasUploadDate;
    public boolean hasVariesByAccount;
    public boolean hasVersionCode;
    public boolean hasVersionString;
    public int installLocation;
    public String installNotes;
    public long installationSize;
    public int majorVersionNumber;
    public String numDownloads;
    public String packageName;
    public String permission[];
    public String recentChangesHtml;
    public String splitId[];
    public String title;
    public String uploadDate;
    public boolean variesByAccount;
    public int versionCode;
    public String versionString;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDeveloperName)
            {
                i = j;
                if (developerName.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, developerName);
        }
        int k;
label1:
        {
            if (!hasMajorVersionNumber)
            {
                k = i;
                if (majorVersionNumber == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, majorVersionNumber);
        }
label2:
        {
            if (!hasVersionCode)
            {
                i = k;
                if (versionCode == 0)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, versionCode);
        }
label3:
        {
            if (!hasVersionString)
            {
                k = i;
                if (versionString.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, versionString);
        }
label4:
        {
            if (!hasTitle)
            {
                i = k;
                if (title.equals(""))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, title);
        }
        int i1;
label5:
        {
            k = i;
            if (appCategory != null)
            {
                k = i;
                if (appCategory.length > 0)
                {
                    int l3 = 0;
                    int l = 0;
                    for (k = 0; k < appCategory.length;)
                    {
                        String s = appCategory[k];
                        int i5 = l3;
                        int k2 = l;
                        if (s != null)
                        {
                            i5 = l3 + 1;
                            k2 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        l3 = i5;
                        l = k2;
                    }

                    k = i + l + l3 * 1;
                }
            }
            if (!hasContentRating)
            {
                i1 = k;
                if (contentRating == 0)
                {
                    break label5;
                }
            }
            i1 = k + CodedOutputByteBufferNano.computeInt32Size(8, contentRating);
        }
label6:
        {
            if (!hasInstallationSize)
            {
                i = i1;
                if (installationSize == 0L)
                {
                    break label6;
                }
            }
            i = i1 + CodedOutputByteBufferNano.computeInt64Size(9, installationSize);
        }
label7:
        {
            k = i;
            if (permission != null)
            {
                k = i;
                if (permission.length > 0)
                {
                    int i4 = 0;
                    i1 = 0;
                    for (k = 0; k < permission.length;)
                    {
                        String s1 = permission[k];
                        int j5 = i4;
                        int l2 = i1;
                        if (s1 != null)
                        {
                            j5 = i4 + 1;
                            l2 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                        }
                        k++;
                        i4 = j5;
                        i1 = l2;
                    }

                    k = i + i1 + i4 * 1;
                }
            }
            if (!hasDeveloperEmail)
            {
                i = k;
                if (developerEmail.equals(""))
                {
                    break label7;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(11, developerEmail);
        }
label8:
        {
            if (!hasDeveloperWebsite)
            {
                k = i;
                if (developerWebsite.equals(""))
                {
                    break label8;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(12, developerWebsite);
        }
label9:
        {
            if (!hasNumDownloads)
            {
                i = k;
                if (numDownloads.equals(""))
                {
                    break label9;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(13, numDownloads);
        }
label10:
        {
            if (!hasPackageName)
            {
                k = i;
                if (packageName.equals(""))
                {
                    break label10;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(14, packageName);
        }
label11:
        {
            if (!hasRecentChangesHtml)
            {
                i1 = k;
                if (recentChangesHtml.equals(""))
                {
                    break label11;
                }
            }
            i1 = k + CodedOutputByteBufferNano.computeStringSize(15, recentChangesHtml);
        }
label12:
        {
            if (!hasUploadDate)
            {
                i = i1;
                if (uploadDate.equals(""))
                {
                    break label12;
                }
            }
            i = i1 + CodedOutputByteBufferNano.computeStringSize(16, uploadDate);
        }
label13:
        {
            k = i;
            if (file != null)
            {
                k = i;
                if (file.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        k = i;
                        if (j1 >= file.length)
                        {
                            break;
                        }
                        a a = file[j1];
                        k = i;
                        if (a != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(17, a);
                        }
                        j1++;
                        i = k;
                    } while (true);
                }
            }
            if (!hasAppType)
            {
                i = k;
                if (appType.equals(""))
                {
                    break label13;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(18, appType);
        }
label14:
        {
            k = i;
            if (certificateHash != null)
            {
                k = i;
                if (certificateHash.length > 0)
                {
                    int j4 = 0;
                    int k1 = 0;
                    for (k = 0; k < certificateHash.length;)
                    {
                        String s2 = certificateHash[k];
                        int k5 = j4;
                        int i3 = k1;
                        if (s2 != null)
                        {
                            k5 = j4 + 1;
                            i3 = k1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s2);
                        }
                        k++;
                        j4 = k5;
                        k1 = i3;
                    }

                    k = i + k1 + j4 * 2;
                }
            }
            if (!hasVariesByAccount)
            {
                i = k;
                if (variesByAccount)
                {
                    break label14;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(21) + 1);
        }
label15:
        {
            k = i;
            if (certificateSet != null)
            {
                k = i;
                if (certificateSet.length > 0)
                {
                    int l1 = 0;
                    do
                    {
                        k = i;
                        if (l1 >= certificateSet.length)
                        {
                            break;
                        }
                        Set set = certificateSet[l1];
                        k = i;
                        if (set != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(22, set);
                        }
                        l1++;
                        i = k;
                    } while (true);
                }
            }
            int i2 = k;
            if (autoAcquireFreeAppIfHigherVersionAvailableTag != null)
            {
                i2 = k;
                if (autoAcquireFreeAppIfHigherVersionAvailableTag.length > 0)
                {
                    int k4 = 0;
                    i2 = 0;
                    for (i = 0; i < autoAcquireFreeAppIfHigherVersionAvailableTag.length;)
                    {
                        String s3 = autoAcquireFreeAppIfHigherVersionAvailableTag[i];
                        int l5 = k4;
                        int j3 = i2;
                        if (s3 != null)
                        {
                            l5 = k4 + 1;
                            j3 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(s3);
                        }
                        i++;
                        k4 = l5;
                        i2 = j3;
                    }

                    i2 = k + i2 + k4 * 2;
                }
            }
            if (!hasDeclaresIab)
            {
                i = i2;
                if (!declaresIab)
                {
                    break label15;
                }
            }
            i = i2 + (CodedOutputByteBufferNano.computeTagSize(24) + 1);
        }
label16:
        {
            k = i;
            if (splitId != null)
            {
                k = i;
                if (splitId.length > 0)
                {
                    int l4 = 0;
                    int j2 = 0;
                    for (k = 0; k < splitId.length;)
                    {
                        String s4 = splitId[k];
                        int i6 = l4;
                        int k3 = j2;
                        if (s4 != null)
                        {
                            i6 = l4 + 1;
                            k3 = j2 + CodedOutputByteBufferNano.computeStringSizeNoTag(s4);
                        }
                        k++;
                        l4 = i6;
                        j2 = k3;
                    }

                    k = i + j2 + l4 * 2;
                }
            }
            if (!hasGamepadRequired)
            {
                i = k;
                if (!gamepadRequired)
                {
                    break label16;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(26) + 1);
        }
label17:
        {
            if (!hasExternallyHosted)
            {
                k = i;
                if (!externallyHosted)
                {
                    break label17;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(27) + 1);
        }
label18:
        {
            if (!hasEverExternallyHosted)
            {
                i = k;
                if (!everExternallyHosted)
                {
                    break label18;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(28) + 1);
        }
label19:
        {
            if (!hasInstallNotes)
            {
                k = i;
                if (installNotes.equals(""))
                {
                    break label19;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(30, installNotes);
        }
label20:
        {
            if (installLocation == 0)
            {
                i = k;
                if (!hasInstallLocation)
                {
                    break label20;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(31, installLocation);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L31:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 29: default 248
    //                   0: 256
    //                   10: 258
    //                   16: 274
    //                   24: 290
    //                   34: 306
    //                   42: 322
    //                   58: 338
    //                   64: 440
    //                   72: 456
    //                   82: 472
    //                   90: 574
    //                   98: 590
    //                   106: 606
    //                   114: 622
    //                   122: 638
    //                   130: 654
    //                   138: 670
    //                   146: 795
    //                   154: 811
    //                   168: 914
    //                   178: 930
    //                   186: 1055
    //                   192: 1158
    //                   202: 1174
    //                   208: 1277
    //                   216: 1293
    //                   224: 1309
    //                   242: 1325
    //                   248: 1341;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L31; else goto _L2
_L2:
        return this;
_L3:
        developerName = codedinputbytebuffernano.readString();
        hasDeveloperName = true;
          goto _L31
_L4:
        majorVersionNumber = codedinputbytebuffernano.readRawVarint32();
        hasMajorVersionNumber = true;
          goto _L31
_L5:
        versionCode = codedinputbytebuffernano.readRawVarint32();
        hasVersionCode = true;
          goto _L31
_L6:
        versionString = codedinputbytebuffernano.readString();
        hasVersionString = true;
          goto _L31
_L7:
        title = codedinputbytebuffernano.readString();
        hasTitle = true;
          goto _L31
_L8:
        int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
        String as[];
        int j;
        if (appCategory == null)
        {
            j = 0;
        } else
        {
            j = appCategory.length;
        }
        as = new String[j2 + j];
        j2 = j;
        if (j != 0)
        {
            System.arraycopy(appCategory, 0, as, 0, j);
            j2 = j;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[j2] = codedinputbytebuffernano.readString();
        appCategory = as;
          goto _L31
_L9:
        contentRating = codedinputbytebuffernano.readRawVarint32();
        hasContentRating = true;
          goto _L31
_L10:
        installationSize = codedinputbytebuffernano.readRawVarint64();
        hasInstallationSize = true;
          goto _L31
_L11:
        int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
        String as1[];
        int k;
        if (permission == null)
        {
            k = 0;
        } else
        {
            k = permission.length;
        }
        as1 = new String[k2 + k];
        k2 = k;
        if (k != 0)
        {
            System.arraycopy(permission, 0, as1, 0, k);
            k2 = k;
        }
        for (; k2 < as1.length - 1; k2++)
        {
            as1[k2] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as1[k2] = codedinputbytebuffernano.readString();
        permission = as1;
          goto _L31
_L12:
        developerEmail = codedinputbytebuffernano.readString();
        hasDeveloperEmail = true;
          goto _L31
_L13:
        developerWebsite = codedinputbytebuffernano.readString();
        hasDeveloperWebsite = true;
          goto _L31
_L14:
        numDownloads = codedinputbytebuffernano.readString();
        hasNumDownloads = true;
          goto _L31
_L15:
        packageName = codedinputbytebuffernano.readString();
        hasPackageName = true;
          goto _L31
_L16:
        recentChangesHtml = codedinputbytebuffernano.readString();
        hasRecentChangesHtml = true;
          goto _L31
_L17:
        uploadDate = codedinputbytebuffernano.readString();
        hasUploadDate = true;
          goto _L31
_L18:
        int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 138);
        a aa[];
        int l;
        if (file == null)
        {
            l = 0;
        } else
        {
            l = file.length;
        }
        aa = new a[l2 + l];
        l2 = l;
        if (l != 0)
        {
            System.arraycopy(file, 0, aa, 0, l);
            l2 = l;
        }
        for (; l2 < aa.length - 1; l2++)
        {
            aa[l2] = new a();
            codedinputbytebuffernano.readMessage(aa[l2]);
            codedinputbytebuffernano.readTag();
        }

        aa[l2] = new a();
        codedinputbytebuffernano.readMessage(aa[l2]);
        file = aa;
          goto _L31
_L19:
        appType = codedinputbytebuffernano.readString();
        hasAppType = true;
          goto _L31
_L20:
        int i3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 154);
        String as2[];
        int i1;
        if (certificateHash == null)
        {
            i1 = 0;
        } else
        {
            i1 = certificateHash.length;
        }
        as2 = new String[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(certificateHash, 0, as2, 0, i1);
            i3 = i1;
        }
        for (; i3 < as2.length - 1; i3++)
        {
            as2[i3] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as2[i3] = codedinputbytebuffernano.readString();
        certificateHash = as2;
          goto _L31
_L21:
        variesByAccount = codedinputbytebuffernano.readBool();
        hasVariesByAccount = true;
          goto _L31
_L22:
        int j3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 178);
        Set aset[];
        int j1;
        if (certificateSet == null)
        {
            j1 = 0;
        } else
        {
            j1 = certificateSet.length;
        }
        aset = new Set[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(certificateSet, 0, aset, 0, j1);
            j3 = j1;
        }
        for (; j3 < aset.length - 1; j3++)
        {
            aset[j3] = new Set();
            codedinputbytebuffernano.readMessage(aset[j3]);
            codedinputbytebuffernano.readTag();
        }

        aset[j3] = new Set();
        codedinputbytebuffernano.readMessage(aset[j3]);
        certificateSet = aset;
          goto _L31
_L23:
        int k3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 186);
        String as3[];
        int k1;
        if (autoAcquireFreeAppIfHigherVersionAvailableTag == null)
        {
            k1 = 0;
        } else
        {
            k1 = autoAcquireFreeAppIfHigherVersionAvailableTag.length;
        }
        as3 = new String[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(autoAcquireFreeAppIfHigherVersionAvailableTag, 0, as3, 0, k1);
            k3 = k1;
        }
        for (; k3 < as3.length - 1; k3++)
        {
            as3[k3] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as3[k3] = codedinputbytebuffernano.readString();
        autoAcquireFreeAppIfHigherVersionAvailableTag = as3;
          goto _L31
_L24:
        declaresIab = codedinputbytebuffernano.readBool();
        hasDeclaresIab = true;
          goto _L31
_L25:
        int l3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 202);
        String as4[];
        int l1;
        if (splitId == null)
        {
            l1 = 0;
        } else
        {
            l1 = splitId.length;
        }
        as4 = new String[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(splitId, 0, as4, 0, l1);
            l3 = l1;
        }
        for (; l3 < as4.length - 1; l3++)
        {
            as4[l3] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as4[l3] = codedinputbytebuffernano.readString();
        splitId = as4;
          goto _L31
_L26:
        gamepadRequired = codedinputbytebuffernano.readBool();
        hasGamepadRequired = true;
          goto _L31
_L27:
        externallyHosted = codedinputbytebuffernano.readBool();
        hasExternallyHosted = true;
          goto _L31
_L28:
        everExternallyHosted = codedinputbytebuffernano.readBool();
        hasEverExternallyHosted = true;
          goto _L31
_L29:
        installNotes = codedinputbytebuffernano.readString();
        hasInstallNotes = true;
          goto _L31
_L30:
        int i2 = codedinputbytebuffernano.readRawVarint32();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            installLocation = i2;
            hasInstallLocation = true;
            break;
        }
        if (true) goto _L31; else goto _L32
_L32:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDeveloperName || !developerName.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, developerName);
        }
        if (hasMajorVersionNumber || majorVersionNumber != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, majorVersionNumber);
        }
        if (hasVersionCode || versionCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, versionCode);
        }
        if (hasVersionString || !versionString.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, versionString);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, title);
        }
        if (appCategory != null && appCategory.length > 0)
        {
            for (int i = 0; i < appCategory.length; i++)
            {
                String s = appCategory[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(7, s);
                }
            }

        }
        if (hasContentRating || contentRating != 0)
        {
            codedoutputbytebuffernano.writeInt32(8, contentRating);
        }
        if (hasInstallationSize || installationSize != 0L)
        {
            codedoutputbytebuffernano.writeInt64(9, installationSize);
        }
        if (permission != null && permission.length > 0)
        {
            for (int j = 0; j < permission.length; j++)
            {
                String s1 = permission[j];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.writeString(10, s1);
                }
            }

        }
        if (hasDeveloperEmail || !developerEmail.equals(""))
        {
            codedoutputbytebuffernano.writeString(11, developerEmail);
        }
        if (hasDeveloperWebsite || !developerWebsite.equals(""))
        {
            codedoutputbytebuffernano.writeString(12, developerWebsite);
        }
        if (hasNumDownloads || !numDownloads.equals(""))
        {
            codedoutputbytebuffernano.writeString(13, numDownloads);
        }
        if (hasPackageName || !packageName.equals(""))
        {
            codedoutputbytebuffernano.writeString(14, packageName);
        }
        if (hasRecentChangesHtml || !recentChangesHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(15, recentChangesHtml);
        }
        if (hasUploadDate || !uploadDate.equals(""))
        {
            codedoutputbytebuffernano.writeString(16, uploadDate);
        }
        if (file != null && file.length > 0)
        {
            for (int k = 0; k < file.length; k++)
            {
                a a = file[k];
                if (a != null)
                {
                    codedoutputbytebuffernano.writeMessage(17, a);
                }
            }

        }
        if (hasAppType || !appType.equals(""))
        {
            codedoutputbytebuffernano.writeString(18, appType);
        }
        if (certificateHash != null && certificateHash.length > 0)
        {
            for (int l = 0; l < certificateHash.length; l++)
            {
                String s2 = certificateHash[l];
                if (s2 != null)
                {
                    codedoutputbytebuffernano.writeString(19, s2);
                }
            }

        }
        if (hasVariesByAccount || !variesByAccount)
        {
            codedoutputbytebuffernano.writeBool(21, variesByAccount);
        }
        if (certificateSet != null && certificateSet.length > 0)
        {
            for (int i1 = 0; i1 < certificateSet.length; i1++)
            {
                Set set = certificateSet[i1];
                if (set != null)
                {
                    codedoutputbytebuffernano.writeMessage(22, set);
                }
            }

        }
        if (autoAcquireFreeAppIfHigherVersionAvailableTag != null && autoAcquireFreeAppIfHigherVersionAvailableTag.length > 0)
        {
            for (int j1 = 0; j1 < autoAcquireFreeAppIfHigherVersionAvailableTag.length; j1++)
            {
                String s3 = autoAcquireFreeAppIfHigherVersionAvailableTag[j1];
                if (s3 != null)
                {
                    codedoutputbytebuffernano.writeString(23, s3);
                }
            }

        }
        if (hasDeclaresIab || declaresIab)
        {
            codedoutputbytebuffernano.writeBool(24, declaresIab);
        }
        if (splitId != null && splitId.length > 0)
        {
            for (int k1 = 0; k1 < splitId.length; k1++)
            {
                String s4 = splitId[k1];
                if (s4 != null)
                {
                    codedoutputbytebuffernano.writeString(25, s4);
                }
            }

        }
        if (hasGamepadRequired || gamepadRequired)
        {
            codedoutputbytebuffernano.writeBool(26, gamepadRequired);
        }
        if (hasExternallyHosted || externallyHosted)
        {
            codedoutputbytebuffernano.writeBool(27, externallyHosted);
        }
        if (hasEverExternallyHosted || everExternallyHosted)
        {
            codedoutputbytebuffernano.writeBool(28, everExternallyHosted);
        }
        if (hasInstallNotes || !installNotes.equals(""))
        {
            codedoutputbytebuffernano.writeString(30, installNotes);
        }
        if (installLocation != 0 || hasInstallLocation)
        {
            codedoutputbytebuffernano.writeInt32(31, installLocation);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public a()
    {
        developerName = "";
        hasDeveloperName = false;
        majorVersionNumber = 0;
        hasMajorVersionNumber = false;
        versionCode = 0;
        hasVersionCode = false;
        versionString = "";
        hasVersionString = false;
        title = "";
        hasTitle = false;
        appCategory = WireFormatNano.EMPTY_STRING_ARRAY;
        contentRating = 0;
        hasContentRating = false;
        installationSize = 0L;
        hasInstallationSize = false;
        permission = WireFormatNano.EMPTY_STRING_ARRAY;
        developerEmail = "";
        hasDeveloperEmail = false;
        developerWebsite = "";
        hasDeveloperWebsite = false;
        numDownloads = "";
        hasNumDownloads = false;
        packageName = "";
        hasPackageName = false;
        recentChangesHtml = "";
        hasRecentChangesHtml = false;
        uploadDate = "";
        hasUploadDate = false;
        file = a.emptyArray();
        appType = "";
        hasAppType = false;
        certificateSet = Set.emptyArray();
        certificateHash = WireFormatNano.EMPTY_STRING_ARRAY;
        variesByAccount = true;
        hasVariesByAccount = false;
        autoAcquireFreeAppIfHigherVersionAvailableTag = WireFormatNano.EMPTY_STRING_ARRAY;
        declaresIab = false;
        hasDeclaresIab = false;
        splitId = WireFormatNano.EMPTY_STRING_ARRAY;
        gamepadRequired = false;
        hasGamepadRequired = false;
        externallyHosted = false;
        hasExternallyHosted = false;
        everExternallyHosted = false;
        hasEverExternallyHosted = false;
        installNotes = "";
        hasInstallNotes = false;
        installLocation = 0;
        hasInstallLocation = false;
        cachedSize = -1;
    }
}
