.class public Lcom/a/a/g;
.super Ljava/lang/Object;
.source "AnimatorSet.java"


# instance fields
.field final synthetic a:Lcom/a/a/d;

.field private b:Lcom/a/a/j;


# direct methods
.method constructor <init>(Lcom/a/a/d;Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 1023
    iput-object p1, p0, Lcom/a/a/g;->a:Lcom/a/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1024
    invoke-static {p1}, Lcom/a/a/d;->b(Lcom/a/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    iput-object v0, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    .line 1025
    iget-object v0, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    if-nez v0, :cond_0

    .line 1026
    new-instance v0, Lcom/a/a/j;

    invoke-direct {v0, p2}, Lcom/a/a/j;-><init>(Lcom/a/a/a;)V

    iput-object v0, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    .line 1027
    invoke-static {p1}, Lcom/a/a/d;->b(Lcom/a/a/d;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1028
    invoke-static {p1}, Lcom/a/a/d;->d(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1030
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/a;)Lcom/a/a/g;
    .locals 4

    .prologue
    .line 1040
    iget-object v0, p0, Lcom/a/a/g;->a:Lcom/a/a/d;

    invoke-static {v0}, Lcom/a/a/d;->b(Lcom/a/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 1041
    if-nez v0, :cond_0

    .line 1042
    new-instance v0, Lcom/a/a/j;

    invoke-direct {v0, p1}, Lcom/a/a/j;-><init>(Lcom/a/a/a;)V

    .line 1043
    iget-object v1, p0, Lcom/a/a/g;->a:Lcom/a/a/d;

    invoke-static {v1}, Lcom/a/a/d;->b(Lcom/a/a/d;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    iget-object v1, p0, Lcom/a/a/g;->a:Lcom/a/a/d;

    invoke-static {v1}, Lcom/a/a/d;->d(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1046
    :cond_0
    new-instance v1, Lcom/a/a/h;

    iget-object v2, p0, Lcom/a/a/g;->b:Lcom/a/a/j;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/a/a/h;-><init>(Lcom/a/a/j;I)V

    .line 1047
    invoke-virtual {v0, v1}, Lcom/a/a/j;->a(Lcom/a/a/h;)V

    .line 1048
    return-object p0
.end method
