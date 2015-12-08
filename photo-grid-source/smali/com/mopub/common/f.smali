.class final Lcom/mopub/common/f;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/common/DiskLruCache$Editor;


# direct methods
.method private constructor <init>(Lcom/mopub/common/DiskLruCache$Editor;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 839
    iput-object p1, p0, Lcom/mopub/common/f;->a:Lcom/mopub/common/DiskLruCache$Editor;

    .line 840
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 841
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/DiskLruCache$Editor;Ljava/io/OutputStream;B)V
    .locals 0

    .prologue
    .line 838
    invoke-direct {p0, p1, p2}, Lcom/mopub/common/f;-><init>(Lcom/mopub/common/DiskLruCache$Editor;Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .prologue
    .line 861
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/f;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 865
    :goto_0
    return-void

    .line 863
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mopub/common/f;->a:Lcom/mopub/common/DiskLruCache$Editor;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache$Editor;->c(Lcom/mopub/common/DiskLruCache$Editor;)Z

    goto :goto_0
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 869
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/f;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 873
    :goto_0
    return-void

    .line 871
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mopub/common/f;->a:Lcom/mopub/common/DiskLruCache$Editor;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache$Editor;->c(Lcom/mopub/common/DiskLruCache$Editor;)Z

    goto :goto_0
.end method

.method public final write(I)V
    .locals 1

    .prologue
    .line 845
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/f;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 849
    :goto_0
    return-void

    .line 847
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mopub/common/f;->a:Lcom/mopub/common/DiskLruCache$Editor;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache$Editor;->c(Lcom/mopub/common/DiskLruCache$Editor;)Z

    goto :goto_0
.end method

.method public final write([BII)V
    .locals 1

    .prologue
    .line 853
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/f;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 857
    :goto_0
    return-void

    .line 855
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mopub/common/f;->a:Lcom/mopub/common/DiskLruCache$Editor;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache$Editor;->c(Lcom/mopub/common/DiskLruCache$Editor;)Z

    goto :goto_0
.end method
