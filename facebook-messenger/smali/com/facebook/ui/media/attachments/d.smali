.class public Lcom/facebook/ui/media/attachments/d;
.super Ljava/lang/Object;
.source "MediaAttachmentFactory.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    sput-object v0, Lcom/facebook/ui/media/attachments/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/d;->b:Landroid/content/Context;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;J)Lcom/facebook/ui/media/attachments/a;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 74
    invoke-static {p1, p2, p3}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Landroid/net/Uri;J)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;
    .locals 3

    .prologue
    .line 34
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    .line 36
    const-string v2, "content"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "file"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 37
    :cond_0
    new-instance v0, Lcom/facebook/ui/media/attachments/a;

    iget-object v1, p0, Lcom/facebook/ui/media/attachments/d;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/facebook/ui/media/attachments/a;-><init>(Landroid/content/Context;Lcom/facebook/ui/media/attachments/MediaResource;)V

    return-object v0

    .line 42
    :cond_1
    new-instance v1, Lcom/facebook/ui/media/attachments/h;

    invoke-direct {v1, v0}, Lcom/facebook/ui/media/attachments/h;-><init>(Landroid/net/Uri;)V

    throw v1
.end method

.method public b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 54
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_1

    .line 61
    :cond_0
    :goto_0
    return-object v0

    .line 59
    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/attachments/d;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;
    :try_end_0
    .catch Lcom/facebook/ui/media/attachments/h; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 60
    :catch_0
    move-exception v1

    goto :goto_0
.end method
