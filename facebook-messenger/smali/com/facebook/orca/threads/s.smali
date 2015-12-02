.class public Lcom/facebook/orca/threads/s;
.super Ljava/lang/Object;
.source "ThreadSourceUtil.java"


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    .line 19
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 41
    const-string v0, "mobile"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "messenger"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sms"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mms"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    :cond_0
    sget v0, Lcom/facebook/h;->orca_receipt_phone_icon:I

    .line 51
    :goto_0
    return v0

    .line 46
    :cond_1
    const-string v0, "chat"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "web"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 47
    :cond_2
    sget v0, Lcom/facebook/h;->orca_receipt_bubble_icon:I

    goto :goto_0

    .line 48
    :cond_3
    const-string v0, "email"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 49
    sget v0, Lcom/facebook/h;->orca_receipt_email_icon:I

    goto :goto_0

    .line 51
    :cond_4
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threads/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 59
    const-string v0, "mobile"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_mobile:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 72
    :goto_0
    return-object v0

    .line 61
    :cond_0
    const-string v0, "messenger"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_messenger:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 63
    :cond_1
    const-string v0, "chat"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_web:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 65
    :cond_2
    const-string v0, "email"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_email:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 67
    :cond_3
    const-string v0, "sms"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_sms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 69
    :cond_4
    const-string v0, "mms"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_mms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 72
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/threads/s;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->source_from_web:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
