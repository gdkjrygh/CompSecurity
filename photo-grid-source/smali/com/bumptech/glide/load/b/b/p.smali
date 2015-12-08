.class public final Lcom/bumptech/glide/load/b/b/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 35
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    new-instance v1, Lcom/bumptech/glide/load/b/b/q;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/b/b/q;-><init>(Landroid/util/DisplayMetrics;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/bumptech/glide/load/b/b/p;-><init>(Landroid/content/Context;Landroid/app/ActivityManager;Lcom/bumptech/glide/load/b/b/r;)V

    .line 38
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/ActivityManager;Lcom/bumptech/glide/load/b/b/r;)V
    .locals 5

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/bumptech/glide/load/b/b/p;->c:Landroid/content/Context;

    .line 1083
    invoke-virtual {p2}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    mul-int/lit16 v0, v0, 0x400

    mul-int/lit16 v0, v0, 0x400

    .line 1084
    invoke-static {p2}, Lcom/bumptech/glide/load/b/b/p;->a(Landroid/app/ActivityManager;)Z

    move-result v1

    .line 1085
    int-to-float v2, v0

    if-eqz v1, :cond_1

    const v0, 0x3ea8f5c3    # 0.33f

    :goto_0
    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 45
    invoke-interface {p3}, Lcom/bumptech/glide/load/b/b/r;->a()I

    move-result v0

    invoke-interface {p3}, Lcom/bumptech/glide/load/b/b/r;->b()I

    move-result v2

    mul-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x4

    .line 48
    mul-int/lit8 v2, v0, 0x4

    .line 49
    mul-int/lit8 v0, v0, 0x2

    .line 51
    add-int v3, v0, v2

    if-gt v3, v1, :cond_2

    .line 52
    iput v0, p0, Lcom/bumptech/glide/load/b/b/p;->b:I

    .line 53
    iput v2, p0, Lcom/bumptech/glide/load/b/b/p;->a:I

    .line 60
    :goto_1
    const-string v3, "MemorySizeCalculator"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Calculated memory cache size: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/bumptech/glide/load/b/b/p;->b:I

    invoke-direct {p0, v4}, Lcom/bumptech/glide/load/b/b/p;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " pool size: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/bumptech/glide/load/b/b/p;->a:I

    invoke-direct {p0, v4}, Lcom/bumptech/glide/load/b/b/p;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " memory class limited? "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/2addr v0, v2

    if-le v0, v1, :cond_3

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " max size: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v1}, Lcom/bumptech/glide/load/b/b/p;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " memoryClass: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " isLowMemoryDevice: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/bumptech/glide/load/b/b/p;->a(Landroid/app/ActivityManager;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 66
    :cond_0
    return-void

    .line 1085
    :cond_1
    const v0, 0x3ecccccd    # 0.4f

    goto/16 :goto_0

    .line 55
    :cond_2
    int-to-float v3, v1

    const/high16 v4, 0x40c00000    # 6.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 56
    mul-int/lit8 v4, v3, 0x2

    iput v4, p0, Lcom/bumptech/glide/load/b/b/p;->b:I

    .line 57
    mul-int/lit8 v3, v3, 0x4

    iput v3, p0, Lcom/bumptech/glide/load/b/b/p;->a:I

    goto :goto_1

    .line 61
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private a(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 90
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/p;->c:Landroid/content/Context;

    int-to-long v2, p1

    invoke-static {v0, v2, v3}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/app/ActivityManager;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .prologue
    .line 95
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Lcom/bumptech/glide/load/b/b/p;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lcom/bumptech/glide/load/b/b/p;->a:I

    return v0
.end method
