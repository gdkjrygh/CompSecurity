.class public Lcom/facebook/cache/o;
.super Ljava/lang/Object;
.source "DefaultMemoryCacheManagerConfig.java"

# interfaces
.implements Lcom/facebook/cache/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 46
    const-wide/32 v0, 0xea60

    return-wide v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x2

    return v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 56
    const-wide/32 v0, 0xa00000

    return-wide v0
.end method

.method public d()D
    .locals 2

    .prologue
    .line 61
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    return-wide v0
.end method

.method public e()D
    .locals 2

    .prologue
    .line 66
    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    return-wide v0
.end method
