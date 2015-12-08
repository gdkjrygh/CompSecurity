.class final Lkik/android/widget/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/e;


# direct methods
.method constructor <init>(Lkik/android/widget/e;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lkik/android/widget/g;->a:Lkik/android/widget/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lkik/android/widget/g;->a:Lkik/android/widget/e;

    iget-object v0, v0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/widget/BugmeBarView;)V

    .line 72
    return-void
.end method
