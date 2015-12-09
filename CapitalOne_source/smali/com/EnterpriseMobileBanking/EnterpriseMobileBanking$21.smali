.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->carpetClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1372
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->val$v:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1375
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->val$v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;
    invoke-static {v1, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1302(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Ljava/lang/String;)Ljava/lang/String;

    .line 1376
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;->val$v:Landroid/view/View;

    # invokes: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v1

    const v2, 0x7f080099

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleLobHelper(Landroid/view/View;)V

    .line 1377
    return-void
.end method
