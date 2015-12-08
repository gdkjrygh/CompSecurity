.class final Lcom/kik/l/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/kik/l/a;


# direct methods
.method constructor <init>(Lcom/kik/l/a;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/kik/l/b;->b:Lcom/kik/l/a;

    iput-object p2, p0, Lcom/kik/l/b;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 74
    check-cast p1, Lcom/kik/l/a$a;

    invoke-virtual {p1}, Lcom/kik/l/a$a;->a()Lkik/a/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/l/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
