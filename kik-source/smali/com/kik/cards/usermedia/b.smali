.class final Lcom/kik/cards/usermedia/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Z

.field final synthetic c:Lcom/kik/cards/usermedia/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/a;Ljava/io/File;Z)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/kik/cards/usermedia/b;->c:Lcom/kik/cards/usermedia/a;

    iput-object p2, p0, Lcom/kik/cards/usermedia/b;->a:Ljava/io/File;

    iput-boolean p3, p0, Lcom/kik/cards/usermedia/b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/kik/cards/usermedia/b;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v1, p0, Lcom/kik/cards/usermedia/b;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/usermedia/b;->c:Lcom/kik/cards/usermedia/a;

    invoke-static {v1}, Lcom/kik/cards/usermedia/a;->a(Lcom/kik/cards/usermedia/a;)Lkik/a/e/v;

    move-result-object v1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/usermedia/b;->a:Ljava/io/File;

    invoke-interface {v1, v2, v3}, Lkik/a/e/v;->a(Ljava/util/UUID;Ljava/io/File;)V

    :cond_0
    return-object v0
.end method
