.class final Lcom/cleanmaster/sdk/cmloginsdkjar/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

.field private final b:Landroid/os/Handler;

.field private final c:J

.field private d:J

.field private e:J

.field private f:J


# direct methods
.method constructor <init>(Landroid/os/Handler;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 2

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 14
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->b:Landroid/os/Handler;

    .line 16
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getOnProgressThreshold()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->c:J

    .line 17
    return-void
.end method


# virtual methods
.method final a()V
    .locals 8

    .prologue
    .line 40
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getCallback()Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    move-result-object v3

    .line 42
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->f:J

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    instance-of v0, v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

    if-eqz v0, :cond_0

    .line 44
    iget-wide v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    .line 45
    iget-wide v6, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->f:J

    .line 46
    check-cast v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

    .line 47
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->b:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 48
    invoke-interface {v3, v4, v5, v6, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;->onProgress(JJ)V

    .line 58
    :goto_0
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->e:J

    .line 61
    :cond_0
    return-void

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->b:Landroid/os/Handler;

    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/ac;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;JJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method final a(J)V
    .locals 7

    .prologue
    .line 28
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    .line 30
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->e:J

    iget-wide v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->c:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->d:J

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->f:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->a()V

    .line 33
    :cond_1
    return-void
.end method

.method final b(J)V
    .locals 3

    .prologue
    .line 36
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->f:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->f:J

    .line 37
    return-void
.end method
