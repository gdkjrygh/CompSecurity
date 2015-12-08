.class final Lkik/android/net/communicator/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/f$b;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lkik/android/net/communicator/CommunicatorService;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/CommunicatorService;J)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    iput-wide p2, p0, Lkik/android/net/communicator/f;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 295
    iget-object v2, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {v2, v0}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;Z)Z

    .line 299
    iget-object v2, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {v2}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;)J

    move-result-wide v2

    const-wide/16 v4, 0x4e20

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    move v0, v1

    .line 301
    :cond_0
    iget-object v2, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    iget-wide v4, p0, Lkik/android/net/communicator/f;->a:J

    const-string v3, "Successful connection"

    invoke-static {v2, v4, v5, v0, v3}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JZLjava/lang/String;)V

    .line 302
    iget-object v0, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lkik/android/net/communicator/CommunicatorService;->c(Lkik/android/net/communicator/CommunicatorService;J)J

    .line 306
    iget-object v0, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {v0, v1}, Lkik/android/net/communicator/CommunicatorService;->b(Lkik/android/net/communicator/CommunicatorService;Z)Z

    .line 308
    return-void
.end method

.method public final a(I)V
    .locals 8

    .prologue
    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection limiter going into effect. Server requesting a backoff of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " seconds"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    iget-object v0, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    int-to-long v4, p1

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    add-long/2addr v2, v4

    iget-wide v4, p0, Lkik/android/net/communicator/f;->a:J

    invoke-static {v0, v2, v3, v4, v5}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JJ)V

    .line 325
    return-void
.end method

.method public final a(J)V
    .locals 7

    .prologue
    .line 314
    const-wide/16 v0, 0x2710

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 316
    iget-object v0, p0, Lkik/android/net/communicator/f;->b:Lkik/android/net/communicator/CommunicatorService;

    iget-wide v1, p0, Lkik/android/net/communicator/f;->a:J

    const-string v3, "Failed connection"

    invoke-static/range {v0 .. v5}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JLjava/lang/String;J)V

    .line 317
    return-void
.end method
