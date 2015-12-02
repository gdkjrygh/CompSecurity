.class Lcom/facebook/widget/d/d;
.super Ljava/lang/Object;
.source "QuickActionPopMenu.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/d/c;


# direct methods
.method constructor <init>(Lcom/facebook/widget/d/c;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/widget/d/d;->a:Lcom/facebook/widget/d/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 105
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 106
    iget-object v0, p0, Lcom/facebook/widget/d/d;->a:Lcom/facebook/widget/d/c;

    invoke-static {v0}, Lcom/facebook/widget/d/c;->a(Lcom/facebook/widget/d/c;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 107
    const/4 v0, 0x1

    .line 109
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
