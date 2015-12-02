.class public Lcom/facebook/orca/threadview/d;
.super Lcom/facebook/widget/f;
.source "AdminMessageItemView.java"


# instance fields
.field private a:Lcom/facebook/orca/attachments/a;

.field private b:Lcom/facebook/messages/model/threads/Message;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/d;->a(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/d;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/d;->a:Lcom/facebook/orca/attachments/a;

    .line 47
    sget v0, Lcom/facebook/k;->orca_admin_message_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/d;->setContentView(I)V

    .line 49
    sget v0, Lcom/facebook/i;->admin_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    .line 50
    sget v0, Lcom/facebook/i;->admin_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/d;->d:Landroid/widget/TextView;

    .line 51
    sget v0, Lcom/facebook/i;->admin_images:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/d;->e:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    .line 52
    return-void
.end method


# virtual methods
.method public getMessage()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->b:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public setMessage(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/threadview/d;->b:Lcom/facebook/messages/model/threads/Message;

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->b:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    .line 61
    sparse-switch v0, :sswitch_data_0

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->a:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->e:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->e:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 111
    :goto_1
    return-void

    .line 63
    :sswitch_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_add_people:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 66
    :sswitch_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_leave_conversation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 70
    :sswitch_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_edit_name:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 75
    :sswitch_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_change_picture:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 79
    :sswitch_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_video_call:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 83
    :sswitch_5
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_missed_call:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 87
    :sswitch_6
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_incoming_call:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 91
    :sswitch_7
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_missed_call:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 95
    :sswitch_8
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_admin_outgoing_call:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/d;->e:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setVisibility(I)V

    goto :goto_1

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_5
        0x7 -> :sswitch_3
        0x64 -> :sswitch_6
        0x65 -> :sswitch_7
        0x66 -> :sswitch_8
    .end sparse-switch
.end method
