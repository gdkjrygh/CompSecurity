.class final Lkik/android/widget/preferences/bd;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/preference/Preference;

.field final synthetic c:Lkik/android/widget/preferences/PasswordPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/PasswordPreference;Ljava/lang/String;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lkik/android/widget/preferences/bd;->c:Lkik/android/widget/preferences/PasswordPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/bd;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/widget/preferences/bd;->b:Landroid/preference/Preference;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 147
    iget-object v0, p0, Lkik/android/widget/preferences/bd;->c:Lkik/android/widget/preferences/PasswordPreference;

    iget-object v0, v0, Lkik/android/widget/preferences/PasswordPreference;->b:Lkik/a/e/w;

    iget-object v1, p0, Lkik/android/widget/preferences/bd;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/w;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/bd;->c:Lkik/android/widget/preferences/PasswordPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/PasswordPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    new-instance v2, Lkik/android/widget/preferences/be;

    invoke-direct {v2, p0}, Lkik/android/widget/preferences/be;-><init>(Lkik/android/widget/preferences/bd;)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    iget-object v1, p0, Lkik/android/widget/preferences/bd;->c:Lkik/android/widget/preferences/PasswordPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f090346

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/preferences/bd;->c:Lkik/android/widget/preferences/PasswordPreference;

    invoke-virtual {v2}, Lkik/android/widget/preferences/PasswordPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lkik/android/widget/preferences/KikPreference;->a(Ljava/lang/String;Lcom/kik/g/p;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    const/4 v0, 0x0

    return-object v0
.end method
