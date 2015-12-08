.class Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;
.super Ljava/lang/Object;
.source "SpinnerICS.java"

# interfaces
.implements Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

.field final synthetic val$this$0:Landroid/support/v7/internal/widget/SpinnerICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;Landroid/support/v7/internal/widget/SpinnerICS;)V
    .locals 0

    .prologue
    .line 706
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    iput-object p2, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->val$this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
    .locals 3
    .param p1, "parent"    # Landroid/support/v7/internal/widget/AdapterViewICS;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J

    .prologue
    .line 708
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    iget-object v0, v0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0, p3}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 709
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    iget-object v0, v0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v0, v0, Landroid/support/v7/internal/widget/SpinnerICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    if-eqz v0, :cond_0

    .line 710
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    iget-object v0, v0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    # getter for: Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
    invoke-static {v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->access$100(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;)Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v1

    invoke-virtual {v0, p2, p3, v1, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->performItemClick(Landroid/view/View;IJ)Z

    .line 712
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;->this$1:Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->dismiss()V

    .line 713
    return-void
.end method
