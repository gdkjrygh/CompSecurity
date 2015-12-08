.class final Lcom/roidapp/photogrid/release/of;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/oa;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/oa;)V
    .locals 0

    .prologue
    .line 358
    iput-object p1, p0, Lcom/roidapp/photogrid/release/of;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/roidapp/photogrid/release/of;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oa;->a()V

    .line 363
    const/4 v0, 0x1

    return v0
.end method
