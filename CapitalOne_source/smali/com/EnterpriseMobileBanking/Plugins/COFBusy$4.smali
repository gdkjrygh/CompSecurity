.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->_buildSpinner()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 125
    const-string v0, "COFBusy"

    const-string v1, "setOnClickListener called..."

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$200(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$200(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;->callbackCall()V

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 131
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    const/4 v1, 0x1

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z
    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$102(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;Z)Z

    .line 132
    return-void
.end method
