.class Lcom/facebook/orca/messageview/h;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/MessageViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/orca/messageview/h;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 320
    iget-object v0, p0, Lcom/facebook/orca/messageview/h;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->c(Lcom/facebook/orca/messageview/MessageViewFragment;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/messageview/h;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/messageview/MessageViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V

    .line 322
    return-void
.end method
