.class public Lcom/qihoo/security/ui/result/view/BoostResultFragment;
.super Lcom/qihoo/security/ui/result/view/BaseResultFragment;
.source "360Security"


# static fields
.field private static A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;


# instance fields
.field private u:I

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:D

.field private y:Landroid/view/View;

.field private z:Lcom/qihoo/security/ui/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;-><init>()V

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->y:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method public static declared-synchronized q()Lcom/qihoo/security/ui/result/view/BoostResultFragment;
    .locals 3

    .prologue
    .line 62
    const-class v1, Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    .line 64
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    sget-object v2, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 68
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->A:Lcom/qihoo/security/ui/result/view/BoostResultFragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 62
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->z:Lcom/qihoo/security/ui/b/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/e;->a(I)Lcom/qihoo/security/ui/b/e$a;

    move-result-object v0

    .line 202
    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/e$a;->b()V

    .line 203
    return-void
.end method

.method private s()V
    .locals 12

    .prologue
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const-wide/16 v6, 0x0

    const/16 v9, 0x64

    const/4 v8, 0x0

    const/4 v5, 0x1

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->v:Ljava/lang/String;

    invoke-static {v0, v6, v7}, Lcom/qihoo360/common/utils/Utils;->str2Double(Ljava/lang/String;D)D

    move-result-wide v2

    .line 222
    iget-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_9

    .line 223
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v4

    .line 224
    invoke-virtual {v4, v5}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 225
    cmpg-double v0, v2, v10

    if-gtz v0, :cond_3

    .line 226
    iget-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    const-wide v6, 0x3fb999999999999aL    # 0.1

    add-double/2addr v0, v6

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    .line 227
    invoke-virtual {v4, v5}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 237
    :cond_0
    :goto_0
    iget-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 238
    iput-wide v2, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    .line 240
    :cond_1
    iget-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    invoke-virtual {v4, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 241
    iget v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-nez v1, :cond_8

    .line 242
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0034

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v8

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/security/booster/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 248
    :cond_2
    :goto_1
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 249
    iput v9, v0, Landroid/os/Message;->what:I

    .line 250
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v2, 0x32

    invoke-virtual {v1, v0, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 264
    :goto_2
    return-void

    .line 228
    :cond_3
    cmpl-double v0, v2, v10

    if-lez v0, :cond_4

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpg-double v0, v2, v0

    if-gtz v0, :cond_4

    .line 229
    iget-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v6

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    goto :goto_0

    .line 230
    :cond_4
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpl-double v0, v2, v0

    if-lez v0, :cond_6

    .line 231
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    .line 232
    iget-wide v6, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    int-to-double v0, v0

    :goto_3
    add-double/2addr v0, v6

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    goto :goto_0

    :cond_5
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    goto :goto_3

    .line 233
    :cond_6
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, v2, v0

    if-lez v0, :cond_0

    .line 234
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    .line 235
    iget-wide v6, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    const/4 v1, 0x6

    if-le v0, v1, :cond_7

    int-to-double v0, v0

    :goto_4
    add-double/2addr v0, v6

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    goto/16 :goto_0

    :cond_7
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    goto :goto_4

    .line 244
    :cond_8
    iget v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-ne v1, v5, :cond_2

    .line 245
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0018

    new-array v4, v5, [Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->w:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 252
    :cond_9
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-nez v0, :cond_c

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0034

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->v:Ljava/lang/String;

    aput-object v4, v3, v8

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v4}, Lcom/qihoo/security/booster/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 259
    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v9}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v9}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 262
    :cond_b
    iput-wide v6, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->x:D

    goto/16 :goto_2

    .line 255
    :cond_c
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-ne v0, v5, :cond_a

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0018

    new-array v3, v5, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->v:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->w:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_5
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 72
    iput p1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    .line 73
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 74
    iput-object p2, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->v:Ljava/lang/String;

    .line 75
    iput-object p3, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->w:Ljava/lang/String;

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-nez v0, :cond_0

    .line 77
    iput-object p2, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->v:Ljava/lang/String;

    goto :goto_0
.end method

.method protected a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 207
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/os/Message;)V

    .line 208
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 215
    :goto_0
    return-void

    .line 210
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->s()V

    goto :goto_0

    .line 208
    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/result/card/a;)V
    .locals 1

    .prologue
    .line 174
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/card/a;)V

    .line 175
    if-nez p1, :cond_0

    .line 192
    :goto_0
    return-void

    .line 178
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->l()I

    move-result v0

    .line 179
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 181
    :pswitch_0
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 183
    :pswitch_1
    const/16 v0, 0x2c28

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 181
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_1
    .end packed-switch
.end method

.method protected d()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "this_speed_of_boost"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/common/utils/SharedPref;->getInt(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 268
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->d:Landroid/content/Context;

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3, v4}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;IJI)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 269
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00c9

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 270
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 271
    if-eqz v1, :cond_0

    .line 272
    invoke-static {v1, v0, v4}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "this_speed_of_boost"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/common/utils/SharedPref;->setInt(Landroid/content/Context;Ljava/lang/String;I)V

    .line 276
    :cond_1
    return-void
.end method

.method protected l()I
    .locals 1

    .prologue
    .line 280
    const/4 v0, 0x0

    return v0
.end method

.method protected m()V
    .locals 2

    .prologue
    .line 290
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c002e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 291
    return-void
.end method

.method protected n()V
    .locals 0

    .prologue
    .line 285
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->r()V

    .line 286
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 152
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 153
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-ne v0, v5, :cond_1

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0018

    new-array v3, v5, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "0"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->w:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->u:I

    if-nez v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0034

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string/jumbo v4, "0"

    aput-object v4, v3, v6

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v4}, Lcom/qihoo/security/booster/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onCreate(Landroid/os/Bundle;)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/e;->a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/e;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->z:Lcom/qihoo/security/ui/b/e;

    .line 85
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->y:Landroid/view/View;

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->y:Landroid/view/View;

    return-object v0
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 163
    invoke-super {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onResume()V

    .line 170
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 196
    invoke-super {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onStop()V

    .line 197
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->r()V

    .line 198
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 101
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 104
    new-instance v1, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;-><init>(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 148
    return-void
.end method
