.class public Lcom/facebook/e/s;
.super Ljava/lang/Object;
.source "GraphicsCapabilities.java"


# instance fields
.field private final a:Landroid_src/e/a;


# direct methods
.method public constructor <init>(Landroid_src/e/a;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/e/s;->a:Landroid_src/e/a;

    .line 25
    return-void
.end method

.method private static a(Landroid/view/Display;Landroid/graphics/Point;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .prologue
    .line 52
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-lt v0, v1, :cond_0

    .line 56
    invoke-virtual {p0, p1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 63
    :goto_0
    return-void

    .line 60
    :cond_0
    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 61
    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->y:I

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/view/Display;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 34
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 35
    invoke-static {p1, v1}, Lcom/facebook/e/s;->a(Landroid/view/Display;Landroid/graphics/Point;)V

    .line 36
    iget v2, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    mul-int/2addr v1, v2

    const v2, 0x96000

    if-lt v1, v2, :cond_1

    .line 41
    :cond_0
    :goto_0
    return v0

    .line 40
    :cond_1
    iget-object v1, p0, Lcom/facebook/e/s;->a:Landroid_src/e/a;

    invoke-virtual {v1}, Landroid_src/e/a;->a()V

    .line 41
    iget-object v1, p0, Lcom/facebook/e/s;->a:Landroid_src/e/a;

    invoke-virtual {v1}, Landroid_src/e/a;->b()J

    move-result-wide v1

    const-wide/32 v3, 0x20000000

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method
