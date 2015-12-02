.class Lcom/facebook/backgroundtasks/l;
.super Landroid/content/BroadcastReceiver;
.source "BackgroundTaskRunner.java"


# instance fields
.field final synthetic a:Lcom/facebook/backgroundtasks/j;


# direct methods
.method constructor <init>(Lcom/facebook/backgroundtasks/j;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/facebook/backgroundtasks/l;->a:Lcom/facebook/backgroundtasks/j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/facebook/backgroundtasks/l;->a:Lcom/facebook/backgroundtasks/j;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/j;->c()V

    .line 191
    return-void
.end method
