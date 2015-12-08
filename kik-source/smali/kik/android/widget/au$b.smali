.class final Lkik/android/widget/au$b;
.super Landroid/support/v7/widget/RecyclerView$t;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/au;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field j:Lkik/android/gifs/view/ResultListGifView;

.field k:Lkik/android/gifs/a/f;

.field l:Lkik/android/gifs/a/e;

.field m:I

.field n:Lkik/android/widget/by;


# direct methods
.method public constructor <init>(Lkik/android/gifs/view/ResultListGifView;Lkik/android/widget/by;)V
    .locals 1

    .prologue
    .line 147
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$t;-><init>(Landroid/view/View;)V

    .line 148
    iput-object p2, p0, Lkik/android/widget/au$b;->n:Lkik/android/widget/by;

    .line 149
    iput-object p1, p0, Lkik/android/widget/au$b;->j:Lkik/android/gifs/view/ResultListGifView;

    .line 150
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/au$b;->b(Z)V

    .line 151
    return-void
.end method

.method static synthetic a(Lkik/android/widget/au$b;I)V
    .locals 0

    .prologue
    .line 136
    iput p1, p0, Lkik/android/widget/au$b;->m:I

    return-void
.end method

.method static synthetic a(Lkik/android/widget/au$b;Lkik/android/gifs/a/e;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lkik/android/widget/au$b;->l:Lkik/android/gifs/a/e;

    return-void
.end method

.method static synthetic a(Lkik/android/widget/au$b;Lkik/android/gifs/a/f;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lkik/android/widget/au$b;->k:Lkik/android/gifs/a/f;

    return-void
.end method

.method static synthetic a(Lkik/android/widget/au$b;Z)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lkik/android/widget/au$b;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 155
    if-eqz p1, :cond_0

    .line 156
    iget-object v0, p0, Lkik/android/widget/au$b;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    :goto_0
    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Lkik/android/widget/au$b;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 181
    iget-object v0, p0, Lkik/android/widget/au$b;->n:Lkik/android/widget/by;

    iget-object v1, p0, Lkik/android/widget/au$b;->k:Lkik/android/gifs/a/f;

    iget v2, p0, Lkik/android/widget/au$b;->m:I

    invoke-interface {v0, v1, v2}, Lkik/android/widget/by;->a(Lkik/android/gifs/a/f;I)V

    .line 182
    return-void
.end method
