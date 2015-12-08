.class public Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OpenGraphMessageDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase",
        "<",
        "Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "action"    # Lcom/facebook/model/OpenGraphAction;
    .param p3, "previewPropertyName"    # Ljava/lang/String;

    .prologue
    .line 1944
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;-><init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;)V

    .line 1945
    return-void
.end method


# virtual methods
.method protected getDialogFeatures()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<+",
            "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1949
    sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->OG_MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setDataErrorsFatal(Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setDataErrorsFatal(Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentFilesForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentsForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method
