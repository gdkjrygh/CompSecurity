.class final Lkik/android/f/a/ad;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1269
    iput-object p1, p0, Lkik/android/f/a/ad;->b:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/ad;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1269
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/f/a/ad;->a:Lcom/kik/g/p;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 1280
    iget-object v0, p0, Lkik/android/f/a/ad;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1281
    return-void
.end method
