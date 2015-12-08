.class Lcom/jirbo/adcolony/aa$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/Runnable;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 125
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/aa$a;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/aa$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/aa$a;->a:Ljava/lang/Runnable;

    .line 141
    :cond_0
    sget-boolean v0, Lcom/jirbo/adcolony/aa;->f:Z

    if-eqz v0, :cond_1

    return-void

    .line 131
    :catch_0
    move-exception v0

    .line 133
    const-string v1, "Exception caught in reusable thread."

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->e(Ljava/lang/String;)V

    .line 134
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->e(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V

    goto :goto_1

    .line 143
    :cond_1
    monitor-enter p0

    .line 145
    :try_start_1
    sget-object v1, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :try_start_2
    sget-object v0, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 152
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    :goto_2
    :try_start_4
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 148
    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method
