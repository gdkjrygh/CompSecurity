// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import com.a.c.d;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih

public final class hw
{

    private static SharedPreferences a;

    public static void A(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_2_3", true);
        context.apply();
    }

    public static boolean B(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_2_3", false);
    }

    public static void C(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_2_3", true);
        context.apply();
    }

    public static boolean D(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_2_3", false);
    }

    public static void E(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_2_3", true);
        context.apply();
    }

    public static boolean F(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_1_1", false);
    }

    public static void G(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_1_1", true);
        context.apply();
    }

    public static boolean H(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_1_1", false);
    }

    public static void I(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_1_1", true);
        context.apply();
    }

    public static boolean J(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_1_1", false);
    }

    public static void K(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_1_1", true);
        context.apply();
    }

    public static boolean L(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_1_1", false);
    }

    public static void M(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_1_1", true);
        context.apply();
    }

    public static boolean N(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_3_5", false);
    }

    public static void O(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_3_5", true);
        context.apply();
    }

    public static boolean P(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_3_5", false);
    }

    public static void Q(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_3_5", true);
        context.apply();
    }

    public static boolean R(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_3_5", false);
    }

    public static void S(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_3_5", true);
        context.apply();
    }

    public static boolean T(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_3_5", false);
    }

    public static void U(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_3_5", true);
        context.apply();
    }

    public static boolean V(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_9_16", false);
    }

    public static void W(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_9_16", true);
        context.apply();
    }

    public static boolean X(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_9_16", false);
    }

    public static void Y(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_9_16", true);
        context.apply();
    }

    public static boolean Z(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_9_16", false);
    }

    private static int a()
    {
        float f1 = ih.C().t();
        if (f1 == 1.0F)
        {
            return 0;
        }
        if (f1 == 1.333333F || f1 == 0.75F)
        {
            return 1;
        }
        if (f1 == 1.4F || f1 == 0.7142857F)
        {
            return 2;
        }
        if (f1 == 0.6666667F || f1 == 1.5F)
        {
            return 3;
        }
        if (f1 == 1.666667F || f1 == 0.6F)
        {
            return 4;
        }
        return f1 != 0.5625F && f1 != 1.777778F ? -1 : 5;
    }

    public static void a(Context context, int i1)
    {
        bf(context);
        context = a.edit();
        if (az.q == 0 || az.q == 5 || az.q == 4 || az.q == 8)
        {
            context.putInt("Save_Resolution_Grid", i1);
        } else
        if (az.q == 1)
        {
            context.putInt("Save_Resolution_Free", i1);
        } else
        if (az.q == 7)
        {
            context.putInt("Save_Resolution_CameraSelfie", i1);
        } else
        {
            context.putInt("Save_Resolution_WideHigh", i1);
        }
        context.apply();
    }

    public static void a(Context context, String s1)
    {
        bf(context);
        context = a.edit();
        context.putString("Save_Quality", s1);
        context.apply();
    }

