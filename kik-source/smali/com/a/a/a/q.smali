.class final Lcom/a/a/a/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/a/q$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/a/a/a/r;

.field public final b:J

.field public final c:Lcom/a/a/a/q$a;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/Map;

.field private g:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/a/a/a/r;JLcom/a/a/a/q$a;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/a/a/a/q;->a:Lcom/a/a/a/r;

    .line 77
    iput-wide p2, p0, Lcom/a/a/a/q;->b:J

    .line 78
    iput-object p4, p0, Lcom/a/a/a/q;->c:Lcom/a/a/a/q$a;

    .line 79
    iput-object p5, p0, Lcom/a/a/a/q;->d:Ljava/util/Map;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/a/q;->e:Ljava/lang/String;

    .line 81
    iput-object p6, p0, Lcom/a/a/a/q;->f:Ljava/util/Map;

    .line 82
    return-void
.end method

.method public static a(Lcom/a/a/a/r;)Lcom/a/a/a/q;
    .locals 2

    .prologue
    .line 44
    sget-object v0, Lcom/a/a/a/q$a;->j:Lcom/a/a/a/q$a;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Ljava/util/Map;)Lcom/a/a/a/q;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;
    .locals 2

    .prologue
    .line 38
    const-string v0, "activity"

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 40
    invoke-static {p0, p1, v0}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Ljava/util/Map;)Lcom/a/a/a/q;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Ljava/util/Map;)Lcom/a/a/a/q;
    .locals 7

    .prologue
    .line 65
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v6

    new-instance v0, Lcom/a/a/a/q;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/a/a/a/q;-><init>(Lcom/a/a/a/r;JLcom/a/a/a/q$a;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public static a(Lcom/a/a/a/r;Ljava/lang/String;)Lcom/a/a/a/q;
    .locals 2

    .prologue
    .line 48
    const-string v0, "sessionId"

    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 49
    sget-object v1, Lcom/a/a/a/q$a;->h:Lcom/a/a/a/q$a;

    invoke-static {p0, v1, v0}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Ljava/util/Map;)Lcom/a/a/a/q;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/a/a/a/r;Ljava/lang/String;)Lcom/a/a/a/q;
    .locals 2

    .prologue
    .line 53
    const-string v0, "sessionId"

    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 54
    sget-object v1, Lcom/a/a/a/q$a;->i:Lcom/a/a/a/q$a;

    invoke-static {p0, v1, v0}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Ljava/util/Map;)Lcom/a/a/a/q;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 86
    iget-object v0, p0, Lcom/a/a/a/q;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/a/a/a/q;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/a/q;->c:Lcom/a/a/a/q$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", details="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/a/q;->d:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/a/q;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customAttributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/a/q;->f:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metadata=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/a/q;->a:Lcom/a/a/a/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/a/q;->g:Ljava/lang/String;

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/a/a/a/q;->g:Ljava/lang/String;

    return-object v0
.end method
