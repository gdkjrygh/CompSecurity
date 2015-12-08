.class final Lcom/roidapp/photogrid/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ba;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ba;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Lcom/roidapp/photogrid/be;->a:Lcom/roidapp/photogrid/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/be;->a:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 225
    const/4 v0, 0x1

    return v0
.end method
