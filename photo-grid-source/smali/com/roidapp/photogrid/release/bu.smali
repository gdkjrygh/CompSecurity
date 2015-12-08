.class public final Lcom/roidapp/photogrid/release/bu;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:Ljava/lang/Integer;

.field private f:Landroid/widget/HorizontalScrollView;

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 19
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 22
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/bu;->b:Z

    .line 23
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/bu;->c:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bu;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/bu;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bu;->e:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/bu;)Z
    .locals 1

    .prologue
    .line 19
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/bu;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/bu;)Z
    .locals 1

    .prologue
    .line 19
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/bu;->c:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/bu;)I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/roidapp/photogrid/release/bu;->d:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bu;->f:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/bu;)I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/roidapp/photogrid/release/bu;->h:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/bu;)I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/bu;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bu;->e:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final a(ZZI)V
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/bu;->b:Z

    .line 36
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/bu;->c:Z

    .line 37
    iput p3, p0, Lcom/roidapp/photogrid/release/bu;->d:I

    .line 38
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 42
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bu;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 43
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 44
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .prologue
    .line 47
    const v0, 0x7f0300a7

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 48
    new-instance v0, Lcom/roidapp/photogrid/release/bv;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/bv;-><init>(Lcom/roidapp/photogrid/release/bu;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    const v0, 0x7f0d0285

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 56
    new-instance v1, Lcom/roidapp/photogrid/release/bw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/bw;-><init>(Lcom/roidapp/photogrid/release/bu;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    const v0, 0x7f0d0287

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bu;->f:Landroid/widget/HorizontalScrollView;

    .line 69
    const v0, 0x7f0d0288

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 70
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/bu;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900d1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    .line 71
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/bu;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/bu;->h:I

    .line 72
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v0

    iget-object v8, v0, Lcom/roidapp/baselib/c/p;->i:[I

    .line 73
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    array-length v0, v8

    if-ge v6, v0, :cond_0

    .line 74
    aget v5, v8, v6

    .line 75
    add-int/lit16 v4, v6, 0x2710

    .line 76
    const v0, 0x7f030129

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 77
    const v0, 0x7f0d0494

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 78
    const v1, 0x7f0d0493

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 79
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 80
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    iget v10, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    div-int/lit8 v10, v10, 0x2

    iget v11, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    invoke-direct {v9, v10, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    iget v10, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    div-int/lit8 v10, v10, 0x2

    iget v11, p0, Lcom/roidapp/photogrid/release/bu;->g:I

    invoke-direct {v9, v10, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 84
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/release/bx;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/bx;-><init>(Lcom/roidapp/photogrid/release/bu;Landroid/view/ViewGroup;Landroid/view/View;II)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 132
    :cond_0
    return-object v7
.end method
