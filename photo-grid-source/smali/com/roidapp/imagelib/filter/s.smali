.class public Lcom/roidapp/imagelib/filter/s;
.super Lcom/roidapp/imagelib/filter/n;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/filter/ad;
.implements Lcom/roidapp/imagelib/filter/ag;
.implements Lcom/roidapp/imagelib/filter/bf;


# static fields
.field public static final f:Ljava/lang/String;


# instance fields
.field protected g:Lcom/roidapp/imagelib/filter/ai;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/view/ViewGroup;

.field private k:Lcom/roidapp/imagelib/filter/az;

.field private l:Lcom/roidapp/imagelib/filter/bg;

.field private m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field private n:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private o:Lcom/roidapp/imagelib/filter/y;

.field private p:Z

.field private q:Landroid/os/Handler;

.field private r:Lcom/roidapp/imagelib/b/b;

.field private s:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/roidapp/imagelib/filter/s;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/n;-><init>()V

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/s;->p:Z

    .line 47
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->g:Lcom/roidapp/imagelib/filter/ai;

    .line 222
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/filter/u;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/u;-><init>(Lcom/roidapp/imagelib/filter/s;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->q:Landroid/os/Handler;

    .line 263
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    .line 396
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/s;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->q:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/filter/s;)Lcom/roidapp/imagelib/filter/az;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/filter/s;)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/filter/s;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/s;->i()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/imagelib/filter/s;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/s;->p:Z

    return v0
.end method

