// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.zxing.DecodeHintType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

final class DecodeHintManager
{

    private static final Pattern COMMA = Pattern.compile(",");
    private static final String TAG = com/google/zxing/client/android/DecodeHintManager.getSimpleName();

    private DecodeHintManager()
    {
    }

    static Map parseDecodeHints(Intent intent)
    {
        intent = intent.getExtras();
        if (intent == null || intent.isEmpty())
        {
            return null;
        }
        EnumMap enummap = new EnumMap(com/google/zxing/DecodeHintType);
        DecodeHintType adecodehinttype[] = DecodeHintType.values();
        int j = adecodehinttype.length;
        int i = 0;
        while (i < j) 
        {
            DecodeHintType decodehinttype = adecodehinttype[i];
            if (decodehinttype != DecodeHintType.CHARACTER_SET && decodehinttype != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodehinttype != DecodeHintType.POSSIBLE_FORMATS)
            {
                Object obj = decodehinttype.name();
                if (intent.containsKey(((String) (obj))))
                {
                    if (decodehinttype.getValueType().equals(java/lang/Void))
                    {
                        enummap.put(decodehinttype, Boolean.TRUE);
                    } else
                    {
                        obj = intent.get(((String) (obj)));
                        if (decodehinttype.getValueType().isInstance(obj))
                        {
                            enummap.put(decodehinttype, obj);
                        } else
                        {
                            Log.w(TAG, (new StringBuilder()).append("Ignoring hint ").append(decodehinttype).append(" because it is not assignable from ").append(obj).toString());
                        }
                    }
                }
            }
            i++;
        }
        Log.i(TAG, (new StringBuilder()).append("Hints from the Intent: ").append(enummap).toString());
        return enummap;
    }

    static Map parseDecodeHints(Uri uri)
    {
        Map map;
        EnumMap enummap;
        DecodeHintType adecodehinttype[];
        int i;
        int k;
        uri = uri.getEncodedQuery();
        if (uri == null || uri.isEmpty())
        {
            return null;
        }
        map = splitQuery(uri);
        enummap = new EnumMap(com/google/zxing/DecodeHintType);
        adecodehinttype = DecodeHintType.values();
        k = adecodehinttype.length;
        i = 0;
_L2:
        DecodeHintType decodehinttype;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        decodehinttype = adecodehinttype[i];
        if (decodehinttype != DecodeHintType.CHARACTER_SET && decodehinttype != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodehinttype != DecodeHintType.POSSIBLE_FORMATS)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s;
        s = (String)map.get(decodehinttype.name());
        if (s != null)
        {
            if (decodehinttype.getValueType().equals(java/lang/Object))
            {
                enummap.put(decodehinttype, s);
            } else
            if (decodehinttype.getValueType().equals(java/lang/Void))
            {
                enummap.put(decodehinttype, Boolean.TRUE);
            } else
            if (decodehinttype.getValueType().equals(java/lang/String))
            {
                enummap.put(decodehinttype, s);
            } else
            {
label0:
                {
                    if (!decodehinttype.getValueType().equals(java/lang/Boolean))
                    {
                        break label0;
                    }
                    if (s.isEmpty())
                    {
                        enummap.put(decodehinttype, Boolean.TRUE);
                    } else
                    if ("0".equals(s) || "false".equalsIgnoreCase(s) || "no".equalsIgnoreCase(s))
                    {
                        enummap.put(decodehinttype, Boolean.FALSE);
                    } else
                    {
                        enummap.put(decodehinttype, Boolean.TRUE);
                    }
                }
            }
        }
          goto _L3
        int ai[];
        String as[];
        int j;
        if (!decodehinttype.getValueType().equals([I))
        {
            break MISSING_BLOCK_LABEL_449;
        }
        uri = s;
        if (!s.isEmpty())
        {
            uri = s;
            if (s.charAt(s.length() - 1) == ',')
            {
                uri = s.substring(0, s.length() - 1);
            }
        }
        as = COMMA.split(uri);
        ai = new int[as.length];
        j = 0;
_L5:
        uri = ai;
        if (j >= as.length)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        ai[j] = Integer.parseInt(as[j]);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        uri;
        Log.w(TAG, (new StringBuilder()).append("Skipping array of integers hint ").append(decodehinttype).append(" due to invalid numeric value: '").append(as[j]).append('\'').toString());
        uri = null;
        if (uri != null)
        {
            enummap.put(decodehinttype, uri);
        }
          goto _L3
        Log.w(TAG, (new StringBuilder()).append("Unsupported hint type '").append(decodehinttype).append("' of type ").append(decodehinttype.getValueType()).toString());
          goto _L3
        Log.i(TAG, (new StringBuilder()).append("Hints from the URI: ").append(enummap).toString());
        return enummap;
    }

    private static Map splitQuery(String s)
    {
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            int j;
            int k;
label0:
            {
                if (i < s.length())
                {
                    if (s.charAt(i) == '&')
                    {
                        i++;
                        continue;
                    }
                    j = s.indexOf('&', i);
                    k = s.indexOf('=', i);
                    if (j >= 0)
                    {
                        break label0;
                    }
                    String s1;
                    if (k < 0)
                    {
                        s = Uri.decode(s.substring(i).replace('+', ' '));
                        s1 = "";
                    } else
                    {
                        s1 = Uri.decode(s.substring(i, k).replace('+', ' '));
                        String s4 = Uri.decode(s.substring(k + 1).replace('+', ' '));
                        s = s1;
                        s1 = s4;
                    }
                    if (!hashmap.containsKey(s))
                    {
                        hashmap.put(s, s1);
                    }
                }
                return hashmap;
            }
            if (k < 0 || k > j)
            {
                String s2 = Uri.decode(s.substring(i, j).replace('+', ' '));
                if (!hashmap.containsKey(s2))
                {
                    hashmap.put(s2, "");
                }
                i = j + 1;
            } else
            {
                String s3 = Uri.decode(s.substring(i, k).replace('+', ' '));
                String s5 = Uri.decode(s.substring(k + 1, j).replace('+', ' '));
                if (!hashmap.containsKey(s3))
                {
                    hashmap.put(s3, s5);
                }
                i = j + 1;
            }
        } while (true);
    }

}
