.class final Lcom/ijoysoft/appwall/j;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/GiftActivity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/GiftActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Lcom/ijoysoft/appwall/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Lcom/ijoysoft/appwall/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    sget v2, Lcom/ijoysoft/appwall/z;->a:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Lcom/ijoysoft/appwall/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/j;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Lcom/ijoysoft/appwall/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
