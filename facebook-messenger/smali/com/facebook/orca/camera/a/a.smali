.class public abstract Lcom/facebook/orca/camera/a/a;
.super Ljava/lang/Object;
.source "BaseImage.java"

# interfaces
.implements Lcom/facebook/orca/camera/a/c;


# static fields
.field private static final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Landroid/content/ContentResolver;

.field protected b:Landroid/net/Uri;

.field protected c:J

.field protected d:Ljava/lang/String;

.field protected e:J

.field protected final f:I

.field protected g:Ljava/lang/String;

.field protected h:Lcom/facebook/orca/camera/a/b;

.field private final j:J

.field private k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private m:I

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/orca/camera/a/a;

    sput-object v0, Lcom/facebook/orca/camera/a/a;->i:Ljava/lang/Class;

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/orca/camera/a/b;Landroid/content/ContentResolver;JILandroid/net/Uri;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput v0, p0, Lcom/facebook/orca/camera/a/a;->m:I

    .line 59
    iput v0, p0, Lcom/facebook/orca/camera/a/a;->n:I

    .line 64
    iput-object p1, p0, Lcom/facebook/orca/camera/a/a;->h:Lcom/facebook/orca/camera/a/b;

    .line 65
    iput-object p2, p0, Lcom/facebook/orca/camera/a/a;->a:Landroid/content/ContentResolver;

    .line 66
    iput-wide p3, p0, Lcom/facebook/orca/camera/a/a;->c:J

    .line 67
    iput p5, p0, Lcom/facebook/orca/camera/a/a;->f:I

    .line 68
    iput-object p6, p0, Lcom/facebook/orca/camera/a/a;->b:Landroid/net/Uri;

    .line 69
    iput-object p7, p0, Lcom/facebook/orca/camera/a/a;->d:Ljava/lang/String;

    .line 70
    iput-wide p8, p0, Lcom/facebook/orca/camera/a/a;->e:J

    .line 71
    iput-object p10, p0, Lcom/facebook/orca/camera/a/a;->g:Ljava/lang/String;

    .line 72
    iput-wide p11, p0, Lcom/facebook/orca/camera/a/a;->j:J

    .line 73
    iput-object p13, p0, Lcom/facebook/orca/camera/a/a;->k:Ljava/lang/String;

    .line 74
    iput-object p14, p0, Lcom/facebook/orca/camera/a/a;->l:Ljava/lang/String;

    .line 75
    return-void
.end method


# virtual methods
.method public a(II)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 93
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/orca/camera/a/a;->a(IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(IIZZ)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->h:Lcom/facebook/orca/camera/a/b;

    iget-wide v1, p0, Lcom/facebook/orca/camera/a/a;->c:J

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/camera/a/b;->a(J)Landroid/net/Uri;

    move-result-object v0

    .line 100
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 109
    :cond_0
    :goto_0
    return-object v0

    .line 102
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/camera/a/a;->a:Landroid/content/ContentResolver;

    invoke-static {p1, p2, v0, v1, p4}, Lcom/facebook/orca/camera/aa;->a(IILandroid/net/Uri;Landroid/content/ContentResolver;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/facebook/orca/camera/a/a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/camera/aa;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 134
    iget-wide v0, p0, Lcom/facebook/orca/camera/a/a;->j:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 138
    const/4 v0, 0x0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->k:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 83
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/facebook/orca/camera/a/e;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 84
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->b:Landroid/net/Uri;

    check-cast p1, Lcom/facebook/orca/camera/a/e;

    iget-object v1, p1, Lcom/facebook/orca/camera/a/e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/orca/camera/a/a;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
