.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->_show()V
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
    .line 223
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 227
    const-string v0, "COFBusy"

    const-string v1, "show spinner"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$100(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # invokes: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->reset()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$600(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    .line 239
    :cond_0
    :goto_0
    return-void

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 233
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$400(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 234
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelable:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$700(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$1000(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$800(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelTimeoutSecs:I
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$900(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
