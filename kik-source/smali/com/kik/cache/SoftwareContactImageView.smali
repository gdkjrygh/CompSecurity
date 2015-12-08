.class public Lcom/kik/cache/SoftwareContactImageView;
.super Lcom/kik/cache/ContactImageView;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/kik/cache/ContactImageView;-><init>(Landroid/content/Context;)V

    .line 19
    new-instance v0, Lcom/kik/cache/az;

    invoke-direct {v0, p0}, Lcom/kik/cache/az;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->a:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Lcom/kik/cache/ba;

    invoke-direct {v0, p0}, Lcom/kik/cache/ba;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->b:Landroid/graphics/Paint;

    .line 35
    invoke-direct {p0}, Lcom/kik/cache/SoftwareContactImageView;->g()V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Lcom/kik/cache/ContactImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    new-instance v0, Lcom/kik/cache/az;

    invoke-direct {v0, p0}, Lcom/kik/cache/az;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->a:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Lcom/kik/cache/ba;

    invoke-direct {v0, p0}, Lcom/kik/cache/ba;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->b:Landroid/graphics/Paint;

    .line 41
    invoke-direct {p0}, Lcom/kik/cache/SoftwareContactImageView;->g()V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/kik/cache/ContactImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance v0, Lcom/kik/cache/az;

    invoke-direct {v0, p0}, Lcom/kik/cache/az;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->a:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Lcom/kik/cache/ba;

    invoke-direct {v0, p0}, Lcom/kik/cache/ba;-><init>(Lcom/kik/cache/SoftwareContactImageView;)V

    iput-object v0, p0, Lcom/kik/cache/SoftwareContactImageView;->b:Landroid/graphics/Paint;

    .line 47
    invoke-direct {p0}, Lcom/kik/cache/SoftwareContactImageView;->g()V

    .line 48
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 55
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/kik/cache/SoftwareContactImageView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 57
    :cond_0
    return-void
.end method


# virtual methods
.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 6

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/kik/cache/SoftwareContactImageView;->b()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/kik/cache/SoftwareContactImageView;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;

    move-result-object v0

    .line 75
    :goto_0
    return-object v0

    .line 67
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 68
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 69
    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/kik/cache/SoftwareContactImageView;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 70
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x8

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x8

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x6

    int-to-float v4, v4

    iget-object v5, p0, Lcom/kik/cache/SoftwareContactImageView;->b:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 71
    invoke-super {p0, v0, p2}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 73
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 75
    invoke-super {p0, p1, p2}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;

    move-result-object v0

    goto :goto_0
.end method
