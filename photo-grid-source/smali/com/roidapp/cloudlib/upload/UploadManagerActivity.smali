.class public Lcom/roidapp/cloudlib/upload/UploadManagerActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/ListView;

.field b:Ljava/util/concurrent/ExecutorService;

.field c:Landroid/os/Handler;

.field d:Lcom/roidapp/cloudlib/upload/c;

.field e:Lcom/roidapp/cloudlib/upload/o;

.field f:Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

.field private g:Landroid/view/View;

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->h:I

    .line 297
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->h:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;I)I
    .locals 0

    .prologue
    .line 44
    iput p1, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->h:I

    return p1
.end method

.method private a()V
    .locals 4

    .prologue
    .line 279
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->a()Ljava/util/List;

    move-result-object v1

    .line 280
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/o;->clear()V

    .line 282
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 283
    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    invoke-virtual {v3, v0}, Lcom/roidapp/cloudlib/upload/o;->add(Ljava/lang/Object;)V

    goto :goto_0

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/o;->notifyDataSetChanged()V

    .line 285
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->g:Landroid/view/View;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->f()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 286
    return-void

    .line 285
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Landroid/widget/ImageView;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 44
    .line 1275
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/cloudlib/upload/m;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/roidapp/cloudlib/upload/m;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Ljava/lang/String;Landroid/widget/ImageView;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 44
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 62
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    sget v0, Lcom/roidapp/cloudlib/as;->g:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->setContentView(I)V

    .line 65
    invoke-static {p0}, Lcom/roidapp/cloudlib/upload/c;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/upload/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->a()Ljava/util/List;

    move-result-object v2

    .line 67
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 68
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 71
    sget v0, Lcom/roidapp/cloudlib/ar;->bx:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a:Landroid/widget/ListView;

    .line 72
    new-instance v0, Lcom/roidapp/cloudlib/upload/o;

    invoke-direct {v0, p0, p0, v2}, Lcom/roidapp/cloudlib/upload/o;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Landroid/app/Activity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->e:Lcom/roidapp/cloudlib/upload/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/o;->notifyDataSetChanged()V

    .line 76
    sget v0, Lcom/roidapp/cloudlib/ar;->bB:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/roidapp/cloudlib/upload/g;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/upload/g;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    sget v0, Lcom/roidapp/cloudlib/ar;->bg:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->g:Landroid/view/View;

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->g:Landroid/view/View;

    new-instance v3, Lcom/roidapp/cloudlib/upload/h;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/upload/h;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->g:Landroid/view/View;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->f()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 123
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->c:Landroid/os/Handler;

    .line 124
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->b:Ljava/util/concurrent/ExecutorService;

    .line 126
    return-void

    .line 121
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 145
    packed-switch p1, :pswitch_data_0

    .line 186
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 147
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 148
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/upload/i;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/upload/i;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 156
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/upload/j;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/upload/j;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 163
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->u:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 165
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 167
    :pswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/upload/l;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/upload/l;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/upload/k;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/upload/k;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->au:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 145
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 200
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 203
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 228
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->g()V

    .line 231
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 192
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->f:Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->f:Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 195
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 209
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 210
    new-instance v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;-><init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->f:Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

    .line 211
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->f:Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 212
    invoke-direct {p0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a()V

    .line 213
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 216
    const-string v0, "UploadManager"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;)V

    .line 218
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 219
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 223
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 224
    return-void
.end method
