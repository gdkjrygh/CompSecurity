.class public Lkik/android/widget/BackDelegatingRobotoEditText;
.super Lkik/android/widget/RobotoEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/BackDelegatingRobotoEditText$a;
    }
.end annotation


# instance fields
.field private a:Lkik/android/widget/BackDelegatingRobotoEditText$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lkik/android/widget/RobotoEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/RobotoEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    return-void
.end method


# virtual methods
.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 39
    iget-object v1, p0, Lkik/android/widget/BackDelegatingRobotoEditText;->a:Lkik/android/widget/BackDelegatingRobotoEditText$a;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    .line 40
    invoke-virtual {p0}, Lkik/android/widget/BackDelegatingRobotoEditText;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v2

    if-nez v2, :cond_2

    .line 44
    invoke-virtual {v1, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 45
    iget-object v1, p0, Lkik/android/widget/BackDelegatingRobotoEditText;->a:Lkik/android/widget/BackDelegatingRobotoEditText$a;

    invoke-virtual {v1}, Lkik/android/widget/BackDelegatingRobotoEditText$a;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 64
    :cond_0
    :goto_0
    return v0

    .line 49
    :cond_1
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-ne v2, v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 54
    iget-object v1, p0, Lkik/android/widget/BackDelegatingRobotoEditText;->a:Lkik/android/widget/BackDelegatingRobotoEditText$a;

    invoke-virtual {v1}, Lkik/android/widget/BackDelegatingRobotoEditText$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 59
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 64
    :cond_3
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method
