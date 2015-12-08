.class final Lkik/android/sdkutils/concurrent/g;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/sdkutils/concurrent/f;


# direct methods
.method constructor <init>(Lkik/android/sdkutils/concurrent/f;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lkik/android/sdkutils/concurrent/g;->a:Lkik/android/sdkutils/concurrent/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/g;->a:Lkik/android/sdkutils/concurrent/f;

    iget-object v0, v0, Lkik/android/sdkutils/concurrent/f;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 51
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Lcom/kik/g/r;->b()V

    .line 64
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/g;->a:Lkik/android/sdkutils/concurrent/f;

    iget-object v0, v0, Lkik/android/sdkutils/concurrent/f;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 65
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    .line 57
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/g;->a:Lkik/android/sdkutils/concurrent/f;

    iget-object v0, v0, Lkik/android/sdkutils/concurrent/f;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 58
    return-void
.end method
