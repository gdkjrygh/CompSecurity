.class final Lkik/android/widget/preferences/au;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    iput-boolean p2, p0, Lkik/android/widget/preferences/au;->a:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 81
    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->setEnabled(Z)V

    .line 83
    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-static {v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V

    .line 85
    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->setEnabled(Z)V

    .line 86
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    iget-boolean v1, p0, Lkik/android/widget/preferences/au;->a:Z

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->setChecked(Z)V

    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f090235

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 75
    iget-object v0, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/au;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f090383

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 76
    return-void
.end method
