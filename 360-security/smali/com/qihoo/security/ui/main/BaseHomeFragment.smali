.class public Lcom/qihoo/security/ui/main/BaseHomeFragment;
.super Lcom/qihoo/security/ui/fragment/BaseFragment;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/recommend/a$a;
.implements Lcom/qihoo/security/ui/main/FragmentsObservable$a;
.implements Lcom/qihoo/security/ui/main/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/main/BaseHomeFragment$4;
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/ui/main/c;

.field protected b:Lcom/qihoo/security/recommend/a;

.field c:Lcom/nineoldandroids/a/k;

.field j:Lcom/nineoldandroids/a/k;

.field private k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private l:Lcom/qihoo/security/ui/main/FragmentsObservable;

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31
    invoke-direct {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;-><init>()V

    .line 39
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 45
    iput-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    .line 46
    iput-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    return-object v0
.end method

.method private a(Z)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 382
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 386
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 388
    :cond_1
    if-eqz p1, :cond_2

    .line 389
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 390
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 391
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 397
    :goto_0
    return-void

    .line 393
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 394
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(ZZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 359
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    if-nez v1, :cond_1

    .line 378
    :cond_0
    :goto_0
    return v0

    .line 366
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    invoke-virtual {v1}, Lcom/qihoo/security/recommend/a;->a()Z

    move-result v1

    xor-int/2addr v1, p1

    .line 367
    if-nez v1, :cond_2

    .line 368
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Z)V

    goto :goto_0

    .line 371
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/recommend/a;->a(Z)V

    .line 372
    if-nez p2, :cond_3

    .line 373
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Z)V

    .line 378
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 376
    :cond_3
    invoke-direct {p0, p1, p3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    return-object v0
.end method

.method private b(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 9

    .prologue
    const/16 v8, 0x8

    const/4 v7, 0x1

    const/4 v6, 0x2

    const/4 v5, 0x0

    const/4 v0, 0x0

    .line 400
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 403
    if-eqz p1, :cond_0

    .line 404
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 405
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    const-string/jumbo v2, "translationY"

    new-array v3, v6, [F

    iget v4, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->o:F

    aput v4, v3, v0

    aput v5, v3, v7

    invoke-static {v1, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    .line 406
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 407
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    new-instance v1, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;-><init>(Lcom/qihoo/security/ui/main/BaseHomeFragment;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 429
    const/16 v0, 0x226

    .line 430
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 431
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-static {v1, v5}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 459
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 460
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 461
    return-void

    .line 434
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 435
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    const-string/jumbo v2, "translationY"

    new-array v3, v6, [F

    aput v5, v3, v0

    iget v4, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->o:F

    aput v4, v3, v7

    invoke-static {v1, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    .line 436
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    const-wide/16 v2, 0x190

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 437
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c:Lcom/nineoldandroids/a/k;

    new-instance v2, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;

    invoke-direct {v2, p0, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;-><init>(Lcom/qihoo/security/ui/main/BaseHomeFragment;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 446
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    const-string/jumbo v2, "alpha"

    new-array v3, v6, [F

    fill-array-data v3, :array_0

    invoke-static {v1, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    .line 447
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    new-instance v2, Lcom/qihoo/security/ui/main/BaseHomeFragment$3;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment$3;-><init>(Lcom/qihoo/security/ui/main/BaseHomeFragment;)V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 453
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    const-wide/16 v2, 0x190

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 455
    const/16 v1, 0x1f4

    .line 456
    iget-object v2, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    int-to-long v4, v1

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 457
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->j:Lcom/nineoldandroids/a/k;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_0

    .line 446
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 110
    return-void
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 271
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 267
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/a$a;)V
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/main/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 183
    :cond_0
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/a$a;Z)V
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/ui/main/c;->a(Lcom/nineoldandroids/a/a$a;Z)V

    .line 202
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 2

    .prologue
    .line 469
    const/4 v0, 0x1

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 470
    iget-object v0, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->recommendAction:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    iget v0, v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->cancel:I

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 471
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
    .locals 1

    .prologue
    .line 69
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 70
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {p0, p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/ui/main/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 75
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 259
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->l:Lcom/qihoo/security/ui/main/FragmentsObservable;

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->l:Lcom/qihoo/security/ui/main/FragmentsObservable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/main/FragmentsObservable;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 243
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/main/FragmentsObservable;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->l:Lcom/qihoo/security/ui/main/FragmentsObservable;

    .line 248
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 2

    .prologue
    .line 220
    sget-object v0, Lcom/qihoo/security/ui/main/BaseHomeFragment$4;->a:[I

    invoke-virtual {p2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 230
    :goto_0
    return-void

    .line 225
    :pswitch_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    goto :goto_0

    .line 220
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/main/c$a;)V
    .locals 1

    .prologue
    .line 299
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/main/c;->a(Lcom/qihoo/security/ui/main/c$a;)V

    .line 302
    :cond_0
    return-void
.end method

.method protected a(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 1

    .prologue
    .line 353
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)Z

    .line 356
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)Z
    .locals 1

    .prologue
    .line 98
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p0}, Lcom/qihoo/security/ui/main/c;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v0

    .line 101
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a_(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 279
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/main/c;->a_(Ljava/lang/String;)V

    .line 282
    :cond_0
    return-void
.end method

.method protected b(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 275
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a$a;)V
    .locals 1

    .prologue
    .line 192
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/main/c;->b(Lcom/nineoldandroids/a/a$a;)V

    .line 195
    :cond_0
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a$a;Z)V
    .locals 1

    .prologue
    .line 206
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/ui/main/c;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 209
    :cond_0
    return-void
.end method

.method public b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 3

    .prologue
    .line 475
    const/4 v0, 0x0

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 476
    if-nez p1, :cond_0

    .line 483
    :goto_0
    return-void

    .line 479
    :cond_0
    iget-object v0, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->recommendAction:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    iget v0, v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->click:I

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 480
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 481
    const-string/jumbo v1, "index"

    invoke-virtual {p1}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->ordinal()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 482
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->e:Lcom/qihoo/security/ui/fragment/BaseFragment$b;

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ChangeTab:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-interface {v1, v2, v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$b;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method protected b(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 0

    .prologue
    .line 465
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    return v0
.end method

.method public b_(I)V
    .locals 1

    .prologue
    .line 487
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/main/c;->b_(I)V

    .line 490
    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 152
    return-void
.end method

.method protected c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 314
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/main/HomeActivity;

    .line 315
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v1

    .line 349
    :cond_1
    :goto_0
    return v0

    .line 318
    :cond_2
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v2

    .line 319
    invoke-virtual {v2}, Lcom/qihoo/security/recommend/RecommendHelper;->b()Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    move-result-object v0

    if-eq v0, p1, :cond_3

    move v0, v1

    .line 320
    goto :goto_0

    .line 322
    :cond_3
    invoke-virtual {v2, v7}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 323
    invoke-virtual {v2, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    move-result-object v3

    .line 324
    if-nez v3, :cond_4

    move v0, v1

    .line 325
    goto :goto_0

    .line 327
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0b00c1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 328
    if-eqz v0, :cond_5

    .line 329
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    .line 330
    new-instance v0, Lcom/qihoo/security/recommend/a;

    invoke-direct {v0}, Lcom/qihoo/security/recommend/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    .line 331
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/recommend/a;->a(Lcom/qihoo/security/recommend/a$a;)V

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/a;->a(Landroid/view/View;)V

    .line 333
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0b00bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    .line 334
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->n:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->o:F

    .line 335
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/b/b;->a(Landroid/view/View;)Lcom/nineoldandroids/b/b;

    move-result-object v0

    .line 336
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->m:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 337
    iget v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->o:F

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->b(F)Lcom/nineoldandroids/b/b;

    .line 338
    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Lcom/nineoldandroids/b/b;->a(J)Lcom/nineoldandroids/b/b;

    .line 339
    invoke-virtual {v0}, Lcom/nineoldandroids/b/b;->a()V

    .line 341
    :cond_5
    invoke-virtual {v2, v3}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 342
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RecommendType."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 343
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b:Lcom/qihoo/security/recommend/a;

    invoke-virtual {v1, v3, v0}, Lcom/qihoo/security/recommend/a;->a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;Ljava/lang/String;)V

    .line 344
    invoke-direct {p0, v6, v6, v7}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)Z

    move-result v0

    .line 345
    if-eqz v0, :cond_1

    .line 346
    iget-object v1, v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->recommendAction:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    iget v1, v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->show:I

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method

.method public c_()V
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0}, Lcom/qihoo/security/ui/main/c;->c_()V

    .line 171
    :cond_0
    return-void
.end method

.method public d_()V
    .locals 1

    .prologue
    .line 494
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    if-eqz v0, :cond_0

    .line 495
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;

    invoke-interface {v0}, Lcom/qihoo/security/ui/main/c;->d_()V

    .line 497
    :cond_0
    return-void
.end method

.method public g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-nez v0, :cond_0

    .line 84
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->k:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method public h()V
    .locals 0

    .prologue
    .line 118
    return-void
.end method

.method public i()V
    .locals 0

    .prologue
    .line 160
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 52
    :try_start_0
    check-cast p1, Lcom/qihoo/security/ui/main/c;

    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a:Lcom/qihoo/security/ui/main/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :goto_0
    return-void

    .line 53
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 306
    invoke-super {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onStop()V

    .line 307
    const/4 v0, 0x0

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 308
    return-void
.end method

.method public update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 213
    instance-of v0, p2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    if-eqz v0, :cond_0

    instance-of v0, p1, Lcom/qihoo/security/ui/main/FragmentsObservable;

    if-eqz v0, :cond_0

    .line 214
    check-cast p1, Lcom/qihoo/security/ui/main/FragmentsObservable;

    check-cast p2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 216
    :cond_0
    return-void
.end method
