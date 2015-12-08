.class final Lkik/android/widget/bt;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/widget/au;

.field final synthetic d:Lkik/android/widget/GifWidgetFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifWidgetFragment;Ljava/util/List;Lcom/kik/g/p;Lkik/android/widget/au;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lkik/android/widget/bt;->d:Lkik/android/widget/GifWidgetFragment;

    iput-object p2, p0, Lkik/android/widget/bt;->a:Ljava/util/List;

    iput-object p3, p0, Lkik/android/widget/bt;->b:Lcom/kik/g/p;

    iput-object p4, p0, Lkik/android/widget/bt;->c:Lkik/android/widget/au;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 138
    check-cast p1, Lkik/android/gifs/a/d;

    iget-object v0, p0, Lkik/android/widget/bt;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p1}, Lkik/android/gifs/a/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/f;

    iget-object v2, p0, Lkik/android/widget/bt;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/android/widget/bt;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/android/widget/bt;->c:Lkik/android/widget/au;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lkik/android/widget/bt;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 154
    return-void
.end method
