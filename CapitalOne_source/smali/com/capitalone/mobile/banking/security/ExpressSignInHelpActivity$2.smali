.class Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$2;
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
    .line 57
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 61
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    # invokes: Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->doBackAction()V
    invoke-static {v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;)V

    .line 62
    return-void
.end method
