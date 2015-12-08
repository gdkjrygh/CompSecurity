.class final Lkik/android/util/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:[Ljava/lang/CharSequence;

.field final synthetic b:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field final synthetic c:Lkik/android/util/p;


# direct methods
.method constructor <init>(Lkik/android/util/p;[Ljava/lang/CharSequence;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lkik/android/util/q;->c:Lkik/android/util/p;

    iput-object p2, p0, Lkik/android/util/q;->a:[Ljava/lang/CharSequence;

    iput-object p3, p0, Lkik/android/util/q;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 202
    if-nez p2, :cond_0

    iget-object v0, p0, Lkik/android/util/q;->a:[Ljava/lang/CharSequence;

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 203
    invoke-static {}, Lkik/android/util/p;->i()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/t;->b(Ljava/io/File;)Landroid/content/Intent;

    move-result-object v0

    .line 204
    iget-object v1, p0, Lkik/android/util/q;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    const/16 v2, 0x285e

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 211
    :goto_0
    return-void

    .line 207
    :cond_0
    invoke-static {}, Lkik/android/util/p;->i()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/t;->a(Ljava/io/File;)Landroid/content/Intent;

    move-result-object v0

    .line 208
    iget-object v1, p0, Lkik/android/util/q;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    const/16 v2, 0x285f

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method
