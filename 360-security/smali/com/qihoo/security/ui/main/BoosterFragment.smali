.class public Lcom/qihoo/security/ui/main/BoosterFragment;
.super Lcom/qihoo/security/ui/main/BaseHomeFragment;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/app/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/main/BoosterFragment$7;,
        Lcom/qihoo/security/ui/main/BoosterFragment$a;,
        Lcom/qihoo/security/ui/main/BoosterFragment$b;,
        Lcom/qihoo/security/ui/main/BoosterFragment$d;,
        Lcom/qihoo/security/ui/main/BoosterFragment$c;,
        Lcom/qihoo/security/ui/main/BoosterFragment$e;
    }
.end annotation


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:I

.field private E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private F:I

.field private G:I

.field private H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field private I:I

.field private J:I

.field private K:Lcom/qihoo/security/ui/main/BoosterFragment$a;

.field private L:Landroid/content/IntentFilter;

.field private M:I

.field private N:Z

.field private O:Z

.field private P:Z

.field private Q:Z

.field private final R:Landroid/os/Handler;

.field private S:Lcom/qihoo/security/ui/b/a$f;

.field private T:Lcom/qihoo/security/app/a;

.field private final U:Lcom/nineoldandroids/a/a$a;

.field private final V:Lcom/nineoldandroids/a/b;

.field private final W:Lcom/qihoo/security/ui/main/BoosterFragment$b;

.field private final X:Lcom/qihoo/security/ui/main/c$a;

.field private Y:Lcom/qihoo/security/ui/b/e;

.field private a:Z

.field private k:Z

.field private l:J

.field private m:Landroid/content/Context;

.field private n:Landroid/view/ViewGroup;

.field private o:Landroid/view/View;

.field private p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

.field private q:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private r:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

.field private t:Lcom/qihoo/security/widget/RevealPanel;

.field private u:Lcom/qihoo/security/widget/RevealPanel;

.field private v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

.field private w:I

.field private x:I

.field private y:I

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;-><init>()V

    .line 132
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->a:Z

    .line 136
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->k:Z

    .line 165
    iput v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    .line 166
    iput v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    .line 168
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    .line 169
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    .line 170
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    iget-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->B:J

    .line 171
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    .line 172
    iput v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->D:I

    .line 175
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 180
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 184
    iput-object v5, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->K:Lcom/qihoo/security/ui/main/BoosterFragment$a;

    .line 190
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->N:Z

    .line 192
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->O:Z

    .line 193
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->P:Z

    .line 195
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->Q:Z

    .line 216
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$1;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    .line 893
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$c;

    invoke-direct {v0, p0, v5}, Lcom/qihoo/security/ui/main/BoosterFragment$c;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->U:Lcom/nineoldandroids/a/a$a;

    .line 904
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$d;

    invoke-direct {v0, p0, v5}, Lcom/qihoo/security/ui/main/BoosterFragment$d;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->V:Lcom/nineoldandroids/a/b;

    .line 940
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$b;

    invoke-direct {v0, p0, v5}, Lcom/qihoo/security/ui/main/BoosterFragment$b;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->W:Lcom/qihoo/security/ui/main/BoosterFragment$b;

    .line 1593
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$6;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->X:Lcom/qihoo/security/ui/main/c$a;

    return-void
.end method

.method static synthetic A(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/main/BoosterFragment$e;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;)J
    .locals 2

    .prologue
    .line 82
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    return-wide v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;J)J
    .locals 1

    .prologue
    .line 82
    iput-wide p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->l:J

    return-wide p1
.end method

