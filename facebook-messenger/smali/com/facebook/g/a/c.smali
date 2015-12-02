.class public Lcom/facebook/g/a/c;
.super Ljava/lang/Object;
.source "CustomGraphQLQueryFieldCall.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 16
    iput-object p1, p0, Lcom/facebook/g/a/c;->a:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/facebook/g/a/c;->b:[Ljava/lang/Object;

    .line 18
    return-void

    .line 15
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/g/a/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/g/a/c;->b:[Ljava/lang/Object;

    return-object v0
.end method
