.class public final Lcom/facebook/contacts/models/e;
.super Ljava/lang/Object;
.source "ContactPicCropInfoGenerator.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private a:Lcom/facebook/contacts/f/a;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/f/a;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/contacts/models/e;->a:Lcom/facebook/contacts/f/a;

    .line 21
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/contacts/f/b;)Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/contacts/models/e;->a:Lcom/facebook/contacts/f/a;

    invoke-virtual {v0, p2}, Lcom/facebook/contacts/f/a;->a(Lcom/facebook/contacts/f/b;)I

    move-result v0

    .line 33
    invoke-static {p1, v0}, Lcom/facebook/user/PicCropInfo;->a(Ljava/lang/String;I)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getSmallPictureUrl()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/f/b;->SMALL:Lcom/facebook/contacts/f/b;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/models/e;->a(Ljava/lang/String;Lcom/facebook/contacts/f/b;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;
    .locals 2

    .prologue
    .line 28
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getBigPictureUrl()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/f/b;->BIG:Lcom/facebook/contacts/f/b;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/models/e;->a(Ljava/lang/String;Lcom/facebook/contacts/f/b;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method
