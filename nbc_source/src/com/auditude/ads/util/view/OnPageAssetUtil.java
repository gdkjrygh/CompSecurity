// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.view;

import com.auditude.ads.util.Base64Coder;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.URLUtil;

public final class OnPageAssetUtil
{

    public OnPageAssetUtil()
    {
    }

    public static String GetHTMLForIFrameURL(String s, double d, double d1, String as[])
    {
        return (new StringBuilder("<iframe width=\"")).append(d).append("\" height=\"").append(d1).append("\" frameborder=\"0\" scrolling=\"no\" ").append("allowtransparency=\"true\" leftmargin=\"0\" rightmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" ").append("src=\"").append(s).append("\"></iframe>").append(GetTrackingPixels(as)).toString();
    }

    public static String GetHTMLForImageURL(String s, String s1, double d, double d1, String s2, String as[])
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder("");
        if (StringUtil.isNullOrEmpty(s1))
        {
            stringbuilder.append((new StringBuilder("<img width=\"")).append(d).append("\" height=\"").append(d1).append("\" src=\"").append(s).append("\" alt=\"").append(s2).append("\" border=\"0\"/>").toString());
        } else
        {
            stringbuilder.append((new StringBuilder("<a href=\"")).append(s1).append("\"  target=\"_blank\">").toString());
            stringbuilder.append((new StringBuilder("<img width=\"")).append(d).append("\" height=\"").append(d1).append("\" src=\"").append(s).append("\" alt=\"").append(s2).append("\" border=\"0\"/>").toString());
            stringbuilder.append("</a>");
        }
        stringbuilder.append(GetTrackingPixels(as));
        return stringbuilder.toString();
    }

    public static String GetHTMLForSWFURL(String s, String s1, String s2, String s3, double d, double d1, 
            String as[])
    {
        String s4 = s2;
        if (StringUtil.isNullOrEmpty(s2))
        {
            s4 = "";
        }
        return GetSWFObjectTag(s, s3, d, d1, (new StringBuilder("au=")).append(URLUtil.urlEncode(s1)).append("&cu=").append(Base64Coder.encodeString(s4)).append("&cw=").append(d).append("&ch=").append(d1).append("&").append(GetTrackingPixelsAsParamString(as)).toString(), "", "#000000");
    }

    public static String GetSWFObjectTag(String s, String s1, double d, double d1, String s2, String s3, 
            String s4)
    {
        String s5 = s2;
        if (StringUtil.isNullOrEmpty(s2))
        {
            s5 = "";
        }
        String s6 = (new StringBuilder("<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" id=\"")).append(s1).append("\" width=\"").append(d).append("px\" height=\"").append(d1).append("px\"").toString();
        s2 = s6;
        if (!StringUtil.isNullOrEmpty(s3))
        {
            s2 = (new StringBuilder(String.valueOf(s6))).append(" style=\"").append(s3).append("\" ").toString();
        }
        return (new StringBuilder(String.valueOf(s2))).append("codebase=\"http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab\"><param name=\"movie\" value=\"").append(s).append("\"/>").append("<param name=\"bgColor\" value=\"").append(s4).append("\"/>").append("<param name=\"flashVars\" value=\"").append(s5).append("\"/>").append("<param name=\"quality\" value=\"high\"/>").append("<param name=\"allowScriptAccess\" value=\"always\"/>").append("<param name=\"loop\" VALUE=\"true\"/>").append("<param name=\"play\" VALUE=\"true\"/>").append("<embed src=\"").append(s).append("\" bgColor=\"").append(s4).append("\" flashVars=\"").append(s5).append("\" ").append("width=\"").append(d).append("px\" height=\"").append(d1).append("px\" name=\"").append(s1).append("\" align=\"middle\" ").append("play=\"true\" loop=\"true\" quality=\"high\" allowScriptAccess=\"always\" ").append("type=\"application/x-shockwave-flash\" ").append("pluginspage=\"http://www.adobe.com/go/getflashplayer\">").append("</embed>").append("</object>").toString();
    }

    public static String GetTrackingPixel(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return "";
        } else
        {
            return (new StringBuilder("<img src=\"")).append(s).append("\" width=\"1\" height=\"1\" border=\"0\" ").append("style=\"height:1px;width:1px;border:0;position:absolute;top:0;").append("left:0;background-color:Transparent;background-image:none;padding:0;margin:0;\" />").toString();
        }
    }

    public static String GetTrackingPixels(String as[])
    {
        if (as == null || as.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder("");
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder.toString();
            }
            String s = as[i];
            if (!StringUtil.isNullOrEmpty(s))
            {
                stringbuilder.append("\n");
                stringbuilder.append(GetTrackingPixel(s));
            }
            i++;
        } while (true);
    }

    public static String GetTrackingPixelsAsParamString(String as[])
    {
        StringBuilder stringbuilder;
        int i;
        if (as == null || as.length == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder("");
        i = 0;
_L2:
        if (i >= as.length)
        {
            return stringbuilder.toString();
        }
        if (!StringUtil.isNullOrEmpty(as[i]))
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder.append((new StringBuilder("im=")).append(URLUtil.urlEncode(as[i])).toString());
        if (i < as.length - 1)
        {
            stringbuilder.append("&");
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
