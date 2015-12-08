.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 185
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const v9, 0x7f080023

    .line 188
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$000()I

    move-result v6

    if-nez v6, :cond_0

    .line 189
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v7, 0x7f08007f

    invoke-virtual {v6, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f080099

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I
    invoke-static {v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$002(I)I

    .line 191
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Cover: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$000()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$200()[I

    move-result-object v0

    .local v0, "arr$":[I
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget v5, v0, v1

    .line 195
    .local v5, "row":I
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v6, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f080097

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$000()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->setScrollStart(I)V

    .line 193
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 200
    .end local v0    # "arr$":[I
    .end local v1    # "i$":I
    .end local v2    # "len$":I
    .end local v5    # "row":I
    :cond_0
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v6, v9}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 202
    .local v3, "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/high16 v6, 0x43700000    # 240.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v7

    mul-float/2addr v6, v7

    float-to-int v6, v6

    iput v6, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 203
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v6, v9}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->requestLayout()V

    .line 204
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v7, 0x7f080024

    invoke-virtual {v6, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 206
    .local v4, "relContainer":Landroid/view/View;
    new-instance v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;

    invoke-direct {v6, p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1$1;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;Landroid/view/View;)V

    invoke-virtual {v4, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 214
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->removeSplash()V

    .line 216
    return-void
.end method
