.class public final Lcom/a/a/b/b/e;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/a/a/b/a/f;

.field private final d:Lcom/a/a/b/a/e;

.field private final e:Lcom/a/a/b/a/i;

.field private final f:Lcom/a/a/b/d/c;

.field private final g:Ljava/lang/Object;

.field private final h:Z

.field private final i:Landroid/graphics/BitmapFactory$Options;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/a/a/b/a/f;Lcom/a/a/b/a/i;Lcom/a/a/b/d/c;Lcom/a/a/b/d;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/b/b/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/a/a/b/b/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/a/a/b/b/e;->c:Lcom/a/a/b/a/f;

    invoke-virtual {p6}, Lcom/a/a/b/d;->j()Lcom/a/a/b/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/b/e;->d:Lcom/a/a/b/a/e;

    iput-object p4, p0, Lcom/a/a/b/b/e;->e:Lcom/a/a/b/a/i;

    iput-object p5, p0, Lcom/a/a/b/b/e;->f:Lcom/a/a/b/d/c;

    invoke-virtual {p6}, Lcom/a/a/b/d;->n()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/b/e;->g:Ljava/lang/Object;

    invoke-virtual {p6}, Lcom/a/a/b/d;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/b/e;->h:Z

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/b/e;->i:Landroid/graphics/BitmapFactory$Options;

    invoke-virtual {p6}, Lcom/a/a/b/d;->k()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/b/b/e;->i:Landroid/graphics/BitmapFactory$Options;

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v2, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inScreenDensity:I

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inScreenDensity:I

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iget-object v2, v0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-lt v2, v3, :cond_0

    iget-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_1

    iget-object v2, v0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/a/a/b/a/f;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->c:Lcom/a/a/b/a/f;

    return-object v0
.end method

.method public final d()Lcom/a/a/b/a/e;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->d:Lcom/a/a/b/a/e;

    return-object v0
.end method

.method public final e()Lcom/a/a/b/a/i;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->e:Lcom/a/a/b/a/i;

    return-object v0
.end method

.method public final f()Lcom/a/a/b/d/c;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->f:Lcom/a/a/b/d/c;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/b/e;->h:Z

    return v0
.end method

.method public final i()Landroid/graphics/BitmapFactory$Options;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/b/e;->i:Landroid/graphics/BitmapFactory$Options;

    return-object v0
.end method
