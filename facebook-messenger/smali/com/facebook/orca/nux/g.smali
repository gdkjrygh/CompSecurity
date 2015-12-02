.class Lcom/facebook/orca/nux/g;
.super Ljava/lang/Object;
.source "NuxScrimView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/NuxScrimView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/NuxScrimView;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/orca/nux/g;->a:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/nux/g;->a:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-static {v0, p2}, Lcom/facebook/orca/nux/NuxScrimView;->a(Lcom/facebook/orca/nux/NuxScrimView;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
