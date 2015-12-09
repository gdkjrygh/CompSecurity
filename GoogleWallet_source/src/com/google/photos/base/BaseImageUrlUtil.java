// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.photos.base;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.photos.base:
//            ImageUrlOptionsStringBuilder

public class BaseImageUrlUtil
{
    public static final class InvalidUrlException extends Exception
    {

        public InvalidUrlException(String s)
        {
            super(s);
        }
    }

    static final class OptionInfo
    {

        public boolean isBool;
        public String key;

        public final String toString()
        {
            String s = key;
            boolean flag = isBool;
            return (new StringBuilder(String.valueOf(s).length() + 9)).append("{").append(s).append(", ").append(flag).append("}").toString();
        }

        public OptionInfo(String s, boolean flag)
        {
            key = s;
            isBool = flag;
        }
    }

    public static interface UriWrapper
    {

        public abstract String getPath();

        public abstract Object getUri();

        public abstract String toString();

        public abstract UriWrapper updatePath(String s);
    }


    private static final Pattern FIFE_HOSTED_IMAGE_URL_RE = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(ci[3-6]\\.((ggpht)|(googleusercontent)|(google)))|((cp|gp)[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com/image)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
    private static final Joiner JOIN_ON_DASH = Joiner.on("-");
    private static final Joiner JOIN_ON_EQUALS = Joiner.on("=");
    private static final Joiner JOIN_ON_SLASH = Joiner.on("/");
    private static final ImmutableList OPTIONS = ImmutableList.of(new OptionInfo("s", false), new OptionInfo("w", false), new OptionInfo("c", true), new OptionInfo("d", true), new OptionInfo("h", false), new OptionInfo("s", true), new OptionInfo("h", true), new OptionInfo("p", true), new OptionInfo("pp", true), new OptionInfo("n", true), new OptionInfo("r", false), new OptionInfo("r", true), new OptionInfo[] {
        new OptionInfo("o", true), new OptionInfo("o", false), new OptionInfo("j", false), new OptionInfo("x", false), new OptionInfo("y", false), new OptionInfo("z", false), new OptionInfo("g", true), new OptionInfo("e", false), new OptionInfo("f", false), new OptionInfo("k", true), 
        new OptionInfo("u", true), new OptionInfo("ut", true), new OptionInfo("i", true), new OptionInfo("a", true), new OptionInfo("b", true), new OptionInfo("b", false), new OptionInfo("c", false), new OptionInfo("t", false), new OptionInfo("nt0", false), new OptionInfo("v", true), 
        new OptionInfo("q", false), new OptionInfo("fh", true), new OptionInfo("fv", true), new OptionInfo("fg", true), new OptionInfo("ci", true), new OptionInfo("rw", true), new OptionInfo("rwu", true), new OptionInfo("nw", true), new OptionInfo("rh", true), new OptionInfo("no", true), 
        new OptionInfo("ns", true), new OptionInfo("k", false), new OptionInfo("p", false), new OptionInfo("l", false), new OptionInfo("nu", true), new OptionInfo("ft", true), new OptionInfo("cc", true), new OptionInfo("nd", true), new OptionInfo("ip", true)
    });
    private static final Splitter SPLIT_ON_DASH = Splitter.on('-');
    private static final Splitter SPLIT_ON_EQUALS = Splitter.on('=').omitEmptyStrings().limit(2);
    private static final Splitter SPLIT_ON_SLASH = Splitter.on('/').omitEmptyStrings();

    protected BaseImageUrlUtil()
    {
    }

    private Object changeImageUrlOptions(ImageUrlOptionsStringBuilder imageurloptionsstringbuilder, UriWrapper uriwrapper, boolean flag, boolean flag1)
        throws InvalidUrlException
    {
        boolean flag2;
        if (imageurloptionsstringbuilder != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "options is null");
        if (uriwrapper != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "url is null");
        if (uriwrapper.getPath() == null)
        {
            throw new InvalidUrlException("url path is null");
        }
        List list = getPathComponents(uriwrapper);
        stripPrefixComponent(list, new String[] {
            "image", "public", "private", "proxy"
        });
        int i = list.size();
        if (i >= 4 && i <= 6)
        {
            return setLegacyImageUrlOptions(imageurloptionsstringbuilder, uriwrapper, flag, flag1);
        }
        if (i == 1)
        {
            return setContentImageUrlOptions(imageurloptionsstringbuilder, uriwrapper, flag, flag1);
        } else
        {
            throw new InvalidUrlException(uriwrapper.toString());
        }
    }

    private static List getPathComponents(UriWrapper uriwrapper)
    {
        Preconditions.checkNotNull(uriwrapper);
        return getPathComponents(uriwrapper.getPath());
    }

    private static List getPathComponents(String s)
    {
        return Lists.newArrayList(SPLIT_ON_SLASH.split(s));
    }

    public static boolean isFifeHostedUri(UriWrapper uriwrapper)
    {
        boolean flag;
        if (uriwrapper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return isFifeHostedUrl(uriwrapper.toString());
    }

    private static boolean isFifeHostedUrl(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return FIFE_HOSTED_IMAGE_URL_RE.matcher(s).find();
    }

    private static String makeOptions(String s, String s1, boolean flag)
    {
        boolean flag2 = true;
        String s2;
        boolean flag1;
        if (s != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "oldOptions is null");
        if (s1 != null)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "newOptions is null");
        s2 = s1;
        if (flag)
        {
            s2 = s1;
            if (!s.isEmpty())
            {
                s = splitOptions(s);
                s.addAll(splitOptions(s1));
                s = sortAndDedupOptions(s);
                s2 = JOIN_ON_DASH.join(s);
            }
        }
        return s2;
    }

    private static Object setContentImageUrlOptions(ImageUrlOptionsStringBuilder imageurloptionsstringbuilder, UriWrapper uriwrapper, boolean flag, boolean flag1)
    {
        Object obj;
        String s;
        boolean flag2;
        if (imageurloptionsstringbuilder != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "options is null");
        if (uriwrapper != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "url is null");
        if (uriwrapper.getPath() != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "url path is null");
        obj = Lists.newArrayList(SPLIT_ON_EQUALS.split(uriwrapper.getPath()));
        s = imageurloptionsstringbuilder.toString("", flag);
        if (((List) (obj)).size() == 2)
        {
            imageurloptionsstringbuilder = (String)((List) (obj)).get(1);
        } else
        {
            imageurloptionsstringbuilder = "";
        }
        s = makeOptions(imageurloptionsstringbuilder, s, flag1);
        obj = (String)((List) (obj)).get(0);
        imageurloptionsstringbuilder = ((ImageUrlOptionsStringBuilder) (obj));
        if (!s.isEmpty())
        {
            imageurloptionsstringbuilder = JOIN_ON_EQUALS.join(obj, s, new Object[0]);
        }
        return uriwrapper.updatePath(imageurloptionsstringbuilder).getUri();
    }

    private static Object setLegacyImageUrlOptions(ImageUrlOptionsStringBuilder imageurloptionsstringbuilder, UriWrapper uriwrapper, boolean flag, boolean flag1)
    {
        boolean flag5 = true;
        List list;
        String s;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (imageurloptionsstringbuilder != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        Preconditions.checkArgument(flag4, "options is null");
        if (uriwrapper != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        Preconditions.checkArgument(flag4, "url is null");
        if (uriwrapper.getPath() != null)
        {
            flag4 = flag5;
        } else
        {
            flag4 = false;
        }
        Preconditions.checkArgument(flag4, "url path is null");
        s = uriwrapper.getPath();
        list = getPathComponents(s);
        flag3 = false;
        flag2 = flag3;
        if (list.size() > 0)
        {
            flag2 = flag3;
            if (((String)list.get(0)).equals("image"))
            {
                list.remove(0);
                flag2 = true;
            }
        }
        if (s.endsWith("/"))
        {
            list.add("");
        }
        if (list.size() == 4)
        {
            list.add("");
        } else
        if (list.size() == 5)
        {
            list.add(4, "");
        }
        imageurloptionsstringbuilder = imageurloptionsstringbuilder.toString("", flag);
        list.set(4, makeOptions((String)list.get(4), imageurloptionsstringbuilder, flag1));
        if (flag2)
        {
            list.add(0, "image");
        }
        imageurloptionsstringbuilder = String.valueOf(JOIN_ON_SLASH.join(list));
        if (imageurloptionsstringbuilder.length() != 0)
        {
            imageurloptionsstringbuilder = "/".concat(imageurloptionsstringbuilder);
        } else
        {
            imageurloptionsstringbuilder = new String("/");
        }
        return uriwrapper.updatePath(imageurloptionsstringbuilder).getUri();
    }

    private static List sortAndDedupOptions(List list)
    {
        ArrayListMultimap arraylistmultimap;
        java.util.ArrayList arraylist;
        Object obj1;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "options is null");
        arraylistmultimap = ArrayListMultimap.create();
        arraylist = Lists.newArrayList();
        obj1 = list.iterator();
label0:
        do
        {
            if (((Iterator) (obj1)).hasNext())
            {
                String s1 = (String)((Iterator) (obj1)).next();
                list = null;
                com.google.common.collect.UnmodifiableIterator unmodifiableiterator1 = OPTIONS.iterator();
                do
                {
label1:
                    {
                        Object obj = list;
                        if (unmodifiableiterator1.hasNext())
                        {
                            obj = (OptionInfo)unmodifiableiterator1.next();
                            if (!s1.toLowerCase().startsWith(((OptionInfo) (obj)).key))
                            {
                                continue;
                            }
                            if (!((OptionInfo) (obj)).isBool)
                            {
                                break label1;
                            }
                            if (s1.length() != ((OptionInfo) (obj)).key.length())
                            {
                                continue;
                            }
                        }
                        if (obj != null)
                        {
                            arraylistmultimap.put(obj, s1);
                        } else
                        {
                            arraylist.add(s1);
                        }
                        continue label0;
                    }
                    list = ((List) (obj));
                } while (true);
            }
            obj1 = Lists.newArrayList();
            com.google.common.collect.UnmodifiableIterator unmodifiableiterator = OPTIONS.iterator();
            do
            {
                if (!unmodifiableiterator.hasNext())
                {
                    break;
                }
                OptionInfo optioninfo = (OptionInfo)unmodifiableiterator.next();
                list = "";
                for (Iterator iterator = arraylistmultimap.get(optioninfo).iterator(); iterator.hasNext();)
                {
                    String s = (String)iterator.next();
                    if (Character.isUpperCase(s.charAt(0)))
                    {
                        ((List) (obj1)).add(s);
                    } else
                    {
                        list = s;
                    }
                }

                if (!list.isEmpty())
                {
                    ((List) (obj1)).add(list);
                }
            } while (true);
            ((List) (obj1)).addAll(arraylist);
            return ((List) (obj1));
        } while (true);
    }

    private static List splitOptions(String s)
    {
        java.util.ArrayList arraylist;
        Iterator iterator;
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "options is null");
        arraylist = Lists.newArrayList();
        iterator = SPLIT_ON_DASH.split(s).iterator();
label0:
        do
        {
            Object obj1;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                String s1 = (String)iterator.next();
                if (s1.isEmpty())
                {
                    continue;
                }
                s = s1;
                if (!s1.startsWith("O"))
                {
                    obj1 = s1;
                    if (!s1.startsWith("J"))
                    {
                        break label1;
                    }
                    s = s1;
                }
                do
                {
                    obj1 = s;
                    if (s.length() >= 12)
                    {
                        break;
                    }
                    obj1 = JOIN_ON_DASH;
                    Object obj;
                    if (iterator.hasNext())
                    {
                        obj = iterator.next();
                    } else
                    {
                        obj = "";
                    }
                    s = ((Joiner) (obj1)).join(s, obj, new Object[0]);
                } while (true);
            }
            arraylist.add(obj1);
        } while (true);
        return arraylist;
    }

    private static transient void stripPrefixComponent(List list, String as[])
    {
        if (list.size() > 0 && Arrays.asList(as).contains(list.get(0)))
        {
            list.remove(0);
        }
    }

    public final Object mergeImageUrlOptions(ImageUrlOptionsStringBuilder imageurloptionsstringbuilder, UriWrapper uriwrapper, boolean flag)
        throws InvalidUrlException
    {
        return changeImageUrlOptions(imageurloptionsstringbuilder, uriwrapper, flag, true);
    }

}
