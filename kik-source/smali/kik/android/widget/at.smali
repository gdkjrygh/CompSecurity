.class public Lkik/android/widget/at;
.super Landroid/support/v7/widget/RecyclerView$k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 31
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 14
    if-gez p1, :cond_0

    .line 16
    invoke-virtual {p0}, Lkik/android/widget/at;->a()V

    .line 26
    :goto_0
    return-void

    .line 18
    :cond_0
    if-lez p1, :cond_1

    .line 20
    invoke-virtual {p0}, Lkik/android/widget/at;->b()V

    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/at;->c()V

    goto :goto_0
.end method

.method public b()V
    .locals 0

    .prologue
    .line 36
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 41
    return-void
.end method
