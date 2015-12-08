.class public abstract Lkik/android/widget/KikNetworkedImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field protected static final e:Lcom/android/volley/r$a;

.field protected static final f:Lcom/android/volley/r$b;


# instance fields
.field private a:Lcom/kik/cache/z;

.field private b:I

.field private c:Lcom/kik/cache/ad;

.field private d:Lcom/kik/cache/ad$c;

.field protected g:Landroid/graphics/Bitmap;

.field private h:I

.field private i:I

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lkik/android/widget/cl;

    invoke-direct {v0}, Lkik/android/widget/cl;-><init>()V

    sput-object v0, Lkik/android/widget/KikNetworkedImageView;->e:Lcom/android/volley/r$a;

    .line 33
    new-instance v0, Lkik/android/widget/cm;

    invoke-direct {v0}, Lkik/android/widget/cm;-><init>()V

    sput-object v0, Lkik/android/widget/KikNetworkedImageView;->f:Lcom/android/volley/r$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 72
    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    .line 87
    sget-object v0, Lkik/android/ag$b;->m:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 88
    const/4 v0, 0x0

    .line 98
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 103
    :goto_0
    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 104
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 105
    return-void

    .line 100
    :catch_0
    move-exception v2

    invoke-static {v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/widget/KikNetworkedImageView;)I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lkik/android/widget/KikNetworkedImageView;->b:I

    return v0
.end method

.method private a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 232
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->a()V

    .line 234
    iput-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    .line 235
    iput-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    .line 237
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/widget/KikNetworkedImageView;Lcom/kik/cache/ad$c;Z)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->o:Z

    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->c(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->b(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->e()V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 6

    .prologue
    .line 160
    iget-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    if-eqz v0, :cond_1

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 167
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    if-nez v0, :cond_2

    .line 168
    invoke-direct {p0}, Lkik/android/widget/KikNetworkedImageView;->a()V

    .line 169
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->e()V

    goto :goto_0

    .line 174
    :cond_2
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 175
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    iget-object v2, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v2}, Lcom/kik/cache/ad$c;->c()I

    move-result v2

    iget-object v3, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v3}, Lcom/kik/cache/ad$c;->d()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/cache/z;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 176
    iget-boolean v1, p0, Lkik/android/widget/KikNetworkedImageView;->n:Z

    .line 177
    if-eqz v0, :cond_3

    if-nez v1, :cond_0

    :cond_3
    iget-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->m:Z

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->a()V

    .line 184
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->e()V

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    .line 190
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->m:Z

    .line 191
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->c:Lcom/kik/cache/ad;

    iget-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    new-instance v2, Lkik/android/widget/cn;

    invoke-direct {v2, p0, p1}, Lkik/android/widget/cn;-><init>(Lkik/android/widget/KikNetworkedImageView;Z)V

    iget v3, p0, Lkik/android/widget/KikNetworkedImageView;->h:I

    iget v4, p0, Lkik/android/widget/KikNetworkedImageView;->i:I

    iget-boolean v5, p0, Lkik/android/widget/KikNetworkedImageView;->l:Z

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;

    move-result-object v0

    .line 222
    iput-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    goto :goto_0
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 382
    new-instance v0, Lkik/android/widget/p;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/p;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lkik/android/widget/KikNetworkedImageView;->g:Landroid/graphics/Bitmap;

    .line 260
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 251
    iput-object p1, p0, Lkik/android/widget/KikNetworkedImageView;->k:Landroid/graphics/drawable/Drawable;

    .line 252
    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 253
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;)V

    .line 255
    :cond_0
    return-void
.end method

.method public final a(Lcom/kik/cache/z;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 130
    iget-boolean v5, p0, Lkik/android/widget/KikNetworkedImageView;->l:Z

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, v3

    invoke-virtual/range {v0 .. v6}, Lkik/android/widget/KikNetworkedImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    .line 131
    return-void
.end method

.method public final a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 140
    iput-object p1, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->m:Z

    .line 142
    iput-boolean v1, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    .line 143
    iput-object p2, p0, Lkik/android/widget/KikNetworkedImageView;->c:Lcom/kik/cache/ad;

    .line 144
    iput-boolean p5, p0, Lkik/android/widget/KikNetworkedImageView;->l:Z

    .line 145
    iput-boolean p6, p0, Lkik/android/widget/KikNetworkedImageView;->n:Z

    .line 148
    invoke-direct {p0, v1}, Lkik/android/widget/KikNetworkedImageView;->a(Z)V

    .line 149
    iput p4, p0, Lkik/android/widget/KikNetworkedImageView;->i:I

    .line 150
    iput p3, p0, Lkik/android/widget/KikNetworkedImageView;->h:I

    .line 151
    return-void
.end method

.method protected b(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 348
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 349
    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    .line 350
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 359
    :goto_0
    return-void

    .line 355
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->f()V

    .line 356
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, p1, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 357
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 358
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 356
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    invoke-virtual {v0}, Lcom/kik/cache/z;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 329
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    .line 331
    invoke-direct {p0}, Lkik/android/widget/KikNetworkedImageView;->a()V

    .line 332
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->f()V

    .line 333
    iput-object p1, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 334
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 337
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 338
    return-void
.end method

.method protected c(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 371
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->f()V

    .line 372
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    if-nez v0, :cond_1

    move-object v0, v1

    :goto_0
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 373
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 374
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Lkik/android/widget/w;

    if-eqz v0, :cond_0

    .line 375
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lkik/android/widget/w;

    iget-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1, p1}, Lkik/android/widget/w;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 377
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 378
    return-void

    .line 372
    :cond_1
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->a:Lcom/kik/cache/z;

    invoke-virtual {v0}, Lcom/kik/cache/z;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final d(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 315
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    .line 317
    invoke-direct {p0}, Lkik/android/widget/KikNetworkedImageView;->a()V

    .line 318
    invoke-virtual {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->b(Landroid/graphics/Bitmap;)V

    .line 319
    return-void
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 280
    iget-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->o:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 388
    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    .line 389
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->invalidate()V

    .line 390
    return-void
.end method

.method protected final e()V
    .locals 1

    .prologue
    .line 342
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/KikNetworkedImageView;->o:Z

    .line 343
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->g:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->b(Landroid/graphics/Bitmap;)V

    .line 344
    return-void
.end method

.method public final e(I)V
    .locals 1

    .prologue
    .line 110
    :try_start_0
    invoke-virtual {p0}, Lkik/android/widget/KikNetworkedImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 111
    invoke-virtual {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :goto_0
    return-void

    .line 113
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 363
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 365
    iput-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 367
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 293
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->a()V

    .line 297
    invoke-virtual {p0, v1}, Lkik/android/widget/KikNetworkedImageView;->b(Landroid/graphics/Bitmap;)V

    .line 299
    iput-object v1, p0, Lkik/android/widget/KikNetworkedImageView;->d:Lcom/kik/cache/ad$c;

    .line 301
    :cond_0
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lkik/android/widget/KikNetworkedImageView;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 304
    :cond_1
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 305
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 286
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 287
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Z)V

    .line 288
    return-void
.end method
