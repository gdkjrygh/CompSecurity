// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class MinElf
{

    public MinElf()
    {
    }

    private static String a(FileChannel filechannel, ByteBuffer bytebuffer, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            short word0 = e(filechannel, bytebuffer, l);
            if (word0 != 0)
            {
                stringbuilder.append((char)word0);
                l = 1L + l;
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    private static void a(FileChannel filechannel, ByteBuffer bytebuffer, int i, long l)
    {
        bytebuffer.position(0);
        bytebuffer.limit(i);
        do
        {
            if (bytebuffer.remaining() <= 0)
            {
                break;
            }
            i = filechannel.read(bytebuffer, l);
            if (i == -1)
            {
                break;
            }
            l += i;
        } while (true);
        if (bytebuffer.remaining() > 0)
        {
            throw new ElfError("ELF file truncated");
        } else
        {
            bytebuffer.position(0);
            return;
        }
    }

    public static String[] a(File file)
    {
        file = new FileInputStream(file);
        String as[] = a(file.getChannel());
        file.close();
        return as;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    private static String[] a(FileChannel filechannel)
    {
        ByteBuffer bytebuffer;
        int i;
        boolean flag;
        int j;
        long l1;
        long l2;
        long l3;
        long l5;
        long l8;
        bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (c(filechannel, bytebuffer, 0L) != 0x464c457fL)
        {
            throw new ElfError("file is not ELF");
        }
        if (e(filechannel, bytebuffer, 4L) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e(filechannel, bytebuffer, 5L) == 2)
        {
            bytebuffer.order(ByteOrder.BIG_ENDIAN);
        }
        if (flag)
        {
            l1 = c(filechannel, bytebuffer, 28L);
        } else
        {
            l1 = b(filechannel, bytebuffer, 32L);
        }
        if (flag)
        {
            l2 = d(filechannel, bytebuffer, 44L);
        } else
        {
            l2 = d(filechannel, bytebuffer, 56L);
        }
        if (flag)
        {
            j = d(filechannel, bytebuffer, 42L);
        } else
        {
            j = d(filechannel, bytebuffer, 54L);
        }
        l5 = l2;
        if (l2 == 65535L)
        {
            long l9;
            if (flag)
            {
                l2 = c(filechannel, bytebuffer, 32L);
            } else
            {
                l2 = b(filechannel, bytebuffer, 40L);
            }
            if (flag)
            {
                l5 = c(filechannel, bytebuffer, l2 + 28L);
            } else
            {
                l5 = c(filechannel, bytebuffer, l2 + 44L);
            }
        }
        l9 = 0L;
        l3 = 0L;
        l8 = l1;
label0:
        do
        {
label1:
            {
                l2 = l9;
                if (l3 < l5)
                {
                    if (c(filechannel, bytebuffer, 0L + l8) != 2L)
                    {
                        break label1;
                    }
                    if (flag)
                    {
                        l2 = c(filechannel, bytebuffer, 4L + l8);
                    } else
                    {
                        l2 = b(filechannel, bytebuffer, 8L + l8);
                    }
                }
                if (l2 == 0L)
                {
                    throw new ElfError("ELF file does not contain dynamic linking information");
                }
                break label0;
            }
            l8 += j;
            l3++;
        } while (true);
        i = 0;
        l3 = 0L;
        l8 = l2;
_L4:
        long l12;
        long l10;
        if (flag)
        {
            l10 = c(filechannel, bytebuffer, 0L + l8);
        } else
        {
            l10 = b(filechannel, bytebuffer, 0L + l8);
        }
        if (l10 == 1L)
        {
            if (i == 0x7fffffff)
            {
                throw new ElfError("malformed DT_NEEDED section");
            }
            i++;
        } else
        if (l10 == 5L)
        {
            if (flag)
            {
                l3 = c(filechannel, bytebuffer, 4L + l8);
            } else
            {
                l3 = b(filechannel, bytebuffer, 8L + l8);
            }
        }
        if (flag)
        {
            l12 = 8L;
        } else
        {
            l12 = 16L;
        }
        if (l10 != 0L)
        {
            break MISSING_BLOCK_LABEL_872;
        }
        if (l3 == 0L)
        {
            throw new ElfError("Dynamic section string-table not found");
        }
        int l = 0;
        do
        {
            if ((long)l >= l5)
            {
                break MISSING_BLOCK_LABEL_866;
            }
            if (c(filechannel, bytebuffer, 0L + l1) == 1L)
            {
                long l11;
                if (flag)
                {
                    l8 = c(filechannel, bytebuffer, 8L + l1);
                } else
                {
                    l8 = b(filechannel, bytebuffer, 16L + l1);
                }
                if (flag)
                {
                    l11 = c(filechannel, bytebuffer, 20L + l1);
                } else
                {
                    l11 = b(filechannel, bytebuffer, 40L + l1);
                }
                if (l8 <= l3 && l3 < l11 + l8)
                {
                    if (flag)
                    {
                        l1 = c(filechannel, bytebuffer, 4L + l1);
                    } else
                    {
                        l1 = b(filechannel, bytebuffer, 8L + l1);
                    }
                    l1 += l3 - l8;
                    break MISSING_BLOCK_LABEL_608;
                }
            }
            l8 = j;
            l++;
            l1 = l8 + l1;
        } while (true);
_L2:
        if (l1 == 0L)
        {
            throw new ElfError("did not find file offset of DT_STRTAB table");
        }
        String as[] = new String[i];
        i = 0;
        do
        {
            int k;
            long l4;
            if (flag)
            {
                l4 = c(filechannel, bytebuffer, 0L + l2);
            } else
            {
                l4 = b(filechannel, bytebuffer, 0L + l2);
            }
            k = i;
            if (l4 == 1L)
            {
                long l6;
                if (flag)
                {
                    l6 = c(filechannel, bytebuffer, 4L + l2);
                } else
                {
                    l6 = b(filechannel, bytebuffer, 8L + l2);
                }
                as[i] = a(filechannel, bytebuffer, l6 + l1);
                if (i == 0x7fffffff)
                {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                k = i + 1;
            }
            long l7;
            if (flag)
            {
                l7 = 8L;
            } else
            {
                l7 = 16L;
            }
            if (l4 == 0L)
            {
                if (k != as.length)
                {
                    throw new ElfError("malformed DT_NEEDED section");
                } else
                {
                    return as;
                }
            }
            l2 = l7 + l2;
            i = k;
        } while (true);
        l1 = 0L;
        if (true) goto _L2; else goto _L1
_L1:
        l8 = l12 + l8;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static long b(FileChannel filechannel, ByteBuffer bytebuffer, long l)
    {
        a(filechannel, bytebuffer, 8, l);
        return bytebuffer.getLong();
    }

    private static long c(FileChannel filechannel, ByteBuffer bytebuffer, long l)
    {
        a(filechannel, bytebuffer, 4, l);
        return (long)bytebuffer.getInt() & 0xffffffffL;
    }

    private static int d(FileChannel filechannel, ByteBuffer bytebuffer, long l)
    {
        a(filechannel, bytebuffer, 2, l);
        return bytebuffer.getShort() & 0xffff;
    }

    private static short e(FileChannel filechannel, ByteBuffer bytebuffer, long l)
    {
        a(filechannel, bytebuffer, 1, l);
        return (short)(bytebuffer.get() & 0xff);
    }

    private class ElfError extends RuntimeException
    {

        ElfError(String s)
        {
            super(s);
        }
    }

}
