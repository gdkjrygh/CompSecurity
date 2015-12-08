.class public final Lcom/roidapp/photogrid/release/hw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/SharedPreferences;


# direct methods
.method public static A(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 359
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 360
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 361
    const-string v1, "Grid_Proportion1660_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 362
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 363
    return-void
.end method

.method public static B(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 366
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 367
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static C(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 371
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 372
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 373
    const-string v1, "Grid_Proportion1920_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 374
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 375
    return-void
.end method

.method public static D(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 378
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 379
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static E(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 383
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 384
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 385
    const-string v1, "Grid_Proportion2048_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 386
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 387
    return-void
.end method

.method public static F(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 391
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 392
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static G(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 396
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 397
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 398
    const-string v1, "Grid_Proportion1080_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 399
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 400
    return-void
.end method

.method public static H(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 403
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 404
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static I(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 408
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 409
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 410
    const-string v1, "Grid_Proportion1660_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 411
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 412
    return-void
.end method

.method public static J(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 415
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 416
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static K(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 420
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 421
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 422
    const-string v1, "Grid_Proportion1920_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 423
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 424
    return-void
.end method

.method public static L(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 427
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 428
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static M(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 432
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 433
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 434
    const-string v1, "Grid_Proportion2048_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 435
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 436
    return-void
.end method

.method public static N(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 440
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 441
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static O(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 445
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 446
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 447
    const-string v1, "Grid_Proportion1080_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 448
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 449
    return-void
.end method

.method public static P(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 452
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 453
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static Q(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 457
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 458
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 459
    const-string v1, "Grid_Proportion1660_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 460
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 461
    return-void
.end method

.method public static R(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 464
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 465
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static S(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 469
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 470
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 471
    const-string v1, "Grid_Proportion1920_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 472
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 473
    return-void
.end method

.method public static T(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 476
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 477
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static U(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 481
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 482
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 483
    const-string v1, "Grid_Proportion2048_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 484
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 485
    return-void
.end method

.method public static V(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 489
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 490
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static W(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 494
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 495
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 496
    const-string v1, "Grid_Proportion1080_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 497
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 498
    return-void
.end method

.method public static X(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 501
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 502
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static Y(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 506
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 507
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 508
    const-string v1, "Grid_Proportion1660_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 509
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 510
    return-void
.end method

.method public static Z(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 513
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 514
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private static a()I
    .locals 2

    .prologue
    .line 896
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    .line 897
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    .line 898
    const/4 v0, 0x0

    .line 915
    :goto_0
    return v0

    .line 900
    :cond_0
    const v1, 0x3faaaaab

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    const/high16 v1, 0x3f400000    # 0.75f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_2

    .line 901
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 903
    :cond_2
    const v1, 0x3fb33333    # 1.4f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_3

    const v1, 0x3f36db6e

    cmpl-float v1, v0, v1

    if-nez v1, :cond_4

    .line 904
    :cond_3
    const/4 v0, 0x2

    goto :goto_0

    .line 906
    :cond_4
    const v1, 0x3f2aaaab

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_5

    const/high16 v1, 0x3fc00000    # 1.5f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_6

    .line 907
    :cond_5
    const/4 v0, 0x3

    goto :goto_0

    .line 909
    :cond_6
    const v1, 0x3fd55555

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_7

    const v1, 0x3f19999a    # 0.6f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_8

    .line 910
    :cond_7
    const/4 v0, 0x4

    goto :goto_0

    .line 912
    :cond_8
    const/high16 v1, 0x3f100000    # 0.5625f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_9

    const v1, 0x3fe38e39

    cmpl-float v0, v0, v1

    if-nez v0, :cond_a

    .line 913
    :cond_9
    const/4 v0, 0x5

    goto :goto_0

    .line 915
    :cond_a
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 3

    .prologue
    .line 164
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 165
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 166
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v1, :cond_0

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    .line 168
    :cond_0
    const-string v1, "Save_Resolution_Grid"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 178
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 179
    return-void

    .line 169
    :cond_1
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 170
    const-string v1, "Save_Resolution_Free"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 171
    :cond_2
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_3

    .line 172
    const-string v1, "Save_Resolution_CameraSelfie"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 174
    :cond_3
    const-string v1, "Save_Resolution_WideHigh"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 197
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 198
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 199
    const-string v1, "Save_Quality"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 200
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 201
    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 2

    .prologue
    .line 141
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 142
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 143
    const-string v1, "Save_Format"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 144
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 145
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/16 v2, 0x4a0

    .line 104
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 105
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 106
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 108
    if-ge v0, v2, :cond_0

    if-lt v1, v2, :cond_1

    .line 109
    :cond_0
    const/4 v0, 0x1

    .line 111
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static aA(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 677
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 678
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 679
    const-string v1, "Free_Proportion2048_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 680
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 681
    return-void
.end method

.method public static aB(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 685
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 686
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aC(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 690
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 691
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 692
    const-string v1, "Free_Proportion1080_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 693
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 694
    return-void
.end method

.method public static aD(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 697
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 698
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aE(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 702
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 703
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 704
    const-string v1, "Free_Proportion1660_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 705
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 706
    return-void
.end method

.method public static aF(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 709
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 710
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aG(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 714
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 715
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 716
    const-string v1, "Free_Proportion1920_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 717
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 718
    return-void
.end method

.method public static aH(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 721
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 722
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_1_1"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aI(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 726
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 727
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 728
    const-string v1, "Free_Proportion2048_1_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 729
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 730
    return-void
.end method

.method public static aJ(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 734
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 735
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aK(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 739
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 740
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 741
    const-string v1, "Free_Proportion1080_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 742
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 743
    return-void
.end method

.method public static aL(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 746
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 747
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aM(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 751
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 752
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 753
    const-string v1, "Free_Proportion1660_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 754
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 755
    return-void
.end method

.method public static aN(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 758
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 759
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aO(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 763
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 764
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 765
    const-string v1, "Free_Proportion1920_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 766
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 767
    return-void
.end method

.method public static aP(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 770
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 771
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_3_5"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aQ(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 775
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 776
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 777
    const-string v1, "Free_Proportion2048_3_5"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 778
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 779
    return-void
.end method

.method public static aR(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 783
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 784
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aS(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 788
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 789
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 790
    const-string v1, "Free_Proportion1080_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 791
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 792
    return-void
.end method

.method public static aT(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 795
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 796
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aU(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 800
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 801
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 802
    const-string v1, "Free_Proportion1660_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 803
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 804
    return-void
.end method

.method public static aV(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 807
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 808
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aW(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 812
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 813
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 814
    const-string v1, "Free_Proportion1920_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 815
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 816
    return-void
.end method

.method public static aX(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 819
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 820
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aY(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 824
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 825
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 826
    const-string v1, "Free_Proportion2048_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 827
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 828
    return-void
.end method

.method public static aZ(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 835
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 836
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion_Pass_Area"

    const v2, 0x11cc40

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static aa(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 518
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 519
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 520
    const-string v1, "Grid_Proportion1920_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 521
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 522
    return-void
.end method

.method public static ab(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 525
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 526
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_9_16"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ac(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 530
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 531
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 532
    const-string v1, "Grid_Proportion2048_9_16"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 533
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 534
    return-void
.end method

.method public static ad(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 538
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 539
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ae(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 543
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 544
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 545
    const-string v1, "Free_Proportion1080_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 546
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 547
    return-void
.end method

.method public static af(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 550
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 551
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ag(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 555
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 556
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 557
    const-string v1, "Free_Proportion1660_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 558
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 559
    return-void
.end method

.method public static ah(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 562
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 563
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ai(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 567
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 568
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 569
    const-string v1, "Free_Proportion1920_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 570
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 571
    return-void
.end method

.method public static aj(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 574
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 575
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ak(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 579
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 580
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 581
    const-string v1, "Free_Proportion2048_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 582
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 583
    return-void
.end method

.method public static al(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 587
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 588
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static am(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 592
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 593
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 594
    const-string v1, "Free_Proportion1080_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 595
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 596
    return-void
.end method

.method public static an(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 599
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 600
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ao(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 604
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 605
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 606
    const-string v1, "Free_Proportion1660_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 607
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 608
    return-void
.end method

.method public static ap(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 611
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 612
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aq(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 616
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 617
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 618
    const-string v1, "Free_Proportion1920_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 619
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 620
    return-void
.end method

.method public static ar(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 623
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 624
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static as(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 628
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 629
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 630
    const-string v1, "Free_Proportion2048_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 631
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 632
    return-void
.end method

.method public static at(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 636
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 637
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1080_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static au(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 641
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 642
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 643
    const-string v1, "Free_Proportion1080_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 644
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 645
    return-void
.end method

.method public static av(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 648
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 649
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1660_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static aw(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 653
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 654
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 655
    const-string v1, "Free_Proportion1660_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 656
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 657
    return-void
.end method

.method public static ax(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 660
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 661
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion1920_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ay(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 665
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 666
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 667
    const-string v1, "Free_Proportion1920_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 668
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 669
    return-void
.end method

.method public static az(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 672
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 673
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion2048_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 840
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 841
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 842
    const-string v1, "Grid_Proportion_Pass_Area"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 843
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 844
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 136
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 137
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Format"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ba(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 847
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 848
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion_Fail_Area"

    const v2, 0x71c71c

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static bb(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 864
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 865
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion_Pass_Area"

    const v2, 0x11cc40

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static bc(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 876
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 877
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Proportion_Fail_Area"

    const v2, 0x71c71c

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static bd(Landroid/content/Context;)[I
    .locals 7

    .prologue
    const/4 v6, 0x6

    const/4 v5, 0x5

    const/4 v4, 0x4

    const/4 v3, 0x3

    const/4 v2, 0x2

    .line 923
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-nez v0, :cond_4

    .line 924
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->F(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 925
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->H(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 926
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->J(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 927
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->L(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 928
    new-array v0, v6, [I

    fill-array-data v0, :array_0

    .line 1032
    :goto_0
    return-object v0

    .line 930
    :cond_0
    new-array v0, v5, [I

    fill-array-data v0, :array_1

    goto :goto_0

    .line 933
    :cond_1
    new-array v0, v4, [I

    fill-array-data v0, :array_2

    goto :goto_0

    .line 936
    :cond_2
    new-array v0, v3, [I

    fill-array-data v0, :array_3

    goto :goto_0

    .line 939
    :cond_3
    new-array v0, v2, [I

    fill-array-data v0, :array_4

    goto :goto_0

    .line 941
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 942
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 943
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 944
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->l(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 945
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 946
    new-array v0, v6, [I

    fill-array-data v0, :array_5

    goto :goto_0

    .line 948
    :cond_5
    new-array v0, v5, [I

    fill-array-data v0, :array_6

    goto :goto_0

    .line 951
    :cond_6
    new-array v0, v4, [I

    fill-array-data v0, :array_7

    goto :goto_0

    .line 954
    :cond_7
    new-array v0, v3, [I

    fill-array-data v0, :array_8

    goto :goto_0

    .line 957
    :cond_8
    new-array v0, v2, [I

    fill-array-data v0, :array_9

    goto :goto_0

    .line 959
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v2, :cond_e

    .line 960
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->p(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 961
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->r(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 962
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 963
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->v(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 964
    new-array v0, v6, [I

    fill-array-data v0, :array_a

    goto :goto_0

    .line 966
    :cond_a
    new-array v0, v5, [I

    fill-array-data v0, :array_b

    goto :goto_0

    .line 969
    :cond_b
    new-array v0, v4, [I

    fill-array-data v0, :array_c

    goto/16 :goto_0

    .line 972
    :cond_c
    new-array v0, v3, [I

    fill-array-data v0, :array_d

    goto/16 :goto_0

    .line 975
    :cond_d
    new-array v0, v2, [I

    fill-array-data v0, :array_e

    goto/16 :goto_0

    .line 977
    :cond_e
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v3, :cond_13

    .line 978
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->x(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 979
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->z(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 980
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->B(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 981
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->D(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 982
    new-array v0, v6, [I

    fill-array-data v0, :array_f

    goto/16 :goto_0

    .line 984
    :cond_f
    new-array v0, v5, [I

    fill-array-data v0, :array_10

    goto/16 :goto_0

    .line 987
    :cond_10
    new-array v0, v4, [I

    fill-array-data v0, :array_11

    goto/16 :goto_0

    .line 990
    :cond_11
    new-array v0, v3, [I

    fill-array-data v0, :array_12

    goto/16 :goto_0

    .line 993
    :cond_12
    new-array v0, v2, [I

    fill-array-data v0, :array_13

    goto/16 :goto_0

    .line 995
    :cond_13
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v4, :cond_18

    .line 996
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->N(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 997
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->P(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 998
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->R(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 999
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->T(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1000
    new-array v0, v6, [I

    fill-array-data v0, :array_14

    goto/16 :goto_0

    .line 1002
    :cond_14
    new-array v0, v5, [I

    fill-array-data v0, :array_15

    goto/16 :goto_0

    .line 1005
    :cond_15
    new-array v0, v4, [I

    fill-array-data v0, :array_16

    goto/16 :goto_0

    .line 1008
    :cond_16
    new-array v0, v3, [I

    fill-array-data v0, :array_17

    goto/16 :goto_0

    .line 1011
    :cond_17
    new-array v0, v2, [I

    fill-array-data v0, :array_18

    goto/16 :goto_0

    .line 1014
    :cond_18
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->V(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1015
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->X(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1016
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->Z(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1017
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ab(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1018
    new-array v0, v6, [I

    fill-array-data v0, :array_19

    goto/16 :goto_0

    .line 1020
    :cond_19
    new-array v0, v5, [I

    fill-array-data v0, :array_1a

    goto/16 :goto_0

    .line 1023
    :cond_1a
    new-array v0, v4, [I

    fill-array-data v0, :array_1b

    goto/16 :goto_0

    .line 1026
    :cond_1b
    new-array v0, v3, [I

    fill-array-data v0, :array_1c

    goto/16 :goto_0

    .line 1029
    :cond_1c
    new-array v0, v2, [I

    fill-array-data v0, :array_1d

    goto/16 :goto_0

    .line 928
    :array_0
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 930
    :array_1
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 933
    :array_2
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 936
    :array_3
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 939
    :array_4
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 946
    :array_5
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 948
    :array_6
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 951
    :array_7
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 954
    :array_8
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 957
    :array_9
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 964
    :array_a
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 966
    :array_b
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 969
    :array_c
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 972
    :array_d
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 975
    :array_e
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 982
    :array_f
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 984
    :array_10
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 987
    :array_11
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 990
    :array_12
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 993
    :array_13
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1000
    :array_14
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1002
    :array_15
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1005
    :array_16
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1008
    :array_17
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1011
    :array_18
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1018
    :array_19
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1020
    :array_1a
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1023
    :array_1b
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1026
    :array_1c
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1029
    :array_1d
    .array-data 4
        0x2d0
        0x400
    .end array-data
.end method

.method public static be(Landroid/content/Context;)[I
    .locals 7

    .prologue
    const/4 v6, 0x6

    const/4 v5, 0x5

    const/4 v4, 0x4

    const/4 v3, 0x3

    const/4 v2, 0x2

    .line 1040
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-nez v0, :cond_4

    .line 1041
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aB(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1042
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aD(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1043
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aF(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1044
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aH(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1045
    new-array v0, v6, [I

    fill-array-data v0, :array_0

    .line 1149
    :goto_0
    return-object v0

    .line 1047
    :cond_0
    new-array v0, v5, [I

    fill-array-data v0, :array_1

    goto :goto_0

    .line 1050
    :cond_1
    new-array v0, v4, [I

    fill-array-data v0, :array_2

    goto :goto_0

    .line 1053
    :cond_2
    new-array v0, v3, [I

    fill-array-data v0, :array_3

    goto :goto_0

    .line 1056
    :cond_3
    new-array v0, v2, [I

    fill-array-data v0, :array_4

    goto :goto_0

    .line 1058
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 1059
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ad(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1060
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->af(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1061
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ah(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1062
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aj(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1063
    new-array v0, v6, [I

    fill-array-data v0, :array_5

    goto :goto_0

    .line 1065
    :cond_5
    new-array v0, v5, [I

    fill-array-data v0, :array_6

    goto :goto_0

    .line 1068
    :cond_6
    new-array v0, v4, [I

    fill-array-data v0, :array_7

    goto :goto_0

    .line 1071
    :cond_7
    new-array v0, v3, [I

    fill-array-data v0, :array_8

    goto :goto_0

    .line 1074
    :cond_8
    new-array v0, v2, [I

    fill-array-data v0, :array_9

    goto :goto_0

    .line 1076
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v2, :cond_e

    .line 1077
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->al(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1078
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->an(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1079
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ap(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1080
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ar(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1081
    new-array v0, v6, [I

    fill-array-data v0, :array_a

    goto :goto_0

    .line 1083
    :cond_a
    new-array v0, v5, [I

    fill-array-data v0, :array_b

    goto :goto_0

    .line 1086
    :cond_b
    new-array v0, v4, [I

    fill-array-data v0, :array_c

    goto/16 :goto_0

    .line 1089
    :cond_c
    new-array v0, v3, [I

    fill-array-data v0, :array_d

    goto/16 :goto_0

    .line 1092
    :cond_d
    new-array v0, v2, [I

    fill-array-data v0, :array_e

    goto/16 :goto_0

    .line 1094
    :cond_e
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v3, :cond_13

    .line 1095
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->at(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1096
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->av(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1097
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ax(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1098
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->az(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1099
    new-array v0, v6, [I

    fill-array-data v0, :array_f

    goto/16 :goto_0

    .line 1101
    :cond_f
    new-array v0, v5, [I

    fill-array-data v0, :array_10

    goto/16 :goto_0

    .line 1104
    :cond_10
    new-array v0, v4, [I

    fill-array-data v0, :array_11

    goto/16 :goto_0

    .line 1107
    :cond_11
    new-array v0, v3, [I

    fill-array-data v0, :array_12

    goto/16 :goto_0

    .line 1110
    :cond_12
    new-array v0, v2, [I

    fill-array-data v0, :array_13

    goto/16 :goto_0

    .line 1112
    :cond_13
    invoke-static {}, Lcom/roidapp/photogrid/release/hw;->a()I

    move-result v0

    if-ne v0, v4, :cond_18

    .line 1113
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aJ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1114
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aL(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1115
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aN(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1116
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aP(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1117
    new-array v0, v6, [I

    fill-array-data v0, :array_14

    goto/16 :goto_0

    .line 1119
    :cond_14
    new-array v0, v5, [I

    fill-array-data v0, :array_15

    goto/16 :goto_0

    .line 1122
    :cond_15
    new-array v0, v4, [I

    fill-array-data v0, :array_16

    goto/16 :goto_0

    .line 1125
    :cond_16
    new-array v0, v3, [I

    fill-array-data v0, :array_17

    goto/16 :goto_0

    .line 1128
    :cond_17
    new-array v0, v2, [I

    fill-array-data v0, :array_18

    goto/16 :goto_0

    .line 1131
    :cond_18
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aR(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1132
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aT(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1133
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aV(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1134
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aX(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1135
    new-array v0, v6, [I

    fill-array-data v0, :array_19

    goto/16 :goto_0

    .line 1137
    :cond_19
    new-array v0, v5, [I

    fill-array-data v0, :array_1a

    goto/16 :goto_0

    .line 1140
    :cond_1a
    new-array v0, v4, [I

    fill-array-data v0, :array_1b

    goto/16 :goto_0

    .line 1143
    :cond_1b
    new-array v0, v3, [I

    fill-array-data v0, :array_1c

    goto/16 :goto_0

    .line 1146
    :cond_1c
    new-array v0, v2, [I

    fill-array-data v0, :array_1d

    goto/16 :goto_0

    .line 1045
    :array_0
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1047
    :array_1
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1050
    :array_2
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1053
    :array_3
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1056
    :array_4
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1063
    :array_5
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1065
    :array_6
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1068
    :array_7
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1071
    :array_8
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1074
    :array_9
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1081
    :array_a
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1083
    :array_b
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1086
    :array_c
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1089
    :array_d
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1092
    :array_e
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1099
    :array_f
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1101
    :array_10
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1104
    :array_11
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1107
    :array_12
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1110
    :array_13
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1117
    :array_14
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1119
    :array_15
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1122
    :array_16
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1125
    :array_17
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1128
    :array_18
    .array-data 4
        0x2d0
        0x400
    .end array-data

    .line 1135
    :array_19
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 1137
    :array_1a
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
    .end array-data

    .line 1140
    :array_1b
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
    .end array-data

    .line 1143
    :array_1c
    .array-data 4
        0x2d0
        0x400
        0x438
    .end array-data

    .line 1146
    :array_1d
    .array-data 4
        0x2d0
        0x400
    .end array-data
.end method

.method private static bf(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 128
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 129
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    .line 132
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 149
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 150
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v0, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 152
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Resolution_Grid"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 158
    :goto_0
    return v0

    .line 153
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 154
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Resolution_Free"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 155
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_3

    .line 156
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Resolution_CameraSelfie"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 158
    :cond_3
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Resolution_WideHigh"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 852
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 853
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 854
    const-string v1, "Grid_Proportion_Fail_Area"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 855
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 856
    return-void
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 183
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 184
    sget-object v1, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v2, "Save_Quality"

    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Smart"

    :goto_0
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Medium"

    goto :goto_0
.end method

.method public static d(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 869
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 870
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 871
    const-string v1, "Free_Proportion_Pass_Area"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 872
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 873
    return-void
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 881
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 882
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 883
    const-string v1, "Free_Proportion_Fail_Area"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 884
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 885
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 188
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 189
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Save_Quality"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    const/4 v0, 0x1

    .line 192
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 205
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 206
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 207
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Free_Tested"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 209
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Tested"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public static g(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 214
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v2, :cond_1

    .line 215
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aH(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aj(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ar(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->az(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aP(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aX(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 222
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 223
    const-string v1, "Free_Tested"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 224
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 228
    :cond_1
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->L(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->v(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->D(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->T(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ab(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 235
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 236
    const-string v1, "Grid_Tested"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 237
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 244
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 245
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static i(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 249
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 250
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 251
    const-string v1, "Grid_Proportion1080_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 252
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 253
    return-void
.end method

.method public static j(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 256
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 257
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static k(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 261
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 262
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 263
    const-string v1, "Grid_Proportion1660_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 264
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 265
    return-void
.end method

.method public static l(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 268
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 269
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static m(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 273
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 274
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 275
    const-string v1, "Grid_Proportion1920_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 276
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 277
    return-void
.end method

.method public static n(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 280
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 281
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_4_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static o(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 285
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 286
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 287
    const-string v1, "Grid_Proportion2048_4_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 288
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 289
    return-void
.end method

.method public static p(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 293
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 294
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static q(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 298
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 299
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 300
    const-string v1, "Grid_Proportion1080_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 301
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 302
    return-void
.end method

.method public static r(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 305
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 306
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static s(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 310
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 311
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 312
    const-string v1, "Grid_Proportion1660_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 313
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 314
    return-void
.end method

.method public static t(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 317
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 318
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1920_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static u(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 322
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 323
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 324
    const-string v1, "Grid_Proportion1920_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 325
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 326
    return-void
.end method

.method public static v(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 329
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 330
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion2048_5_7"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static w(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 334
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 335
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 336
    const-string v1, "Grid_Proportion2048_5_7"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 337
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 338
    return-void
.end method

.method public static x(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 342
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 343
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1080_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static y(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 347
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 348
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 349
    const-string v1, "Grid_Proportion1080_2_3"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 350
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 351
    return-void
.end method

.method public static z(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 354
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->bf(Landroid/content/Context;)V

    .line 355
    sget-object v0, Lcom/roidapp/photogrid/release/hw;->a:Landroid/content/SharedPreferences;

    const-string v1, "Grid_Proportion1660_2_3"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
