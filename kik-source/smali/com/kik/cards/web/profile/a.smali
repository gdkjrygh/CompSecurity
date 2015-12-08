.class final Lcom/kik/cards/web/profile/a;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/profile/ProfilePlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/profile/ProfilePlugin;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 69
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v0}, Lcom/kik/cards/web/profile/ProfilePlugin;->a(Lcom/kik/cards/web/profile/ProfilePlugin;)Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget-object v0, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v0, p1}, Lcom/kik/cards/web/profile/ProfilePlugin;->a(Lcom/kik/cards/web/profile/ProfilePlugin;Lkik/a/d/k;)V

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const v7, 0x7f090193

    const/4 v6, 0x1

    .line 85
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkik/a/f/q;

    invoke-virtual {v0}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 86
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    const-string v1, "Error"

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->b(Lcom/kik/cards/web/profile/ProfilePlugin;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09017a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->b(Lcom/kik/cards/web/profile/ProfilePlugin;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 95
    :goto_0
    iget-object v1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->a(Lcom/kik/cards/web/profile/ProfilePlugin;)Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 96
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 98
    return-void

    .line 91
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    const-string v1, "Error"

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->b(Lcom/kik/cards/web/profile/ProfilePlugin;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900a2

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v5}, Lcom/kik/cards/web/profile/ProfilePlugin;->c(Lcom/kik/cards/web/profile/ProfilePlugin;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/profile/a;->a:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-static {v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->b(Lcom/kik/cards/web/profile/ProfilePlugin;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    goto :goto_0
.end method
