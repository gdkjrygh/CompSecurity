.class final Lkik/android/widget/preferences/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/ad;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/ad;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 105
    packed-switch p2, :pswitch_data_0

    .line 122
    :cond_0
    :goto_0
    return-void

    .line 107
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v0, v0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    .line 109
    iget-object v1, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v1, v1, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikProfilePicPreference;->b:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 111
    if-eqz v0, :cond_0

    .line 112
    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object v0, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v0, v0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Lkik/android/widget/preferences/KikProfilePicPreference;)Landroid/widget/Toast;

    move-result-object v0

    const v1, 0x7f090352

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 115
    iget-object v0, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v0, v0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Lkik/android/widget/preferences/KikProfilePicPreference;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 119
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v0, v0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v0, v0, Lkik/android/widget/preferences/KikProfilePicPreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v1, v1, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v1}, Lkik/android/widget/preferences/KikProfilePicPreference;->b(Lkik/android/widget/preferences/KikProfilePicPreference;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v2, v2, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v2, v2, Lkik/android/widget/preferences/KikProfilePicPreference;->d:Lcom/kik/android/a;

    iget-object v3, p0, Lkik/android/widget/preferences/ae;->a:Lkik/android/widget/preferences/ad;

    iget-object v3, v3, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v3}, Lkik/android/widget/preferences/KikProfilePicPreference;->c(Lkik/android/widget/preferences/KikProfilePicPreference;)Lcom/kik/cache/ad;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkik/android/util/cc;->a(Lkik/a/d/aa;Landroid/content/Context;Lcom/kik/android/a;Lcom/kik/cache/ad;)V

    goto :goto_0

    .line 105
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
