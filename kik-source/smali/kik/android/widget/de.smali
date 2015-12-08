.class final Lkik/android/widget/de;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/PullToRevealView$b;


# instance fields
.field final synthetic a:Lkik/android/widget/PullToRevealView;


# direct methods
.method constructor <init>(Lkik/android/widget/PullToRevealView;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lkik/android/widget/de;->a:Lkik/android/widget/PullToRevealView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lkik/android/widget/de;->a:Lkik/android/widget/PullToRevealView;

    invoke-static {v0}, Lkik/android/widget/PullToRevealView;->a(Lkik/android/widget/PullToRevealView;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 151
    return-void
.end method
