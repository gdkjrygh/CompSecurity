.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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
    .line 272
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 275
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 276
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 277
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const/16 v2, 0x7d0

    invoke-virtual {v1, v2, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 278
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 279
    return-void
.end method
