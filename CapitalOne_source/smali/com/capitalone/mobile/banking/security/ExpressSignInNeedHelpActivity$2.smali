.class Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$2;
.super Ljava/lang/Object;
.source "ExpressSignInNeedHelpActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->onStart()V
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
    .line 98
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 102
    return-void
.end method
