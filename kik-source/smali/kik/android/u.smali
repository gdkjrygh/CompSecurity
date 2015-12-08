.class final Lkik/android/u;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/s$a;


# direct methods
.method constructor <init>(Lkik/android/s$a;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lkik/android/u;->a:Lkik/android/s$a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lkik/android/u;->a:Lkik/android/s$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/s$a;->cancel(Z)Z

    .line 219
    iget-object v0, p0, Lkik/android/u;->a:Lkik/android/s$a;

    iget-object v0, v0, Lkik/android/s$a;->b:Lkik/android/s;

    iget-object v1, p0, Lkik/android/u;->a:Lkik/android/s$a;

    invoke-static {v0, v1}, Lkik/android/s;->a(Lkik/android/s;Lkik/android/s$a;)V

    .line 220
    return-void
.end method
