.class Lcom/facebook/orca/threadlist/ae;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 498
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ae;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .prologue
    .line 501
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ae;->a:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;Z)Z

    .line 502
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 498
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/ae;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 506
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ae;->a:Lcom/facebook/orca/threadlist/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;Z)Z

    .line 507
    return-void
.end method
