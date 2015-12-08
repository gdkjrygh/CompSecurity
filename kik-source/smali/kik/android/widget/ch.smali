.class final Lkik/android/widget/ch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lkik/android/chat/fragment/KikScopedDialogFragment;


# direct methods
.method constructor <init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/widget/ch;->a:Landroid/content/Context;

    iput-object p2, p0, Lkik/android/widget/ch;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lkik/android/widget/ch;->a:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/widget/ch;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-static {v0, v1}, Lkik/android/widget/ce;->b(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 95
    iget-object v0, p0, Lkik/android/widget/ch;->a:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    const-string v1, "eula-resign-app"

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 97
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lkik/android/widget/ch;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->J()V

    .line 103
    :goto_0
    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lkik/android/widget/ch;->a:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/widget/ch;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-static {v0, v1}, Lkik/android/widget/ce;->c(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto :goto_0
.end method
