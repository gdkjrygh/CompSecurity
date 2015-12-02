.class Lcom/facebook/debug/f/b;
.super Landroid/content/BroadcastReceiver;
.source "UiThreadWatchdog.java"


# instance fields
.field final synthetic a:Lcom/facebook/debug/f/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/debug/f/b;->a:Lcom/facebook/debug/f/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/debug/f/b;->a:Lcom/facebook/debug/f/a;

    invoke-static {v0}, Lcom/facebook/debug/f/a;->a(Lcom/facebook/debug/f/a;)V

    .line 79
    return-void
.end method
