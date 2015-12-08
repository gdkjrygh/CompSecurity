.class Lcom/yong/gift/GiftActivity$1;
.super Landroid/os/Handler;
.source "GiftActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/gift/GiftActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/GiftActivity;


# direct methods
.method constructor <init>(Lcom/yong/gift/GiftActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    .line 57
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 59
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 72
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 73
    return-void

    .line 62
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    # getter for: Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/yong/gift/GiftActivity;->access$0(Lcom/yong/gift/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    # getter for: Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/yong/gift/GiftActivity;->access$0(Lcom/yong/gift/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    const v2, 0x7f040004

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    # getter for: Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/yong/gift/GiftActivity;->access$0(Lcom/yong/gift/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    iget-object v0, p0, Lcom/yong/gift/GiftActivity$1;->this$0:Lcom/yong/gift/GiftActivity;

    # getter for: Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/yong/gift/GiftActivity;->access$0(Lcom/yong/gift/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    goto :goto_0

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method
