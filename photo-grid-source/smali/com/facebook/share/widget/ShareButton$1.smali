.class Lcom/facebook/share/widget/ShareButton$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic this$0:Lcom/facebook/share/widget/ShareButton;


# direct methods
.method constructor <init>(Lcom/facebook/share/widget/ShareButton;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-virtual {v0}, Lcom/facebook/share/widget/ShareButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    new-instance v0, Lcom/facebook/share/widget/ShareDialog;

    iget-object v1, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-virtual {v1}, Lcom/facebook/share/widget/ShareButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-virtual {v2}, Lcom/facebook/share/widget/ShareButton;->getRequestCode()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/support/v4/app/Fragment;I)V

    .line 72
    :goto_0
    iget-object v1, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-virtual {v1}, Lcom/facebook/share/widget/ShareButton;->getShareContent()Lcom/facebook/share/model/ShareContent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/widget/ShareDialog;->show(Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    # invokes: Lcom/facebook/share/widget/ShareButton;->callExternalOnClickListener(Landroid/view/View;)V
    invoke-static {v0, p1}, Lcom/facebook/share/widget/ShareButton;->access$100(Lcom/facebook/share/widget/ShareButton;Landroid/view/View;)V

    .line 74
    return-void

    .line 70
    :cond_0
    new-instance v0, Lcom/facebook/share/widget/ShareDialog;

    iget-object v1, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    # invokes: Lcom/facebook/share/widget/ShareButton;->getActivity()Landroid/app/Activity;
    invoke-static {v1}, Lcom/facebook/share/widget/ShareButton;->access$000(Lcom/facebook/share/widget/ShareButton;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/share/widget/ShareButton$1;->this$0:Lcom/facebook/share/widget/ShareButton;

    invoke-virtual {v2}, Lcom/facebook/share/widget/ShareButton;->getRequestCode()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/app/Activity;I)V

    goto :goto_0
.end method
