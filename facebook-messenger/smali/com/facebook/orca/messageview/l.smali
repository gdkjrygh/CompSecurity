.class public Lcom/facebook/orca/messageview/l;
.super Lcom/facebook/widget/d;
.source "MessageViewOtherAttachmentView.java"


# instance fields
.field private a:Lcom/facebook/common/n/a;

.field private b:Lcom/facebook/c/s;

.field private c:Lcom/facebook/orca/attachments/OtherAttachmentData;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0}, Lcom/facebook/orca/messageview/l;->a()V

    .line 40
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/l;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 54
    const-class v0, Lcom/facebook/common/n/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/n/a;

    iput-object v0, p0, Lcom/facebook/orca/messageview/l;->a:Lcom/facebook/common/n/a;

    .line 55
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/messageview/l;->b:Lcom/facebook/c/s;

    .line 57
    sget v0, Lcom/facebook/k;->orca_message_view_other_attachment:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/l;->setContentView(I)V

    .line 58
    sget v0, Lcom/facebook/i;->attachment_download:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/l;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/messageview/l;->d:Landroid/widget/Button;

    .line 59
    sget v0, Lcom/facebook/i;->attachment_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/l;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/l;->e:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/facebook/i;->attachment_size:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/l;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/l;->f:Landroid/widget/TextView;

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->d:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/messageview/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/messageview/m;-><init>(Lcom/facebook/orca/messageview/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/messageview/l;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/orca/messageview/l;->c()V

    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->e:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->f:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v1}, Lcom/facebook/orca/attachments/OtherAttachmentData;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/messageview/l;->a:Lcom/facebook/common/n/a;

    iget-object v2, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v2}, Lcom/facebook/orca/attachments/OtherAttachmentData;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/common/n/a;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;->c()Landroid/net/Uri;

    move-result-object v0

    .line 92
    iget-object v1, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v1}, Lcom/facebook/orca/attachments/OtherAttachmentData;->d()Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/l;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 96
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    iget-object v1, p0, Lcom/facebook/orca/messageview/l;->b:Lcom/facebook/c/s;

    invoke-virtual {v1, v3, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :cond_0
    :goto_0
    return-void

    .line 99
    :catch_0
    move-exception v1

    .line 107
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->b:Lcom/facebook/c/s;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 109
    :catch_1
    move-exception v0

    .line 110
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->attachment_download_error:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method


# virtual methods
.method public getAttachmentInfo()Lcom/facebook/orca/attachments/OtherAttachmentData;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    return-object v0
.end method

.method public setAttachmentInfo(Lcom/facebook/orca/attachments/OtherAttachmentData;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/orca/messageview/l;->c:Lcom/facebook/orca/attachments/OtherAttachmentData;

    .line 75
    invoke-direct {p0}, Lcom/facebook/orca/messageview/l;->b()V

    .line 76
    return-void
.end method
