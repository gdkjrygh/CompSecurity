.class Lcom/facebook/orca/threadlist/an;
.super Ljava/lang/Object;
.source "ThreadListEmptyView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 104
    new-instance v2, Lcom/facebook/user/UserWithIdentifier;

    iget-object v0, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 108
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v3, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 109
    const-string v1, "to"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 111
    const-string v1, "focus_compose"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 112
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 114
    iget-object v1, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->b(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)Lcom/facebook/c/s;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/threadlist/an;->a:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v2}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 115
    return-void
.end method
