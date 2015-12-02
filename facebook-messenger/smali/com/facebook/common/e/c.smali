.class final Lcom/facebook/common/e/c;
.super Ljava/lang/Object;
.source "ErrorReporting.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/facebook/common/e/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/common/e/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/common/e/c;->c:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 146
    :try_start_0
    const-class v1, Lcom/facebook/common/e/b;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :try_start_1
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    .line 148
    const-string v2, "soft_error_category"

    iget-object v3, p0, Lcom/facebook/common/e/c;->a:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    const-string v2, "soft_error_message"

    iget-object v3, p0, Lcom/facebook/common/e/c;->b:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    iget-object v2, p0, Lcom/facebook/common/e/c;->c:Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/Throwable;)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    .line 153
    const-string v2, "soft_error_category"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    const-string v2, "soft_error_message"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    monitor-exit v1

    .line 159
    :goto_0
    return-void

    .line 155
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 156
    :catch_0
    move-exception v0

    goto :goto_0
.end method
