.class Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;
.super Ljava/lang/Object;
.source "BusyJSI.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

.field final synthetic val$onCancelListener:Landroid/content/DialogInterface$OnCancelListener;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;->val$onCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 65
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->spinner:Landroid/app/ProgressDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->access$000()Landroid/app/ProgressDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 66
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI$2;->val$onCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 67
    return-void
.end method
