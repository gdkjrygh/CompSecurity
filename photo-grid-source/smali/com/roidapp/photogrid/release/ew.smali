.class final Lcom/roidapp/photogrid/release/ew;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ev;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ev;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ew;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 128
    const/4 v0, 0x1

    return v0
.end method
