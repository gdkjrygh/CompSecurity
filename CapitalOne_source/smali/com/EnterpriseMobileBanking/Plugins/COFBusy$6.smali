.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->forceHide()V
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
    .line 172
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 176
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->hide()V

    .line 177
    return-void
.end method
