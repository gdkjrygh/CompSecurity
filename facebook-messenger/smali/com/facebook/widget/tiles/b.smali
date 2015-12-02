.class public Lcom/facebook/widget/tiles/b;
.super Ljava/lang/Object;
.source "DefaultTiles.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/res/Resources;

.field private final c:Lcom/facebook/widget/tiles/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/widget/tiles/b;

    sput-object v0, Lcom/facebook/widget/tiles/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lcom/facebook/widget/tiles/c;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/widget/tiles/b;->b:Landroid/content/res/Resources;

    .line 31
    iput-object p2, p0, Lcom/facebook/widget/tiles/b;->c:Lcom/facebook/widget/tiles/c;

    .line 32
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 133
    sget-object v0, Lcom/facebook/widget/tiles/b;->a:Ljava/lang/Class;

    const-string v1, "Bitmap resize with canvas drawing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 135
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 136
    invoke-virtual {v1, p3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 137
    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {v2, v5, v5, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 138
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v5, v5, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 139
    const/4 v4, 0x0

    invoke-virtual {v1, p1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 140
    return-object v0
.end method

.method private a(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 93
    if-eq p2, p3, :cond_0

    .line 94
    invoke-direct {p0, p2, p3}, Lcom/facebook/widget/tiles/b;->a(II)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    invoke-direct {p0, p1, v0, p4}, Lcom/facebook/widget/tiles/b;->a(Landroid/graphics/Bitmap;Lcom/facebook/ui/images/d/h;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lcom/facebook/widget/tiles/b;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;Lcom/facebook/ui/images/d/h;I)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 113
    sget-object v0, Lcom/facebook/widget/tiles/b;->a:Ljava/lang/Class;

    const-string v1, "Bitmap resize with GraphicSizer"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    new-instance v0, Lcom/facebook/ui/images/d/j;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v0, p2, v1, v2}, Lcom/facebook/ui/images/d/j;-><init>(Lcom/facebook/ui/images/d/h;II)V

    .line 116
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 118
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 119
    invoke-virtual {v2, p3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 120
    const/4 v3, 0x0

    invoke-virtual {v2, p1, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 121
    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/j;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/widget/tiles/a;IIII)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 49
    new-instance v1, Lcom/facebook/widget/tiles/d;

    invoke-direct {v1, p1, p5, p3, p4}, Lcom/facebook/widget/tiles/d;-><init>(Lcom/facebook/widget/tiles/a;III)V

    .line 50
    iget-object v0, p0, Lcom/facebook/widget/tiles/b;->c:Lcom/facebook/widget/tiles/c;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/tiles/c;->a(Lcom/facebook/widget/tiles/d;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/facebook/widget/tiles/b;->b:Landroid/content/res/Resources;

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 53
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 54
    invoke-direct {p0, v0, p3, p4, p5}, Lcom/facebook/widget/tiles/b;->a(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 55
    iget-object v2, p0, Lcom/facebook/widget/tiles/b;->c:Lcom/facebook/widget/tiles/c;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/widget/tiles/c;->a(Lcom/facebook/widget/tiles/d;Landroid/graphics/Bitmap;)V

    .line 57
    :cond_0
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/facebook/widget/tiles/b;->b:Landroid/content/res/Resources;

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v1
.end method

.method private a(II)Lcom/facebook/ui/images/d/h;
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    .line 68
    sget-object v0, Lcom/facebook/widget/tiles/b;->a:Ljava/lang/Class;

    const-string v1, "Sizing container for unequal resizing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 69
    new-instance v0, Lcom/facebook/ui/images/d/i;

    invoke-direct {v0}, Lcom/facebook/ui/images/d/i;-><init>()V

    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    int-to-float v2, p1

    int-to-float v3, p2

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(Lcom/facebook/ui/images/d/c;)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p2, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/widget/tiles/a;II)Landroid/graphics/drawable/Drawable;
    .locals 6

    .prologue
    .line 35
    invoke-virtual {p1}, Lcom/facebook/widget/tiles/a;->a()I

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/widget/tiles/a;->b()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/tiles/b;->a(Lcom/facebook/widget/tiles/a;IIII)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
