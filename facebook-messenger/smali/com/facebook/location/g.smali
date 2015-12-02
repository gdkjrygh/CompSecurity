.class public Lcom/facebook/location/g;
.super Ljava/lang/Object;
.source "GeolocationInfo.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:D

.field private final b:D

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const-wide/16 v1, 0x0

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-wide v1, p0, Lcom/facebook/location/g;->a:D

    .line 24
    iput-wide v1, p0, Lcom/facebook/location/g;->b:D

    .line 25
    iput-object v0, p0, Lcom/facebook/location/g;->c:Ljava/lang/String;

    .line 26
    iput-object v0, p0, Lcom/facebook/location/g;->d:Ljava/lang/String;

    .line 27
    iput-object v0, p0, Lcom/facebook/location/g;->e:Ljava/lang/String;

    .line 28
    iput-object v0, p0, Lcom/facebook/location/g;->f:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lcom/facebook/location/g;->g:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public constructor <init>(Lcom/facebook/location/Coordinates;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/g;->a:D

    .line 40
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/g;->b:D

    .line 41
    iput-object p2, p0, Lcom/facebook/location/g;->c:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/facebook/location/g;->d:Ljava/lang/String;

    .line 43
    iput-object p4, p0, Lcom/facebook/location/g;->e:Ljava/lang/String;

    .line 44
    iput-object p5, p0, Lcom/facebook/location/g;->f:Ljava/lang/String;

    .line 45
    iput-object p6, p0, Lcom/facebook/location/g;->g:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/facebook/location/g;->a:D

    return-wide v0
.end method

.method public b()D
    .locals 2

    .prologue
    .line 53
    iget-wide v0, p0, Lcom/facebook/location/g;->b:D

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/location/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/location/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/location/g;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/location/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/location/g;->g:Ljava/lang/String;

    return-object v0
.end method
