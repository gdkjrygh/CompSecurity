.class public Lcom/facebook/orca/photos/b/w;
.super Ljava/lang/Object;
.source "PhotoUploadProgressEvent.java"

# interfaces
.implements Lcom/facebook/c/a/a;


# instance fields
.field public final a:Lcom/facebook/ui/media/attachments/MediaResource;

.field public final b:I

.field public final c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/ui/media/attachments/MediaResource;I)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/photos/b/w;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;IZ)V

    .line 19
    return-void
.end method

.method private constructor <init>(Lcom/facebook/ui/media/attachments/MediaResource;IZ)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/photos/b/w;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 27
    iput p2, p0, Lcom/facebook/orca/photos/b/w;->b:I

    .line 28
    iput-boolean p3, p0, Lcom/facebook/orca/photos/b/w;->c:Z

    .line 29
    return-void
.end method

.method public constructor <init>(Lcom/facebook/ui/media/attachments/MediaResource;Z)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/photos/b/w;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;IZ)V

    .line 23
    return-void
.end method
