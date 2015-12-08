.class public final Lcom/roidapp/photogrid/release/ez;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private j:Z

.field private k:Lcom/roidapp/photogrid/release/PhotoView;

.field private l:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ez;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->l:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private a(ZZZZZZ)V
    .locals 3

    .prologue
    const v2, 0x7f0200c2

    .line 354
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    :cond_0
    :goto_0
    return-void

    .line 357
    :cond_1
    if-eqz p1, :cond_2

    .line 358
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextColor"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 359
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 361
    :cond_2
    if-eqz p2, :cond_3

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBgList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 364
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBgListSub"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 365
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBgColor"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 366
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 368
    :cond_3
    if-eqz p3, :cond_4

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextOrder"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentAlignList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 371
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 373
    :cond_4
    if-eqz p4, :cond_5

    .line 374
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "TextFontFragment"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 377
    :cond_5
    if-eqz p5, :cond_6

    .line 378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextAlpha"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 381
    :cond_6
    if-eqz p6, :cond_0

    .line 382
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextOrder"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 383
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 118
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const v2, -0x41333333    # -0.4f

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 120
    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 121
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 122
    return-void
.end method

.method public final b()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const v4, 0x7f0200c2

    const/4 v0, 0x1

    .line 316
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "TextFontFragment"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 317
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "TextFontFragment"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 318
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 350
    :goto_0
    return v0

    .line 322
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentTextColor"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 323
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentTextColor"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 324
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 327
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentTextAlpha"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 328
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentTextAlpha"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 329
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 332
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentTextOrder"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 333
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentTextOrder"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 337
    :cond_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentBgListSub"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentBgColor"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 339
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentBgListSub"

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 340
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentBgColor"

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 341
    new-instance v2, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 342
    invoke-virtual {v2, v0, v1, v0}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 343
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v3, 0x7f0d03ec

    const-string v4, "FragmentBgList"

    invoke-virtual {v1, v3, v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 345
    :cond_5
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "FragmentBgList"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 346
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgList"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 347
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 350
    goto/16 :goto_0
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 397
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 402
    :cond_0
    :goto_0
    return-void

    .line 400
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 401
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 36
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    .line 39
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 40
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1389
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 128
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 129
    instance-of v0, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    iget-boolean v0, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v0, :cond_0

    .line 130
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 131
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->C()V

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v0

    .line 133
    if-eqz v0, :cond_0

    .line 134
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    goto :goto_0

    .line 140
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 150
    :cond_1
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "TextFontFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ge;

    .line 152
    if-nez v0, :cond_2

    .line 153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 154
    new-instance v0, Lcom/roidapp/photogrid/release/ge;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ge;-><init>()V

    .line 155
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "TextFontFragment"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 158
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 159
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "TextFontFragment"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 164
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_3

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 166
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 174
    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentTextColor"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fr;

    .line 176
    if-nez v0, :cond_4

    .line 177
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 178
    new-instance v0, Lcom/roidapp/photogrid/release/fr;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/fr;-><init>()V

    .line 179
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "FragmentTextColor"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 182
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextColor"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 189
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_5

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 191
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 195
    :cond_5
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 197
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBgList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 198
    new-instance v0, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 199
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 200
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "FragmentBgList"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 203
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentBgList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 230
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_7

    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 232
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 236
    :cond_7
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentAlignList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 239
    new-instance v0, Lcom/roidapp/photogrid/release/bt;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/bt;-><init>()V

    .line 240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "FragmentAlignList"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->f:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 243
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentAlignList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->f:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 248
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_9

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 250
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 258
    :cond_9
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentTextAlpha"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fo;

    .line 260
    if-nez v0, :cond_a

    .line 261
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 262
    new-instance v0, Lcom/roidapp/photogrid/release/fo;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/fo;-><init>()V

    .line 263
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "FragmentTextAlpha"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 266
    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextAlpha"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 272
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_b

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 274
    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 278
    :cond_b
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentTextOrder"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/hc;

    .line 280
    if-nez v0, :cond_c

    .line 281
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 282
    new-instance v0, Lcom/roidapp/photogrid/release/hc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/hc;-><init>()V

    .line 283
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d03ec

    const-string v3, "FragmentTextOrder"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 286
    :cond_c
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ez;->j:Z

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentTextOrder"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    const v1, 0x7f0200c2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 1307
    :pswitch_8
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V

    .line 1308
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ez;->c()V

    .line 1388
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1391
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "FragmentIEPanel"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 1392
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 1393
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ez;->i:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d028d

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 126
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d02d2
        :pswitch_8
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    const v2, 0x7f0d02e0

    .line 47
    const v0, 0x7f0300b6

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1054
    const v0, 0x7f0d02d4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->b:Landroid/widget/TextView;

    .line 1055
    const v0, 0x7f0d02d6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    .line 1056
    const v0, 0x7f0d02da

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    .line 1057
    const v0, 0x7f0d02dc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    .line 1058
    const v0, 0x7f0d02d8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->f:Landroid/widget/TextView;

    .line 1059
    const v0, 0x7f0d02de

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    .line 1060
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    .line 1061
    const v0, 0x7f0d02d2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->a:Landroid/widget/ImageView;

    .line 1065
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1083
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1084
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1085
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1086
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1087
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1088
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1089
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1092
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ez;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020361

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1093
    if-eqz v0, :cond_0

    .line 1094
    const/16 v2, 0xff

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1104
    :cond_0
    const v0, 0x7f0d02d3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ez;->l:Landroid/widget/LinearLayout;

    .line 1105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ez;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/fa;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/fa;-><init>(Lcom/roidapp/photogrid/release/ez;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 49
    return-object v1
.end method

.method public final onDestroy()V
    .locals 7

    .prologue
    .line 421
    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    :try_start_0
    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ez;->a(ZZZZZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 425
    :goto_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 426
    return-void

    .line 423
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
