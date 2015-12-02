.class Lcom/facebook/orca/threadlist/ac;
.super Lcom/facebook/widget/titlebar/b;
.source "ThreadListActivityDelegate.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 383
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ac;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Lcom/facebook/widget/titlebar/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/titlebar/d;)V
    .locals 2

    .prologue
    .line 386
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ac;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->f(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->g()V

    .line 389
    :cond_0
    return-void
.end method
