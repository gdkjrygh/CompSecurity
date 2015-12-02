.class Lcom/facebook/orca/messageview/e;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"

# interfaces
.implements Lcom/facebook/zero/ui/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/MessageViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/facebook/orca/messageview/e;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/orca/messageview/e;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    check-cast p1, Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Lcom/facebook/orca/messageview/MessageViewFragment;Landroid/content/Intent;)V

    .line 175
    return-void
.end method

.method public b(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 179
    return-void
.end method
