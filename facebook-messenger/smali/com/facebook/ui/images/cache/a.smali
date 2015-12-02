.class public Lcom/facebook/ui/images/cache/a;
.super Lcom/facebook/ui/media/cache/g;
.source "ImageCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/ui/media/cache/g",
        "<",
        "Lcom/facebook/ui/images/cache/d;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/ui/media/attachments/d;

.field private final b:Lcom/facebook/ui/images/a/a;

.field private final c:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ui/media/attachments/d;Lcom/facebook/ui/images/a/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;IZLjava/lang/String;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V
    .locals 11
    .param p14    # Lcom/facebook/cache/j;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/ui/media/attachments/d;",
            "Lcom/facebook/ui/images/a/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/analytics/j/a;",
            "Lcom/facebook/common/e/h;",
            "IZ",
            "Ljava/lang/String;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/cache/j;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 107
    invoke-static/range {p10 .. p12}, Lcom/facebook/ui/images/cache/a;->a(IZLjava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    move-object/from16 v10, p15

    invoke-direct/range {v0 .. v10}, Lcom/facebook/ui/media/cache/g;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;Lcom/facebook/ui/media/cache/m;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V

    .line 110
    iput-object p2, p0, Lcom/facebook/ui/images/cache/a;->a:Lcom/facebook/ui/media/attachments/d;

    .line 111
    iput-object p3, p0, Lcom/facebook/ui/images/cache/a;->b:Lcom/facebook/ui/images/a/a;

    .line 112
    iput-object p4, p0, Lcom/facebook/ui/images/cache/a;->c:Lcom/facebook/prefs/shared/d;

    .line 113
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/cache/a;)Lcom/facebook/ui/media/attachments/d;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/ui/images/cache/a;->a:Lcom/facebook/ui/media/attachments/d;

    return-object v0
.end method

.method private static a(IZLjava/lang/String;)Lcom/facebook/ui/media/cache/m;
    .locals 8

    .prologue
    const-wide/32 v2, 0x1e00000

    const/16 v4, 0x20

    const/4 v7, 0x1

    .line 128
    const/16 v0, 0x40

    if-lt p0, v0, :cond_0

    const/high16 v0, 0x1000000

    move v1, v0

    .line 133
    :goto_0
    if-lt p0, v4, :cond_2

    const/high16 v0, 0x100000

    sub-int v0, v1, v0

    .line 138
    :goto_1
    new-instance v4, Lcom/facebook/ui/media/cache/m;

    invoke-direct {v4}, Lcom/facebook/ui/media/cache/m;-><init>()V

    const-string v5, "image"

    invoke-virtual {v4, v5}, Lcom/facebook/ui/media/cache/m;->a(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v4

    const-string v5, ".image"

    invoke-virtual {v4, v5}, Lcom/facebook/ui/media/cache/m;->b(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "_image"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/ui/media/cache/m;->c(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/facebook/ui/media/cache/m;->a(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/facebook/ui/media/cache/m;->d(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/cache/m;->e(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->b(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->c(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/facebook/ui/media/cache/m;->a(Z)Lcom/facebook/ui/media/cache/m;

    move-result-object v4

    if-eqz p1, :cond_3

    const-wide/32 v0, 0x3c00000

    :goto_2
    invoke-virtual {v4, v0, v1}, Lcom/facebook/ui/media/cache/m;->a(J)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    if-eqz p1, :cond_4

    :goto_3
    invoke-virtual {v0, v2, v3}, Lcom/facebook/ui/media/cache/m;->b(J)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    return-object v0

    .line 128
    :cond_0
    if-lt p0, v4, :cond_1

    const/high16 v0, 0x400000

    move v1, v0

    goto :goto_0

    :cond_1
    const/high16 v0, 0x200000

    move v1, v0

    goto :goto_0

    .line 133
    :cond_2
    const/high16 v0, 0x80000

    sub-int v0, v1, v0

    goto :goto_1

    :cond_3
    move-wide v0, v2

    .line 138
    goto :goto_2

    :cond_4
    const-wide/32 v2, 0xf00000

    goto :goto_3
.end method

.method static synthetic b(Lcom/facebook/ui/images/cache/a;)Z
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/ui/images/cache/a;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/facebook/ui/images/cache/a;)Lcom/facebook/ui/images/a/a;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/ui/images/cache/a;->b:Lcom/facebook/ui/images/a/a;

    return-object v0
.end method

.method private h()Z
    .locals 3

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/ui/images/cache/a;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->u:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;)I
    .locals 2

    .prologue
    .line 123
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    return v0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 42
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/cache/a;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method protected a(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)Lcom/facebook/ui/media/cache/a;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/media/cache/m;",
            ")",
            "Lcom/facebook/ui/media/cache/a",
            "<",
            "Lcom/facebook/ui/images/cache/d;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    new-instance v0, Lcom/facebook/ui/images/cache/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/ui/images/cache/b;-><init>(Lcom/facebook/ui/images/cache/a;Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V

    return-object v0
.end method
