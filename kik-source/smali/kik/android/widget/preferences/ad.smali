.class final Lkik/android/widget/preferences/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/KikProfilePicPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 97
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0902a6

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0900f5

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 98
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v2, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 99
    iget-object v2, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0902c9

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 100
    new-instance v2, Lkik/android/widget/preferences/ae;

    invoke-direct {v2, p0}, Lkik/android/widget/preferences/ae;-><init>(Lkik/android/widget/preferences/ad;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 124
    iget-object v0, p0, Lkik/android/widget/preferences/ad;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "namePreference"

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 126
    return-void
.end method
