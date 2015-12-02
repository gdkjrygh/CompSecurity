.class Lcom/facebook/orca/sms/s;
.super Ljava/lang/Object;
.source "MmsContentResolverHandler.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/facebook/ui/media/attachments/MediaResource;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 0

    .prologue
    .line 509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 510
    iput-object p1, p0, Lcom/facebook/orca/sms/s;->a:Ljava/lang/String;

    .line 511
    iput-object p2, p0, Lcom/facebook/orca/sms/s;->b:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 512
    return-void
.end method

.method static a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/sms/s;
    .locals 2

    .prologue
    .line 519
    new-instance v0, Lcom/facebook/orca/sms/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/facebook/orca/sms/s;-><init>(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;)Lcom/facebook/orca/sms/s;
    .locals 2

    .prologue
    .line 515
    new-instance v0, Lcom/facebook/orca/sms/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/sms/s;-><init>(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)V

    return-object v0
.end method
