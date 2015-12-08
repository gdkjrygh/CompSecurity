.class final Lkik/android/widget/df;
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
    .line 202
    iput-object p1, p0, Lkik/android/widget/df;->a:Lkik/android/widget/PullToRevealView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    .line 206
    if-nez p1, :cond_0

    .line 207
    iget-object v0, p0, Lkik/android/widget/df;->a:Lkik/android/widget/PullToRevealView;

    new-instance v1, Lkik/android/widget/dg;

    invoke-direct {v1, p0}, Lkik/android/widget/dg;-><init>(Lkik/android/widget/df;)V

    invoke-static {v0, v1}, Lkik/android/widget/PullToRevealView;->a(Lkik/android/widget/PullToRevealView;Lkik/android/widget/PullToRevealView$b;)V

    .line 218
    :goto_0
    return-void

    .line 216
    :cond_0
    iget-object v0, p0, Lkik/android/widget/df;->a:Lkik/android/widget/PullToRevealView;

    invoke-static {v0}, Lkik/android/widget/PullToRevealView;->b(Lkik/android/widget/PullToRevealView;)Z

    goto :goto_0
.end method
