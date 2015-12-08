.class public final Lcom/kik/cache/i;
.super Lcom/kik/cache/ac;
.source "SourceFile"


# static fields
.field private static final i:Lcom/kik/g/as;


# instance fields
.field private f:Ljava/lang/Object;

.field private final g:Ljava/lang/String;

.field private final h:Lkik/a/e/n;

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/cache/j;

    invoke-direct {v0}, Lcom/kik/cache/j;-><init>()V

    sput-object v0, Lcom/kik/cache/i;->i:Lcom/kik/g/as;

    return-void
.end method

.method private constructor <init>(Lkik/a/d/d;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZLkik/a/e/n;)V
    .locals 9

    .prologue
    .line 48
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/ac;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 27
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/kik/cache/i;->f:Ljava/lang/Object;

    .line 49
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/kik/cache/i;->h:Lkik/a/e/n;

    .line 50
    iput-object p2, p0, Lcom/kik/cache/i;->g:Ljava/lang/String;

    .line 51
    move/from16 v0, p7

    iput-boolean v0, p0, Lcom/kik/cache/i;->j:Z

    .line 52
    iget-boolean v1, p0, Lcom/kik/cache/i;->j:Z

    if-eqz v1, :cond_0

    .line 53
    sget-object v1, Lcom/kik/cache/i;->i:Lcom/kik/g/as;

    invoke-virtual {p0, v1}, Lcom/kik/cache/i;->a(Lcom/kik/g/as;)V

    .line 55
    :cond_0
    return-void
.end method

.method public static a(Lkik/a/d/d;Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZLkik/a/e/n;)Lcom/kik/cache/i;
    .locals 9

    .prologue
    .line 42
    invoke-static {p1}, Lcom/kik/cache/i;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 43
    new-instance v0, Lcom/kik/cache/i;

    sget-object v5, Lcom/kik/cache/i;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/kik/cache/i;-><init>(Lkik/a/d/d;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZLkik/a/e/n;)V

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 66
    const-string v0, "http://127.0.0.1/chatImage/"

    .line 67
    if-eqz p0, :cond_0

    .line 69
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {p0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 75
    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .locals 4

    .prologue
    .line 106
    iget-object v0, p0, Lcom/kik/cache/i;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cache/i;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "#H"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    iget-boolean v2, p0, Lcom/kik/cache/i;->j:Z

    if-eqz v2, :cond_0

    .line 111
    const-string v2, "#BLUR"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#!#ChatImageRequest"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 4

    .prologue
    .line 81
    iget-object v1, p0, Lcom/kik/cache/i;->f:Ljava/lang/Object;

    monitor-enter v1

    .line 82
    if-nez p1, :cond_0

    :try_start_0
    new-instance v0, Lcom/android/volley/w;

    const-string v2, "Null response"

    invoke-direct {v0, v2}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    :goto_0
    monitor-exit v1

    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/kik/cache/i;->h:Lkik/a/e/n;

    invoke-virtual {p0}, Lcom/kik/cache/i;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Lkik/a/e/n;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/volley/w;

    const-string v2, "Null bitmap from composite"

    invoke-direct {v0, v2}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e_()Z
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    return v0
.end method
