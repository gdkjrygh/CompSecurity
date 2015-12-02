.class public abstract Lcom/facebook/analytics/ca;
.super Ljava/lang/Object;
.source "HoneyAnalyticsEvent.java"

# interfaces
.implements Lcom/facebook/analytics/am;


# instance fields
.field protected final a:Ljava/lang/String;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Ljava/lang/String;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/analytics/ca;->b:J

    .line 20
    const-string v0, "AUTO_SET"

    iput-object v0, p0, Lcom/facebook/analytics/ca;->c:Ljava/lang/String;

    .line 22
    const-string v0, "AUTO_SET"

    iput-object v0, p0, Lcom/facebook/analytics/ca;->e:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/ca;->g:Z

    .line 32
    iput-object p1, p0, Lcom/facebook/analytics/ca;->a:Ljava/lang/String;

    .line 33
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/ca;->f:Ljava/util/Map;

    .line 34
    iput-object p2, p0, Lcom/facebook/analytics/ca;->c:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public a(J)Lcom/facebook/analytics/ca;
    .locals 0

    .prologue
    .line 54
    iput-wide p1, p0, Lcom/facebook/analytics/ca;->b:J

    .line 55
    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/facebook/analytics/ca;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/analytics/ca;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    return-object p0
.end method

.method a(Z)Lcom/facebook/analytics/ca;
    .locals 0

    .prologue
    .line 66
    iput-boolean p1, p0, Lcom/facebook/analytics/ca;->d:Z

    .line 67
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/analytics/ca;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/analytics/ca;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 46
    iget-wide v0, p0, Lcom/facebook/analytics/ca;->b:J

    return-wide v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/analytics/ca;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method b(Z)V
    .locals 0

    .prologue
    .line 120
    iput-boolean p1, p0, Lcom/facebook/analytics/ca;->g:Z

    .line 121
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/analytics/ca;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/analytics/ca;->c:Ljava/lang/String;

    .line 62
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/analytics/ca;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/analytics/ca;->e:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/facebook/analytics/ca;->d:Z

    return v0
.end method

.method public abstract e()Lcom/fasterxml/jackson/databind/JsonNode;
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/analytics/ca;->e:Ljava/lang/String;

    return-object v0
.end method

.method protected g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/analytics/ca;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method h()Z
    .locals 1

    .prologue
    .line 111
    iget-boolean v0, p0, Lcom/facebook/analytics/ca;->g:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 125
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/analytics/ca;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/facebook/analytics/ca;->g()Ljava/util/Set;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p0}, Lcom/facebook/analytics/ca;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
