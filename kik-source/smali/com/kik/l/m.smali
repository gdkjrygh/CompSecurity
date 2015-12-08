.class final Lcom/kik/l/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/Hashtable;

.field final synthetic c:Lcom/kik/l/l;


# direct methods
.method constructor <init>(Lcom/kik/l/l;ZLjava/util/Hashtable;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lcom/kik/l/m;->c:Lcom/kik/l/l;

    iput-boolean p2, p0, Lcom/kik/l/m;->a:Z

    iput-object p3, p0, Lcom/kik/l/m;->b:Ljava/util/Hashtable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 185
    check-cast p1, Lcom/kik/l/e;

    invoke-virtual {p1}, Lcom/kik/l/e;->a()Lkik/a/d/k;

    move-result-object v0

    iget-boolean v1, p0, Lcom/kik/l/m;->a:Z

    if-eqz v1, :cond_0

    const-string v1, "is_group"

    invoke-virtual {p1, v1}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/kik/l/m;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
