.class final Lkik/android/widget/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/x;


# direct methods
.method constructor <init>(Lkik/android/widget/x;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lkik/android/widget/y;->a:Lkik/android/widget/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/widget/y;->a:Lkik/android/widget/x;

    iget-object v0, v0, Lkik/android/widget/x;->b:Lkik/android/widget/FragmentContainerFrame;

    iget-object v1, p0, Lkik/android/widget/y;->a:Lkik/android/widget/x;

    iget-object v1, v1, Lkik/android/widget/x;->a:Landroid/view/View;

    invoke-static {v0, v1}, Lkik/android/widget/FragmentContainerFrame;->a(Lkik/android/widget/FragmentContainerFrame;Landroid/view/View;)V

    .line 54
    return-void
.end method
