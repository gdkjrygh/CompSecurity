.class public Lcom/qihoo/security/widget/RevealRippleLayout;
.super Landroid/widget/LinearLayout;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/RevealRippleLayout$b;,
        Lcom/qihoo/security/widget/RevealRippleLayout$a;
    }
.end annotation


# instance fields
.field a:Landroid/graphics/Rect;

.field b:Landroid/graphics/Bitmap;

.field c:Landroid/graphics/Canvas;

.field d:Z

.field e:F

.field f:I

.field g:F

.field h:F

.field i:F

.field j:F

.field k:F

.field l:F

.field m:I

.field n:Landroid/graphics/Paint;

.field o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

.field private p:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/high16 v1, -0x40800000    # -1.0f

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 22
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    .line 23
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    .line 24
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->b:Landroid/graphics/Bitmap;

    .line 25
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->c:Landroid/graphics/Canvas;

    .line 29
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    .line 31
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    .line 32
    const/high16 v0, -0x3d380000    # -100.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    .line 34
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 35
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->a()V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/high16 v1, -0x40800000    # -1.0f

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    .line 23
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    .line 24
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->b:Landroid/graphics/Bitmap;

    .line 25
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->c:Landroid/graphics/Canvas;

    .line 29
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    .line 31
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    .line 32
    const/high16 v0, -0x3d380000    # -100.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    .line 34
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 35
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    .line 49
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->a()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/high16 v1, -0x40800000    # -1.0f

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    .line 23
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    .line 24
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->b:Landroid/graphics/Bitmap;

    .line 25
    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->c:Landroid/graphics/Canvas;

    .line 29
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    .line 31
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    .line 32
    const/high16 v0, -0x3d380000    # -100.0f

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    .line 34
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 35
    iput v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    .line 44
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->a()V

    .line 45
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 58
    invoke-virtual {p0, v3}, Lcom/qihoo/security/widget/RevealRippleLayout;->setWillNotDraw(Z)V

    .line 59
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    .line 60
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    .line 61
    return-void
.end method


# virtual methods
.method a(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/high16 v5, -0x40800000    # -1.0f

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->n:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    .line 141
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->n:Landroid/graphics/Paint;

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->n:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->n:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 145
    :cond_0
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 146
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    iget v2, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    iget-object v3, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 148
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1

    .line 149
    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->d:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    :goto_0
    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 151
    :cond_1
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    cmpl-float v0, v0, v1

    if-gez v0, :cond_2

    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_7

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    if-eqz v0, :cond_3

    .line 153
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_6

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    invoke-interface {v0}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a()V

    .line 159
    :cond_3
    :goto_1
    iput v5, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    .line 160
    iput v5, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 170
    :cond_4
    :goto_2
    return-void

    .line 149
    :cond_5
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    neg-float v0, v0

    goto :goto_0

    .line 156
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    invoke-interface {v0}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->b()V

    goto :goto_1

    .line 162
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    cmpl-float v0, v0, v4

    if-eqz v0, :cond_4

    .line 163
    const/high16 v1, 0x42c80000    # 100.0f

    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->d:Z

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    :goto_3
    mul-float/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    .line 164
    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    if-eq v1, v0, :cond_4

    .line 165
    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    iget v1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->m:I

    iget-boolean v2, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->d:Z

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a(IZ)Z

    goto :goto_2

    .line 163
    :cond_8
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    iget v2, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    sub-float/2addr v0, v2

    goto :goto_3
.end method

.method public a(Z)V
    .locals 2

    .prologue
    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->d:Z

    .line 81
    if-eqz p1, :cond_0

    .line 82
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 87
    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    .line 88
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->h:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 89
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->invalidate()V

    .line 90
    return-void

    .line 84
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    goto :goto_0
.end method

.method public b(Z)V
    .locals 2

    .prologue
    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->d:Z

    .line 94
    if-eqz p1, :cond_0

    .line 95
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    .line 100
    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    .line 101
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->h:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 102
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->invalidate()V

    .line 103
    return-void

    .line 97
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->k:F

    goto :goto_0
.end method

.method public getCallback()Lcom/qihoo/security/widget/RevealRippleLayout$a;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    return-object v0
.end method

.method public getRippleColor()I
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 107
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 108
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 114
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    const/high16 v1, -0x3ee00000    # -10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 115
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    .line 116
    iget v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->h:F

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->p:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->a:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 122
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->l:F

    .line 123
    invoke-virtual {p0, p1}, Lcom/qihoo/security/widget/RevealRippleLayout;->a(Landroid/graphics/Canvas;)V

    .line 124
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealRippleLayout;->invalidate()V

    .line 126
    :cond_1
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 1

    .prologue
    const/high16 v0, -0x40800000    # -1.0f

    .line 134
    if-nez p1, :cond_0

    .line 135
    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->i:F

    .line 136
    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->j:F

    .line 138
    :cond_0
    return-void
.end method

.method public setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->o:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    .line 69
    return-void
.end method

.method public setRippleColor(I)V
    .locals 0

    .prologue
    .line 177
    iput p1, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->f:I

    .line 178
    return-void
.end method

.method public setRippleSpeed(I)V
    .locals 1

    .prologue
    .line 129
    int-to-float v0, p1

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->e:F

    .line 130
    return-void
.end method

.method public setxRippleOrigin(Ljava/lang/Float;)V
    .locals 1

    .prologue
    .line 181
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->g:F

    .line 182
    return-void
.end method

.method public setyRippleOrigin(Ljava/lang/Float;)V
    .locals 1

    .prologue
    .line 185
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealRippleLayout;->h:F

    .line 186
    return-void
.end method
