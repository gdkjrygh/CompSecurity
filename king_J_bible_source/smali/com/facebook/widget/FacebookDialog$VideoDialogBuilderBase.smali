.class abstract Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
.super Lcom/facebook/widget/FacebookDialog$Builder;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "VideoDialogBuilderBase"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONCRETE:",
        "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase",
        "<*>;>",
        "Lcom/facebook/widget/FacebookDialog$Builder",
        "<TCONCRETE;>;"
    }
.end annotation


# instance fields
.field private place:Ljava/lang/String;

.field private videoAttachmentUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 1249
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1250
    return-void
.end method


# virtual methods
.method public addVideoFile(Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
    .locals 2
    .param p1, "video"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1274
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->addVideoAttachmentFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;

    .line 1276
    move-object v0, p0

    .line 1277
    .local v0, "result":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "TCONCRETE;"
    return-object v0
.end method

.method protected getMethodArguments()Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 1306
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1307
    .local v0, "methodArgs":Landroid/os/Bundle;
    const-string v1, "PLACE"

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->place:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1308
    const-string v1, "VIDEO"

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1309
    return-object v0
.end method

.method public setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
    .locals 1
    .param p1, "place"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1259
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->place:Ljava/lang/String;

    .line 1261
    move-object v0, p0

    .line 1262
    .local v0, "result":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "TCONCRETE;"
    return-object v0
.end method

.method public setVideoUrl(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
    .locals 1
    .param p1, "videoUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1289
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;

    .line 1291
    move-object v0, p0

    .line 1292
    .local v0, "result":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "TCONCRETE;"
    return-object v0
.end method

.method validate()V
    .locals 2

    .prologue
    .line 1297
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase<TCONCRETE;>;"
    invoke-super {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->validate()V

    .line 1299
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1300
    :cond_0
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Must specify at least one video."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1302
    :cond_1
    return-void
.end method
