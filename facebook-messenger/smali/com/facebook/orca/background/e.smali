.class Lcom/facebook/orca/background/e;
.super Landroid/content/BroadcastReceiver;
.source "FetchThreadsIntoMemoryCacheBackgroundTask.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/d;


# direct methods
.method constructor <init>(Lcom/facebook/orca/background/d;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/orca/background/e;->a:Lcom/facebook/orca/background/d;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 80
    const-string v0, "threads"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/facebook/orca/background/e;->a:Lcom/facebook/orca/background/d;

    invoke-static {v1, v0}, Lcom/facebook/orca/background/d;->a(Lcom/facebook/orca/background/d;Ljava/util/List;)V

    .line 82
    return-void
.end method
