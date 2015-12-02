.class public Lcom/facebook/http/protocol/ah;
.super Ljava/lang/Object;
.source "HttpRequestAbortHandler.java"


# instance fields
.field private a:Lorg/apache/http/client/methods/HttpUriRequest;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lorg/apache/http/client/methods/HttpUriRequest;)V
    .locals 1
    .param p1    # Lorg/apache/http/client/methods/HttpUriRequest;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    iput-object p1, p0, Lcom/facebook/http/protocol/ah;->a:Lorg/apache/http/client/methods/HttpUriRequest;

    .line 34
    monitor-exit p0

    .line 35
    return-void

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
