.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/LockPatternActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 149
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 150
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "LockPatternAction"

    const-string v2, "ReturnToHome"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const/16 v2, 0x7d0

    invoke-virtual {v1, v2, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 152
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 153
    return-void
.end method
