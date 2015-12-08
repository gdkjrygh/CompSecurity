.class final Lkik/a/j/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:[B

.field final synthetic d:Lcom/kik/g/p;

.field final synthetic e:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 498
    iput-object p1, p0, Lkik/a/j/l;->e:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/l;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/j/l;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/a/j/l;->c:[B

    iput-object p5, p0, Lkik/a/j/l;->d:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 502
    :try_start_0
    iget-object v0, p0, Lkik/a/j/l;->e:Lkik/a/j/a;

    iget-object v1, p0, Lkik/a/j/l;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/a/j/l;->b:Ljava/lang/String;

    iget-object v3, p0, Lkik/a/j/l;->c:[B

    invoke-static {v0, v1, v2, v3}, Lkik/a/j/a;->a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[B)Lkik/a/d/ab;

    move-result-object v0

    .line 504
    iget-object v1, p0, Lkik/a/j/l;->d:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 509
    :goto_0
    return-void

    .line 506
    :catch_0
    move-exception v0

    .line 507
    iget-object v1, p0, Lkik/a/j/l;->d:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
