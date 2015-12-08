.class final Lkik/android/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/android/b/a;


# direct methods
.method constructor <init>(Lkik/android/b/a;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lkik/android/b/c;->a:Lkik/android/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 51
    check-cast p1, Lcom/kik/n/a/c/e;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lkik/android/b/a$a;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lkik/android/b/a$a;-><init>(B)V

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->b()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, v1, Lkik/android/b/a$a;->c:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/c/g;

    sget-object v3, Lkik/android/b/a$1;->a:[I

    invoke-virtual {v0}, Lcom/kik/n/a/c/g;->c()Lcom/kik/n/a/c/g$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/n/a/c/g$a;->ordinal()I

    move-result v0

    aget v0, v3, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iput-boolean v4, v1, Lkik/android/b/a$a;->b:Z

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    iput-boolean v4, v1, Lkik/android/b/a$a;->a:Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->f()Lcom/kik/n/a/c/a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->f()Lcom/kik/n/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/n/a/c/a;->d()Lcom/b/a/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->f()Lcom/kik/n/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/n/a/c/a;->d()Lcom/b/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    iput-object v0, v1, Lkik/android/b/a$a;->d:[B

    :cond_3
    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->f()Lcom/kik/n/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/n/a/c/a;->c()Lcom/b/a/b;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/kik/n/a/c/e;->f()Lcom/kik/n/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/n/a/c/a;->c()Lcom/b/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    iput-object v0, v1, Lkik/android/b/a$a;->e:[B

    :cond_4
    move-object v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
