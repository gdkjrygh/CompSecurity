.class final Lkik/android/widget/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/BugmeBarView;


# direct methods
.method constructor <init>(Lkik/android/widget/BugmeBarView;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lkik/android/widget/i;->a:Lkik/android/widget/BugmeBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lkik/android/widget/i;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/widget/BugmeBarView;Z)Z

    .line 209
    iget-object v0, p0, Lkik/android/widget/i;->a:Lkik/android/widget/BugmeBarView;

    iget-object v0, v0, Lkik/android/widget/BugmeBarView;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/i;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0}, Lkik/android/widget/BugmeBarView;->d(Lkik/android/widget/BugmeBarView;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lkik/android/widget/i;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0}, Lkik/android/widget/BugmeBarView;->e(Lkik/android/widget/BugmeBarView;)V

    .line 212
    :cond_0
    return-void
.end method
