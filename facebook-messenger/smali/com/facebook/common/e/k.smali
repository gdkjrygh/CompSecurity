.class Lcom/facebook/common/e/k;
.super Ljava/lang/Object;
.source "FbErrorReporterImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/facebook/common/e/i;


# direct methods
.method constructor <init>(Lcom/facebook/common/e/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/facebook/common/e/k;->d:Lcom/facebook/common/e/i;

    iput-object p2, p0, Lcom/facebook/common/e/k;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/common/e/k;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/common/e/k;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 157
    :try_start_0
    const-class v1, Lcom/facebook/common/e/b;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :try_start_1
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    .line 159
    const-string v2, "strict_mode_category"

    iget-object v3, p0, Lcom/facebook/common/e/k;->a:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    const-string v2, "strict_mode_message"

    iget-object v3, p0, Lcom/facebook/common/e/k;->b:Ljava/lang/String;

    const-string v4, "\n"

    const-string v5, "\\n"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    iget-object v2, p0, Lcom/facebook/common/e/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/String;)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    .line 164
    const-string v2, "strict_mode_category"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    const-string v2, "strict_mode_message"

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    monitor-exit v1

    .line 170
    :goto_0
    return-void

    .line 166
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 167
    :catch_0
    move-exception v0

    goto :goto_0
.end method
