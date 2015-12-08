.class final Lkik/android/gifs/view/b;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/res/Resources;

.field final synthetic c:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/res/Resources;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lkik/android/gifs/view/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lkik/android/gifs/view/b;->b:Landroid/content/res/Resources;

    iput-object p3, p0, Lkik/android/gifs/view/b;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 41
    check-cast p1, Lkik/android/gifs/b/b;

    new-instance v1, Lkik/android/gifs/view/a;

    iget-object v0, p0, Lkik/android/gifs/view/b;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkik/android/gifs/view/a;-><init>(Ljava/lang/String;B)V

    iget-object v0, p1, Lkik/android/gifs/b/b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/b/a;

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v4, p0, Lkik/android/gifs/view/b;->b:Landroid/content/res/Resources;

    iget-object v5, v0, Lkik/android/gifs/b/a;->a:Landroid/graphics/Bitmap;

    invoke-direct {v3, v4, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget v0, v0, Lkik/android/gifs/b/a;->b:I

    invoke-virtual {v1, v3, v0}, Lkik/android/gifs/view/a;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/android/gifs/view/b;->c:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/android/gifs/view/b;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 55
    return-void
.end method