    public static void a(Context context, boolean flag)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Save_Format", flag);
        context.apply();
    }

    public static boolean a(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        int i1 = ((DisplayMetrics) (context)).widthPixels;
        return ((DisplayMetrics) (context)).heightPixels >= 1184 || i1 >= 1184;
    }

    public static void aA(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_2_3", true);
        context.apply();
    }

    public static boolean aB(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_1_1", false);
    }

    public static void aC(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_1_1", true);
        context.apply();
    }

    public static boolean aD(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_1_1", false);
    }

    public static void aE(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_1_1", true);
        context.apply();
    }

    public static boolean aF(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_1_1", false);
    }

    public static void aG(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_1_1", true);
        context.apply();
    }

    public static boolean aH(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_1_1", false);
    }

    public static void aI(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_1_1", true);
        context.apply();
    }

    public static boolean aJ(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_3_5", false);
    }

    public static void aK(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_3_5", true);
        context.apply();
    }

    public static boolean aL(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_3_5", false);
    }

    public static void aM(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_3_5", true);
        context.apply();
    }

    public static boolean aN(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_3_5", false);
    }

    public static void aO(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_3_5", true);
        context.apply();
    }

    public static boolean aP(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_3_5", false);
    }

    public static void aQ(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_3_5", true);
        context.apply();
    }

    public static boolean aR(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_9_16", false);
    }

    public static void aS(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_9_16", true);
        context.apply();
    }

    public static boolean aT(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_9_16", false);
    }

    public static void aU(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_9_16", true);
        context.apply();
    }

    public static boolean aV(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_9_16", false);
    }

    public static void aW(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_9_16", true);
        context.apply();
    }

    public static boolean aX(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_9_16", false);
    }

    public static void aY(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_9_16", true);
        context.apply();
    }

    public static int aZ(Context context)
    {
        bf(context);
        return a.getInt("Grid_Proportion_Pass_Area", 0x11cc40);
    }

    public static void aa(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_9_16", true);
        context.apply();
    }

    public static boolean ab(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_9_16", false);
    }

    public static void ac(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_9_16", true);
        context.apply();
    }

    public static boolean ad(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_4_3", false);
    }

    public static void ae(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_4_3", true);
        context.apply();
    }

    public static boolean af(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_4_3", false);
    }

    public static void ag(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_4_3", true);
        context.apply();
    }

    public static boolean ah(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_4_3", false);
    }

    public static void ai(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_4_3", true);
        context.apply();
    }

    public static boolean aj(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_4_3", false);
    }

    public static void ak(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_4_3", true);
        context.apply();
    }

    public static boolean al(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_5_7", false);
    }

    public static void am(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_5_7", true);
        context.apply();
    }

    public static boolean an(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_5_7", false);
    }

    public static void ao(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_5_7", true);
        context.apply();
    }

    public static boolean ap(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_5_7", false);
    }

    public static void aq(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_5_7", true);
        context.apply();
    }

    public static boolean ar(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_5_7", false);
    }

    public static void as(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion2048_5_7", true);
        context.apply();
    }

    public static boolean at(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1080_2_3", false);
    }

    public static void au(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1080_2_3", true);
        context.apply();
    }

    public static boolean av(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1660_2_3", false);
    }

    public static void aw(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1660_2_3", true);
        context.apply();
    }

    public static boolean ax(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion1920_2_3", false);
    }

    public static void ay(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Free_Proportion1920_2_3", true);
        context.apply();
    }

    public static boolean az(Context context)
    {
        bf(context);
        return a.getBoolean("Free_Proportion2048_2_3", false);
    }

    public static void b(Context context, int i1)
    {
        bf(context);
        context = a.edit();
        context.putInt("Grid_Proportion_Pass_Area", i1);
        context.apply();
    }

    public static boolean b(Context context)
    {
        bf(context);
        return a.getBoolean("Save_Format", false);
    }

    public static int ba(Context context)
    {
        bf(context);
        return a.getInt("Grid_Proportion_Fail_Area", 0x71c71c);
    }

    public static int bb(Context context)
    {
        bf(context);
        return a.getInt("Free_Proportion_Pass_Area", 0x11cc40);
    }

    public static int bc(Context context)
    {
        bf(context);
        return a.getInt("Free_Proportion_Fail_Area", 0x71c71c);
    }

    public static int[] bd(Context context)
    {
        if (a() == 0)
        {
            if (F(context))
            {
                if (H(context))
                {
                    if (J(context))
                    {
                        if (L(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 1)
        {
            if (h(context))
            {
                if (j(context))
                {
                    if (l(context))
                    {
                        if (n(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 2)
        {
            if (p(context))
            {
                if (r(context))
                {
                    if (t(context))
                    {
                        if (v(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 3)
        {
            if (x(context))
            {
                if (z(context))
                {
                    if (B(context))
                    {
                        if (D(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 4)
        {
            if (N(context))
            {
                if (P(context))
                {
                    if (R(context))
                    {
                        if (T(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (V(context))
        {
            if (X(context))
            {
                if (Z(context))
                {
                    if (ab(context))
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660, 1920, 2048
                        });
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660, 1920
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080, 1660
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024, 1080
                });
            }
        } else
        {
            return (new int[] {
                720, 1024
            });
        }
    }

    public static int[] be(Context context)
    {
        if (a() == 0)
        {
            if (aB(context))
            {
                if (aD(context))
                {
                    if (aF(context))
                    {
                        if (aH(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 1)
        {
            if (ad(context))
            {
                if (af(context))
                {
                    if (ah(context))
                    {
                        if (aj(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 2)
        {
            if (al(context))
            {
                if (an(context))
                {
                    if (ap(context))
                    {
                        if (ar(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 3)
        {
            if (at(context))
            {
                if (av(context))
                {
                    if (ax(context))
                    {
                        if (az(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (a() == 4)
        {
            if (aJ(context))
            {
                if (aL(context))
                {
                    if (aN(context))
                    {
                        if (aP(context))
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920, 2048
                            });
                        } else
                        {
                            return (new int[] {
                                720, 1024, 1080, 1660, 1920
                            });
                        }
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024
                });
            }
        }
        if (aR(context))
        {
            if (aT(context))
            {
                if (aV(context))
                {
                    if (aX(context))
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660, 1920, 2048
                        });
                    } else
                    {
                        return (new int[] {
                            720, 1024, 1080, 1660, 1920
                        });
                    }
                } else
                {
                    return (new int[] {
                        720, 1024, 1080, 1660
                    });
                }
            } else
            {
                return (new int[] {
                    720, 1024, 1080
                });
            }
        } else
        {
            return (new int[] {
                720, 1024
            });
        }
    }

    private static void bf(Context context)
    {
        if (a == null)
        {
            a = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    public static int c(Context context)
    {
        bf(context);
        if (az.q == 0 || az.q == 5 || az.q == 4 || az.q == 8)
        {
            return a.getInt("Save_Resolution_Grid", 0);
        }
        if (az.q == 1)
        {
            return a.getInt("Save_Resolution_Free", 0);
        }
        if (az.q == 7)
        {
            return a.getInt("Save_Resolution_CameraSelfie", 0);
        } else
        {
            return a.getInt("Save_Resolution_WideHigh", 0);
        }
    }

    public static void c(Context context, int i1)
    {
        bf(context);
        context = a.edit();
        context.putInt("Grid_Proportion_Fail_Area", i1);
        context.apply();
    }

    public static String d(Context context)
    {
        bf(context);
        SharedPreferences sharedpreferences = a;
        if (com.a.c.d.a())
        {
            context = "Smart";
        } else
        {
            context = "Medium";
        }
        return sharedpreferences.getString("Save_Quality", context);
    }

    public static void d(Context context, int i1)
    {
        bf(context);
        context = a.edit();
        context.putInt("Free_Proportion_Pass_Area", i1);
        context.apply();
    }

    public static void e(Context context, int i1)
    {
        bf(context);
        context = a.edit();
        context.putInt("Free_Proportion_Fail_Area", i1);
        context.apply();
    }

    public static boolean e(Context context)
    {
        bf(context);
        return a.contains("Save_Quality");
    }

    public static boolean f(Context context)
    {
        bf(context);
        if (az.q == 1)
        {
            return a.getBoolean("Free_Tested", false);
        } else
        {
            return a.getBoolean("Grid_Tested", false);
        }
    }

    public static void g(Context context)
    {
        if (az.q == 1)
        {
            if (aH(context) && aj(context) && ar(context) && az(context) && aP(context) && aX(context))
            {
                bf(context);
                context = a.edit();
                context.putBoolean("Free_Tested", true);
                context.apply();
            }
        } else
        if (L(context) && n(context) && v(context) && D(context) && T(context) && ab(context))
        {
            bf(context);
            context = a.edit();
            context.putBoolean("Grid_Tested", true);
            context.apply();
            return;
        }
    }

    public static boolean h(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_4_3", false);
    }

    public static void i(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_4_3", true);
        context.apply();
    }

    public static boolean j(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_4_3", false);
    }

    public static void k(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_4_3", true);
        context.apply();
    }

    public static boolean l(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_4_3", false);
    }

    public static void m(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_4_3", true);
        context.apply();
    }

    public static boolean n(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_4_3", false);
    }

    public static void o(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_4_3", true);
        context.apply();
    }

    public static boolean p(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_5_7", false);
    }

    public static void q(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_5_7", true);
        context.apply();
    }

    public static boolean r(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_5_7", false);
    }

    public static void s(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1660_5_7", true);
        context.apply();
    }

    public static boolean t(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1920_5_7", false);
    }

    public static void u(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1920_5_7", true);
        context.apply();
    }

    public static boolean v(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion2048_5_7", false);
    }

    public static void w(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion2048_5_7", true);
        context.apply();
    }

    public static boolean x(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1080_2_3", false);
    }

    public static void y(Context context)
    {
        bf(context);
        context = a.edit();
        context.putBoolean("Grid_Proportion1080_2_3", true);
        context.apply();
    }

    public static boolean z(Context context)
    {
        bf(context);
        return a.getBoolean("Grid_Proportion1660_2_3", false);
    }
}
