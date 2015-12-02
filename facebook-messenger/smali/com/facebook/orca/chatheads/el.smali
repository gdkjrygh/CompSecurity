.class Lcom/facebook/orca/chatheads/el;
.super Ljava/lang/Object;
.source "ViewDragDismissHelper.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ek;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ek;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/orca/chatheads/el;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/orca/chatheads/el;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-static {v0, p2}, Lcom/facebook/orca/chatheads/ek;->a(Lcom/facebook/orca/chatheads/ek;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
