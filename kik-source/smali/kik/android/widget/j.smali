.class final Lkik/android/widget/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/util/p$a;

.field final synthetic b:Lkik/android/widget/BugmeBarView;


# direct methods
.method constructor <init>(Lkik/android/widget/BugmeBarView;Lkik/android/util/p$a;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lkik/android/widget/j;->b:Lkik/android/widget/BugmeBarView;

    iput-object p2, p0, Lkik/android/widget/j;->a:Lkik/android/util/p$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lkik/android/widget/j;->a:Lkik/android/util/p$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->cancel(Z)Z

    .line 236
    iget-object v0, p0, Lkik/android/widget/j;->b:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/widget/BugmeBarView;Z)Z

    .line 237
    return-void
.end method
