.class public Lcom/facebook/orca/contacts/divebar/bk;
.super Lcom/facebook/backgroundtasks/a;
.source "DivebarPreloadBackgroundTask.java"


# instance fields
.field private final a:Lcom/facebook/orca/contacts/divebar/ao;

.field private final b:Lcom/facebook/common/v/a;

.field private final c:Lcom/facebook/auth/b/b;

.field private final d:Lcom/facebook/common/time/a;

.field private e:J


# direct methods
.method public constructor <init>(Lcom/facebook/orca/contacts/divebar/ao;Lcom/facebook/common/v/a;Lcom/facebook/auth/b/b;Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 40
    const-string v0, "DIVEBAR"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bk;->a:Lcom/facebook/orca/contacts/divebar/ao;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/bk;->b:Lcom/facebook/common/v/a;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/bk;->c:Lcom/facebook/auth/b/b;

    .line 44
    iput-object p4, p0, Lcom/facebook/orca/contacts/divebar/bk;->d:Lcom/facebook/common/time/a;

    .line 45
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 55
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bk;->d:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/facebook/orca/contacts/divebar/bk;->e:J

    sub-long/2addr v1, v3

    const-wide/32 v3, 0x493e0

    cmp-long v1, v1, v3

    if-gez v1, :cond_1

    .line 66
    :cond_0
    :goto_0
    return v0

    .line 59
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bk;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bk;->b:Lcom/facebook/common/v/a;

    invoke-virtual {v1}, Lcom/facebook/common/v/a;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bk;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/bk;->e:J

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bk;->a:Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ao;->a()Lcom/facebook/orca/contacts/divebar/ad;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ad;->s()Lcom/facebook/orca/contacts/divebar/an;

    .line 74
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 49
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 6

    .prologue
    const-wide/16 v0, -0x1

    .line 79
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/bk;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v2}, Lcom/facebook/auth/b/b;->b()Z

    move-result v2

    if-nez v2, :cond_1

    .line 85
    :cond_0
    :goto_0
    return-wide v0

    .line 82
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/bk;->b:Lcom/facebook/common/v/a;

    invoke-virtual {v2}, Lcom/facebook/common/v/a;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bk;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/bk;->e:J

    const-wide/32 v4, 0x493e0

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_0
.end method
