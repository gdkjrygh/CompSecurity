.class Lcom/facebook/reflex/view/b/o;
.super Ljava/lang/Object;
.source "ViewContent.java"

# interfaces
.implements Lcom/facebook/reflex/a;


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Landroid/graphics/Bitmap;

.field private e:Landroid/graphics/Canvas;

.field private f:Z

.field private g:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/high16 v1, -0x80000000

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/reflex/view/b/o;->a:Ljava/lang/String;

    .line 182
    iput v1, p0, Lcom/facebook/reflex/view/b/o;->b:I

    .line 183
    iput v1, p0, Lcom/facebook/reflex/view/b/o;->c:I

    .line 186
    iput-boolean v2, p0, Lcom/facebook/reflex/view/b/o;->f:Z

    .line 187
    iput v2, p0, Lcom/facebook/reflex/view/b/o;->g:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/view/b/n;)V
    .locals 0

    .prologue
    .line 179
    invoke-direct {p0}, Lcom/facebook/reflex/view/b/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 207
    iget v0, p0, Lcom/facebook/reflex/view/b/o;->b:I

    if-gt p1, v0, :cond_2

    iget v0, p0, Lcom/facebook/reflex/view/b/o;->c:I

    if-gt p2, v0, :cond_2

    .line 208
    iget-boolean v0, p0, Lcom/facebook/reflex/view/b/o;->f:Z

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    const-string v3, "Trying to take canvas that is already taken"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 209
    iput-boolean v2, p0, Lcom/facebook/reflex/view/b/o;->f:Z

    .line 210
    iget-object v0, p0, Lcom/facebook/reflex/view/b/o;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 211
    iget v0, p0, Lcom/facebook/reflex/view/b/o;->b:I

    iget v1, p0, Lcom/facebook/reflex/view/b/o;->c:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/b/o;->d:Landroid/graphics/Bitmap;

    .line 212
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/facebook/reflex/view/b/o;->d:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/o;->e:Landroid/graphics/Canvas;

    .line 221
    :goto_1
    iget-object v0, p0, Lcom/facebook/reflex/view/b/o;->d:Landroid/graphics/Bitmap;

    .line 223
    :goto_2
    return-object v0

    :cond_0
    move v0, v6

    .line 208
    goto :goto_0

    .line 217
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/b/o;->e:Landroid/graphics/Canvas;

    int-to-float v3, p1

    int-to-float v4, p2

    sget-object v5, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 219
    iget-object v0, p0, Lcom/facebook/reflex/view/b/o;->e:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v6, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    .line 223
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 190
    iget v0, p0, Lcom/facebook/reflex/view/b/o;->b:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    .line 191
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 192
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 193
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 194
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/graphics/Point;->x:I

    .line 195
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, v1, Landroid/graphics/Point;->y:I

    .line 196
    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v2, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/view/b/o;->b:I

    .line 197
    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/view/b/o;->c:I

    .line 199
    :cond_0
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/reflex/view/b/o;->d:Landroid/graphics/Bitmap;

    if-eq p1, v0, :cond_0

    .line 242
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 246
    :goto_0
    return-void

    .line 244
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/view/b/o;->f:Z

    goto :goto_0
.end method
