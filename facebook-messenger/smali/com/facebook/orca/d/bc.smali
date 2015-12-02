.class public Lcom/facebook/orca/d/bc;
.super Ljava/lang/Object;
.source "FetchAudioParams.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    invoke-virtual {p1}, Landroid/net/Uri;->isAbsolute()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/d/bc;->a:Landroid/net/Uri;

    .line 29
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/d/bc;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/d/c;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/orca/d/c;

    iget-object v1, p0, Lcom/facebook/orca/d/bc;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/facebook/orca/d/c;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method
