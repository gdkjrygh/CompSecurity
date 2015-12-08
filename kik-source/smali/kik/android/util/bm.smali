.class final Lkik/android/util/bm;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lkik/android/util/bl;


# direct methods
.method constructor <init>(Lkik/android/util/bl;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    iput-object p2, p0, Lkik/android/util/bm;->a:Lkik/a/d/s;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 11

    .prologue
    .line 60
    iget-object v0, p0, Lkik/android/util/bm;->a:Lkik/a/d/s;

    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    new-instance v0, Lkik/android/net/a/c;

    iget-object v2, p0, Lkik/android/util/bm;->a:Lkik/a/d/s;

    invoke-virtual {v2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/util/bm;->a:Lkik/a/d/s;

    invoke-virtual {v3}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/util/bm;->a:Lkik/a/d/s;

    invoke-virtual {v4}, Lkik/a/d/s;->o()[B

    move-result-object v4

    iget-object v5, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v5}, Lkik/android/util/bl;->a(Lkik/android/util/bl;)Lcom/kik/android/a;

    move-result-object v5

    iget-object v6, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v6}, Lkik/android/util/bl;->b(Lkik/android/util/bl;)Lkik/a/f/k;

    move-result-object v6

    iget-object v7, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v7}, Lkik/android/util/bl;->c(Lkik/android/util/bl;)Lkik/a/e/n;

    move-result-object v7

    iget-object v8, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v8}, Lkik/android/util/bl;->d(Lkik/android/util/bl;)Lkik/a/e/v;

    move-result-object v8

    iget-object v9, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v9}, Lkik/android/util/bl;->e(Lkik/android/util/bl;)Lkik/a/e/i;

    move-result-object v9

    iget-object v10, p0, Lkik/android/util/bm;->b:Lkik/android/util/bl;

    invoke-static {v10}, Lkik/android/util/bl;->f(Lkik/android/util/bl;)Lkik/a/e/t;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    return-void
.end method
