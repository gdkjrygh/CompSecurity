// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.jce.provider:
//            PKIXNameConstraintValidatorException

public class PKIXNameConstraintValidator
{

    private Set a;
    private Set b;
    private Set c;
    private Set d;
    private Set e;
    private Set f;
    private Set g;
    private Set h;
    private Set i;
    private Set j;

    public PKIXNameConstraintValidator()
    {
        a = new HashSet();
        b = new HashSet();
        c = new HashSet();
        d = new HashSet();
        e = new HashSet();
    }

    private static int a(Collection collection)
    {
        if (collection == null)
        {
            return 0;
        }
        collection = collection.iterator();
        int k = 0;
        while (collection.hasNext()) 
        {
            Object obj = collection.next();
            if (obj instanceof byte[])
            {
                k = Arrays.a((byte[])obj) + k;
            } else
            {
                k = obj.hashCode() + k;
            }
        }
        return k;
    }

    private static String a(Set set)
    {
        Object obj = (new StringBuilder()).append("").append("[").toString();
        Iterator iterator = set.iterator();
        for (set = ((Set) (obj)); iterator.hasNext(); set = (new StringBuilder()).append(set).append(a((byte[])iterator.next())).append(",").toString()) { }
        obj = set;
        if (set.length() > 1)
        {
            obj = set.substring(0, set.length() - 1);
        }
        return (new StringBuilder()).append(((String) (obj))).append("]").toString();
    }

    private static String a(byte abyte0[])
    {
        String s = "";
        for (int k = 0; k < abyte0.length / 2; k++)
        {
            s = (new StringBuilder()).append(s).append(Integer.toString(abyte0[k] & 0xff)).append(".").toString();
        }

        s = s.substring(0, s.length() - 1);
        s = (new StringBuilder()).append(s).append("/").toString();
        for (int l = abyte0.length / 2; l < abyte0.length; l++)
        {
            s = (new StringBuilder()).append(s).append(Integer.toString(abyte0[l] & 0xff)).append(".").toString();
        }

        return s.substring(0, s.length() - 1);
    }

    private static Set a(Set set, String s)
    {
        if (set.isEmpty())
        {
            if (s == null)
            {
                return set;
            } else
            {
                set.add(s);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext();)
        {
            String s1 = (String)set.next();
            if (b(s1, s))
            {
                hashset.add(s);
            } else
            if (b(s, s1))
            {
                hashset.add(s1);
            } else
            {
                hashset.add(s1);
                hashset.add(s);
            }
        }

        return hashset;
    }

    private static Set a(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            ASN1Sequence asn1sequence = ASN1Sequence.a(((GeneralSubtree)set1.next()).c().d().a());
            if (set == null)
            {
                if (asn1sequence != null)
                {
                    hashset.add(asn1sequence);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    ASN1Sequence asn1sequence1 = (ASN1Sequence)iterator.next();
                    if (a(asn1sequence, asn1sequence1))
                    {
                        hashset.add(asn1sequence);
                    } else
                    if (a(asn1sequence1, asn1sequence))
                    {
                        hashset.add(asn1sequence1);
                    }
                }
            }
        }

        return hashset;
    }

