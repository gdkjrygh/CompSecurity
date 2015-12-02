.class public Lcom/facebook/orca/threadview/dl;
.super Lcom/facebook/widget/d;
.source "ThreadViewOtherAttachmentView.java"


# instance fields
.field private a:Lcom/facebook/orca/attachments/OtherAttachmentData;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/dl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadview/dl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    sget v0, Lcom/facebook/k;->orca_thread_view_other_attachment:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dl;->setContentView(I)V

    .line 38
    sget v0, Lcom/facebook/i;->attachment_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dl;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/dl;->b:Landroid/widget/ImageView;

    .line 39
    sget v0, Lcom/facebook/i;->attachment_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dl;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/dl;->c:Landroid/widget/TextView;

    .line 40
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->c:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :goto_0
    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->b:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/dl;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/orca/threadview/dl;->getResourceIdForAttachmentIcon()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v1}, Lcom/facebook/orca/attachments/OtherAttachmentData;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private getResourceIdForAttachmentIcon()I
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    :cond_0
    sget v0, Lcom/facebook/h;->orca_attachment_file_generic:I

    .line 76
    :goto_0
    return v0

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 64
    const-string v1, "text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "rtf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 66
    :cond_2
    const-string v1, "rtf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    sget v0, Lcom/facebook/h;->orca_attachment_file_richtext:I

    goto :goto_0

    .line 69
    :cond_3
    sget v0, Lcom/facebook/h;->orca_attachment_file_text:I

    goto :goto_0

    .line 71
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 72
    sget v0, Lcom/facebook/h;->orca_attachment_file_movie:I

    goto :goto_0

    .line 73
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 74
    sget v0, Lcom/facebook/h;->orca_attachment_file_music:I

    goto :goto_0

    .line 76
    :cond_6
    sget v0, Lcom/facebook/h;->orca_attachment_file_generic:I

    goto :goto_0
.end method


# virtual methods
.method public setAttachmentInfo(Lcom/facebook/orca/attachments/OtherAttachmentData;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/orca/threadview/dl;->a:Lcom/facebook/orca/attachments/OtherAttachmentData;

    .line 44
    invoke-direct {p0}, Lcom/facebook/orca/threadview/dl;->a()V

    .line 45
    return-void
.end method
