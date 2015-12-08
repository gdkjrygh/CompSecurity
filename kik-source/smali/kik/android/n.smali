.class public final Lkik/android/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/k;


# instance fields
.field private a:Lcom/kik/g/f;

.field private b:Lcom/kik/g/k;

.field private c:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lkik/android/o;

    invoke-direct {v0, p0}, Lkik/android/o;-><init>(Lkik/android/n;)V

    iput-object v0, p0, Lkik/android/n;->c:Lcom/kik/g/i;

    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/android/n;->b:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/concurrent/ExecutorService;Lkik/a/a;)V
    .locals 3

    .prologue
    .line 50
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/n;->a:Lcom/kik/g/f;

    .line 51
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/android/n;->b:Lcom/kik/g/k;

    .line 52
    iget-object v0, p0, Lkik/android/n;->a:Lcom/kik/g/f;

    invoke-virtual {p2}, Lkik/a/a;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/n;->c:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 53
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/n;->a:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 30
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/n;->b:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 45
    return-void
.end method
