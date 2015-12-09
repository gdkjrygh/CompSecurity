.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onGripperClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V
    .locals 0

    .prologue
    .line 1383
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$v:Landroid/view/View;

    iput-object p3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const v5, 0x7f0900a4

    const v4, 0x7f0900a3

    .line 1387
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$v:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setPressed(Z)V

    .line 1389
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    .line 1390
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollX()I

    move-result v2

    if-nez v2, :cond_2

    .line 1391
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$v:Landroid/view/View;

    check-cast v1, Landroid/widget/ImageView;

    .line 1392
    .local v1, "gripper":Landroid/widget/ImageView;
    invoke-virtual {v1}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1394
    .local v0, "contentDescrip":Ljava/lang/String;
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1395
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f090135

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1403
    :goto_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 1419
    :goto_1
    return-void

    .line 1397
    :cond_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1398
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f090136

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1401
    :cond_1
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f090137

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1405
    .end local v0    # "contentDescrip":Ljava/lang/String;
    .end local v1    # "gripper":Landroid/widget/ImageView;
    :cond_2
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$v:Landroid/view/View;

    check-cast v1, Landroid/widget/ImageView;

    .line 1406
    .restart local v1    # "gripper":Landroid/widget/ImageView;
    invoke-virtual {v1}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1408
    .restart local v0    # "contentDescrip":Ljava/lang/String;
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1409
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f090138

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1417
    :goto_2
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->openScroll()V

    goto :goto_1

    .line 1411
    :cond_3
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1412
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f090139

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 1415
    :cond_4
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f09013a

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method
