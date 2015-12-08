.class final Lkik/a/j/t;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:[B

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/Long;

.field final synthetic f:Lcom/kik/g/p;

.field final synthetic g:Lkik/a/j/o;


# direct methods
.method constructor <init>(Lkik/a/j/o;[B[BLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lkik/a/j/t;->g:Lkik/a/j/o;

    iput-object p2, p0, Lkik/a/j/t;->a:[B

    iput-object p3, p0, Lkik/a/j/t;->b:[B

    iput-object p4, p0, Lkik/a/j/t;->c:Ljava/lang/String;

    iput-object p5, p0, Lkik/a/j/t;->d:Ljava/lang/String;

    iput-object p6, p0, Lkik/a/j/t;->e:Ljava/lang/Long;

    iput-object p7, p0, Lkik/a/j/t;->f:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 309
    check-cast p1, [B

    iget-object v0, p0, Lkik/a/j/t;->a:[B

    iget-object v1, p0, Lkik/a/j/t;->b:[B

    invoke-static {v0, p1, v1}, Lkik/a/h/o;->a([B[B[B)Lcom/kik/n/a/e/a;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/t;->g:Lkik/a/j/o;

    iget-object v2, p0, Lkik/a/j/t;->c:Ljava/lang/String;

    iget-object v3, p0, Lkik/a/j/t;->d:Ljava/lang/String;

    iget-object v4, p0, Lkik/a/j/t;->e:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3, v0, v4}, Lkik/a/j/o;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/t;->f:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lkik/a/j/t;->f:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 322
    return-void
.end method
