.class final Lkik/a/j/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lcom/kik/g/as;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/Long;

.field final synthetic e:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;Lcom/kik/g/as;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 556
    iput-object p1, p0, Lkik/a/j/y;->e:Lkik/a/j/u;

    iput-object p2, p0, Lkik/a/j/y;->a:Lcom/kik/g/as;

    iput-object p3, p0, Lkik/a/j/y;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/a/j/y;->c:Ljava/lang/String;

    iput-object p5, p0, Lkik/a/j/y;->d:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 556
    check-cast p1, Lcom/b/a/n;

    iget-object v0, p0, Lkik/a/j/y;->a:Lcom/kik/g/as;

    invoke-interface {v0, p1}, Lcom/kik/g/as;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/n;

    iget-object v1, p0, Lkik/a/j/y;->e:Lkik/a/j/u;

    iget-object v2, p0, Lkik/a/j/y;->b:Ljava/lang/String;

    iget-object v3, p0, Lkik/a/j/y;->c:Ljava/lang/String;

    iget-object v4, p0, Lkik/a/j/y;->d:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3, v0, v4}, Lkik/a/j/u;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/a/j/z;

    invoke-direct {v2, p0, v0}, Lkik/a/j/z;-><init>(Lkik/a/j/y;Lcom/b/a/n;)V

    invoke-static {v1, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