.method private a(I)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 1452
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->s()V

    .line 1457
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    int-to-long v4, v0

    .line 1459
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 1460
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->B:J

    move-wide v2, v0

    .line 1468
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 1470
    const/16 v0, 0x2b01

    const-wide/16 v6, 0x64

    mul-long/2addr v6, v4

    div-long/2addr v6, v2

    long-to-int v1, v6

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1473
    :cond_0
    const-string/jumbo v1, ""

    .line 1474
    const-string/jumbo v0, ""

    .line 1475
    if-nez p1, :cond_4

    .line 1477
    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-static {v1}, Lcom/qihoo/security/booster/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 1489
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->e()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1490
    invoke-static {}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->q()Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    move-result-object v2

    .line 1491
    invoke-virtual {v2, p1, v1, v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1492
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    .line 1493
    invoke-virtual {v0}, Landroid/support/v4/app/f;->a()Landroid/support/v4/app/h;

    move-result-object v0

    .line 1494
    const v1, 0x7f0b0073

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/h;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/h;

    .line 1495
    const-string/jumbo v1, "booster_result_fragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/h;->a(Ljava/lang/String;)Landroid/support/v4/app/h;

    .line 1496
    invoke-virtual {v0}, Landroid/support/v4/app/h;->b()I

    .line 1499
    :cond_2
    return-void

    .line 1463
    :cond_3
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    iget-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    sub-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0

    .line 1478
    :cond_4
    if-ne p1, v8, :cond_1

    .line 1479
    iget v6, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->I:I

    invoke-static {v6, v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/b/s;->a(IJJ)[Ljava/lang/String;

    move-result-object v2

    .line 1480
    if-eqz v2, :cond_1

    array-length v3, v2

    if-lez v3, :cond_1

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 1481
    const/4 v0, 0x0

    aget-object v1, v2, v0

    .line 1482
    aget-object v0, v2, v8

    goto :goto_1
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 1235
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->P:Z

    if-eqz v0, :cond_0

    .line 1236
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->P:Z

    .line 1237
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$4;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1244
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Intent;I)V
    .locals 8

    .prologue
    const/4 v4, -0x1

    const/4 v1, 0x0

    .line 465
    iput p2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->D:I

    .line 466
    const-string/jumbo v0, "is_need_read"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 467
    const-string/jumbo v0, "is_best"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 469
    const-string/jumbo v0, "kill_prower_count"

    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 471
    const-string/jumbo v3, "kill_process_count"

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 472
    const-string/jumbo v4, "extra_killed_memory"

    invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    iput v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    .line 473
    const-string/jumbo v4, "free_memory_kb"

    const-wide/16 v6, -0x1

    invoke-virtual {p1, v4, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    .line 475
    if-lez v0, :cond_0

    .line 476
    iget v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    sub-int/2addr v4, v0

    if-lez v4, :cond_4

    iget v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    sub-int v0, v4, v0

    :goto_0
    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    .line 479
    :cond_0
    if-lez v3, :cond_1

    .line 480
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    sub-int/2addr v0, v3

    if-lez v0, :cond_5

    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    sub-int/2addr v0, v3

    :goto_1
    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    .line 488
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    mul-int/lit8 v0, v0, 0x64

    int-to-long v4, v0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v6

    div-long/2addr v4, v6

    long-to-int v0, v4

    .line 489
    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v4, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v3, v4, :cond_3

    .line 495
    if-nez v2, :cond_2

    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->x()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 499
    :cond_2
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->f:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 534
    :cond_3
    :goto_2
    return-void

    :cond_4
    move v0, v1

    .line 476
    goto :goto_0

    :cond_5
    move v0, v1

    .line 480
    goto :goto_1

    .line 502
    :cond_6
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->w()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 504
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    invoke-virtual {v1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getProgress()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->y:I

    .line 508
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->y:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_7

    .line 512
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->f:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_2

    .line 518
    :cond_7
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->B:J

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/booster/a;->a(JJ)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    .line 519
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    if-gtz v0, :cond_8

    .line 520
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    .line 522
    :cond_8
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_2

    .line 530
    :cond_9
    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Z)V

    goto :goto_2
.end method

.method private a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V
    .locals 7

    .prologue
    const/16 v2, 0x64

    const/4 v3, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 989
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->isRemoving()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1196
    :cond_0
    :goto_0
    return-void

    .line 992
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-eq v0, p1, :cond_0

    .line 1001
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 1002
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$7;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1004
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0

    .line 1007
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0015

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 1008
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v1, v0, v5

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v2, v1, v5

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/a;->a([Landroid/view/View;[Landroid/view/View;)J

    goto :goto_0

    .line 1011
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-static {v0, v5}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;Z)V

    .line 1015
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->y:I

    invoke-static {v0}, Lcom/qihoo/security/booster/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    invoke-virtual {p0, v0, v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1017
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0030

    new-array v3, v4, [Ljava/lang/Object;

    iget v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1019
    const/16 v0, 0x2c37

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1020
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->q()V

    .line 1022
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0019

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 1023
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0036

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 1024
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const/high16 v3, 0x7f0f0000

    iget v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1026
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const/high16 v3, 0x7f0f0000

    iget v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1030
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->y:I

    new-instance v2, Lcom/qihoo/security/ui/main/BoosterFragment$13;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$13;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(ILcom/qihoo/security/booster/widget/DialView/b;)V

    goto/16 :goto_0

    .line 1098
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0016

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 1099
    const-wide/16 v0, 0x0

    new-array v2, v4, [Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v3, v2, v5

    new-array v3, v4, [Landroid/view/View;

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3, v6}, Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J

    .line 1100
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$14;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$14;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(Lcom/qihoo/security/booster/widget/DialView/b;)V

    goto/16 :goto_0

    .line 1133
    :pswitch_4
    iput-boolean v5, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->a:Z

    goto/16 :goto_0

    .line 1137
    :pswitch_5
    iput-boolean v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->N:Z

    .line 1138
    iput-boolean v5, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->a:Z

    .line 1139
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v5}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1140
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b(Z)V

    .line 1141
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    invoke-virtual {v0, v2, v6}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(ILcom/qihoo/security/booster/widget/DialView/b;)V

    .line 1143
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->D:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_3

    .line 1144
    invoke-static {}, Lcom/qihoo/security/booster/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1145
    invoke-direct {p0, v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(I)V

    .line 1153
    :goto_1
    invoke-virtual {p0, v6, v5}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1154
    const v0, 0x7f020084

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b_(I)V

    .line 1155
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0017

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a_(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1147
    :cond_2
    invoke-direct {p0, v5}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(I)V

    goto :goto_1

    .line 1150
    :cond_3
    invoke-direct {p0, v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(I)V

    goto :goto_1

    .line 1159
    :pswitch_6
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;Z)V

    .line 1163
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1164
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$15;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$15;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(ILcom/qihoo/security/booster/widget/DialView/b;)V

    .line 1172
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c002f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 1173
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c001a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 1174
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c001b

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 1175
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->q()V

    .line 1177
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v1, v0, v5

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->o:Landroid/view/View;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v2, v1, v4

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/a;->a([Landroid/view/View;[Landroid/view/View;)J

    .line 1179
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1180
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->d()V

    .line 1182
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1183
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$2;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1191
    :cond_5
    invoke-direct {p0, v6}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/nineoldandroids/a/a$a;)Z

    goto/16 :goto_0

    .line 1002
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
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;I)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;Landroid/support/v4/app/f;)V
    .locals 0

    .prologue
    .line 82
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/support/v4/app/f;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$e;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/nineoldandroids/a/a$a;)Z
    .locals 1

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/nineoldandroids/a/a$a;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BoosterFragment;Z)Z
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->N:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/BoosterFragment;I)I
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/BoosterFragment;)J
    .locals 2

    .prologue
    .line 82
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    return-wide v0
.end method

.method private b(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V
    .locals 1

    .prologue
    .line 1262
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->O:Z

    if-eqz v0, :cond_0

    .line 1264
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 1266
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->O:Z

    .line 1270
    :goto_0
    return-void

    .line 1268
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/BoosterFragment;J)V
    .locals 1

    .prologue
    .line 82
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(J)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    .line 1502
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    .line 1503
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1509
    if-eqz p1, :cond_1

    .line 1510
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1511
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/support/v4/app/f;)V

    .line 1513
    const-string/jumbo v1, "booster_result_fragment"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/f;->b(Ljava/lang/String;I)Z

    .line 1514
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->d_()V

    .line 1515
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a_(Ljava/lang/String;)V

    .line 1516
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->n()V

    .line 1534
    :cond_0
    :goto_0
    return-void

    .line 1518
    :cond_1
    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$5;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment$5;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Landroid/support/v4/app/f;)V

    invoke-virtual {p0, v1, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/nineoldandroids/a/a$a;Z)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/main/BoosterFragment;I)I
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method private c(I)V
    .locals 1

    .prologue
    .line 1585
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1586
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1587
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->setSectorColor(I)V

    .line 1588
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setColor(I)V

    .line 1589
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1590
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1591
    return-void
