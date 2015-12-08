.class Ltwitter4j/internal/async/ExecuteThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static logger:Ltwitter4j/internal/logging/Logger;


# instance fields
.field private alive:Z

.field q:Ltwitter4j/internal/async/DispatcherImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 97
    const-class v0, Ltwitter4j/internal/async/ExecuteThread;

    invoke-static {v0}, Ltwitter4j/internal/logging/Logger;->getLogger(Ljava/lang/Class;)Ltwitter4j/internal/logging/Logger;

    move-result-object v0

    sput-object v0, Ltwitter4j/internal/async/ExecuteThread;->logger:Ltwitter4j/internal/logging/Logger;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ltwitter4j/internal/async/DispatcherImpl;I)V
    .locals 2

    .prologue
    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltwitter4j/internal/async/ExecuteThread;->alive:Z

    .line 102
    iput-object p2, p0, Ltwitter4j/internal/async/ExecuteThread;->q:Ltwitter4j/internal/async/DispatcherImpl;

    .line 103
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 112
    :cond_0
    :goto_0
    iget-boolean v0, p0, Ltwitter4j/internal/async/ExecuteThread;->alive:Z

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Ltwitter4j/internal/async/ExecuteThread;->q:Ltwitter4j/internal/async/DispatcherImpl;

    invoke-virtual {v0}, Ltwitter4j/internal/async/DispatcherImpl;->poll()Ljava/lang/Runnable;

    move-result-object v0

    .line 114
    if-eqz v0, :cond_0

    .line 116
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    .line 118
    sget-object v1, Ltwitter4j/internal/async/ExecuteThread;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v2, "Got an exception while running a task:"

    invoke-virtual {v1, v2, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 122
    :cond_1
    return-void
.end method

.method public shutdown()V
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Ltwitter4j/internal/async/ExecuteThread;->alive:Z

    .line 107
    return-void
.end method
