.class public Lcom/facebook/orca/k/d;
.super Ljava/lang/Object;
.source "GeocodingForMessageLocationResult.java"


# instance fields
.field a:Lcom/facebook/location/g;

.field b:Lcom/facebook/location/g;


# direct methods
.method public constructor <init>(Lcom/facebook/location/g;Lcom/facebook/location/g;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/k/d;->a:Lcom/facebook/location/g;

    .line 21
    iput-object p2, p0, Lcom/facebook/orca/k/d;->b:Lcom/facebook/location/g;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/g;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/k/d;->a:Lcom/facebook/location/g;

    return-object v0
.end method

.method public b()Lcom/facebook/location/g;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/k/d;->b:Lcom/facebook/location/g;

    return-object v0
.end method
