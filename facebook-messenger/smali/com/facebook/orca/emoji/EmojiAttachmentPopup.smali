.class public Lcom/facebook/orca/emoji/EmojiAttachmentPopup;
.super Lcom/facebook/orca/emoji/ComposerPopup;
.source "EmojiAttachmentPopup.java"


# static fields
.field private static final ai:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private aA:Lcom/facebook/orca/emoji/ag;

.field private aB:Z

.field private aC:Landroid/os/Handler;

.field private aD:Landroid/os/Handler;

.field private aE:Ljava/lang/String;

.field private aF:I

.field private aj:Landroid/widget/LinearLayout;

.field private ak:Lcom/facebook/orca/emoji/o;

.field private al:Landroid/view/View;

.field private am:Landroid/widget/Button;

.field private an:Landroid/widget/FrameLayout;

.field private ao:Landroid/widget/FrameLayout;

.field private ap:Landroid/view/ViewStub;

.field private aq:Lcom/facebook/orca/emoji/TabbedPageView;

.field private ar:Landroid/widget/LinearLayout;

.field private as:Landroid/os/Vibrator;

.field private at:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private au:Lcom/facebook/orca/emoji/p;

.field private av:Lcom/facebook/orca/compose/aq;

.field private aw:Lcom/facebook/prefs/shared/d;

.field private ax:Z

.field private ay:Z

.field private az:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    sput-object v0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ai:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/emoji/ComposerPopup;-><init>()V

    .line 81
    return-void
.end method

.method private U()V
    .locals 2

    .prologue
    .line 263
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ap:Landroid/view/ViewStub;

    if-eqz v0, :cond_0

    .line 291
    :goto_0
    return-void

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->emoji_back_stub:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ap:Landroid/view/ViewStub;

    .line 268
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ap:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 270
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->emoji_back_container:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/TabbedPageView;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    .line 272
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ay:Z

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    new-instance v1, Lcom/facebook/orca/emoji/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/emoji/i;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/TabbedPageView;->setEllipsisClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    new-instance v1, Lcom/facebook/orca/emoji/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/emoji/j;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/TabbedPageView;->setBackspaceTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0
.end method

.method private V()Landroid/view/View;
    .locals 3

    .prologue
    .line 452
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->az:I

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 454
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->n()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 455
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 456
    sget v0, Lcom/facebook/h;->orca_composer_divider_vertical:I

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 457
    return-object v1
.end method

.method private W()V
    .locals 3

    .prologue
    .line 461
    const-string v0, "loadAndSetEmojiAndButtonOnFront"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 462
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 463
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->X()V

    .line 467
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 468
    return-void

    .line 465
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->Y()V

    goto :goto_0
.end method

.method private X()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 472
    sget-object v0, Lcom/facebook/orca/emoji/aa;->b:Lcom/facebook/orca/emoji/x;

    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x1

    invoke-direct {p0, v0, v3, v1, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/x;IIZ)Landroid/widget/LinearLayout;

    move-result-object v0

    .line 474
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ao:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 475
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 476
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ar:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 477
    return-void
.end method

