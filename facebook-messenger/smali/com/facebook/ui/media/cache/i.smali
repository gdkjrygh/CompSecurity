.class Lcom/facebook/ui/media/cache/i;
.super Ljava/lang/Object;
.source "MediaCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KEY:",
        "Lcom/facebook/ui/media/cache/l;",
        "VA",
        "LUE:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/g;

.field private final b:Lcom/facebook/ui/media/cache/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKEY;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVA",
            "LUE;"
        }
    .end annotation
.end field

.field private final d:I

.field private volatile e:J

.field private f:J


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/cache/g;Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;TVA",
            "LUE;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/ui/media/cache/i;->a:Lcom/facebook/ui/media/cache/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p2, p0, Lcom/facebook/ui/media/cache/i;->b:Lcom/facebook/ui/media/cache/l;

    .line 125
    iput-object p3, p0, Lcom/facebook/ui/media/cache/i;->c:Ljava/lang/Object;

    .line 126
    iput p4, p0, Lcom/facebook/ui/media/cache/i;->d:I

    .line 127
    invoke-static {p1}, Lcom/facebook/ui/media/cache/g;->a(Lcom/facebook/ui/media/cache/g;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/i;->e:J

    .line 128
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/i;J)J
    .locals 0

    .prologue
    .line 116
    iput-wide p1, p0, Lcom/facebook/ui/media/cache/i;->f:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/i;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/ui/media/cache/i;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/ui/media/cache/i;)I
    .locals 1

    .prologue
    .line 116
    iget v0, p0, Lcom/facebook/ui/media/cache/i;->d:I

    return v0
.end method

.method static synthetic c(Lcom/facebook/ui/media/cache/i;)J
    .locals 2

    .prologue
    .line 116
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/i;->e:J

    return-wide v0
.end method

.method static synthetic d(Lcom/facebook/ui/media/cache/i;)Lcom/facebook/ui/media/cache/l;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/ui/media/cache/i;->b:Lcom/facebook/ui/media/cache/l;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ui/media/cache/i;)J
    .locals 2

    .prologue
    .line 116
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/i;->f:J

    return-wide v0
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/ui/media/cache/i;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->a(Lcom/facebook/ui/media/cache/g;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/i;->e:J

    .line 132
    return-void
.end method
