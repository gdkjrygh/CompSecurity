.class Lcom/facebook/orca/threadlist/x;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/base/fragment/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/facebook/orca/threadlist/x;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/orca/threadlist/x;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->b(Lcom/facebook/orca/threadlist/t;)V

    .line 192
    return-void
.end method
