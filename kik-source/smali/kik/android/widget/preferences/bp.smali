.class final Lkik/android/widget/preferences/bp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/UsernamePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/UsernamePreference;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 74
    packed-switch p2, :pswitch_data_0

    .line 88
    :cond_0
    :goto_0
    return-void

    .line 76
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    .line 78
    iget-object v1, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    iget-object v1, v1, Lkik/android/widget/preferences/UsernamePreference;->a:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 80
    if-eqz v0, :cond_0

    .line 81
    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 85
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    iget-object v0, v0, Lkik/android/widget/preferences/UsernamePreference;->a:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    invoke-static {v1}, Lkik/android/widget/preferences/UsernamePreference;->a(Lkik/android/widget/preferences/UsernamePreference;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    iget-object v2, v2, Lkik/android/widget/preferences/UsernamePreference;->c:Lcom/kik/android/a;

    iget-object v3, p0, Lkik/android/widget/preferences/bp;->a:Lkik/android/widget/preferences/UsernamePreference;

    iget-object v3, v3, Lkik/android/widget/preferences/UsernamePreference;->d:Lcom/kik/cache/ad;

    invoke-static {v0, v1, v2, v3}, Lkik/android/util/cc;->a(Lkik/a/d/aa;Landroid/content/Context;Lcom/kik/android/a;Lcom/kik/cache/ad;)V

    goto :goto_0

    .line 74
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
