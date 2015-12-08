.class Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;
.super Ljava/lang/Object;
.source "TransitModeAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showGroup(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

.field private final synthetic val$groupPosition:I

.field private final synthetic val$item:Lcom/thetransitapp/droid/widget/OptionItem;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/TransitModeAdapter;Lcom/thetransitapp/droid/widget/OptionItem;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$item:Lcom/thetransitapp/droid/widget/OptionItem;

    iput p3, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$groupPosition:I

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 232
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$item:Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$item:Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    .line 234
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;
    invoke-static {v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->access$3(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/util/SparseArray;

    move-result-object v1

    iget v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$groupPosition:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 235
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;
    invoke-static {v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->access$3(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/util/SparseArray;

    move-result-object v1

    iget v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$groupPosition:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 240
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->notifyDataSetChanged()V

    .line 241
    return-void

    .line 232
    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    .line 235
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/OptionItem;

    .line 236
    .local v0, "child":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;->val$item:Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    goto :goto_1
.end method
