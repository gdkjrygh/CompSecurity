.class final Lcom/roidapp/photogrid/release/hm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field a:Z

.field final synthetic b:Lcom/roidapp/photogrid/release/hk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hk;)V
    .locals 1

    .prologue
    .line 127
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hm;->b:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/hm;->a:Z

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 132
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 148
    :cond_0
    :goto_0
    return v1

    .line 134
    :pswitch_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/hm;->a:Z

    goto :goto_0

    .line 138
    :pswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/hm;->a:Z

    goto :goto_0

    .line 142
    :pswitch_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/hm;->a:Z

    if-eqz v0, :cond_0

    .line 143
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/hm;->a:Z

    goto :goto_0

    .line 132
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
