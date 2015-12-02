.class Lcom/facebook/fbservice/service/m;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"


# instance fields
.field private final a:Lcom/facebook/fbservice/service/ac;

.field private final b:J

.field private c:J

.field private d:J

.field private e:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/fbservice/service/OperationResult;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/fbservice/service/z;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/fbservice/service/g;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/ac;J)V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/m;->g:Ljava/util/List;

    .line 76
    iput-object p1, p0, Lcom/facebook/fbservice/service/m;->a:Lcom/facebook/fbservice/service/ac;

    .line 77
    iput-wide p2, p0, Lcom/facebook/fbservice/service/m;->b:J

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;J)J
    .locals 0

    .prologue
    .line 65
    iput-wide p1, p0, Lcom/facebook/fbservice/service/m;->c:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/fbservice/service/m;->f:Lcom/facebook/fbservice/service/OperationResult;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/g;)Lcom/facebook/fbservice/service/g;
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/fbservice/service/m;->h:Lcom/facebook/fbservice/service/g;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/fbservice/service/m;->e:Lcom/google/common/d/a/s;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/fbservice/service/m;->e:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/fbservice/service/m;->g:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/fbservice/service/m;J)J
    .locals 0

    .prologue
    .line 65
    iput-wide p1, p0, Lcom/facebook/fbservice/service/m;->d:J

    return-wide p1
.end method

.method static synthetic b(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/g;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/fbservice/service/m;->h:Lcom/facebook/fbservice/service/g;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/fbservice/service/m;)J
    .locals 2

    .prologue
    .line 65
    iget-wide v0, p0, Lcom/facebook/fbservice/service/m;->d:J

    return-wide v0
.end method

.method static synthetic d(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/ac;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/fbservice/service/m;->a:Lcom/facebook/fbservice/service/ac;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/fbservice/service/m;)Ljava/util/List;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/fbservice/service/m;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/fbservice/service/m;->f:Lcom/facebook/fbservice/service/OperationResult;

    return-object v0
.end method
