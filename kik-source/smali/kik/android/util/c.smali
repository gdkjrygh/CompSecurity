.class final Lkik/android/util/c;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cache/ad$c;

.field final synthetic b:Lkik/android/util/b;


# direct methods
.method constructor <init>(Lkik/android/util/b;Lcom/kik/cache/ad$c;)V
    .locals 0

    .prologue
    .line 738
    iput-object p1, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iput-object p2, p0, Lkik/android/util/c;->a:Lcom/kik/cache/ad$c;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 738
    iget-object v0, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v0, v0, Lkik/android/util/b;->d:Lkik/android/util/a;

    invoke-static {v0}, Lkik/android/util/a;->a(Lkik/android/util/a;)Lcom/kik/l/ab;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/c;->a:Lcom/kik/cache/ad$c;

    invoke-virtual {v1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v2, v2, Lkik/android/util/b;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/kik/l/ab;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v0, v0, Lkik/android/util/b;->b:Lcom/kik/g/p;

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v0, v0, Lkik/android/util/b;->c:Lkik/a/d/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v0, v0, Lkik/android/util/b;->d:Lkik/android/util/a;

    invoke-static {v0}, Lkik/android/util/a;->b(Lkik/android/util/a;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/c;->b:Lkik/android/util/b;

    iget-object v1, v1, Lkik/android/util/b;->c:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-object v3
.end method
