.class Lcom/facebook/orca/chatheads/am;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/orca/chatheads/am;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/orca/chatheads/am;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const/4 v0, 0x0

    .line 104
    :goto_0
    return v0

    .line 100
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/chatheads/am;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;)V

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/am;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method
