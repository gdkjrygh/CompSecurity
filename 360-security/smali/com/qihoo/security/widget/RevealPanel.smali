.class public Lcom/qihoo/security/widget/RevealPanel;
.super Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;
.source "360Security"


# instance fields
.field private j:Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

.field private k:Lcom/qihoo/security/widget/MaterialRippleLayout;

.field private l:Lcom/qihoo/security/widget/RevealRippleLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private o:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private p:Landroid/view/View;

.field private q:I

.field private r:Landroid/widget/LinearLayout$LayoutParams;

.field private s:Lcom/qihoo/security/widget/RevealRippleLayout$a;

.field private t:I

.field private u:Z

.field private v:Z

.field private final w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/16 v1, 0x32

    .line 79
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;-><init>(Landroid/content/Context;)V

    .line 58
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    .line 62
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->w:I

    .line 63
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    .line 64
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    .line 80
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealPanel;->h()V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/16 v1, 0x32

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    .line 62
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->w:I

    .line 63
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    .line 64
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    .line 75
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealPanel;->h()V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/16 v1, 0x32

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const v0, -0x50506

    iput v0, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    .line 62
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->w:I

    .line 63
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    .line 64
    iput v1, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    .line 70
    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealPanel;->h()V

    .line 71
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/MaterialRippleLayout;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/RevealPanel;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/qihoo/security/widget/RevealPanel;->v:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/widget/RevealPanel;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/widget/RevealPanel;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/qihoo/security/widget/RevealPanel;->u:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->s:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->j:Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/widget/RevealPanel;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/widget/RevealPanel;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    return v0
.end method

.method private h()V
    .locals 0

    .prologue
    .line 84
    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/widget/RevealPanel;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->v:Z

    return v0
.end method

.method private setOriginRiple(Lcom/qihoo/security/widget/RevealRippleLayout;)V
    .locals 1

    .prologue
    .line 351
    new-instance v0, Lcom/qihoo/security/widget/RevealPanel$2;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/widget/RevealPanel$2;-><init>(Lcom/qihoo/security/widget/RevealPanel;Lcom/qihoo/security/widget/RevealRippleLayout;)V

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/RevealRippleLayout;->post(Ljava/lang/Runnable;)Z

    .line 369
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .prologue
    .line 258
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->v:Z

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setBackgroundColor(I)V

    .line 262
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    .line 263
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth0:Lcom/qihoo/security/widget/shadow/ZDepth;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealRippleLayout;->b(Z)V

    .line 267
    :cond_1
    return-void
.end method

.method public a(ZF)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 301
    iget-object v3, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->p:Landroid/view/View;

    if-eqz p1, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->r:Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/widget/RevealPanel;->q:I

    int-to-float v1, v1

    mul-float/2addr v1, p2

    float-to-int v1, v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 304
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->p:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel;->r:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 305
    return-void

    :cond_0
    move v0, v2

    .line 301
    goto :goto_0

    :cond_1
    move v1, v2

    .line 302
    goto :goto_1
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 206
    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->u:Z

    return v0
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    if-eqz v0, :cond_1

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->setEnabled(Z)V

    .line 225
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    if-eqz v0, :cond_2

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setEnabled(Z)V

    .line 228
    :cond_2
    invoke-virtual {p0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setEnabled(Z)V

    .line 229
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->g()V

    .line 230
    return-void
.end method

.method public b(Z)V
    .locals 2

    .prologue
    .line 270
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->v:Z

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->j:Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->j:Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    sget-object v1, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth0:Lcom/qihoo/security/widget/shadow/ZDepth;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    if-eqz v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealRippleLayout;->a(Z)V

    .line 277
    :cond_1
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 233
    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    if-nez v0, :cond_1

    .line 247
    :cond_0
    :goto_0
    return-void

    .line 236
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->f()V

    .line 237
    invoke-virtual {p0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setEnabled(Z)V

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    if-eqz v0, :cond_2

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setEnabled(Z)V

    .line 241
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    if-eqz v0, :cond_3

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->setEnabled(Z)V

    .line 244
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    goto :goto_0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 250
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->a(Z)V

    .line 251
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->b(Z)V

    .line 255
    return-void
.end method

.method public getCollapseThreshold()I
    .locals 1

    .prologue
    .line 414
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    return v0
.end method

.method public getExpandThreshold()I
    .locals 1

    .prologue
    .line 400
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    return v0
.end method

.method public getRevealColor()I
    .locals 1

    .prologue
    .line 392
    iget v0, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 373
    invoke-super {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->onAttachedToWindow()V

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->setOriginRiple(Lcom/qihoo/security/widget/RevealRippleLayout;)V

    .line 375
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .prologue
    .line 97
    invoke-super {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->onFinishInflate()V

    .line 98
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    :goto_0
    return-void

    .line 101
    :cond_0
    const v0, 0x7f0b0165

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->j:Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    .line 102
    const v0, 0x7f0b0163

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/MaterialRippleLayout;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    .line 103
    const v0, 0x7f0b0164

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealRippleLayout;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    .line 105
    const v0, 0x7f0b0166

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    .line 106
    const v0, 0x7f0b0167

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 107
    const v0, 0x7f0b0168

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 108
    const v0, 0x7f0b0169

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/RevealPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->p:Landroid/view/View;

    .line 109
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/RevealPanel;->q:I

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->r:Landroid/widget/LinearLayout$LayoutParams;

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->l:Lcom/qihoo/security/widget/RevealRippleLayout;

    new-instance v1, Lcom/qihoo/security/widget/RevealPanel$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/RevealPanel$1;-><init>(Lcom/qihoo/security/widget/RevealPanel;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 91
    invoke-super/range {p0 .. p5}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->onLayout(ZIIII)V

    .line 92
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->g()V

    .line 93
    return-void
.end method

.method public setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lcom/qihoo/security/widget/RevealPanel;->s:Lcom/qihoo/security/widget/RevealRippleLayout$a;

    .line 379
    return-void
.end method

.method public setClickable(Z)V
    .locals 1

    .prologue
    .line 210
    iput-boolean p1, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    .line 211
    iget-boolean v0, p0, Lcom/qihoo/security/widget/RevealPanel;->z:Z

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->c()V

    .line 216
    :goto_0
    return-void

    .line 214
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    goto :goto_0
.end method

.method public setCollapseThreshold(I)V
    .locals 0

    .prologue
    .line 424
    iput p1, p0, Lcom/qihoo/security/widget/RevealPanel;->y:I

    .line 425
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 327
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 328
    return-void
.end method

.method public setExpandThreshold(I)V
    .locals 0

    .prologue
    .line 410
    iput p1, p0, Lcom/qihoo/security/widget/RevealPanel;->x:I

    .line 411
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 281
    return-void
.end method

.method public setIconAlpha(F)V
    .locals 2

    .prologue
    .line 287
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v1, p1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 290
    :cond_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 383
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->k:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 389
    :cond_1
    return-void
.end method

.method public setRevealColor(I)V
    .locals 0

    .prologue
    .line 396
    iput p1, p0, Lcom/qihoo/security/widget/RevealPanel;->t:I

    .line 397
    return-void
.end method

.method public setSummary(I)V
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 309
    return-void
.end method

.method public setSummary(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 312
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 313
    return-void
.end method

.method public setSummaryColor(I)V
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 342
    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 294
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 298
    return-void
.end method

.method public setTitleColor(I)V
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 335
    return-void
.end method
