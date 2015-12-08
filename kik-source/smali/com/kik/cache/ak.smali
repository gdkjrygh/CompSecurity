.class public final Lcom/kik/cache/ak;
.super Lcom/kik/cache/y;
.source "SourceFile"


# instance fields
.field private f:Z

.field private g:I

.field private h:Z

.field private i:Z


# direct methods
.method private constructor <init>(Lkik/a/d/aa;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;ZLcom/android/volley/r$a;ZZ)V
    .locals 9

    .prologue
    .line 60
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/y;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 61
    move/from16 v0, p7

    iput-boolean v0, p0, Lcom/kik/cache/ak;->h:Z

    .line 63
    iput-boolean p5, p0, Lcom/kik/cache/ak;->f:Z

    .line 65
    const/4 v1, 0x4

    iput v1, p0, Lcom/kik/cache/ak;->g:I

    .line 66
    move/from16 v0, p8

    iput-boolean v0, p0, Lcom/kik/cache/ak;->i:Z

    .line 67
    return-void
.end method

.method public static a(Lkik/a/d/aa;Z)Lcom/kik/cache/SimpleLruBitmapCache$a;
    .locals 2

    .prologue
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Lcom/kik/cache/ak;->b(Lkik/a/d/aa;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#!#MyPicImageRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 119
    new-instance v1, Lcom/kik/cache/an;

    invoke-direct {v1, v0}, Lcom/kik/cache/an;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public static a(Lkik/a/d/aa;Lcom/android/volley/r$b;ZLcom/android/volley/r$a;ZZ)Lcom/kik/cache/ak;
    .locals 9

    .prologue
    .line 28
    invoke-static {p0, p4}, Lcom/kik/cache/ak;->b(Lkik/a/d/aa;Z)Ljava/lang/String;

    move-result-object v2

    .line 30
    if-nez v2, :cond_1

    .line 32
    const/4 v0, 0x0

    .line 54
    :cond_0
    :goto_0
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Lcom/kik/cache/ak;

    sget-object v4, Lcom/kik/cache/ak;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p1

    move v5, p2

    move-object v6, p3

    move v7, p4

    move v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/kik/cache/ak;-><init>(Lkik/a/d/aa;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;ZLcom/android/volley/r$a;ZZ)V

    .line 36
    if-eqz p2, :cond_2

    .line 37
    new-instance v1, Lcom/kik/cache/al;

    invoke-direct {v1}, Lcom/kik/cache/al;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ak;->a(Lcom/kik/g/as;)V

    .line 45
    :cond_2
    if-eqz p5, :cond_0

    .line 46
    new-instance v1, Lcom/kik/cache/am;

    invoke-direct {v1}, Lcom/kik/cache/am;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ak;->a(Lcom/kik/g/as;)V

    goto :goto_0
.end method

.method private static b(Lkik/a/d/aa;Z)Ljava/lang/String;
    .locals 2

    .prologue
    .line 71
    if-eqz p0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 72
    :cond_0
    const/4 v0, 0x0

    .line 78
    :goto_0
    return-object v0

    .line 74
    :cond_1
    if-eqz p1, :cond_2

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/orig.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 78
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/thumb.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .locals 3

    .prologue
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/kik/cache/ak;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    iget-boolean v0, p0, Lcom/kik/cache/ak;->f:Z

    if-eqz v0, :cond_0

    .line 89
    const-string v0, "#BLUR"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    iget v0, p0, Lcom/kik/cache/ak;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    :cond_0
    iget-boolean v0, p0, Lcom/kik/cache/ak;->i:Z

    if-eqz v0, :cond_1

    .line 93
    const-string v0, "#LIGHTEN"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    :cond_1
    invoke-virtual {p0}, Lcom/kik/cache/ak;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/aa;

    iget-boolean v2, p0, Lcom/kik/cache/ak;->h:Z

    invoke-static {v0, v2}, Lcom/kik/cache/ak;->b(Lkik/a/d/aa;Z)Ljava/lang/String;

    move-result-object v0

    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#!#MyPicImageRequest"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-boolean v0, p0, Lcom/kik/cache/ak;->h:Z

    if-eqz v0, :cond_0

    .line 105
    const-string v0, "myPicVolleyDiskKey#FULLSIZE"

    .line 108
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "myPicVolleyDiskKey"

    goto :goto_0
.end method
