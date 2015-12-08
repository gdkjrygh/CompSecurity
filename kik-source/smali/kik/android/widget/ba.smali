.class final Lkik/android/widget/ba;
.super Landroid/support/v7/widget/RecyclerView$g;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;

.field private b:I


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 1

    .prologue
    .line 120
    iput-object p1, p0, Lkik/android/widget/ba;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$g;-><init>()V

    .line 122
    const/4 v0, 0x1

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/widget/ba;->b:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 127
    iget v0, p0, Lkik/android/widget/ba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 128
    iget v0, p0, Lkik/android/widget/ba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 129
    iget v0, p0, Lkik/android/widget/ba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 130
    iget v0, p0, Lkik/android/widget/ba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 131
    return-void
.end method
