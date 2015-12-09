.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$2;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;)V
    .locals 0

    .prologue
    .line 783
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$2;->this$1:Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 788
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$2;->this$1:Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuList:Landroid/view/View;
    invoke-static {v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$700(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 789
    return-void
.end method
