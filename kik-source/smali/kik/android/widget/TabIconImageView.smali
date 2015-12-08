.class public Lkik/android/widget/TabIconImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 10
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x7f010002

    aput v2, v0, v1

    sput-object v0, Lkik/android/widget/TabIconImageView;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/TabIconImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/TabIconImageView;->b:Z

    .line 21
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lkik/android/widget/TabIconImageView;->b:Z

    if-eq v0, p1, :cond_0

    .line 41
    iput-boolean p1, p0, Lkik/android/widget/TabIconImageView;->b:Z

    .line 43
    invoke-virtual {p0}, Lkik/android/widget/TabIconImageView;->refreshDrawableState()V

    .line 45
    :cond_0
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 27
    iget-boolean v0, p0, Lkik/android/widget/TabIconImageView;->b:Z

    if-eqz v0, :cond_0

    .line 29
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/widget/ImageView;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 30
    sget-object v1, Lkik/android/widget/TabIconImageView;->a:[I

    invoke-static {v0, v1}, Lkik/android/widget/TabIconImageView;->mergeDrawableStates([I[I)[I

    .line 34
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onCreateDrawableState(I)[I

    move-result-object v0

    goto :goto_0
.end method
