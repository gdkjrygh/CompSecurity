.class public Lcom/mopub/mobileads/util/HttpClients;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static safeShutdown(Lorg/apache/http/client/HttpClient;)V
    .locals 2

    .prologue
    .line 7
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/mopub/mobileads/util/a;

    invoke-direct {v1, p0}, Lcom/mopub/mobileads/util/a;-><init>(Lorg/apache/http/client/HttpClient;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 15
    return-void
.end method
