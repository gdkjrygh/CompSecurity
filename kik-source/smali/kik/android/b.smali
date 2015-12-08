.class final Lkik/android/b;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a;


# direct methods
.method constructor <init>(Lkik/android/a;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lkik/android/b;->a:Lkik/android/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 73
    iget-object v0, p0, Lkik/android/b;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->a(Lkik/android/a;)Lkik/a/f/f/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/b;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->a(Lkik/android/a;)Lkik/a/f/f/s;

    move-result-object v0

    iget-object v1, p0, Lkik/android/b;->a:Lkik/android/a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkik/android/a;->a(Lkik/android/a;Lkik/a/f/f/s;)Lkik/a/f/f/s;

    iget-object v1, p0, Lkik/android/b;->a:Lkik/android/a;

    invoke-static {v1, v0}, Lkik/android/a;->b(Lkik/android/a;Lkik/a/f/f/s;)V

    :cond_0
    return-void
.end method
