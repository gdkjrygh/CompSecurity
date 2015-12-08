.class public final Lcom/kik/g/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/l$a;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/util/Hashtable;

.field private c:Lcom/kik/g/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/kik/g/l;->a:J

    .line 31
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/kik/g/l;->b:Ljava/util/Hashtable;

    .line 32
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/g/l;->c:Lcom/kik/g/k;

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/kik/g/l;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/kik/g/l;->c:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public final a(J)I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 87
    iget-object v0, p0, Lcom/kik/g/l;->b:Ljava/util/Hashtable;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/kik/g/l;->b:Ljava/util/Hashtable;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/l$a;

    .line 89
    if-nez v0, :cond_0

    move v0, v1

    .line 96
    :goto_0
    return v0

    .line 93
    :cond_0
    iget v0, v0, Lcom/kik/g/l$a;->b:I

    goto :goto_0

    :cond_1
    move v0, v1

    .line 96
    goto :goto_0
.end method

.method public final a(Lcom/kik/g/p;)J
    .locals 6

    .prologue
    .line 47
    new-instance v0, Lcom/kik/g/l$a;

    iget-wide v2, p0, Lcom/kik/g/l;->a:J

    invoke-direct {v0, p0, v2, v3}, Lcom/kik/g/l$a;-><init>(Lcom/kik/g/l;J)V

    .line 48
    new-instance v1, Lcom/kik/g/m;

    invoke-direct {v1, p0, v0}, Lcom/kik/g/m;-><init>(Lcom/kik/g/l;Lcom/kik/g/l$a;)V

    invoke-virtual {p1, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 71
    iget-object v1, p0, Lcom/kik/g/l;->b:Ljava/util/Hashtable;

    iget-wide v2, p0, Lcom/kik/g/l;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget-wide v2, p0, Lcom/kik/g/l;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/kik/g/l;->a:J

    .line 73
    iget-wide v0, v0, Lcom/kik/g/l$a;->a:J

    return-wide v0
.end method

.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/kik/g/l;->c:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method
