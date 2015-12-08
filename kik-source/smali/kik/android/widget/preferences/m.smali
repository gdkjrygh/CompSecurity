.class final Lkik/android/widget/preferences/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/aa;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/preference/Preference;

.field final synthetic d:Lkik/android/widget/preferences/KikEmailPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikEmailPreference;Lkik/a/d/aa;Landroid/view/View;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/m;->a:Lkik/a/d/aa;

    iput-object p3, p0, Lkik/android/widget/preferences/m;->b:Landroid/view/View;

    iput-object p4, p0, Lkik/android/widget/preferences/m;->c:Landroid/preference/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 127
    iget-object v0, p0, Lkik/android/widget/preferences/m;->a:Lkik/a/d/aa;

    if-nez v0, :cond_0

    .line 163
    :goto_0
    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lkik/android/widget/preferences/m;->a:Lkik/a/d/aa;

    iget-object v0, v0, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0900cf

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 133
    iget-object v0, p0, Lkik/android/widget/preferences/m;->b:Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/preferences/m;->c:Landroid/preference/Preference;

    invoke-static {v0, v1}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    goto :goto_0

    .line 137
    :cond_1
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 138
    const v1, 0x7f0900d8

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f09036b

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090326

    new-instance v3, Lkik/android/widget/preferences/p;

    invoke-direct {v3, p0}, Lkik/android/widget/preferences/p;-><init>(Lkik/android/widget/preferences/m;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0902e0

    new-instance v3, Lkik/android/widget/preferences/o;

    invoke-direct {v3, p0}, Lkik/android/widget/preferences/o;-><init>(Lkik/android/widget/preferences/m;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    new-instance v2, Lkik/android/widget/preferences/n;

    invoke-direct {v2, p0}, Lkik/android/widget/preferences/n;-><init>(Lkik/android/widget/preferences/m;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 161
    iget-object v1, p0, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "emailPreference"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto :goto_0
.end method
