.class final Lcom/roidapp/baselib/b/e;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/b/d;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/b/d;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 870
    iput-object p1, p0, Lcom/roidapp/baselib/b/e;->a:Lcom/roidapp/baselib/b/d;

    .line 871
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 872
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/b/d;Ljava/io/OutputStream;B)V
    .locals 0

    .prologue
    .line 869
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/b/e;-><init>(Lcom/roidapp/baselib/b/d;Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .prologue
    .line 892
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 896
    :goto_0
    return-void

    .line 894
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->a:Lcom/roidapp/baselib/b/d;

    invoke-static {v0}, Lcom/roidapp/baselib/b/d;->b(Lcom/roidapp/baselib/b/d;)Z

    goto :goto_0
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 900
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 904
    :goto_0
    return-void

    .line 902
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->a:Lcom/roidapp/baselib/b/d;

    invoke-static {v0}, Lcom/roidapp/baselib/b/d;->b(Lcom/roidapp/baselib/b/d;)Z

    goto :goto_0
.end method

.method public final write(I)V
    .locals 1

    .prologue
    .line 876
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 880
    :goto_0
    return-void

    .line 878
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->a:Lcom/roidapp/baselib/b/d;

    invoke-static {v0}, Lcom/roidapp/baselib/b/d;->b(Lcom/roidapp/baselib/b/d;)Z

    goto :goto_0
.end method

.method public final write([BII)V
    .locals 1

    .prologue
    .line 884
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 888
    :goto_0
    return-void

    .line 886
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/baselib/b/e;->a:Lcom/roidapp/baselib/b/d;

    invoke-static {v0}, Lcom/roidapp/baselib/b/d;->b(Lcom/roidapp/baselib/b/d;)Z

    goto :goto_0
.end method
