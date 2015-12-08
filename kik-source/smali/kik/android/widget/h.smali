.class final Lkik/android/widget/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/widget/e;


# direct methods
.method constructor <init>(Lkik/android/widget/e;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lkik/android/widget/h;->a:Lkik/android/widget/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lkik/android/widget/h;->a:Lkik/android/widget/e;

    iget-object v0, v0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/widget/BugmeBarView;Z)Z

    .line 64
    return-void
.end method
