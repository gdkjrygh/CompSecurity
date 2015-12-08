.class final Lkik/android/f/a/o;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/f/a/l;


# direct methods
.method constructor <init>(Lkik/android/f/a/l;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 1412
    iput-object p1, p0, Lkik/android/f/a/o;->b:Lkik/android/f/a/l;

    iput-object p2, p0, Lkik/android/f/a/o;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1416
    iget-object v0, p0, Lkik/android/f/a/o;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lkik/android/f/a/p;

    invoke-direct {v1, p0}, Lkik/android/f/a/p;-><init>(Lkik/android/f/a/o;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1430
    return-void
.end method
