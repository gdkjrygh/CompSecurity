.class final Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$15;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearAllMenuItems()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1019
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1023
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->clearLastMenu()V

    .line 1024
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$800()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1026
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1000()Landroid/widget/ArrayAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 1027
    return-void
.end method
