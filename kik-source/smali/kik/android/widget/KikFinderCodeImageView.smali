.class public Lkik/android/widget/KikFinderCodeImageView;
.super Lkik/android/widget/KikCodeImageView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikCodeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/scan/KikCode;)V
    .locals 2

    .prologue
    .line 22
    invoke-super {p0, p1}, Lkik/android/widget/KikCodeImageView;->a(Lcom/kik/scan/KikCode;)V

    .line 23
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    invoke-virtual {p0}, Lkik/android/widget/KikFinderCodeImageView;->a()[B

    move-result-object v0

    .line 27
    const/4 v1, 0x4

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    .line 28
    invoke-virtual {p0, v1}, Lkik/android/widget/KikFinderCodeImageView;->b([B)V

    .line 31
    :cond_0
    invoke-virtual {p0, v0}, Lkik/android/widget/KikFinderCodeImageView;->a([B)V

    .line 32
    return-void

    .line 27
    nop

    :array_0
    .array-data 1
        -0x4et
        -0x35t
        0x25t
        -0x3at
    .end array-data
.end method
