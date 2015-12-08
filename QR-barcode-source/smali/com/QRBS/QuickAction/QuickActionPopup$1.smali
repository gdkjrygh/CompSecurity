.class Lcom/QRBS/QuickAction/QuickActionPopup$1;
.super Ljava/lang/Object;
.source "QuickActionPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

.field private final synthetic val$actionId:I

.field private final synthetic val$pos:I


# direct methods
.method constructor <init>(Lcom/QRBS/QuickAction/QuickActionPopup;II)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    iput p2, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->val$pos:I

    iput p3, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->val$actionId:I

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 194
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    # getter for: Lcom/QRBS/QuickAction/QuickActionPopup;->mItemClickListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;
    invoke-static {v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->access$0(Lcom/QRBS/QuickAction/QuickActionPopup;)Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    # getter for: Lcom/QRBS/QuickAction/QuickActionPopup;->mItemClickListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;
    invoke-static {v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->access$0(Lcom/QRBS/QuickAction/QuickActionPopup;)Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    iget v2, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->val$pos:I

    iget v3, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->val$actionId:I

    invoke-interface {v0, v1, v2, v3}, Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;->onItemClick(Lcom/QRBS/QuickAction/QuickActionPopup;II)V

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    iget v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->val$pos:I

    invoke-virtual {v0, v1}, Lcom/QRBS/QuickAction/QuickActionPopup;->getActionItem(I)Lcom/QRBS/QuickAction/QuickActionItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/QRBS/QuickAction/QuickActionItem;->isSticky()Z

    move-result v0

    if-nez v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/QRBS/QuickAction/QuickActionPopup;->access$1(Lcom/QRBS/QuickAction/QuickActionPopup;Z)V

    .line 201
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup$1;->this$0:Lcom/QRBS/QuickAction/QuickActionPopup;

    invoke-virtual {v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->dismiss()V

    .line 203
    :cond_1
    return-void
.end method
