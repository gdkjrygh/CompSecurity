.class final Lkik/android/util/bn;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lkik/android/util/bl;


# direct methods
.method constructor <init>(Lkik/android/util/bl;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lkik/android/util/bn;->b:Lkik/android/util/bl;

    iput-object p2, p0, Lkik/android/util/bn;->a:Lkik/a/d/s;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/util/bn;->b:Lkik/android/util/bl;

    invoke-static {v0}, Lkik/android/util/bl;->e(Lkik/android/util/bl;)Lkik/a/e/i;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/bn;->a:Lkik/a/d/s;

    invoke-interface {v0, v1}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 91
    return-void
.end method
