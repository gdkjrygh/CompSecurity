.class Lcom/facebook/orca/messageview/j;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/orca/k/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/MessageViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 494
    iput-object p1, p0, Lcom/facebook/orca/messageview/j;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/k/d;)V
    .locals 3

    .prologue
    .line 497
    iget-object v0, p0, Lcom/facebook/orca/messageview/j;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Lcom/facebook/orca/messageview/MessageViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 498
    iget-object v0, p0, Lcom/facebook/orca/messageview/j;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->d(Lcom/facebook/orca/messageview/MessageViewFragment;)Lcom/facebook/orca/common/ui/a/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/k/d;->a()Lcom/facebook/location/g;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/k/d;->b()Lcom/facebook/location/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/location/g;Lcom/facebook/location/g;)Ljava/lang/String;

    move-result-object v0

    .line 502
    if-eqz v0, :cond_0

    .line 503
    iget-object v1, p0, Lcom/facebook/orca/messageview/j;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-static {v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->e(Lcom/facebook/orca/messageview/MessageViewFragment;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 494
    check-cast p1, Lcom/facebook/orca/k/d;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/messageview/j;->a(Lcom/facebook/orca/k/d;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 509
    iget-object v0, p0, Lcom/facebook/orca/messageview/j;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Lcom/facebook/orca/messageview/MessageViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 510
    return-void
.end method
