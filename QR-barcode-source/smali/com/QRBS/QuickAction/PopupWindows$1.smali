.class Lcom/QRBS/QuickAction/PopupWindows$1;
.super Ljava/lang/Object;
.source "PopupWindows.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/QuickAction/PopupWindows;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/QuickAction/PopupWindows;


# direct methods
.method constructor <init>(Lcom/QRBS/QuickAction/PopupWindows;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/QuickAction/PopupWindows$1;->this$0:Lcom/QRBS/QuickAction/PopupWindows;

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 27
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/QRBS/QuickAction/PopupWindows$1;->this$0:Lcom/QRBS/QuickAction/PopupWindows;

    iget-object v0, v0, Lcom/QRBS/QuickAction/PopupWindows;->mWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 30
    const/4 v0, 0x1

    .line 33
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