.end method

.method private c(Lcom/nineoldandroids/a/a$a;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 948
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    .line 949
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a()V

    .line 950
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setTopView(Landroid/view/View;)V

    .line 951
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->W:Lcom/qihoo/security/ui/main/BoosterFragment$b;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 952
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    new-instance v2, Lcom/qihoo/security/ui/main/BoosterFragment$12;

    invoke-direct {v2, p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$12;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/nineoldandroids/a/a$a;)V

    invoke-virtual {v1, v2}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setButtonAnimatorListener(Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;)V

    .line 978
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 984
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->I:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/main/BoosterFragment;I)I
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->I:I

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/ui/main/BoosterFragment;I)I
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->J:I

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/main/BoosterFragment;I)I
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->M:I

    return p1
.end method

.method static synthetic f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/main/BoosterFragment;)J
    .locals 2

    .prologue
    .line 82
    iget-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->l:J

    return-wide v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/main/BoosterFragment;I)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(I)V

    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/nineoldandroids/a/a$a;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->U:Lcom/nineoldandroids/a/a$a;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/b/e;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->Y:Lcom/qihoo/security/ui/b/e;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    return-object v0
.end method

.method private p()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1202
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1203
    const/4 v1, 0x2

    new-array v1, v1, [I

    aput v0, v1, v2

    const/4 v0, 0x1

    aput v2, v1, v0

    invoke-static {v1}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    .line 1204
    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 1205
    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$3;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 1226
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 1227
    return-void
.end method

.method private q()V
    .locals 3

    .prologue
    .line 1247
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1253
    :cond_0
    :goto_0
    return-void

    .line 1250
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RecommendType."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v1}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1251
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1252
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic q(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->p()V

    return-void
.end method

.method static synthetic r(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->o:Landroid/view/View;

    return-object v0
.end method

.method private r()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1299
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1300
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1302
    :cond_0
    return-void
.end method

.method static synthetic s(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/nineoldandroids/a/b;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->V:Lcom/nineoldandroids/a/b;

    return-object v0
.end method

.method private s()V
    .locals 2

    .prologue
    .line 1308
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1309
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1311
    :cond_0
    return-void
.end method

.method static synthetic t(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    return v0
.end method

.method private t()V
    .locals 1

    .prologue
    .line 1319
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;)Lcom/qihoo/security/app/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    .line 1320
    return-void
.end method

.method static synthetic u(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    return v0
.end method

.method private u()V
    .locals 1

    .prologue
    .line 1323
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a$b;)V

    .line 1330
    return-void
.end method

.method static synthetic v(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private v()V
    .locals 1

    .prologue
    .line 1333
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a$b;)V

    .line 1340
    return-void
.end method

.method static synthetic w(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private w()Z
    .locals 1

    .prologue
    .line 1390
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0}, Lcom/qihoo/security/app/a;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic x(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private x()Z
    .locals 1

    .prologue
    .line 1405
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0}, Lcom/qihoo/security/app/a;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic y(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->J:I

    return v0
.end method

.method private y()V
    .locals 1

    .prologue
    .line 1412
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0}, Lcom/qihoo/security/app/a;->d()V

    .line 1413
    return-void
.end method

.method static synthetic z(Lcom/qihoo/security/ui/main/BoosterFragment;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->M:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 557
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a()V

    .line 558
    const/16 v0, 0x2af9

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 562
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 565
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 566
    return-void
.end method

.method public a(II)V
    .locals 2

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->d()V

    .line 90
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->N:Z

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v0, v1, :cond_1

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->O:Z

    .line 97
    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->N:Z

    .line 98
    return-void

    .line 94
    :cond_1
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 409
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/content/Intent;)V

    .line 410
    const-string/jumbo v0, "com.qihoo.security.notify.ACTION_BOOST"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->performClick()Z

    .line 415
    :cond_0
    const-string/jumbo v0, "jump_result_page"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 416
    if-eqz v0, :cond_1

    .line 417
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Landroid/content/Intent;)V

    .line 419
    :cond_1
    return-void
.end method

.method public a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 2

    .prologue
    .line 1538
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1542
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1543
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->d()V

    .line 1544
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->d()V

    .line 1549
    :goto_0
    return-void

    .line 1546
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    .line 1547
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
    .locals 0

    .prologue
    .line 585
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 586
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->E:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 587
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 1419
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 1423
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$7;->b:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1448
    :goto_0
    return-void

    .line 1432
    :pswitch_0
    const/16 v0, 0x2b03

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1433
    const/16 v0, 0x2c36

    const-wide/16 v2, 0x2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 1434
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Z)V

    .line 1435
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    goto :goto_0

    .line 1443
    :pswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Z)V

    goto :goto_0

    .line 1423
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Ljava/util/List;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 102
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Ljava/util/List;Ljava/util/Map;)V

    .line 103
    return-void
