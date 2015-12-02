.class public Lcom/qihoo/security/ui/result/f;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/result/f$1;,
        Lcom/qihoo/security/ui/result/f$a;
    }
.end annotation


# static fields
.field public static a:Lcom/qihoo/security/ui/result/f;


# instance fields
.field public b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field private final c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/f;->a:Lcom/qihoo/security/ui/result/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 47
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/f;->c:Landroid/content/Context;

    .line 48
    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 99
    const/4 v0, 0x0

    .line 101
    const-string/jumbo v1, "clean"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 102
    const/4 v0, 0x3

    .line 112
    :cond_0
    :goto_0
    return v0

    .line 103
    :cond_1
    const-string/jumbo v1, "anti_virus"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 104
    const/4 v0, 0x4

    goto :goto_0

    .line 105
    :cond_2
    const-string/jumbo v1, "space_manager"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 106
    const/4 v0, 0x6

    goto :goto_0

    .line 107
    :cond_3
    const-string/jumbo v1, "full_anti_virus"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 108
    const/16 v0, 0x8

    goto :goto_0

    .line 109
    :cond_4
    const-string/jumbo v1, "game_booster"

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    const/16 v0, 0xb

    goto :goto_0
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/f;
    .locals 2

    .prologue
    .line 40
    const-class v1, Lcom/qihoo/security/ui/result/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/f;->a:Lcom/qihoo/security/ui/result/f;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/qihoo/security/ui/result/f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/f;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/f;->a:Lcom/qihoo/security/ui/result/f;

    .line 43
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/f;->a:Lcom/qihoo/security/ui/result/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 40
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;Z)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation

    .prologue
    .line 242
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 244
    if-nez p1, :cond_0

    .line 245
    const/4 v0, 0x0

    .line 261
    :goto_0
    return-object v0

    .line 247
    :cond_0
    :try_start_0
    invoke-static {p0, v1, p1}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Ljava/util/List;)V

    .line 248
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 249
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 251
    iget v3, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    .line 253
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 256
    :catch_0
    move-exception v0

    :cond_2
    move-object v0, v1

    .line 261
    goto :goto_0
.end method

