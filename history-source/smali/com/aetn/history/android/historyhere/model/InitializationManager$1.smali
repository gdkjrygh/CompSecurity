.class Lcom/aetn/history/android/historyhere/model/InitializationManager$1;
.super Ljava/lang/Object;
.source "InitializationManager.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/InitializationManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 114
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed()V
    .locals 2

    .prologue
    .line 117
    const-string v0, "InitializationManager"

    const-string v1, "init(): OnPlayServiceInstalledListener: onFailed"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->notifyListenersOnFailedPlayServices()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$000(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 119
    return-void
.end method

.method public onSuccess()V
    .locals 2

    .prologue
    .line 123
    const-string v0, "InitializationManager"

    const-string v1, "init(): OnPlayServiceInstalledListener: onSuccess"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadConfig()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$100(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 125
    return-void
.end method
