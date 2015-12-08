.class final Lkik/android/widget/ej;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/VideoController;


# direct methods
.method constructor <init>(Lkik/android/widget/VideoController;)V
    .locals 0

    .prologue
    .line 450
    iput-object p1, p0, Lkik/android/widget/ej;->a:Lkik/android/widget/VideoController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 453
    iget-object v0, p0, Lkik/android/widget/ej;->a:Lkik/android/widget/VideoController;

    invoke-static {v0}, Lkik/android/widget/VideoController;->a(Lkik/android/widget/VideoController;)V

    .line 454
    iget-object v0, p0, Lkik/android/widget/ej;->a:Lkik/android/widget/VideoController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoController;->a(I)V

    .line 455
    return-void
.end method
