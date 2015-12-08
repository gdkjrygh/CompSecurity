.class final Lcom/EnterpriseMobileBanking/AppHelper$16;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->switchProducts()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 756
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 759
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v1

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getLastLob()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 760
    .local v0, "showBack":Z
    :goto_0
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchProducts(Z)V

    .line 761
    return-void

    .line 759
    .end local v0    # "showBack":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
