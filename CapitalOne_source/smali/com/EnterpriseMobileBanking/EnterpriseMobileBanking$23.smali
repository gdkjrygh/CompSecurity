.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
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
    .line 1426
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v6, 0x7f08009d

    const v5, 0x7f080097

    const/16 v4, 0x8

    const/4 v3, 0x1

    .line 1429
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clicked a quick nav: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1430
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    .line 1431
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 1432
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1433
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f08001f

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1434
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a2

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1435
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1450
    :goto_0
    return-void

    .line 1437
    :pswitch_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1438
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f08009e

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v3, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    goto :goto_0

    .line 1441
    :pswitch_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchProducts(Z)V

    goto :goto_0

    .line 1445
    :pswitch_2
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # invokes: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchContactUs()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1500(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    goto :goto_0

    .line 1435
    :pswitch_data_0
    .packed-switch 0x7f08007b
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
