.class Lcom/facebook/auth/login/ag;
.super Ljava/lang/Object;
.source "GenericLoginApprovalViewGroup.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/auth/login/ag;->a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/facebook/auth/login/ag;->a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->onLoginClick()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->access$000(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V

    .line 66
    const/4 v0, 0x1

    .line 68
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
