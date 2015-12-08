.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$10;
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
    .line 358
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$10;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 361
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 362
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$10;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 363
    return-void
.end method
