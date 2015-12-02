.class public Lcom/facebook/base/a/c;
.super Ljava/lang/Object;
.source "AppInitCompleteInitializer.java"

# interfaces
.implements Lcom/facebook/base/d;


# instance fields
.field private final a:Lcom/facebook/base/a/d;


# direct methods
.method public constructor <init>(Lcom/facebook/base/a/d;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    iput-object v0, p0, Lcom/facebook/base/a/c;->a:Lcom/facebook/base/a/d;

    .line 22
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/base/a/c;->a:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->a()V

    .line 27
    return-void
.end method
