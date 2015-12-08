.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;

.field final synthetic val$relContainer:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;->this$1:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;->val$relContainer:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 210
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;->val$relContainer:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;->this$1:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;

    iget-object v2, v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f080023

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;->this$1:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;

    iget-object v3, v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$300(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;-><init>(ILandroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 211
    return-void
.end method
