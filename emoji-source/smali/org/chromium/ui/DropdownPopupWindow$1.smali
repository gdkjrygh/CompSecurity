.class Lorg/chromium/ui/DropdownPopupWindow$1;
.super Ljava/lang/Object;
.source "DropdownPopupWindow.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/DropdownPopupWindow;-><init>(Landroid/content/Context;Lorg/chromium/ui/base/ViewAndroidDelegate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/DropdownPopupWindow;


# direct methods
.method constructor <init>(Lorg/chromium/ui/DropdownPopupWindow;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lorg/chromium/ui/DropdownPopupWindow$1;->this$0:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I
    .param p6, "oldLeft"    # I
    .param p7, "oldTop"    # I
    .param p8, "oldRight"    # I
    .param p9, "oldBottom"    # I

    .prologue
    .line 54
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow$1;->this$0:Lorg/chromium/ui/DropdownPopupWindow;

    # getter for: Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;
    invoke-static {v0}, Lorg/chromium/ui/DropdownPopupWindow;->access$000(Lorg/chromium/ui/DropdownPopupWindow;)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow$1;->this$0:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-virtual {v0}, Lorg/chromium/ui/DropdownPopupWindow;->show()V

    .line 55
    :cond_0
    return-void
.end method
