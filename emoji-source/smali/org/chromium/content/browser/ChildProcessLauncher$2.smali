.class final Lorg/chromium/content/browser/ChildProcessLauncher$2;
.super Ljava/lang/Object;
.source "ChildProcessLauncher.java"

# interfaces
.implements Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ChildProcessLauncher;->triggerConnectionSetup(Lorg/chromium/content/browser/ChildProcessConnection;[Ljava/lang/String;I[Lorg/chromium/content/browser/FileDescriptorInfo;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$clientContext:J

.field final synthetic val$connection:Lorg/chromium/content/browser/ChildProcessConnection;


# direct methods
.method constructor <init>(JLorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 1

    .prologue
    .line 402
    iput-wide p1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$clientContext:J

    iput-object p3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(I)V
    .locals 4
    .param p1, "pid"    # I

    .prologue
    .line 405
    const-string v0, "ChildProcessLauncher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "on connect callback, pid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " context="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$clientContext:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 406
    if-eqz p1, :cond_0

    .line 407
    # getter for: Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;
    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$100()Lorg/chromium/content/browser/BindingManager;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0, p1, v1}, Lorg/chromium/content/browser/BindingManager;->addNewConnection(ILorg/chromium/content/browser/ChildProcessConnection;)V

    .line 408
    # getter for: Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;
    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$200()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$clientContext:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 414
    iget-wide v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$2;->val$clientContext:J

    # invokes: Lorg/chromium/content/browser/ChildProcessLauncher;->nativeOnChildProcessStarted(JI)V
    invoke-static {v0, v1, p1}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$300(JI)V

    .line 416
    :cond_1
    return-void
.end method
