.class public Lcom/facebook/http/protocol/ad;
.super Lcom/facebook/http/protocol/ab;
.source "DataStreamBody.java"


# instance fields
.field private final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-direct {p0, p2, v0, p3}, Lcom/facebook/http/protocol/ab;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 20
    iput-object p1, p0, Lcom/facebook/http/protocol/ad;->a:Ljava/io/File;

    .line 21
    return-void
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/facebook/http/protocol/ad;->a:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 27
    :try_start_0
    invoke-static {v0, p1}, Lcom/google/common/b/a;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 31
    return-void

    .line 29
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v1
.end method
