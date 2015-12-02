.class public Lcom/qihoo/security/adv/a/c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/adv/a/c$1;
    }
.end annotation


# static fields
.field private static final a:Landroid/content/Context;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/adv/a/c;->a:Landroid/content/Context;

    .line 427
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/adv/a/c;->b:Z

    return-void
.end method

.method public static a(I)V
    .locals 4

    .prologue
    .line 272
    const/16 v0, 0x6221

    int-to-long v2, p0

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 273
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 436
    sget-boolean v0, Lcom/qihoo/security/adv/a/c;->b:Z

    if-eqz v0, :cond_1

    .line 447
    :cond_0
    :goto_0
    return-void

    .line 440
    :cond_1
    if-eqz p0, :cond_0

    .line 441
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "21600"

    const-string/jumbo v2, "94c6a6e165f328c2faa40cc63974fe83"

    invoke-static {v0, v1, v2}, Lcom/mobvista/sdk/m/core/MobvistaAd;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/adv/a/c;->b:Z

    goto :goto_0
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 3

    .prologue
    .line 73
    const/16 v0, 0x6232

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/adv/a/c;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    const/16 v0, 0x626e

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    .line 78
    return-void
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V
    .locals 3

    .prologue
    .line 256
    const/16 v0, 0x6239

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 258
    invoke-static {p0, p1}, Lcom/qihoo/security/adv/a/c;->d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 259
    return-void
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;IIJ)V
    .locals 9

    .prologue
    const-wide/16 v0, 0x0

    const/16 v7, 0x626f

    const/4 v6, 0x1

    .line 96
    const/16 v2, 0x6233

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    if-nez p1, :cond_3

    .line 101
    const/4 v2, 0x0

    invoke-static {v7, v2, v6}, Lcom/qihoo/security/support/b;->a(III)V

    .line 107
    :cond_0
    :goto_0
    cmp-long v2, p3, v0

    if-ltz v2, :cond_1

    const-wide/32 v2, 0x493e0

    cmp-long v2, p3, v2

    if-lez v2, :cond_2

    :cond_1
    move-wide p3, v0

    .line 111
    :cond_2
    const/16 v0, 0x6234

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2, p3, p4}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;J)V

    .line 113
    return-void

    .line 102
    :cond_3
    if-ne v6, p1, :cond_0

    .line 103
    invoke-static {v7, p2, v6}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 127
    const/16 v0, 0x6235

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/adv/a/c;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0, v1, p1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;J)V

    .line 131
    const/16 v0, 0x6270

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    .line 132
    return-void
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;IJ)V
    .locals 7

    .prologue
    const-wide/16 v0, 0x0

    .line 151
    const/16 v2, 0x6236

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    int-to-long v4, p2

    invoke-static {v2, v3, p1, v4, v5}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;J)V

    .line 154
    const/16 v2, 0x6271

    const/4 v3, 0x1

    invoke-static {v2, p2, v3}, Lcom/qihoo/security/support/b;->a(III)V

    .line 157
    cmp-long v2, p3, v0

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x493e0

    cmp-long v2, p3, v2

    if-lez v2, :cond_1

    :cond_0
    move-wide p3, v0

    .line 160
    :cond_1
    const/16 v0, 0x6237

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p3, p4}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;J)V

    .line 162
    return-void
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 171
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 172
    const/4 v0, 0x0

    .line 173
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 174
    iget v3, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v3, :cond_0

    .line 175
    add-int/lit8 v1, v1, 0x1

    .line 177
    :cond_0
    const/16 v3, 0x623c

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget v5, v0, Lcom/qihoo/security/ui/result/AdvData;->pid:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v5, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 183
    :cond_1
    if-lez v1, :cond_2

    .line 184
    invoke-static {p0, v1}, Lcom/qihoo/security/adv/a/c;->c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 186
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p0, v0}, Lcom/qihoo/security/adv/a/c;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 188
    :cond_3
    return-void
.end method

.method public static a(Lcom/qihoo/security/appbox/core/c;Z)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 46
    if-nez p0, :cond_1

    move v0, v1

    .line 60
    :cond_0
    :goto_0
    return v0

    .line 49
    :cond_1
    if-eqz p1, :cond_3

    .line 50
    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->p:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-nez v2, :cond_0

    .line 58
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 59
    iget-wide v4, p0, Lcom/qihoo/security/appbox/core/c;->r:J

    sub-long/2addr v2, v4

    .line 60
    const-wide/32 v4, 0x2932e0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 54
    :cond_3
    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-eqz v2, :cond_2

    goto :goto_0
.end method

.method private static b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 323
    sget-object v0, Lcom/qihoo/security/adv/a/c$1;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 349
    :goto_0
    :pswitch_0
    return-void

    .line 327
    :pswitch_1
    const/16 v0, 0x625c

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 330
    :pswitch_2
    const/16 v0, 0x625f

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 333
    :pswitch_3
    const/16 v0, 0x6262

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 336
    :pswitch_4
    const/16 v0, 0x6265

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 339
    :pswitch_5
    const/16 v0, 0x6268

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 342
    :pswitch_6
    const/16 v0, 0x626b

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 323
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method private static c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 361
    sget-object v0, Lcom/qihoo/security/adv/a/c$1;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 387
    :goto_0
    :pswitch_0
    return-void

    .line 365
    :pswitch_1
    const/16 v0, 0x625d

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 368
    :pswitch_2
    const/16 v0, 0x6260

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 371
    :pswitch_3
    const/16 v0, 0x6263

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 374
    :pswitch_4
    const/16 v0, 0x6266

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 377
    :pswitch_5
    const/16 v0, 0x6269

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 380
    :pswitch_6
    const/16 v0, 0x626c

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 361
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method private static d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 399
    sget-object v0, Lcom/qihoo/security/adv/a/c$1;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 425
    :goto_0
    :pswitch_0
    return-void

    .line 403
    :pswitch_1
    const/16 v0, 0x625e

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 406
    :pswitch_2
    const/16 v0, 0x6261

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 409
    :pswitch_3
    const/16 v0, 0x6264

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 412
    :pswitch_4
    const/16 v0, 0x6267

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 415
    :pswitch_5
    const/16 v0, 0x626a

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 418
    :pswitch_6
    const/16 v0, 0x626d

    invoke-static {v0, p1, v2}, Lcom/qihoo/security/support/b;->a(III)V

    goto :goto_0

    .line 399
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method
