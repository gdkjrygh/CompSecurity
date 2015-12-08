.class public final Lcom/kik/view/adapters/ad;
.super Lcom/kik/view/adapters/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/ad$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/s;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 39
    return-void
.end method

.method static synthetic b(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lkik/android/gifs/a;->b:Lkik/a/d/a/a$c;

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 107
    const v0, 0x7f030069

    return v0
.end method

.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 97
    new-instance v1, Lcom/kik/view/adapters/ad$a;

    invoke-direct {v1}, Lcom/kik/view/adapters/ad$a;-><init>()V

    .line 98
    invoke-super {p0, p1, v1}, Lcom/kik/view/adapters/s;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;

    move-result-object v2

    .line 99
    const v0, 0x7f0e00e2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/view/GifView;

    iput-object v0, v1, Lcom/kik/view/adapters/ad$a;->a:Lkik/android/gifs/view/GifView;

    .line 100
    iget-object v0, v1, Lcom/kik/view/adapters/ad$a;->a:Lkik/android/gifs/view/GifView;

    iput-object v0, v1, Lcom/kik/view/adapters/ad$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    .line 101
    return-object v2
.end method

.method protected final a(Lkik/a/d/a/a;)Lkik/a/d/d;
    .locals 1

    .prologue
    .line 91
    const-string v0, "preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    return-object v0
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 3

    .prologue
    .line 49
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 50
    check-cast p2, Lcom/kik/view/adapters/ad$a;

    .line 51
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p2, Lcom/kik/view/adapters/ad$a;->i:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 53
    if-eqz p1, :cond_0

    if-eqz p3, :cond_1

    .line 70
    :cond_0
    :goto_0
    return-void

    .line 57
    :cond_1
    sget-object v0, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p2, Lcom/kik/view/adapters/ad$a;->a:Lkik/android/gifs/view/GifView;

    sget-object v2, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-virtual {v1, v0, v2}, Lkik/android/gifs/view/GifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/ae;

    invoke-direct {v1, p0, p2, p1}, Lcom/kik/view/adapters/ae;-><init>(Lcom/kik/view/adapters/ad;Lcom/kik/view/adapters/ad$a;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 119
    instance-of v0, p1, Lcom/kik/view/adapters/ad$a;

    return v0
.end method

.method protected final a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final e(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
