.class Lnet/coocent/android/xmlparser/GiftActivity$1;
.super Landroid/os/Handler;
.source "GiftActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/coocent/android/xmlparser/GiftActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/coocent/android/xmlparser/GiftActivity;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/GiftActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    .line 38
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 40
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 52
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 53
    return-void

    .line 42
    :pswitch_0
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    # getter for: Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/GiftActivity;->access$0(Lnet/coocent/android/xmlparser/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    # getter for: Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/GiftActivity;->access$0(Lnet/coocent/android/xmlparser/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    .line 44
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    sget v2, Lnet/coocent/promotionsdk/R$anim;->loading:I

    .line 43
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 48
    :pswitch_1
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    # getter for: Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/GiftActivity;->access$0(Lnet/coocent/android/xmlparser/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 49
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity$1;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    # getter for: Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/GiftActivity;->access$0(Lnet/coocent/android/xmlparser/GiftActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    goto :goto_0

    .line 40
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
