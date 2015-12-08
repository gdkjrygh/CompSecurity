.class final Lcom/kik/view/adapters/ae;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/ad$a;

.field final synthetic b:Lkik/a/d/a/a;

.field final synthetic c:Lcom/kik/view/adapters/ad;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/ad;Lcom/kik/view/adapters/ad$a;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/kik/view/adapters/ae;->c:Lcom/kik/view/adapters/ad;

    iput-object p2, p0, Lcom/kik/view/adapters/ae;->a:Lcom/kik/view/adapters/ad$a;

    iput-object p3, p0, Lcom/kik/view/adapters/ae;->b:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 67
    iget-object v0, p0, Lcom/kik/view/adapters/ae;->a:Lcom/kik/view/adapters/ad$a;

    iget-object v0, v0, Lcom/kik/view/adapters/ad$a;->a:Lkik/android/gifs/view/GifView;

    iget-object v1, p0, Lcom/kik/view/adapters/ae;->b:Lkik/a/d/a/a;

    invoke-static {v1}, Lcom/kik/view/adapters/ad;->b(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-virtual {v0, v1, v2}, Lkik/android/gifs/view/GifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    .line 68
    return-void
.end method
