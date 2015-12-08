.class public final Lcom/kik/cards/usermedia/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/usermedia/i;


# instance fields
.field a:Lkik/android/chat/fragment/KikScopedDialogFragment;


# direct methods
.method public constructor <init>(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 21
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 8

    .prologue
    const v7, 0x7f09029e

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 27
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 28
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 29
    invoke-virtual {v1, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 30
    const v0, 0x7f090307

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 31
    new-instance v0, Lcom/kik/cards/usermedia/i;

    invoke-direct {v0, p0, v2}, Lcom/kik/cards/usermedia/i;-><init>(Lcom/kik/cards/usermedia/h;Lcom/kik/g/p;)V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/content/DialogInterface$OnCancelListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 42
    iget-object v0, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    const v4, 0x7f09030f

    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v6

    iget-object v3, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v3, v7}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v5

    .line 49
    :goto_0
    new-instance v3, Lcom/kik/cards/usermedia/j;

    invoke-direct {v3, p0, v0, v2}, Lcom/kik/cards/usermedia/j;-><init>(Lcom/kik/cards/usermedia/h;[Ljava/lang/CharSequence;Lcom/kik/g/p;)V

    invoke-virtual {v1, v0, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 64
    iget-object v0, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 65
    return-object v2

    .line 46
    :cond_0
    new-array v0, v5, [Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/kik/cards/usermedia/h;->a:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v3, v7}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v6

    goto :goto_0
.end method