.method private static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 280
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 281
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->c()I

    move-result v2

    if-lez v2, :cond_0

    .line 284
    new-instance v2, Lcom/qihoo/security/ui/result/AdvData;

    invoke-direct {v2}, Lcom/qihoo/security/ui/result/AdvData;-><init>()V

    .line 285
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->c()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->pid:I

    .line 286
    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->mid:I

    .line 287
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->f()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->p1:Ljava/lang/String;

    .line 288
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->g()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->p2:Ljava/lang/String;

    .line 289
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->d()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->tp:I

    .line 290
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->a()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->type:I

    .line 292
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    if-eqz v3, :cond_3

    .line 297
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    .line 298
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->d()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    .line 299
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->des:Ljava/lang/String;

    .line 300
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 301
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->starLevel:F

    .line 303
    :cond_1
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->i()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    .line 304
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->creatives:Ljava/lang/String;

    .line 305
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->l()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    .line 306
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->k()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->openType:I

    .line 307
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    .line 308
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->n()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->c1:Ljava/lang/String;

    .line 309
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->o()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->c2:Ljava/lang/String;

    .line 310
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->p()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->c3:Ljava/lang/String;

    .line 311
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->b()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->btnDesc:Ljava/lang/String;

    .line 312
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->btnName:Ljava/lang/String;

    .line 313
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v3}, Lcom/qihoo/security/adv/e;->g()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->size:Ljava/lang/String;

    .line 314
    iget-object v0, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->installs:Ljava/lang/String;

    .line 334
    :cond_2
    :goto_1
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 315
    :cond_3
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    if-eqz v3, :cond_2

    .line 319
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    .line 320
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    .line 321
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->des:Ljava/lang/String;

    .line 322
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget v3, v3, Lcom/qihoo/security/appbox/core/c;->m:F

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->starLevel:F

    .line 323
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    .line 324
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->creatives:Ljava/lang/String;

    .line 325
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->f:Ljava/lang/String;

    iput-object v3, v2, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    .line 326
    iget-object v3, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget v3, v3, Lcom/qihoo/security/appbox/core/c;->g:I

    iput v3, v2, Lcom/qihoo/security/ui/result/AdvData;->openType:I

    .line 327
    iget-object v0, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iget-object v0, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    iput-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    .line 328
    iget-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_2

    .line 329
    iget-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->btnDesc:Ljava/lang/String;

    .line 330
    iget-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/ui/result/AdvData;->btnName:Ljava/lang/String;

    goto :goto_1

    .line 343
    :cond_4
    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    .line 67
    packed-switch p1, :pswitch_data_0

    .line 95
    :goto_0
    return-object v0

    .line 69
    :pswitch_0
    const-string/jumbo v0, "booster"

    goto :goto_0

    .line 72
    :pswitch_1
    const-string/jumbo v0, "battery_life"

    goto :goto_0

    .line 75
    :pswitch_2
    const-string/jumbo v0, "temper"

    goto :goto_0

    .line 78
    :pswitch_3
    const-string/jumbo v0, "clean"

    goto :goto_0

    .line 81
    :pswitch_4
    const-string/jumbo v0, "deep_clean"

    goto :goto_0

    .line 84
    :pswitch_5
    const-string/jumbo v0, "anti_virus"

    goto :goto_0

    .line 87
    :pswitch_6
    const-string/jumbo v0, "full_anti_virus"

    goto :goto_0

    .line 67
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private e(I)Lcom/qihoo/security/adv/AdvDataManager$AdvType;
    .locals 1

    .prologue
    .line 346
    const/4 v0, 0x0

    .line 347
    packed-switch p1, :pswitch_data_0

    .line 370
    :goto_0
    return-object v0

    .line 349
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BoosterResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 353
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BatteryLifeAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 356
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 359
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanDeepResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 362
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 365
    :pswitch_5
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusFullScanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    goto :goto_0

    .line 347
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 187
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 189
    if-eqz p1, :cond_2

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 190
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    move v3, v2

    .line 191
    :goto_0
    if-ge v3, v5, :cond_2

    .line 192
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 193
    if-eqz v0, :cond_1

    .line 197
    iget v1, v0, Lcom/qihoo/security/ui/result/AdvData;->pid:I

    add-int/lit8 v1, v1, -0x1

    .line 198
    if-gez v1, :cond_0

    move v1, v2

    .line 201
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 205
    :catch_0
    move-exception v0

    .line 210
    :cond_2
    return-object v4
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 117
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/f;->e(I)Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    if-nez v0, :cond_1

    .line 151
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 123
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->FaceBookAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 126
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/f;->d(I)Ljava/lang/String;

    move-result-object v0

    .line 127
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 128
    invoke-static {}, Lcom/qihoo/security/ui/result/card/a/b;->a()Lcom/qihoo/security/ui/result/card/a/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/card/a/b;->a(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 133
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 134
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/f;->a(Ljava/lang/String;)I

    move-result v0

    .line 135
    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 137
    :pswitch_0
    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/d;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 145
    :catch_0
    move-exception v0

    goto :goto_0

    .line 135
    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public b()Lcom/qihoo/security/adv/AdvDataManager$AdvType;
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    return-object v0
.end method

.method public b(I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/card/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 154
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 156
    :try_start_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/f;->d(I)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 158
    invoke-static {}, Lcom/qihoo/security/ui/result/card/a/b;->a()Lcom/qihoo/security/ui/result/card/a/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/card/a/b;->a(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 162
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 163
    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/result/f;->a(Ljava/lang/String;)I

    move-result v1

    .line 165
    invoke-static {v1}, Lcom/qihoo/security/ui/result/card/b;->a(I)Lcom/qihoo/security/ui/result/card/a;

    move-result-object v4

    .line 166
    if-eqz v4, :cond_0

    .line 167
    iput v1, v4, Lcom/qihoo/security/ui/result/card/a;->a:I

    .line 168
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->str2Int(Ljava/lang/String;I)I

    move-result v0

    iput v0, v4, Lcom/qihoo/security/ui/result/card/a;->d:I

    .line 169
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 177
    :catch_0
    move-exception v0

    .line 182
    :cond_1
    :goto_1
    return-object v2

    .line 172
    :cond_2
    new-instance v0, Lcom/qihoo/security/ui/result/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/result/f$a;-><init>(Lcom/qihoo/security/ui/result/f;Lcom/qihoo/security/ui/result/f$1;)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method

.method public c(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 214
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/f;->e(I)Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 215
    iget-object v1, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    if-nez v1, :cond_1

    .line 238
    :cond_0
    :goto_0
    return-object v0

    .line 223
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 225
    :try_start_0
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/adv/a/a;->c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;

    move-result-object v2

    .line 229
    if-eqz v2, :cond_0

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/ui/result/f;->b:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v0, v1

    .line 238
    goto :goto_0

    .line 233
    :catch_0
    move-exception v0

    goto :goto_1
.end method