.method private i()V
    .locals 4

    .prologue
    .line 282
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->o:Lcom/roidapp/imagelib/filter/y;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 284
    :cond_0
    :goto_0
    return-void

    .line 283
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->o:Lcom/roidapp/imagelib/filter/y;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/az;->B()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/bg;->a()I

    move-result v3

    invoke-interface {v0, v1, v2, v3}, Lcom/roidapp/imagelib/filter/y;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/b/b;I)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)Lcom/roidapp/imagelib/filter/ax;
    .locals 1

    .prologue
    .line 345
    new-instance v0, Lcom/roidapp/imagelib/filter/x;

    invoke-direct {v0, p0, p1, p2}, Lcom/roidapp/imagelib/filter/x;-><init>(Lcom/roidapp/imagelib/filter/s;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    return-object v0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/ai;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/s;->g:Lcom/roidapp/imagelib/filter/ai;

    .line 73
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 3

    .prologue
    .line 375
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->b()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    .line 377
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 378
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 379
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 380
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 340
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/s;->p:Z

    .line 341
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->a(I)V

    .line 78
    return-void
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->b(I)V

    .line 83
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    :goto_0
    return-void

    .line 98
    :cond_0
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    .line 99
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/s;->i()V

    goto :goto_0
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->c(I)V

    .line 88
    return-void
.end method

.method public final e()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 306
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 317
    :goto_0
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 308
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 309
    sget v1, Lcom/roidapp/imagelib/f;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 310
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/e;->h:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 311
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 312
    const/16 v1, 0x50

    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 313
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 315
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 316
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final e(I)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->d(I)V

    .line 93
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 321
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    .line 322
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/s;->i()V

    .line 323
    return-void
.end method

.method public final g()V
    .locals 0

    .prologue
    .line 335
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/s;->i()V

    .line 336
    return-void
.end method

.method public final h()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 417
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 427
    :cond_0
    :goto_0
    return v0

    .line 418
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 419
    if-eqz v1, :cond_0

    .line 420
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    const-string v2, "imageFilterBaseView"

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    const-string v2, "imageFilterColorView"

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    .line 423
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    const-string v2, "imageFilterListView"

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 424
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->e()V

    .line 425
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 116
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onAttach(Landroid/app/Activity;)V

    .line 117
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/y;

    if-eqz v0, :cond_0

    .line 118
    check-cast p1, Lcom/roidapp/imagelib/filter/y;

    iput-object p1, p0, Lcom/roidapp/imagelib/filter/s;->o:Lcom/roidapp/imagelib/filter/y;

    return-void

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet FilterProcessListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 247
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 248
    sget v1, Lcom/roidapp/imagelib/g;->G:I

    if-ne v0, v1, :cond_1

    .line 249
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->h:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 250
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->i:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 251
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->e()V

    .line 261
    :cond_0
    :goto_0
    return-void

    .line 252
    :cond_1
    sget v1, Lcom/roidapp/imagelib/g;->I:I

    if-ne v0, v1, :cond_2

    .line 253
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->i:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 254
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->h:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 3266
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3267
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3268
    new-instance v0, Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;-><init>(Landroid/content/Context;)V

    .line 3269
    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Landroid/support/v4/app/Fragment;)V

    .line 3270
    const-string v1, "imageFilterColorView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->setTag(Ljava/lang/Object;)V

    .line 3271
    new-instance v1, Lcom/roidapp/imagelib/filter/w;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/w;-><init>(Lcom/roidapp/imagelib/filter/s;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ah;)V

    .line 3277
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->g:Lcom/roidapp/imagelib/filter/ai;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/ai;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 3278
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 256
    :cond_2
    sget v1, Lcom/roidapp/imagelib/g;->ah:I

    if-ne v0, v1, :cond_0

    .line 257
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->o:Lcom/roidapp/imagelib/filter/y;

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->o:Lcom/roidapp/imagelib/filter/y;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/y;->a()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/16 v4, 0x64

    .line 126
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onCreate(Landroid/os/Bundle;)V

    .line 129
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 130
    if-eqz v1, :cond_1

    .line 131
    const-string v0, "globalGroupInfo"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 132
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 134
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 1041
    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 134
    if-nez v0, :cond_0

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 138
    :cond_0
    if-eqz p1, :cond_2

    .line 139
    const-string v0, "globalFilterInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->n:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 143
    :goto_0
    const-string v0, "global_image_property_lightness"

    const/16 v2, 0x96

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 144
    const-string v2, "global_image_property_contast"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 145
    const-string v3, "global_image_property_contast"

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 146
    const-string v4, "global_image_property_hue"

    const/16 v5, 0xb4

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 147
    new-instance v5, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v5, v0, v2, v3, v4}, Lcom/roidapp/imagelib/b/b;-><init>(IIII)V

    iput-object v5, p0, Lcom/roidapp/imagelib/filter/s;->r:Lcom/roidapp/imagelib/b/b;

    .line 148
    const-string v0, "current_image_path"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->a:Ljava/lang/String;

    .line 150
    :cond_1
    return-void

    .line 141
    :cond_2
    const-string v0, "globalFilterInfo"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->n:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 154
    sget v0, Lcom/roidapp/imagelib/h;->i:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 155
    sget v0, Lcom/roidapp/imagelib/g;->G:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->h:Landroid/widget/TextView;

    .line 156
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->h:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 158
    sget v0, Lcom/roidapp/imagelib/g;->I:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->i:Landroid/widget/TextView;

    .line 159
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    sget v0, Lcom/roidapp/imagelib/g;->ah:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 162
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    sget v0, Lcom/roidapp/imagelib/g;->k:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    .line 164
    new-instance v0, Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2, p0, v3}, Lcom/roidapp/imagelib/filter/az;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/bf;Z)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    .line 166
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    const-string v2, "imageFilterBaseView"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/az;->setTag(Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/az;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ab;

    .line 169
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/filter/ab;->a(J)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 170
    if-eqz v0, :cond_0

    .line 171
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 172
    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 176
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2, p0}, Lcom/roidapp/imagelib/filter/bg;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/ad;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    .line 177
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bg;->a(Z)V

    .line 178
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    const-string v2, "imageFilterListView"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bg;->setTag(Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/az;->A()Lcom/roidapp/imagelib/filter/be;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/be;)V

    .line 180
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v0, :cond_3

    .line 181
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->e()V

    .line 184
    :goto_0
    new-instance v0, Lcom/roidapp/imagelib/filter/a;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/roidapp/imagelib/filter/a;-><init>(Landroid/content/Context;)V

    .line 185
    new-instance v2, Lcom/roidapp/imagelib/filter/t;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/filter/t;-><init>(Lcom/roidapp/imagelib/filter/s;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/a;->a(Lcom/roidapp/imagelib/filter/c;)V

    .line 192
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/a;->a()V

    .line 194
    new-instance v0, Lcom/roidapp/imagelib/filter/z;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/roidapp/imagelib/filter/z;-><init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;)V

    .line 195
    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/z;->addView(Landroid/view/View;)V

    .line 196
    return-object v0

    .line 183
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->m:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/s;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 384
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onDestroy()V

    .line 387
    return-void
.end method

.method public onDestroyView()V
    .locals 0

    .prologue
    .line 391
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onDestroyView()V

    .line 393
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->b()V

    .line 394
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 206
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onResume()V

    .line 2200
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_1

    .line 1211
    :goto_0
    if-eqz v0, :cond_0

    .line 1212
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->l:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bg;->b()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 1213
    if-eqz v0, :cond_0

    .line 1214
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_0

    .line 1215
    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 1216
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 3041
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 1216
    if-nez v0, :cond_0

    .line 1217
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/s;->k:Lcom/roidapp/imagelib/filter/az;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 1218
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/s;->e()V

    .line 208
    :cond_0
    return-void

    .line 2201
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/bg;

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 104
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 105
    const-string v0, "globalFilterInfo"

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/s;->s:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 106
    return-void
.end method
