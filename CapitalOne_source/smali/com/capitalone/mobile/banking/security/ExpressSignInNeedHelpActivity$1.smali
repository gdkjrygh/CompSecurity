.class Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;
.super Ljava/lang/Object;
.source "ExpressSignInNeedHelpActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 39
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    const-class v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 40
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "SuppressSplash"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 41
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    invoke-virtual {v1, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->startActivity(Landroid/content/Intent;)V

    .line 42
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    const/4 v2, 0x0

    const v3, 0x7f040004

    invoke-virtual {v1, v2, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->overridePendingTransition(II)V

    .line 43
    return-void
.end method
