.class public Lcom/facebook/orca/photos/a/a;
.super Ljava/lang/Object;
.source "ContactUserTileViewParams.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/e;)Lcom/facebook/user/tiles/e;
    .locals 1

    .prologue
    .line 15
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getBigPictureUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {p1, p0}, Lcom/facebook/contacts/models/e;->b(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    .line 20
    :goto_0
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getSmallPictureUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 18
    invoke-virtual {p1, p0}, Lcom/facebook/contacts/models/e;->a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    goto :goto_0

    .line 20
    :cond_1
    invoke-static {p0}, Lcom/facebook/contacts/models/f;->a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    goto :goto_0
.end method
