.class public final Lcom/google/common/b/f;
.super Ljava/lang/Object;
.source "Files.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;)Lcom/google/common/b/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/google/common/b/i",
            "<",
            "Ljava/io/FileInputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 96
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    new-instance v0, Lcom/google/common/b/g;

    invoke-direct {v0, p0}, Lcom/google/common/b/g;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public static a(Ljava/io/File;Z)Lcom/google/common/b/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Z)",
            "Lcom/google/common/b/j",
            "<",
            "Ljava/io/FileOutputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    new-instance v0, Lcom/google/common/b/h;

    invoke-direct {v0, p0, p1}, Lcom/google/common/b/h;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public static a(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;
    .locals 3

    .prologue
    .line 69
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v0
.end method

.method public static a(Lcom/google/common/b/i;Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/b/i",
            "<+",
            "Ljava/io/InputStream;",
            ">;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .prologue
    .line 231
    invoke-static {p1}, Lcom/google/common/b/f;->b(Ljava/io/File;)Lcom/google/common/b/j;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/common/b/a;->a(Lcom/google/common/b/i;Lcom/google/common/b/j;)J

    .line 232
    return-void
.end method

.method public static b(Ljava/io/File;)Lcom/google/common/b/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/google/common/b/j",
            "<",
            "Ljava/io/FileOutputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 114
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/common/b/f;->a(Ljava/io/File;Z)Lcom/google/common/b/j;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 218
    new-instance v0, Ljava/lang/String;

    invoke-static {p0}, Lcom/google/common/b/f;->c(Ljava/io/File;)[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static c(Ljava/io/File;)[B
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 189
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/32 v5, 0x7fffffff

    cmp-long v0, v3, v5

    if-gtz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 190
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-nez v0, :cond_1

    .line 192
    invoke-static {p0}, Lcom/google/common/b/f;->a(Ljava/io/File;)Lcom/google/common/b/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/b/a;->a(Lcom/google/common/b/i;)[B

    move-result-object v0

    .line 204
    :goto_1
    return-object v0

    :cond_0
    move v0, v2

    .line 189
    goto :goto_0

    .line 195
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-int v0, v3

    new-array v0, v0, [B

    .line 197
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 199
    :try_start_0
    invoke-static {v3, v0}, Lcom/google/common/b/a;->a(Ljava/io/InputStream;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    invoke-static {v3, v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v3, v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    throw v0
.end method
