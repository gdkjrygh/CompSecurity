.class public Lkik/android/widget/WindowAttachReporter;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/WindowAttachReporter$a;
    }
.end annotation


# instance fields
.field private a:Lkik/android/widget/WindowAttachReporter$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/WindowAttachReporter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/WindowAttachReporter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/widget/WindowAttachReporter$a;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lkik/android/widget/WindowAttachReporter;->a:Lkik/android/widget/WindowAttachReporter$a;

    .line 33
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 38
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 39
    return-void
.end method
