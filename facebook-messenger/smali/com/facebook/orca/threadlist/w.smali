.class Lcom/facebook/orca/threadlist/w;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 952
    iput-object p1, p0, Lcom/facebook/orca/threadlist/w;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 2

    .prologue
    .line 955
    iget-object v0, p0, Lcom/facebook/orca/threadlist/w;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->i(Lcom/facebook/orca/threadlist/t;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 956
    invoke-static {}, Lcom/facebook/orca/threadlist/t;->y()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Thread list was loaded and ui thread is idle. ensuring divebar."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 957
    iget-object v0, p0, Lcom/facebook/orca/threadlist/w;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->f(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->k()V

    .line 959
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
