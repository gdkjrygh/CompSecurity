.class public Lcom/facebook/orca/protocol/methods/ac;
.super Ljava/lang/Object;
.source "PhotosUploadMethod.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/ui/media/attachments/MediaResource;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/facebook/ui/media/attachments/MediaResource;I)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/ac;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 36
    iput p2, p0, Lcom/facebook/orca/protocol/methods/ac;->b:I

    .line 37
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/ac;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ac;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/ac;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/facebook/orca/protocol/methods/ac;->b:I

    return v0
.end method
