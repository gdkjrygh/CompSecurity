.class final Lkik/android/chat/fragment/rt;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/rs;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/rs;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lkik/android/chat/fragment/rt;->a:Lkik/android/chat/fragment/rs;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 155
    check-cast p1, Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "photoUrl"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/chat/fragment/rt;->a:Lkik/android/chat/fragment/rs;

    iget-object v1, v1, Lkik/android/chat/fragment/rs;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lkik/android/chat/fragment/rt;->a:Lkik/android/chat/fragment/rs;

    iget-object v0, v0, Lkik/android/chat/fragment/rs;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->J()V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 168
    iget-object v0, p0, Lkik/android/chat/fragment/rt;->a:Lkik/android/chat/fragment/rs;

    iget-object v0, v0, Lkik/android/chat/fragment/rs;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f09026a

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 169
    return-void
.end method
