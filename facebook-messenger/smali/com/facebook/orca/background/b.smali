.class Lcom/facebook/orca/background/b;
.super Landroid/content/BroadcastReceiver;
.source "FetchOutOfDateThreadsBackgroundTask.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/background/a;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/background/b;->a:Lcom/facebook/orca/background/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/background/b;->a:Lcom/facebook/orca/background/a;

    invoke-static {v0}, Lcom/facebook/orca/background/a;->a(Lcom/facebook/orca/background/a;)V

    .line 75
    return-void
.end method
