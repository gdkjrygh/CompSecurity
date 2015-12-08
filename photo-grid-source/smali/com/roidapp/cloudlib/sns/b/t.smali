.class final Lcom/roidapp/cloudlib/sns/b/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/a/af;
.implements Lcom/google/a/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/a/af",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/c;",
        ">;",
        "Lcom/google/a/w",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/b/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Lcom/google/a/x;
    .locals 2

    .prologue
    .line 102
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/c;

    .line 1111
    new-instance v1, Lcom/google/a/ad;

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/a/ad;-><init>(Ljava/lang/Boolean;)V

    .line 102
    return-object v1

    .line 1111
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/x;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 102
    .line 2106
    invoke-virtual {p1}, Lcom/google/a/x;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    goto :goto_0
.end method
