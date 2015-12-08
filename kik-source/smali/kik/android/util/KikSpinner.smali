.class public Lkik/android/util/KikSpinner;
.super Landroid/widget/Spinner;
.source "SourceFile"


# instance fields
.field private a:Lkik/android/e/b;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/e/b;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lkik/android/util/KikSpinner;->a:Lkik/android/e/b;

    .line 60
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    .line 64
    invoke-super {p0, p1}, Landroid/widget/Spinner;->onWindowFocusChanged(Z)V

    .line 65
    iget-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    iget-object v0, p0, Lkik/android/util/KikSpinner;->a:Lkik/android/e/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/util/KikSpinner;->a:Lkik/android/e/b;

    invoke-interface {v0}, Lkik/android/e/b;->b()V

    .line 68
    :cond_0
    return-void
.end method

.method public performClick()Z
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/util/KikSpinner;->b:Z

    .line 51
    iget-object v0, p0, Lkik/android/util/KikSpinner;->a:Lkik/android/e/b;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lkik/android/util/KikSpinner;->a:Lkik/android/e/b;

    invoke-interface {v0}, Lkik/android/e/b;->a()V

    .line 54
    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z

    move-result v0

    return v0
.end method

.method public setSelection(I)V
    .locals 6

    .prologue
    .line 37
    invoke-virtual {p0}, Lkik/android/util/KikSpinner;->getSelectedItemPosition()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    .line 38
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 39
    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lkik/android/util/KikSpinner;->getOnItemSelectedListener()Landroid/widget/AdapterView$OnItemSelectedListener;

    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0}, Lkik/android/util/KikSpinner;->getSelectedView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Lkik/android/util/KikSpinner;->getSelectedItemId()J

    move-result-wide v4

    move-object v1, p0

    move v3, p1

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 45
    :cond_0
    return-void

    .line 37
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
