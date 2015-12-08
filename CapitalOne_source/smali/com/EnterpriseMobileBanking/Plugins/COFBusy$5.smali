.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$5;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


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
    .line 136
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$5;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 139
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$5;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$400(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 140
    return-void
.end method
