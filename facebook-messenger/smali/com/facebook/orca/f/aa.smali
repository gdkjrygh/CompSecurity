.class Lcom/facebook/orca/f/aa;
.super Ljava/lang/Object;
.source "ThreadDisplayCache.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:J

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(JLcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-wide p1, p0, Lcom/facebook/orca/f/aa;->a:J

    .line 45
    iput-object p3, p0, Lcom/facebook/orca/f/aa;->b:Lcom/google/common/a/es;

    .line 46
    iput-object p4, p0, Lcom/facebook/orca/f/aa;->c:Lcom/google/common/a/es;

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/aa;)J
    .locals 2

    .prologue
    .line 35
    iget-wide v0, p0, Lcom/facebook/orca/f/aa;->a:J

    return-wide v0
.end method

.method static synthetic b(Lcom/facebook/orca/f/aa;)Lcom/google/common/a/es;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/f/aa;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/f/aa;)Lcom/google/common/a/es;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/f/aa;->b:Lcom/google/common/a/es;

    return-object v0
.end method
