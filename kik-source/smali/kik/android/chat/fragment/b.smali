.class final Lkik/android/chat/fragment/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/a/b;

.field final synthetic b:Lkik/android/chat/fragment/a;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/a;Lkik/a/a/b;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lkik/android/chat/fragment/b;->b:Lkik/android/chat/fragment/a;

    iput-object p2, p0, Lkik/android/chat/fragment/b;->a:Lkik/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lkik/android/chat/fragment/b;->a:Lkik/a/a/b;

    iget-object v1, p0, Lkik/android/chat/fragment/b;->a:Lkik/a/a/b;

    invoke-virtual {v1}, Lkik/a/a/b;->b()[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Lkik/a/a/b;->a(Ljava/lang/String;)Lkik/a/a/a;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lkik/android/chat/fragment/b;->b:Lkik/android/chat/fragment/a;

    iget-object v1, v1, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v1, v0}, Lkik/a/a/c;->a(Lkik/a/a/a;)V

    .line 108
    iget-object v0, p0, Lkik/android/chat/fragment/b;->b:Lkik/android/chat/fragment/a;

    iget-object v0, v0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 109
    return-void
.end method
