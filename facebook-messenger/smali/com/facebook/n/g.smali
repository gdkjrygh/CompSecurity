.class public Lcom/facebook/n/g;
.super Ljava/lang/Object;
.source "SpringConfig.java"


# instance fields
.field public a:D

.field public b:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-wide p1, p0, Lcom/facebook/n/g;->b:D

    .line 34
    iput-wide p3, p0, Lcom/facebook/n/g;->a:D

    .line 35
    return-void
.end method

.method public static a(DD)Lcom/facebook/n/g;
    .locals 5

    .prologue
    .line 21
    new-instance v0, Lcom/facebook/n/g;

    invoke-static {p0, p1}, Lcom/facebook/n/a;->a(D)D

    move-result-wide v1

    invoke-static {p2, p3}, Lcom/facebook/n/a;->b(D)D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/n/g;-><init>(DD)V

    return-object v0
.end method
