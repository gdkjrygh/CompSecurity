.class Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;
.super Ljava/lang/Object;
.source "ExpressSignInHelpActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 51
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 52
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "LockPatternAction"

    const-string v2, "ReturnToHome"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    const/16 v2, 0x7d0

    invoke-virtual {v1, v2, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->setResult(ILandroid/content/Intent;)V

    .line 54
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->finish()V

    .line 55
    return-void
.end method
