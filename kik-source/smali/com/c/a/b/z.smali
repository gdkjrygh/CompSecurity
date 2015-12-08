.class final Lcom/c/a/b/z;
.super Lcom/c/a/b/ao;
.source "SourceFile"


# instance fields
.field a:Z

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1073
    iput-object p1, p0, Lcom/c/a/b/z;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/c/a/b/ao;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 1077
    iget-boolean v0, p0, Lcom/c/a/b/z;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1081
    iget-boolean v0, p0, Lcom/c/a/b/z;->a:Z

    if-eqz v0, :cond_0

    .line 1082
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 1084
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/a/b/z;->a:Z

    .line 1085
    iget-object v0, p0, Lcom/c/a/b/z;->b:Ljava/lang/Object;

    return-object v0
.end method
