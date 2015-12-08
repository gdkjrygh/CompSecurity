.class final Lkik/android/widget/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/aa;


# direct methods
.method constructor <init>(Lkik/android/widget/aa;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 138
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lkik/android/widget/aa;->a(Ljava/util/Map;)Ljava/util/Map;

    iget-object v0, p0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-static {v0}, Lkik/android/widget/aa;->a(Lkik/android/widget/aa;)V

    iget-object v0, p0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-static {v0}, Lkik/android/widget/aa;->b(Lkik/android/widget/aa;)V

    iget-object v0, p0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-static {v0}, Lkik/android/widget/aa;->c(Lkik/android/widget/aa;)V

    iget-object v0, p0, Lkik/android/widget/ab;->a:Lkik/android/widget/aa;

    invoke-static {v0}, Lkik/android/widget/aa;->d(Lkik/android/widget/aa;)Lkik/android/widget/GalleryWidget;

    move-result-object v0

    new-instance v1, Lkik/android/widget/ac;

    invoke-direct {v1, p0}, Lkik/android/widget/ac;-><init>(Lkik/android/widget/ab;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/GalleryWidget;->b(Ljava/lang/Runnable;)V

    return-void
.end method
