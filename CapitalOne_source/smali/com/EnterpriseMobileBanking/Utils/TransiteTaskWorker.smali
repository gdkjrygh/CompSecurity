.class public Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;
.super Ljava/lang/Object;
.source "TransiteTaskWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "TransiteTaskWorker"

.field private static callbackIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/EnterpriseMobileBanking/Utils/CallbackTask;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private view:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    .line 18
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    .line 19
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 20
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    .line 24
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    .line 25
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 26
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 27
    return-void
.end method


# virtual methods
.method public processCallback(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    .locals 3
    .param p1, "callback"    # Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    .prologue
    .line 30
    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    monitor-enter v1

    .line 31
    :try_start_0
    const-string v0, "TransiteTaskWorker"

    const-string v2, "Adding a callback"

    invoke-static {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    sget-object v0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object v0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 35
    monitor-exit v1

    .line 36
    return-void

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 6

    .prologue
    .line 40
    sget-object v3, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    monitor-enter v3

    .line 42
    :try_start_0
    const-string v2, "TransiteTaskWorker"

    const-string v4, "Running innerWebViewTask"

    invoke-static {v2, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    if-eqz v2, :cond_1

    .line 45
    const-string v2, "TransiteTaskWorker"

    const-string v4, "Looping"

    invoke-static {v2, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    sget-object v2, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 50
    :try_start_1
    const-string v2, "TransiteTaskWorker"

    const-string v4, "Waiting for callback"

    invoke-static {v2, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    sget-object v2, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    :cond_0
    :goto_1
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 58
    sget-object v2, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->callbackIds:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    .line 60
    .local v1, "nextCB":Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    const-string v2, "TransiteTaskWorker"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Processing callback: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->getCallbackId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Utils/TransiteTaskWorker;->view:Landroid/webkit/WebView;

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->execute(Landroid/webkit/WebView;)V

    goto :goto_0

    .line 67
    .end local v1    # "nextCB":Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 53
    :catch_0
    move-exception v0

    .line 54
    .local v0, "e":Ljava/lang/InterruptedException;
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1

    .line 65
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :cond_1
    const-string v2, "TransiteTaskWorker"

    const-string v4, "Done innerWebViewTask"

    invoke-static {v2, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    return-void
.end method