.end method

.method public a(Z)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x1

    .line 596
    if-eqz p1, :cond_1

    .line 597
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 598
    invoke-static {v6}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    .line 653
    :cond_0
    :goto_0
    return-void

    .line 604
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->a:Z

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 611
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 616
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v0, v1, :cond_2

    .line 617
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$8;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$8;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 625
    :cond_2
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_0

    .line 631
    :cond_3
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 632
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 633
    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v2}, Lcom/qihoo/security/app/a;->e()Lcom/qihoo/security/app/a$c;

    move-result-object v2

    .line 634
    if-eqz v2, :cond_4

    iget-wide v4, v2, Lcom/qihoo/security/app/a$c;->c:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0xfa0

    cmp-long v0, v0, v4

    if-gez v0, :cond_4

    .line 638
    iget-object v0, v2, Lcom/qihoo/security/app/a$c;->a:Ljava/util/List;

    iget-object v1, v2, Lcom/qihoo/security/app/a$c;->b:Ljava/util/Map;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Ljava/util/List;Ljava/util/Map;)V

    goto :goto_0

    .line 640
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->T:Lcom/qihoo/security/app/a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 641
    invoke-static {v6}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method protected b(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 400
    const-string/jumbo v0, "jump_result_page_param"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 401
    const/16 v1, 0x3e9

    if-eq v1, v0, :cond_0

    const/16 v1, 0x3e8

    if-ne v1, v0, :cond_1

    .line 403
    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 405
    :cond_1
    return-void
.end method

.method public b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 2

    .prologue
    .line 1553
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1557
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1558
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->d()V

    .line 1559
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->d()V

    .line 1564
    :goto_0
    return-void

    .line 1561
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    .line 1562
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    goto :goto_0
.end method

.method public b(Ljava/util/List;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v9, 0x3

    const/4 v2, 0x1

    const/4 v8, 0x0

    .line 663
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 664
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 665
    iput v8, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    .line 666
    iput v8, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    .line 728
    :goto_0
    return-void

    .line 671
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 673
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 675
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 676
    iget v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-nez v6, :cond_3

    .line 677
    iget v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    add-int/2addr v1, v6

    .line 678
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 680
    :cond_3
    iget v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-eq v6, v9, :cond_2

    iget-boolean v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    if-eqz v6, :cond_2

    .line 681
    new-instance v6, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v6}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 682
    iget-object v7, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    iput-object v7, v6, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 683
    iget v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    iput v0, v6, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 684
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 688
    :cond_4
    invoke-static {v4}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    .line 694
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    .line 695
    if-nez p2, :cond_5

    .line 696
    invoke-static {p1}, Lcom/qihoo/security/opti/a/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    .line 699
    :cond_5
    if-eqz p2, :cond_6

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 700
    :cond_6
    iput v8, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    .line 711
    :cond_7
    iput v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    .line 713
    const/16 v0, 0x2afb

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->b()I

    move-result v3

    invoke-static {v0, v3, v2}, Lcom/qihoo/security/support/b;->a(III)V

    .line 714
    const/16 v0, 0x2afc

    iget v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->x:I

    shr-int/lit8 v2, v2, 0xa

    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->b(II)V

    .line 715
    const/16 v0, 0x2afd

    iget v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->F:I

    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->b(II)V

    .line 716
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->d()V

    .line 717
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    .line 718
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    .line 720
    iget-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->B:J

    .line 721
    iget-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->z:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->A:J

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/b/s;->a(JJ)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->y:I

    .line 722
    int-to-long v0, v1

    iget-wide v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->B:J

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/booster/a;->a(JJ)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->w:I

    .line 724
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto/16 :goto_0

    .line 702
    :cond_8
    iput v8, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    .line 703
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 704
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/a$a;

    .line 705
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/a$a;->a()I

    move-result v0

    if-lt v0, v9, :cond_9

    .line 706
    iget v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->G:I

    goto :goto_2
.end method

.method public b()Z
    .locals 4

    .prologue
    .line 1288
    const/16 v0, 0x2c36

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 1289
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b()Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 4

    .prologue
    .line 1274
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c()V

    .line 1278
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1284
    :goto_0
    return-void

    .line 1281
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Z)V

    .line 1282
    const/16 v0, 0x2c36

    const-wide/16 v2, 0x1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 1283
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 734
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->C:J

    .line 735
    return-void
