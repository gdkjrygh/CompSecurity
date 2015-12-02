.class public Lcom/facebook/orca/images/ThreadIconPickerActivity;
.super Lcom/facebook/base/activity/i;
.source "ThreadIconPickerActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Landroid/support/v4/app/q;

.field private q:Lcom/facebook/analytics/av;

.field private r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

.field private s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private t:Z

.field private u:Ljava/lang/String;

.field private v:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/images/ThreadIconPickerActivity;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->a(Ljava/io/File;)V

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 4

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 184
    :goto_0
    return-void

    .line 163
    :cond_0
    const/4 v0, 0x0

    .line 164
    if-eqz p1, :cond_1

    .line 165
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 170
    :cond_1
    new-instance v1, Lcom/facebook/orca/server/an;

    invoke-direct {v1}, Lcom/facebook/orca/server/an;-><init>()V

    iget-object v2, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/an;->a(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/an;->b(Z)Lcom/facebook/orca/server/an;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/an;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/server/an;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/an;->h()Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    .line 176
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 177
    const-string v2, "modifyThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->q:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "set"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "thread_id"

    iget-object v3, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->u:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "thread_image"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method private j()V
    .locals 4

    .prologue
    const/16 v3, 0xc8

    const/4 v2, 0x1

    .line 130
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaParams;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Z)V

    .line 131
    invoke-virtual {v0, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Z)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(I)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->b(I)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->c(I)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->d(I)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/photos/picking/b;->CAMERA:Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/photos/picking/b;->GALLERY:Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/photos/picking/b;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 139
    iget-boolean v1, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->v:Z

    if-eqz v1, :cond_0

    .line 140
    sget-object v1, Lcom/facebook/orca/photos/picking/b;->REMOVE:Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 142
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/PickMediaParams;)V

    .line 143
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 55
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 57
    invoke-virtual {p0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Landroid/support/v4/app/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q;

    iput-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->p:Landroid/support/v4/app/q;

    .line 59
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->q:Lcom/facebook/analytics/av;

    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 62
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->u:Ljava/lang/String;

    .line 63
    const-string v1, "hasPictureHash"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->v:Z

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->p:Landroid/support/v4/app/q;

    const-string v1, "pickMediaOperation"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    iput-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    .line 67
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-direct {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    .line 69
    const-string v0, "pickMediaOperation"

    iget-object v1, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->r:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    new-instance v1, Lcom/facebook/orca/images/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/j;-><init>(Lcom/facebook/orca/images/ThreadIconPickerActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/i;)V

    .line 100
    const-string v0, "setPhotoOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/images/k;

    invoke-direct {v1, p0}, Lcom/facebook/orca/images/k;-><init>(Lcom/facebook/orca/images/ThreadIconPickerActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    sget v2, Lcom/facebook/o;->thread_icon_picker_progress:I

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 118
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/analytics/f/a;->THREAD_ICON_PICKER_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 154
    const-string v0, "showedDialog"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->t:Z

    .line 155
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 122
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 123
    iget-boolean v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->t:Z

    if-nez v0, :cond_0

    .line 124
    invoke-direct {p0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->j()V

    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->t:Z

    .line 127
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 147
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 148
    const-string v0, "showedDialog"

    iget-boolean v1, p0, Lcom/facebook/orca/images/ThreadIconPickerActivity;->t:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 149
    return-void
.end method
