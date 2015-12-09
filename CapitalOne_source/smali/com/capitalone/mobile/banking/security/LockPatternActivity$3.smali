.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;
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
    .line 156
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 160
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->strMode:Ljava/lang/String;
    invoke-static {v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$100(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "CLOSE"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 168
    :goto_0
    return-void

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # invokes: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->handleNavigationSideMenu(Landroid/view/View;)V
    invoke-static {v0, p1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$200(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Landroid/view/View;)V

    .line 164
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method