.method private Y()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 481
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->a()I

    move-result v0

    .line 482
    sget-object v1, Lcom/facebook/orca/emoji/aa;->b:Lcom/facebook/orca/emoji/x;

    invoke-direct {p0, v1, v4, v0, v5}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/x;IIZ)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 484
    sget-object v2, Lcom/facebook/orca/emoji/aa;->b:Lcom/facebook/orca/emoji/x;

    add-int/lit8 v3, v0, -0x2

    invoke-direct {p0, v2, v0, v3, v5}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/x;IIZ)Landroid/widget/LinearLayout;

    move-result-object v0

    .line 486
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ao:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 487
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 490
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->al:Landroid/view/View;

    invoke-direct {p0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->b(Landroid/view/View;)V

    .line 491
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ar:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 492
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ar:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 493
    return-void
.end method

.method private Z()V
    .locals 2

    .prologue
    .line 496
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->U()V

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/TabbedPageView;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 498
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aa()V

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->emoji_front_container:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 502
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 504
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->emoji_back_container:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 505
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 507
    const-string v0, "backside_button"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Ljava/lang/String;)V

    .line 508
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/Object;Z)Landroid/view/View;
    .locals 8

    .prologue
    .line 590
    instance-of v0, p2, Lcom/facebook/orca/emoji/c;

    if-nez v0, :cond_0

    .line 591
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Expected an object of type Emoji"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 593
    :cond_0
    check-cast p2, Lcom/facebook/orca/emoji/c;

    .line 595
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->d()I

    move-result v3

    .line 596
    if-eqz p3, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->f()I

    move-result v0

    .line 597
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->g()I

    move-result v4

    .line 598
    if-eqz p3, :cond_2

    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->k()I

    move-result v1

    .line 599
    :goto_1
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->h()I

    move-result v5

    .line 600
    if-eqz p3, :cond_3

    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->l()I

    move-result v2

    .line 602
    :goto_2
    iget-object v6, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->au:Lcom/facebook/orca/emoji/p;

    new-instance v7, Lcom/facebook/orca/emoji/f;

    invoke-direct {v7, p0, p2, p3}, Lcom/facebook/orca/emoji/f;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Lcom/facebook/orca/emoji/c;Z)V

    invoke-interface {v6, p1, p2, v7}, Lcom/facebook/orca/emoji/p;->a(Landroid/content/Context;Lcom/facebook/orca/emoji/c;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v6

    .line 610
    invoke-virtual {v6, v4, v1, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 611
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 612
    invoke-virtual {v6, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 613
    return-object v6

    .line 596
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->e()I

    move-result v0

    goto :goto_0

    .line 598
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->i()I

    move-result v1

    goto :goto_1

    .line 600
    :cond_3
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->j()I

    move-result v2

    goto :goto_2
.end method

.method private a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;III)Landroid/view/View;
    .locals 7

    .prologue
    .line 385
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;IIII)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;IIII)Landroid/view/View;
    .locals 8

    .prologue
    .line 401
    const-string v0, "generateAttachmentButton"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 402
    sget v0, Lcom/facebook/k;->orca_emoji_attachment_item:I

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 403
    sget v0, Lcom/facebook/i;->attachment_type_text:I

    invoke-virtual {p0, v2, v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;

    .line 404
    invoke-virtual {p0, p3}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;->setText(Ljava/lang/String;)V

    .line 405
    sget v0, Lcom/facebook/i;->attachment_type_logo:I

    invoke-virtual {p0, v2, v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 407
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->o()Landroid/content/res/Resources;

    move-result-object v3

    .line 410
    iget-object v4, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aD:Landroid/os/Handler;

    new-instance v5, Lcom/facebook/orca/emoji/k;

    invoke-direct {v5, p0, v0, v3, p4}, Lcom/facebook/orca/emoji/k;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/widget/ImageButton;Landroid/content/res/Resources;I)V

    const-wide/16 v6, 0xa

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 417
    packed-switch p5, :pswitch_data_0

    .line 447
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 448
    return-object v2

    .line 419
    :pswitch_0
    new-instance v3, Lcom/facebook/orca/emoji/l;

    invoke-direct {v3, p0, p6}, Lcom/facebook/orca/emoji/l;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;I)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 438
    :pswitch_1
    new-instance v3, Lcom/facebook/orca/emoji/m;

    invoke-direct {v3, p0}, Lcom/facebook/orca/emoji/m;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 417
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/content/Context;Ljava/lang/Object;Z)Landroid/view/View;
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/content/Context;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/emoji/x;IIZ)Landroid/widget/LinearLayout;
    .locals 4

    .prologue
    .line 573
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->n()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 574
    invoke-virtual {p1}, Lcom/facebook/orca/emoji/x;->b()Ljava/util/List;

    move-result-object v0

    .line 575
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int v3, p2, p3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 579
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->n()Landroid/content/Context;

    move-result-object v3

    .line 580
    invoke-interface {v0, p2, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/c;

    .line 581
    invoke-direct {p0, v3, v0, p4}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/content/Context;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 583
    :cond_0
    return-object v1
.end method

.method public static a(IIIIZIZZ)Lcom/facebook/orca/emoji/EmojiAttachmentPopup;
    .locals 3

    .prologue
    .line 128
    new-instance v0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;-><init>()V

    .line 129
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 130
    const-string v2, "x"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 131
    const-string v2, "y"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 132
    const-string v2, "gravity"

    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 133
    const-string v2, "height"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 134
    const-string v2, "width"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 135
    const-string v2, "showArrowAbove"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 136
    const-string v2, "canComposeAudio"

    invoke-virtual {v1, v2, p6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 137
    const-string v2, "enableMedia"

    invoke-virtual {v1, v2, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 138
    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->g(Landroid/os/Bundle;)V

    .line 139
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aE:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 294
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 295
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aC:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 296
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aB:Z

    .line 303
    :cond_0
    :goto_0
    return-void

    .line 297
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 298
    iput-boolean v4, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aB:Z

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aC:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 300
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aC:Landroid/os/Handler;

    const-wide/16 v2, 0x190

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 301
    invoke-direct {p0, v4}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->e(Z)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->Z()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;I)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->d(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/MotionEvent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Lcom/facebook/orca/emoji/c;Z)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/c;Z)V

    return-void
.end method

.method private a(Lcom/facebook/orca/emoji/c;Z)V
    .locals 3

    .prologue
    .line 617
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    if-eqz v0, :cond_0

    .line 619
    invoke-virtual {p1}, Lcom/facebook/orca/emoji/c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Ljava/lang/String;Z)V

    .line 621
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->as:Landroid/os/Vibrator;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 622
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    invoke-interface {v0, p1}, Lcom/facebook/orca/emoji/o;->a(Lcom/facebook/orca/emoji/c;)V

    .line 624
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 647
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->T()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 648
    const-string v1, "action"

    const-string v2, "emoji_selected"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 649
    const-string v1, "emoji"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 650
    const-string v1, "front_side"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 651
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ah:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 652
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Z)Z
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->e(Z)Z

    move-result v0

    return v0
