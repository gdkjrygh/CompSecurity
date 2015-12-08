.class Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$3;
.super Ljava/lang/Object;
.source "ExpressSignInIntroActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 126
    return-void
.end method
