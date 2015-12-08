.class final Lcom/roidapp/photogrid/release/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/roidapp/photogrid/release/d;->a:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 199
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 207
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 201
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/d;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/c;)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/d;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->c(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/d;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/c;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto :goto_0

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