.end method

.method public h()V
    .locals 2

    .prologue
    .line 570
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->h()V

    .line 575
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v0, v1, :cond_0

    .line 576
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->n()V

    .line 578
    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    .prologue
    .line 742
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->d()V

    .line 744
    sget-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Boost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 746
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 747
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->y()V

    .line 748
    return-void
.end method

.method public m()V
    .locals 1

    .prologue
    .line 754
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 755
    return-void
.end method

.method public n()V
    .locals 4

    .prologue
    .line 761
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 763
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 775
    :goto_0
    return-void

    .line 765
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 767
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$9;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected o()V
    .locals 5

    .prologue
    const v4, 0x7f080056

    const v3, -0x6f5b52

    .line 785
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0125

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->o:Landroid/view/View;

    .line 786
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0126

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->p:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    .line 787
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b012a

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->q:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 788
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b012b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->r:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 789
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0129

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->s:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    .line 790
    new-instance v0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    .line 791
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v1

    const v2, 0x7f02004e

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 794
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->v:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0017

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 795
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b012c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealPanel;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    .line 797
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v1

    const v2, 0x7f02004c

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 798
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0019

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 799
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 800
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 801
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b012d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealPanel;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    .line 803
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v1

    const v2, 0x7f02004d

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 804
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0036

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(Ljava/lang/CharSequence;)V

    .line 805
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 806
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 807
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->t:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$10;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$10;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 832
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->u:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$11;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$11;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 860
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->X:Lcom/qihoo/security/ui/main/c$a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/c$a;)V

    .line 861
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 423
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 424
    if-eqz p3, :cond_0

    .line 425
    const-string/jumbo v0, "exam_status"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 426
    if-eqz v0, :cond_0

    .line 430
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 433
    :cond_0
    sparse-switch p1, :sswitch_data_0

    .line 456
    :cond_1
    :goto_0
    return-void

    .line 435
    :sswitch_0
    if-eq p2, v2, :cond_2

    if-eqz p3, :cond_1

    .line 436
    :cond_2
    invoke-direct {p0, p3, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/content/Intent;I)V

    goto :goto_0

    .line 440
    :sswitch_1
    if-eq p2, v2, :cond_3

    if-eqz p3, :cond_1

    .line 441
    :cond_3
    invoke-direct {p0, p3, p1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/content/Intent;I)V

    goto :goto_0

    .line 446
    :sswitch_2
    const/16 v0, 0xc8

    if-ne p2, v0, :cond_1

    .line 450
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->n()V

    goto :goto_0

    .line 433
    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_2
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 252
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onCreate(Landroid/os/Bundle;)V

    .line 253
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 255
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BOOST"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BATTERY_LOW"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_POWER_REMIND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->P:Z

    .line 259
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "jump_result_page"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->Q:Z

    .line 262
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    const v2, 0x7f030055

    .line 269
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    .line 270
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_0

    .line 275
    new-instance v0, Lcom/qihoo/security/ui/b/a$f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    const/4 v1, 0x0

    invoke-virtual {p1, v2, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->S:Lcom/qihoo/security/ui/b/a$f;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->n:Landroid/view/ViewGroup;

    .line 280
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->o()V

    .line 281
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->t()V

    .line 282
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment$a;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->K:Lcom/qihoo/security/ui/main/BoosterFragment$a;

    .line 283
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->L:Landroid/content/IntentFilter;

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->K:Lcom/qihoo/security/ui/main/BoosterFragment$a;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->L:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/e;->a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/e;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->Y:Lcom/qihoo/security/ui/b/e;

    .line 287
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->n:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 551
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->R:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 552
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onDestroy()V

    .line 553
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 542
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->K:Lcom/qihoo/security/ui/main/BoosterFragment$a;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 543
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onDestroyView()V

    .line 544
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 391
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onPause()V

    .line 396
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 382
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onResume()V

    .line 387
    return-void
.end method

.method public onStart()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 353
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onStart()V

    .line 357
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->u()V

    .line 358
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->r()V

    .line 360
    invoke-static {}, Lcom/qihoo/security/booster/a;->b()Landroid/content/ComponentName;

    move-result-object v0

    .line 364
    iget-boolean v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->k:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "com.qihoo.security.ui.main.HomeActivity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 368
    iput-boolean v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->k:Z

    .line 369
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->a:Z

    .line 371
    invoke-virtual {p0, v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Z)V

    .line 378
    :cond_0
    :goto_0
    return-void

    .line 374
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->k:Z

    if-nez v0, :cond_0

    .line 375
    invoke-virtual {p0, v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Z)V

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 317
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onStop()V

    .line 321
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->v()V

    .line 322
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->s()V

    .line 324
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v0, v1, :cond_2

    .line 325
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 330
    :cond_0
    :goto_0
    invoke-static {}, Lcom/qihoo/security/booster/a;->b()Landroid/content/ComponentName;

    move-result-object v0

    .line 334
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 338
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->k:Z

    .line 340
    :cond_1
    return-void

    .line 326
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->H:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-ne v0, v1, :cond_0

    .line 327
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 296
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 297
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V

    .line 298
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Landroid/content/Intent;)V

    .line 300
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 301
    return-void
.end method
