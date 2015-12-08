.class final Lcom/roidapp/cloudlib/upload/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 82
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 85
    if-eqz v0, :cond_0

    .line 86
    iget-object v2, v0, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    .line 87
    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    .line 88
    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    const-class v3, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 89
    invoke-virtual {v2, v0}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->finish()V

    .line 101
    :cond_1
    :goto_0
    return-void

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->startActivity(Landroid/content/Intent;)V

    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/g;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->finish()V

    goto :goto_0
.end method
