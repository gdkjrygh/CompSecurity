.class final Lkik/android/widget/bl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/bk;


# direct methods
.method constructor <init>(Lkik/android/widget/bk;)V
    .locals 0

    .prologue
    .line 491
    iput-object p1, p0, Lkik/android/widget/bl;->a:Lkik/android/widget/bk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 495
    iget-object v0, p0, Lkik/android/widget/bl;->a:Lkik/android/widget/bk;

    iget-object v0, v0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    sget v1, Lkik/android/widget/GifWidget$a;->g:I

    invoke-virtual {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 496
    iget-object v0, p0, Lkik/android/widget/bl;->a:Lkik/android/widget/bk;

    iget-object v0, v0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->h()Lkik/android/gifs/a/b;

    move-result-object v0

    const-string v1, "GIF_RESULT_KEY"

    invoke-virtual {v0, v1}, Lkik/android/gifs/a/b;->a(Ljava/lang/String;)V

    .line 497
    return-void
.end method