.end method

.method private aa()V
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 520
    const-string v0, "loadAndSetEmojisForBackside"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v9

    .line 523
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 524
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 525
    sget-object v0, Lcom/facebook/orca/emoji/aa;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/x;

    .line 526
    new-instance v4, Lcom/facebook/orca/emoji/am;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/x;->a()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/x;->a()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/x;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, v5, v7, v0}, Lcom/facebook/orca/emoji/am;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 534
    :cond_0
    new-instance v4, Lcom/facebook/orca/emoji/n;

    invoke-direct {v4, p0}, Lcom/facebook/orca/emoji/n;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    .line 541
    new-instance v5, Lcom/facebook/orca/emoji/e;

    invoke-direct {v5, p0}, Lcom/facebook/orca/emoji/e;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    .line 553
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aw:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/emoji/w;->c:Lcom/facebook/prefs/shared/ae;

    const/4 v7, 0x0

    invoke-interface {v0, v3, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 554
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aw:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/emoji/w;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v3, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v8

    .line 555
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    iget-object v3, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual/range {v0 .. v8}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/util/List;Ljava/util/List;Lcom/facebook/orca/emoji/ag;Lcom/facebook/orca/emoji/aq;Lcom/facebook/orca/emoji/an;ZLjava/lang/String;I)V

    .line 565
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    .line 566
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;I)I
    .locals 0

    .prologue
    .line 48
    iput p1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aF:I

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)Lcom/facebook/orca/emoji/TabbedPageView;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aq:Lcom/facebook/orca/emoji/TabbedPageView;

    return-object v0
.end method

