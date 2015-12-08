.class public Lkik/android/widget/DarkFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 14
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x7f010002

    aput v2, v0, v1

    sput-object v0, Lkik/android/widget/DarkFrameLayout;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/DarkFrameLayout;->b:Z

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/DarkFrameLayout;->b:Z

    .line 25
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lkik/android/widget/DarkFrameLayout;->b:Z

    if-eq v0, p1, :cond_0

    .line 45
    iput-boolean p1, p0, Lkik/android/widget/DarkFrameLayout;->b:Z

    .line 47
    invoke-virtual {p0}, Lkik/android/widget/DarkFrameLayout;->refreshDrawableState()V

    .line 49
    :cond_0
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 31
    iget-boolean v0, p0, Lkik/android/widget/DarkFrameLayout;->b:Z

    if-eqz v0, :cond_0

    .line 33
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 34
    sget-object v1, Lkik/android/widget/DarkFrameLayout;->a:[I

    invoke-static {v0, v1}, Lkik/android/widget/DarkFrameLayout;->mergeDrawableStates([I[I)[I

    .line 38
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    goto :goto_0
.end method
