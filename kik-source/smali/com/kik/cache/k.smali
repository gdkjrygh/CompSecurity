.class public final Lcom/kik/cache/k;
.super Lcom/kik/cache/y;
.source "SourceFile"


# static fields
.field private static final f:Lcom/kik/g/as;


# instance fields
.field private g:Z

.field private h:I

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lcom/kik/cache/l;

    invoke-direct {v0}, Lcom/kik/cache/l;-><init>()V

    sput-object v0, Lcom/kik/cache/k;->f:Lcom/kik/g/as;

    return-void
.end method

.method private constructor <init>(Lkik/a/d/k;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZIZZ)V
    .locals 9

    .prologue
    .line 47
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/y;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 49
    iput-boolean p6, p0, Lcom/kik/cache/k;->g:Z

    .line 51
    move/from16 v0, p7

    iput v0, p0, Lcom/kik/cache/k;->h:I

    .line 52
    move/from16 v0, p9

    iput-boolean v0, p0, Lcom/kik/cache/k;->i:Z

    .line 53
    move/from16 v0, p8

    iput-boolean v0, p0, Lcom/kik/cache/k;->j:Z

    .line 55
    iget-boolean v1, p0, Lcom/kik/cache/k;->g:Z

    if-eqz v1, :cond_0

    .line 56
    new-instance v1, Lcom/kik/cache/m;

    move/from16 v0, p7

    invoke-direct {v1, p0, v0}, Lcom/kik/cache/m;-><init>(Lcom/kik/cache/k;I)V

    invoke-virtual {p0, v1}, Lcom/kik/cache/k;->a(Lcom/kik/g/as;)V

    .line 64
    :cond_0
    iget-boolean v1, p0, Lcom/kik/cache/k;->i:Z

    if-eqz v1, :cond_1

    .line 65
    sget-object v1, Lcom/kik/cache/k;->f:Lcom/kik/g/as;

    invoke-virtual {p0, v1}, Lcom/kik/cache/k;->a(Lcom/kik/g/as;)V

    .line 68
    :cond_1
    return-void
.end method

.method public static a(Lkik/a/d/k;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZIZZ)Lcom/kik/cache/k;
    .locals 10

    .prologue
    .line 36
    invoke-static {p0, p5}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Z)Ljava/lang/String;

    move-result-object v2

    .line 37
    if-nez v2, :cond_0

    .line 39
    const/4 v0, 0x0

    .line 41
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/cache/k;

    sget-object v4, Lcom/kik/cache/k;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    move v8, p5

    move/from16 v9, p6

    invoke-direct/range {v0 .. v9}, Lcom/kik/cache/k;-><init>(Lkik/a/d/k;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZIZZ)V

    goto :goto_0
.end method

.method public static a(Lkik/a/d/k;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lkik/a/d/k;Z)Ljava/lang/String;
    .locals 3

    .prologue
    .line 72
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    const/4 v0, 0x0

    .line 90
    :goto_0
    return-object v0

    .line 75
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/k;->s()Ljava/lang/String;

    move-result-object v0

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    if-eqz p1, :cond_3

    .line 78
    const-string v2, "/orig.jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    :goto_1
    if-eqz v0, :cond_2

    .line 85
    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    const-string v2, "request_ts"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 81
    :cond_3
    const-string v2, "/thumb.jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public static b(Lkik/a/d/k;)Lcom/kik/cache/SimpleLruBitmapCache$a;
    .locals 2

    .prologue
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#!#ContactImageRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 126
    new-instance v1, Lcom/kik/cache/n;

    invoke-direct {v1, v0}, Lcom/kik/cache/n;-><init>(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .locals 4

    .prologue
    .line 108
    invoke-virtual {p0}, Lcom/kik/cache/k;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    iget-boolean v1, p0, Lcom/kik/cache/k;->j:Z

    invoke-static {v0, v1}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Z)Ljava/lang/String;

    move-result-object v0

    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "#H"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    iget-boolean v2, p0, Lcom/kik/cache/k;->g:Z

    if-eqz v2, :cond_0

    .line 113
    const-string v2, "#BLUR"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    iget v2, p0, Lcom/kik/cache/k;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    :cond_0
    iget-boolean v2, p0, Lcom/kik/cache/k;->i:Z

    if-eqz v2, :cond_1

    .line 117
    const-string v2, "#LIGHTEN"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#!#ContactImageRequest"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/kik/cache/k;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    return-object v0
.end method
