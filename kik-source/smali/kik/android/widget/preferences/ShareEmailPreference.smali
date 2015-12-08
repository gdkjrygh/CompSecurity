.class public Lkik/android/widget/preferences/ShareEmailPreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# instance fields
.field b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/kik/d/b/a$c;->g:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/ShareEmailPreference;)V

    .line 35
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 51
    invoke-virtual {p0}, Lkik/android/widget/preferences/ShareEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    const v1, 0x7f09023a

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    iget-object v2, p0, Lkik/android/widget/preferences/ShareEmailPreference;->b:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {p0}, Lkik/android/widget/preferences/ShareEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f09023f

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Lkik/android/widget/preferences/ShareEmailPreference;->b:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v3

    iget-object v3, v3, Lkik/a/d/aa;->c:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n\n\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/preferences/ShareEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f09023e

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 54
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 56
    const-string v3, "plain/text"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    const-string v3, "android.intent.extra.TEXT"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    const-string v0, "android.intent.extra.SUBJECT"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    invoke-virtual {p0}, Lkik/android/widget/preferences/ShareEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->startActivity(Landroid/content/Intent;)V

    .line 62
    return v4
.end method
