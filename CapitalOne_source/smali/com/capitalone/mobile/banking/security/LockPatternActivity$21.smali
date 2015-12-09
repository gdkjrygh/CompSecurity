.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;
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
    .line 699
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 703
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const-class v2, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 705
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const v2, 0x4c2ac11

    invoke-virtual {v1, v0, v2}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 707
    return-void
.end method
