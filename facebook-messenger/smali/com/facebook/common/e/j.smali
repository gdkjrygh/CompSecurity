.class Lcom/facebook/common/e/j;
.super Ljava/lang/Object;
.source "FbErrorReporterImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/Throwable;

.field final synthetic d:Lcom/facebook/common/e/i;


# direct methods
.method constructor <init>(Lcom/facebook/common/e/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/common/e/j;->d:Lcom/facebook/common/e/i;

    iput-object p2, p0, Lcom/facebook/common/e/j;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/common/e/j;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/common/e/j;->c:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 118
    :try_start_0
    const-class v1, Lcom/facebook/common/e/b;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/e/j;->d:Lcom/facebook/common/e/i;

    invoke-static {v0}, Lcom/facebook/common/e/i;->a(Lcom/facebook/common/e/i;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/acra/ErrorReporter;

    .line 120
    const-string v2, "soft_error_category"

    iget-object v3, p0, Lcom/facebook/common/e/j;->a:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    const-string v2, "soft_error_message"

    iget-object v3, p0, Lcom/facebook/common/e/j;->b:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    iget-object v2, p0, Lcom/facebook/common/e/j;->c:Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/Throwable;)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    .line 125
    const-string v2, "soft_error_category"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    const-string v2, "soft_error_message"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    monitor-exit v1

    .line 135
    :cond_0
    :goto_0
    return-void

    .line 127
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 128
    :catch_0
    move-exception v0

    .line 131
    iget-object v1, p0, Lcom/facebook/common/e/j;->d:Lcom/facebook/common/e/i;

    invoke-static {v1}, Lcom/facebook/common/e/i;->b(Lcom/facebook/common/e/i;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 132
    invoke-static {v0}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    goto :goto_0
.end method
