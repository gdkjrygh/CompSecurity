.class final Lcom/cleanmaster/sdk/cmloginsdkjar/c;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/ab;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/ac;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

.field private final c:J

.field private d:J

.field private e:J

.field private f:J

.field private g:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

.field private h:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/util/Map;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            "Ljava/util/Map",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/ac;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 21
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    .line 22
    iput-object p3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a:Ljava/util/Map;

    .line 23
    iput-wide p4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->f:J

    .line 25
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getOnProgressThreshold()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->c:J

    .line 26
    return-void
.end method

.method static synthetic a(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    return-object v0
.end method

.method private a()V
    .locals 7

    .prologue
    .line 41
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 42
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;

    .line 43
    instance-of v1, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

    if-eqz v1, :cond_0

    .line 44
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v1

    .line 47
    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

    .line 48
    if-nez v1, :cond_1

    .line 49
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    iget-wide v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->f:J

    invoke-interface/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;->onBatchProgress(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;JJ)V

    goto :goto_0

    .line 52
    :cond_1
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/d;

    invoke-direct {v2, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/d;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/c;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 62
    :cond_2
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->e:J

    .line 64
    :cond_3
    return-void
.end method

.method private a(J)V
    .locals 7

    .prologue
    .line 29
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->g:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->g:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    invoke-virtual {v0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->a(J)V

    .line 33
    :cond_0
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    .line 35
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->e:J

    iget-wide v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->c:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->f:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a()V

    .line 38
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)J
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->d:J

    return-wide v0
.end method

.method private b()Z
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->h:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->h:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 70
    const/4 v0, 0x1

    .line 73
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)J
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->f:J

    return-wide v0
.end method


# virtual methods
.method public final a(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 1

    .prologue
    .line 77
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    :goto_0
    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->g:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    .line 78
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->h:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 79
    return-void

    .line 77
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final close()V
    .locals 2

    .prologue
    .line 118
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 120
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    .line 121
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->a()V

    goto :goto_0

    .line 124
    :cond_0
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a()V

    .line 125
    return-void
.end method

.method public final write(I)V
    .locals 2

    .prologue
    .line 109
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    :goto_0
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 113
    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a(J)V

    goto :goto_0
.end method

.method public final write([B)V
    .locals 2

    .prologue
    .line 91
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    :goto_0
    return-void

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 95
    array-length v0, p1

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a(J)V

    goto :goto_0
.end method

.method public final write([BII)V
    .locals 2

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    :goto_0
    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 104
    int-to-long v0, p3

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a(J)V

    goto :goto_0
.end method
