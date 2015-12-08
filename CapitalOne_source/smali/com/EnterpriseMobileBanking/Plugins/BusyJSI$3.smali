.class final Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$3;
.super Ljava/lang/Object;
.source "BusyJSI.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceHide()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 102
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->access$000()Landroid/app/ProgressDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 103
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->access$000()Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->hide()V

    .line 104
    return-void
.end method
