.class final Lkik/android/widget/preferences/q;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/KikEmailPreference;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/widget/preferences/KikEmailPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikEmailPreference;Lkik/android/widget/preferences/KikEmailPreference;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/q;->a:Lkik/android/widget/preferences/KikEmailPreference;

    iput-object p3, p0, Lkik/android/widget/preferences/q;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lkik/android/widget/preferences/q;->a:Lkik/android/widget/preferences/KikEmailPreference;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/KikEmailPreference;->setEnabled(Z)V

    .line 219
    iget-object v0, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-static {v0}, Lkik/android/widget/preferences/KikEmailPreference;->a(Lkik/android/widget/preferences/KikEmailPreference;)V

    .line 220
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 184
    check-cast p1, Lkik/a/d/aa;

    iget-object v0, p0, Lkik/android/widget/preferences/q;->a:Lkik/android/widget/preferences/KikEmailPreference;

    iget-object v1, p1, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/KikEmailPreference;->setText(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f0900d1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 196
    const/4 v0, 0x0

    .line 199
    instance-of v1, p1, Lkik/a/f/q;

    if-eqz v1, :cond_0

    move-object v0, p1

    .line 200
    check-cast v0, Lkik/a/f/q;

    .line 203
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 204
    iget-object v0, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    const v1, 0x7f0900d0

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lkik/android/widget/preferences/q;->b:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 211
    :goto_0
    iget-object v1, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 212
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lkik/android/widget/preferences/q;->c:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    const v1, 0x7f0900db

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
