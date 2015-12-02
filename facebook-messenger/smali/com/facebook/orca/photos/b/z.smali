.class Lcom/facebook/orca/photos/b/z;
.super Ljava/lang/Object;
.source "PhotoUploadServiceHandler.java"

# interfaces
.implements Lcom/facebook/http/protocol/h;


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/x;

.field private final b:Lcom/facebook/ui/media/attachments/MediaResource;

.field private c:I

.field private d:J


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/x;Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 2

    .prologue
    .line 210
    iput-object p1, p0, Lcom/facebook/orca/photos/b/z;->a:Lcom/facebook/orca/photos/b/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/photos/b/z;->c:I

    .line 208
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/photos/b/z;->d:J

    .line 211
    iput-object p2, p0, Lcom/facebook/orca/photos/b/z;->b:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 212
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/x;Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/orca/photos/b/y;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/photos/b/z;-><init>(Lcom/facebook/orca/photos/b/x;Lcom/facebook/ui/media/attachments/MediaResource;)V

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 6

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/orca/photos/b/z;->a:Lcom/facebook/orca/photos/b/x;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/x;->a(Lcom/facebook/orca/photos/b/x;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 217
    iget-wide v2, p0, Lcom/facebook/orca/photos/b/z;->d:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0xc8

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    cmp-long v2, p1, p3

    if-nez v2, :cond_1

    .line 218
    :cond_0
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    long-to-double v4, p1

    mul-double/2addr v2, v4

    long-to-double v4, p3

    div-double/2addr v2, v4

    double-to-int v2, v2

    .line 219
    iget v3, p0, Lcom/facebook/orca/photos/b/z;->c:I

    if-ne v2, v3, :cond_2

    .line 227
    :cond_1
    :goto_0
    return-void

    .line 222
    :cond_2
    iput v2, p0, Lcom/facebook/orca/photos/b/z;->c:I

    .line 223
    iput-wide v0, p0, Lcom/facebook/orca/photos/b/z;->d:J

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/photos/b/z;->a:Lcom/facebook/orca/photos/b/x;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/x;->b(Lcom/facebook/orca/photos/b/x;)Lcom/facebook/orca/photos/b/h;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/w;

    iget-object v3, p0, Lcom/facebook/orca/photos/b/z;->b:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-direct {v1, v3, v2}, Lcom/facebook/orca/photos/b/w;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;I)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/b/h;->a(Lcom/facebook/c/a/a;)V

    goto :goto_0
.end method
