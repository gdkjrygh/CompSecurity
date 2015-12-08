.class final Lkik/a/j/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lkik/a/j/h;->b:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/h;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 351
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 353
    iget-object v0, p0, Lkik/a/j/h;->b:Lkik/a/j/a;

    invoke-static {v0}, Lkik/a/j/a;->a(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 355
    iget-object v0, p0, Lkik/a/j/h;->b:Lkik/a/j/a;

    invoke-static {v0}, Lkik/a/j/a;->a(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 358
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 359
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 361
    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 362
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 368
    :cond_1
    iget-object v0, p0, Lkik/a/j/h;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 370
    :cond_2
    return-void
.end method