.method private b(Landroid/view/LayoutInflater;)V
    .locals 8

    .prologue
    .line 311
    const-string v0, "addAttachmentOperationItems"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v7

    .line 312
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    sget v3, Lcom/facebook/o;->photo_dialog_image_search:I

    sget v4, Lcom/facebook/h;->orca_composer_attach_search_button:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;IIII)Landroid/view/View;

    move-result-object v0

    .line 319
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->V()Landroid/view/View;

    move-result-object v1

    .line 321
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 325
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->av:Lcom/facebook/orca/compose/aq;

    invoke-interface {v1, p0, p1}, Lcom/facebook/orca/compose/aq;->a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/LayoutInflater;)V

    .line 326
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->av:Lcom/facebook/orca/compose/aq;

    invoke-interface {v1, p0, p1}, Lcom/facebook/orca/compose/aq;->b(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/LayoutInflater;)V

    .line 327
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->at:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ax:Z

    if-eqz v0, :cond_0

    .line 332
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    sget v3, Lcom/facebook/o;->photo_dialog_record_audio:I

    sget v4, Lcom/facebook/h;->orca_composer_attach_recorder_button:I

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;III)Landroid/view/View;

    move-result-object v0

    .line 338
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->V()Landroid/view/View;

    move-result-object v1

    .line 339
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 340
    iget-object v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 342
    :cond_0
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    .line 343
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 511
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 512
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    .line 513
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->d()I

    move-result v2

    if-le v2, v1, :cond_0

    .line 514
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->d()I

    move-result v2

    sub-int v1, v2, v1

    .line 515
    iget v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 517
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)Lcom/facebook/orca/emoji/o;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    return-object v0
.end method

.method private d(I)V
    .locals 1

    .prologue
    .line 627
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    if-eqz v0, :cond_0

    .line 628
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    invoke-interface {v0, p1}, Lcom/facebook/orca/emoji/o;->a(I)V

    .line 630
    :cond_0
    return-void
.end method

.method private e(Z)Z
    .locals 1

    .prologue
    .line 306
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->f(Z)V

    .line 307
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aB:Z

    return v0
.end method

.method private f(Z)V
    .locals 3

    .prologue
    .line 633
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    if-eqz v0, :cond_1

    .line 634
    if-eqz p1, :cond_0

    .line 635
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->as:Landroid/os/Vibrator;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 637
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/o;->c()V

    .line 639
    :cond_1
    return-void
.end method


