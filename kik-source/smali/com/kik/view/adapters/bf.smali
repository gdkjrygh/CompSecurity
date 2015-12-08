.class public abstract Lcom/kik/view/adapters/bf;
.super Lcom/kik/view/adapters/s;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/ag;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/bf$1;,
        Lcom/kik/view/adapters/bf$b;,
        Lcom/kik/view/adapters/bf$a;
    }
.end annotation


# static fields
.field private static final t:I

.field private static final u:I


# instance fields
.field protected a:Lcom/kik/view/adapters/bf$b;

.field protected r:Lkik/a/d/s;

.field protected s:Landroid/os/Handler;

.field private v:Lcom/kik/view/adapters/af;

.field private w:Lkik/android/i/b;

.field private x:Ljava/util/HashMap;

.field private y:Ljava/util/HashMap;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x4

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lcom/kik/view/adapters/bf;->t:I

    .line 60
    const/16 v0, 0xa

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lcom/kik/view/adapters/bf;->u:I

    return-void
.end method

.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 83
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/s;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 67
    iput-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    .line 68
    iput-object v0, p0, Lcom/kik/view/adapters/bf;->r:Lkik/a/d/s;

    .line 70
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/bf;->s:Landroid/os/Handler;

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/bf;->y:Ljava/util/HashMap;

    .line 84
    iput-object p12, p0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    .line 85
    iput-object p13, p0, Lcom/kik/view/adapters/bf;->v:Lcom/kik/view/adapters/af;

    .line 86
    return-void
.end method

