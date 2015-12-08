.class public Lcom/bumptech/glide/load/resource/c/b;
.super Lcom/bumptech/glide/load/resource/a/b;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/resource/c/i;


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Rect;

.field private final c:Lcom/bumptech/glide/load/resource/c/c;

.field private final d:Lcom/bumptech/glide/b/a;

.field private final e:Lcom/bumptech/glide/load/resource/c/g;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/b/b;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/b/d;[BLandroid/graphics/Bitmap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/b/b;",
            "Lcom/bumptech/glide/load/b/a/e;",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Lcom/bumptech/glide/b/d;",
            "[B",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .prologue
    .line 73
    new-instance v0, Lcom/bumptech/glide/load/resource/c/c;

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-object v3, p1

    move-object v4, p4

    move v5, p5

    move/from16 v6, p6

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/bumptech/glide/load/resource/c/c;-><init>(Lcom/bumptech/glide/b/d;[BLandroid/content/Context;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/b/b;Lcom/bumptech/glide/load/b/a/e;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/resource/c/b;-><init>(Lcom/bumptech/glide/load/resource/c/c;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/resource/c/b;Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/g;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/c/b;",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 79
    new-instance v0, Lcom/bumptech/glide/load/resource/c/c;

    iget-object v1, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v1, v1, Lcom/bumptech/glide/load/resource/c/c;->a:Lcom/bumptech/glide/b/d;

    iget-object v2, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v2, v2, Lcom/bumptech/glide/load/resource/c/c;->b:[B

    iget-object v3, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v3, v3, Lcom/bumptech/glide/load/resource/c/c;->c:Landroid/content/Context;

    iget-object v4, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget v5, v4, Lcom/bumptech/glide/load/resource/c/c;->e:I

    iget-object v4, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget v6, v4, Lcom/bumptech/glide/load/resource/c/c;->f:I

    iget-object v4, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v7, v4, Lcom/bumptech/glide/load/resource/c/c;->g:Lcom/bumptech/glide/b/b;

    iget-object v4, p1, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v8, v4, Lcom/bumptech/glide/load/resource/c/c;->h:Lcom/bumptech/glide/load/b/a/e;

    move-object v4, p3

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/bumptech/glide/load/resource/c/c;-><init>(Lcom/bumptech/glide/b/d;[BLandroid/content/Context;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/b/b;Lcom/bumptech/glide/load/b/a/e;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/resource/c/b;-><init>(Lcom/bumptech/glide/load/resource/c/c;)V

    .line 82
    return-void
.end method

.method constructor <init>(Lcom/bumptech/glide/load/resource/c/c;)V
    .locals 6

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/a/b;-><init>()V

    .line 27
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->b:Landroid/graphics/Rect;

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->i:Z

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lcom/bumptech/glide/load/resource/c/b;->k:I

    .line 85
    if-nez p1, :cond_0

    .line 86
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "GifState must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    .line 90
    new-instance v0, Lcom/bumptech/glide/b/a;

    iget-object v1, p1, Lcom/bumptech/glide/load/resource/c/c;->g:Lcom/bumptech/glide/b/b;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/b/a;-><init>(Lcom/bumptech/glide/b/b;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    .line 91
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->a:Landroid/graphics/Paint;

    .line 92
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    iget-object v1, p1, Lcom/bumptech/glide/load/resource/c/c;->a:Lcom/bumptech/glide/b/d;

    iget-object v2, p1, Lcom/bumptech/glide/load/resource/c/c;->b:[B

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/b/a;->a(Lcom/bumptech/glide/b/d;[B)V

    .line 93
    new-instance v0, Lcom/bumptech/glide/load/resource/c/g;

    iget-object v1, p1, Lcom/bumptech/glide/load/resource/c/c;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    iget v4, p1, Lcom/bumptech/glide/load/resource/c/c;->e:I

    iget v5, p1, Lcom/bumptech/glide/load/resource/c/c;->f:I

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/bumptech/glide/load/resource/c/g;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/resource/c/i;Lcom/bumptech/glide/b/a;II)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    .line 94
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    iget-object v1, p1, Lcom/bumptech/glide/load/resource/c/c;->d:Lcom/bumptech/glide/load/g;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/resource/c/g;->a(Lcom/bumptech/glide/load/g;)V

    .line 95
    return-void
.end method

.method private g()V
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->c()V

    .line 171
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->invalidateSelf()V

    .line 172
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 176
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->c()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 177
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->invalidateSelf()V

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 178
    :cond_1
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->f:Z

    if-nez v0, :cond_0

    .line 179
    iput-boolean v1, p0, Lcom/bumptech/glide/load/resource/c/b;->f:Z

    .line 180
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->a()V

    .line 181
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->invalidateSelf()V

    goto :goto_0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->f:Z

    .line 187
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->b()V

    .line 188
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 306
    if-gtz p1, :cond_0

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-eqz p1, :cond_0

    .line 307
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :cond_0
    if-nez p1, :cond_1

    .line 312
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->e()I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/load/resource/c/b;->k:I

    .line 316
    :goto_0
    return-void

    .line 314
    :cond_1
    iput p1, p0, Lcom/bumptech/glide/load/resource/c/b;->k:I

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 301
    const/4 v0, 0x1

    return v0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->i:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final b(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 262
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-nez v0, :cond_1

    .line 263
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->stop()V

    .line 264
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->g()V

    .line 277
    :cond_0
    :goto_0
    return-void

    .line 268
    :cond_1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->invalidateSelf()V

    .line 270
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 271
    iget v0, p0, Lcom/bumptech/glide/load/resource/c/b;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/bumptech/glide/load/resource/c/b;->j:I

    .line 274
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/load/resource/c/b;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/bumptech/glide/load/resource/c/b;->j:I

    iget v1, p0, Lcom/bumptech/glide/load/resource/c/b;->k:I

    if-lt v0, v1, :cond_0

    .line 275
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->stop()V

    goto :goto_0
.end method

.method public final c()Lcom/bumptech/glide/load/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->d:Lcom/bumptech/glide/load/g;

    return-object v0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->b:[B

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    .line 229
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->h:Z

    if-eqz v0, :cond_0

    .line 241
    :goto_0
    return-void

    .line 233
    :cond_0
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->l:Z

    if-eqz v0, :cond_1

    .line 234
    const/16 v0, 0x77

    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/c/b;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget-object v4, p0, Lcom/bumptech/glide/load/resource/c/b;->b:Landroid/graphics/Rect;

    invoke-static {v0, v1, v2, v3, v4}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->l:Z

    .line 238
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 239
    if-eqz v0, :cond_2

    .line 240
    :goto_1
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/c/b;->b:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/b;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 239
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->i:Landroid/graphics/Bitmap;

    goto :goto_1
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->d:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->c()I

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->h:Z

    .line 289
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->h:Lcom/bumptech/glide/load/b/a/e;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v1, v1, Lcom/bumptech/glide/load/resource/c/c;->i:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/bumptech/glide/load/b/a/e;->a(Landroid/graphics/Bitmap;)Z

    .line 290
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->c()V

    .line 291
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->e:Lcom/bumptech/glide/load/resource/c/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/g;->b()V

    .line 292
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->c:Lcom/bumptech/glide/load/resource/c/c;

    iget-object v0, v0, Lcom/bumptech/glide/load/resource/c/c;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 256
    const/4 v0, -0x2

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .prologue
    .line 213
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->f:Z

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 223
    invoke-super {p0, p1}, Lcom/bumptech/glide/load/resource/a/b;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 224
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->l:Z

    .line 225
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 246
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 251
    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .prologue
    .line 192
    iput-boolean p1, p0, Lcom/bumptech/glide/load/resource/c/b;->i:Z

    .line 193
    if-nez p1, :cond_1

    .line 194
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->i()V

    .line 198
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/load/resource/a/b;->setVisible(ZZ)Z

    move-result v0

    return v0

    .line 195
    :cond_1
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->g:Z

    if-eqz v0, :cond_0

    .line 196
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->h()V

    goto :goto_0
.end method

.method public start()V
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->g:Z

    .line 1140
    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/load/resource/c/b;->j:I

    .line 147
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->i:Z

    if-eqz v0, :cond_0

    .line 148
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->h()V

    .line 150
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    .prologue
    .line 154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/b;->g:Z

    .line 155
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->i()V

    .line 161
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 162
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/b;->g()V

    .line 164
    :cond_0
    return-void
.end method
