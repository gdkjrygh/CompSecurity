.class public final Lcom/roidapp/photogrid/release/el;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/SeekBar;

.field private j:Lcom/roidapp/photogrid/release/ng;

.field private k:I

.field private l:I

.field private m:Z

.field private n:Ljava/text/DecimalFormat;

.field private o:Ljava/text/DecimalFormat;

.field private p:Z

.field private q:Z

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 51
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "00"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    .line 52
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->o:Ljava/text/DecimalFormat;

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->p:Z

    .line 491
    new-instance v0, Lcom/roidapp/photogrid/release/eu;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/eu;-><init>(Lcom/roidapp/photogrid/release/el;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->s:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/el;I)I
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/roidapp/photogrid/release/el;->l:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    return-object v0
.end method

.method private a()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 191
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    iget v3, p0, Lcom/roidapp/photogrid/release/el;->l:I

    const v4, 0xea60

    div-int/2addr v3, v4

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    iget v3, p0, Lcom/roidapp/photogrid/release/el;->l:I

    div-int/lit16 v3, v3, 0x3e8

    rem-int/lit8 v3, v3, 0x3c

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->o:Ljava/text/DecimalFormat;

    iget v3, p0, Lcom/roidapp/photogrid/release/el;->l:I

    rem-int/lit16 v3, v3, 0x3e8

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget v1, p0, Lcom/roidapp/photogrid/release/el;->l:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->g(I)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/roidapp/photogrid/release/el;->l:I

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/el;->k:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 197
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/el;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->k:I

    return v0
.end method

