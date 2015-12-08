.class public final Lkik/android/chat/fragment/rp;
.super Lkik/android/chat/fragment/rr;
.source "SourceFile"


# instance fields
.field j:Ljava/lang/CharSequence;

.field k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/rr;-><init>(Landroid/view/View;)V

    .line 19
    const v0, 0x7f0e013c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/rp;->k:Landroid/widget/TextView;

    .line 20
    return-void
.end method
