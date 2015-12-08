.class final Lkik/android/chat/fragment/settings/e;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/settings/PreferenceFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/settings/PreferenceFragment;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lkik/android/chat/fragment/settings/e;->a:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 81
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 85
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/settings/e;->a:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lkik/android/chat/fragment/settings/e;->a:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a(Lkik/android/chat/fragment/settings/PreferenceFragment;)V

    goto :goto_0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