    private static Set a(Set set, ASN1Sequence asn1sequence)
    {
        if (set.isEmpty())
        {
            if (asn1sequence == null)
            {
                return set;
            } else
            {
                set.add(asn1sequence);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext();)
        {
            ASN1Sequence asn1sequence1 = (ASN1Sequence)set.next();
            if (a(asn1sequence, asn1sequence1))
            {
                hashset.add(asn1sequence1);
            } else
            if (a(asn1sequence1, asn1sequence))
            {
                hashset.add(asn1sequence);
            } else
            {
                hashset.add(asn1sequence1);
                hashset.add(asn1sequence);
            }
        }

        return hashset;
    }

    private static Set a(Set set, byte abyte0[])
    {
        if (set.isEmpty())
        {
            if (abyte0 == null)
            {
                return set;
            } else
            {
                set.add(abyte0);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        set = set.iterator();
        while (set.hasNext()) 
        {
            byte abyte1[] = (byte[])set.next();
            HashSet hashset1 = new HashSet();
            if (Arrays.a(abyte1, abyte0))
            {
                hashset1.add(abyte1);
            } else
            {
                hashset1.add(abyte1);
                hashset1.add(abyte0);
            }
            hashset.addAll(hashset1);
        }
        return hashset;
    }

    private static void a(String s, String s1, Set set)
    {
        if (s.indexOf('@') != -1)
        {
            String s2 = s.substring(s.indexOf('@') + 1);
            if (s1.indexOf('@') != -1)
            {
                if (s.equalsIgnoreCase(s1))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (b(s2, s1))
                {
                    set.add(s1);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s2.equalsIgnoreCase(s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.startsWith("."))
        {
            if (s1.indexOf('@') != -1)
            {
                if (b(s1.substring(s.indexOf('@') + 1), s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (b(s, s1) || s.equalsIgnoreCase(s1))
                {
                    set.add(s1);
                    return;
                }
                if (b(s1, s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (b(s1, s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.indexOf('@') != -1)
        {
            if (s1.substring(s.indexOf('@') + 1).equalsIgnoreCase(s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.startsWith("."))
        {
            if (b(s, s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.equalsIgnoreCase(s1))
        {
            set.add(s);
            return;
        } else
        {
            set.add(s);
            set.add(s1);
            return;
        }
    }

    private static boolean a(String s, String s1)
    {
        String s2 = s.substring(s.indexOf('@') + 1);
        if (s1.indexOf('@') == -1) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        return true;
_L2:
        if (s1.charAt(0) == '.') goto _L6; else goto _L5
_L5:
        if (s2.equalsIgnoreCase(s1)) goto _L3; else goto _L4
_L4:
        return false;
_L6:
        if (b(s2, s1))
        {
            return true;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private static boolean a(Collection collection, Collection collection1)
    {
        if (collection == collection1)
        {
            return true;
        }
        if (collection == null || collection1 == null)
        {
            return false;
        }
        if (collection.size() != collection1.size())
        {
            return false;
        }
        collection = collection.iterator();
_L2:
        boolean flag;
        if (!collection.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = collection.next();
        Iterator iterator = collection1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_165;
            }
            Object obj1 = iterator.next();
            boolean flag1;
            if (obj == obj1)
            {
                flag1 = true;
            } else
            if (obj == null || obj1 == null)
            {
                flag1 = false;
            } else
            if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
            {
                flag1 = Arrays.a((byte[])obj, (byte[])obj1);
            } else
            {
                flag1 = obj.equals(obj1);
            }
        } while (!flag1);
        flag = true;
_L3:
        if (!flag)
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return true;
        flag = false;
          goto _L3
    }

    private static boolean a(ASN1Sequence asn1sequence, ASN1Sequence asn1sequence1)
    {
_L2:
        return false;
        if (asn1sequence1.e() <= 0 || asn1sequence1.e() > asn1sequence.e()) goto _L2; else goto _L1
_L1:
        int k = asn1sequence1.e() - 1;
label0:
        do
        {
label1:
            {
                if (k < 0)
                {
                    break label1;
                }
                if (!asn1sequence1.a(k).equals(asn1sequence.a(k)))
                {
                    break label0;
                }
                k--;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    private static boolean a(byte abyte0[], byte abyte1[])
    {
        int k = 0;
        int l = abyte0.length;
        if (l != abyte1.length / 2)
        {
            return false;
        }
        byte abyte2[] = new byte[l];
        System.arraycopy(abyte1, l, abyte2, 0, l);
        byte abyte3[] = new byte[l];
        byte abyte4[] = new byte[l];
        for (; k < l; k++)
        {
            abyte3[k] = (byte)(abyte1[k] & abyte2[k]);
            abyte4[k] = (byte)(abyte0[k] & abyte2[k]);
        }

        return Arrays.a(abyte3, abyte4);
    }

    private static byte[][] a(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
    {
        int l = abyte0.length;
        byte abyte4[] = new byte[l];
        byte abyte5[] = new byte[l];
        byte abyte6[] = new byte[l];
        byte abyte7[] = new byte[l];
        for (int k = 0; k < l; k++)
        {
            abyte4[k] = (byte)(abyte0[k] & abyte1[k]);
            abyte5[k] = (byte)(abyte0[k] & abyte1[k] | ~abyte1[k]);
            abyte6[k] = (byte)(abyte2[k] & abyte3[k]);
            abyte7[k] = (byte)(abyte2[k] & abyte3[k] | ~abyte3[k]);
        }

        return (new byte[][] {
            abyte4, abyte5, abyte6, abyte7
        });
    }

    private static Set b(Set set, String s)
    {
        if (set.isEmpty())
        {
            if (s == null)
            {
                return set;
            } else
            {
                set.add(s);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext(); a((String)set.next(), s, hashset)) { }
        return hashset;
    }

    private static Set b(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            String s = c(((GeneralSubtree)set1.next()).c());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    if (s.indexOf('@') != -1)
                    {
                        String s2 = s.substring(s.indexOf('@') + 1);
                        if (s1.indexOf('@') != -1)
                        {
                            if (s.equalsIgnoreCase(s1))
                            {
                                hashset.add(s);
                            }
                        } else
                        if (s1.startsWith("."))
                        {
                            if (b(s2, s1))
                            {
                                hashset.add(s);
                            }
                        } else
                        if (s2.equalsIgnoreCase(s1))
                        {
                            hashset.add(s);
                        }
                    } else
                    if (s.startsWith("."))
                    {
                        if (s1.indexOf('@') != -1)
                        {
                            if (b(s1.substring(s.indexOf('@') + 1), s))
                            {
                                hashset.add(s1);
                            }
                        } else
                        if (s1.startsWith("."))
                        {
                            if (b(s, s1) || s.equalsIgnoreCase(s1))
                            {
                                hashset.add(s);
                            } else
                            if (b(s1, s))
                            {
                                hashset.add(s1);
                            }
                        } else
                        if (b(s1, s))
                        {
                            hashset.add(s1);
                        }
                    } else
                    if (s1.indexOf('@') != -1)
                    {
                        if (s1.substring(s1.indexOf('@') + 1).equalsIgnoreCase(s))
                        {
                            hashset.add(s1);
                        }
                    } else
                    if (s1.startsWith("."))
                    {
                        if (b(s, s1))
                        {
                            hashset.add(s);
                        }
                    } else
                    if (s.equalsIgnoreCase(s1))
                    {
                        hashset.add(s);
                    }
                }
            }
        }

        return hashset;
    }

    private static boolean b(String s, String s1)
    {
        String s2 = s1;
        if (s1.startsWith("."))
        {
            s2 = s1.substring(1);
        }
        s1 = Strings.e(s2);
        s = Strings.e(s);
        if (s.length <= s1.length)
        {
            return false;
        }
        int l = s.length - s1.length;
        for (int k = -1; k < s1.length; k++)
        {
            if (k == -1)
            {
                if (s[k + l].equals(""))
                {
                    return false;
                }
                continue;
            }
            if (!s1[k].equalsIgnoreCase(s[k + l]))
            {
                return false;
            }
        }

        return true;
    }

    private static byte[] b(byte abyte0[], byte abyte1[])
    {
        for (int k = 0; k < abyte0.length; k++)
        {
            if ((abyte0[k] & 0xffff) > (abyte1[k] & 0xffff))
            {
                return abyte0;
            }
        }

        return abyte1;
    }

    private static String c(GeneralName generalname)
    {
        return DERIA5String.a(generalname.d()).o_();
    }

    private static Set c(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        Iterator iterator = set1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            byte abyte0[] = ASN1OctetString.a(((GeneralSubtree)iterator.next()).c().d()).d();
            if (set == null)
            {
                if (abyte0 != null)
                {
                    hashset.add(abyte0);
                }
            } else
            {
                Iterator iterator1 = set.iterator();
                while (iterator1.hasNext()) 
                {
                    Object obj = (byte[])iterator1.next();
                    if (obj.length != abyte0.length)
                    {
                        set1 = Collections.EMPTY_SET;
                    } else
                    {
                        int k = obj.length / 2;
                        set1 = new byte[k];
                        Object obj1 = new byte[k];
                        System.arraycopy(obj, 0, set1, 0, k);
                        System.arraycopy(obj, k, obj1, 0, k);
                        byte abyte3[] = new byte[k];
                        byte abyte4[] = new byte[k];
                        System.arraycopy(abyte0, 0, abyte3, 0, k);
                        System.arraycopy(abyte0, k, abyte4, 0, k);
                        obj = new byte[4][];
                        obj[0] = set1;
                        obj[1] = ((byte []) (obj1));
                        obj[2] = abyte3;
                        obj[3] = abyte4;
                        obj1 = obj[0];
                        set1 = obj[1];
                        abyte3 = obj[2];
                        byte abyte1[] = obj[3];
                        obj1 = a(((byte []) (obj1)), set1, abyte3, abyte1);
                        abyte3 = c(obj1[1], obj1[3]);
                        abyte4 = b(obj1[0], obj1[2]);
                        if (Arrays.a(abyte4, abyte3))
                        {
                            k = 0;
                        } else
                        if (Arrays.a(b(abyte4, abyte3), abyte4))
                        {
                            k = 1;
                        } else
                        {
                            k = -1;
                        }
                        if (k == true)
                        {
                            set1 = Collections.EMPTY_SET;
                        } else
                        {
                            byte abyte2[] = d(obj1[0], obj1[2]);
                            set1 = d(set1, abyte1);
                            int l = abyte2.length;
                            abyte1 = new byte[l * 2];
                            System.arraycopy(abyte2, 0, abyte1, 0, l);
                            System.arraycopy(set1, 0, abyte1, l, l);
                            set1 = Collections.singleton(abyte1);
                        }
                    }
                    hashset.addAll(set1);
                }
            }
        } while (true);
        return hashset;
    }

    private static boolean c(String s, String s1)
    {
        String s2 = s.substring(s.indexOf(':') + 1);
        s = s2;
        if (s2.indexOf("//") != -1)
        {
            s = s2.substring(s2.indexOf("//") + 2);
        }
        s2 = s;
        if (s.lastIndexOf(':') != -1)
        {
            s2 = s.substring(0, s.lastIndexOf(':'));
        }
        s = s2.substring(s2.indexOf(':') + 1);
        s2 = s.substring(s.indexOf('@') + 1);
        s = s2;
        if (s2.indexOf('/') != -1)
        {
            s = s2.substring(0, s2.indexOf('/'));
        }
        if (!s1.startsWith("."))
        {
            if (s.equalsIgnoreCase(s1))
            {
                return true;
            }
        } else
        if (b(s, s1))
        {
            return true;
        }
        return false;
    }

    private static byte[] c(byte abyte0[], byte abyte1[])
    {
        for (int k = 0; k < abyte0.length; k++)
        {
            if ((abyte0[k] & 0xffff) < (abyte1[k] & 0xffff))
            {
                return abyte0;
            }
        }

        return abyte1;
    }

    private static Set d(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            String s = c(((GeneralSubtree)set1.next()).c());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    if (b(s1, s))
                    {
                        hashset.add(s1);
                    } else
                    if (b(s, s1))
                    {
                        hashset.add(s);
                    }
                }
            }
        }

        return hashset;
    }

    private static byte[] d(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length];
        for (int k = 0; k < abyte0.length; k++)
        {
            abyte2[k] = (byte)(abyte0[k] | abyte1[k]);
        }

        return abyte2;
    }

    private static Set e(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            String s = c(((GeneralSubtree)set1.next()).c());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    if (s1.indexOf('@') != -1)
                    {
                        String s2 = s1.substring(s1.indexOf('@') + 1);
                        if (s.indexOf('@') != -1)
                        {
                            if (s1.equalsIgnoreCase(s))
                            {
                                hashset.add(s1);
                            }
                        } else
                        if (s.startsWith("."))
                        {
                            if (b(s2, s))
                            {
                                hashset.add(s1);
                            }
                        } else
                        if (s2.equalsIgnoreCase(s))
                        {
                            hashset.add(s1);
                        }
                    } else
                    if (s1.startsWith("."))
                    {
                        if (s.indexOf('@') != -1)
                        {
                            if (b(s.substring(s1.indexOf('@') + 1), s1))
                            {
                                hashset.add(s);
                            }
                        } else
                        if (s.startsWith("."))
                        {
                            if (b(s1, s) || s1.equalsIgnoreCase(s))
                            {
                                hashset.add(s1);
                            } else
                            if (b(s, s1))
                            {
                                hashset.add(s);
                            }
                        } else
                        if (b(s, s1))
                        {
                            hashset.add(s);
                        }
                    } else
                    if (s.indexOf('@') != -1)
                    {
                        if (s.substring(s.indexOf('@') + 1).equalsIgnoreCase(s1))
                        {
                            hashset.add(s);
                        }
                    } else
                    if (s.startsWith("."))
                    {
                        if (b(s1, s))
                        {
                            hashset.add(s1);
                        }
                    } else
                    if (s1.equalsIgnoreCase(s))
                    {
                        hashset.add(s1);
                    }
                }
            }
        }

        return hashset;
    }

    public final void a(ASN1Sequence asn1sequence)
    {
label0:
        {
            Object obj = f;
            if (obj != null && (!((Set) (obj)).isEmpty() || asn1sequence.e() != 0))
            {
                obj = ((Set) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                } while (!a(asn1sequence, (ASN1Sequence)((Iterator) (obj)).next()));
            }
            return;
        }
        throw new PKIXNameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    public final void a(GeneralName generalname)
    {
        generalname.c();
        JVM INSTR tableswitch 1 7: default 48
    //                   1 49
    //                   2 125
    //                   3 48
    //                   4 218
    //                   5 48
    //                   6 235
    //                   7 317;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6
_L1:
        return;
_L2:
        Set set;
        set = h;
        generalname = c(generalname);
        if (set != null)
        {
            Iterator iterator = set.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
            } while (!a(((String) (generalname)), (String)iterator.next()));
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (generalname.length() == 0 && set.size() == 0) goto _L1; else goto _L7
_L7:
        throw new PKIXNameConstraintValidatorException("Subject email address is not from a permitted subtree.");
_L3:
        set = g;
        generalname = DERIA5String.a(generalname.d()).o_();
        if (set == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator1 = set.iterator();
        String s;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            if (b(generalname, s))
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!generalname.equalsIgnoreCase(s));
        return;
        if (generalname.length() == 0 && set.size() == 0) goto _L1; else goto _L8
_L8:
        throw new PKIXNameConstraintValidatorException("DNS is not from a permitted subtree.");
_L4:
        a(ASN1Sequence.a(generalname.d().a()));
        return;
_L5:
        set = i;
        generalname = DERIA5String.a(generalname.d()).o_();
        if (set != null)
        {
            Iterator iterator2 = set.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
            } while (!c(generalname, (String)iterator2.next()));
        }
        if (true) goto _L1; else goto _L9
_L9:
        if (generalname.length() == 0 && set.size() == 0) goto _L1; else goto _L10
_L10:
        throw new PKIXNameConstraintValidatorException("URI is not from a permitted subtree.");
_L6:
        generalname = ASN1OctetString.a(generalname.d()).d();
        set = j;
        if (set != null)
        {
            Iterator iterator3 = set.iterator();
            do
            {
                if (!iterator3.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
            } while (!a(((byte []) (generalname)), (byte[])iterator3.next()));
        }
        if (true) goto _L1; else goto _L11
_L11:
        if (generalname.length == 0 && set.size() == 0) goto _L1; else goto _L12
_L12:
        throw new PKIXNameConstraintValidatorException("IP is not from a permitted subtree.");
    }

    public final void a(GeneralSubtree generalsubtree)
    {
        generalsubtree = generalsubtree.c();
        switch (generalsubtree.c())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            Object obj = c;
            String s = c(generalsubtree);
            if (((Set) (obj)).isEmpty())
            {
                if (s == null)
                {
                    generalsubtree = ((GeneralSubtree) (obj));
                } else
                {
                    ((Set) (obj)).add(s);
                    generalsubtree = ((GeneralSubtree) (obj));
                }
            } else
            {
                generalsubtree = new HashSet();
                obj = ((Set) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s1 = (String)((Iterator) (obj)).next();
                    if (s1.indexOf('@') != -1)
                    {
                        String s2 = s1.substring(s1.indexOf('@') + 1);
                        if (s.indexOf('@') != -1)
                        {
                            if (s1.equalsIgnoreCase(s))
                            {
                                generalsubtree.add(s1);
                            } else
                            {
                                generalsubtree.add(s1);
                                generalsubtree.add(s);
                            }
                        } else
                        if (s.startsWith("."))
                        {
                            if (b(s2, s))
                            {
                                generalsubtree.add(s);
                            } else
                            {
                                generalsubtree.add(s1);
                                generalsubtree.add(s);
                            }
                        } else
                        if (s2.equalsIgnoreCase(s))
                        {
                            generalsubtree.add(s);
                        } else
                        {
                            generalsubtree.add(s1);
                            generalsubtree.add(s);
                        }
                    } else
                    if (s1.startsWith("."))
                    {
                        if (s.indexOf('@') != -1)
                        {
                            if (b(s.substring(s1.indexOf('@') + 1), s1))
                            {
                                generalsubtree.add(s1);
                            } else
                            {
                                generalsubtree.add(s1);
                                generalsubtree.add(s);
                            }
                        } else
                        if (s.startsWith("."))
                        {
                            if (b(s1, s) || s1.equalsIgnoreCase(s))
                            {
                                generalsubtree.add(s);
                            } else
                            if (b(s, s1))
                            {
                                generalsubtree.add(s1);
                            } else
                            {
                                generalsubtree.add(s1);
                                generalsubtree.add(s);
                            }
                        } else
                        if (b(s, s1))
                        {
                            generalsubtree.add(s1);
                        } else
                        {
                            generalsubtree.add(s1);
                            generalsubtree.add(s);
                        }
                    } else
                    if (s.indexOf('@') != -1)
                    {
                        if (s.substring(s1.indexOf('@') + 1).equalsIgnoreCase(s1))
                        {
                            generalsubtree.add(s1);
                        } else
                        {
                            generalsubtree.add(s1);
                            generalsubtree.add(s);
                        }
                    } else
                    if (s.startsWith("."))
                    {
                        if (b(s1, s))
                        {
                            generalsubtree.add(s);
                        } else
                        {
                            generalsubtree.add(s1);
                            generalsubtree.add(s);
                        }
                    } else
                    if (s1.equalsIgnoreCase(s))
                    {
                        generalsubtree.add(s1);
                    } else
                    {
                        generalsubtree.add(s1);
                        generalsubtree.add(s);
                    }
                }
            }
            c = generalsubtree;
            return;

        case 2: // '\002'
            b = a(b, c(generalsubtree));
            return;

        case 4: // '\004'
            a = a(a, (ASN1Sequence)generalsubtree.d().a());
            return;

        case 6: // '\006'
            d = b(d, c(generalsubtree));
            return;

        case 7: // '\007'
            e = a(e, ASN1OctetString.a(generalsubtree.d()).d());
            return;
        }
    }

    public final void b(ASN1Sequence asn1sequence)
    {
label0:
        {
            Object obj = a;
            if (((Set) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!a(asn1sequence, (ASN1Sequence)((Iterator) (obj)).next()));
            throw new PKIXNameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
        }
    }

    public final void b(GeneralName generalname)
    {
        generalname.c();
        JVM INSTR tableswitch 1 7: default 48
    //                   1 49
    //                   2 111
    //                   3 48
    //                   4 189
    //                   5 48
    //                   6 206
    //                   7 274;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6
_L1:
        return;
_L2:
        Object obj = c;
        generalname = c(generalname);
        if (((Set) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!a(generalname, (String)((Iterator) (obj)).next()));
        throw new PKIXNameConstraintValidatorException("Email address is from an excluded subtree.");
_L3:
        Object obj1 = b;
        generalname = DERIA5String.a(generalname.d()).o_();
        if (((Set) (obj1)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((Set) (obj1)).iterator();
        String s;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)((Iterator) (obj1)).next();
        } while (!b(((String) (generalname)), s) && !generalname.equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L7
_L7:
        throw new PKIXNameConstraintValidatorException("DNS is from an excluded subtree.");
_L4:
        b(ASN1Sequence.a(generalname.d().a()));
        return;
_L5:
        Object obj2 = d;
        generalname = DERIA5String.a(generalname.d()).o_();
        if (((Set) (obj2)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = ((Set) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!c(generalname, (String)((Iterator) (obj2)).next()));
        throw new PKIXNameConstraintValidatorException("URI is from an excluded subtree.");
_L6:
        generalname = ASN1OctetString.a(generalname.d()).d();
        Object obj3 = e;
        if (!((Set) (obj3)).isEmpty())
        {
            obj3 = ((Set) (obj3)).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                if (a(generalname, (byte[])((Iterator) (obj3)).next()))
                {
                    throw new PKIXNameConstraintValidatorException("IP is from an excluded subtree.");
                }
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void c(ASN1Sequence asn1sequence)
    {
        HashMap hashmap = new HashMap();
        GeneralSubtree generalsubtree;
        Integer integer;
        for (asn1sequence = asn1sequence.d(); asn1sequence.hasMoreElements(); ((Set)hashmap.get(integer)).add(generalsubtree))
        {
            generalsubtree = GeneralSubtree.a(asn1sequence.nextElement());
            integer = new Integer(generalsubtree.c().c());
            if (hashmap.get(integer) == null)
            {
                hashmap.put(integer, new HashSet());
            }
        }

        asn1sequence = hashmap.entrySet().iterator();
        do
        {
            if (!asn1sequence.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)asn1sequence.next();
            switch (((Integer)entry.getKey()).intValue())
            {
            case 1: // '\001'
                h = b(h, (Set)entry.getValue());
                break;

            case 2: // '\002'
                g = d(g, (Set)entry.getValue());
                break;

            case 4: // '\004'
                f = a(f, (Set)entry.getValue());
                break;

            case 6: // '\006'
                i = e(i, (Set)entry.getValue());
                break;

            case 7: // '\007'
                j = c(j, (Set)entry.getValue());
                break;
            }
        } while (true);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PKIXNameConstraintValidator)
        {
            if (a(((PKIXNameConstraintValidator) (obj = (PKIXNameConstraintValidator)obj)).a, a) && a(((PKIXNameConstraintValidator) (obj)).b, b) && a(((PKIXNameConstraintValidator) (obj)).c, c) && a(((PKIXNameConstraintValidator) (obj)).e, e) && a(((PKIXNameConstraintValidator) (obj)).d, d) && a(((PKIXNameConstraintValidator) (obj)).f, f) && a(((PKIXNameConstraintValidator) (obj)).g, g) && a(((PKIXNameConstraintValidator) (obj)).h, h) && a(((PKIXNameConstraintValidator) (obj)).j, j) && a(((PKIXNameConstraintValidator) (obj)).i, i))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a(a) + a(b) + a(c) + a(e) + a(d) + a(f) + a(g) + a(h) + a(j) + a(i);
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("").append("permitted:\n").toString();
        String s = s1;
        if (f != null)
        {
            s = (new StringBuilder()).append(s1).append("DN:\n").toString();
            s = (new StringBuilder()).append(s).append(f.toString()).append("\n").toString();
        }
        s1 = s;
        if (g != null)
        {
            s = (new StringBuilder()).append(s).append("DNS:\n").toString();
            s1 = (new StringBuilder()).append(s).append(g.toString()).append("\n").toString();
        }
        s = s1;
        if (h != null)
        {
            s = (new StringBuilder()).append(s1).append("Email:\n").toString();
            s = (new StringBuilder()).append(s).append(h.toString()).append("\n").toString();
        }
        s1 = s;
        if (i != null)
        {
            s = (new StringBuilder()).append(s).append("URI:\n").toString();
            s1 = (new StringBuilder()).append(s).append(i.toString()).append("\n").toString();
        }
        s = s1;
        if (j != null)
        {
            s = (new StringBuilder()).append(s1).append("IP:\n").toString();
            s = (new StringBuilder()).append(s).append(a(j)).append("\n").toString();
        }
        s1 = (new StringBuilder()).append(s).append("excluded:\n").toString();
        s = s1;
        if (!a.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("DN:\n").toString();
            s = (new StringBuilder()).append(s).append(a.toString()).append("\n").toString();
        }
        s1 = s;
        if (!b.isEmpty())
        {
            s = (new StringBuilder()).append(s).append("DNS:\n").toString();
            s1 = (new StringBuilder()).append(s).append(b.toString()).append("\n").toString();
        }
        s = s1;
        if (!c.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("Email:\n").toString();
            s = (new StringBuilder()).append(s).append(c.toString()).append("\n").toString();
        }
        s1 = s;
        if (!d.isEmpty())
        {
            s = (new StringBuilder()).append(s).append("URI:\n").toString();
            s1 = (new StringBuilder()).append(s).append(d.toString()).append("\n").toString();
        }
        s = s1;
        if (!e.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("IP:\n").toString();
            s = (new StringBuilder()).append(s).append(a(e)).append("\n").toString();
        }
        return s;
    }
}
