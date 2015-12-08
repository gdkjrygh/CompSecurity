.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setupHomePage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$lob:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 831
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 835
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    const v4, 0x7f080098

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 837
    .local v0, "carpetCover":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 838
    .local v1, "params":Landroid/view/ViewGroup$LayoutParams;
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    const v4, 0x7f0800be

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 839
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 841
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    const v4, 0x7f080099

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 842
    .local v2, "swipeCover":Landroid/view/View;
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 843
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 844
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 846
    const/4 v3, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$002(I)I

    .line 847
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 848
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->val$lob:Landroid/view/View;

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->closeLOBs:Ljava/lang/Runnable;
    invoke-static {v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$600(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Ljava/lang/Runnable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 850
    return-void
.end method
