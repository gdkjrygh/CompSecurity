.class final Lkik/android/chat/fragment/tr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/WebVideoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/WebVideoFragment;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lkik/android/chat/fragment/tr;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 102
    packed-switch p2, :pswitch_data_0

    move v0, v1

    .line 112
    :cond_0
    :goto_0
    return v0

    .line 104
    :pswitch_0
    iget-object v2, p0, Lkik/android/chat/fragment/tr;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/WebVideoFragment;->a(Lkik/android/chat/fragment/WebVideoFragment;)Lcom/kik/cards/web/video/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/cards/web/video/b;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 105
    iget-object v2, p0, Lkik/android/chat/fragment/tr;->a:Lkik/android/chat/fragment/WebVideoFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 109
    :pswitch_1
    iget-object v1, p0, Lkik/android/chat/fragment/tr;->a:Lkik/android/chat/fragment/WebVideoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 102
    nop

    :pswitch_data_0
    .packed-switch 0x2bd
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
