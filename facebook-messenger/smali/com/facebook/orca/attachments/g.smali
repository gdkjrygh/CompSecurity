.class public Lcom/facebook/orca/attachments/g;
.super Ljava/lang/Object;
.source "ImageAttachmentDataBuilder.java"


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Landroid/net/Uri;

.field private c:I

.field private d:I

.field private e:Landroid/net/Uri;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/attachments/g;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public a(I)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lcom/facebook/orca/attachments/g;->c:I

    .line 53
    return-object p0
.end method

.method public a(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/facebook/orca/attachments/g;->a:Landroid/net/Uri;

    .line 35
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/orca/attachments/g;->f:Ljava/lang/String;

    .line 75
    return-object p0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/attachments/g;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public b(I)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lcom/facebook/orca/attachments/g;->d:I

    .line 62
    return-object p0
.end method

.method public b(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/orca/attachments/g;->b:Landroid/net/Uri;

    .line 44
    return-object p0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/orca/attachments/g;->c:I

    return v0
.end method

.method public c(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/attachments/g;->e:Landroid/net/Uri;

    .line 80
    return-object p0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/facebook/orca/attachments/g;->d:I

    return v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/attachments/g;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/attachments/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/facebook/orca/attachments/ImageAttachmentData;
    .locals 1

    .prologue
    .line 84
    new-instance v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-direct {v0, p0}, Lcom/facebook/orca/attachments/ImageAttachmentData;-><init>(Lcom/facebook/orca/attachments/g;)V

    return-object v0
.end method
