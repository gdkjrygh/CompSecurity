.class final Lkik/android/util/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/util/ck$c;

.field final synthetic b:Lkik/android/util/ck;


# direct methods
.method constructor <init>(Lkik/android/util/ck;Lkik/android/util/ck$c;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lkik/android/util/co;->b:Lkik/android/util/ck;

    iput-object p2, p0, Lkik/android/util/co;->a:Lkik/android/util/ck$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 237
    iget-object v0, p0, Lkik/android/util/co;->b:Lkik/android/util/ck;

    invoke-static {v0}, Lkik/android/util/ck;->c(Lkik/android/util/ck;)Lkik/a/e/v;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/co;->a:Lkik/android/util/ck$c;

    invoke-interface {v0, v1}, Lkik/a/e/v;->a(Ljava/lang/Object;)V

    .line 238
    return-void
.end method
