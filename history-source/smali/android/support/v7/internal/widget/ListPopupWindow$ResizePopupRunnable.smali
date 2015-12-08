.class Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ResizePopupRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
    .locals 0

    .prologue
    .line 1378
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
    .param p2, "x1"    # Landroid/support/v7/internal/widget/ListPopupWindow$1;

    .prologue
    .line 1378
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1381
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    # getter for: Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    # getter for: Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getCount()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    # getter for: Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-static {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    # getter for: Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildCount()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget v1, v1, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I

    if-gt v0, v1, :cond_0

    .line 1383
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    # getter for: Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1384
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 1386
    :cond_0
    return-void
.end method
