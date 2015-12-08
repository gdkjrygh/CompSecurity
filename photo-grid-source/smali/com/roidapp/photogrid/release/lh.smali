.class final Lcom/roidapp/photogrid/release/lh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ld;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ld;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lh;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lh;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ld;->b()V

    .line 319
    const/4 v0, 0x1

    return v0
.end method
