.class public final Lcom/bumptech/glide/load/resource/c/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/f",
        "<",
        "Lcom/bumptech/glide/load/resource/c/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/load/resource/c/s;


# instance fields
.field private final b:Lcom/bumptech/glide/b/b;

.field private final c:Lcom/bumptech/glide/load/b/a/e;

.field private final d:Lcom/bumptech/glide/load/resource/c/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/bumptech/glide/load/resource/c/s;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/c/s;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/c/r;->a:Lcom/bumptech/glide/load/resource/c/s;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;)V
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/bumptech/glide/load/resource/c/r;->a:Lcom/bumptech/glide/load/resource/c/s;

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/load/resource/c/r;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/c/s;)V

    .line 34
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/c/s;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/r;->c:Lcom/bumptech/glide/load/b/a/e;

    .line 39
    new-instance v0, Lcom/bumptech/glide/load/resource/c/a;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/load/resource/c/a;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/r;->b:Lcom/bumptech/glide/b/b;

    .line 40
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/c/r;->d:Lcom/bumptech/glide/load/resource/c/s;

    .line 41
    return-void
.end method

.method private a(Lcom/bumptech/glide/load/b/x;Ljava/io/OutputStream;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;",
            "Ljava/io/OutputStream;",
            ")Z"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 45
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v4

    .line 47
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/c/b;

    .line 48
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->c()Lcom/bumptech/glide/load/g;

    move-result-object v6

    .line 49
    instance-of v1, v6, Lcom/bumptech/glide/load/resource/d;

    if-eqz v1, :cond_1

    .line 50
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->d()[B

    move-result-object v0

    invoke-static {v0, p2}, Lcom/bumptech/glide/load/resource/c/r;->a([BLjava/io/OutputStream;)Z

    move-result v3

    .line 84
    :cond_0
    :goto_0
    return v3

    .line 53
    :cond_1
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->d()[B

    move-result-object v1

    .line 1137
    new-instance v2, Lcom/bumptech/glide/b/e;

    invoke-direct {v2}, Lcom/bumptech/glide/b/e;-><init>()V

    .line 1102
    invoke-virtual {v2, v1}, Lcom/bumptech/glide/b/e;->a([B)Lcom/bumptech/glide/b/e;

    .line 1103
    invoke-virtual {v2}, Lcom/bumptech/glide/b/e;->b()Lcom/bumptech/glide/b/d;

    move-result-object v2

    .line 1105
    iget-object v7, p0, Lcom/bumptech/glide/load/resource/c/r;->b:Lcom/bumptech/glide/b/b;

    .line 2133
    new-instance v8, Lcom/bumptech/glide/b/a;

    invoke-direct {v8, v7}, Lcom/bumptech/glide/b/a;-><init>(Lcom/bumptech/glide/b/b;)V

    .line 1106
    invoke-virtual {v8, v2, v1}, Lcom/bumptech/glide/b/a;->a(Lcom/bumptech/glide/b/d;[B)V

    .line 1107
    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->a()V

    .line 2141
    new-instance v7, Lcom/bumptech/glide/c/a;

    invoke-direct {v7}, Lcom/bumptech/glide/c/a;-><init>()V

    .line 56
    invoke-virtual {v7, p2}, Lcom/bumptech/glide/c/a;->a(Ljava/io/OutputStream;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v2, v3

    .line 60
    :goto_1
    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->c()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 61
    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 3115
    iget-object v9, p0, Lcom/bumptech/glide/load/resource/c/r;->c:Lcom/bumptech/glide/load/b/a/e;

    .line 3145
    new-instance v10, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v10, v1, v9}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)V

    .line 3116
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->getIntrinsicHeight()I

    move-result v9

    invoke-interface {v6, v10, v1, v9}, Lcom/bumptech/glide/load/g;->a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v9

    .line 3118
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 3119
    invoke-interface {v10}, Lcom/bumptech/glide/load/b/x;->d()V

    .line 64
    :cond_2
    :try_start_0
    invoke-interface {v9}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v7, v1}, Lcom/bumptech/glide/c/a;->a(Landroid/graphics/Bitmap;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_3

    .line 73
    invoke-interface {v9}, Lcom/bumptech/glide/load/b/x;->d()V

    goto :goto_0

    .line 67
    :cond_3
    :try_start_1
    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->d()I

    move-result v1

    .line 68
    invoke-virtual {v8, v1}, Lcom/bumptech/glide/b/a;->a(I)I

    move-result v1

    .line 69
    invoke-virtual {v7, v1}, Lcom/bumptech/glide/c/a;->a(I)V

    .line 71
    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    invoke-interface {v9}, Lcom/bumptech/glide/load/b/x;->d()V

    .line 60
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    invoke-interface {v9}, Lcom/bumptech/glide/load/b/x;->d()V

    throw v0

    .line 77
    :cond_4
    invoke-virtual {v7}, Lcom/bumptech/glide/c/a;->a()Z

    move-result v3

    .line 79
    const-string v1, "GifEncoder"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Encoded gif with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/bumptech/glide/b/a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " frames and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->d()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4, v5}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method

.method private static a([BLjava/io/OutputStream;)Z
    .locals 2

    .prologue
    .line 88
    const/4 v0, 0x1

    .line 90
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :goto_0
    return v0

    .line 92
    :catch_0
    move-exception v0

    const-string v0, "GifEncoder"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 95
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    const-string v0, ""

    return-object v0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lcom/bumptech/glide/load/b/x;

    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/resource/c/r;->a(Lcom/bumptech/glide/load/b/x;Ljava/io/OutputStream;)Z

    move-result v0

    return v0
.end method
