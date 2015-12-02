.class Lcom/facebook/debug/f/e;
.super Ljava/lang/Object;
.source "UiThreadWatchdog.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field final synthetic a:Lcom/facebook/debug/f/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/facebook/debug/f/e;->a:Lcom/facebook/debug/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/debug/f/e;->a:Lcom/facebook/debug/f/a;

    invoke-static {v0}, Lcom/facebook/debug/f/a;->d(Lcom/facebook/debug/f/a;)V

    .line 136
    iget-object v0, p0, Lcom/facebook/debug/f/e;->a:Lcom/facebook/debug/f/a;

    invoke-static {v0}, Lcom/facebook/debug/f/a;->e(Lcom/facebook/debug/f/a;)Z

    move-result v0

    return v0
.end method
