.class final Lkik/android/widget/bm;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/widget/GifSearchFragment$b;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment$b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 550
    iput-object p1, p0, Lkik/android/widget/bm;->b:Lkik/android/widget/GifSearchFragment$b;

    iput-object p2, p0, Lkik/android/widget/bm;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 550
    check-cast p1, Lkik/android/widget/au;

    iget-object v0, p0, Lkik/android/widget/bm;->b:Lkik/android/widget/GifSearchFragment$b;

    iget-object v0, v0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bm;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lkik/android/widget/au;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lkik/android/widget/GifSearchFragment;->b(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V

    return-void
.end method
