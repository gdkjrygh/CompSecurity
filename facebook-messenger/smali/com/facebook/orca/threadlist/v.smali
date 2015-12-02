.class Lcom/facebook/orca/threadlist/v;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/orca/nux/t;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 551
    iput-object p1, p0, Lcom/facebook/orca/threadlist/v;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 554
    iget-object v0, p0, Lcom/facebook/orca/threadlist/v;->a:Lcom/facebook/orca/threadlist/t;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/t;->e(I)V

    .line 555
    return-void
.end method
