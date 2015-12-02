.class Lcom/facebook/b/a/d;
.super Ljava/lang/Object;
.source "ChatHeadsBroadcaster.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/d/a/ab;

.field final synthetic b:Lcom/facebook/b/a/b;


# direct methods
.method constructor <init>(Lcom/facebook/b/a/b;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/facebook/b/a/d;->b:Lcom/facebook/b/a/b;

    iput-object p2, p0, Lcom/facebook/b/a/d;->a:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/b/a/d;->a:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 162
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 158
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/b/a/d;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/b/a/d;->a:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 167
    return-void
.end method
