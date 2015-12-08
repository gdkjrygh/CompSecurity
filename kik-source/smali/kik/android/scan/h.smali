.class final Lkik/android/scan/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/android/scan/d;


# direct methods
.method constructor <init>(Lkik/android/scan/d;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lkik/android/scan/h;->a:Lkik/android/scan/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 166
    check-cast p1, Lcom/kik/n/a/i/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/n/a/i/a;->b()Lcom/b/a/b;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null seed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lkik/android/scan/h;->a:Lkik/android/scan/d;

    invoke-virtual {p1}, Lcom/kik/n/a/i/a;->b()Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/b/a/b;->c()[B

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/scan/d;->a(Lkik/android/scan/d;[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
