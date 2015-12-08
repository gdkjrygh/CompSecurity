.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/capitalone/mobile/banking/security/LockPatternActivity;
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
    .line 663
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 669
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const v3, 0x7f090065

    invoke-virtual {v2, v3}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v3, v3, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v3}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 670
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # invokes: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->initConfirmPattern()V
    invoke-static {v2}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$300(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    .line 689
    :goto_0
    return-void

    .line 672
    :cond_0
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLastPattern:Ljava/util/List;
    invoke-static {v2}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$400(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToStringValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 673
    .local v1, "patternVal":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 675
    .local v0, "i":Landroid/content/Intent;
    const-string v2, "mypattern"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 677
    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$500()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LockPatternAction = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v4}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    const-string v2, "LockPatternAction"

    const-string v3, "create"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 681
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->isSlideUpOffer:Ljava/lang/String;
    invoke-static {v2}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$600(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "true"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 682
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const/16 v3, 0x15b3

    invoke-virtual {v2, v3, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 687
    :goto_1
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    goto :goto_0

    .line 684
    :cond_1
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const/16 v3, 0x7d0

    invoke-virtual {v2, v3, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_1
.end method