.method static synthetic a(Lcom/kik/view/adapters/bf;Lkik/a/d/s;Lkik/a/d/a/a;Lcom/kik/view/adapters/bf$b;)V
    .locals 18

    .prologue
    .line 57
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/bf;->v:Lcom/kik/view/adapters/af;

    invoke-interface {v4}, Lcom/kik/view/adapters/af;->a()V

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/kik/view/adapters/ak;->a(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    new-instance v13, Landroid/view/TextureView;

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v13, v4}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v4, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p1

    invoke-virtual {v0, v1, v2, v13}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Landroid/view/View;)V

    new-instance v4, Lcom/kik/view/adapters/br;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p1

    invoke-direct {v4, v0, v1, v2}, Lcom/kik/view/adapters/br;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    invoke-virtual {v13, v4}, Landroid/view/TextureView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, Lcom/kik/view/adapters/bs;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/kik/view/adapters/bs;-><init>(Lcom/kik/view/adapters/bf;)V

    invoke-virtual {v13, v4}, Landroid/view/TextureView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    invoke-virtual {v13}, Landroid/view/TextureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    move-object/from16 v0, p3

    iget-object v5, v0, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v5}, Lkik/android/widget/ClampedContentPreviewView;->getWidth()I

    move-result v5

    sget v6, Lcom/kik/view/adapters/bf;->p:I

    sub-int/2addr v5, v6

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    move-object/from16 v0, p3

    iget-object v5, v0, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v5}, Lkik/android/widget/ClampedContentPreviewView;->getHeight()I

    move-result v5

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->height:I

    invoke-virtual/range {p1 .. p1}, Lkik/a/d/s;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    sget v5, Lcom/kik/view/adapters/bf;->p:I

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    :goto_0
    invoke-virtual {v13, v4}, Landroid/view/TextureView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/view/View;

    const/4 v5, 0x0

    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v13, v4, v5

    invoke-static {v4}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    invoke-virtual/range {p2 .. p2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_0

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/bf;->b(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    :cond_0
    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    invoke-virtual/range {p2 .. p2}, Lkik/a/d/a/a;->z()Z

    move-result v5

    invoke-virtual {v4, v5}, Lcom/kik/view/adapters/ak;->b(Z)V

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    move-object/from16 v0, p3

    iget-boolean v14, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    new-instance v5, Lcom/kik/view/adapters/bt;

    move-object/from16 v6, p0

    move-object/from16 v7, p3

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    invoke-direct/range {v5 .. v13}, Lcom/kik/view/adapters/bt;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Lkik/a/d/a/a;JZLandroid/view/TextureView;)V

    new-instance v15, Lcom/kik/view/adapters/bu;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p1

    invoke-direct {v15, v0, v1, v2}, Lcom/kik/view/adapters/bu;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    new-instance v16, Lcom/kik/view/adapters/bw;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3, v13}, Lcom/kik/view/adapters/bw;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Landroid/view/TextureView;)V

    new-instance v17, Lcom/kik/view/adapters/bh;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/bh;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;)V

    move-object v11, v4

    move v12, v14

    move-object v14, v5

    invoke-virtual/range {v11 .. v17}, Lcom/kik/view/adapters/ak;->a(ZLandroid/view/TextureView;Landroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;Landroid/media/MediaPlayer$OnErrorListener;Lkik/a/e/s;)V

    return-void

    :cond_1
    sget v5, Lcom/kik/view/adapters/bf;->p:I

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct/range {p0 .. p5}, Lcom/kik/view/adapters/bf;->a(Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lkik/a/d/a/a;Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 773
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/a/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 774
    invoke-static {}, Lkik/android/i/i;->a()Lkik/android/i/i;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/i/i;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v7

    .line 775
    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    .line 776
    if-eqz v7, :cond_1

    .line 777
    new-instance v0, Lcom/kik/view/adapters/bl;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bl;-><init>(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 789
    :cond_0
    :goto_0
    return-void

    .line 785
    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    .line 786
    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/bf;->a(Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 794
    if-eqz p1, :cond_0

    .line 795
    iget-object v7, p0, Lcom/kik/view/adapters/bf;->s:Landroid/os/Handler;

    new-instance v0, Lcom/kik/view/adapters/bm;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p2

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bm;-><init>(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 804
    :cond_0
    return-void
.end method

.method private b(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 493
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->v:Lkik/android/widget/RobotoTextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 494
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 497
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 498
    check-cast p1, Lcom/kik/view/adapters/bf$b;

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    .line 499
    if-eqz v0, :cond_0

    .line 500
    invoke-virtual {v0, v3}, Lkik/android/widget/ProgressWheel;->setVisibility(I)V

    .line 501
    const v1, 0x7f020068

    invoke-virtual {v0, v1}, Lkik/android/widget/ProgressWheel;->setBackgroundResource(I)V

    .line 502
    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v1}, Lkik/android/widget/ProgressWheel;->a(F)V

    .line 505
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    sget-object v1, Lcom/kik/view/adapters/bf$a;->b:Lcom/kik/view/adapters/bf$a;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 193
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ak;->c()V

    .line 196
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v1, p0, Lcom/kik/view/adapters/bf;->r:Lkik/a/d/s;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V

    .line 198
    :cond_0
    return-void
.end method


# virtual methods
.method protected a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 116
    new-instance v0, Lcom/kik/view/adapters/bf$b;

    invoke-direct {v0}, Lcom/kik/view/adapters/bf$b;-><init>()V

    .line 117
    invoke-virtual {p0, p1, v0}, Lcom/kik/view/adapters/bf;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/bf$b;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/bf$b;)Landroid/view/View;
    .locals 2

    .prologue
    .line 122
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/s;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;

    move-result-object v1

    .line 124
    const v0, 0x7f0e015f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->f:Landroid/view/View;

    .line 125
    const v0, 0x7f0e008c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    .line 126
    const v0, 0x7f0e0160

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    .line 127
    const v0, 0x7f0e015c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    .line 128
    const v0, 0x7f0e015d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    .line 129
    const v0, 0x7f0e00e1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/RobotoTextView;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->v:Lkik/android/widget/RobotoTextView;

    .line 130
    const v0, 0x7f0e0161

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWheel;

    iput-object v0, p2, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    .line 131
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    invoke-virtual {v0}, Lkik/android/widget/ProgressWheel;->c()V

    .line 132
    invoke-virtual {v1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 133
    return-object v1
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 696
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    invoke-virtual {v0, p1}, Lkik/android/i/b;->b(I)V

    .line 697
    return-void
.end method

.method public final a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 2

    .prologue
    .line 161
    invoke-super/range {p0 .. p5}, Lcom/kik/view/adapters/s;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    .line 162
    check-cast p1, Lcom/kik/view/adapters/s$a;

    .line 163
    iget-object v0, p1, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    new-instance v1, Lcom/kik/view/adapters/bg;

    invoke-direct {v1, p0, p5, p1}, Lcom/kik/view/adapters/bg;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/s$a;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    iget-object v0, p1, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    new-instance v1, Lcom/kik/view/adapters/bn;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/bn;-><init>(Lcom/kik/view/adapters/bf;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 178
    return-void
.end method

.method protected abstract a(Lcom/kik/view/adapters/bf$b;)V
.end method

.method protected final a(Lcom/kik/view/adapters/bf$b;Lcom/kik/view/adapters/ak;)V
    .locals 1

    .prologue
    .line 138
    invoke-virtual {p2}, Lcom/kik/view/adapters/ak;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-static {}, Lkik/android/util/DeviceUtils;->e()I

    .line 140
    invoke-virtual {p2}, Lcom/kik/view/adapters/ak;->b()V

    .line 141
    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    invoke-static {v0}, Lkik/android/util/av;->c(Landroid/view/View;)V

    .line 142
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;)V

    .line 144
    :cond_0
    return-void
.end method

.method final a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 512
    iget-boolean v0, p1, Lcom/kik/view/adapters/bf$b;->z:Z

    if-nez v0, :cond_0

    .line 513
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;)V

    .line 516
    :cond_0
    const/4 v0, 0x4

    new-array v1, v0, [Landroid/view/View;

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    aput-object v0, v1, v3

    move-object v0, p1

    check-cast v0, Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    aput-object v0, v1, v4

    const/4 v0, 0x2

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    aput-object v2, v1, v0

    const/4 v0, 0x3

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->v:Lkik/android/widget/RobotoTextView;

    aput-object v2, v1, v0

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 517
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 519
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    sget-object v1, Lcom/kik/view/adapters/bf$a;->c:Lcom/kik/view/adapters/bf$a;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    return-void
.end method

.method final a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 673
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    if-eq v0, p1, :cond_0

    .line 674
    invoke-direct {p0}, Lcom/kik/view/adapters/bf;->d()V

    .line 689
    :goto_0
    iput-object p1, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    .line 690
    iput-object p2, p0, Lcom/kik/view/adapters/bf;->r:Lkik/a/d/s;

    .line 691
    return-void

    .line 681
    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 682
    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 683
    if-eq v1, p3, :cond_1

    .line 684
    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 681
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 687
    :cond_2
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/kik/view/adapters/bf;->r:Lkik/a/d/s;

    sget-object v2, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method final a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 570
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    sget-object v1, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    new-array v0, v6, [Landroid/view/View;

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    aput-object v1, v0, v3

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    aput-object v1, v0, v4

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->i:Landroid/view/View;

    aput-object v1, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 573
    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->r:Landroid/view/View;

    const v1, 0x7f0e01c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 574
    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->r:Landroid/view/View;

    const v1, 0x7f0e01c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWidget;

    invoke-virtual {v0, v2}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View;)V

    .line 576
    :cond_0
    const/4 v0, 0x4

    new-array v1, v0, [Landroid/view/View;

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    aput-object v0, v1, v3

    move-object v0, p1

    check-cast v0, Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    aput-object v0, v1, v4

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    aput-object v0, v1, v5

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    aput-object v0, v1, v6

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 578
    if-eqz p3, :cond_1

    .line 579
    iput-object v2, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    .line 580
    iput-object v2, p0, Lcom/kik/view/adapters/bf;->r:Lkik/a/d/s;

    .line 582
    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 584
    :cond_1
    return-void
.end method

.method protected a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 18

    .prologue
    .line 228
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/kik/view/adapters/bf;->z:Z

    .line 230
    invoke-super/range {p0 .. p2}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 231
    const-class v2, Lkik/a/d/a/a;

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lkik/a/d/a/a;

    .line 232
    if-nez v15, :cond_1

    .line 340
    :cond_0
    :goto_0
    return-void

    .line 236
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->x:Ljava/util/HashMap;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/view/adapters/bf$a;

    .line 237
    if-nez v2, :cond_8

    .line 238
    sget-object v2, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    move-object/from16 v16, v2

    :goto_1
    move-object/from16 v5, p2

    .line 241
    check-cast v5, Lcom/kik/view/adapters/bf$b;

    .line 243
    const/4 v2, 0x1

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    iget-object v4, v5, Lcom/kik/view/adapters/bf$b;->v:Lkik/android/widget/RobotoTextView;

    aput-object v4, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 245
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/kik/view/adapters/bf;->z:Z

    if-nez v2, :cond_2

    .line 246
    sget-object v2, Lcom/kik/view/adapters/bf$1;->a:[I

    invoke-virtual/range {v16 .. v16}, Lcom/kik/view/adapters/bf$a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 260
    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v5, v1, v2}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V

    .line 265
    :cond_2
    :goto_2
    invoke-virtual/range {p0 .. p1}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/s;)Z

    move-result v17

    .line 266
    if-eqz v17, :cond_7

    .line 267
    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->f:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 273
    :goto_3
    const-class v2, Lkik/a/d/a/a;

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v9

    check-cast v9, Lkik/a/d/a/a;

    if-eqz v9, :cond_4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->i:Lkik/a/e/i;

    invoke-virtual/range {p1 .. p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v7

    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->r:Landroid/view/View;

    const v3, 0x7f0e01c8

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lkik/android/widget/ProgressWidget;

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v2

    invoke-virtual {v9}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkik/android/net/a/b;

    if-eqz v6, :cond_3

    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    invoke-virtual {v6, v2}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View;)V

    iget-object v10, v5, Lcom/kik/view/adapters/bf$b;->t:Landroid/widget/ImageView;

    new-instance v2, Lcom/kik/view/adapters/bi;

    move-object/from16 v3, p0

    move-object/from16 v8, p1

    invoke-direct/range {v2 .. v8}, Lcom/kik/view/adapters/bi;-><init>(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Lcom/kik/view/adapters/bf$b;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Lkik/a/d/s;)V

    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    iget-boolean v2, v5, Lcom/kik/view/adapters/bf$b;->A:Z

    if-nez v2, :cond_4

    iget-object v12, v5, Lcom/kik/view/adapters/bf$b;->s:Landroid/widget/ImageView;

    invoke-virtual/range {p1 .. p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v8, p0

    move-object v10, v4

    move-object v11, v7

    move-object v13, v6

    invoke-direct/range {v8 .. v14}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/a/a;Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V

    const/4 v2, 0x1

    iput-boolean v2, v5, Lcom/kik/view/adapters/bf$b;->A:Z

    .line 275
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->v:Lcom/kik/view/adapters/af;

    move-object/from16 v0, p0

    invoke-interface {v2, v0}, Lcom/kik/view/adapters/af;->a(Lcom/kik/view/adapters/ag;)V

    .line 279
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->y:Ljava/util/HashMap;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/view/adapters/ak;

    iput-object v2, v5, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    .line 280
    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    if-nez v2, :cond_5

    .line 281
    new-instance v2, Lcom/kik/view/adapters/ak;

    invoke-virtual/range {p1 .. p1}, Lkik/a/d/s;->o()[B

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/bf;->e:Lcom/kik/android/a;

    invoke-direct {v2, v15, v3, v4, v6}, Lcom/kik/view/adapters/ak;-><init>(Lkik/a/d/a/a;[BLcom/kik/l/ab;Lcom/kik/android/a;)V

    iput-object v2, v5, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    .line 282
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->y:Ljava/util/HashMap;

    iget-object v3, v5, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    :cond_5
    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    new-instance v3, Lcom/kik/view/adapters/bo;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v5, v1, v15}, Lcom/kik/view/adapters/bo;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Lkik/a/d/a/a;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    invoke-virtual {v15}, Lkik/a/d/a/a;->y()Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v17, :cond_0

    sget-object v2, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    move-object/from16 v0, v16

    if-ne v0, v2, :cond_0

    .line 294
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    iget v3, v5, Lcom/kik/view/adapters/bf$b;->n:I

    new-instance v4, Lcom/kik/view/adapters/bp;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v4, v0, v5, v15, v1}, Lcom/kik/view/adapters/bp;-><init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/a/a;Lkik/a/d/s;)V

    invoke-virtual {v2, v3, v4}, Lkik/android/i/b;->a(ILkik/android/i/a;)V

    goto/16 :goto_0

    .line 248
    :pswitch_0
    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_6

    .line 249
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v5, v1}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    goto/16 :goto_2

    .line 252
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/kik/view/adapters/bf;->d()V

    goto/16 :goto_2

    .line 256
    :pswitch_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v5, v1}, Lcom/kik/view/adapters/bf;->b(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    goto/16 :goto_2

    .line 270
    :cond_7
    iget-object v2, v5, Lcom/kik/view/adapters/bf$b;->f:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    :cond_8
    move-object/from16 v16, v2

    goto/16 :goto_1

    .line 246
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 203
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V

    .line 204
    check-cast p2, Lcom/kik/view/adapters/bf$b;

    .line 206
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 207
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v2, Lkik/android/widget/c$a;->c:I

    invoke-virtual {v1, v2}, Lkik/android/widget/ClampedContentPreviewView;->a(I)V

    .line 208
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 209
    invoke-static {}, Lkik/android/widget/c;->a()I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 210
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v2, Lcom/kik/view/adapters/bf;->q:I

    sget v3, Lcom/kik/view/adapters/bf;->p:I

    invoke-virtual {v1, v2, v3}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    .line 212
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->v:Lkik/android/widget/RobotoTextView;

    sget v2, Lcom/kik/view/adapters/bf;->p:I

    invoke-virtual {v1, v4, v4, v2, v4}, Lkik/android/widget/RobotoTextView;->setPadding(IIII)V

    .line 221
    :goto_0
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->f:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 222
    return-void

    .line 215
    :cond_0
    invoke-static {}, Lkik/android/widget/c;->a()I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 216
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v2, Lcom/kik/view/adapters/bf;->p:I

    sget v3, Lcom/kik/view/adapters/bf;->q:I

    invoke-virtual {v1, v2, v3}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    .line 218
    iget-object v1, p2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    sget v2, Lcom/kik/view/adapters/bf;->u:I

    add-int/lit8 v2, v2, 0x5

    iget-object v3, p2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v3

    iget-object v4, p2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v4

    iget-object v5, p2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/ImageView;->setPadding(IIII)V

    goto :goto_0
.end method

.method protected final a(Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V
    .locals 11

    .prologue
    .line 725
    invoke-super {p0, p1, p2, p3, p4}, Lcom/kik/view/adapters/s;->a(Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V

    .line 726
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->i:Lkik/a/e/i;

    invoke-virtual {p4}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v3

    .line 727
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p4, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 728
    if-nez v1, :cond_1

    .line 767
    :cond_0
    :goto_0
    return-void

    .line 734
    :cond_1
    iget-object v4, p3, Lcom/kik/view/adapters/n$a;->s:Landroid/widget/ImageView;

    invoke-virtual {p4}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/a/a;Lkik/android/net/a/b;Lkik/a/d/f;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Ljava/lang/String;)V

    .line 736
    invoke-virtual {p0, v1}, Lcom/kik/view/adapters/bf;->g(Lkik/a/d/a/a;)V

    .line 737
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    .line 738
    new-instance v4, Lcom/kik/view/adapters/bj;

    move-object v5, p0

    move-object v6, p1

    move-object v7, p3

    move-object v8, p2

    move-object v9, v3

    move-object v10, p4

    invoke-direct/range {v4 .. v10}, Lcom/kik/view/adapters/bj;-><init>(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Lcom/kik/view/adapters/n$a;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Lkik/a/d/s;)V

    invoke-virtual {p2, v4}, Lkik/android/widget/ProgressWidget;->b(Landroid/view/View$OnClickListener;)V

    .line 749
    invoke-virtual {p2}, Lkik/android/widget/ProgressWidget;->a()V

    .line 751
    invoke-virtual {p4}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v1, -0x64

    if-ne v0, v1, :cond_2

    .line 752
    iget-object v0, p3, Lcom/kik/view/adapters/n$a;->s:Landroid/widget/ImageView;

    const v1, 0x7f02022e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 754
    invoke-virtual {p4}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x65

    iget-object v2, p0, Lcom/kik/view/adapters/bf;->g:Lkik/a/e/v;

    invoke-virtual {v3, v0, v1, v2}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 758
    :cond_2
    invoke-virtual {p4}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 759
    invoke-virtual {p1}, Lkik/android/net/a/b;->l()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/bk;

    invoke-direct {v1, p0, p4}, Lcom/kik/view/adapters/bk;-><init>(Lcom/kik/view/adapters/bf;Lkik/a/d/s;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method protected a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 155
    instance-of v0, p1, Lcom/kik/view/adapters/bf$b;

    return v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 702
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    invoke-virtual {v0, p1}, Lkik/android/i/b;->a(I)V

    .line 703
    return-void
.end method

.method protected final b(Lcom/kik/view/adapters/n$a;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 562
    invoke-super {p0, p1}, Lcom/kik/view/adapters/s;->b(Lcom/kik/view/adapters/n$a;)V

    .line 563
    check-cast p1, Lcom/kik/view/adapters/bf$b;

    .line 564
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->g:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    check-cast p1, Lcom/kik/view/adapters/bf$b;

    iget-object v1, p1, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 565
    iput-boolean v3, p0, Lcom/kik/view/adapters/bf;->z:Z

    .line 566
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 708
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    invoke-virtual {v0}, Lkik/android/i/b;->a()V

    .line 709
    return-void
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 714
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    iget v0, v0, Lcom/kik/view/adapters/bf$b;->n:I

    if-ne v0, p1, :cond_0

    .line 715
    invoke-direct {p0}, Lcom/kik/view/adapters/bf;->d()V

    .line 716
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    .line 718
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/bf;->w:Lkik/android/i/b;

    invoke-virtual {v0, p1}, Lkik/android/i/b;->c(I)V

    .line 719
    return-void
.end method

.method protected final d(Lcom/kik/view/adapters/n$a;)Lkik/android/widget/ProgressWheel;
    .locals 1

    .prologue
    .line 110
    check-cast p1, Lcom/kik/view/adapters/bf$b;

    iget-object v0, p1, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    return-object v0
.end method

.method protected final d(Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 809
    invoke-super {p0, p1}, Lcom/kik/view/adapters/s;->d(Lkik/a/d/a/a;)V

    .line 810
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/bf;->g(Lkik/a/d/a/a;)V

    .line 811
    return-void
.end method

.method public final g_()V
    .locals 0

    .prologue
    .line 188
    invoke-direct {p0}, Lcom/kik/view/adapters/bf;->d()V

    .line 189
    return-void
.end method
