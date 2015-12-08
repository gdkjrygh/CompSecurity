.class abstract Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;
.super Lcom/facebook/widget/GraphObjectAdapter;
.source "PickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/PickerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "PickerFragmentAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Lcom/facebook/model/GraphObject;",
        ">",
        "Lcom/facebook/widget/GraphObjectAdapter",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/PickerFragment;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/PickerFragment;Landroid/content/Context;)V
    .locals 0
    .param p1, "this$0"    # Lcom/facebook/widget/PickerFragment;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 1107
    .local p0, "this":Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;, "Lcom/facebook/widget/PickerFragment<TT;>.PickerFragmentAdapter<TU;>;"
    iput-object p1, p0, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->this$0:Lcom/facebook/widget/PickerFragment;

    .line 1108
    invoke-direct {p0, p2}, Lcom/facebook/widget/GraphObjectAdapter;-><init>(Landroid/content/Context;)V

    .line 1109
    return-void
.end method


# virtual methods
.method isGraphObjectSelected(Ljava/lang/String;)Z
    .locals 1
    .param p1, "graphObjectId"    # Ljava/lang/String;

    .prologue
    .line 1113
    .local p0, "this":Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;, "Lcom/facebook/widget/PickerFragment<TT;>.PickerFragmentAdapter<TU;>;"
    iget-object v0, p0, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->this$0:Lcom/facebook/widget/PickerFragment;

    # getter for: Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    invoke-static {v0}, Lcom/facebook/widget/PickerFragment;->access$700(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$SelectionStrategy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->isSelected(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method updateCheckboxState(Landroid/widget/CheckBox;Z)V
    .locals 2
    .param p1, "checkBox"    # Landroid/widget/CheckBox;
    .param p2, "graphObjectSelected"    # Z

    .prologue
    .line 1118
    .local p0, "this":Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;, "Lcom/facebook/widget/PickerFragment<TT;>.PickerFragmentAdapter<TU;>;"
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1119
    if-nez p2, :cond_0

    iget-object v1, p0, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->this$0:Lcom/facebook/widget/PickerFragment;

    # getter for: Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    invoke-static {v1}, Lcom/facebook/widget/PickerFragment;->access$700(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$SelectionStrategy;

    move-result-object v1

    .line 1120
    invoke-virtual {v1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->shouldShowCheckBoxIfUnselected()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 1121
    .local v0, "visible":I
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 1122
    return-void

    .line 1120
    .end local v0    # "visible":I
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method
