.class public Lcom/facebook/orca/g/d;
.super Ljava/lang/Object;
.source "DbCache.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/g/d;->a:Ljava/lang/String;

    .line 49
    iput-wide p2, p0, Lcom/facebook/orca/g/d;->b:J

    .line 50
    iput-wide p4, p0, Lcom/facebook/orca/g/d;->c:J

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/g/d;)J
    .locals 2

    .prologue
    .line 41
    iget-wide v0, p0, Lcom/facebook/orca/g/d;->c:J

    return-wide v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 58
    iget-wide v0, p0, Lcom/facebook/orca/g/d;->b:J

    return-wide v0
.end method
