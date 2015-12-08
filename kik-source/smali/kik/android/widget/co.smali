.class final Lkik/android/widget/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cache/ad$c;

.field final synthetic b:Lkik/android/widget/cn;


# direct methods
.method constructor <init>(Lkik/android/widget/cn;Lcom/kik/cache/ad$c;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lkik/android/widget/co;->b:Lkik/android/widget/cn;

    iput-object p2, p0, Lkik/android/widget/co;->a:Lcom/kik/cache/ad$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lkik/android/widget/co;->b:Lkik/android/widget/cn;

    iget-object v0, v0, Lkik/android/widget/cn;->b:Lkik/android/widget/KikNetworkedImageView;

    iget-object v1, p0, Lkik/android/widget/co;->a:Lcom/kik/cache/ad$c;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lkik/android/widget/KikNetworkedImageView;->a(Lkik/android/widget/KikNetworkedImageView;Lcom/kik/cache/ad$c;Z)V

    .line 213
    return-void
.end method
