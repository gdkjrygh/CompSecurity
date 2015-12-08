.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$30;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onResume()V
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
    .line 2227
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$30;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2231
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->getBusy()Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    move-result-object v0

    .line 2232
    .local v0, "cofBusy":Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
    if-eqz v0, :cond_0

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1800()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2234
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->forceHide()V

    .line 2236
    :cond_0
    return-void
.end method