.method private b()V
    .locals 7

    .prologue
    const v6, 0x7f0c00c0

    const/16 v5, 0xff

    const/16 v2, 0x14

    const v4, 0x7f0c00bf

    const/4 v3, 0x0

    .line 368
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    if-eqz v0, :cond_1

    .line 369
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203bf

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 370
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 371
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 373
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020010

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 374
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 375
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 377
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020275

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 378
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 379
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 382
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 383
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;F)V

    .line 388
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    const v1, 0x7f070308

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 390
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 391
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 392
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 393
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 421
    :goto_1
    return-void

    .line 385
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200f4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 395
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203bf

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 396
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 397
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 399
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020010

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 400
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 401
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 403
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020275

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 404
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 405
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 407
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    .line 408
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;F)V

    .line 413
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    const v1, 0x7f070309

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 414
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    .line 410
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200f4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/el;I)V
    .locals 2

    .prologue
    .line 37
    .line 5226
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    iget v1, p0, Lcom/roidapp/photogrid/release/el;->k:I

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_0

    .line 5227
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    .line 5231
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/el;->a()V

    .line 37
    return-void

    .line 5229
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->k:I

    iput v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/el;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/el;I)V
    .locals 1

    .prologue
    .line 37
    .line 5234
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    if-lt v0, p1, :cond_0

    .line 5235
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    .line 5239
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/el;->a()V

    .line 37
    return-void

    .line 5237
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/el;)Ljava/text/DecimalFormat;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/el;)Ljava/text/DecimalFormat;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->o:Ljava/text/DecimalFormat;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/el;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/el;)Z
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->p:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/el;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 37
    .line 4243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 4244
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-class v2, Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4245
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0xaa04

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 37
    return-void
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/el;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->q:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/el;)V
    .locals 3

    .prologue
    .line 37
    .line 4300
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030132

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 4301
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0702e7

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07016b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/et;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/et;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070049

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/es;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/es;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/er;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/er;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 4333
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 37
    return-void
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/el;)V
    .locals 3

    .prologue
    .line 37
    .line 4337
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4348
    :cond_0
    :goto_0
    return-void

    .line 4341
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4342
    const-string v1, "audio/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 4344
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0xaa04

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4347
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/el;)Z
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->q:Z

    return v0
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 427
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->p:Z

    .line 430
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 433
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 60
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    .line 65
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 66
    return-void

    .line 64
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 201
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 203
    :pswitch_0
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    if-nez v2, :cond_0

    .line 2250
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->p:Z

    if-nez v2, :cond_0

    .line 2253
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->p:Z

    .line 2254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 2255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030133

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2256
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0701c3

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/eo;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/eo;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 2267
    const v2, 0x7f0d04de

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/release/ep;

    invoke-direct {v3, p0, v1}, Lcom/roidapp/photogrid/release/ep;-><init>(Lcom/roidapp/photogrid/release/el;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2278
    const v2, 0x7f0d04df

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/eq;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/eq;-><init>(Lcom/roidapp/photogrid/release/el;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2296
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 209
    :pswitch_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2352
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    if-nez v2, :cond_1

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    .line 2354
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/el;->b()V

    .line 2356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 2357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/ng;->V:Z

    .line 2358
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 2359
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Z)V

    goto/16 :goto_0

    :cond_1
    move v0, v1

    .line 2352
    goto :goto_1

    .line 201
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d0323
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 71
    const v0, 0x7f0300c6

    invoke-virtual {p1, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 2077
    const v0, 0x7f0d0328

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    .line 2078
    const v0, 0x7f0d0326

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    .line 2079
    const v0, 0x7f0d0324

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    .line 2080
    const v0, 0x7f0d0323

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    .line 2081
    const v0, 0x7f0d0329

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->r:Landroid/widget/RelativeLayout;

    .line 2082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->r:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/roidapp/photogrid/release/em;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/em;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2093
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2094
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2098
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2099
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2101
    const v0, 0x7f0d032a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->b:Landroid/widget/TextView;

    .line 2102
    const v0, 0x7f0d032b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    .line 2103
    const v0, 0x7f0d032c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->d:Landroid/widget/TextView;

    .line 2105
    const v0, 0x7f0d0327

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    .line 2107
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2108
    const-string v2, "music_policy"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/el;->q:Z

    .line 2111
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2112
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 2113
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2114
    :cond_1
    const-string v0, "140"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 73
    :goto_0
    return-object v1

    .line 2117
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_3

    .line 2118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    .line 2121
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    if-nez v0, :cond_4

    .line 2122
    const-string v0, "141"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 2120
    :cond_3
    iput-object v4, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    goto :goto_1

    .line 2130
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    .line 2131
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget v2, v2, Lcom/roidapp/photogrid/release/ng;->S:I

    iput v2, p0, Lcom/roidapp/photogrid/release/el;->k:I

    .line 2132
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ng;->V:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    .line 2133
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/el;->b()V

    .line 2134
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    if-eqz v2, :cond_5

    .line 2135
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/el;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203c0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 2136
    iget-object v3, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v4, v2, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2137
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->f:Landroid/widget/TextView;

    const v3, 0x7f070308

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 2139
    :cond_5
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    iget v2, v2, Lcom/roidapp/photogrid/release/ng;->R:I

    iput v2, p0, Lcom/roidapp/photogrid/release/el;->l:I

    .line 2141
    if-eqz v0, :cond_6

    .line 2143
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2148
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->c:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    iget v4, p0, Lcom/roidapp/photogrid/release/el;->l:I

    const v5, 0xea60

    div-int/2addr v4, v5

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/el;->n:Ljava/text/DecimalFormat;

    iget v4, p0, Lcom/roidapp/photogrid/release/el;->l:I

    div-int/lit16 v4, v4, 0x3e8

    rem-int/lit8 v4, v4, 0x3c

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/el;->o:Ljava/text/DecimalFormat;

    iget v4, p0, Lcom/roidapp/photogrid/release/el;->l:I

    rem-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2153
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/roidapp/photogrid/release/el;->k:I

    if-nez v0, :cond_7

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 2154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/el;->i:Landroid/widget/SeekBar;

    new-instance v2, Lcom/roidapp/photogrid/release/en;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/en;-><init>(Lcom/roidapp/photogrid/release/el;)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    goto/16 :goto_0

    .line 2153
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/el;->l:I

    int-to-float v0, v0

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float/2addr v0, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/el;->k:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_2
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const v5, 0x7f0c0026

    const v4, 0x7f0c0007

    const/16 v3, 0x64

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 444
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/el;->m:Z

    if-eqz v2, :cond_2

    .line 445
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f0d0327

    if-ne v2, v3, :cond_1

    .line 487
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 447
    goto :goto_0

    .line 449
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    .line 2859
    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ng;->ac:Z

    .line 449
    if-nez v2, :cond_3

    .line 450
    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v2, 0x7f07030d

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/el;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 453
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :goto_1
    move v0, v1

    .line 487
    goto :goto_0

    .line 455
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    .line 476
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_2

    :pswitch_2
    goto :goto_1

    .line 482
    :pswitch_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 483
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->s:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 458
    :pswitch_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 459
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->j:Lcom/roidapp/photogrid/release/ng;

    .line 3859
    iget-boolean v1, v1, Lcom/roidapp/photogrid/release/ng;->ac:Z

    .line 459
    if-eqz v1, :cond_0

    .line 462
    :cond_4
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 463
    iput v0, v1, Landroid/os/Message;->what:I

    .line 464
    iput v3, v1, Landroid/os/Message;->arg1:I

    .line 465
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->s:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 468
    :pswitch_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 469
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 470
    const/4 v2, 0x2

    iput v2, v1, Landroid/os/Message;->what:I

    .line 471
    iput v3, v1, Landroid/os/Message;->arg1:I

    .line 472
    iget-object v2, p0, Lcom/roidapp/photogrid/release/el;->s:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 478
    :pswitch_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 479
    iget-object v1, p0, Lcom/roidapp/photogrid/release/el;->s:Landroid/os/Handler;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 453
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 455
    :pswitch_data_1
    .packed-switch 0x7f0d0326
        :pswitch_5
        :pswitch_1
        :pswitch_4
    .end packed-switch

    .line 476
    :pswitch_data_2
    .packed-switch 0x7f0d0326
        :pswitch_3
        :pswitch_2
        :pswitch_6
    .end packed-switch
.end method
