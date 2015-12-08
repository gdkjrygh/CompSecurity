.class public final Lcom/bumptech/glide/load/resource/d/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/e",
        "<",
        "Lcom/bumptech/glide/load/c/j;",
        "Lcom/bumptech/glide/load/resource/d/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/load/resource/d/e;

.field private static final b:Lcom/bumptech/glide/load/resource/d/d;


# instance fields
.field private final c:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Lcom/bumptech/glide/load/c/j;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/bumptech/glide/load/b/a/e;

.field private final f:Lcom/bumptech/glide/load/resource/d/e;

.field private final g:Lcom/bumptech/glide/load/resource/d/d;

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Lcom/bumptech/glide/load/resource/d/e;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/d/e;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/d/c;->a:Lcom/bumptech/glide/load/resource/d/e;

    .line 24
    new-instance v0, Lcom/bumptech/glide/load/resource/d/d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/d/d;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/d/c;->b:Lcom/bumptech/glide/load/resource/d/d;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/b/a/e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Lcom/bumptech/glide/load/c/j;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;",
            "Lcom/bumptech/glide/load/b/a/e;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    sget-object v4, Lcom/bumptech/glide/load/resource/d/c;->a:Lcom/bumptech/glide/load/resource/d/e;

    sget-object v5, Lcom/bumptech/glide/load/resource/d/c;->b:Lcom/bumptech/glide/load/resource/d/d;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/bumptech/glide/load/resource/d/c;-><init>(Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/d/e;Lcom/bumptech/glide/load/resource/d/d;)V

    .line 39
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/d/e;Lcom/bumptech/glide/load/resource/d/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Lcom/bumptech/glide/load/c/j;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;",
            "Lcom/bumptech/glide/load/b/a/e;",
            "Lcom/bumptech/glide/load/resource/d/e;",
            "Lcom/bumptech/glide/load/resource/d/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/d/c;->c:Lcom/bumptech/glide/load/e;

    .line 46
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/d/c;->d:Lcom/bumptech/glide/load/e;

    .line 47
    iput-object p3, p0, Lcom/bumptech/glide/load/resource/d/c;->e:Lcom/bumptech/glide/load/b/a/e;

    .line 48
    iput-object p4, p0, Lcom/bumptech/glide/load/resource/d/c;->f:Lcom/bumptech/glide/load/resource/d/e;

    .line 49
    iput-object p5, p0, Lcom/bumptech/glide/load/resource/d/c;->g:Lcom/bumptech/glide/load/resource/d/d;

    .line 50
    return-void
.end method

.method private a(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/b/x;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c/j;",
            "II)",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/d/a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-static {}, Lcom/bumptech/glide/i/a;->a()Lcom/bumptech/glide/i/a;

    move-result-object v2

    .line 57
    invoke-virtual {v2}, Lcom/bumptech/glide/i/a;->b()[B

    move-result-object v3

    .line 1070
    :try_start_0
    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->a()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1080
    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->a()Ljava/io/InputStream;

    move-result-object v0

    .line 1140
    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/t;

    invoke-direct {v4, v0, v3}, Lcom/bumptech/glide/load/resource/bitmap/t;-><init>(Ljava/io/InputStream;[B)V

    .line 1081
    const/16 v0, 0x800

    invoke-virtual {v4, v0}, Ljava/io/InputStream;->mark(I)V

    .line 1147
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;

    invoke-direct {v0, v4}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;->a()Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    move-result-object v0

    .line 1083
    invoke-virtual {v4}, Ljava/io/InputStream;->reset()V

    .line 1086
    sget-object v5, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    if-ne v0, v5, :cond_4

    .line 2101
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/c;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v0, v4, p2, p3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v5

    .line 2102
    if-eqz v5, :cond_4

    .line 2103
    invoke-interface {v5}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/c/b;

    .line 2108
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->e()I

    move-result v6

    const/4 v7, 0x1

    if-le v6, v7, :cond_2

    .line 2109
    new-instance v0, Lcom/bumptech/glide/load/resource/d/a;

    const/4 v6, 0x0

    invoke-direct {v0, v6, v5}, Lcom/bumptech/glide/load/resource/d/a;-><init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V

    .line 1090
    :goto_0
    if-nez v0, :cond_0

    .line 1093
    new-instance v0, Lcom/bumptech/glide/load/c/j;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->b()Landroid/os/ParcelFileDescriptor;

    move-result-object v5

    invoke-direct {v0, v4, v5}, Lcom/bumptech/glide/load/c/j;-><init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V

    .line 1094
    invoke-direct {p0, v0, p2, p3}, Lcom/bumptech/glide/load/resource/d/c;->b(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/resource/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 63
    :cond_0
    :goto_1
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/i/a;->a([B)Z

    .line 65
    if-eqz v0, :cond_1

    new-instance v1, Lcom/bumptech/glide/load/resource/d/b;

    invoke-direct {v1, v0}, Lcom/bumptech/glide/load/resource/d/b;-><init>(Lcom/bumptech/glide/load/resource/d/a;)V

    :cond_1
    return-object v1

    .line 2111
    :cond_2
    :try_start_1
    new-instance v5, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/b;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v6, p0, Lcom/bumptech/glide/load/resource/d/c;->e:Lcom/bumptech/glide/load/b/a/e;

    invoke-direct {v5, v0, v6}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)V

    .line 2112
    new-instance v0, Lcom/bumptech/glide/load/resource/d/a;

    const/4 v6, 0x0

    invoke-direct {v0, v5, v6}, Lcom/bumptech/glide/load/resource/d/a;-><init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/i/a;->a([B)Z

    throw v0

    .line 1073
    :cond_3
    :try_start_2
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/d/c;->b(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/resource/d/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private b(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/resource/d/a;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 119
    .line 121
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/c;->c:Lcom/bumptech/glide/load/e;

    invoke-interface {v0, p1, p2, p3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v2

    .line 122
    if-eqz v2, :cond_0

    .line 123
    new-instance v0, Lcom/bumptech/glide/load/resource/d/a;

    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/resource/d/a;-><init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V

    .line 126
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 22
    check-cast p1, Lcom/bumptech/glide/load/c/j;

    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/d/c;->a(Lcom/bumptech/glide/load/c/j;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/c;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/d/c;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v1}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/d/c;->c:Lcom/bumptech/glide/load/e;

    invoke-interface {v1}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/d/c;->h:Ljava/lang/String;

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/c;->h:Ljava/lang/String;

    return-object v0
.end method
