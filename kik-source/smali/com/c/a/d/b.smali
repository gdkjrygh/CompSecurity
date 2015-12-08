.class public abstract Lcom/c/a/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 196
    const/16 v0, 0x1000

    new-array v0, v0, [B

    sput-object v0, Lcom/c/a/d/b;->a:[B

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/c/a/d/a;)J
    .locals 3

    .prologue
    .line 235
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    invoke-static {}, Lcom/c/a/d/f;->a()Lcom/c/a/d/f;

    move-result-object v2

    .line 239
    :try_start_0
    invoke-virtual {p0}, Lcom/c/a/d/b;->a()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/c/a/d/f;->a(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    .line 240
    invoke-virtual {p1}, Lcom/c/a/d/a;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/c/a/d/f;->a(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object v1

    check-cast v1, Ljava/io/OutputStream;

    .line 241
    invoke-static {v0, v1}, Lcom/c/a/d/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 245
    invoke-virtual {v2}, Lcom/c/a/d/f;->close()V

    return-wide v0

    .line 242
    :catch_0
    move-exception v0

    .line 243
    :try_start_1
    invoke-virtual {v2, v0}, Lcom/c/a/d/f;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/a/d/f;->close()V

    throw v0
.end method

.method public abstract a()Ljava/io/InputStream;
.end method
