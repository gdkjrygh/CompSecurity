.class Lcom/facebook/orca/d/an;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lcom/facebook/orca/d/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/af;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 316
    iput-object p1, p0, Lcom/facebook/orca/d/an;->b:Lcom/facebook/orca/d/af;

    iput-object p2, p0, Lcom/facebook/orca/d/an;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 320
    iget-object v0, p0, Lcom/facebook/orca/d/an;->b:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->j(Lcom/facebook/orca/d/af;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_recording_failed"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "error_message"

    iget-object v3, p0, Lcom/facebook/orca/d/an;->a:Ljava/lang/Throwable;

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 325
    iget-object v0, p0, Lcom/facebook/orca/d/an;->b:Lcom/facebook/orca/d/af;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/af;Z)Z

    .line 326
    iget-object v0, p0, Lcom/facebook/orca/d/an;->b:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/d/ao;->c()V

    .line 327
    return-void
.end method
