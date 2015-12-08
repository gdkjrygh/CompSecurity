.class final Lkik/android/chat/fragment/ql;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/s;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ProgressDialogFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ProgressDialogFragment;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lkik/android/chat/fragment/ql;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lkik/android/chat/fragment/ql;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Lkik/android/chat/fragment/ProgressDialogFragment;I)I

    .line 136
    iget-object v0, p0, Lkik/android/chat/fragment/ql;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->b(Lkik/android/chat/fragment/ProgressDialogFragment;)Landroid/app/ProgressDialog;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ql;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Lkik/android/chat/fragment/ProgressDialogFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V

    .line 137
    return-void
.end method
