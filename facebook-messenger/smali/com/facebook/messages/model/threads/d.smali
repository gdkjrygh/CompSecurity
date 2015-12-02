.class public final Lcom/facebook/messages/model/threads/d;
.super Ljava/lang/Object;
.source "MessageAttachmentInfo.java"


# static fields
.field public static final a:Lcom/facebook/messages/model/threads/d;


# instance fields
.field public final b:J

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v3, -0x1

    .line 16
    new-instance v0, Lcom/facebook/messages/model/threads/d;

    const-wide/16 v1, -0x1

    move v4, v3

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/messages/model/threads/d;-><init>(JIII)V

    sput-object v0, Lcom/facebook/messages/model/threads/d;->a:Lcom/facebook/messages/model/threads/d;

    return-void
.end method

.method private constructor <init>(JIII)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-wide p1, p0, Lcom/facebook/messages/model/threads/d;->b:J

    .line 30
    iput p3, p0, Lcom/facebook/messages/model/threads/d;->c:I

    .line 31
    iput p4, p0, Lcom/facebook/messages/model/threads/d;->d:I

    .line 32
    iput p5, p0, Lcom/facebook/messages/model/threads/d;->e:I

    .line 33
    return-void
.end method

.method public static a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/d;
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 36
    const-wide/16 v1, 0x0

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v4, v5

    move v3, v5

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 43
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v7

    sget-object v8, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    if-ne v7, v8, :cond_1

    .line 45
    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v7

    add-long/2addr v1, v7

    .line 46
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v7

    sget-object v8, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v7, v8, :cond_0

    .line 49
    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v7

    add-long/2addr v1, v7

    .line 50
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_3

    .line 56
    const/4 v5, 0x1

    .line 63
    :cond_3
    new-instance v0, Lcom/facebook/messages/model/threads/d;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/messages/model/threads/d;-><init>(JIII)V

    :goto_1
    return-object v0

    .line 58
    :catch_0
    move-exception v0

    .line 60
    sget-object v0, Lcom/facebook/messages/model/threads/d;->a:Lcom/facebook/messages/model/threads/d;

    goto :goto_1
.end method
