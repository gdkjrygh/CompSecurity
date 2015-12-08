.class final Lkik/android/b/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:[B

.field final synthetic d:Lkik/android/b/s;


# direct methods
.method constructor <init>(Lkik/android/b/s;Ljava/lang/String;[B[B)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lkik/android/b/v;->d:Lkik/android/b/s;

    iput-object p2, p0, Lkik/android/b/v;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/b/v;->b:[B

    iput-object p4, p0, Lkik/android/b/v;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 127
    check-cast p1, Lcom/kik/n/a/b/c;

    if-nez p1, :cond_0

    new-instance v0, Lcom/kik/n/a/b/c;

    invoke-direct {v0}, Lcom/kik/n/a/b/c;-><init>()V

    iget-object v1, p0, Lkik/android/b/v;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/c;->a(Ljava/lang/String;)Lcom/kik/n/a/b/c;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/kik/n/a/b/a;

    invoke-direct {v0}, Lcom/kik/n/a/b/a;-><init>()V

    iget-object v1, p0, Lkik/android/b/v;->b:[B

    invoke-static {v1}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/a;->b(Lcom/b/a/b;)Lcom/kik/n/a/b/a;

    iget-object v1, p0, Lkik/android/b/v;->c:[B

    invoke-static {v1}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/a;->a(Lcom/b/a/b;)Lcom/kik/n/a/b/a;

    invoke-virtual {p1, v0}, Lcom/kik/n/a/b/c;->a(Lcom/kik/n/a/b/a;)Lcom/kik/n/a/b/c;

    return-object p1
.end method
