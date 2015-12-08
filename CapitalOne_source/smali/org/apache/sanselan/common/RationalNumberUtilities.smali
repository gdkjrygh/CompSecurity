.class public abstract Lorg/apache/sanselan/common/RationalNumberUtilities;
.super Ljava/lang/Number;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    return-void
.end method

.method public static final a(D)Lorg/apache/sanselan/common/RationalNumber;
    .locals 14

    const-wide/16 v8, 0x0

    const/4 v3, 0x0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    const v1, 0x7fffffff

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    :goto_0
    return-object v0

    :cond_0
    const-wide v0, -0x3e20000000400000L    # -2.147483647E9

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_1

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    const v1, -0x7fffffff

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    goto :goto_0

    :cond_1
    cmpg-double v0, p0, v8

    if-gez v0, :cond_c

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    move v5, v2

    :goto_1
    cmpl-double v0, p0, v8

    if-nez v0, :cond_2

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v0, v3, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    goto :goto_0

    :cond_2
    cmpl-double v0, p0, v6

    if-ltz v0, :cond_5

    double-to-int v4, p0

    int-to-double v0, v4

    cmpg-double v0, v0, p0

    if-gez v0, :cond_4

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v0, v4, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    new-instance v1, Lorg/apache/sanselan/common/RationalNumber;

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v1, v4, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    :goto_2
    invoke-static {v0, p0, p1}, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a(Lorg/apache/sanselan/common/RationalNumber;D)Lorg/apache/sanselan/common/RationalNumberUtilities$Option;

    move-result-object v2

    invoke-static {v1, p0, p1}, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a(Lorg/apache/sanselan/common/RationalNumber;D)Lorg/apache/sanselan/common/RationalNumberUtilities$Option;

    move-result-object v1

    iget-wide v6, v2, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    iget-wide v8, v1, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    cmpg-double v0, v6, v8

    if-gez v0, :cond_7

    move-object v0, v2

    :goto_3
    move v12, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    move v0, v12

    :goto_4
    iget-wide v6, v1, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    const-wide v8, 0x3e45798ee2308c3aL    # 1.0E-8

    cmpl-double v4, v6, v8

    if-lez v4, :cond_3

    const/16 v4, 0x64

    if-lt v0, v4, :cond_8

    :cond_3
    if-eqz v5, :cond_b

    iget-object v0, v1, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/RationalNumber;->a()Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v0

    goto :goto_0

    :cond_4
    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    add-int/lit8 v1, v4, -0x1

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    new-instance v1, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v1, v4, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    goto :goto_2

    :cond_5
    div-double v0, v6, p0

    double-to-int v4, v0

    int-to-double v0, v4

    div-double v0, v6, v0

    cmpg-double v0, v0, p0

    if-gez v0, :cond_6

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v0, v2, v4}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    new-instance v1, Lorg/apache/sanselan/common/RationalNumber;

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v1, v2, v4}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    goto :goto_2

    :cond_6
    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    add-int/lit8 v1, v4, 0x1

    invoke-direct {v0, v2, v1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    new-instance v1, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v1, v2, v4}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    goto :goto_2

    :cond_7
    move-object v0, v1

    goto :goto_3

    :cond_8
    iget-object v4, v3, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    iget v4, v4, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-long v6, v4

    iget-object v4, v2, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    iget v4, v4, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-long v8, v4

    add-long/2addr v6, v8

    iget-object v4, v3, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    iget v4, v4, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-long v8, v4

    iget-object v4, v2, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    iget v4, v4, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-long v10, v4

    add-long/2addr v8, v10

    invoke-static {v6, v7, v8, v9}, Lorg/apache/sanselan/common/RationalNumber;->a(JJ)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v6

    invoke-static {v6, p0, p1}, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a(Lorg/apache/sanselan/common/RationalNumber;D)Lorg/apache/sanselan/common/RationalNumberUtilities$Option;

    move-result-object v4

    invoke-virtual {v6}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v6

    cmpg-double v6, p0, v6

    if-gez v6, :cond_a

    iget-wide v6, v2, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    iget-wide v8, v4, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    cmpg-double v2, v6, v8

    if-lez v2, :cond_3

    move-object v2, v4

    :goto_5
    iget-wide v6, v4, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    iget-wide v8, v1, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    cmpg-double v6, v6, v8

    if-gez v6, :cond_9

    move-object v1, v4

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_4

    :cond_a
    iget-wide v6, v3, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    iget-wide v8, v4, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    cmpg-double v3, v6, v8

    if-lez v3, :cond_3

    move-object v3, v4

    goto :goto_5

    :cond_b
    iget-object v0, v1, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    goto/16 :goto_0

    :cond_c
    move v5, v3

    goto/16 :goto_1
.end method
