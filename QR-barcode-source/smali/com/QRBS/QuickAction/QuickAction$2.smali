.class Lcom/QRBS/QuickAction/QuickAction$2;
.super Ljava/lang/Object;
.source "QuickAction.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/QuickAction/QuickAction;->addActionItem(Lcom/QRBS/QuickAction/ActionItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/QuickAction/QuickAction;

.field private final synthetic val$pos:I


# direct methods
.method constructor <init>(Lcom/QRBS/QuickAction/QuickAction;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickAction$2;->this$0:Lcom/QRBS/QuickAction/QuickAction;

    iput p2, p0, Lcom/QRBS/QuickAction/QuickAction$2;->val$pos:I

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 99
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction$2;->this$0:Lcom/QRBS/QuickAction/QuickAction;

    # getter for: Lcom/QRBS/QuickAction/QuickAction;->mListener:Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;
    invoke-static {v0}, Lcom/QRBS/QuickAction/QuickAction;->access$0(Lcom/QRBS/QuickAction/QuickAction;)Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction$2;->this$0:Lcom/QRBS/QuickAction/QuickAction;

    # getter for: Lcom/QRBS/QuickAction/QuickAction;->mListener:Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;
    invoke-static {v0}, Lcom/QRBS/QuickAction/QuickAction;->access$0(Lcom/QRBS/QuickAction/QuickAction;)Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

    move-result-object v0

    iget v1, p0, Lcom/QRBS/QuickAction/QuickAction$2;->val$pos:I

    invoke-interface {v0, v1}, Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;->onItemClick(I)V

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction$2;->this$0:Lcom/QRBS/QuickAction/QuickAction;

    invoke-virtual {v0}, Lcom/QRBS/QuickAction/QuickAction;->dismiss()V

    .line 102
    return-void
.end method
