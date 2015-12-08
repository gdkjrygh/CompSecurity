.class public Lkik/android/widget/DarkLinearLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 13
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x7f010002

    aput v2, v0, v1

    sput-object v0, Lkik/android/widget/DarkLinearLayout;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/DarkLinearLayout;->b:Z

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/DarkLinearLayout;->b:Z

    .line 24
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .prologue
    .line 43
    iget-boolean v0, p0, Lkik/android/widget/DarkLinearLayout;->b:Z

    if-eq v0, p1, :cond_0

    .line 44
    iput-boolean p1, p0, Lkik/android/widget/DarkLinearLayout;->b:Z

    .line 46
    invoke-virtual {p0}, Lkik/android/widget/DarkLinearLayout;->refreshDrawableState()V

    .line 48
    :cond_0
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 30
    iget-boolean v0, p0, Lkik/android/widget/DarkLinearLayout;->b:Z

    if-eqz v0, :cond_0

    .line 32
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 33
    sget-object v1, Lkik/android/widget/DarkLinearLayout;->a:[I

    invoke-static {v0, v1}, Lkik/android/widget/DarkLinearLayout;->mergeDrawableStates([I[I)[I

    .line 37
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    goto :goto_0
.end method
