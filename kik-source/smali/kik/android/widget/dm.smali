.class final Lkik/android/widget/dm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field final synthetic a:Lkik/android/widget/dl;


# direct methods
.method constructor <init>(Lkik/android/widget/dl;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 82
    iget-object v0, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    invoke-static {v0}, Lkik/android/widget/dl;->a(Lkik/android/widget/dl;)[I

    move-result-object v0

    .line 84
    if-eqz v0, :cond_1

    array-length v1, v0

    if-ge v1, v4, :cond_0

    iget-object v1, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    iget-object v1, v1, Lkik/android/widget/dl;->a:[I

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    iget-object v1, v1, Lkik/android/widget/dl;->a:[I

    array-length v1, v1

    if-lt v1, v4, :cond_1

    iget-object v1, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    iget-object v1, v1, Lkik/android/widget/dl;->a:[I

    aget v1, v1, v2

    aget v2, v0, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    iget-object v1, v1, Lkik/android/widget/dl;->a:[I

    aget v1, v1, v3

    aget v0, v0, v3

    if-eq v1, v0, :cond_2

    .line 86
    :cond_1
    iget-object v0, p0, Lkik/android/widget/dm;->a:Lkik/android/widget/dl;

    invoke-virtual {v0}, Lkik/android/widget/dl;->d()V

    .line 88
    :cond_2
    return-void
.end method
