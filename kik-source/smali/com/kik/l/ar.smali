.class final Lcom/kik/l/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Ljava/util/HashMap;

.field final synthetic b:Lcom/kik/l/aq;


# direct methods
.method constructor <init>(Lcom/kik/l/aq;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/kik/l/ar;->b:Lcom/kik/l/aq;

    iput-object p2, p0, Lcom/kik/l/ar;->a:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 55
    check-cast p1, Lcom/kik/l/ap;

    const-string v0, "bin_id"

    invoke-virtual {p1, v0}, Lcom/kik/l/ap;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/l/ap;->a()Ljava/util/List;

    move-result-object v1

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v2, p0, Lcom/kik/l/ar;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
