.class Lcom/facebook/debug/a/b;
.super Ljava/lang/Object;
.source "ActivityTracer.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field final synthetic a:Lcom/facebook/debug/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/a/a;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/debug/a/b;->a:Lcom/facebook/debug/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 4

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/debug/a/b;->a:Lcom/facebook/debug/a/a;

    invoke-static {v0}, Lcom/facebook/debug/a/a;->a(Lcom/facebook/debug/a/a;)Lcom/facebook/debug/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/facebook/debug/a/b;->a:Lcom/facebook/debug/a/a;

    invoke-static {v0}, Lcom/facebook/debug/a/a;->a(Lcom/facebook/debug/a/a;)Lcom/facebook/debug/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v0

    .line 71
    const-wide/16 v2, 0x14

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 72
    invoke-static {}, Lcom/facebook/debug/a/a;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 77
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    invoke-static {}, Lcom/facebook/debug/d/e;->b()V

    goto :goto_0
.end method
