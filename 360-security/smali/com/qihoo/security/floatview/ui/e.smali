.class public Lcom/qihoo/security/floatview/ui/e;
.super Landroid/widget/LinearLayout;
.source "360Security"


# instance fields
.field a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

.field b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

.field c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

.field d:Ljava/util/Random;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->d:Ljava/util/Random;

    .line 45
    invoke-direct {p0, p1}, Lcom/qihoo/security/floatview/ui/e;->a(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 49
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030051

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 51
    const v0, 0x7f0b011c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->f:Landroid/widget/ImageView;

    .line 52
    const v0, 0x7f0b011b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    .line 53
    const v0, 0x7f0b011d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    .line 54
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/e;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->e()V

    return-void
.end method

.method private a([FLandroid/graphics/drawable/Drawable;)V
    .locals 9

    .prologue
    .line 139
    array-length v0, p1

    const/4 v1, 0x7

    if-ge v0, v1, :cond_1

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    const/4 v1, 0x0

    aget v2, p1, v1

    const/4 v1, 0x1

    aget v3, p1, v1

    const/4 v1, 0x2

    aget v4, p1, v1

    const/4 v1, 0x3

    aget v5, p1, v1

    const/4 v1, 0x4

    aget v1, p1, v1

    float-to-int v6, v1

    const/4 v1, 0x5

    aget v7, p1, v1

    const/4 v1, 0x6

    aget v1, p1, v1

    float-to-int v8, v1

    move-object v1, p2

    invoke-virtual/range {v0 .. v8}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a(Landroid/graphics/drawable/Drawable;FFFFIFI)Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->getAnimator()Lcom/nineoldandroids/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/a;->a()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/ui/e;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/ui/e;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 66
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    .line 69
    new-instance v0, Lcom/qihoo/security/floatview/ui/e$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/ui/e$1;-><init>(Lcom/qihoo/security/floatview/ui/e;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/floatview/ui/e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 95
    return-void
.end method

.method private e()V
    .locals 15

    .prologue
    const/4 v14, 0x4

    const/4 v13, 0x3

    const/4 v12, 0x2

    const/4 v11, 0x1

    const/4 v0, 0x0

    .line 119
    const/16 v1, 0x4e20

    .line 122
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    .line 123
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    .line 124
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 125
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f020128

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 129
    const/4 v6, 0x7

    new-array v6, v6, [[F

    const/4 v7, 0x7

    new-array v7, v7, [F

    aput v2, v7, v0

    aput v3, v7, v11

    const/high16 v8, 0x42700000    # 60.0f

    mul-float/2addr v8, v4

    aput v8, v7, v12

    const/high16 v8, 0x41f00000    # 30.0f

    aput v8, v7, v13

    const/high16 v8, 0x42d20000    # 105.0f

    aput v8, v7, v14

    const/4 v8, 0x5

    const v9, 0x3e4ccccd    # 0.2f

    aput v9, v7, v8

    const/4 v8, 0x6

    int-to-float v9, v1

    aput v9, v7, v8

    aput-object v7, v6, v0

    const/4 v7, 0x7

    new-array v7, v7, [F

    aput v2, v7, v0

    aput v3, v7, v11

    const/high16 v8, 0x433e0000    # 190.0f

    mul-float/2addr v8, v4

    aput v8, v7, v12

    const/high16 v8, 0x43a50000    # 330.0f

    aput v8, v7, v13

    const/high16 v8, 0x42d20000    # 105.0f

    aput v8, v7, v14

    const/4 v8, 0x5

    const/high16 v9, 0x3f000000    # 0.5f

    aput v9, v7, v8

    const/4 v8, 0x6

    int-to-float v9, v1

    aput v9, v7, v8

    aput-object v7, v6, v11

    const/4 v7, 0x7

    new-array v7, v7, [F

    aput v2, v7, v0

    aput v3, v7, v11

    const/high16 v8, 0x43480000    # 200.0f

    mul-float/2addr v8, v4

    aput v8, v7, v12

    const/high16 v8, 0x43910000    # 290.0f

    aput v8, v7, v13

    const/high16 v8, 0x42d20000    # 105.0f

    aput v8, v7, v14

    const/4 v8, 0x5

    const v9, 0x3ea8f5c3    # 0.33f

    aput v9, v7, v8

    const/4 v8, 0x6

    int-to-float v9, v1

    aput v9, v7, v8

    aput-object v7, v6, v12

    const/4 v7, 0x7

    new-array v7, v7, [F

    aput v2, v7, v0

    aput v3, v7, v11

    const/high16 v8, 0x42c80000    # 100.0f

    mul-float/2addr v8, v4

    aput v8, v7, v12

    const/high16 v8, 0x437f0000    # 255.0f

    aput v8, v7, v13

    const/high16 v8, 0x42d20000    # 105.0f

    aput v8, v7, v14

    const/4 v8, 0x5

    const/high16 v9, 0x3f800000    # 1.0f

    aput v9, v7, v8

    const/4 v8, 0x6

    int-to-float v9, v1

    aput v9, v7, v8

    aput-object v7, v6, v13

    const/4 v7, 0x7

    new-array v7, v7, [F

    aput v2, v7, v0

    aput v3, v7, v11

    const/high16 v8, 0x43700000    # 240.0f

    mul-float/2addr v8, v4

    aput v8, v7, v12

    const/high16 v8, 0x43610000    # 225.0f

    aput v8, v7, v13

    const/high16 v8, 0x431b0000    # 155.0f

    aput v8, v7, v14

    const/4 v8, 0x5

    const v9, 0x3ea8f5c3    # 0.33f

    aput v9, v7, v8

    const/4 v8, 0x6

    int-to-float v9, v1

    aput v9, v7, v8

    aput-object v7, v6, v14

    const/4 v7, 0x5

    const/4 v8, 0x7

    new-array v8, v8, [F

    aput v2, v8, v0

    aput v3, v8, v11

    const/high16 v9, 0x43200000    # 160.0f

    mul-float/2addr v9, v4

    aput v9, v8, v12

    const/high16 v9, 0x43160000    # 150.0f

    aput v9, v8, v13

    const/high16 v9, 0x42a00000    # 80.0f

    aput v9, v8, v14

    const/4 v9, 0x5

    const v10, 0x3ecccccd    # 0.4f

    aput v10, v8, v9

    const/4 v9, 0x6

    int-to-float v10, v1

    aput v10, v8, v9

    aput-object v8, v6, v7

    const/4 v7, 0x6

    const/4 v8, 0x7

    new-array v8, v8, [F

    aput v2, v8, v0

    aput v3, v8, v11

    const/high16 v2, 0x43700000    # 240.0f

    mul-float/2addr v2, v4

    aput v2, v8, v12

    const/high16 v2, 0x42700000    # 60.0f

    aput v2, v8, v13

    const/high16 v2, 0x425c0000    # 55.0f

    aput v2, v8, v14

    const/4 v2, 0x5

    const v3, 0x3f19999a    # 0.6f

    aput v3, v8, v2

    const/4 v2, 0x6

    int-to-float v1, v1

    aput v1, v8, v2

    aput-object v8, v6, v7

    .line 133
    :goto_0
    array-length v1, v6

    if-ge v0, v1, :cond_0

    .line 134
    aget-object v1, v6, v0

    invoke-direct {p0, v1, v5}, Lcom/qihoo/security/floatview/ui/e;->a([FLandroid/graphics/drawable/Drawable;)V

    .line 133
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 136
    :cond_0
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->b()V

    .line 186
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    .line 189
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 192
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a()V

    .line 195
    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 198
    return-void
.end method

.method private getDuration()I
    .locals 6

    .prologue
    .line 110
    const-wide v0, 0x3fe6666666666666L    # 0.7

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/e;->d:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private getStarY()F
    .locals 6

    .prologue
    .line 106
    const-wide v0, -0x402ccccccccccccdL    # -0.3

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/e;->d:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x442f0000    # 700.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method private getStartSize()I
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->d:Ljava/util/Random;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private getStartX()F
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->d:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 201
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->b()V

    .line 205
    :cond_0
    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 207
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->f()V

    .line 58
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->g()V

    .line 59
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->h()V

    .line 60
    return-void
.end method

.method public a(FFLcom/qihoo/security/ui/opti/sysclear/rocket/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 173
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->d()V

    .line 174
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->setBounds(IIII)V

    .line 176
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->f:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 178
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a(FFZLandroid/view/View;)V

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 180
    return-void
.end method

.method public a(Z)V
    .locals 4

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 214
    if-eqz p1, :cond_1

    .line 215
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->c()V

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 241
    :cond_0
    :goto_0
    return-void

    .line 219
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 220
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 221
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 222
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 223
    new-instance v1, Lcom/qihoo/security/floatview/ui/e$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/e$2;-><init>(Lcom/qihoo/security/floatview/ui/e;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 237
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->clearAnimation()V

    .line 238
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public b()V
    .locals 12

    .prologue
    const/4 v0, 0x0

    .line 152
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    if-eqz v1, :cond_1

    .line 153
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getWidth()I

    move-result v1

    int-to-float v7, v1

    .line 154
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getHeight()I

    move-result v1

    int-to-float v8, v1

    .line 155
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->getStartSize()I

    move-result v11

    .line 156
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/e;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 157
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move v10, v0

    .line 159
    :goto_0
    if-ge v10, v11, :cond_1

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/d;

    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->getStartX()F

    move-result v2

    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->getStarY()F

    move-result v3

    const/high16 v4, 0x42b40000    # 90.0f

    const/16 v5, 0xff

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/e;->getDuration()I

    move-result v9

    invoke-virtual/range {v0 .. v9}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a(Landroid/graphics/drawable/Drawable;FFFIFFFI)Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->start()V

    .line 159
    :cond_0
    add-int/lit8 v0, v10, 0x1

    move v10, v0

    goto :goto_0

    .line 167
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 4

    .prologue
    .line 247
    if-eqz p1, :cond_1

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 249
    new-instance v0, Lcom/qihoo/security/floatview/ui/e$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/ui/e$3;-><init>(Lcom/qihoo/security/floatview/ui/e;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/floatview/ui/e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 265
    :cond_0
    :goto_0
    return-void

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a()V

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 269
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0080

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 270
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    :cond_0
    return-void
.end method
