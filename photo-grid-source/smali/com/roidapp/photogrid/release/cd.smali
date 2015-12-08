.class public final Lcom/roidapp/photogrid/release/cd;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:I

.field private c:Ljava/lang/Integer;

.field private d:Z

.field private e:Z

.field private f:I

.field private g:Landroid/widget/HorizontalScrollView;

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 20
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 23
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    .line 25
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/cd;->d:Z

    .line 26
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/cd;->e:Z

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/cd;->f:I

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cd;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cd;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .prologue
    .line 20
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cd;->c:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cd;)I
    .locals 1

    .prologue
    .line 20
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/cd;)Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cd;->d:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/cd;)Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cd;->e:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/cd;)I
    .locals 1

    .prologue
    .line 20
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->f:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cd;->g:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/cd;)I
    .locals 1

    .prologue
    .line 20
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->i:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/cd;)I
    .locals 1

    .prologue
    .line 20
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->h:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/cd;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cd;->c:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->f:I

    return v0
.end method

.method public final a(ZZI)V
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/cd;->d:Z

    .line 48
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/cd;->e:Z

    .line 49
    iput p3, p0, Lcom/roidapp/photogrid/release/cd;->f:I

    .line 50
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 34
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cd;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 35
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 36
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 57
    const v0, 0x7f0300a9

    invoke-virtual {p1, v0, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 59
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aw()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    .line 60
    iget v0, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    if-nez v0, :cond_0

    .line 61
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 72
    :cond_0
    :goto_0
    :pswitch_0
    const v0, 0x7f0d0287

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cd;->g:Landroid/widget/HorizontalScrollView;

    .line 73
    const v0, 0x7f0d0289

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 74
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cd;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900d1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/photogrid/release/cd;->h:I

    .line 75
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/cd;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/photogrid/release/cd;->i:I

    .line 77
    const v1, 0x7f0d0286

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 78
    new-instance v2, Lcom/roidapp/photogrid/release/ce;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ce;-><init>(Lcom/roidapp/photogrid/release/cd;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/baselib/c/p;->g:[[I

    iget v2, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    aget-object v4, v1, v2

    .line 104
    const/4 v1, 0x0

    move v2, v1

    :goto_1
    array-length v1, v4

    if-ge v2, v1, :cond_1

    .line 105
    aget v5, v4, v2

    .line 106
    const v1, 0x7f030128

    invoke-virtual {p1, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 107
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v7, p0, Lcom/roidapp/photogrid/release/cd;->h:I

    iget v8, p0, Lcom/roidapp/photogrid/release/cd;->h:I

    invoke-direct {v1, v7, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    invoke-virtual {v6, v5}, Landroid/view/View;->setId(I)V

    .line 109
    const v1, 0x7f0d0494

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 111
    iget-object v7, p0, Lcom/roidapp/photogrid/release/cd;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 112
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 115
    new-instance v1, Lcom/roidapp/photogrid/release/cf;

    invoke-direct {v1, p0, v0, v6, v5}, Lcom/roidapp/photogrid/release/cf;-><init>(Lcom/roidapp/photogrid/release/cd;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 65
    :pswitch_1
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/cd;->b:I

    goto/16 :goto_0

    .line 165
    :cond_1
    return-object v3

    .line 61
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
