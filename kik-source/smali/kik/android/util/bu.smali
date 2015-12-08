.class public final Lkik/android/util/bu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/ListView;I)V
    .locals 1

    .prologue
    .line 84
    if-nez p0, :cond_1

    .line 100
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->setTranscriptMode(I)V

    .line 90
    if-eqz p1, :cond_0

    .line 91
    new-instance v0, Lkik/android/util/bv;

    invoke-direct {v0, p0, p1}, Lkik/android/util/bv;-><init>(Landroid/widget/ListView;I)V

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
