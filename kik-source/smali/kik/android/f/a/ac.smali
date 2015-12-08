.class final Lkik/android/f/a/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/f/a/ab;


# direct methods
.method constructor <init>(Lkik/android/f/a/ab;)V
    .locals 0

    .prologue
    .line 1083
    iput-object p1, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1087
    iget-object v0, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    iget-object v0, v0, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    const v1, 0x7f090383

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1089
    iget-object v1, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    iget-object v1, v1, Lkik/android/f/a/ab;->a:Ljava/lang/Throwable;

    instance-of v1, v1, Lkik/android/f/a/ae$a;

    if-eqz v1, :cond_0

    .line 1090
    iget-object v0, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    iget-object v0, v0, Lkik/android/f/a/ab;->a:Ljava/lang/Throwable;

    check-cast v0, Lkik/android/f/a/ae$a;

    iget-object v1, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    iget-object v1, v1, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iget-object v1, v1, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lkik/android/f/a/ae$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1093
    :cond_0
    iget-object v1, p0, Lkik/android/f/a/ac;->a:Lkik/android/f/a/ab;

    iget-object v1, v1, Lkik/android/f/a/ab;->b:Lkik/android/f/a/z;

    iget-object v1, v1, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1094
    return-void
.end method
