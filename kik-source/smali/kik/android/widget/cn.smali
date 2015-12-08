.class final Lkik/android/widget/cn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/ad$d;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/widget/KikNetworkedImageView;


# direct methods
.method constructor <init>(Lkik/android/widget/KikNetworkedImageView;Z)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    iput-boolean p2, p0, Lkik/android/widget/cn;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 2

    .prologue
    .line 195
    iget-object v0, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    invoke-static {v0}, Lkik/android/widget/KikNetworkedImageView;->a(Lkik/android/widget/KikNetworkedImageView;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    iget-object v1, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    invoke-static {v1}, Lkik/android/widget/KikNetworkedImageView;->a(Lkik/android/widget/KikNetworkedImageView;)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/KikNetworkedImageView;->setImageResource(I)V

    .line 198
    :cond_0
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;Z)V
    .locals 2

    .prologue
    .line 207
    if-eqz p2, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/cn;->a:Z

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    new-instance v1, Lkik/android/widget/co;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/co;-><init>(Lkik/android/widget/cn;Lcom/kik/cache/ad$c;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikNetworkedImageView;->post(Ljava/lang/Runnable;)Z

    .line 218
    :goto_0
    return-void

    .line 217
    :cond_0
    iget-object v1, p0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    if-nez p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-static {v1, p1, v0}, Lkik/android/widget/KikNetworkedImageView;->a(Lkik/android/widget/KikNetworkedImageView;Lcom/kik/cache/ad$c;Z)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
