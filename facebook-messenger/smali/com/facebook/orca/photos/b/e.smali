.class public Lcom/facebook/orca/photos/b/e;
.super Ljava/lang/Object;
.source "MessengerPhotoResizeExperimentParameters.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lcom/facebook/orca/photos/b/e;->a:I

    .line 20
    iput p2, p0, Lcom/facebook/orca/photos/b/e;->b:I

    .line 21
    iput p3, p0, Lcom/facebook/orca/photos/b/e;->c:I

    .line 22
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/facebook/orca/photos/b/e;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/facebook/orca/photos/b/e;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/facebook/orca/photos/b/e;->c:I

    return v0
.end method
