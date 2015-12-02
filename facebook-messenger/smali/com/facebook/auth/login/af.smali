.class Lcom/facebook/auth/login/af;
.super Ljava/lang/Object;
.source "GenericLoginApprovalViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/auth/login/af;->a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/auth/login/af;->a:Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->onLoginClick()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->access$000(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V

    .line 59
    return-void
.end method
