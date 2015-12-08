.class final Lkik/a/j/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Ljava/lang/String;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 520
    iput-object p1, p0, Lkik/a/j/c;->c:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/c;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/j/c;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 524
    :try_start_0
    iget-object v0, p0, Lkik/a/j/c;->c:Lkik/a/j/a;

    iget-object v1, p0, Lkik/a/j/c;->a:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lkik/a/j/a;->a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 526
    iget-object v0, p0, Lkik/a/j/c;->b:Lcom/kik/g/p;

    new-instance v1, Lkik/a/d/ab;

    iget-object v2, p0, Lkik/a/j/c;->a:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 531
    :goto_0
    return-void

    .line 528
    :catch_0
    move-exception v0

    .line 529
    iget-object v1, p0, Lkik/a/j/c;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
