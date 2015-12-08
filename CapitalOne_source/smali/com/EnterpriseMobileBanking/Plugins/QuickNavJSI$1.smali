.class Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;
.super Ljava/lang/Object;
.source "QuickNavJSI.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->clickButton(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;I)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    iput p2, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->buttons:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->access$000(Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;->val$index:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->onClick(Landroid/view/View;)V

    .line 174
    return-void
.end method
