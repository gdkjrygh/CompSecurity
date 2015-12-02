.class public Lcom/facebook/abtest/qe/b;
.super Ljava/lang/Object;
.source "QuickExperimentExpirationStrategy.java"


# static fields
.field private static a:J


# instance fields
.field private final b:Lcom/facebook/common/time/a;

.field private final c:Lcom/facebook/common/l/a;

.field private final d:J

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 31
    const-wide/32 v0, 0x6c258c00

    sput-wide v0, Lcom/facebook/abtest/qe/b;->a:J

    return-void
.end method

.method constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/common/l/a;JLcom/facebook/prefs/shared/d;Ljava/util/Set;)V
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/common/l/a;",
            "J",
            "Lcom/facebook/prefs/shared/d;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b;->b:Lcom/facebook/common/time/a;

    .line 54
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b;->c:Lcom/facebook/common/l/a;

    .line 55
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/abtest/qe/b;->d:J

    .line 56
    invoke-static {p5}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b;->f:Lcom/facebook/prefs/shared/d;

    .line 58
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 60
    invoke-interface {p6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/f/b;

    .line 61
    invoke-interface {v0}, Lcom/facebook/abtest/qe/f/b;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/f/a;

    .line 62
    iget-boolean v4, v0, Lcom/facebook/abtest/qe/f/a;->b:Z

    if-nez v4, :cond_1

    .line 63
    iget-object v0, v0, Lcom/facebook/abtest/qe/f/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b;->e:Ljava/util/Set;

    .line 69
    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/common/l/a;Lcom/facebook/prefs/shared/d;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/common/l/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 43
    sget-wide v3, Lcom/facebook/abtest/qe/b;->a:J

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/facebook/abtest/qe/b;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/common/l/a;JLcom/facebook/prefs/shared/d;Ljava/util/Set;)V

    .line 45
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 72
    iget-object v1, p0, Lcom/facebook/abtest/qe/b;->e:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 77
    :cond_0
    :goto_0
    return v0

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/facebook/abtest/qe/b;->f:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/abtest/qe/data/a;->e:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 77
    iget-object v3, p0, Lcom/facebook/abtest/qe/b;->b:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    iget-object v5, p0, Lcom/facebook/abtest/qe/b;->c:Lcom/facebook/common/l/a;

    iget-wide v5, v5, Lcom/facebook/common/l/a;->c:J

    sub-long/2addr v3, v5

    add-long/2addr v1, v3

    iget-wide v3, p0, Lcom/facebook/abtest/qe/b;->d:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
