.class Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity$1;
.super Ljava/lang/Object;
.source "ExpressSignInConfirmationActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 36
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->finish()V

    .line 37
    return-void
.end method
