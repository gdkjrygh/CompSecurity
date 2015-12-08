.class final Lkik/android/f/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/f/a/o;


# direct methods
.method constructor <init>(Lkik/android/f/a/o;)V
    .locals 0

    .prologue
    .line 1416
    iput-object p1, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1420
    iget-object v0, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    iget-object v0, v0, Lkik/android/f/a/o;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    const v1, 0x7f090383

    invoke-virtual {v0, v1}, Landroid/support/v4/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1422
    iget-object v1, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    iget-object v1, v1, Lkik/android/f/a/o;->a:Ljava/lang/Throwable;

    instance-of v1, v1, Lkik/android/f/a/ae$a;

    if-eqz v1, :cond_0

    .line 1423
    iget-object v0, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    iget-object v0, v0, Lkik/android/f/a/o;->a:Ljava/lang/Throwable;

    check-cast v0, Lkik/android/f/a/ae$a;

    iget-object v1, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    iget-object v1, v1, Lkik/android/f/a/o;->b:Lkik/android/f/a/l;

    iget-object v1, v1, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/f/a/ae$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1426
    :cond_0
    iget-object v1, p0, Lkik/android/f/a/p;->a:Lkik/android/f/a/o;

    iget-object v1, v1, Lkik/android/f/a/o;->b:Lkik/android/f/a/l;

    iget-object v1, v1, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1427
    return-void
.end method
