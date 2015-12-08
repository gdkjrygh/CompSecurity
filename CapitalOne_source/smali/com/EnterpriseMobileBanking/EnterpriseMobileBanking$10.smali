.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$10;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->initEula()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0

    .prologue
    .line 682
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$10;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 687
    const-string v1, "SP_EULA_IS_ACCEPTED_VERSION"

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 690
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$10;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f0800a3

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 692
    .local v0, "eulaLayout":Landroid/view/View;
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 693
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewManager;

    invoke-interface {v1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 695
    return-void
.end method
