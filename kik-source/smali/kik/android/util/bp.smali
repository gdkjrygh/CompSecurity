.class final Lkik/android/util/bp;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/util/bo;


# direct methods
.method constructor <init>(Lkik/android/util/bo;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 11

    .prologue
    .line 87
    check-cast p2, Lkik/a/d/s;

    const-class v0, Lkik/a/d/a/a;

    invoke-static {p2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    const-string v2, "int-file-state"

    invoke-virtual {v1, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lkik/android/net/a/c;

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lkik/a/d/s;->o()[B

    move-result-object v4

    iget-object v5, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v5}, Lkik/android/util/bo;->a(Lkik/android/util/bo;)Lcom/kik/android/a;

    move-result-object v5

    iget-object v6, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v6}, Lkik/android/util/bo;->b(Lkik/android/util/bo;)Lkik/a/f/k;

    move-result-object v6

    iget-object v7, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v7}, Lkik/android/util/bo;->c(Lkik/android/util/bo;)Lkik/a/e/n;

    move-result-object v7

    iget-object v8, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v8}, Lkik/android/util/bo;->d(Lkik/android/util/bo;)Lkik/a/e/v;

    move-result-object v8

    iget-object v9, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v9}, Lkik/android/util/bo;->e(Lkik/android/util/bo;)Lkik/a/e/i;

    move-result-object v9

    iget-object v10, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-static {v10}, Lkik/android/util/bo;->f(Lkik/android/util/bo;)Lkik/a/e/t;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    :cond_0
    iget-object v0, p0, Lkik/android/util/bp;->a:Lkik/android/util/bo;

    invoke-virtual {v0, p2}, Lkik/android/util/bo;->b(Lkik/a/d/s;)V

    :cond_1
    return-void
.end method
