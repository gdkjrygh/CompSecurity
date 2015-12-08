.class public Lcom/cleanmaster/data/filter/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/data/filter/b;


# instance fields
.field a:Lcom/cleanmaster/data/filter/b;

.field b:Lcom/cleanmaster/data/filter/b;


# direct methods
.method public constructor <init>(Lcom/cleanmaster/data/filter/b;Lcom/cleanmaster/data/filter/b;)V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/cleanmaster/data/filter/c;->a:Lcom/cleanmaster/data/filter/b;

    .line 8
    iput-object p2, p0, Lcom/cleanmaster/data/filter/c;->b:Lcom/cleanmaster/data/filter/b;

    .line 9
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/cleanmaster/data/filter/c;->a:Lcom/cleanmaster/data/filter/b;

    invoke-interface {v0, p1}, Lcom/cleanmaster/data/filter/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/data/filter/c;->b:Lcom/cleanmaster/data/filter/b;

    invoke-interface {v0, p1}, Lcom/cleanmaster/data/filter/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 18
    const-string v0, "(OR %s %s)"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/data/filter/c;->a:Lcom/cleanmaster/data/filter/b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/cleanmaster/data/filter/c;->b:Lcom/cleanmaster/data/filter/b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
