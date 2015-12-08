.class final Lkik/android/chat/fragment/ph;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDialogFragment;

.field final synthetic b:Lkik/android/chat/fragment/KikScopedDialogFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikScopedDialogFragment;Lkik/android/chat/fragment/KikDialogFragment;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lkik/android/chat/fragment/ph;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ph;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 80
    iget-object v0, p0, Lkik/android/chat/fragment/ph;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)Landroid/util/SparseArray;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ph;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 81
    return-void
.end method