# virtual methods
.method protected S()Ljava/lang/String;
    .locals 1

    .prologue
    .line 643
    const-string v0, "emoji_attachment_popup"

    return-object v0
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 196
    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 197
    const-string v0, "EmojiAttachmentPopup onCreateView"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 199
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->n()Landroid/content/Context;

    move-result-object v0

    const-string v2, "vibrator"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->as:Landroid/os/Vibrator;

    .line 200
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->Q()V

    .line 202
    const-string v0, "layoutInflation"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 203
    sget v2, Lcom/facebook/k;->orca_emoji_popup:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    .line 204
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 206
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_show_back:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->al:Landroid/view/View;

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_show_back_container:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ao:Landroid/widget/FrameLayout;

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_backspace:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->am:Landroid/widget/Button;

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_backspace_container:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->an:Landroid/widget/FrameLayout;

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_front_content:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ar:Landroid/widget/LinearLayout;

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->attachment_operation_container:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    .line 214
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->O()V

    .line 215
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->P()V

    .line 217
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->b(Landroid/view/LayoutInflater;)V

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->al:Landroid/view/View;

    new-instance v2, Lcom/facebook/orca/emoji/g;

    invoke-direct {v2, p0}, Lcom/facebook/orca/emoji/g;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->am:Landroid/widget/Button;

    new-instance v2, Lcom/facebook/orca/emoji/h;

    invoke-direct {v2, p0}, Lcom/facebook/orca/emoji/h;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 234
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ay:Z

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ar:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 237
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->W()V

    .line 243
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 244
    sget-object v0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ai:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    return-object v0

    .line 240
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->Z()V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 150
    invoke-super {p0, p1}, Lcom/facebook/orca/emoji/ComposerPopup;->a(Landroid/os/Bundle;)V

    .line 151
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "canComposeAudio"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ax:Z

    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "enableMedia"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ay:Z

    .line 154
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->o()Landroid/content/res/Resources;

    move-result-object v0

    .line 155
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->az:I

    .line 156
    new-instance v1, Lcom/facebook/orca/emoji/ae;

    new-instance v2, Lcom/facebook/orca/emoji/r;

    invoke-direct {v2}, Lcom/facebook/orca/emoji/r;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/emoji/ae;-><init>(Landroid/content/res/Resources;Lcom/facebook/orca/emoji/af;)V

    iget v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ac:I

    iget v3, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ab:I

    sget v4, Lcom/facebook/g;->emoji_category_height_dp:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sub-int v0, v3, v0

    iget v3, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->af:I

    sub-int/2addr v0, v3

    iget-boolean v3, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ad:Z

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/orca/emoji/ae;->a(IIZ)Lcom/facebook/orca/emoji/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aA:Lcom/facebook/orca/emoji/ag;

    .line 162
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 163
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsAudioRecorderEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->at:Ljavax/inject/a;

    .line 165
    const-class v0, Lcom/facebook/orca/emoji/p;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/p;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->au:Lcom/facebook/orca/emoji/p;

    .line 167
    const-class v0, Lcom/facebook/orca/compose/aq;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/aq;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->av:Lcom/facebook/orca/compose/aq;

    .line 168
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aw:Lcom/facebook/prefs/shared/d;

    .line 170
    new-instance v0, Lcom/facebook/orca/emoji/d;

    invoke-direct {v0, p0}, Lcom/facebook/orca/emoji/d;-><init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aC:Landroid/os/Handler;

    .line 181
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aD:Landroid/os/Handler;

    .line 182
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;)V
    .locals 7

    .prologue
    .line 367
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    sget v3, Lcom/facebook/o;->photo_dialog_take_photo:I

    sget v4, Lcom/facebook/h;->orca_composer_attach_camera_button:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;IIII)Landroid/view/View;

    move-result-object v0

    .line 374
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->V()Landroid/view/View;

    move-result-object v1

    .line 375
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 377
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Lcom/facebook/orca/photos/picking/b;)V
    .locals 7

    .prologue
    .line 348
    sget-object v0, Lcom/facebook/orca/photos/picking/b;->CAMERA:Lcom/facebook/orca/photos/picking/b;

    if-ne p2, v0, :cond_0

    sget v4, Lcom/facebook/h;->orca_composer_attach_camera_button:I

    .line 352
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    sget v3, Lcom/facebook/o;->photo_dialog_choose_photo:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;IIII)Landroid/view/View;

    move-result-object v0

    .line 360
    invoke-direct {p0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->V()Landroid/view/View;

    move-result-object v1

    .line 362
    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 363
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 364
    return-void

    .line 348
    :cond_0
    sget v4, Lcom/facebook/h;->orca_composer_attach_photo_button:I

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/emoji/o;)V
    .locals 0

    .prologue
    .line 144
    invoke-virtual {p0, p1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/b;)V

    .line 145
    iput-object p1, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ak:Lcom/facebook/orca/emoji/o;

    .line 146
    return-void
.end method

.method public h()V
    .locals 2

    .prologue
    .line 186
    invoke-super {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->h()V

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aD:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 188
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 251
    invoke-super {p0, p1}, Lcom/facebook/orca/emoji/ComposerPopup;->onDismiss(Landroid/content/DialogInterface;)V

    .line 254
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aE:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aw:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/emoji/w;->c:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/emoji/w;->d:Lcom/facebook/prefs/shared/ae;

    iget v2, p0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->aF:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 260
    :cond_0
    return-void
.end method
