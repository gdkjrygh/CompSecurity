.class public Lcom/roidapp/photogrid/video/ScrollImageViewEx;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field a:I

.field b:I

.field c:F

.field d:Lcom/roidapp/baselib/hlistview/ad;

.field private e:Lcom/roidapp/photogrid/release/hs;

.field private f:Lcom/roidapp/photogrid/release/hr;

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 17
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 32
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 33
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    .line 35
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    .line 36
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->e:Lcom/roidapp/photogrid/release/hs;

    .line 125
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->g:I

    .line 18
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 33
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    .line 35
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    .line 36
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->e:Lcom/roidapp/photogrid/release/hs;

    .line 125
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->g:I

    .line 23
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Landroid/content/Context;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 33
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    .line 35
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    .line 36
    iput-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->e:Lcom/roidapp/photogrid/release/hs;

    .line 125
    iput v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->g:I

    .line 29
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)Lcom/roidapp/photogrid/release/hr;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->f:Lcom/roidapp/photogrid/release/hr;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/n;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/n;-><init>(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 84
    new-instance v0, Lcom/roidapp/baselib/hlistview/ad;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/hlistview/ad;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    .line 85
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->g:I

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    return v0
.end method

.method public final a(F)I
    .locals 2

    .prologue
    .line 115
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    if-nez v0, :cond_0

    .line 116
    const/4 v0, 0x0

    .line 117
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    int-to-float v0, v0

    add-float/2addr v0, p1

    const/high16 v1, 0x44800000    # 1024.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    goto :goto_0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 92
    iput p1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 93
    return-void
.end method

.method public final a(IZ)V
    .locals 6

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    if-nez v0, :cond_0

    .line 158
    :goto_0
    return-void

    .line 129
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    if-nez v0, :cond_1

    .line 130
    iput p1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->g:I

    goto :goto_0

    .line 135
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    mul-int/2addr v0, p1

    add-int/lit16 v0, v0, 0x200

    shr-int/lit8 v0, v0, 0xa

    iget v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    sub-int/2addr v0, v1

    .line 136
    iget v1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    mul-int/2addr v1, p1

    int-to-float v1, v1

    const/high16 v2, 0x44800000    # 1024.0f

    div-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 137
    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    neg-int v2, v2

    if-ge v0, v2, :cond_3

    .line 138
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    neg-int v0, v0

    .line 143
    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v2}, Lcom/roidapp/baselib/hlistview/ad;->b()V

    .line 145
    if-eqz p2, :cond_4

    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    sub-float v2, v1, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_4

    .line 146
    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    .line 150
    iget-object v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    iget v3, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    float-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v3, v4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getY()F

    move-result v4

    float-to-int v4, v4

    iget v5, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    sub-float/2addr v1, v5

    float-to-int v1, v1

    const/16 v5, 0x96

    invoke-virtual {v2, v3, v4, v1, v5}, Lcom/roidapp/baselib/hlistview/ad;->a(IIII)V

    .line 151
    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    goto :goto_0

    .line 139
    :cond_3
    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    iget v3, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    sub-int/2addr v2, v3

    if-le v0, v2, :cond_2

    .line 140
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    sub-int/2addr v0, v2

    goto :goto_1

    .line 154
    :cond_4
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/photogrid/release/hr;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->f:Lcom/roidapp/photogrid/release/hr;

    .line 90
    return-void
.end method

.method public computeScroll()V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->d:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->c()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    .line 165
    :cond_0
    return-void
.end method

.method public getY()F
    .locals 2

    .prologue
    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 58
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    int-to-float v0, v0

    .line 60
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->getY()F

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 107
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 109
    iget v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    if-nez v0, :cond_0

    .line 110
    sub-int v0, p4, p2

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 112
    :cond_0
    return-void
.end method

.method public setX(F)V
    .locals 2

    .prologue
    .line 44
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 46
    float-to-int v1, p1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 47
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    :goto_0
    iput p1, p0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->c:F

    .line 52
    return-void

    .line 49
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setX(F)V

    goto :goto_0
.end method
