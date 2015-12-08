.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


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
    .line 116
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    .prologue
    .line 119
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v1, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;

    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v3, v3, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v4}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$000(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v4

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;-><init>(ILandroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 120
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v1, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 121
    .local v0, "obs":Landroid/view/ViewTreeObserver;
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 122
    return-void
.end method
