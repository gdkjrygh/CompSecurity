.class public Lcom/facebook/common/m/a;
.super Ljava/lang/Object;
.source "DNSResolver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public static a(Ljava/lang/String;J)Ljava/net/InetAddress;
    .locals 3

    .prologue
    .line 62
    new-instance v0, Lcom/facebook/common/m/b;

    invoke-direct {v0, p0}, Lcom/facebook/common/m/b;-><init>(Ljava/lang/String;)V

    .line 63
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 64
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 67
    :try_start_0
    invoke-virtual {v1, p1, p2}, Ljava/lang/Thread;->join(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/common/m/b;->a()Ljava/net/InetAddress;

    move-result-object v2

    .line 73
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 75
    if-nez v2, :cond_0

    .line 76
    new-instance v1, Lcom/facebook/common/m/d;

    invoke-virtual {v0}, Lcom/facebook/common/m/b;->b()Lcom/facebook/common/m/c;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/common/m/d;-><init>(Lcom/facebook/common/m/c;)V

    throw v1

    .line 68
    :catch_0
    move-exception v2

    goto :goto_0

    .line 79
    :cond_0
    return-object v2
.end method
