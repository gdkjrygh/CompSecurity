.class final Lkik/android/widget/preferences/as;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/preference/Preference;

.field final synthetic b:Lkik/android/widget/preferences/NamePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NamePreference;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    iput-object p2, p0, Lkik/android/widget/preferences/as;->a:Landroid/preference/Preference;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lkik/android/widget/preferences/as;->a:Landroid/preference/Preference;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 202
    iget-object v0, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v0}, Lkik/android/widget/preferences/NamePreference;->c(Lkik/android/widget/preferences/NamePreference;)V

    .line 203
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 163
    check-cast p1, Lkik/a/d/aa;

    iget-object v0, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/NamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f09016b

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    iget-object v0, v0, Lkik/android/widget/preferences/NamePreference;->c:Lkik/a/e/r;

    iget-object v1, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v0, p1, Lkik/a/d/aa;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lkik/a/d/aa;->d:Ljava/lang/String;

    :goto_0
    iget-object v1, p1, Lkik/a/d/aa;->e:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lkik/a/d/aa;->e:Ljava/lang/String;

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/a/d/k;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    iget-object v0, v0, Lkik/android/widget/preferences/NamePreference;->c:Lkik/a/e/r;

    invoke-interface {v0, v2}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    :cond_0
    return-void

    :cond_1
    const-string v0, ""

    goto :goto_0

    :cond_2
    const-string v1, ""

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 182
    invoke-static {p1}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    .line 183
    packed-switch v0, :pswitch_data_0

    .line 193
    iget-object v0, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/NamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f09037f

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 195
    :goto_0
    return-void

    .line 186
    :pswitch_0
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v1}, Lkik/android/widget/preferences/NamePreference;->a(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 187
    const v1, 0x7f0902ba

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 188
    const v1, 0x7f090101

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 189
    const v1, 0x7f090193

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 190
    iget-object v1, p0, Lkik/android/widget/preferences/as;->b:Lkik/android/widget/preferences/NamePreference;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "dialog"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/widget/preferences/NamePreference;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto :goto_0

    .line 183
    :pswitch_data_0
    .packed-switch 0xca
        :pswitch_0
    .end packed-switch
.end method
