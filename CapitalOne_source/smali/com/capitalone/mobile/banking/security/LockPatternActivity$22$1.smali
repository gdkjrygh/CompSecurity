.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$1;
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
    .line 770
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$1;->this$1:Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 774
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 775
    return-void
.end method
