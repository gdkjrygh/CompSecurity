.class Lcom/google/inject/matcher/Matchers$Not;
.super Lcom/google/inject/matcher/AbstractMatcher;
.source "Matchers.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/matcher/Matchers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Not"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/matcher/AbstractMatcher",
        "<TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field final delegate:Lcom/google/inject/matcher/Matcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/matcher/Matcher",
            "<-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/inject/matcher/Matcher;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-TT;>;)V"
        }
    .end annotation

    .prologue
    .line 71
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    .local p1, "delegate":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-TT;>;"
    invoke-direct {p0}, Lcom/google/inject/matcher/AbstractMatcher;-><init>()V

    .line 72
    const-string v0, "delegate"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/matcher/Matcher;

    iput-object v0, p0, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    .line 73
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/matcher/Matchers$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/matcher/Matcher;
    .param p2, "x1"    # Lcom/google/inject/matcher/Matchers$1;

    .prologue
    .line 68
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/matcher/Matchers$Not;-><init>(Lcom/google/inject/matcher/Matcher;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 80
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    instance-of v0, p1, Lcom/google/inject/matcher/Matchers$Not;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/inject/matcher/Matchers$Not;

    .end local p1    # "other":Ljava/lang/Object;
    iget-object v0, p1, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 85
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    iget-object v0, p0, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public matches(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    .local p1, "t":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    invoke-interface {v0, p1}, Lcom/google/inject/matcher/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 89
    .local p0, "this":Lcom/google/inject/matcher/Matchers$Not;, "Lcom/google/inject/matcher/Matchers$Not<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$Not;->delegate:Lcom/google/inject/matcher/Matcher;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
