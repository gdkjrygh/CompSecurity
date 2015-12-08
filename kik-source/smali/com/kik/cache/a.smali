.class public final Lcom/kik/cache/a;
.super Lcom/kik/cache/ac;
.source "SourceFile"


# static fields
.field private static final f:Lorg/c/b;


# instance fields
.field private g:Ljava/lang/Object;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "Base64ImageRequest"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cache/a;->f:Lorg/c/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 36
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, v4

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/ac;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/a;->g:Ljava/lang/Object;

    .line 37
    iput-object p1, p0, Lcom/kik/cache/a;->h:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/a;
    .locals 6

    .prologue
    .line 30
    invoke-static {p0}, Lcom/kik/cache/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 31
    new-instance v0, Lcom/kik/cache/a;

    sget-object v4, Lcom/kik/cache/a;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/kik/cache/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    return-object v0
.end method

.method private c(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 61
    if-nez p1, :cond_0

    .line 62
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Null response"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    .line 84
    :goto_0
    return-object v0

    .line 68
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kik/cache/a;->h:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 75
    :goto_1
    if-eqz v0, :cond_2

    .line 76
    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 78
    :goto_2
    if-nez v0, :cond_1

    .line 80
    new-instance v0, Lcom/android/volley/w;

    const-string v1, "Base64 decode returned null"

    invoke-direct {v0, v1}, Lcom/android/volley/w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed base64 parse: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, v1

    goto :goto_1

    .line 83
    :cond_1
    invoke-static {v0, v1}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_2
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 44
    const-string v0, "http://127.0.0.1/base64/"

    .line 45
    if-eqz p0, :cond_0

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 48
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .locals 4

    .prologue
    .line 90
    iget-object v0, p0, Lcom/kik/cache/a;->h:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cache/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "#H"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#!#Base64ImageRequest"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 2

    .prologue
    .line 54
    iget-object v1, p0, Lcom/kik/cache/a;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 55
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kik/cache/a;->c(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 56
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
    .line 101
    const/4 v0, 0x0

    return v0
.end method
