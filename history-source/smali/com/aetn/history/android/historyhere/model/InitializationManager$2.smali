.class Lcom/aetn/history/android/historyhere/model/InitializationManager$2;
.super Ljava/lang/Object;
.source "InitializationManager.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadConfig()V
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
    .line 132
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$2;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigLoaded()V
    .locals 2

    .prologue
    .line 135
    const-string v0, "InitializationManager"

    const-string v1, "onConfigLoaded: successfully loaded the config"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$2;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->initDataBaseLoad()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$200(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 138
    return-void
.end method
