.class public Lcom/facebook/ui/media/attachments/f;
.super Ljava/lang/Object;
.source "MediaResource.java"


# instance fields
.field private a:J

.field private b:Lcom/facebook/ui/media/attachments/g;

.field private c:Landroid/net/Uri;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 55
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/f;->a:J

    return-wide v0
.end method

.method public a(I)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 113
    iput p1, p0, Lcom/facebook/ui/media/attachments/f;->g:I

    .line 114
    return-object p0
.end method

.method public a(J)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 59
    iput-wide p1, p0, Lcom/facebook/ui/media/attachments/f;->a:J

    .line 60
    return-object p0
.end method

.method public a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/f;->c:Landroid/net/Uri;

    .line 78
    return-object p0
.end method

.method public a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/f;->b:Lcom/facebook/ui/media/attachments/g;

    .line 69
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/f;->d:Ljava/lang/String;

    .line 87
    return-object p0
.end method

.method public b(I)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 122
    iput p1, p0, Lcom/facebook/ui/media/attachments/f;->h:I

    .line 123
    return-object p0
.end method

.method public b(J)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 104
    iput-wide p1, p0, Lcom/facebook/ui/media/attachments/f;->f:J

    .line 105
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/f;->e:Ljava/lang/String;

    .line 96
    return-object p0
.end method

.method public b()Lcom/facebook/ui/media/attachments/g;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/f;->b:Lcom/facebook/ui/media/attachments/g;

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/f;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 100
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/f;->f:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 109
    iget v0, p0, Lcom/facebook/ui/media/attachments/f;->g:I

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 118
    iget v0, p0, Lcom/facebook/ui/media/attachments/f;->h:I

    return v0
.end method

.method public i()Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 2

    .prologue
    .line 127
    new-instance v0, Lcom/facebook/ui/media/attachments/MediaResource;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/media/attachments/MediaResource;-><init>(Lcom/facebook/ui/media/attachments/f;Lcom/facebook/ui/media/attachments/e;)V

    return-object v0
.end method
